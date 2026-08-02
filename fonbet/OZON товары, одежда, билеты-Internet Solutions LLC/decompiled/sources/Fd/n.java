package Fd;

import ae.C5001c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public C5001c f9407a;

    public final InterfaceC9839e a(@NotNull Jd.g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        C5001c c5001c = this.f9407a;
        if (c5001c != null) {
            return c5001c.b(javaClass);
        }
        Intrinsics.n("resolver");
        throw null;
    }
}
