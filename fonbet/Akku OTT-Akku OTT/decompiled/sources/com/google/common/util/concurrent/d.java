package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ boolean a(Unsafe unsafe, a aVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(aVar, j, obj, obj2)) {
            if (unsafe.getObject(aVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
