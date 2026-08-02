package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b1;

@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n1#2:3117\n*E\n"})
/* loaded from: classes5.dex */
public final class l<E> extends kotlinx.coroutines.internal.u<l<E>> {
    public final b<E> e;
    public final /* synthetic */ AtomicReferenceArray f;

    public l(long j, l<E> lVar, b<E> bVar, int i) {
        super(j, lVar, i);
        this.e = bVar;
        this.f = new AtomicReferenceArray(f.b * 2);
    }

    @Override // kotlinx.coroutines.internal.u
    public final int g() {
        return f.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, CoroutineContext coroutineContext) {
        int i2 = f.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof b1;
            b<E> bVar = this.e;
            if (z2 || (l instanceof x)) {
                if (k(i, l, z ? f.j : f.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        Intrinsics.checkNotNull(bVar);
                        bVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (l == f.j || l == f.k) {
                    break;
                }
                if (l != f.g && l != f.f) {
                    if (l == f.i || l == f.d || l == f.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + l).toString());
                }
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            b<E> bVar = this.e;
            Intrinsics.checkNotNull(bVar);
            bVar.J((this.c * f.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
