package com.google.firebase.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzdx;
import com.google.android.gms.internal.firebase_database.zzfb;
import com.google.android.gms.internal.firebase_database.zzid;
import com.google.android.gms.internal.firebase_database.zzir;
import com.google.android.gms.internal.firebase_database.zzit;
import com.google.android.gms.internal.firebase_database.zzja;
import com.google.android.gms.internal.firebase_database.zzjd;
import com.google.android.gms.internal.firebase_database.zzjg;
import com.google.android.gms.internal.firebase_database.zzks;
import com.google.android.gms.internal.firebase_database.zzkt;

/* loaded from: classes.dex */
public class MutableData {
    private final zzdx zzal;
    private final zzch zzam;

    private MutableData(zzdx zzdxVar, zzch zzchVar) {
        this.zzal = zzdxVar;
        this.zzam = zzchVar;
        zzfb.zza(this.zzam, getValue());
    }

    /* synthetic */ MutableData(zzdx zzdxVar, zzch zzchVar, zzi zziVar) {
        this(zzdxVar, zzchVar);
    }

    MutableData(zzja zzjaVar) {
        this(new zzdx(zzjaVar), new zzch(""));
    }

    @NonNull
    public MutableData child(@NonNull String str) {
        zzks.zzab(str);
        return new MutableData(this.zzal, this.zzam.zzh(new zzch(str)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutableData)) {
            return false;
        }
        MutableData mutableData = (MutableData) obj;
        return this.zzal.equals(mutableData.zzal) && this.zzam.equals(mutableData.zzam);
    }

    @NonNull
    public Iterable<MutableData> getChildren() {
        zzja zzd = zzd();
        return (zzd.isEmpty() || zzd.zzfk()) ? new zzi(this) : new zzk(this, zzit.zzj(zzd).iterator());
    }

    public long getChildrenCount() {
        return zzd().getChildCount();
    }

    @Nullable
    public String getKey() {
        if (this.zzam.zzbz() != null) {
            return this.zzam.zzbz().zzfg();
        }
        return null;
    }

    @Nullable
    public Object getPriority() {
        return zzd().zzfl().getValue();
    }

    @Nullable
    public Object getValue() {
        return zzd().getValue();
    }

    @Nullable
    public <T> T getValue(@NonNull GenericTypeIndicator<T> genericTypeIndicator) {
        return (T) zzkt.zza(zzd().getValue(), genericTypeIndicator);
    }

    @Nullable
    public <T> T getValue(@NonNull Class<T> cls) {
        return (T) zzkt.zza(zzd().getValue(), (Class) cls);
    }

    public boolean hasChild(String str) {
        return !zzd().zzam(new zzch(str)).isEmpty();
    }

    public boolean hasChildren() {
        zzja zzd = zzd();
        return (zzd.zzfk() || zzd.isEmpty()) ? false : true;
    }

    public void setPriority(@Nullable Object obj) {
        this.zzal.zzg(this.zzam, zzd().zzf(zzjg.zzc(this.zzam, obj)));
    }

    public void setValue(@Nullable Object obj) throws DatabaseException {
        zzfb.zza(this.zzam, obj);
        Object zzh = zzkt.zzh(obj);
        zzks.zzg(zzh);
        this.zzal.zzg(this.zzam, zzjd.zza(zzh, zzir.zzfv()));
    }

    public String toString() {
        zzid zzbw = this.zzam.zzbw();
        String zzfg = zzbw != null ? zzbw.zzfg() : "<none>";
        String valueOf = String.valueOf(this.zzal.zzcg().getValue(true));
        StringBuilder sb = new StringBuilder(String.valueOf(zzfg).length() + 32 + String.valueOf(valueOf).length());
        sb.append("MutableData { key = ");
        sb.append(zzfg);
        sb.append(", value = ");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }

    final zzja zzd() {
        return this.zzal.zzp(this.zzam);
    }
}
