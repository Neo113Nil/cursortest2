package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C2926ge c2926ge) {
        if (A00 == null) {
            A00 = new OO(c2926ge);
        }
        return A00;
    }

    public static void A01(C2926ge c2926ge) {
        if (AbstractC2383Us.A0F(c2926ge)) {
            A03(c2926ge);
        }
    }

    public static void A02(C2926ge c2926ge) {
        if (AbstractC2383Us.A0E(c2926ge)) {
            A03(c2926ge);
        }
    }

    public static void A03(C2926ge c2926ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C3029iN(c2926ge));
        }
    }
}
