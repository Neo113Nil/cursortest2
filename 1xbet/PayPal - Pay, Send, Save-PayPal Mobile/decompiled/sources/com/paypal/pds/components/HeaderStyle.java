package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lcom/paypal/pds/components/HeaderStyle;", "", "<init>", "()V", "Lcom/paypal/pds/components/LabelInfo;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/pds/components/LabelInfo;", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/pds/components/LabelInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class HeaderStyle {
    public static final com.paypal.pds.components.HeaderStyle INSTANCE = new com.paypal.pds.components.HeaderStyle();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final com.paypal.pds.components.LabelInfo getHighResolutionOutputSizeshNQ4ISI = new com.paypal.pds.components.LabelInfo(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final com.paypal.pds.components.LabelInfo getHighSpeedVideoFpsRanges = new com.paypal.pds.components.LabelInfo(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Typography.BodyLarge.INSTANCE);

    private HeaderStyle() {
    }

    public static com.paypal.pds.components.LabelInfo getHighSpeedVideoFpsRangesFor() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.pds.components.LabelInfo getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRanges;
    }
}
