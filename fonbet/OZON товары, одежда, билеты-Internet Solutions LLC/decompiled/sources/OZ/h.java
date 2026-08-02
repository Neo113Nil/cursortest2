package OZ;

import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class h extends g {

    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> navigator;

    @NotNull
    private final pZ.f redirect;

    public static final class a extends i<h> {
        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<h> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateForResult(navigator, response, 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<h> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            redirect(response.e(response.b().getRedirect$compass_release()), i11);
        }
    }

    public h(@NotNull pZ.f redirect) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.redirect = redirect;
        this.navigator = N.b(a.class);
    }

    @Override // pZ.f
    @NotNull
    public kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.navigator;
    }

    @NotNull
    public final pZ.f getRedirect$compass_release() {
        return this.redirect;
    }

    @NotNull
    public String toString() {
        return "TabScreenDestination(redirect=" + this.redirect + ")";
    }
}
