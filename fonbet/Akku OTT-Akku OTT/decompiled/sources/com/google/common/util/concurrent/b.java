package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ boolean a(Unsafe unsafe, a aVar, long j, a.k kVar, a.k kVar2) {
        while (!unsafe.compareAndSwapObject(aVar, j, kVar, kVar2)) {
            if (unsafe.getObject(aVar, j) != kVar) {
                return false;
            }
        }
        return true;
    }
}
