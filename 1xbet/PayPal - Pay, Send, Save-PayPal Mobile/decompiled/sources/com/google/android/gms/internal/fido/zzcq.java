package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzcq extends com.google.android.gms.internal.fido.zzcs implements java.io.Serializable {
    static final com.google.android.gms.internal.fido.zzcq zza = new com.google.android.gms.internal.fido.zzcq();

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final com.google.android.gms.internal.fido.zzcs zza() {
        return com.google.android.gms.internal.fido.zzcw.zza;
    }

    public final java.lang.String toString() {
        return "Ordering.natural()";
    }

    private zzcq() {
    }
}
