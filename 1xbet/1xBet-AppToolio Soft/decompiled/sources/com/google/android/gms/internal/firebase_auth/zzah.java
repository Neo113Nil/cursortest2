package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzg;
import java.util.List;

@SafeParcelable.Class(creator = "GetAccountInfoResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable implements com.google.firebase.auth.api.internal.zzcg<zzah, zzg.zzc> {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    @SafeParcelable.Field(getter = "getUserList", id = 2)
    private zzal zzjp;

    public zzah() {
    }

    @SafeParcelable.Constructor
    zzah(@SafeParcelable.Param(id = 2) zzal zzalVar) {
        this.zzjp = zzalVar == null ? new zzal() : zzal.zza(zzalVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzjp, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final /* synthetic */ zzah zza(zzg.zzc zzcVar) {
        zzg.zzc zzcVar2 = zzcVar;
        this.zzjp = zzcVar2.zzan == null ? null : zzal.zza(zzcVar2);
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final Class<zzg.zzc> zzag() {
        return zzg.zzc.class;
    }

    public final List<zzaj> zzas() {
        return this.zzjp.zzas();
    }
}
