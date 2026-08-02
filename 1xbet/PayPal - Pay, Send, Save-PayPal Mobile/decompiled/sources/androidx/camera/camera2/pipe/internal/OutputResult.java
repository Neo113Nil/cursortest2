package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081@\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001 J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001c\u001a\u0004\u0018\u00018\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001f\u001a\u00020\u001d8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\n\u0088\u0001!\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputResult;", "T", "", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "getAvailable-impl", "(Ljava/lang/Object;)Z", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "getFailure-impl", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "getOutput-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOutput$annotations", "()V", "output", "Landroidx/camera/camera2/pipe/OutputStatus;", "getStatus-U7r42EA", "status", "Companion", "result"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class OutputResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.internal.OutputResult.Companion INSTANCE = new androidx.camera.camera2.pipe.internal.OutputResult.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: access$constructor-impl, reason: not valid java name */
    public static final /* synthetic */ java.lang.Object m979access$constructorimpl(java.lang.Object obj) {
        return obj;
    }

    public static /* synthetic */ void getOutput$annotations() {
    }

    private /* synthetic */ OutputResult(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
    }

    /* renamed from: getAvailable-impl, reason: not valid java name */
    public static final boolean m983getAvailableimpl(java.lang.Object obj) {
        return (m984getFailureimpl(obj) || obj == null) ? false : true;
    }

    /* renamed from: getFailure-impl, reason: not valid java name */
    public static final boolean m984getFailureimpl(java.lang.Object obj) {
        return obj instanceof androidx.camera.camera2.pipe.OutputStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOutput-impl, reason: not valid java name */
    public static final T m985getOutputimpl(java.lang.Object obj) {
        if (m983getAvailableimpl(obj)) {
            return obj;
        }
        return null;
    }

    /* renamed from: getStatus-U7r42EA, reason: not valid java name */
    public static final int m986getStatusU7r42EA(java.lang.Object obj) {
        if (m983getAvailableimpl(obj)) {
            return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA();
        }
        if (obj == null) {
            return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
        }
        return ((androidx.camera.camera2.pipe.OutputStatus) obj).m549unboximpl();
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u000f2\u0006\u0010\u0005\u001a\u00028\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u000f2\u0006\u0010\u0013\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\n\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001b\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0017H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputResult$Companion;", "", "<init>", "()V", "T", "output", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "from-EASlEvA", "(Ljava/lang/Object;)Ljava/lang/Object;", "from", "Landroidx/camera/camera2/pipe/OutputStatus;", "failureReason", "failure-SpuARzU", "(I)Ljava/lang/Object;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "Lkotlinx/coroutines/CompletableDeferred;", "", "completeWithOutput", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "status", "completeWithFailure-zfbXvnA", "(Lkotlinx/coroutines/CompletableDeferred;I)Z", "completeWithFailure", "Lkotlinx/coroutines/Deferred;", "outputStatus-NkQ9T_M", "(Lkotlinx/coroutines/Deferred;)I", "outputStatus", "outputOrNull", "(Lkotlinx/coroutines/Deferred;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: from-EASlEvA, reason: not valid java name */
        public final <T> java.lang.Object m992fromEASlEvA(T output) {
            return androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(output);
        }

        /* renamed from: failure-SpuARzU, reason: not valid java name */
        public final <T> java.lang.Object m991failureSpuARzU(int failureReason) {
            return androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(failureReason));
        }

        /* renamed from: outputStatus-NkQ9T_M, reason: not valid java name */
        public final <T> int m993outputStatusNkQ9T_M(kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.internal.OutputResult<? extends T>> deferred) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferred, "");
            if (!deferred.isCompleted()) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m555getPENDINGU7r42EA();
            }
            if (deferred.isCancelled()) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
            }
            java.lang.Object getHighSpeedVideoSizes = deferred.getCompleted().getGetHighSpeedVideoSizes();
            if (androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA();
            }
            if (getHighSpeedVideoSizes == null) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
            }
            return ((androidx.camera.camera2.pipe.OutputStatus) getHighSpeedVideoSizes).m549unboximpl();
        }

        public final <T> T outputOrNull(kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.internal.OutputResult<? extends T>> deferred) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferred, "");
            if (!deferred.isCompleted() || deferred.isCancelled()) {
                return null;
            }
            T t = (T) deferred.getCompleted().getGetHighSpeedVideoSizes();
            if (androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(t)) {
                return t;
            }
            return null;
        }

        public final <T> boolean completeWithOutput(kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<T>> completableDeferred, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completableDeferred, "");
            return completableDeferred.complete(androidx.camera.camera2.pipe.internal.OutputResult.m980boximpl(androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(t)));
        }

        /* renamed from: completeWithFailure-zfbXvnA, reason: not valid java name */
        public final <T> boolean m990completeWithFailurezfbXvnA(kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<T>> completableDeferred, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completableDeferred, "");
            return completableDeferred.complete(androidx.camera.camera2.pipe.internal.OutputResult.m980boximpl(androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(i))));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m988toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m987hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object obj) {
        return m981equalsimpl(this.getHighSpeedVideoSizes, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m988toStringimpl(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputResult(result=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m987hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m982equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m981equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof androidx.camera.camera2.pipe.internal.OutputResult) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((androidx.camera.camera2.pipe.internal.OutputResult) obj2).getGetHighSpeedVideoSizes());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.internal.OutputResult m980boximpl(java.lang.Object obj) {
        return new androidx.camera.camera2.pipe.internal.OutputResult(obj);
    }
}
