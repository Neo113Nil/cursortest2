package b90;

import B30.o;
import We.E;
import a90.C4969g;
import android.content.Context;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import lm.C7970a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.di.FintechNetworkProviderKt;

/* renamed from: b90.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5597d {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C5597d f55750c = new C5597d(false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f55751a;

    /* renamed from: b, reason: collision with root package name */
    private C7970a f55752b;

    public C5597d(boolean z11) {
        this.f55751a = z11;
    }

    @NotNull
    public final E b(@NotNull Context app, @NotNull Set interceptors, @NotNull C4969g okHttpClientSetup, @NotNull o internalOkHttpProvider) {
        E fintechSingleNetworkClientProvider$lambda$1$lambda$0;
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(okHttpClientSetup, "okHttpClientSetup");
        Intrinsics.checkNotNullParameter(internalOkHttpProvider, "internalOkHttpProvider");
        C7970a c7970a = this.f55752b;
        if (c7970a != null) {
            if (!this.f55751a) {
                c7970a = null;
            }
            if (c7970a != null) {
                fintechSingleNetworkClientProvider$lambda$1$lambda$0 = FintechNetworkProviderKt.getFintechSingleNetworkClientProvider$lambda$1$lambda$0(c7970a.f73383a, c7970a.f73384b, c7970a.f73385c, C7714v.U0(interceptors));
                if (fintechSingleNetworkClientProvider$lambda$1$lambda$0 != null) {
                    return new E((E.a) okHttpClientSetup.invoke(new E.a(fintechSingleNetworkClientProvider$lambda$1$lambda$0), app));
                }
            }
        }
        return (E) internalOkHttpProvider.invoke();
    }

    public final void c(C7970a c7970a) {
        this.f55752b = c7970a;
    }
}
