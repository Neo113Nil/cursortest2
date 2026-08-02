package b10;

import L00.j;
import a10.C4914b;
import di0.C6201a;
import di0.C6203c;
import k10.EnumC7467b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: b10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5519a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4914b f55474a;

    public C5519a(@NotNull C4914b newMetricsTraceStorage) {
        Intrinsics.checkNotNullParameter(newMetricsTraceStorage, "newMetricsTraceStorage");
        this.f55474a = newMetricsTraceStorage;
    }

    private static void a(C6201a c6201a, C6201a c6201a2, EnumC7467b enumC7467b) {
        Long b11 = c6201a.b(enumC7467b);
        if (b11 != null) {
            c6201a2.e(enumC7467b, b11.longValue(), true);
        }
    }

    public final void b(@NotNull String redirectKey, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        C6201a a11 = this.f55474a.a(redirectKey);
        if (a11 == null) {
            return;
        }
        C6201a beginTrace = C6203c.f61631a.beginTrace(requestId);
        a(a11, beginTrace, EnumC7467b.SCREEN_CREATE_TIME);
        a(a11, beginTrace, EnumC7467b.TOTAL_TIME_START);
        a(a11, beginTrace, EnumC7467b.ADDITIONAL_REQUEST_TIME_START);
        a(a11, beginTrace, EnumC7467b.ADDITIONAL_REQUEST_TIME_END);
        a(a11, beginTrace, EnumC7467b.REDIRECT_TIME_START);
        C6201a.f(beginTrace, EnumC7467b.REDIRECT_TIME_END, 0L, false, 6);
    }

    public final void c(@NotNull String redirectKey, @NotNull j response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        C6201a beginTrace = C6203c.f61631a.beginTrace(response.h().k());
        EnumC7467b enumC7467b = EnumC7467b.ADDITIONAL_REQUEST_TIME_START;
        Long b11 = beginTrace.b(EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_START);
        if (b11 != null) {
            C6201a.f(beginTrace, enumC7467b, b11.longValue(), false, 4);
            C6201a.f(beginTrace, EnumC7467b.ADDITIONAL_REQUEST_TIME_END, 0L, false, 6);
            C6201a.f(beginTrace, EnumC7467b.REDIRECT_TIME_START, 0L, false, 6);
            this.f55474a.b(redirectKey, beginTrace);
        }
    }
}
