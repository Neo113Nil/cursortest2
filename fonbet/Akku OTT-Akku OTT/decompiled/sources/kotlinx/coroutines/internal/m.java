package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.O;

@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* loaded from: classes5.dex */
public class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    public final boolean c(m mVar, int i) {
        while (true) {
            m d = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    d = (m) obj;
                    if (!d.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            if (d instanceof k) {
                return (((k) d).d & i) == 0 && d.c(mVar, i);
            }
            atomicReferenceFieldUpdater.set(mVar, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(mVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, this, mVar)) {
                if (atomicReferenceFieldUpdater2.get(d) != this) {
                    break;
                }
            }
            mVar.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((kotlinx.coroutines.internal.r) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            m mVar2 = mVar;
            while (true) {
                m mVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    Object obj = atomicReferenceFieldUpdater2.get(mVar2);
                    if (obj == this) {
                        if (mVar == mVar2) {
                            return mVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, mVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != mVar) {
                                break;
                            }
                        }
                        return mVar2;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof r)) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        mVar3 = mVar2;
                        mVar2 = (m) obj;
                    } else {
                        if (mVar3 != null) {
                            break;
                        }
                        mVar2 = (m) atomicReferenceFieldUpdater.get(mVar2);
                    }
                }
                mVar2 = mVar3;
            }
        }
    }

    public final void e(m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(mVar);
            if (a.get(this) != mVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, mVar2, this)) {
                if (atomicReferenceFieldUpdater.get(mVar) != mVar2) {
                    break;
                }
            }
            if (g()) {
                mVar.d();
                return;
            }
            return;
        }
    }

    public final m f() {
        m mVar;
        Object obj = a.get(this);
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null && (mVar = rVar.a) != null) {
            return mVar;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (m) obj;
    }

    public boolean g() {
        return a.get(this) instanceof r;
    }

    public String toString() {
        return new a(this, O.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + O.a(this);
    }
}
