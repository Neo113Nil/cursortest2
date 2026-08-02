package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/media/ExpectedOutputsListener;", "", "", "outputTimestamp", "", "Landroidx/camera/camera2/pipe/OutputId;", "outputIds", "", "onExpectedOutputs", "(JLjava/util/Set;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ExpectedOutputsListener {
    void onExpectedOutputs(long outputTimestamp, java.util.Set<androidx.camera.camera2.pipe.OutputId> outputIds);
}
