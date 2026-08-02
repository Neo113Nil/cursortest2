package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbld {
    private final java.util.List zza;
    private final com.google.android.libraries.places.internal.zzbio zzb;
    private final java.lang.Object[][] zzc;

    /* synthetic */ zzbld(java.util.List list, com.google.android.libraries.places.internal.zzbio zzbioVar, java.lang.Object[][] objArr, byte[] bArr) {
        this.zza = (java.util.List) com.google.common.base.Preconditions.checkNotNull(list, "addresses are not set");
        this.zzb = (com.google.android.libraries.places.internal.zzbio) com.google.common.base.Preconditions.checkNotNull(zzbioVar, "attrs");
        this.zzc = (java.lang.Object[][]) com.google.common.base.Preconditions.checkNotNull(objArr, "customOptions");
    }

    public static com.google.android.libraries.places.internal.zzblb zzd() {
        return new com.google.android.libraries.places.internal.zzblb();
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("addrs", this.zza).add("attrs", this.zzb).add("customOptions", java.util.Arrays.deepToString(this.zzc)).toString();
    }

    public final java.lang.Object zzc(com.google.android.libraries.places.internal.zzblc zzblcVar) {
        com.google.common.base.Preconditions.checkNotNull(zzblcVar, "key");
        int i = 0;
        while (true) {
            java.lang.Object[][] objArr = this.zzc;
            if (i >= objArr.length) {
                return zzblcVar.zzc();
            }
            if (zzblcVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final com.google.android.libraries.places.internal.zzbio zzb() {
        return this.zzb;
    }

    public final java.util.List zza() {
        return this.zza;
    }
}
