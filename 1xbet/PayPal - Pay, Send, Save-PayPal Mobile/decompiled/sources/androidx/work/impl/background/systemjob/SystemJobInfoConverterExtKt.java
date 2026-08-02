package androidx.work.impl.background.systemjob;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/app/job/JobInfo$Builder;", "builder", "Landroid/net/NetworkRequest;", "networkRequest", "", "setRequiredNetworkRequest", "(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemJobInfoConverterExtKt {
    public static final void setRequiredNetworkRequest(android.app.job.JobInfo.Builder builder, android.net.NetworkRequest networkRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setRequiredNetwork(networkRequest);
    }
}
