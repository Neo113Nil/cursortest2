package J0;

import androidx.compose.material.C5210h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5210h<X> f13050a;

    static final class a extends AbstractC7737t implements Function1<Float, Float> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f7) {
            float f11;
            f7.floatValue();
            Z1.d a11 = W.a(W.this);
            f11 = T.f13004a;
            return Float.valueOf(a11.v1(f11));
        }
    }

    static final class b extends AbstractC7737t implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            float f7;
            Z1.d a11 = W.a(W.this);
            f7 = T.f13005b;
            return Float.valueOf(a11.v1(f7));
        }
    }

    public W(@NotNull X x11, @NotNull Function1<? super X, Boolean> function1) {
        m0.T0 t02;
        t02 = T.f13006c;
        this.f13050a = new C5210h<>(x11, new a(), new b(), t02, function1);
    }

    public static final Z1.d a(W w11) {
        w11.getClass();
        throw new IllegalArgumentException(("The density on DrawerState (" + w11 + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    @NotNull
    public final X b() {
        return this.f13050a.p();
    }
}
