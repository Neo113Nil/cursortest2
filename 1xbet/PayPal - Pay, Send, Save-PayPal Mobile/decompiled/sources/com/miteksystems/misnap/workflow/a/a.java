package com.miteksystems.misnap.workflow.a;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult;", "controllerResult", "", "videoRecording", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "a", "workflow_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class a {
    public static final /* synthetic */ com.miteksystems.misnap.workflow.MiSnapFinalResult a(com.miteksystems.misnap.controller.MiSnapController.FrameResult frameResult, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameResult, "");
        if (frameResult instanceof com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis) {
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis barcodeAnalysis = (com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis) frameResult;
            return new com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession(barcodeAnalysis.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), bArr, barcodeAnalysis.getBarcode(), barcodeAnalysis.getWarnings(), barcodeAnalysis.getMisnapMibiData(), barcodeAnalysis.getLicenseExpired(), barcodeAnalysis.getRts());
        }
        if (frameResult instanceof com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis) {
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis documentAnalysis = (com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis) frameResult;
            return new com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession(documentAnalysis.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), bArr, documentAnalysis.getExtraction(), documentAnalysis.getClassification(), documentAnalysis.getCom.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE java.lang.String(), documentAnalysis.getWarnings(), documentAnalysis.getMisnapMibiData(), documentAnalysis.getLicenseExpired(), documentAnalysis.getRts());
        }
        if (!(frameResult instanceof com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis faceAnalysis = (com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis) frameResult;
        return new com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession(faceAnalysis.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), bArr, faceAnalysis.getWarnings(), faceAnalysis.getMisnapMibiData(), faceAnalysis.getLicenseExpired(), faceAnalysis.getRts(), faceAnalysis.getAiBasedRts());
    }

    public static /* synthetic */ com.miteksystems.misnap.workflow.MiSnapFinalResult a(com.miteksystems.misnap.controller.MiSnapController.FrameResult frameResult, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return a(frameResult, bArr);
    }
}
