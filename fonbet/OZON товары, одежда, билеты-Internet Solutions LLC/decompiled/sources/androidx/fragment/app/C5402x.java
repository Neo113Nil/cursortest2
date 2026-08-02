package androidx.fragment.app;

import B90.C2607i;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5402x {
    public static final void a(@NotNull Bundle bundle, @NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull String str) {
        componentCallbacksC5392m.getParentFragmentManager().m1(bundle, str);
    }

    public static final void b(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull String str, @NotNull Function2<? super String, ? super Bundle, Unit> function2) {
        componentCallbacksC5392m.getParentFragmentManager().n1(str, componentCallbacksC5392m, new C2607i(function2));
    }
}
