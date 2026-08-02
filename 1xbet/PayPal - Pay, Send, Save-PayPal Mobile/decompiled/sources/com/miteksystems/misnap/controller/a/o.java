package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/miteksystems/misnap/controller/a/o;", "Lcom/miteksystems/misnap/controller/a/b0;", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Processed$FaceIqasResult;", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Processed$FaceIqasResult;", "c", "()Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Processed$FaceIqasResult;", "faceIqasResult", "", "Lcom/miteksystems/misnap/core/UserAction;", "Ljava/util/List;", "e", "()Ljava/util/List;", "warnings", "", "", "d", "[[I", "()[[I", "faceBoundingBox", "", "Z", "()Z", "licenseExpired", "userAction", "<init>", "(Lcom/miteksystems/misnap/core/UserAction;Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Processed$FaceIqasResult;Ljava/util/List;[[IZ)V", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class o extends com.miteksystems.misnap.controller.a.b0 {
    private final java.util.List<com.miteksystems.misnap.core.UserAction> Camera2StreamConfigurationMap;
    private final com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final int[][] getHighSpeedVideoSizes;

    public final java.util.List<com.miteksystems.misnap.core.UserAction> e() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: c, reason: from getter */
    public final com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: b, reason: from getter */
    public final int[][] getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.miteksystems.misnap.core.UserAction userAction, com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult faceIqasResult, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, int[][] iArr, boolean z) {
        super(userAction, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = faceIqasResult;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoSizes = iArr;
        this.getHighSpeedVideoFpsRanges = z;
    }
}
