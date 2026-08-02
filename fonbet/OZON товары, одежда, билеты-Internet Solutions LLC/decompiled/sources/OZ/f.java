package OZ;

import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class f extends g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f20170a = N.b(a.class);

    public static final class a extends i<f> {
        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<f> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            if (navigator instanceof NZ.a) {
                ((NZ.a) navigator).navigate(response, 0);
            } else {
                next(navigator, response, 0);
            }
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<f> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            if (navigator instanceof NZ.a) {
                ((NZ.a) navigator).navigate(response, i11);
            } else {
                next(navigator, response, i11);
            }
        }
    }

    public abstract pZ.f a();

    public abstract int b();

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f20170a;
    }
}
