package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\fJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000eJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0014\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e"}, d2 = {"Lkotlinx/atomicfu/TraceImpl;", "Lkotlinx/atomicfu/TraceBase;", "", "p0", "Lkotlinx/atomicfu/TraceFormat;", "p1", "<init>", "(ILkotlinx/atomicfu/TraceFormat;)V", "", "", "append", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/TraceFormat;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "", "[Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TraceImpl extends kotlinx.atomicfu.TraceBase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.TraceFormat getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object[] Camera2StreamConfigurationMap;

    public TraceImpl(int i, kotlinx.atomicfu.TraceFormat traceFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceFormat, "");
        this.getHighSpeedVideoFpsRangesFor = traceFormat;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int highestOneBit = java.lang.Integer.highestOneBit((i << 1) - 1);
        this.getHighSpeedVideoFpsRanges = highestOneBit;
        this.getHighSpeedVideoSizes = highestOneBit - 1;
        this.Camera2StreamConfigurationMap = new java.lang.Object[highestOneBit];
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI.getAndIncrement() & this.getHighSpeedVideoSizes] = p0;
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0, java.lang.Object p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        int andAdd = this.getHighResolutionOutputSizeshNQ4ISI.getAndAdd(2);
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoSizes;
        objArr[andAdd & i] = p0;
        objArr[(andAdd + 1) & i] = p1;
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        int andAdd = this.getHighResolutionOutputSizeshNQ4ISI.getAndAdd(3);
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoSizes;
        objArr[andAdd & i] = p0;
        objArr[(andAdd + 1) & i] = p1;
        objArr[(andAdd + 2) & i] = p2;
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        int andAdd = this.getHighResolutionOutputSizeshNQ4ISI.getAndAdd(4);
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoSizes;
        objArr[andAdd & i] = p0;
        objArr[(andAdd + 1) & i] = p1;
        objArr[(andAdd + 2) & i] = p2;
        objArr[(andAdd + 3) & i] = p3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.getHighResolutionOutputSizeshNQ4ISI.get();
        int i2 = this.getHighSpeedVideoSizes & i;
        int i3 = this.getHighSpeedVideoFpsRanges;
        int i4 = 0;
        int i5 = i > i3 ? i - i3 : 0;
        int i6 = i2;
        do {
            java.lang.Object obj = this.Camera2StreamConfigurationMap[i6];
            if (obj != null) {
                if (i4 > 0) {
                    sb.append('\n');
                }
                sb.append(this.getHighSpeedVideoFpsRangesFor.format(i5, obj));
                i5++;
                i4++;
            }
            i6 = (i6 + 1) & this.getHighSpeedVideoSizes;
        } while (i6 != i2);
        return sb.toString();
    }
}
