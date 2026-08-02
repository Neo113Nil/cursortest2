package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"WrongPackage"})
/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5415f {
    @NotNull
    public static final C8486a a(@NotNull w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        C5409c c5409c = (C5409c) w0Var.getCloseable("ru.ozon.app.android.utils.rx.COMPOSITE_DISPOSABLE_TAG");
        if (c5409c != null) {
            return c5409c.c();
        }
        C5409c c5409c2 = new C5409c();
        w0Var.addCloseable("ru.ozon.app.android.utils.rx.COMPOSITE_DISPOSABLE_TAG", c5409c2);
        return c5409c2.c();
    }
}
