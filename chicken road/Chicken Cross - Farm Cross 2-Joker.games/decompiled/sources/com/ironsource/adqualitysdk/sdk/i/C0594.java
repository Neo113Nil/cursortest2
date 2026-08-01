package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ة, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0594 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static C0594 f1548;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C0720 f1549;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public ChoreographerFrameCallbackC0606 f1550;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1553;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f1552 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f1551 = new Handler(Looper.getMainLooper());

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0594 m5547() {
        C0594 c0594;
        synchronized (C0594.class) {
            if (f1548 == null) {
                f1548 = new C0594();
            }
            c0594 = f1548;
        }
        return c0594;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5548(C0594 c0594) {
        if (c0594.f1553 || new HashMap(c0594.f1552).isEmpty()) {
            return;
        }
        c0594.f1553 = true;
        AbstractC1145.m5892(new C0605(c0594));
    }
}
