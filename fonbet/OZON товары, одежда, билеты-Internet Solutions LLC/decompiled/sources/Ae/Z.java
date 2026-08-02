package Ae;

import kotlin.jvm.functions.Function2;
import ze.EnumC11113a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final int f941a = (int) De.B.b(16, 1, Integer.MAX_VALUE, "kotlinx.coroutines.flow.defaultConcurrency");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f942b = 0;

    public static InterfaceC2395h a(InterfaceC2395h interfaceC2395h, Function2 function2) {
        V v11 = new V(interfaceC2395h, function2);
        int i11 = f941a;
        if (i11 > 0) {
            return i11 == 1 ? new W(v11) : new Be.i(v11, i11, kotlin.coroutines.g.f71771a, -2, EnumC11113a.SUSPEND);
        }
        throw new IllegalArgumentException(Ej.b.a(i11, "Expected positive concurrency level, but had ").toString());
    }
}
