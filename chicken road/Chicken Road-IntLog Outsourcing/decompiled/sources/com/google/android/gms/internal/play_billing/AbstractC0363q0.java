package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0363q0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC0354n0 abstractC0354n0, long j2, Object obj, Object obj2) {
        while (!AbstractC0360p0.a(unsafe, abstractC0354n0, j2, obj, obj2)) {
            if (unsafe.getObject(abstractC0354n0, j2) != obj) {
                return false;
            }
        }
        return true;
    }
}
