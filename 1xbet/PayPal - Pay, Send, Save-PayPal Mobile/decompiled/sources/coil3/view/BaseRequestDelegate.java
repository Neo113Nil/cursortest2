package coil3.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcoil3/request/BaseRequestDelegate;", "Lcoil3/request/RequestDelegate;", "Lkotlinx/coroutines/Job;", "job", "constructor-impl", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "", "dispose-impl", "(Lkotlinx/coroutines/Job;)V", "dispose", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes7.dex */
public final class BaseRequestDelegate implements coil3.view.RequestDelegate {
    private final kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static kotlinx.coroutines.Job m9793constructorimpl(kotlinx.coroutines.Job job) {
        return job;
    }

    private /* synthetic */ BaseRequestDelegate(kotlinx.coroutines.Job job) {
        this.Camera2StreamConfigurationMap = job;
    }

    @Override // coil3.view.RequestDelegate
    public final void dispose() {
        m9794disposeimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: dispose-impl, reason: not valid java name */
    public static void m9794disposeimpl(kotlinx.coroutines.Job job) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ kotlinx.coroutines.Job getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return m9798toStringimpl(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return m9797hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m9795equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9798toStringimpl(kotlinx.coroutines.Job job) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseRequestDelegate(job=");
        sb.append(job);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9797hashCodeimpl(kotlinx.coroutines.Job job) {
        return job.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9796equalsimpl0(kotlinx.coroutines.Job job, kotlinx.coroutines.Job job2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(job, job2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9795equalsimpl(kotlinx.coroutines.Job job, java.lang.Object obj) {
        return (obj instanceof coil3.view.BaseRequestDelegate) && kotlin.jvm.internal.Intrinsics.areEqual(job, ((coil3.view.BaseRequestDelegate) obj).getCamera2StreamConfigurationMap());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ coil3.view.BaseRequestDelegate m9792boximpl(kotlinx.coroutines.Job job) {
        return new coil3.view.BaseRequestDelegate(job);
    }
}
