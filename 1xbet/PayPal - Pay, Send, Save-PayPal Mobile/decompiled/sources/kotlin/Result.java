package kotlin;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087@\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002 !B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0004"}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getValue$annotations", "()V", "Camera2StreamConfigurationMap", "isSuccess-impl", "isSuccess", "isFailure-impl", "isFailure", "Companion", "Failure"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class Result<T> implements java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.Result.Companion INSTANCE = new kotlin.Result.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m23436constructorimpl(java.lang.Object obj) {
        return obj;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    private /* synthetic */ Result(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m23442isSuccessimpl(java.lang.Object obj) {
        return !(obj instanceof kotlin.Result.Failure);
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m23441isFailureimpl(java.lang.Object obj) {
        return obj instanceof kotlin.Result.Failure;
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final java.lang.Throwable m23439exceptionOrNullimpl(java.lang.Object obj) {
        if (obj instanceof kotlin.Result.Failure) {
            return ((kotlin.Result.Failure) obj).exception;
        }
        return null;
    }

    public final java.lang.String toString() {
        return m23443toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23443toStringimpl(java.lang.Object obj) {
        if (obj instanceof kotlin.Result.Failure) {
            return ((kotlin.Result.Failure) obj).toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Failure implements java.io.Serializable {
        public final java.lang.Throwable exception;

        public Failure(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.exception = th;
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof kotlin.Result.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.exception, ((kotlin.Result.Failure) other).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(");
            sb.append(this.exception);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m23440hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m23437equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23440hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23438equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23437equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof kotlin.Result) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((kotlin.Result) obj2).getCamera2StreamConfigurationMap());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.Result m23435boximpl(java.lang.Object obj) {
        return new kotlin.Result(obj);
    }
}
