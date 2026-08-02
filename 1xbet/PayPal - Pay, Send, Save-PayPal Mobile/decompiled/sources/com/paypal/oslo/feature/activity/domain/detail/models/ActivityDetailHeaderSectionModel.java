package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0018\u0010\u001f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"J|\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b3\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b6\u0010\u0017R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b7\u0010\u0017R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010 R\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHeaderSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "avatar", "", "title", "displayStatus", "date", "amount", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AmountColorType;", "amountColor", "currencyCode", "moneyFlowDirectionDisplayValue", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityStatus;", "activityStatus", "", "wrapWithCard", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/detail/models/AmountColorType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Z)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/AmountColorType;", "component7", "component8", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "component10", "()Z", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/detail/models/AmountColorType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Z)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHeaderSectionModel;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "getAvatar", "Ljava/lang/String;", "getTitle", "getDisplayStatus", "getDate", "getAmount", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AmountColorType;", "getAmountColor", "getCurrencyCode", "getMoneyFlowDirectionDisplayValue", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "getActivityStatus", "Z", "getWrapWithCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailHeaderSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus;
    private final java.lang.String amount;
    private final com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType amountColor;
    private final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar avatar;
    private final java.lang.String currencyCode;
    private final java.lang.String date;
    private final java.lang.String displayStatus;
    private final java.lang.String moneyFlowDirectionDisplayValue;
    private final java.lang.String title;
    private final boolean wrapWithCard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetailHeaderSectionModel(com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType amountColorType, java.lang.String str5, java.lang.String str6, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, boolean z) {
        super(null, null, false, false, false, null, null, 127, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counterPartyAvatar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountColorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.avatar = counterPartyAvatar;
        this.title = str;
        this.displayStatus = str2;
        this.date = str3;
        this.amount = str4;
        this.amountColor = amountColorType;
        this.currencyCode = str5;
        this.moneyFlowDirectionDisplayValue = str6;
        this.activityStatus = activityStatus;
        this.wrapWithCard = z;
    }

    public final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar getAvatar() {
        return this.avatar;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDisplayStatus() {
        return this.displayStatus;
    }

    public final java.lang.String getDate() {
        return this.date;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType getAmountColor() {
        return this.amountColor;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public /* synthetic */ ActivityDetailHeaderSectionModel(com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType amountColorType, java.lang.String str5, java.lang.String str6, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(counterPartyAvatar, str, str2, str3, str4, amountColorType, str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? null : activityStatus, (i & 512) != 0 ? false : z);
    }

    public final java.lang.String getMoneyFlowDirectionDisplayValue() {
        return this.moneyFlowDirectionDisplayValue;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus getActivityStatus() {
        return this.activityStatus;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final boolean getWrapWithCard() {
        return this.wrapWithCard;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar = this.avatar;
        java.lang.String str = this.title;
        java.lang.String str2 = this.displayStatus;
        java.lang.String str3 = this.date;
        java.lang.String str4 = this.amount;
        com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType amountColorType = this.amountColor;
        java.lang.String str5 = this.currencyCode;
        java.lang.String str6 = this.moneyFlowDirectionDisplayValue;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = this.activityStatus;
        boolean z = this.wrapWithCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailHeaderSectionModel(avatar=");
        sb.append(counterPartyAvatar);
        sb.append(", title=");
        sb.append(str);
        sb.append(", displayStatus=");
        sb.append(str2);
        sb.append(", date=");
        sb.append(str3);
        sb.append(", amount=");
        sb.append(str4);
        sb.append(", amountColor=");
        sb.append(amountColorType);
        sb.append(", currencyCode=");
        sb.append(str5);
        sb.append(", moneyFlowDirectionDisplayValue=");
        sb.append(str6);
        sb.append(", activityStatus=");
        sb.append(activityStatus);
        sb.append(", wrapWithCard=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.avatar.hashCode();
        int hashCode2 = this.title.hashCode();
        int hashCode3 = this.displayStatus.hashCode();
        int hashCode4 = this.date.hashCode();
        int hashCode5 = this.amount.hashCode();
        int hashCode6 = this.amountColor.hashCode();
        int hashCode7 = this.currencyCode.hashCode();
        int hashCode8 = this.moneyFlowDirectionDisplayValue.hashCode();
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = this.activityStatus;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (activityStatus == null ? 0 : activityStatus.hashCode())) * 31) + java.lang.Boolean.hashCode(this.wrapWithCard);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel activityDetailHeaderSectionModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.avatar, activityDetailHeaderSectionModel.avatar) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, activityDetailHeaderSectionModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayStatus, activityDetailHeaderSectionModel.displayStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, activityDetailHeaderSectionModel.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, activityDetailHeaderSectionModel.amount) && this.amountColor == activityDetailHeaderSectionModel.amountColor && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, activityDetailHeaderSectionModel.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFlowDirectionDisplayValue, activityDetailHeaderSectionModel.moneyFlowDirectionDisplayValue) && this.activityStatus == activityDetailHeaderSectionModel.activityStatus && this.wrapWithCard == activityDetailHeaderSectionModel.wrapWithCard;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel copy(com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar avatar, java.lang.String title, java.lang.String displayStatus, java.lang.String date, java.lang.String amount, com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType amountColor, java.lang.String currencyCode, java.lang.String moneyFlowDirectionDisplayValue, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, boolean wrapWithCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountColor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFlowDirectionDisplayValue, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel(avatar, title, displayStatus, date, amount, amountColor, currencyCode, moneyFlowDirectionDisplayValue, activityStatus, wrapWithCard);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus getActivityStatus() {
        return this.activityStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getMoneyFlowDirectionDisplayValue() {
        return this.moneyFlowDirectionDisplayValue;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType getAmountColor() {
        return this.amountColor;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayStatus() {
        return this.displayStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getWrapWithCard() {
        return this.wrapWithCard;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar getAvatar() {
        return this.avatar;
    }
}
