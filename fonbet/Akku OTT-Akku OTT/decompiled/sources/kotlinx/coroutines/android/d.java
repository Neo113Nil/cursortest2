package kotlinx.coroutines.android;

import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;

@SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n141#2:14\n142#2:16\n1#3:15\n*E\n"})
/* loaded from: classes5.dex */
public final class d implements Runnable {
    public final /* synthetic */ C1100n a;
    public final /* synthetic */ e b;

    public d(C1100n c1100n, e eVar) {
        this.a = c1100n;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.A(this.b, Unit.INSTANCE);
    }
}
