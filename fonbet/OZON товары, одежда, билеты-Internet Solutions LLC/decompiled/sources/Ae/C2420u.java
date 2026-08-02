package Ae;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ae.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C2420u {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> InterfaceC2395h<T> a(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, final long j11) {
        if (j11 >= 0) {
            return j11 == 0 ? interfaceC2395h : new Be.u(new C2413q(new Function1() { // from class: Ae.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(j11);
                }
            }, interfaceC2395h, null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }
}
