package I1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends AbstractC7737t implements Function0<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11727b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(@NotNull l lVar, @NotNull C<T> c11) {
        return (T) lVar.m(c11, a.f11727b);
    }
}
