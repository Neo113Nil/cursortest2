package kotlinx.coroutines;

import kotlin.jvm.JvmField;

/* loaded from: classes5.dex */
public final class F0 {
    public static final kotlinx.coroutines.internal.x a = new kotlinx.coroutines.internal.x("COMPLETING_ALREADY");

    @JvmField
    public static final kotlinx.coroutines.internal.x b = new kotlinx.coroutines.internal.x("COMPLETING_WAITING_CHILDREN");
    public static final kotlinx.coroutines.internal.x c = new kotlinx.coroutines.internal.x("COMPLETING_RETRY");
    public static final kotlinx.coroutines.internal.x d = new kotlinx.coroutines.internal.x("TOO_LATE_TO_CANCEL");
    public static final kotlinx.coroutines.internal.x e = new kotlinx.coroutines.internal.x("SEALED");
    public static final C1081h0 f = new C1081h0(false);
    public static final C1081h0 g = new C1081h0(true);

    public static final Object a(Object obj) {
        InterfaceC1110s0 interfaceC1110s0;
        C1112t0 c1112t0 = obj instanceof C1112t0 ? (C1112t0) obj : null;
        return (c1112t0 == null || (interfaceC1110s0 = c1112t0.a) == null) ? obj : interfaceC1110s0;
    }
}
