package S0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class D1 implements l1<Object> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final D1 f25195a = new D1();

    @Override // S0.l1
    public final boolean a(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    @NotNull
    public final String toString() {
        return "StructuralEqualityPolicy";
    }
}
