package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgt extends com.google.android.gms.measurement.internal.zzje {
    private char zza;
    private long zzb;
    private java.lang.String zzc;
    private final com.google.android.gms.measurement.internal.zzgr zzd;
    private final com.google.android.gms.measurement.internal.zzgr zze;
    private final com.google.android.gms.measurement.internal.zzgr zzf;
    private final com.google.android.gms.measurement.internal.zzgr zzg;
    private final com.google.android.gms.measurement.internal.zzgr zzh;
    private final com.google.android.gms.measurement.internal.zzgr zzi;
    private final com.google.android.gms.measurement.internal.zzgr zzj;
    private final com.google.android.gms.measurement.internal.zzgr zzk;
    private final com.google.android.gms.measurement.internal.zzgr zzl;

    zzgt(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new com.google.android.gms.measurement.internal.zzgr(this, 6, false, false);
        this.zze = new com.google.android.gms.measurement.internal.zzgr(this, 6, true, false);
        this.zzf = new com.google.android.gms.measurement.internal.zzgr(this, 6, false, true);
        this.zzg = new com.google.android.gms.measurement.internal.zzgr(this, 5, false, false);
        this.zzh = new com.google.android.gms.measurement.internal.zzgr(this, 5, true, false);
        this.zzi = new com.google.android.gms.measurement.internal.zzgr(this, 5, false, true);
        this.zzj = new com.google.android.gms.measurement.internal.zzgr(this, 4, false, false);
        this.zzk = new com.google.android.gms.measurement.internal.zzgr(this, 3, false, false);
        this.zzl = new com.google.android.gms.measurement.internal.zzgr(this, 2, false, false);
    }

    protected static java.lang.Object zzl(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.google.android.gms.measurement.internal.zzgs(str);
    }

    static java.lang.String zzo(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String zzp = zzp(z, obj);
        java.lang.String zzp2 = zzp(z, obj2);
        java.lang.String zzp3 = zzp(z, obj3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        java.lang.String str3 = ", ";
        if (!android.text.TextUtils.isEmpty(zzp)) {
            sb.append(str2);
            sb.append(zzp);
            str2 = ", ";
        }
        if (android.text.TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zzp2);
        }
        if (!android.text.TextUtils.isEmpty(zzp3)) {
            sb.append(str3);
            sb.append(zzp3);
        }
        return sb.toString();
    }

    static java.lang.String zzp(boolean z, java.lang.Object obj) {
        java.lang.String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof java.lang.Integer) {
            obj = java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof java.lang.Long) {
            if (!z) {
                return obj.toString();
            }
            java.lang.Long l = (java.lang.Long) obj;
            if (java.lang.Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.Math.abs(l.longValue()));
            long round = java.lang.Math.round(java.lang.Math.pow(10.0d, valueOf.length() - 1));
            long round2 = java.lang.Math.round(java.lang.Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = java.lang.String.valueOf(round).length();
            java.lang.String str = charAt == '-' ? "-" : "";
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + length + 3 + str.length() + java.lang.String.valueOf(round2).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof java.lang.Throwable)) {
            return obj instanceof com.google.android.gms.measurement.internal.zzgs ? ((com.google.android.gms.measurement.internal.zzgs) obj).zza() : z ? "-" : obj.toString();
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(z ? th.getClass().getName() : th.toString());
        java.lang.String zzq = zzq(com.google.android.gms.measurement.internal.zzib.class.getCanonicalName());
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(zzq)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb2.toString();
    }

    static java.lang.String zzq(java.lang.String str) {
        int lastIndexOf;
        return (android.text.TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, lastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    protected final boolean zza() {
        return false;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzb() {
        return this.zzd;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzc() {
        return this.zze;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzd() {
        return this.zzf;
    }

    public final com.google.android.gms.measurement.internal.zzgr zze() {
        return this.zzg;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzf() {
        return this.zzh;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzh() {
        return this.zzi;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzi() {
        return this.zzj;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzj() {
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzgr zzk() {
        return this.zzl;
    }

    protected final void zzm(int i, boolean z, boolean z2, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (!z && android.util.Log.isLoggable(zzn(), i)) {
            android.util.Log.println(i, zzn(), zzo(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.measurement.internal.zzhy zzi = this.zzu.zzi();
        if (zzi == null) {
            android.util.Log.println(6, zzn(), "Scheduler not set. Not logging error/warn");
        } else if (zzi.zzv()) {
            zzi.zzj(new com.google.android.gms.measurement.internal.zzgq(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        } else {
            android.util.Log.println(6, zzn(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"logTagDoNotUseDirectly"})
    protected final java.lang.String zzn() {
        java.lang.String str;
        synchronized (this) {
            if (this.zzc == null) {
                this.zzc = this.zzu.zzc().zzb();
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    final /* synthetic */ char zzr() {
        return this.zza;
    }

    final /* synthetic */ void zzs(char c) {
        this.zza = c;
    }

    final /* synthetic */ long zzt() {
        return this.zzb;
    }

    final /* synthetic */ void zzu(long j) {
        this.zzb = 130000L;
    }
}
