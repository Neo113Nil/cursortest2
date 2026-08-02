package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzblb {
    private static final java.lang.Object[][] zza = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, 0, 2);
    private java.util.List zzb;
    private final com.google.android.libraries.places.internal.zzbio zzc = com.google.android.libraries.places.internal.zzbio.zza;
    private java.lang.Object[][] zzd = zza;

    zzblb() {
    }

    public final com.google.android.libraries.places.internal.zzblb zza(com.google.android.libraries.places.internal.zzblc zzblcVar, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(zzblcVar, "key");
        com.google.common.base.Preconditions.checkNotNull(obj, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        int i = 0;
        while (true) {
            java.lang.Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (zzblcVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        if (i == -1) {
            java.lang.Object[][] objArr2 = this.zzd;
            int length = objArr2.length;
            java.lang.Object[][] objArr3 = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, length + 1, 2);
            java.lang.System.arraycopy(objArr2, 0, objArr3, 0, length);
            this.zzd = objArr3;
            i = objArr3.length - 1;
        }
        this.zzd[i] = new java.lang.Object[]{zzblcVar, obj};
        return this;
    }

    public final com.google.android.libraries.places.internal.zzblb zzb(java.util.List list) {
        com.google.common.base.Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
        this.zzb = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbld zzc() {
        return new com.google.android.libraries.places.internal.zzbld(this.zzb, this.zzc, this.zzd, null);
    }
}
