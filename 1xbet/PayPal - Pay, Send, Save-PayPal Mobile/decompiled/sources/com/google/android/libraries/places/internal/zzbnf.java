package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
class zzbnf implements com.google.android.libraries.places.internal.zzbmm {
    protected final int zza;
    protected final java.lang.String zzb;
    protected final java.util.List zzc;
    protected final java.util.List zzd;

    protected zzbnf(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, boolean z) {
        this.zza = i;
        this.zzb = str;
        this.zzc = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.zzd = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list2);
    }

    public final java.lang.String toString() {
        java.lang.String name2 = getClass().getName();
        int length = java.lang.String.valueOf(name2).length();
        java.lang.String str = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 1 + str.length() + 1);
        sb.append(name2);
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int zza() {
        return this.zza;
    }
}
