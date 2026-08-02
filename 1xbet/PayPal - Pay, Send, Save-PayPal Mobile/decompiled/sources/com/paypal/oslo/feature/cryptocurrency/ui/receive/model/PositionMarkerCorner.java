package com.paypal.oslo.feature.cryptocurrency.ui.receive.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PositionMarkerCorner {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner BOTTOM_LEFT;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner TOP_LEFT;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner TOP_RIGHT;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private PositionMarkerCorner(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner("TOP_LEFT", 0);
        TOP_LEFT = positionMarkerCorner;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner2 = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner("TOP_RIGHT", 1);
        TOP_RIGHT = positionMarkerCorner2;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner3 = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner("BOTTOM_LEFT", 2);
        BOTTOM_LEFT = positionMarkerCorner3;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner[] positionMarkerCornerArr = {positionMarkerCorner, positionMarkerCorner2, positionMarkerCorner3};
        getHighResolutionOutputSizeshNQ4ISI = positionMarkerCornerArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(positionMarkerCornerArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
