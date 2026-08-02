package com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/domain/model/AddFiContent;", "", "", "headerTitleRes", "headerDescriptionRes", "submitButtonLabelRes", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/domain/model/AddFiContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getHeaderTitleRes", "getHeaderDescriptionRes", "getSubmitButtonLabelRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddFiContent {
    public static final int $stable = 0;
    private final int headerDescriptionRes;
    private final int headerTitleRes;
    private final int submitButtonLabelRes;

    public AddFiContent(int i, int i2, int i3) {
        this.headerTitleRes = i;
        this.headerDescriptionRes = i2;
        this.submitButtonLabelRes = i3;
    }

    public final int getHeaderTitleRes() {
        return this.headerTitleRes;
    }

    public final int getHeaderDescriptionRes() {
        return this.headerDescriptionRes;
    }

    public final int getSubmitButtonLabelRes() {
        return this.submitButtonLabelRes;
    }

    public final java.lang.String toString() {
        int i = this.headerTitleRes;
        int i2 = this.headerDescriptionRes;
        int i3 = this.submitButtonLabelRes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFiContent(headerTitleRes=");
        sb.append(i);
        sb.append(", headerDescriptionRes=");
        sb.append(i2);
        sb.append(", submitButtonLabelRes=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.headerTitleRes) * 31) + java.lang.Integer.hashCode(this.headerDescriptionRes)) * 31) + java.lang.Integer.hashCode(this.submitButtonLabelRes);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent addFiContent = (com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent) other;
        return this.headerTitleRes == addFiContent.headerTitleRes && this.headerDescriptionRes == addFiContent.headerDescriptionRes && this.submitButtonLabelRes == addFiContent.submitButtonLabelRes;
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent copy(int headerTitleRes, int headerDescriptionRes, int submitButtonLabelRes) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent(headerTitleRes, headerDescriptionRes, submitButtonLabelRes);
    }

    /* renamed from: component3, reason: from getter */
    public final int getSubmitButtonLabelRes() {
        return this.submitButtonLabelRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeaderDescriptionRes() {
        return this.headerDescriptionRes;
    }

    /* renamed from: component1, reason: from getter */
    public final int getHeaderTitleRes() {
        return this.headerTitleRes;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent copy$default(com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent addFiContent, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = addFiContent.headerTitleRes;
        }
        if ((i4 & 2) != 0) {
            i2 = addFiContent.headerDescriptionRes;
        }
        if ((i4 & 4) != 0) {
            i3 = addFiContent.submitButtonLabelRes;
        }
        return addFiContent.copy(i, i2, i3);
    }
}
