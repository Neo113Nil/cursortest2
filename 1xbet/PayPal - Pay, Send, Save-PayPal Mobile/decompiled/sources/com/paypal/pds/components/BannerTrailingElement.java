package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/pds/components/BannerTrailingElement;", "", "", "p0", "Lcom/paypal/pds/core/Icon;", "p1", "", "p2", "<init>", "(Ljava/lang/String;IZLcom/paypal/pds/core/Icon;Ljava/lang/String;)V", "enable", "Z", "getEnable$pds_release", "()Z", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon$pds_release", "()Lcom/paypal/pds/core/Icon;", "testTag", "Ljava/lang/String;", "getTestTag$pds_release", "()Ljava/lang/String;", "Chevron", com.knotapi.knot.utilities.Constants.META_CLOSE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BannerTrailingElement {
    private static final /* synthetic */ com.paypal.pds.components.BannerTrailingElement[] Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.BannerTrailingElement Chevron;
    public static final com.paypal.pds.components.BannerTrailingElement Close;
    public static final com.paypal.pds.components.BannerTrailingElement None;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final boolean enable;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String testTag;

    private BannerTrailingElement(java.lang.String str, int i, boolean z, com.paypal.pds.core.Icon icon, java.lang.String str2) {
        this.enable = z;
        this.icon = icon;
        this.testTag = str2;
    }

    /* renamed from: getEnable$pds_release, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* synthetic */ BannerTrailingElement(java.lang.String str, int i, boolean z, com.paypal.pds.core.Icon.XMark xMark, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? com.paypal.pds.core.Icon.XMark.INSTANCE : xMark, str2);
    }

    /* renamed from: getIcon$pds_release, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: getTestTag$pds_release, reason: from getter */
    public final java.lang.String getTestTag() {
        return this.testTag;
    }

    static {
        com.paypal.pds.components.BannerTrailingElement bannerTrailingElement = new com.paypal.pds.components.BannerTrailingElement("Chevron", 0, false, com.paypal.pds.core.Icon.ChevronRight.INSTANCE, "BannerTrailingElement.Chevron");
        Chevron = bannerTrailingElement;
        com.paypal.pds.components.BannerTrailingElement bannerTrailingElement2 = new com.paypal.pds.components.BannerTrailingElement(com.knotapi.knot.utilities.Constants.META_CLOSE, 1, false, null, "BannerTrailingElement.Close", 3, null);
        Close = bannerTrailingElement2;
        com.paypal.pds.components.BannerTrailingElement bannerTrailingElement3 = new com.paypal.pds.components.BannerTrailingElement(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 2, false, null, "BannerTrailingElement.None", 3, null);
        None = bannerTrailingElement3;
        com.paypal.pds.components.BannerTrailingElement[] bannerTrailingElementArr = {bannerTrailingElement, bannerTrailingElement2, bannerTrailingElement3};
        Camera2StreamConfigurationMap = bannerTrailingElementArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(bannerTrailingElementArr);
    }

    public static com.paypal.pds.components.BannerTrailingElement[] values() {
        return (com.paypal.pds.components.BannerTrailingElement[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.pds.components.BannerTrailingElement valueOf(java.lang.String str) {
        return (com.paypal.pds.components.BannerTrailingElement) java.lang.Enum.valueOf(com.paypal.pds.components.BannerTrailingElement.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.BannerTrailingElement> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
