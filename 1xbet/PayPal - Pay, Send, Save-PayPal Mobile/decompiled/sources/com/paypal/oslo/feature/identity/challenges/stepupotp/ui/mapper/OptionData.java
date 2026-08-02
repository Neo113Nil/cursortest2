package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mapper/OptionData;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "type", "", "titleRes", "Lcom/paypal/pds/core/Icon;", "icon", "", "isVisible", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;ILcom/paypal/pds/core/Icon;Z)V", "component1", "()Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "component2", "()I", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;ILcom/paypal/pds/core/Icon;Z)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mapper/OptionData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "getType", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Lcom/paypal/pds/core/Icon;", "getIcon", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OptionData {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final boolean isVisible;
    private final int titleRes;
    private final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType type;

    public OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, int i, com.paypal.pds.core.Icon icon, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.type = optionType;
        this.titleRes = i;
        this.icon = icon;
        this.isVisible = z;
    }

    public /* synthetic */ OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, int i, com.paypal.pds.core.Icon icon, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(optionType, i, icon, (i2 & 8) != 0 ? true : z);
    }

    public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getType() {
        return this.type;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = this.type;
        int i = this.titleRes;
        com.paypal.pds.core.Icon icon = this.icon;
        boolean z = this.isVisible;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionData(type=");
        sb.append(optionType);
        sb.append(", titleRes=");
        sb.append(i);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", isVisible=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.type.hashCode() * 31) + java.lang.Integer.hashCode(this.titleRes)) * 31) + this.icon.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isVisible);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData)) {
            return false;
        }
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) other;
        return this.type == optionData.type && this.titleRes == optionData.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, optionData.icon) && this.isVisible == optionData.isVisible;
    }

    public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData copy(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType type, int titleRes, com.paypal.pds.core.Icon icon, boolean isVisible) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(type, titleRes, icon, isVisible);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, int i, com.paypal.pds.core.Icon icon, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            optionType = optionData.type;
        }
        if ((i2 & 2) != 0) {
            i = optionData.titleRes;
        }
        if ((i2 & 4) != 0) {
            icon = optionData.icon;
        }
        if ((i2 & 8) != 0) {
            z = optionData.isVisible;
        }
        return optionData.copy(optionType, i, icon, z);
    }
}
