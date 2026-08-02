package Yf0;

import Sc.InterfaceC4008j;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f35014a;

    public h(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35014a = Sc.k.b(new g(context));
    }

    public final Object a(@NotNull kotlin.coroutines.d<? super a> dVar) {
        return ((c) this.f35014a.getValue()).b((kotlin.coroutines.jvm.internal.c) dVar);
    }

    public final String b() {
        return ((c) this.f35014a.getValue()).c();
    }

    public final Object c(@NotNull kotlin.coroutines.d<? super W2.f> dVar) {
        return ((c) this.f35014a.getValue()).d(dVar);
    }

    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super W2.f> dVar) {
        return ((c) this.f35014a.getValue()).e(str, dVar);
    }
}
