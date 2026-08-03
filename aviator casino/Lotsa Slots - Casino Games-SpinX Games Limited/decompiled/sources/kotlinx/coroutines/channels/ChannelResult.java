package kotlinx.coroutines.channels;

/* compiled from: Channel.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003 !\"B\u0013\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0005J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006#"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "T", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getHolder$annotations", "()V", "isSuccess", "", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isFailure", "isFailure-impl", "isClosed", "isClosed-impl", "getOrNull", "getOrNull-impl", "getOrThrow", "getOrThrow-impl", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "equals", "other", "hashCode", "", com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Closed", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ChannelResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.coroutines.channels.ChannelResult.Companion INSTANCE = new kotlinx.coroutines.channels.ChannelResult.Companion(null);
    private static final kotlinx.coroutines.channels.ChannelResult.Failed failed = new kotlinx.coroutines.channels.ChannelResult.Failed();
    private final java.lang.Object holder;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelResult m12318boximpl(java.lang.Object obj) {
        return new kotlinx.coroutines.channels.ChannelResult(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m12319constructorimpl(java.lang.Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12320equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof kotlinx.coroutines.channels.ChannelResult) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((kotlinx.coroutines.channels.ChannelResult) obj2).getHolder());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12321equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12325hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(java.lang.Object other) {
        return m12320equalsimpl(this.holder, other);
    }

    public int hashCode() {
        return m12325hashCodeimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getHolder() {
        return this.holder;
    }

    private /* synthetic */ ChannelResult(java.lang.Object obj) {
        this.holder = obj;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m12328isSuccessimpl(java.lang.Object obj) {
        return !(obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed);
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m12327isFailureimpl(java.lang.Object obj) {
        return obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed;
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m12326isClosedimpl(java.lang.Object obj) {
        return obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m12323getOrNullimpl(java.lang.Object obj) {
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m12324getOrThrowimpl(java.lang.Object obj) {
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
    public static final java.lang.Throwable m12322exceptionOrNullimpl(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelResult.Closed closed = obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed ? (kotlinx.coroutines.channels.ChannelResult.Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    /* compiled from: Channel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "<init>", "()V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Failed {
        public java.lang.String toString() {
            return com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED;
        }
    }

    /* compiled from: Channel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Closed extends kotlinx.coroutines.channels.ChannelResult.Failed {
        public final java.lang.Throwable cause;

        public Closed(java.lang.Throwable th) {
            this.cause = th;
        }

        public boolean equals(java.lang.Object other) {
            return (other instanceof kotlinx.coroutines.channels.ChannelResult.Closed) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((kotlinx.coroutines.channels.ChannelResult.Closed) other).cause);
        }

        public int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public java.lang.String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* compiled from: Channel.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u0002H\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "<init>", "()V", com.ironsource.X3.i.t, "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "success", "Lkotlinx/coroutines/channels/ChannelResult;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "value", "success-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE, "failure-PtdJZtk", "()Ljava/lang/Object;", "closed", "cause", "", "closed-JP2dKIU", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m12333successJP2dKIU(E value) {
            return kotlinx.coroutines.channels.ChannelResult.m12319constructorimpl(value);
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> java.lang.Object m12332failurePtdJZtk() {
            return kotlinx.coroutines.channels.ChannelResult.m12319constructorimpl(kotlinx.coroutines.channels.ChannelResult.failed);
        }

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m12331closedJP2dKIU(java.lang.Throwable cause) {
            return kotlinx.coroutines.channels.ChannelResult.m12319constructorimpl(new kotlinx.coroutines.channels.ChannelResult.Closed(cause));
        }
    }

    public java.lang.String toString() {
        return m12329toStringimpl(this.holder);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m12329toStringimpl(java.lang.Object obj) {
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            return ((kotlinx.coroutines.channels.ChannelResult.Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
