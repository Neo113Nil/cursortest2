package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/pds/components/PaymentCardCornerRadius;", "", "Landroidx/compose/ui/graphics/Shape;", "p0", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/graphics/Shape;)V", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape$pds_release", "()Landroidx/compose/ui/graphics/Shape;", "Radius4", "Radius8", "Radius12", "Radius24", "Radius32"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentCardCornerRadius {
    private static final /* synthetic */ com.paypal.pds.components.PaymentCardCornerRadius[] Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.PaymentCardCornerRadius Radius12;
    public static final com.paypal.pds.components.PaymentCardCornerRadius Radius24;
    public static final com.paypal.pds.components.PaymentCardCornerRadius Radius32;
    public static final com.paypal.pds.components.PaymentCardCornerRadius Radius4;
    public static final com.paypal.pds.components.PaymentCardCornerRadius Radius8;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.graphics.Shape shape;

    private PaymentCardCornerRadius(java.lang.String str, int i, androidx.compose.ui.graphics.Shape shape) {
        this.shape = shape;
    }

    /* renamed from: getShape$pds_release, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    static {
        com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius = new com.paypal.pds.components.PaymentCardCornerRadius("Radius4", 0, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape4());
        Radius4 = paymentCardCornerRadius;
        com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius2 = new com.paypal.pds.components.PaymentCardCornerRadius("Radius8", 1, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape8());
        Radius8 = paymentCardCornerRadius2;
        com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius3 = new com.paypal.pds.components.PaymentCardCornerRadius("Radius12", 2, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12());
        Radius12 = paymentCardCornerRadius3;
        com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius4 = new com.paypal.pds.components.PaymentCardCornerRadius("Radius24", 3, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24());
        Radius24 = paymentCardCornerRadius4;
        com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius5 = new com.paypal.pds.components.PaymentCardCornerRadius("Radius32", 4, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape32());
        Radius32 = paymentCardCornerRadius5;
        com.paypal.pds.components.PaymentCardCornerRadius[] paymentCardCornerRadiusArr = {paymentCardCornerRadius, paymentCardCornerRadius2, paymentCardCornerRadius3, paymentCardCornerRadius4, paymentCardCornerRadius5};
        Camera2StreamConfigurationMap = paymentCardCornerRadiusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentCardCornerRadiusArr);
    }

    public static com.paypal.pds.components.PaymentCardCornerRadius[] values() {
        return (com.paypal.pds.components.PaymentCardCornerRadius[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.pds.components.PaymentCardCornerRadius valueOf(java.lang.String str) {
        return (com.paypal.pds.components.PaymentCardCornerRadius) java.lang.Enum.valueOf(com.paypal.pds.components.PaymentCardCornerRadius.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.PaymentCardCornerRadius> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
