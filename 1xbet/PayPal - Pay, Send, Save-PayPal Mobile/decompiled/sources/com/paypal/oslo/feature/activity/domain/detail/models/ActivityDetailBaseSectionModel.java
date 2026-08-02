package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "", "leadingTitleResId", "trailingTitleResId", "", "wrapWithCard", "showLeadingHeader", "showTrailingHeader", "Landroidx/navigation3/runtime/NavKey;", "trailingHeaderNavKey", "Lcom/paypal/pds/core/Color;", "backgroundColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ZZZLandroidx/navigation3/runtime/NavKey;Lcom/paypal/pds/core/Color;)V", "Ljava/lang/Integer;", "getLeadingTitleResId", "()Ljava/lang/Integer;", "getTrailingTitleResId", "Z", "getWrapWithCard", "()Z", "getShowLeadingHeader", "getShowTrailingHeader", "Landroidx/navigation3/runtime/NavKey;", "getTrailingHeaderNavKey", "()Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/pds/core/Color;", "getBackgroundColor", "()Lcom/paypal/pds/core/Color;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final com.paypal.pds.core.Color backgroundColor;
    private final java.lang.Integer leadingTitleResId;
    private final boolean showLeadingHeader;
    private final boolean showTrailingHeader;
    private final androidx.navigation3.runtime.NavKey trailingHeaderNavKey;
    private final java.lang.Integer trailingTitleResId;
    private final boolean wrapWithCard;

    public ActivityDetailBaseSectionModel(java.lang.Integer num, java.lang.Integer num2, boolean z, boolean z2, boolean z3, androidx.navigation3.runtime.NavKey navKey, com.paypal.pds.core.Color color) {
        this.leadingTitleResId = num;
        this.trailingTitleResId = num2;
        this.wrapWithCard = z;
        this.showLeadingHeader = z2;
        this.showTrailingHeader = z3;
        this.trailingHeaderNavKey = navKey;
        this.backgroundColor = color;
    }

    public java.lang.Integer getLeadingTitleResId() {
        return this.leadingTitleResId;
    }

    public java.lang.Integer getTrailingTitleResId() {
        return this.trailingTitleResId;
    }

    public boolean getWrapWithCard() {
        return this.wrapWithCard;
    }

    public boolean getShowLeadingHeader() {
        return this.showLeadingHeader;
    }

    public boolean getShowTrailingHeader() {
        return this.showTrailingHeader;
    }

    public androidx.navigation3.runtime.NavKey getTrailingHeaderNavKey() {
        return this.trailingHeaderNavKey;
    }

    public /* synthetic */ ActivityDetailBaseSectionModel(java.lang.Integer num, java.lang.Integer num2, boolean z, boolean z2, boolean z3, androidx.navigation3.runtime.NavKey navKey, com.paypal.pds.core.Color.BackgroundBase backgroundBase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? navKey : null, (i & 64) != 0 ? com.paypal.pds.core.Color.BackgroundBase.INSTANCE : backgroundBase);
    }

    public com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public ActivityDetailBaseSectionModel() {
        this(null, null, false, false, false, null, null, 127, null);
    }
}
