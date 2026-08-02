package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u001a\u001a\u00028\u00008G¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003"}, d2 = {"Lkotlinx/coroutines/internal/SegmentOrClosed;", "Lkotlinx/coroutines/internal/Segment;", "S", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "isClosed-impl", "isClosed", "getSegment-impl", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/Segment;", "getSegment$annotations", "()V", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class SegmentOrClosed<S extends kotlinx.coroutines.internal.Segment<S>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object m24121constructorimpl(java.lang.Object obj) {
        return obj;
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    private /* synthetic */ SegmentOrClosed(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m24126isClosedimpl(java.lang.Object obj) {
        return obj == kotlinx.coroutines.internal.ConcurrentLinkedListKt.Camera2StreamConfigurationMap;
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final S m24124getSegmentimpl(java.lang.Object obj) {
        if (obj == kotlinx.coroutines.internal.ConcurrentLinkedListKt.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("Does not contain segment".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (S) obj;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m24127toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m24125hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m24122equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m24127toStringimpl(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SegmentOrClosed(value=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24125hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24123equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24122equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof kotlinx.coroutines.internal.SegmentOrClosed) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((kotlinx.coroutines.internal.SegmentOrClosed) obj2).getGetHighResolutionOutputSizeshNQ4ISI());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.internal.SegmentOrClosed m24120boximpl(java.lang.Object obj) {
        return new kotlinx.coroutines.internal.SegmentOrClosed(obj);
    }
}
