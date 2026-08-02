package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbis {
    public static final com.google.android.libraries.places.internal.zzbis zza;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbjv zzb;

    @javax.annotation.Nullable
    private final java.util.concurrent.Executor zzc;
    private final java.lang.Object[][] zzd;
    private final java.util.List zze;

    @javax.annotation.Nullable
    private final java.lang.Boolean zzf;

    @javax.annotation.Nullable
    private final java.lang.Integer zzg;

    @javax.annotation.Nullable
    private final java.lang.Integer zzh;

    static {
        com.google.android.libraries.places.internal.zzbiq zzbiqVar = new com.google.android.libraries.places.internal.zzbiq();
        zzbiqVar.zzc = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, 0, 2);
        zzbiqVar.zzd = java.util.Collections.emptyList();
        zza = new com.google.android.libraries.places.internal.zzbis(zzbiqVar, null);
    }

    public final java.lang.String toString() {
        com.google.common.base.MoreObjects.ToStringHelper add = com.google.common.base.MoreObjects.toStringHelper(this).add("deadline", this.zzb).add("authority", (java.lang.Object) null).add("callCredentials", (java.lang.Object) null);
        java.util.concurrent.Executor executor = this.zzc;
        return add.add("executor", executor != null ? executor.getClass() : null).add("compressorName", (java.lang.Object) null).add("customOptions", java.util.Arrays.deepToString(this.zzd)).add("waitForReady", zzk()).add("maxInboundMessageSize", this.zzg).add("maxOutboundMessageSize", this.zzh).add("onReadyThreshold", (java.lang.Object) null).add("streamTracerFactories", this.zze).toString();
    }

    public final com.google.android.libraries.places.internal.zzbis zza(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        zzp.zza = zzbjvVar;
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    public final com.google.android.libraries.places.internal.zzbis zzc() {
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        zzp.zze = java.lang.Boolean.TRUE;
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    public final com.google.android.libraries.places.internal.zzbis zzd() {
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        zzp.zze = java.lang.Boolean.FALSE;
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    public final com.google.android.libraries.places.internal.zzbis zze(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        zzp.zzb = executor;
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    public final com.google.android.libraries.places.internal.zzbis zzf(com.google.android.libraries.places.internal.zzbjb zzbjbVar) {
        java.util.List list = this.zze;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(zzbjbVar);
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        zzp.zzd = java.util.Collections.unmodifiableList(arrayList);
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    public final com.google.android.libraries.places.internal.zzbis zzh(com.google.android.libraries.places.internal.zzbir zzbirVar, java.lang.Object obj) {
        java.lang.Object[][] objArr;
        int length;
        com.google.common.base.Preconditions.checkNotNull(zzbirVar, "key");
        com.google.common.base.Preconditions.checkNotNull(obj, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        int i = 0;
        while (true) {
            objArr = this.zzd;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (zzbirVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        zzp.zzc = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, (i == -1 ? 1 : 0) + length, 2);
        java.lang.System.arraycopy(objArr, 0, zzp.zzc, 0, length);
        if (i == -1) {
            zzp.zzc[length] = new java.lang.Object[]{zzbirVar, obj};
        } else {
            zzp.zzc[i] = new java.lang.Object[]{zzbirVar, obj};
        }
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    public final java.lang.Object zzi(com.google.android.libraries.places.internal.zzbir zzbirVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbirVar, "key");
        int i = 0;
        while (true) {
            java.lang.Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                return null;
            }
            if (zzbirVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean zzk() {
        return java.lang.Boolean.TRUE.equals(this.zzf);
    }

    public final com.google.android.libraries.places.internal.zzbis zzl(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "invalid maxsize %s", i);
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        zzp.zzf = java.lang.Integer.valueOf(i);
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    public final com.google.android.libraries.places.internal.zzbis zzm(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "invalid maxsize %s", i);
        com.google.android.libraries.places.internal.zzbiq zzp = zzp(this);
        zzp.zzg = java.lang.Integer.valueOf(i);
        return new com.google.android.libraries.places.internal.zzbis(zzp, null);
    }

    @javax.annotation.Nullable
    public final java.lang.Integer zzo() {
        return this.zzh;
    }

    @javax.annotation.Nullable
    public final java.lang.Integer zzn() {
        return this.zzg;
    }

    @javax.annotation.Nullable
    public final java.util.concurrent.Executor zzj() {
        return this.zzc;
    }

    public final java.util.List zzg() {
        return this.zze;
    }

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbjv zzb() {
        return this.zzb;
    }

    private static com.google.android.libraries.places.internal.zzbiq zzp(com.google.android.libraries.places.internal.zzbis zzbisVar) {
        com.google.android.libraries.places.internal.zzbiq zzbiqVar = new com.google.android.libraries.places.internal.zzbiq();
        zzbiqVar.zza = zzbisVar.zzb;
        zzbiqVar.zzb = zzbisVar.zzc;
        zzbiqVar.zzc = zzbisVar.zzd;
        zzbiqVar.zzd = zzbisVar.zze;
        zzbiqVar.zze = zzbisVar.zzf;
        zzbiqVar.zzf = zzbisVar.zzg;
        zzbiqVar.zzg = zzbisVar.zzh;
        return zzbiqVar;
    }

    /* synthetic */ zzbis(com.google.android.libraries.places.internal.zzbiq zzbiqVar, byte[] bArr) {
        this.zzb = zzbiqVar.zza;
        this.zzc = zzbiqVar.zzb;
        this.zzd = zzbiqVar.zzc;
        this.zze = zzbiqVar.zzd;
        this.zzf = zzbiqVar.zze;
        this.zzg = zzbiqVar.zzf;
        this.zzh = zzbiqVar.zzg;
    }
}
