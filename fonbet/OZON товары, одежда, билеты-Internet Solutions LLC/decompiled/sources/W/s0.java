package W;

import C.InterfaceC2694n;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.impl.Y0;

/* loaded from: classes8.dex */
public interface s0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTIVE_NON_STREAMING;
        public static final a ACTIVE_STREAMING;
        public static final a INACTIVE;

        static {
            a aVar = new a("ACTIVE_STREAMING", 0);
            ACTIVE_STREAMING = aVar;
            a aVar2 = new a("ACTIVE_NON_STREAMING", 1);
            ACTIVE_NON_STREAMING = aVar2;
            a aVar3 = new a("INACTIVE", 2);
            INACTIVE = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    void a(@NonNull C.s0 s0Var);

    @NonNull
    default InterfaceC5129y0<AbstractC4847s> b() {
        return androidx.camera.core.impl.U.f(null);
    }

    @NonNull
    default Z c(@NonNull InterfaceC2694n interfaceC2694n) {
        return Z.f32996a;
    }

    @NonNull
    default InterfaceC5129y0<Y> d() {
        return Y.f32995c;
    }

    default void e(@NonNull a aVar) {
    }

    default void f(@NonNull C.s0 s0Var, @NonNull Y0 y02) {
        a(s0Var);
    }

    @NonNull
    default InterfaceC5129y0<Boolean> g() {
        return androidx.camera.core.impl.U.f(Boolean.FALSE);
    }
}
