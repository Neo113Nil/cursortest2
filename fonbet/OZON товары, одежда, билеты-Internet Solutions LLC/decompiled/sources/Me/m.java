package Me;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f17933a = new a(0);
    }

    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f17934a = new b(0);
    }

    public m(int i11) {
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    @NotNull
    public final String toString() {
        String B11 = N.b(getClass()).B();
        Intrinsics.f(B11);
        return B11;
    }
}
