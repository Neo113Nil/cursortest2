package kotlinx.coroutines.channels;

import kotlin.jvm.JvmField;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.b1;

/* loaded from: classes5.dex */
public final class u<E> implements b1 {

    @JvmField
    public final C1100n<k<? extends E>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(C1100n<? super k<? extends E>> c1100n) {
        this.a = c1100n;
    }

    @Override // kotlinx.coroutines.b1
    public final void a(kotlinx.coroutines.internal.u<?> uVar, int i) {
        this.a.a(uVar, i);
    }
}
