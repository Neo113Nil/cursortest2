package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.AbstractC1085b;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1085b<N extends AbstractC1085b<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1085b.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1085b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC1085b(u uVar) {
        this._prev$volatile = uVar;
    }

    public final void a() {
        b.set(this, null);
    }

    public final N c() {
        Object obj = a.get(this);
        if (obj == C1084a.a) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.internal.b] */
    public final void e() {
        ?? c;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            AbstractC1085b abstractC1085b = (AbstractC1085b) atomicReferenceFieldUpdater.get(this);
            while (abstractC1085b != null && abstractC1085b.d()) {
                abstractC1085b = (AbstractC1085b) atomicReferenceFieldUpdater.get(abstractC1085b);
            }
            N c2 = c();
            Intrinsics.checkNotNull(c2);
            while (c2.d() && (c = c2.c()) != 0) {
                c2 = c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c2);
                AbstractC1085b abstractC1085b2 = ((AbstractC1085b) obj) == null ? null : abstractC1085b;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2, obj, abstractC1085b2)) {
                    if (atomicReferenceFieldUpdater.get(c2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC1085b != null) {
                a.set(abstractC1085b, c2);
            }
            if (!c2.d() || c2.c() == null) {
                if (abstractC1085b == null || !abstractC1085b.d()) {
                    return;
                }
            }
        }
    }
}
