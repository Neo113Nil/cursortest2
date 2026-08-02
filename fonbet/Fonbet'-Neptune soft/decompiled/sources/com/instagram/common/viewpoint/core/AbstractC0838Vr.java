package com.instagram.common.viewpoint.core;

import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Vr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0838Vr extends LinearLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC0830Vj> A01 = new AtomicReference<>();

    public static void A00(boolean z, InterfaceC0830Vj interfaceC0830Vj) {
        A00.set(z);
        A01.set(interfaceC0830Vj);
    }
}
