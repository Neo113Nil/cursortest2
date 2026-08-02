package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PreviewConstants;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PreviewConstants {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PreviewConstants INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PreviewConstants();
    private static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat("00/00/0000", "MM/dd/yyyy", com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.DOB_DEFAULT_VALIDATION_PATTERN);

    private PreviewConstants() {
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat getHighSpeedVideoFpsRangesFor() {
        return Camera2StreamConfigurationMap;
    }
}
