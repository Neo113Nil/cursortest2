package com.paypal.oslo.feature.smartroute.ui.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jn\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionAccountUi;", "", "", "id", "name", "enrollmentStatusText", "apyBadgeText", "Lcom/paypal/pds/core/Icon;", "iconPlaceholder", "Lcom/paypal/pds/components/AvatarEmphasis;", "iconEmphasis", "", "percentage", "", "hasSlider", "Lcom/paypal/oslo/feature/smartroute/utils/SliderTarget;", "sliderTarget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarEmphasis;FZLcom/paypal/oslo/feature/smartroute/utils/SliderTarget;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/pds/core/Icon;", "component6", "()Lcom/paypal/pds/components/AvatarEmphasis;", "component7", "()F", "component8", "()Z", "component9", "()Lcom/paypal/oslo/feature/smartroute/utils/SliderTarget;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarEmphasis;FZLcom/paypal/oslo/feature/smartroute/utils/SliderTarget;)Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionAccountUi;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getEnrollmentStatusText", "getApyBadgeText", "Lcom/paypal/pds/core/Icon;", "getIconPlaceholder", "Lcom/paypal/pds/components/AvatarEmphasis;", "getIconEmphasis", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPercentage", "Z", "getHasSlider", "Lcom/paypal/oslo/feature/smartroute/utils/SliderTarget;", "getSliderTarget", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DistributionAccountUi {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi.Companion INSTANCE = new com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi.Companion(null);
    private static final com.paypal.pds.components.AvatarEmphasis InfoEmphasis = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleEmphasisInfo.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleEmphasisInfo.INSTANCE);
    private final java.lang.String apyBadgeText;
    private final java.lang.String enrollmentStatusText;
    private final boolean hasSlider;
    private final com.paypal.pds.components.AvatarEmphasis iconEmphasis;
    private final com.paypal.pds.core.Icon iconPlaceholder;
    private final java.lang.String id;
    private final java.lang.String name;
    private final float percentage;
    private final com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget;

    public DistributionAccountUi(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, float f, boolean z, com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarEmphasis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sliderTarget, "");
        this.id = str;
        this.name = str2;
        this.enrollmentStatusText = str3;
        this.apyBadgeText = str4;
        this.iconPlaceholder = icon;
        this.iconEmphasis = avatarEmphasis;
        this.percentage = f;
        this.hasSlider = z;
        this.sliderTarget = sliderTarget;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getEnrollmentStatusText() {
        return this.enrollmentStatusText;
    }

    public final java.lang.String getApyBadgeText() {
        return this.apyBadgeText;
    }

    public final com.paypal.pds.core.Icon getIconPlaceholder() {
        return this.iconPlaceholder;
    }

    public /* synthetic */ DistributionAccountUi(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, float f, boolean z, com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, icon, (i & 32) != 0 ? com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE : avatarEmphasis, f, (i & 128) != 0 ? true : z, sliderTarget);
    }

    public final com.paypal.pds.components.AvatarEmphasis getIconEmphasis() {
        return this.iconEmphasis;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final boolean getHasSlider() {
        return this.hasSlider;
    }

    public final com.paypal.oslo.feature.smartroute.utils.SliderTarget getSliderTarget() {
        return this.sliderTarget;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionAccountUi$Companion;", "", "<init>", "()V", "Lcom/paypal/pds/components/AvatarEmphasis;", "InfoEmphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", "getInfoEmphasis", "()Lcom/paypal/pds/components/AvatarEmphasis;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.pds.components.AvatarEmphasis getInfoEmphasis() {
            return com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi.InfoEmphasis;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.enrollmentStatusText;
        java.lang.String str4 = this.apyBadgeText;
        com.paypal.pds.core.Icon icon = this.iconPlaceholder;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis = this.iconEmphasis;
        float f = this.percentage;
        boolean z = this.hasSlider;
        com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget = this.sliderTarget;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DistributionAccountUi(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", enrollmentStatusText=");
        sb.append(str3);
        sb.append(", apyBadgeText=");
        sb.append(str4);
        sb.append(", iconPlaceholder=");
        sb.append(icon);
        sb.append(", iconEmphasis=");
        sb.append(avatarEmphasis);
        sb.append(", percentage=");
        sb.append(f);
        sb.append(", hasSlider=");
        sb.append(z);
        sb.append(", sliderTarget=");
        sb.append(sliderTarget);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.name.hashCode();
        java.lang.String str = this.enrollmentStatusText;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.apyBadgeText;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.iconPlaceholder.hashCode()) * 31) + this.iconEmphasis.hashCode()) * 31) + java.lang.Float.hashCode(this.percentage)) * 31) + java.lang.Boolean.hashCode(this.hasSlider)) * 31) + this.sliderTarget.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, distributionAccountUi.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, distributionAccountUi.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentStatusText, distributionAccountUi.enrollmentStatusText) && kotlin.jvm.internal.Intrinsics.areEqual(this.apyBadgeText, distributionAccountUi.apyBadgeText) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconPlaceholder, distributionAccountUi.iconPlaceholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconEmphasis, distributionAccountUi.iconEmphasis) && java.lang.Float.compare(this.percentage, distributionAccountUi.percentage) == 0 && this.hasSlider == distributionAccountUi.hasSlider && kotlin.jvm.internal.Intrinsics.areEqual(this.sliderTarget, distributionAccountUi.sliderTarget);
    }

    public final com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi copy(java.lang.String id, java.lang.String name2, java.lang.String enrollmentStatusText, java.lang.String apyBadgeText, com.paypal.pds.core.Icon iconPlaceholder, com.paypal.pds.components.AvatarEmphasis iconEmphasis, float percentage, boolean hasSlider, com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconPlaceholder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconEmphasis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sliderTarget, "");
        return new com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi(id, name2, enrollmentStatusText, apyBadgeText, iconPlaceholder, iconEmphasis, percentage, hasSlider, sliderTarget);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.smartroute.utils.SliderTarget getSliderTarget() {
        return this.sliderTarget;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasSlider() {
        return this.hasSlider;
    }

    /* renamed from: component7, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.pds.components.AvatarEmphasis getIconEmphasis() {
        return this.iconEmphasis;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.pds.core.Icon getIconPlaceholder() {
        return this.iconPlaceholder;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getApyBadgeText() {
        return this.apyBadgeText;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEnrollmentStatusText() {
        return this.enrollmentStatusText;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
