package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlinx.coroutines.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1094k extends L0 {

    /* renamed from: kotlinx.coroutines.k$a */
    public static final class a implements InterfaceC1094k {
        public final Function1<Throwable, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1) {
            this.a = function1;
        }

        @Override // kotlinx.coroutines.InterfaceC1094k
        public final void b(Throwable th) {
            this.a.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + O.a(this) + ']';
        }
    }

    void b(Throwable th);
}
