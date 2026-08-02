package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0007\u001a\u001f\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\n\u001a\u0015\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u000b\u001a\u001f\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u000e\u001a\u0015\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000f\u001a\u001f\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0012\u001a\u0015\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0010¢\u0006\u0004\b\u0005\u0010\u0013"}, d2 = {"T", "initial", "Lkotlinx/atomicfu/TraceBase;", "trace", "Lkotlinx/atomicfu/AtomicRef;", "atomic", "(Ljava/lang/Object;Lkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicRef;", "(Ljava/lang/Object;)Lkotlinx/atomicfu/AtomicRef;", "", "Lkotlinx/atomicfu/AtomicInt;", "(ILkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicInt;", "(I)Lkotlinx/atomicfu/AtomicInt;", "", "Lkotlinx/atomicfu/AtomicLong;", "(JLkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicLong;", "(J)Lkotlinx/atomicfu/AtomicLong;", "", "Lkotlinx/atomicfu/AtomicBoolean;", "(ZLkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicBoolean;", "(Z)Lkotlinx/atomicfu/AtomicBoolean;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AtomicFU {
    public static /* synthetic */ kotlinx.atomicfu.AtomicRef atomic$default(java.lang.Object obj, kotlinx.atomicfu.TraceBase traceBase, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            traceBase = kotlinx.atomicfu.TraceBase.None.INSTANCE;
        }
        return atomic(obj, traceBase);
    }

    public static final <T> kotlinx.atomicfu.AtomicRef<T> atomic(T t, kotlinx.atomicfu.TraceBase traceBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        return new kotlinx.atomicfu.AtomicRef<>(t, traceBase);
    }

    public static final <T> kotlinx.atomicfu.AtomicRef<T> atomic(T t) {
        return atomic(t, kotlinx.atomicfu.TraceBase.None.INSTANCE);
    }

    public static final kotlinx.atomicfu.AtomicInt atomic(int i, kotlinx.atomicfu.TraceBase traceBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        return new kotlinx.atomicfu.AtomicInt(i, traceBase);
    }

    public static final kotlinx.atomicfu.AtomicInt atomic(int i) {
        return atomic(i, (kotlinx.atomicfu.TraceBase) kotlinx.atomicfu.TraceBase.None.INSTANCE);
    }

    public static /* synthetic */ kotlinx.atomicfu.AtomicInt atomic$default(int i, kotlinx.atomicfu.TraceBase traceBase, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            traceBase = kotlinx.atomicfu.TraceBase.None.INSTANCE;
        }
        return atomic(i, traceBase);
    }

    public static final kotlinx.atomicfu.AtomicLong atomic(long j, kotlinx.atomicfu.TraceBase traceBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        return new kotlinx.atomicfu.AtomicLong(j, traceBase);
    }

    public static final kotlinx.atomicfu.AtomicLong atomic(long j) {
        return atomic(j, kotlinx.atomicfu.TraceBase.None.INSTANCE);
    }

    public static final kotlinx.atomicfu.AtomicBoolean atomic(boolean z, kotlinx.atomicfu.TraceBase traceBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        return new kotlinx.atomicfu.AtomicBoolean(z, traceBase);
    }

    public static final kotlinx.atomicfu.AtomicBoolean atomic(boolean z) {
        return atomic(z, kotlinx.atomicfu.TraceBase.None.INSTANCE);
    }

    public static /* synthetic */ kotlinx.atomicfu.AtomicLong atomic$default(long j, kotlinx.atomicfu.TraceBase traceBase, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            traceBase = kotlinx.atomicfu.TraceBase.None.INSTANCE;
        }
        return atomic(j, traceBase);
    }

    public static /* synthetic */ kotlinx.atomicfu.AtomicBoolean atomic$default(boolean z, kotlinx.atomicfu.TraceBase traceBase, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            traceBase = kotlinx.atomicfu.TraceBase.None.INSTANCE;
        }
        return atomic(z, traceBase);
    }
}
