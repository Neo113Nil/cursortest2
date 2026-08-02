package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/pds/components/ImageCornerRadius;", "", "Landroidx/compose/ui/graphics/Shape;", "p0", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/graphics/Shape;)V", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape$pds_release", "()Landroidx/compose/ui/graphics/Shape;", "Radius4", "Radius8", "Radius12", "Radius24", "Radius32", "RadiusFull", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ImageCornerRadius {
    private static final /* synthetic */ com.paypal.pds.components.ImageCornerRadius[] Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.ImageCornerRadius None;
    public static final com.paypal.pds.components.ImageCornerRadius Radius12;
    public static final com.paypal.pds.components.ImageCornerRadius Radius24;
    public static final com.paypal.pds.components.ImageCornerRadius Radius32;
    public static final com.paypal.pds.components.ImageCornerRadius Radius4;
    public static final com.paypal.pds.components.ImageCornerRadius Radius8;
    public static final com.paypal.pds.components.ImageCornerRadius RadiusFull;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.graphics.Shape shape;

    private ImageCornerRadius(java.lang.String str, int i, androidx.compose.ui.graphics.Shape shape) {
        this.shape = shape;
    }

    /* renamed from: getShape$pds_release, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    static {
        com.paypal.pds.components.ImageCornerRadius imageCornerRadius = new com.paypal.pds.components.ImageCornerRadius("Radius4", 0, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape4());
        Radius4 = imageCornerRadius;
        com.paypal.pds.components.ImageCornerRadius imageCornerRadius2 = new com.paypal.pds.components.ImageCornerRadius("Radius8", 1, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape8());
        Radius8 = imageCornerRadius2;
        com.paypal.pds.components.ImageCornerRadius imageCornerRadius3 = new com.paypal.pds.components.ImageCornerRadius("Radius12", 2, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12());
        Radius12 = imageCornerRadius3;
        com.paypal.pds.components.ImageCornerRadius imageCornerRadius4 = new com.paypal.pds.components.ImageCornerRadius("Radius24", 3, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24());
        Radius24 = imageCornerRadius4;
        com.paypal.pds.components.ImageCornerRadius imageCornerRadius5 = new com.paypal.pds.components.ImageCornerRadius("Radius32", 4, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape32());
        Radius32 = imageCornerRadius5;
        com.paypal.pds.components.ImageCornerRadius imageCornerRadius6 = new com.paypal.pds.components.ImageCornerRadius("RadiusFull", 5, com.paypal.pds.core.ConstantsKt.getRoundedCornerShapeFull());
        RadiusFull = imageCornerRadius6;
        com.paypal.pds.components.ImageCornerRadius imageCornerRadius7 = new com.paypal.pds.components.ImageCornerRadius(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 6, null);
        None = imageCornerRadius7;
        com.paypal.pds.components.ImageCornerRadius[] imageCornerRadiusArr = {imageCornerRadius, imageCornerRadius2, imageCornerRadius3, imageCornerRadius4, imageCornerRadius5, imageCornerRadius6, imageCornerRadius7};
        Camera2StreamConfigurationMap = imageCornerRadiusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(imageCornerRadiusArr);
    }

    public static com.paypal.pds.components.ImageCornerRadius[] values() {
        return (com.paypal.pds.components.ImageCornerRadius[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.pds.components.ImageCornerRadius valueOf(java.lang.String str) {
        return (com.paypal.pds.components.ImageCornerRadius) java.lang.Enum.valueOf(com.paypal.pds.components.ImageCornerRadius.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.ImageCornerRadius> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
