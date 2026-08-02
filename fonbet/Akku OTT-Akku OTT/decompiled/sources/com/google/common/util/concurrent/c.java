package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ boolean a(Unsafe unsafe, a aVar, long j, a.d dVar, a.d dVar2) {
        while (!unsafe.compareAndSwapObject(aVar, j, dVar, dVar2)) {
            if (unsafe.getObject(aVar, j) != dVar) {
                return false;
            }
        }
        return true;
    }
}
