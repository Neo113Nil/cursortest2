package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/pds/components/HeaderContentAlignment;", "", "Landroidx/compose/ui/text/style/TextAlign;", "p0", "Landroidx/compose/ui/Alignment$Horizontal;", "p1", "<init>", "(Ljava/lang/String;IILandroidx/compose/ui/Alignment$Horizontal;)V", "textAlign", com.visa.cbp.getEncExpo.warmup, "getTextAlign-e0LSkKk$pds_release", "()I", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "getHorizontalAlignment$pds_release", "()Landroidx/compose/ui/Alignment$Horizontal;", "Left", "Center"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HeaderContentAlignment {
    public static final com.paypal.pds.components.HeaderContentAlignment Center;
    public static final com.paypal.pds.components.HeaderContentAlignment Left;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.pds.components.HeaderContentAlignment[] getHighSpeedVideoSizes;
    private final androidx.compose.ui.Alignment.Horizontal horizontalAlignment;
    private final int textAlign;

    private HeaderContentAlignment(java.lang.String str, int i, int i2, androidx.compose.ui.Alignment.Horizontal horizontal) {
        this.textAlign = i2;
        this.horizontalAlignment = horizontal;
    }

    /* renamed from: getTextAlign-e0LSkKk$pds_release, reason: not valid java name and from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: getHorizontalAlignment$pds_release, reason: from getter */
    public final androidx.compose.ui.Alignment.Horizontal getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    static {
        com.paypal.pds.components.HeaderContentAlignment headerContentAlignment = new com.paypal.pds.components.HeaderContentAlignment("Left", 0, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk(), androidx.compose.ui.Alignment.INSTANCE.getStart());
        Left = headerContentAlignment;
        com.paypal.pds.components.HeaderContentAlignment headerContentAlignment2 = new com.paypal.pds.components.HeaderContentAlignment("Center", 1, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally());
        Center = headerContentAlignment2;
        com.paypal.pds.components.HeaderContentAlignment[] headerContentAlignmentArr = {headerContentAlignment, headerContentAlignment2};
        getHighSpeedVideoSizes = headerContentAlignmentArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(headerContentAlignmentArr);
    }

    public static com.paypal.pds.components.HeaderContentAlignment[] values() {
        return (com.paypal.pds.components.HeaderContentAlignment[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.pds.components.HeaderContentAlignment valueOf(java.lang.String str) {
        return (com.paypal.pds.components.HeaderContentAlignment) java.lang.Enum.valueOf(com.paypal.pds.components.HeaderContentAlignment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.HeaderContentAlignment> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
