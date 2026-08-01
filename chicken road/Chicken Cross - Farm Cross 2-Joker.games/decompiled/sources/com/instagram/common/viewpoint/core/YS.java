package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C2253Pp A00;
    public final YU A01;

    public YS(C2930gi c2930gi, Executor executor, C2361Tw c2361Tw) {
        this.A01 = new YU(c2930gi);
        this.A00 = new C2253Pp(executor, c2361Tw, c2930gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2930gi c2930gi, Executor executor, C2361Tw c2361Tw) {
        if (!C2380Up.A1c(c2930gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c2930gi, executor, c2361Tw);
            A02.A00();
        } else {
            A02.A02(c2361Tw);
        }
    }

    private void A02(C2361Tw c2361Tw) {
        this.A00.A07(c2361Tw);
    }
}
