package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbnp {
    public static final com.google.android.libraries.places.internal.zzbnp zza;
    public static final com.google.android.libraries.places.internal.zzbnp zzb;
    public static final com.google.android.libraries.places.internal.zzbnp zzc;
    public static final com.google.android.libraries.places.internal.zzbnp zzd;
    public static final com.google.android.libraries.places.internal.zzbnp zze;
    public static final com.google.android.libraries.places.internal.zzbnp zzf;
    public static final com.google.android.libraries.places.internal.zzbnp zzg;
    public static final com.google.android.libraries.places.internal.zzbnp zzh;
    public static final com.google.android.libraries.places.internal.zzbnp zzi;
    static final com.google.android.libraries.places.internal.zzbmc zzj;
    static final com.google.android.libraries.places.internal.zzbmc zzk;
    private static final java.util.List zzl;
    private static final com.google.android.libraries.places.internal.zzbmf zzm;
    private final com.google.android.libraries.places.internal.zzbnm zzn;
    private final java.lang.String zzo;
    private final java.lang.Throwable zzp;

    static {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        com.google.android.libraries.places.internal.zzbnm[] values = com.google.android.libraries.places.internal.zzbnm.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            byte[] bArr = null;
            if (i >= length) {
                zzl = java.util.Collections.unmodifiableList(new java.util.ArrayList(treeMap.values()));
                zza = com.google.android.libraries.places.internal.zzbnm.OK.zzb();
                zzb = com.google.android.libraries.places.internal.zzbnm.CANCELLED.zzb();
                zzc = com.google.android.libraries.places.internal.zzbnm.UNKNOWN.zzb();
                com.google.android.libraries.places.internal.zzbnm.INVALID_ARGUMENT.zzb();
                zzd = com.google.android.libraries.places.internal.zzbnm.DEADLINE_EXCEEDED.zzb();
                com.google.android.libraries.places.internal.zzbnm.NOT_FOUND.zzb();
                com.google.android.libraries.places.internal.zzbnm.ALREADY_EXISTS.zzb();
                zze = com.google.android.libraries.places.internal.zzbnm.PERMISSION_DENIED.zzb();
                com.google.android.libraries.places.internal.zzbnm.UNAUTHENTICATED.zzb();
                zzf = com.google.android.libraries.places.internal.zzbnm.RESOURCE_EXHAUSTED.zzb();
                zzg = com.google.android.libraries.places.internal.zzbnm.FAILED_PRECONDITION.zzb();
                com.google.android.libraries.places.internal.zzbnm.ABORTED.zzb();
                com.google.android.libraries.places.internal.zzbnm.OUT_OF_RANGE.zzb();
                com.google.android.libraries.places.internal.zzbnm.UNIMPLEMENTED.zzb();
                zzh = com.google.android.libraries.places.internal.zzbnm.INTERNAL.zzb();
                zzi = com.google.android.libraries.places.internal.zzbnm.UNAVAILABLE.zzb();
                com.google.android.libraries.places.internal.zzbnm.DATA_LOSS.zzb();
                zzj = new com.google.android.libraries.places.internal.zzbme("grpc-status", z, new com.google.android.libraries.places.internal.zzbnn(bArr), bArr);
                com.google.android.libraries.places.internal.zzbno zzbnoVar = new com.google.android.libraries.places.internal.zzbno(null);
                zzm = zzbnoVar;
                zzk = new com.google.android.libraries.places.internal.zzbme("grpc-message", z, zzbnoVar, bArr);
                return;
            }
            com.google.android.libraries.places.internal.zzbnm zzbnmVar = values[i];
            com.google.android.libraries.places.internal.zzbnp zzbnpVar = (com.google.android.libraries.places.internal.zzbnp) treeMap.put(java.lang.Integer.valueOf(zzbnmVar.zza()), new com.google.android.libraries.places.internal.zzbnp(zzbnmVar, null, null));
            if (zzbnpVar != null) {
                java.lang.String name2 = zzbnpVar.zzn.name();
                java.lang.String name3 = zzbnmVar.name();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 34 + java.lang.String.valueOf(name3).length());
                sb.append("Code value duplication between ");
                sb.append(name2);
                sb.append(" & ");
                sb.append(name3);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            i++;
        }
    }

    private zzbnp(com.google.android.libraries.places.internal.zzbnm zzbnmVar, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        this.zzn = (com.google.android.libraries.places.internal.zzbnm) com.google.common.base.Preconditions.checkNotNull(zzbnmVar, "code");
        this.zzo = str;
        this.zzp = th;
    }

    public static com.google.android.libraries.places.internal.zzbnp zza(int i) {
        if (i >= 0) {
            java.util.List list = zzl;
            if (i < list.size()) {
                return (com.google.android.libraries.places.internal.zzbnp) list.get(i);
            }
        }
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 13);
        sb.append("Unknown code ");
        sb.append(i);
        return zzbnpVar.zze(sb.toString());
    }

    public static com.google.android.libraries.places.internal.zzbnp zzb(java.lang.Throwable th) {
        for (java.lang.Throwable th2 = (java.lang.Throwable) com.google.common.base.Preconditions.checkNotNull(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof com.google.android.libraries.places.internal.zzbnq) {
                return ((com.google.android.libraries.places.internal.zzbnq) th2).zza();
            }
            if (th2 instanceof com.google.android.libraries.places.internal.zzbns) {
                return ((com.google.android.libraries.places.internal.zzbns) th2).zza();
            }
        }
        return zzc.zzd(th);
    }

    static java.lang.String zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        java.lang.String str = zzbnpVar.zzo;
        com.google.android.libraries.places.internal.zzbnm zzbnmVar = zzbnpVar.zzn;
        if (str == null) {
            return zzbnmVar.toString();
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzbnmVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 2 + str.length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    static /* synthetic */ com.google.android.libraries.places.internal.zzbnp zzk(byte[] bArr) {
        int i;
        byte b;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return zza;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return zzc.zze("Unknown code ".concat(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            java.util.List list = zzl;
            if (i2 < list.size()) {
                return (com.google.android.libraries.places.internal.zzbnp) list.get(i2);
            }
        }
        return zzc.zze("Unknown code ".concat(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII)));
    }

    public final java.lang.String toString() {
        com.google.common.base.MoreObjects.ToStringHelper add = com.google.common.base.MoreObjects.toStringHelper(this).add("code", this.zzn.name()).add(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, this.zzo);
        java.lang.Throwable th = this.zzp;
        java.lang.Object obj = th;
        if (th != null) {
            obj = com.google.common.base.Throwables.getStackTraceAsString(th);
        }
        return add.add("cause", obj).toString();
    }

    public final com.google.android.libraries.places.internal.zzbnp zzd(java.lang.Throwable th) {
        return com.google.common.base.Objects.equal(this.zzp, th) ? this : new com.google.android.libraries.places.internal.zzbnp(this.zzn, this.zzo, th);
    }

    public final com.google.android.libraries.places.internal.zzbnp zze(java.lang.String str) {
        return com.google.common.base.Objects.equal(this.zzo, str) ? this : new com.google.android.libraries.places.internal.zzbnp(this.zzn, str, this.zzp);
    }

    public final com.google.android.libraries.places.internal.zzbnp zzf(java.lang.String str) {
        java.lang.String str2 = this.zzo;
        if (str2 == null) {
            return new com.google.android.libraries.places.internal.zzbnp(this.zzn, str, this.zzp);
        }
        com.google.android.libraries.places.internal.zzbnm zzbnmVar = this.zzn;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(str);
        return new com.google.android.libraries.places.internal.zzbnp(zzbnmVar, sb.toString(), this.zzp);
    }

    public final boolean zzj() {
        return com.google.android.libraries.places.internal.zzbnm.OK == this.zzn;
    }

    @javax.annotation.Nullable
    public final java.lang.Throwable zzi() {
        return this.zzp;
    }

    @javax.annotation.Nullable
    public final java.lang.String zzh() {
        return this.zzo;
    }

    public final com.google.android.libraries.places.internal.zzbnm zzg() {
        return this.zzn;
    }
}
