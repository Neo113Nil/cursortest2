package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/pds/components/CardCornerRadius;", "", "Landroidx/compose/ui/graphics/Shape;", "p0", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/graphics/Shape;)V", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape$pds_release", "()Landroidx/compose/ui/graphics/Shape;", "Radius12", "Radius24"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardCornerRadius {
    public static final com.paypal.pds.components.CardCornerRadius Radius12;
    public static final com.paypal.pds.components.CardCornerRadius Radius24;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.pds.components.CardCornerRadius[] getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.graphics.Shape shape;

    private CardCornerRadius(java.lang.String str, int i, androidx.compose.ui.graphics.Shape shape) {
        this.shape = shape;
    }

    /* renamed from: getShape$pds_release, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    static {
        com.paypal.pds.components.CardCornerRadius cardCornerRadius = new com.paypal.pds.components.CardCornerRadius("Radius12", 0, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12());
        Radius12 = cardCornerRadius;
        com.paypal.pds.components.CardCornerRadius cardCornerRadius2 = new com.paypal.pds.components.CardCornerRadius("Radius24", 1, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24());
        Radius24 = cardCornerRadius2;
        com.paypal.pds.components.CardCornerRadius[] cardCornerRadiusArr = {cardCornerRadius, cardCornerRadius2};
        getHighSpeedVideoFpsRangesFor = cardCornerRadiusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardCornerRadiusArr);
    }

    public static com.paypal.pds.components.CardCornerRadius[] values() {
        return (com.paypal.pds.components.CardCornerRadius[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.pds.components.CardCornerRadius valueOf(java.lang.String str) {
        return (com.paypal.pds.components.CardCornerRadius) java.lang.Enum.valueOf(com.paypal.pds.components.CardCornerRadius.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.CardCornerRadius> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
