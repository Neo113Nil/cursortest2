package org.betup.ui.fragment.shop.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopHtmlLabels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopHtmlLabels;", "", "videoTitle", "", "videoSubtitle", "videoQuotaLabel", "videoLoading", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getVideoTitle", "()Ljava/lang/String;", "getVideoSubtitle", "getVideoQuotaLabel", "getVideoLoading", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopHtmlLabels {
    public static final int $stable = 0;
    private final boolean videoLoading;
    private final String videoQuotaLabel;
    private final String videoSubtitle;
    private final String videoTitle;

    public ShopHtmlLabels() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ ShopHtmlLabels copy$default(ShopHtmlLabels shopHtmlLabels, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopHtmlLabels.videoTitle;
        }
        if ((i & 2) != 0) {
            str2 = shopHtmlLabels.videoSubtitle;
        }
        if ((i & 4) != 0) {
            str3 = shopHtmlLabels.videoQuotaLabel;
        }
        if ((i & 8) != 0) {
            z = shopHtmlLabels.videoLoading;
        }
        return shopHtmlLabels.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVideoTitle() {
        return this.videoTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVideoSubtitle() {
        return this.videoSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVideoQuotaLabel() {
        return this.videoQuotaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getVideoLoading() {
        return this.videoLoading;
    }

    public final ShopHtmlLabels copy(String videoTitle, String videoSubtitle, String videoQuotaLabel, boolean videoLoading) {
        Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
        Intrinsics.checkNotNullParameter(videoSubtitle, "videoSubtitle");
        Intrinsics.checkNotNullParameter(videoQuotaLabel, "videoQuotaLabel");
        return new ShopHtmlLabels(videoTitle, videoSubtitle, videoQuotaLabel, videoLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopHtmlLabels)) {
            return false;
        }
        ShopHtmlLabels shopHtmlLabels = (ShopHtmlLabels) other;
        return Intrinsics.areEqual(this.videoTitle, shopHtmlLabels.videoTitle) && Intrinsics.areEqual(this.videoSubtitle, shopHtmlLabels.videoSubtitle) && Intrinsics.areEqual(this.videoQuotaLabel, shopHtmlLabels.videoQuotaLabel) && this.videoLoading == shopHtmlLabels.videoLoading;
    }

    public int hashCode() {
        return (((((this.videoTitle.hashCode() * 31) + this.videoSubtitle.hashCode()) * 31) + this.videoQuotaLabel.hashCode()) * 31) + Boolean.hashCode(this.videoLoading);
    }

    public String toString() {
        return "ShopHtmlLabels(videoTitle=" + this.videoTitle + ", videoSubtitle=" + this.videoSubtitle + ", videoQuotaLabel=" + this.videoQuotaLabel + ", videoLoading=" + this.videoLoading + ")";
    }

    public ShopHtmlLabels(String videoTitle, String videoSubtitle, String videoQuotaLabel, boolean z) {
        Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
        Intrinsics.checkNotNullParameter(videoSubtitle, "videoSubtitle");
        Intrinsics.checkNotNullParameter(videoQuotaLabel, "videoQuotaLabel");
        this.videoTitle = videoTitle;
        this.videoSubtitle = videoSubtitle;
        this.videoQuotaLabel = videoQuotaLabel;
        this.videoLoading = z;
    }

    public /* synthetic */ ShopHtmlLabels(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }

    public final String getVideoTitle() {
        return this.videoTitle;
    }

    public final String getVideoSubtitle() {
        return this.videoSubtitle;
    }

    public final String getVideoQuotaLabel() {
        return this.videoQuotaLabel;
    }

    public final boolean getVideoLoading() {
        return this.videoLoading;
    }
}
