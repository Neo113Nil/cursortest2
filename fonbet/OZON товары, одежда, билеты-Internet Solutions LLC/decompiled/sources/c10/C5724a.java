package c10;

import Bl0.c0;
import L00.j;
import a10.C4914b;
import a10.i;
import ci0.C5836a;
import di0.C6201a;
import di0.C6203c;
import java.util.Iterator;
import k10.EnumC7467b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5724a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4914b f56310a;

    public C5724a(@NotNull C4914b newMetricsTraceStorage) {
        Intrinsics.checkNotNullParameter(newMetricsTraceStorage, "newMetricsTraceStorage");
        this.f56310a = newMetricsTraceStorage;
    }

    public final void a(@NotNull String redirectKey, @NotNull i redirectResponse) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        Intrinsics.checkNotNullParameter(redirectResponse, "redirectResponse");
        C6201a a11 = this.f56310a.a(redirectKey);
        if (Intrinsics.d(a11 != null ? a11.a() : null, redirectResponse.b().h().k())) {
            C6201a b11 = C6203c.f61631a.b(a11);
            c0.c(a11.a(), EnumC7467b.REDIRECT_TIME_END, 0L, 12);
            if (a11.d()) {
                return;
            }
            Iterator it = a11.c().iterator();
            while (it.hasNext()) {
                C5836a c5836a = (C5836a) it.next();
                C6201a.f(b11, c5836a.a(), c5836a.b(), false, 4);
            }
        }
    }

    public final void b(@NotNull String redirectKey, @NotNull j response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        C6201a beginTrace = C6203c.f61631a.beginTrace(response.h().k());
        C6201a.f(beginTrace, EnumC7467b.REDIRECT_TIME_START, 0L, false, 6);
        C6201a.f(beginTrace, EnumC7467b.NETWORK_CALL_END, 0L, false, 6);
        this.f56310a.b(redirectKey, beginTrace);
    }
}
