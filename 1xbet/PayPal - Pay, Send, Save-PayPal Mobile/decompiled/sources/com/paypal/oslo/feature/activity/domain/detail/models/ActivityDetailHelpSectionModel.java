package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "Lcom/paypal/oslo/feature/activity/domain/detail/models/HelpSection;", "helpSections", "Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "descriptionAndLinks", "", "leadingTitleResId", "", "showLeadingHeader", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;Ljava/lang/Integer;Z)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;Ljava/lang/Integer;Z)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getHelpSections", "Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "getDescriptionAndLinks", "Ljava/lang/Integer;", "getLeadingTitleResId", "Z", "getShowLeadingHeader"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailHelpSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinks;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.HelpSection> helpSections;
    private final java.lang.Integer leadingTitleResId;
    private final boolean showLeadingHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetailHelpSectionModel(java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.HelpSection> list, com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel, java.lang.Integer num, boolean z) {
        super(num, null, false, z, false, null, null, 118, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.helpSections = list;
        this.descriptionAndLinks = descriptionAndLinkModel;
        this.leadingTitleResId = num;
        this.showLeadingHeader = z;
    }

    public /* synthetic */ ActivityDetailHelpSectionModel(java.util.List list, com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel, java.lang.Integer num, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : descriptionAndLinkModel, (i & 4) != 0 ? null : num, z);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.HelpSection> getHelpSections() {
        return this.helpSections;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel getDescriptionAndLinks() {
        return this.descriptionAndLinks;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final java.lang.Integer getLeadingTitleResId() {
        return this.leadingTitleResId;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final boolean getShowLeadingHeader() {
        return this.showLeadingHeader;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.HelpSection> list = this.helpSections;
        com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel = this.descriptionAndLinks;
        java.lang.Integer num = this.leadingTitleResId;
        boolean z = this.showLeadingHeader;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailHelpSectionModel(helpSections=");
        sb.append(list);
        sb.append(", descriptionAndLinks=");
        sb.append(descriptionAndLinkModel);
        sb.append(", leadingTitleResId=");
        sb.append(num);
        sb.append(", showLeadingHeader=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.helpSections.hashCode();
        com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel = this.descriptionAndLinks;
        int hashCode2 = descriptionAndLinkModel == null ? 0 : descriptionAndLinkModel.hashCode();
        java.lang.Integer num = this.leadingTitleResId;
        return (((((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.showLeadingHeader);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.helpSections, activityDetailHelpSectionModel.helpSections) && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionAndLinks, activityDetailHelpSectionModel.descriptionAndLinks) && kotlin.jvm.internal.Intrinsics.areEqual(this.leadingTitleResId, activityDetailHelpSectionModel.leadingTitleResId) && this.showLeadingHeader == activityDetailHelpSectionModel.showLeadingHeader;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel copy(java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.HelpSection> helpSections, com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinks, java.lang.Integer leadingTitleResId, boolean showLeadingHeader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpSections, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel(helpSections, descriptionAndLinks, leadingTitleResId, showLeadingHeader);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowLeadingHeader() {
        return this.showLeadingHeader;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getLeadingTitleResId() {
        return this.leadingTitleResId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel getDescriptionAndLinks() {
        return this.descriptionAndLinks;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.HelpSection> component1() {
        return this.helpSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel, java.util.List list, com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = activityDetailHelpSectionModel.helpSections;
        }
        if ((i & 2) != 0) {
            descriptionAndLinkModel = activityDetailHelpSectionModel.descriptionAndLinks;
        }
        if ((i & 4) != 0) {
            num = activityDetailHelpSectionModel.leadingTitleResId;
        }
        if ((i & 8) != 0) {
            z = activityDetailHelpSectionModel.showLeadingHeader;
        }
        return activityDetailHelpSectionModel.copy(list, descriptionAndLinkModel, num, z);
    }
}
