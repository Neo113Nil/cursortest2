package CZ;

import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import xZ.C10683b;

/* loaded from: classes3.dex */
public abstract class c extends pZ.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f4573a = N.b(a.class);

    public static final class a extends i<c> {
        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<c> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateForResult(navigator, response, 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<c> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!d.a(navigator.getActivity())) {
                navigator.getActivity().finish();
                redirect(response, i11);
            } else {
                if (navigator instanceof C10683b) {
                    return;
                }
                next(navigator, response, i11);
            }
        }
    }

    @Override // pZ.f
    @NotNull
    public kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f4573a;
    }
}
