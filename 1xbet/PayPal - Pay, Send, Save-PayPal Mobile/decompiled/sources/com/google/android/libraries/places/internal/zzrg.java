package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzrg extends java.lang.ThreadLocal {
    zzrg() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        java.util.WeakHashMap weakHashMap;
        java.util.WeakHashMap weakHashMap2;
        com.google.android.libraries.places.internal.zzrt zzrtVar = new com.google.android.libraries.places.internal.zzrt(com.google.android.libraries.places.internal.zzqw.zza(java.lang.Thread.currentThread()));
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        weakHashMap = com.google.android.libraries.places.internal.zzrh.zzd;
        synchronized (weakHashMap) {
            weakHashMap2 = com.google.android.libraries.places.internal.zzrh.zzd;
            weakHashMap2.put(currentThread, zzrtVar);
        }
        return zzrtVar;
    }
}
