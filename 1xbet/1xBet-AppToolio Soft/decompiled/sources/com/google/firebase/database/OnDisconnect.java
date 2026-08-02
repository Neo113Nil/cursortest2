package com.google.firebase.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzfb;
import com.google.android.gms.internal.firebase_database.zzir;
import com.google.android.gms.internal.firebase_database.zzja;
import com.google.android.gms.internal.firebase_database.zzjd;
import com.google.android.gms.internal.firebase_database.zzjg;
import com.google.android.gms.internal.firebase_database.zzkn;
import com.google.android.gms.internal.firebase_database.zzkq;
import com.google.android.gms.internal.firebase_database.zzks;
import com.google.android.gms.internal.firebase_database.zzkt;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import java.util.Map;

/* loaded from: classes.dex */
public class OnDisconnect {
    private zzck zzai;
    private zzch zzap;

    OnDisconnect(zzck zzckVar, zzch zzchVar) {
        this.zzai = zzckVar;
        this.zzap = zzchVar;
    }

    private final Task<Void> zza(DatabaseReference.CompletionListener completionListener) {
        zzkn<Task<Void>, DatabaseReference.CompletionListener> zzb = zzkq.zzb(completionListener);
        this.zzai.zzc(new zzo(this, zzb));
        return zzb.getFirst();
    }

    private final Task<Void> zza(Map<String, Object> map, DatabaseReference.CompletionListener completionListener) {
        Map<zzch, zzja> zzb = zzks.zzb(this.zzap, map);
        zzkn<Task<Void>, DatabaseReference.CompletionListener> zzb2 = zzkq.zzb(completionListener);
        this.zzai.zzc(new zzn(this, zzb, zzb2, map));
        return zzb2.getFirst();
    }

    private final Task<Void> zzb(Object obj, zzja zzjaVar, DatabaseReference.CompletionListener completionListener) {
        zzks.zzan(this.zzap);
        zzfb.zza(this.zzap, obj);
        Object zzh = zzkt.zzh(obj);
        zzks.zzg(zzh);
        zzja zza = zzjd.zza(zzh, zzjaVar);
        zzkn<Task<Void>, DatabaseReference.CompletionListener> zzb = zzkq.zzb(completionListener);
        this.zzai.zzc(new zzm(this, zza, zzb));
        return zzb.getFirst();
    }

    @NonNull
    public Task<Void> cancel() {
        return zza((DatabaseReference.CompletionListener) null);
    }

    public void cancel(@NonNull DatabaseReference.CompletionListener completionListener) {
        zza(completionListener);
    }

    @NonNull
    public Task<Void> removeValue() {
        return setValue(null);
    }

    public void removeValue(@Nullable DatabaseReference.CompletionListener completionListener) {
        setValue((Object) null, completionListener);
    }

    @NonNull
    public Task<Void> setValue(@Nullable Object obj) {
        return zzb(obj, zzir.zzfv(), null);
    }

    @NonNull
    public Task<Void> setValue(@Nullable Object obj, double d) {
        return zzb(obj, zzjg.zzc(this.zzap, Double.valueOf(d)), null);
    }

    @NonNull
    public Task<Void> setValue(@Nullable Object obj, @Nullable String str) {
        return zzb(obj, zzjg.zzc(this.zzap, str), null);
    }

    public void setValue(@Nullable Object obj, double d, @Nullable DatabaseReference.CompletionListener completionListener) {
        zzb(obj, zzjg.zzc(this.zzap, Double.valueOf(d)), completionListener);
    }

    public void setValue(@Nullable Object obj, @Nullable DatabaseReference.CompletionListener completionListener) {
        zzb(obj, zzir.zzfv(), completionListener);
    }

    public void setValue(@Nullable Object obj, @Nullable String str, @Nullable DatabaseReference.CompletionListener completionListener) {
        zzb(obj, zzjg.zzc(this.zzap, str), completionListener);
    }

    public void setValue(@Nullable Object obj, @Nullable Map map, @Nullable DatabaseReference.CompletionListener completionListener) {
        zzb(obj, zzjg.zzc(this.zzap, map), completionListener);
    }

    @NonNull
    public Task<Void> updateChildren(@NonNull Map<String, Object> map) {
        return zza(map, null);
    }

    public void updateChildren(@NonNull Map<String, Object> map, @Nullable DatabaseReference.CompletionListener completionListener) {
        zza(map, completionListener);
    }
}
