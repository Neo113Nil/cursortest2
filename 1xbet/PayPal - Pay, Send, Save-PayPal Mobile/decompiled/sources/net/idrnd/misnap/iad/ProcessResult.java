package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessResult;", "", "FrameProcessed", "Lnet/idrnd/misnap/iad/ProcessResult$FrameProcessed;"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public abstract class ProcessResult {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lnet/idrnd/misnap/iad/ProcessResult$FrameProcessed;", "Lnet/idrnd/misnap/iad/ProcessResult;", "Lnet/idrnd/misnap/iad/ReadyToCapture;", "readyToCapture", "<init>", "(Lnet/idrnd/misnap/iad/ReadyToCapture;)V", "a", "Lnet/idrnd/misnap/iad/ReadyToCapture;", "getReadyToCapture", "()Lnet/idrnd/misnap/iad/ReadyToCapture;"}, k = 1, mv = {1, 9, 0})
    public static final class FrameProcessed extends net.idrnd.misnap.iad.ProcessResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final net.idrnd.misnap.iad.ReadyToCapture readyToCapture;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrameProcessed(net.idrnd.misnap.iad.ReadyToCapture readyToCapture) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyToCapture, "");
            this.readyToCapture = readyToCapture;
        }

        public final net.idrnd.misnap.iad.ReadyToCapture getReadyToCapture() {
            return this.readyToCapture;
        }
    }

    public /* synthetic */ ProcessResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ProcessResult() {
    }
}
