package com.inmobi.media;

import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Iq {
    public void a(Hg orientation, Kq finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
    }

    public boolean a() {
        return true;
    }

    public void a(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
