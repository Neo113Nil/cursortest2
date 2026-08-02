package kotlinx.coroutines.selects;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.InterfaceC1094k;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.internal.u;

@PublishedApi
@SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,904:1\n1#2:905\n2632#3,3:906\n1863#3,2:918\n1863#3,2:926\n1863#3,2:928\n351#4,9:909\n360#4,2:920\n149#5,4:922\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n529#1:906,3\n593#1:918,2\n749#1:926,2\n774#1:928,2\n569#1:909,9\n569#1:920,2\n734#1:922,4\n*E\n"})
/* loaded from: classes5.dex */
public final class e<R> implements InterfaceC1094k, f, b1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");
    public InterfaceC1053e0 a;
    public Object b;
    private volatile /* synthetic */ Object state$volatile;

    @SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,904:1\n1#2:905\n*E\n"})
    public final class a {
    }

    @Override // kotlinx.coroutines.b1
    public final void a(u<?> uVar, int i) {
    }

    @Override // kotlinx.coroutines.InterfaceC1094k
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == g.b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g.c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // kotlinx.coroutines.selects.f
    public final void c(Object obj) {
        this.b = obj;
    }

    @Override // kotlinx.coroutines.selects.f
    public final void d(InterfaceC1053e0 interfaceC1053e0) {
        this.a = interfaceC1053e0;
    }

    @Override // kotlinx.coroutines.selects.f
    public final boolean e(Object obj, Object obj2) {
        return f(obj) == 0;
    }

    public final int f(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC1096l)) {
                if (Intrinsics.areEqual(obj2, g.b) || (obj2 instanceof a)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj2, g.c)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj2, g.a)) {
                    List listOf = CollectionsKt.listOf(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, listOf)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj2 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj2).toString());
                }
                List plus = CollectionsKt.plus((Collection<? extends Object>) obj2, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, plus)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return 1;
            }
        }
    }
}
