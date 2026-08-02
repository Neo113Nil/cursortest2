package com.paypal.oslo.feature.onboarding.steps.struct.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "pageId", "", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "components", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/BottomNavigationConfig;", "bottomNavigationConfig", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/BottomNavigationConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-eVUBM90", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/BottomNavigationConfig;", "copy--fVNDaM", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/BottomNavigationConfig;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getPageId-eVUBM90", "Ljava/util/List;", "getComponents", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/BottomNavigationConfig;", "getBottomNavigationConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PageConfig {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig bottomNavigationConfig;
    private final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> components;
    private final java.lang.String pageId;

    /* JADX WARN: Multi-variable type inference failed */
    private PageConfig(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> list, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig bottomNavigationConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomNavigationConfig, "");
        this.pageId = str;
        this.components = list;
        this.bottomNavigationConfig = bottomNavigationConfig;
    }

    /* renamed from: getPageId-eVUBM90, reason: not valid java name */
    public final java.lang.String m16571getPageIdeVUBM90() {
        return this.pageId;
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> getComponents() {
        return this.components;
    }

    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig getBottomNavigationConfig() {
        return this.bottomNavigationConfig;
    }

    public /* synthetic */ PageConfig(java.lang.String str, java.util.List list, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig bottomNavigationConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.BottomNavigation.INSTANCE.m16160getNextVbOBBVs()) : bottomNavigationConfig, null);
    }

    public final java.lang.String toString() {
        java.lang.String m16034toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16034toStringimpl(this.pageId);
        java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> list = this.components;
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig bottomNavigationConfig = this.bottomNavigationConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PageConfig(pageId=");
        sb.append(m16034toStringimpl);
        sb.append(", components=");
        sb.append(list);
        sb.append(", bottomNavigationConfig=");
        sb.append(bottomNavigationConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16033hashCodeimpl(this.pageId) * 31) + this.components.hashCode()) * 31) + this.bottomNavigationConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig) other;
        return com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(this.pageId, pageConfig.pageId) && kotlin.jvm.internal.Intrinsics.areEqual(this.components, pageConfig.components) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomNavigationConfig, pageConfig.bottomNavigationConfig);
    }

    /* renamed from: copy--fVNDaM, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig m16570copyfVNDaM(java.lang.String pageId, java.util.List<? extends com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> components, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig bottomNavigationConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomNavigationConfig, "");
        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig(pageId, components, bottomNavigationConfig, null);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig getBottomNavigationConfig() {
        return this.bottomNavigationConfig;
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> component2() {
        return this.components;
    }

    /* renamed from: component1-eVUBM90, reason: not valid java name and from getter */
    public final java.lang.String getPageId() {
        return this.pageId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy--fVNDaM$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig m16568copyfVNDaM$default(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, java.lang.String str, java.util.List list, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig bottomNavigationConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pageConfig.pageId;
        }
        if ((i & 2) != 0) {
            list = pageConfig.components;
        }
        if ((i & 4) != 0) {
            bottomNavigationConfig = pageConfig.bottomNavigationConfig;
        }
        return pageConfig.m16570copyfVNDaM(str, list, bottomNavigationConfig);
    }

    public /* synthetic */ PageConfig(java.lang.String str, java.util.List list, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.BottomNavigationConfig bottomNavigationConfig, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, bottomNavigationConfig);
    }
}
