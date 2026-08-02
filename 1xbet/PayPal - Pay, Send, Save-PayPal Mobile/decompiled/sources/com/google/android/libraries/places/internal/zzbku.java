package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbku {
    private static final java.util.concurrent.atomic.AtomicLong zza = new java.util.concurrent.atomic.AtomicLong();
    private final java.lang.String zzb;

    @javax.annotation.Nullable
    private final java.lang.String zzc;
    private final long zzd;

    zzbku(java.lang.String str, java.lang.String str2, long j) {
        com.google.common.base.Preconditions.checkNotNull(str, "typeName");
        com.google.common.base.Preconditions.checkArgument(!str.isEmpty(), "empty type");
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static com.google.android.libraries.places.internal.zzbku zza(java.lang.Class cls, @javax.annotation.Nullable java.lang.String str) {
        java.lang.String simpleName = ((java.lang.Class) com.google.common.base.Preconditions.checkNotNull(cls, "type")).getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzb(simpleName, str);
    }

    public static com.google.android.libraries.places.internal.zzbku zzb(java.lang.String str, @javax.annotation.Nullable java.lang.String str2) {
        return new com.google.android.libraries.places.internal.zzbku(str, str2, zza.incrementAndGet());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = this.zzb;
        int length = java.lang.String.valueOf(str).length();
        long j = this.zzd;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length + 1 + java.lang.String.valueOf(j).length() + 1);
        sb2.append(str);
        sb2.append("<");
        sb2.append(j);
        sb2.append(">");
        sb.append(sb2.toString());
        java.lang.String str2 = this.zzc;
        if (str2 != null) {
            sb.append(": (");
            sb.append(str2);
            sb.append(')');
        }
        return sb.toString();
    }

    public final long zzc() {
        return this.zzd;
    }
}
