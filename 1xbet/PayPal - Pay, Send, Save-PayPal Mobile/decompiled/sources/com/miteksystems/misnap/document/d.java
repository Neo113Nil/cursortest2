package com.miteksystems.misnap.document;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class d {
    public static final /* synthetic */ com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentIqasResult a(com.miteksystems.misnap.document.internal.CoreFlowIqaResults coreFlowIqaResults) {
        return new com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentIqasResult(coreFlowIqaResults.getBrightness(), coreFlowIqaResults.getSharpness(), coreFlowIqaResults.getFourCornerConfidence(), coreFlowIqaResults.getSkewAngle(), coreFlowIqaResults.getRotationAngle(), coreFlowIqaResults.getHorizontalFill(), coreFlowIqaResults.getPadding(), coreFlowIqaResults.getNoGlareConfidence(), coreFlowIqaResults.getSolidBackgroundConfidence(), coreFlowIqaResults.getContrastConfidence(), coreFlowIqaResults.getMrzConfidence(), coreFlowIqaResults.getFourCorners(), coreFlowIqaResults.getDocumentBoundingBox(), coreFlowIqaResults.getGlareBoundingBox());
    }
}
