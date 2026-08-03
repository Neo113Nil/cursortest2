package kotlinx.coroutines.internal;

/* compiled from: ConcurrentLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u00020\u000526\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u0002H\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u00020\r\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0002H\u0080\b\u001as\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u0002H\u000228\b\b\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u0002H\u00020\u0007H\u0080\b\u001a!\u0010\u0012\u001a\u0002H\u0013\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\u0002H\u0013H\u0000¢\u0006\u0002\u0010\u0015\u001a8\u0010\u0016\u001a\u00020\r*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\r0\u001bH\u0082\b\"\u000e\u0010\u001d\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"findSegmentInternal", "Lkotlinx/coroutines/internal/SegmentOrClosed;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/internal/Segment;", "id", "", "createNewSegment", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "moveForward", "", "Lkotlinx/atomicfu/AtomicRef;", "to", "findSegmentAndMoveForward", "startFrom", "close", "N", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "addConditionally", "Lkotlinx/atomicfu/AtomicInt;", "delta", "", "condition", "Lkotlin/Function1;", "cur", "POINTERS_SHIFT", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConcurrentLinkedListKt {
    private static final kotlinx.coroutines.internal.Symbol CLOSED = new kotlinx.coroutines.internal.Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    public static final <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentInternal(S s, long j, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.id >= j && !s.isRemoved()) {
                return kotlinx.coroutines.internal.SegmentOrClosed.m12373constructorimpl(s);
            }
            java.lang.Object nextOrClosed = s.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return kotlinx.coroutines.internal.SegmentOrClosed.m12373constructorimpl(CLOSED);
            }
            S s2 = (S) ((kotlinx.coroutines.internal.ConcurrentLinkedListNode) nextOrClosed);
            if (s2 == null) {
                s2 = function2.invoke(java.lang.Long.valueOf(s.id + 1), s);
                if (s.trySetNext(s2)) {
                    if (s.isRemoved()) {
                        s.remove();
                    }
                }
            }
            s = s2;
        }
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> boolean moveForward$atomicfu$ATOMIC_ARRAY$Any(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, S s) {
        while (true) {
            kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceArray.get(i);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, segment, s)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> boolean moveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, S s) {
        while (true) {
            kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, segment, s)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> boolean moveForward$atomicfu$BOXED_ATOMIC$Any(java.util.concurrent.atomic.AtomicReference atomicReference, S s) {
        while (true) {
            kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReference.get();
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, segment, s)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentAndMoveForward$atomicfu$ATOMIC_ARRAY$Any(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, long j, S s, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> function2) {
        java.lang.Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(s, j, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceArray.get(i);
                    if (segment.id >= m12376getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, segment, m12376getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m12376getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentAndMoveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, long j, S s, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> function2) {
        java.lang.Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(s, j, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(obj);
                    if (segment.id >= m12376getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, segment, m12376getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m12376getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentAndMoveForward$atomicfu$BOXED_ATOMIC$Any(java.util.concurrent.atomic.AtomicReference atomicReference, long j, S s, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> function2) {
        java.lang.Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(s, j, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReference.get();
                    if (segment.id >= m12376getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, segment, m12376getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m12376getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_ARRAY$Int(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!function1.invoke(java.lang.Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_FIELD_UPDATER$Int(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, java.lang.Object obj, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!function1.invoke(java.lang.Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$BOXED_ATOMIC$Int(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        int i2;
        do {
            i2 = atomicInteger.get();
            if (!function1.invoke(java.lang.Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + i));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> N close(N n) {
        while (true) {
            java.lang.Object nextOrClosed = n.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n;
            }
            ?? r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) nextOrClosed;
            if (r0 != 0) {
                n = r0;
            } else if (n.markAsClosed()) {
                return n;
            }
        }
    }
}
