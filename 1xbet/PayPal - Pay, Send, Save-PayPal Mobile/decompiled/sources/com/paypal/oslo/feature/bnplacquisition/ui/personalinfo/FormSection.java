package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0011\u0010#\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R\u0011\u0010%\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b$\u0010\u0017R\u0011\u0010'\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b&\u0010\u0017R\u0011\u0010)\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0011\u0010+\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b*\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FormSection;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FormSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getShowAllowPaypalContactLabel", "()Z", "showAllowPaypalContactLabel", "getShowPersonalInfoSubtitle", "showPersonalInfoSubtitle", "getShowContactDisclaimer", "showContactDisclaimer", "getShowRepaymentFrom", "showRepaymentFrom", "shouldShowDateOfBirth", "Z", "getShouldShowDateOfBirth", "getShouldShowEmptyDateOfBirth", "shouldShowEmptyDateOfBirth", "getShouldShowAnnualIncome", "shouldShowAnnualIncome", "getShouldShowNationalIdentification", "shouldShowNationalIdentification", "getShouldShowNationality", "shouldShowNationality", "getShouldSkipPersonalEditContainer", "shouldSkipPersonalEditContainer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FormSection {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;
    private final boolean shouldShowDateOfBirth;

    public FormSection(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.shouldShowDateOfBirth = true;
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final boolean getShowAllowPaypalContactLabel() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
        return i == 1 || i != 2;
    }

    public final boolean getShowPersonalInfoSubtitle() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
        return i == 1 || i != 2;
    }

    public final boolean getShowContactDisclaimer() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
        return i == 1 || i != 2;
    }

    public final boolean getShowRepaymentFrom() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
        if (i != 1) {
            return i == 2 || i == 3;
        }
        return false;
    }

    public final boolean getShouldShowDateOfBirth() {
        return this.shouldShowDateOfBirth;
    }

    public final boolean getShouldShowEmptyDateOfBirth() {
        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 2;
    }

    public final boolean getShouldShowAnnualIncome() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? false : true;
        }
        return true;
    }

    public final boolean getShouldShowNationalIdentification() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
        return i == 1 || i != 2;
    }

    public final boolean getShouldShowNationality() {
        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 3;
    }

    public final boolean getShouldSkipPersonalEditContainer() {
        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 2;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FormSection(ctx=");
        sb.append(configContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.ctx.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection) other).ctx);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection(ctx);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.IT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection formSection, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configContext = formSection.ctx;
        }
        return formSection.copy(configContext);
    }
}
