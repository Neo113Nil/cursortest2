package com.google.firebase.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.firebase_database.zzbv;
import com.google.android.gms.internal.firebase_database.zzcc;
import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzdo;
import com.google.android.gms.internal.firebase_database.zzfb;
import com.google.android.gms.internal.firebase_database.zzid;
import com.google.android.gms.internal.firebase_database.zzja;
import com.google.android.gms.internal.firebase_database.zzjd;
import com.google.android.gms.internal.firebase_database.zzjg;
import com.google.android.gms.internal.firebase_database.zzkn;
import com.google.android.gms.internal.firebase_database.zzkp;
import com.google.android.gms.internal.firebase_database.zzkq;
import com.google.android.gms.internal.firebase_database.zzks;
import com.google.android.gms.internal.firebase_database.zzkt;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.Transaction;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes.dex */
public class DatabaseReference extends Query {
    private static zzcc zzv;

    public interface CompletionListener {
        void onComplete(@Nullable DatabaseError databaseError, @NonNull DatabaseReference databaseReference);
    }

    DatabaseReference(zzck zzckVar, zzch zzchVar) {
        super(zzckVar, zzchVar);
    }

    public static void goOffline() {
        zzdo.zzd(zzb());
    }

    public static void goOnline() {
        zzdo.zze(zzb());
    }

    private final Task<Void> zza(zzja zzjaVar, CompletionListener completionListener) {
        zzks.zzan(this.zzap);
        zzkn<Task<Void>, CompletionListener> zzb = zzkq.zzb(completionListener);
        this.zzai.zzc(new zzd(this, zzjaVar, zzb));
        return zzb.getFirst();
    }

    private final Task<Void> zza(Object obj, zzja zzjaVar, CompletionListener completionListener) {
        zzks.zzan(this.zzap);
        zzfb.zza(this.zzap, obj);
        Object zzh = zzkt.zzh(obj);
        zzks.zzg(zzh);
        zzja zza = zzjd.zza(zzh, zzjaVar);
        zzkn<Task<Void>, CompletionListener> zzb = zzkq.zzb(completionListener);
        this.zzai.zzc(new zzc(this, zza, zzb));
        return zzb.getFirst();
    }

    private final Task<Void> zza(Map<String, Object> map, CompletionListener completionListener) {
        if (map == null) {
            throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
        }
        Map<String, Object> zzi = zzkt.zzi(map);
        zzbv zzg = zzbv.zzg(zzks.zzb(this.zzap, zzi));
        zzkn<Task<Void>, CompletionListener> zzb = zzkq.zzb(completionListener);
        this.zzai.zzc(new zze(this, zzg, zzb, zzi));
        return zzb.getFirst();
    }

    private static synchronized zzcc zzb() {
        zzcc zzccVar;
        synchronized (DatabaseReference.class) {
            if (zzv == null) {
                zzv = new zzcc();
            }
            zzccVar = zzv;
        }
        return zzccVar;
    }

    @NonNull
    public DatabaseReference child(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (this.zzap.isEmpty()) {
            zzks.zzac(str);
        } else {
            zzks.zzab(str);
        }
        return new DatabaseReference(this.zzai, this.zzap.zzh(new zzch(str)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof DatabaseReference) && toString().equals(obj.toString());
    }

    @NonNull
    public FirebaseDatabase getDatabase() {
        return this.zzai.getDatabase();
    }

    @Nullable
    public String getKey() {
        if (this.zzap.isEmpty()) {
            return null;
        }
        return this.zzap.zzbz().zzfg();
    }

    @Nullable
    public DatabaseReference getParent() {
        zzch zzby = this.zzap.zzby();
        if (zzby != null) {
            return new DatabaseReference(this.zzai, zzby);
        }
        return null;
    }

    @NonNull
    public DatabaseReference getRoot() {
        return new DatabaseReference(this.zzai, new zzch(""));
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NonNull
    public OnDisconnect onDisconnect() {
        zzks.zzan(this.zzap);
        return new OnDisconnect(this.zzai, this.zzap);
    }

    @NonNull
    public DatabaseReference push() {
        return new DatabaseReference(this.zzai, this.zzap.zza(zzid.zzt(zzkp.zzo(this.zzai.zzcc()))));
    }

    @NonNull
    public Task<Void> removeValue() {
        return setValue(null);
    }

    public void removeValue(@Nullable CompletionListener completionListener) {
        setValue((Object) null, completionListener);
    }

    public void runTransaction(@NonNull Transaction.Handler handler) {
        runTransaction(handler, true);
    }

    public void runTransaction(@NonNull Transaction.Handler handler, boolean z) {
        if (handler == null) {
            throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
        }
        zzks.zzan(this.zzap);
        this.zzai.zzc(new zzf(this, handler, z));
    }

    @NonNull
    public Task<Void> setPriority(@Nullable Object obj) {
        return zza(zzjg.zzc(this.zzap, obj), (CompletionListener) null);
    }

    public void setPriority(@Nullable Object obj, @Nullable CompletionListener completionListener) {
        zza(zzjg.zzc(this.zzap, obj), completionListener);
    }

    @NonNull
    public Task<Void> setValue(@Nullable Object obj) {
        return zza(obj, zzjg.zzc(this.zzap, null), null);
    }

    @NonNull
    public Task<Void> setValue(@Nullable Object obj, @Nullable Object obj2) {
        return zza(obj, zzjg.zzc(this.zzap, obj2), null);
    }

    public void setValue(@Nullable Object obj, @Nullable CompletionListener completionListener) {
        zza(obj, zzjg.zzc(this.zzap, null), completionListener);
    }

    public void setValue(@Nullable Object obj, @Nullable Object obj2, @Nullable CompletionListener completionListener) {
        zza(obj, zzjg.zzc(this.zzap, obj2), completionListener);
    }

    public String toString() {
        DatabaseReference parent = getParent();
        if (parent == null) {
            return this.zzai.toString();
        }
        try {
            String databaseReference = parent.toString();
            String replace = URLEncoder.encode(getKey(), "UTF-8").replace("+", "%20");
            StringBuilder sb = new StringBuilder(String.valueOf(databaseReference).length() + 1 + String.valueOf(replace).length());
            sb.append(databaseReference);
            sb.append("/");
            sb.append(replace);
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(getKey());
            throw new DatabaseException(valueOf.length() != 0 ? "Failed to URLEncode key: ".concat(valueOf) : new String("Failed to URLEncode key: "), e);
        }
    }

    @NonNull
    public Task<Void> updateChildren(@NonNull Map<String, Object> map) {
        return zza(map, (CompletionListener) null);
    }

    public void updateChildren(@NonNull Map<String, Object> map, @Nullable CompletionListener completionListener) {
        zza(map, completionListener);
    }
}
