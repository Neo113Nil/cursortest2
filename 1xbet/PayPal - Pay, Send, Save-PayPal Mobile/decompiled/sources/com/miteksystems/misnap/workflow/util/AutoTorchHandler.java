package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/AutoTorchHandler;", "", "", "a", "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "handleAutoTorch", "", com.visa.cbp.getEncExpo.warmup, "consecutiveLightningFailures", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/UserAction;", "lastKnownLightningFailure", "Landroidx/lifecycle/MutableLiveData;", "", "c", "Landroidx/lifecycle/MutableLiveData;", "_torchEvents", "Landroidx/lifecycle/LiveData;", "getTorchEvents", "()Landroidx/lifecycle/LiveData;", "torchEvents", "<init>", "()V", "Companion", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class AutoTorchHandler {
    public static final /* synthetic */ int MAX_CONSECUTIVE_LIGHTNING_FAILURES = 3;
    private final androidx.view.MutableLiveData<java.lang.Boolean> getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>();
    private com.miteksystems.misnap.core.UserAction getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public final void handleAutoTorch(java.util.List<? extends com.miteksystems.misnap.core.UserAction> warnings) {
        com.miteksystems.misnap.core.LiveDataUtil liveDataUtil;
        androidx.view.MutableLiveData<java.lang.Boolean> mutableLiveData;
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(warnings, "");
        if (warnings.contains(com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE, this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRangesFor = com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE;
            }
            int i = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = i;
            if (i < 3) {
                return;
            }
            liveDataUtil = com.miteksystems.misnap.core.LiveDataUtil.INSTANCE;
            mutableLiveData = this.getHighSpeedVideoFpsRanges;
            bool = java.lang.Boolean.FALSE;
        } else {
            if (!warnings.contains(com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE)) {
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = null;
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE, this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRangesFor = com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE;
            }
            int i2 = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = i2;
            if (i2 < 3) {
                return;
            }
            liveDataUtil = com.miteksystems.misnap.core.LiveDataUtil.INSTANCE;
            mutableLiveData = this.getHighSpeedVideoFpsRanges;
            bool = java.lang.Boolean.TRUE;
        }
        liveDataUtil.updateValue(mutableLiveData, bool);
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    public final androidx.view.LiveData<java.lang.Boolean> getTorchEvents() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
