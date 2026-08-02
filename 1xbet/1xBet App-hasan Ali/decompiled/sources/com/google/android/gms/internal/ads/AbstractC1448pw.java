package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.pw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1448pw {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC1403ow abstractC1403ow, long j5, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1403ow, j5, obj, obj2)) {
            if (unsafe.getObject(abstractC1403ow, j5) != obj) {
                return false;
            }
        }
        return true;
    }
}
