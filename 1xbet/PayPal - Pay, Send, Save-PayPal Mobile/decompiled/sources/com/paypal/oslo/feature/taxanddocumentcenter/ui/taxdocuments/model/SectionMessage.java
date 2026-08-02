package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage;", "", "<init>", "()V", "", "getMessage", "()Ljava/lang/String;", "message", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionType;", "getSectionType", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "SectionToolTipInfo", "SectionAvailabilityMessage", "SectionError", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionAvailabilityMessage;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionToolTipInfo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SectionMessage {
    public static final int $stable = 0;

    public abstract java.lang.String getMessage();

    public abstract com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSectionType();

    private SectionMessage() {
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionToolTipInfo;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage;", "", "message", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionToolTipInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "getSectionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SectionToolTipInfo extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection sectionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionToolTipInfo(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
            this.message = str;
            this.sectionType = taxReportSection;
        }

        @Override // com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSectionType() {
            return this.sectionType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection = this.sectionType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionToolTipInfo(message=");
            sb.append(str);
            sb.append(", sectionType=");
            sb.append(taxReportSection);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.sectionType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo sectionToolTipInfo = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, sectionToolTipInfo.message) && this.sectionType == sectionToolTipInfo.sectionType;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo copy(java.lang.String message, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection sectionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionType, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(message, sectionType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSectionType() {
            return this.sectionType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo sectionToolTipInfo, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sectionToolTipInfo.message;
            }
            if ((i & 2) != 0) {
                taxReportSection = sectionToolTipInfo.sectionType;
            }
            return sectionToolTipInfo.copy(str, taxReportSection);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionAvailabilityMessage;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage;", "", "message", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "experienceType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionAvailabilityMessage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "getSectionType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "getExperienceType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SectionAvailabilityMessage extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType;
        private final java.lang.String message;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection sectionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionAvailabilityMessage(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceType, "");
            this.message = str;
            this.sectionType = taxReportSection;
            this.experienceType = experienceType;
        }

        @Override // com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSectionType() {
            return this.sectionType;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType getExperienceType() {
            return this.experienceType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection = this.sectionType;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType = this.experienceType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionAvailabilityMessage(message=");
            sb.append(str);
            sb.append(", sectionType=");
            sb.append(taxReportSection);
            sb.append(", experienceType=");
            sb.append(experienceType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.message.hashCode() * 31) + this.sectionType.hashCode()) * 31) + this.experienceType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage sectionAvailabilityMessage = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, sectionAvailabilityMessage.message) && this.sectionType == sectionAvailabilityMessage.sectionType && this.experienceType == sectionAvailabilityMessage.experienceType;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage copy(java.lang.String message, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection sectionType, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceType, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(message, sectionType, experienceType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType getExperienceType() {
            return this.experienceType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSectionType() {
            return this.sectionType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage sectionAvailabilityMessage, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sectionAvailabilityMessage.message;
            }
            if ((i & 2) != 0) {
                taxReportSection = sectionAvailabilityMessage.sectionType;
            }
            if ((i & 4) != 0) {
                experienceType = sectionAvailabilityMessage.experienceType;
            }
            return sectionAvailabilityMessage.copy(str, taxReportSection, experienceType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage;", "", "message", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "getSectionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SectionError extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection sectionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionError(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
            this.message = str;
            this.sectionType = taxReportSection;
        }

        @Override // com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSectionType() {
            return this.sectionType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection = this.sectionType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionError(message=");
            sb.append(str);
            sb.append(", sectionType=");
            sb.append(taxReportSection);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.sectionType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError sectionError = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, sectionError.message) && this.sectionType == sectionError.sectionType;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError copy(java.lang.String message, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection sectionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionType, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError(message, sectionType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSectionType() {
            return this.sectionType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError sectionError, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sectionError.message;
            }
            if ((i & 2) != 0) {
                taxReportSection = sectionError.sectionType;
            }
            return sectionError.copy(str, taxReportSection);
        }
    }

    public /* synthetic */ SectionMessage(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
