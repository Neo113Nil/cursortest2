package androidx.activity;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L {
    public static void a(J j11, androidx.lifecycle.J j12, Function1 onBackPressed, int i11) {
        if ((i11 & 1) != 0) {
            j12 = null;
        }
        Intrinsics.checkNotNullParameter(j11, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        K onBackPressedCallback = new K(onBackPressed);
        if (j12 != null) {
            j11.h(j12, onBackPressedCallback);
            return;
        }
        j11.getClass();
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        j11.i(onBackPressedCallback);
    }
}
