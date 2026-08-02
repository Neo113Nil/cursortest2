package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final /* synthetic */ class zzjh implements java.util.function.Function {
    static final /* synthetic */ com.google.android.libraries.places.internal.zzjh zza = new com.google.android.libraries.places.internal.zzjh();

    @Override // java.util.function.Function
    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        return str.substring(str.lastIndexOf("places/") + 7);
    }

    private /* synthetic */ zzjh() {
    }
}
