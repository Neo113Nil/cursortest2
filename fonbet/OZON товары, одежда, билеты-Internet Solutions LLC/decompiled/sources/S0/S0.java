package S0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class S0 implements l1<Object> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final S0 f25310a = new S0();

    @Override // S0.l1
    public final boolean a(Object obj, Object obj2) {
        return obj == obj2;
    }

    @NotNull
    public final String toString() {
        return "ReferentialEqualityPolicy";
    }
}
