package I1;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f11679a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<T, T, T> f11680b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11681c;

    public /* synthetic */ C(String str) {
        this(str, B.f11678b);
    }

    @NotNull
    public final String a() {
        return this.f11679a;
    }

    public final boolean b() {
        return this.f11681c;
    }

    public final T c(T t2, T t11) {
        return this.f11680b.invoke(t2, t11);
    }

    @NotNull
    public final String toString() {
        return "AccessibilityKey: " + this.f11679a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(@NotNull String str, @NotNull Function2<? super T, ? super T, ? extends T> function2) {
        this.f11679a = str;
        this.f11680b = function2;
    }

    public C(@NotNull String str, int i11) {
        this(str);
        this.f11681c = true;
    }

    public C(@NotNull Function2 function2, @NotNull String str, boolean z11) {
        this(str, function2);
        this.f11681c = z11;
    }
}
