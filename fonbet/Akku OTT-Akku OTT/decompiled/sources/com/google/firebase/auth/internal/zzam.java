package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import defpackage.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzam extends MultiFactorSession {
    public static final Parcelable.Creator<zzam> CREATOR = new zzap();

    @Nullable
    private String zza;

    @Nullable
    private String zzb;

    @Nullable
    private List<PhoneMultiFactorInfo> zzc;

    @Nullable
    private List<TotpMultiFactorInfo> zzd;

    @Nullable
    private zzaf zze;

    private zzam() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, this.zza, false);
        c.l(parcel, 2, this.zzb, false);
        c.p(parcel, 3, this.zzc, false);
        c.p(parcel, 4, this.zzd, false);
        c.k(parcel, 5, this.zze, i, false);
        c.r(parcel, q);
    }

    public final zzaf zza() {
        return this.zze;
    }

    @Nullable
    public final String zzb() {
        return this.zza;
    }

    @Nullable
    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zza != null;
    }

    public zzam(String str, String str2, List<PhoneMultiFactorInfo> list, List<TotpMultiFactorInfo> list2, zzaf zzafVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list;
        this.zzd = list2;
        this.zze = zzafVar;
    }

    public static zzam zza(@Nullable String str, @Nullable zzaf zzafVar) {
        C0875q.d(str);
        zzam zzamVar = new zzam();
        zzamVar.zza = str;
        zzamVar.zze = zzafVar;
        return zzamVar;
    }

    public static zzam zza(List<MultiFactorInfo> list, String str) {
        C0875q.g(list);
        C0875q.d(str);
        zzam zzamVar = new zzam();
        zzamVar.zzc = new ArrayList();
        zzamVar.zzd = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : list) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzamVar.zzc.add((PhoneMultiFactorInfo) multiFactorInfo);
            } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                zzamVar.zzd.add((TotpMultiFactorInfo) multiFactorInfo);
            } else {
                throw new IllegalArgumentException(g.a("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ", multiFactorInfo.getFactorId()));
            }
        }
        zzamVar.zzb = str;
        return zzamVar;
    }
}
