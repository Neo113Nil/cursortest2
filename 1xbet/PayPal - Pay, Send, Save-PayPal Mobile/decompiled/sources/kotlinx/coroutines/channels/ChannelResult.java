package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087@\u0018\u0000 $*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003%&$B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010!\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0011\u0010#\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "T", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrNull-impl", "getOrNull", "getOrThrow-impl", "getOrThrow", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHolder$annotations", "()V", "getHighSpeedVideoFpsRanges", "isSuccess-impl", "isSuccess", "isFailure-impl", "isFailure", "isClosed-impl", "isClosed", "Companion", "Failed", "Closed"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class ChannelResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.coroutines.channels.ChannelResult.Companion INSTANCE = new kotlinx.coroutines.channels.ChannelResult.Companion(null);
    private static final kotlinx.coroutines.channels.ChannelResult.Failed getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.channels.ChannelResult.Failed();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m24080constructorimpl(java.lang.Object obj) {
        return obj;
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    private /* synthetic */ ChannelResult(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m24089isSuccessimpl(java.lang.Object obj) {
        return !(obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed);
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m24088isFailureimpl(java.lang.Object obj) {
        return obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed;
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m24087isClosedimpl(java.lang.Object obj) {
        return obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m24084getOrNullimpl(java.lang.Object obj) {
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m24085getOrThrowimpl(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed)) {
            return obj;
        }
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            kotlinx.coroutines.channels.ChannelResult.Closed closed = (kotlinx.coroutines.channels.ChannelResult.Closed) obj;
            if (closed.cause == null) {
                throw new java.lang.IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause".toString());
            }
            throw closed.cause;
        }
        throw new java.lang.IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel".toString());
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final java.lang.Throwable m24083exceptionOrNullimpl(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelResult.Closed closed = obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed ? (kotlinx.coroutines.channels.ChannelResult.Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Failed {
        public java.lang.String toString() {
            return "Failed";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Closed extends kotlinx.coroutines.channels.ChannelResult.Failed {
        public final java.lang.Throwable cause;

        public Closed(java.lang.Throwable th) {
            this.cause = th;
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof kotlinx.coroutines.channels.ChannelResult.Closed) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((kotlinx.coroutines.channels.ChannelResult.Closed) other).cause);
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Closed(");
            sb.append(this.cause);
            sb.append(')');
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0004¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "<init>", "()V", "E", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/coroutines/channels/ChannelResult;", "success-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "success", "failure-PtdJZtk", "()Ljava/lang/Object;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "", "cause", "closed-JP2dKIU", "(Ljava/lang/Throwable;)Ljava/lang/Object;", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m24094successJP2dKIU(E value) {
            return kotlinx.coroutines.channels.ChannelResult.m24080constructorimpl(value);
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> java.lang.Object m24093failurePtdJZtk() {
            return kotlinx.coroutines.channels.ChannelResult.m24080constructorimpl(kotlinx.coroutines.channels.ChannelResult.getHighResolutionOutputSizeshNQ4ISI);
        }

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m24092closedJP2dKIU(java.lang.Throwable cause) {
            return kotlinx.coroutines.channels.ChannelResult.m24080constructorimpl(new kotlinx.coroutines.channels.ChannelResult.Closed(cause));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m24090toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m24090toStringimpl(java.lang.Object obj) {
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            return ((kotlinx.coroutines.channels.ChannelResult.Closed) obj).toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return m24086hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m24081equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24086hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24082equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24081equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof kotlinx.coroutines.channels.ChannelResult) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((kotlinx.coroutines.channels.ChannelResult) obj2).getGetHighSpeedVideoFpsRanges());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelResult m24079boximpl(java.lang.Object obj) {
        return new kotlinx.coroutines.channels.ChannelResult(obj);
    }
}
