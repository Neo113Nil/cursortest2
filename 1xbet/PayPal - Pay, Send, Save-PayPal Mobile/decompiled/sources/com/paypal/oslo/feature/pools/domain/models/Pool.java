package com.paypal.oslo.feature.pools.domain.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001cJ\u0010\u0010-\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b0\u0010.J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001cJÆ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00142\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bG\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bH\u0010&R\u001a\u0010\u0010\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bI\u0010&R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010+R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\bL\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\b\u0015\u0010.R\u001a\u0010\u0016\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\b\u0016\u0010.R\u001a\u0010\u0017\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\b\u0017\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bN\u0010\u001cR\u0011\u0010O\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bO\u0010.R\u0011\u0010Q\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bP\u0010.R\u0011\u0010S\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bR\u0010."}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "", "", "id", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "backgroundUrl", "createdBy", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "status", "Lcom/paypal/oslo/feature/pools/domain/models/User;", "creator", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "targetAmount", "targetDate", "availableBalance", "totalContributionAmount", "", "progressPercentage", "link", "", "isTransferEnabled", "isContributionEnabled", "isEditable", "reportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;Lcom/paypal/oslo/feature/pools/domain/models/User;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;FLjava/lang/String;ZZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "component7", "()Lcom/paypal/oslo/feature/pools/domain/models/User;", "component8", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "component9", "component10", "component11", "component12", "()F", "component13", "component14", "()Z", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;Lcom/paypal/oslo/feature/pools/domain/models/User;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;FLjava/lang/String;ZZZLjava/lang/String;)Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "getBackgroundUrl", "getCreatedBy", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "getStatus", "Lcom/paypal/oslo/feature/pools/domain/models/User;", "getCreator", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "getTargetAmount", "getTargetDate", "getAvailableBalance", "getTotalContributionAmount", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getProgressPercentage", "getLink", "Z", "getReportUrl", "isClosed", "getHasTargetDate", "hasTargetDate", "getHasAvailableBalance", "hasAvailableBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Pool {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.pools.domain.models.PoolAmount availableBalance;
    private final java.lang.String backgroundUrl;
    private final java.lang.String createdBy;
    private final com.paypal.oslo.feature.pools.domain.models.User creator;
    private final java.lang.String description;
    private final java.lang.String id;
    private final boolean isContributionEnabled;
    private final boolean isEditable;
    private final boolean isTransferEnabled;
    private final java.lang.String link;
    private final float progressPercentage;
    private final java.lang.String reportUrl;
    private final com.paypal.oslo.feature.pools.domain.models.PoolStatus status;
    private final com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount;
    private final java.lang.String targetDate;
    private final java.lang.String title;
    private final com.paypal.oslo.feature.pools.domain.models.PoolAmount totalContributionAmount;

    public Pool(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus, com.paypal.oslo.feature.pools.domain.models.User user, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, java.lang.String str6, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount3, float f, java.lang.String str7, boolean z, boolean z2, boolean z3, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.backgroundUrl = str4;
        this.createdBy = str5;
        this.status = poolStatus;
        this.creator = user;
        this.targetAmount = poolAmount;
        this.targetDate = str6;
        this.availableBalance = poolAmount2;
        this.totalContributionAmount = poolAmount3;
        this.progressPercentage = f;
        this.link = str7;
        this.isTransferEnabled = z;
        this.isContributionEnabled = z2;
        this.isEditable = z3;
        this.reportUrl = str8;
    }

    public /* synthetic */ Pool(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus, com.paypal.oslo.feature.pools.domain.models.User user, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, java.lang.String str6, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount3, float f, java.lang.String str7, boolean z, boolean z2, boolean z3, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, poolStatus, user, poolAmount, str6, poolAmount2, poolAmount3, f, str7, z, z2, z3, str8);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final java.lang.String getCreatedBy() {
        return this.createdBy;
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.pools.domain.models.User getCreator() {
        return this.creator;
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTargetAmount() {
        return this.targetAmount;
    }

    public final java.lang.String getTargetDate() {
        return this.targetDate;
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAvailableBalance() {
        return this.availableBalance;
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTotalContributionAmount() {
        return this.totalContributionAmount;
    }

    public final float getProgressPercentage() {
        return this.progressPercentage;
    }

    public final java.lang.String getLink() {
        return this.link;
    }

    public final boolean isTransferEnabled() {
        return this.isTransferEnabled;
    }

    public final boolean isContributionEnabled() {
        return this.isContributionEnabled;
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public final java.lang.String getReportUrl() {
        return this.reportUrl;
    }

    public final boolean isClosed() {
        return this.status == com.paypal.oslo.feature.pools.domain.models.PoolStatus.CLOSED;
    }

    public final boolean getHasTargetDate() {
        java.lang.String str = this.targetDate;
        return !(str == null || kotlin.text.StringsKt.isBlank(str));
    }

    public final boolean getHasAvailableBalance() {
        return this.availableBalance.getValue() > 0.0f;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.description;
        java.lang.String str4 = this.backgroundUrl;
        java.lang.String str5 = this.createdBy;
        com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus = this.status;
        com.paypal.oslo.feature.pools.domain.models.User user = this.creator;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.targetAmount;
        java.lang.String str6 = this.targetDate;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2 = this.availableBalance;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount3 = this.totalContributionAmount;
        float f = this.progressPercentage;
        java.lang.String str7 = this.link;
        boolean z = this.isTransferEnabled;
        boolean z2 = this.isContributionEnabled;
        boolean z3 = this.isEditable;
        java.lang.String str8 = this.reportUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Pool(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", backgroundUrl=");
        sb.append(str4);
        sb.append(", createdBy=");
        sb.append(str5);
        sb.append(", status=");
        sb.append(poolStatus);
        sb.append(", creator=");
        sb.append(user);
        sb.append(", targetAmount=");
        sb.append(poolAmount);
        sb.append(", targetDate=");
        sb.append(str6);
        sb.append(", availableBalance=");
        sb.append(poolAmount2);
        sb.append(", totalContributionAmount=");
        sb.append(poolAmount3);
        sb.append(", progressPercentage=");
        sb.append(f);
        sb.append(", link=");
        sb.append(str7);
        sb.append(", isTransferEnabled=");
        sb.append(z);
        sb.append(", isContributionEnabled=");
        sb.append(z2);
        sb.append(", isEditable=");
        sb.append(z3);
        sb.append(", reportUrl=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.title.hashCode();
        java.lang.String str = this.description;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.backgroundUrl;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.createdBy;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        int hashCode6 = this.status.hashCode();
        int hashCode7 = this.creator.hashCode();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.targetAmount;
        int hashCode8 = poolAmount == null ? 0 : poolAmount.hashCode();
        java.lang.String str4 = this.targetDate;
        int hashCode9 = str4 == null ? 0 : str4.hashCode();
        int hashCode10 = this.availableBalance.hashCode();
        int hashCode11 = this.totalContributionAmount.hashCode();
        int hashCode12 = java.lang.Float.hashCode(this.progressPercentage);
        int hashCode13 = this.link.hashCode();
        int hashCode14 = java.lang.Boolean.hashCode(this.isTransferEnabled);
        int hashCode15 = java.lang.Boolean.hashCode(this.isContributionEnabled);
        int hashCode16 = java.lang.Boolean.hashCode(this.isEditable);
        java.lang.String str5 = this.reportUrl;
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pools.domain.models.Pool)) {
            return false;
        }
        com.paypal.oslo.feature.pools.domain.models.Pool pool = (com.paypal.oslo.feature.pools.domain.models.Pool) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, pool.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, pool.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, pool.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundUrl, pool.backgroundUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.createdBy, pool.createdBy) && this.status == pool.status && kotlin.jvm.internal.Intrinsics.areEqual(this.creator, pool.creator) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, pool.targetAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetDate, pool.targetDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableBalance, pool.availableBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalContributionAmount, pool.totalContributionAmount) && java.lang.Float.compare(this.progressPercentage, pool.progressPercentage) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.link, pool.link) && this.isTransferEnabled == pool.isTransferEnabled && this.isContributionEnabled == pool.isContributionEnabled && this.isEditable == pool.isEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.reportUrl, pool.reportUrl);
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool copy(java.lang.String id, java.lang.String title, java.lang.String description, java.lang.String backgroundUrl, java.lang.String createdBy, com.paypal.oslo.feature.pools.domain.models.PoolStatus status, com.paypal.oslo.feature.pools.domain.models.User creator, com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount, java.lang.String targetDate, com.paypal.oslo.feature.pools.domain.models.PoolAmount availableBalance, com.paypal.oslo.feature.pools.domain.models.PoolAmount totalContributionAmount, float progressPercentage, java.lang.String link, boolean isTransferEnabled, boolean isContributionEnabled, boolean isEditable, java.lang.String reportUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalContributionAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        return new com.paypal.oslo.feature.pools.domain.models.Pool(id, title, description, backgroundUrl, createdBy, status, creator, targetAmount, targetDate, availableBalance, totalContributionAmount, progressPercentage, link, isTransferEnabled, isContributionEnabled, isEditable, reportUrl);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getTargetDate() {
        return this.targetDate;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTargetAmount() {
        return this.targetAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.pools.domain.models.User getCreator() {
        return this.creator;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.pools.domain.models.PoolStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.String getReportUrl() {
        return this.reportUrl;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsContributionEnabled() {
        return this.isContributionEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsTransferEnabled() {
        return this.isTransferEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getLink() {
        return this.link;
    }

    /* renamed from: component12, reason: from getter */
    public final float getProgressPercentage() {
        return this.progressPercentage;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTotalContributionAmount() {
        return this.totalContributionAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAvailableBalance() {
        return this.availableBalance;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
