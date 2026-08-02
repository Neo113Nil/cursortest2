package com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/domain/model/CelebrationContent;", "", "", "titleRes", "descriptionRes", "buttonTextRes", "", "imageUrl", "<init>", "(ILjava/lang/Integer;ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/String;", "copy", "(ILjava/lang/Integer;ILjava/lang/String;)Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/domain/model/CelebrationContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes", "getButtonTextRes", "Ljava/lang/String;", "getImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CelebrationContent {
    public static final int $stable = 0;
    private final int buttonTextRes;
    private final java.lang.Integer descriptionRes;
    private final java.lang.String imageUrl;
    private final int titleRes;

    public CelebrationContent(int i, java.lang.Integer num, int i2, java.lang.String str) {
        this.titleRes = i;
        this.descriptionRes = num;
        this.buttonTextRes = i2;
        this.imageUrl = str;
    }

    public /* synthetic */ CelebrationContent(int i, java.lang.Integer num, int i2, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : num, i2, (i3 & 8) != 0 ? null : str);
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final java.lang.Integer getDescriptionRes() {
        return this.descriptionRes;
    }

    public final int getButtonTextRes() {
        return this.buttonTextRes;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String toString() {
        int i = this.titleRes;
        java.lang.Integer num = this.descriptionRes;
        int i2 = this.buttonTextRes;
        java.lang.String str = this.imageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CelebrationContent(titleRes=");
        sb.append(i);
        sb.append(", descriptionRes=");
        sb.append(num);
        sb.append(", buttonTextRes=");
        sb.append(i2);
        sb.append(", imageUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.titleRes);
        java.lang.Integer num = this.descriptionRes;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.buttonTextRes);
        java.lang.String str = this.imageUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent celebrationContent = (com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent) other;
        return this.titleRes == celebrationContent.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, celebrationContent.descriptionRes) && this.buttonTextRes == celebrationContent.buttonTextRes && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, celebrationContent.imageUrl);
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent copy(int titleRes, java.lang.Integer descriptionRes, int buttonTextRes, java.lang.String imageUrl) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(titleRes, descriptionRes, buttonTextRes, imageUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final int getButtonTextRes() {
        return this.buttonTextRes;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getDescriptionRes() {
        return this.descriptionRes;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent copy$default(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent celebrationContent, int i, java.lang.Integer num, int i2, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = celebrationContent.titleRes;
        }
        if ((i3 & 2) != 0) {
            num = celebrationContent.descriptionRes;
        }
        if ((i3 & 4) != 0) {
            i2 = celebrationContent.buttonTextRes;
        }
        if ((i3 & 8) != 0) {
            str = celebrationContent.imageUrl;
        }
        return celebrationContent.copy(i, num, i2, str);
    }
}
