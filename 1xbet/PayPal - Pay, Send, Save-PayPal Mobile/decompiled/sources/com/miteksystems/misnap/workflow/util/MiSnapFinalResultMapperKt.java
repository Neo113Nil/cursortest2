package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "toServerResult", "Lcom/miteksystems/misnap/nfc/MiSnapNfcReader$ChipData$AuthenticationData;", "chipData", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "a", "Lcom/miteksystems/misnap/nfc/MiSnapNfcReader$ChipData$AuthenticationData$ActiveAuthInfo;", "activeAuthInfo", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;", "workflow_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class MiSnapFinalResultMapperKt {
    private static final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData getHighResolutionOutputSizeshNQ4ISI(com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData.AuthenticationData authenticationData) {
        java.lang.String sod = authenticationData.getSod();
        java.lang.String com2 = authenticationData.getCom();
        java.lang.String dataFormat = authenticationData.getDataFormat();
        java.util.Map dataGroups = authenticationData.getDataGroups();
        com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData.AuthenticationData.ActiveAuthInfo activeAuthInfo = authenticationData.getActiveAuthInfo();
        return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData(sod, com2, dataFormat, dataGroups, activeAuthInfo != null ? new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo(activeAuthInfo.getKey(), activeAuthInfo.getSignature(), activeAuthInfo.getChallenge()) : null, authenticationData.getChipAuthInfo());
    }

    public static final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult toServerResult(com.miteksystems.misnap.workflow.MiSnapFinalResult miSnapFinalResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapFinalResult, "");
        if (miSnapFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession) {
            com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession barcodeSession = (com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession) miSnapFinalResult;
            return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult(barcodeSession.getJpegImage(), barcodeSession.getCom.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE java.lang.String(), barcodeSession.getRts());
        }
        if (miSnapFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession) {
            com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession documentSession = (com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession) miSnapFinalResult;
            return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult(documentSession.getJpegImage(), documentSession.getCom.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE java.lang.String(), documentSession.getRts());
        }
        if (miSnapFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession) {
            com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession faceSession = (com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession) miSnapFinalResult;
            return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.FaceResult(faceSession.getJpegImage(), faceSession.getRts(), faceSession.getAIBasedRts());
        }
        if (!(miSnapFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession)) {
            if (!(miSnapFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession voiceSession = (com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession) miSnapFinalResult;
            return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.VoiceResult(voiceSession.getVoiceSamples(), voiceSession.getRts());
        }
        com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession nfcSession = (com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession) miSnapFinalResult;
        com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData nfcData = nfcSession.getNfcData();
        if (nfcData instanceof com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData.Icao) {
            return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao(nfcSession.getNfcData().getPhoto(), getHighResolutionOutputSizeshNQ4ISI(nfcSession.getNfcData().getAuthenticationData()), nfcSession.getMisnapMibiData().getMibiData());
        }
        if (nfcData instanceof com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData.EuDl) {
            return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl(nfcSession.getNfcData().getPhoto(), getHighResolutionOutputSizeshNQ4ISI(nfcSession.getNfcData().getAuthenticationData()), nfcSession.getMisnapMibiData().getMibiData());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
