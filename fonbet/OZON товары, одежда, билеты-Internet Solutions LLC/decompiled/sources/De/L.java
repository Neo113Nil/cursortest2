package De;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.Y0;

/* loaded from: classes.dex */
final class L {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f6612a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f6613b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Y0<Object>[] f6614c;

    /* renamed from: d, reason: collision with root package name */
    private int f6615d;

    public L(int i11, @NotNull CoroutineContext coroutineContext) {
        this.f6612a = coroutineContext;
        this.f6613b = new Object[i11];
        this.f6614c = new Y0[i11];
    }

    public final void a(@NotNull Y0<?> y02, Object obj) {
        int i11 = this.f6615d;
        this.f6613b[i11] = obj;
        this.f6615d = i11 + 1;
        Intrinsics.g(y02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        this.f6614c[i11] = y02;
    }

    public final void b(@NotNull CoroutineContext coroutineContext) {
        Y0<Object>[] y0Arr = this.f6614c;
        int length = y0Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            Y0<Object> y02 = y0Arr[length];
            Intrinsics.f(y02);
            y02.O(this.f6613b[length]);
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }
}
