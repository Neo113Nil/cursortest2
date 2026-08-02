package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzec$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(sun.misc.Unsafe unsafe, java.lang.Object obj, long j, java.lang.Object obj2, java.lang.Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
