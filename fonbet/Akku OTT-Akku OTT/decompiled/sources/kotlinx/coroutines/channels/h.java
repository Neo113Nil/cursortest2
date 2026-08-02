package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC1044a;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C1122y0;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.channels.r;

@SourceDebugExtension({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n732#2,3:40\n732#2,3:43\n732#2,3:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,3\n23#1:43,3\n30#1:46,3\n*E\n"})
/* loaded from: classes5.dex */
public class h<E> extends AbstractC1044a<Unit> implements g<E> {
    public final b d;

    public h(CoroutineContext coroutineContext, b bVar) {
        super(coroutineContext, true);
        this.d = bVar;
    }

    @Override // kotlinx.coroutines.channels.v
    public final Object a(kotlinx.coroutines.flow.internal.n nVar) {
        b bVar = this.d;
        bVar.getClass();
        Object C = b.C(bVar, nVar);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return C;
    }

    @Override // kotlinx.coroutines.channels.w
    public final Object c(E e) {
        return this.d.c(e);
    }

    @Override // kotlinx.coroutines.C0, kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // kotlinx.coroutines.C0, kotlinx.coroutines.InterfaceC1120x0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C1122y0(v(), null, this);
        }
        p(cancellationException);
    }

    @Override // kotlinx.coroutines.C0, kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.v
    public final Object d(ContinuationImpl continuationImpl) {
        return this.d.d(continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.v
    public final Object e() {
        return this.d.e();
    }

    @Override // kotlinx.coroutines.channels.w
    public final boolean g(Throwable th) {
        return this.d.m(th, false);
    }

    @Override // kotlinx.coroutines.channels.w
    public final void h(r.b bVar) {
        this.d.h(bVar);
    }

    @Override // kotlinx.coroutines.channels.w
    public final Object i(E e, Continuation<? super Unit> continuation) {
        return this.d.i(e, continuation);
    }

    @Override // kotlinx.coroutines.channels.v
    public final i<E> iterator() {
        b bVar = this.d;
        bVar.getClass();
        return new b.a();
    }

    @Override // kotlinx.coroutines.channels.w
    public final boolean j() {
        return this.d.j();
    }

    @Override // kotlinx.coroutines.C0
    public final void p(CancellationException cancellationException) {
        CancellationException X = C0.X(this, cancellationException);
        this.d.m(X, true);
        o(X);
    }
}
