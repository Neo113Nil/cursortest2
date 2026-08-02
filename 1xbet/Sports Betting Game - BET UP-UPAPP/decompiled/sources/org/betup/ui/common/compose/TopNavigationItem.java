package org.betup.ui.common.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TopNavigationButtons.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jj\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lorg/betup/ui/common/compose/TopNavigationItem;", "", "type", "Lorg/betup/ui/common/compose/TopNavigationItemType;", "titleRes", "", "iconRes", "isActive", "", "adsAmount", "", "adsQuotaLabel", "", "adsTimerText", "onClick", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/common/compose/TopNavigationItemType;IIZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getType", "()Lorg/betup/ui/common/compose/TopNavigationItemType;", "getTitleRes", "()I", "getIconRes", "()Z", "setActive", "(Z)V", "getAdsAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAdsQuotaLabel", "()Ljava/lang/String;", "getAdsTimerText", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lorg/betup/ui/common/compose/TopNavigationItemType;IIZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lorg/betup/ui/common/compose/TopNavigationItem;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TopNavigationItem {
    public static final int $stable = 8;
    private final Long adsAmount;
    private final String adsQuotaLabel;
    private final String adsTimerText;
    private final int iconRes;
    private boolean isActive;
    private final Function0<Unit> onClick;
    private final int titleRes;
    private final TopNavigationItemType type;

    /* renamed from: component1, reason: from getter */
    public final TopNavigationItemType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getAdsAmount() {
        return this.adsAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAdsQuotaLabel() {
        return this.adsQuotaLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAdsTimerText() {
        return this.adsTimerText;
    }

    public final Function0<Unit> component8() {
        return this.onClick;
    }

    public final TopNavigationItem copy(TopNavigationItemType type, int titleRes, int iconRes, boolean isActive, Long adsAmount, String adsQuotaLabel, String adsTimerText, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new TopNavigationItem(type, titleRes, iconRes, isActive, adsAmount, adsQuotaLabel, adsTimerText, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopNavigationItem)) {
            return false;
        }
        TopNavigationItem topNavigationItem = (TopNavigationItem) other;
        return this.type == topNavigationItem.type && this.titleRes == topNavigationItem.titleRes && this.iconRes == topNavigationItem.iconRes && this.isActive == topNavigationItem.isActive && Intrinsics.areEqual(this.adsAmount, topNavigationItem.adsAmount) && Intrinsics.areEqual(this.adsQuotaLabel, topNavigationItem.adsQuotaLabel) && Intrinsics.areEqual(this.adsTimerText, topNavigationItem.adsTimerText) && Intrinsics.areEqual(this.onClick, topNavigationItem.onClick);
    }

    public int hashCode() {
        int hashCode = ((((((this.type.hashCode() * 31) + Integer.hashCode(this.titleRes)) * 31) + Integer.hashCode(this.iconRes)) * 31) + Boolean.hashCode(this.isActive)) * 31;
        Long l = this.adsAmount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.adsQuotaLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adsTimerText;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "TopNavigationItem(type=" + this.type + ", titleRes=" + this.titleRes + ", iconRes=" + this.iconRes + ", isActive=" + this.isActive + ", adsAmount=" + this.adsAmount + ", adsQuotaLabel=" + this.adsQuotaLabel + ", adsTimerText=" + this.adsTimerText + ", onClick=" + this.onClick + ")";
    }

    public TopNavigationItem(TopNavigationItemType type, int i, int i2, boolean z, Long l, String str, String str2, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.type = type;
        this.titleRes = i;
        this.iconRes = i2;
        this.isActive = z;
        this.adsAmount = l;
        this.adsQuotaLabel = str;
        this.adsTimerText = str2;
        this.onClick = onClick;
    }

    public /* synthetic */ TopNavigationItem(TopNavigationItemType topNavigationItemType, int i, int i2, boolean z, Long l, String str, String str2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(topNavigationItemType, i, i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? null : l, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2, function0);
    }

    public final TopNavigationItemType getType() {
        return this.type;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final Long getAdsAmount() {
        return this.adsAmount;
    }

    public final String getAdsQuotaLabel() {
        return this.adsQuotaLabel;
    }

    public final String getAdsTimerText() {
        return this.adsTimerText;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
