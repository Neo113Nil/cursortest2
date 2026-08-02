package com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "getType", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "type", "PayInStoreVCCSection", "PayInStoreSection", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection$PayInStoreSection;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection$PayInStoreVCCSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PayLaterHubSection {
    public static final int $stable = 0;

    public abstract com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType getType();

    private PayLaterHubSection() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0092\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b3\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b4\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b5\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b6\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b7\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b8\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b9\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b:\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b;\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection$PayInStoreVCCSection;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "type", "", "title", "expiryText", "url", "thumbnailUrl", "formattedCurrency", "instoreSectionHeader", "instoreEntryPointCardTitle", "instoreEntryPointSectionHeader", "instoreEntryPointCardSubtitle", "instoreEntryPointActionButtonText", "instoreCardFooterText", "singleUseText", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection$PayInStoreVCCSection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "getType", "Ljava/lang/String;", "getTitle", "getExpiryText", "getUrl", "getThumbnailUrl", "getFormattedCurrency", "getInstoreSectionHeader", "getInstoreEntryPointCardTitle", "getInstoreEntryPointSectionHeader", "getInstoreEntryPointCardSubtitle", "getInstoreEntryPointActionButtonText", "getInstoreCardFooterText", "getSingleUseText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayInStoreVCCSection extends com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection {
        public static final int $stable = 0;
        private final java.lang.String expiryText;
        private final java.lang.String formattedCurrency;
        private final java.lang.String instoreCardFooterText;
        private final java.lang.String instoreEntryPointActionButtonText;
        private final java.lang.String instoreEntryPointCardSubtitle;
        private final java.lang.String instoreEntryPointCardTitle;
        private final java.lang.String instoreEntryPointSectionHeader;
        private final java.lang.String instoreSectionHeader;
        private final java.lang.String singleUseText;
        private final java.lang.String thumbnailUrl;
        private final java.lang.String title;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType type;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayInStoreVCCSection(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType payLaterHubSectionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubSectionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "");
            this.type = payLaterHubSectionType;
            this.title = str;
            this.expiryText = str2;
            this.url = str3;
            this.thumbnailUrl = str4;
            this.formattedCurrency = str5;
            this.instoreSectionHeader = str6;
            this.instoreEntryPointCardTitle = str7;
            this.instoreEntryPointSectionHeader = str8;
            this.instoreEntryPointCardSubtitle = str9;
            this.instoreEntryPointActionButtonText = str10;
            this.instoreCardFooterText = str11;
            this.singleUseText = str12;
        }

        public /* synthetic */ PayInStoreVCCSection(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType payLaterHubSectionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType.IN_STORE_SECTION : payLaterHubSectionType, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection
        public final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType getType() {
            return this.type;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getExpiryText() {
            return this.expiryText;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public final java.lang.String getFormattedCurrency() {
            return this.formattedCurrency;
        }

        public final java.lang.String getInstoreSectionHeader() {
            return this.instoreSectionHeader;
        }

        public final java.lang.String getInstoreEntryPointCardTitle() {
            return this.instoreEntryPointCardTitle;
        }

        public final java.lang.String getInstoreEntryPointSectionHeader() {
            return this.instoreEntryPointSectionHeader;
        }

        public final java.lang.String getInstoreEntryPointCardSubtitle() {
            return this.instoreEntryPointCardSubtitle;
        }

        public final java.lang.String getInstoreEntryPointActionButtonText() {
            return this.instoreEntryPointActionButtonText;
        }

        public final java.lang.String getInstoreCardFooterText() {
            return this.instoreCardFooterText;
        }

        public final java.lang.String getSingleUseText() {
            return this.singleUseText;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType payLaterHubSectionType = this.type;
            java.lang.String str = this.title;
            java.lang.String str2 = this.expiryText;
            java.lang.String str3 = this.url;
            java.lang.String str4 = this.thumbnailUrl;
            java.lang.String str5 = this.formattedCurrency;
            java.lang.String str6 = this.instoreSectionHeader;
            java.lang.String str7 = this.instoreEntryPointCardTitle;
            java.lang.String str8 = this.instoreEntryPointSectionHeader;
            java.lang.String str9 = this.instoreEntryPointCardSubtitle;
            java.lang.String str10 = this.instoreEntryPointActionButtonText;
            java.lang.String str11 = this.instoreCardFooterText;
            java.lang.String str12 = this.singleUseText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PayInStoreVCCSection(type=");
            sb.append(payLaterHubSectionType);
            sb.append(", title=");
            sb.append(str);
            sb.append(", expiryText=");
            sb.append(str2);
            sb.append(", url=");
            sb.append(str3);
            sb.append(", thumbnailUrl=");
            sb.append(str4);
            sb.append(", formattedCurrency=");
            sb.append(str5);
            sb.append(", instoreSectionHeader=");
            sb.append(str6);
            sb.append(", instoreEntryPointCardTitle=");
            sb.append(str7);
            sb.append(", instoreEntryPointSectionHeader=");
            sb.append(str8);
            sb.append(", instoreEntryPointCardSubtitle=");
            sb.append(str9);
            sb.append(", instoreEntryPointActionButtonText=");
            sb.append(str10);
            sb.append(", instoreCardFooterText=");
            sb.append(str11);
            sb.append(", singleUseText=");
            sb.append(str12);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((((((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.expiryText.hashCode()) * 31) + this.url.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + this.formattedCurrency.hashCode()) * 31) + this.instoreSectionHeader.hashCode()) * 31) + this.instoreEntryPointCardTitle.hashCode()) * 31) + this.instoreEntryPointSectionHeader.hashCode()) * 31) + this.instoreEntryPointCardSubtitle.hashCode()) * 31) + this.instoreEntryPointActionButtonText.hashCode()) * 31) + this.instoreCardFooterText.hashCode()) * 31) + this.singleUseText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreVCCSection)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreVCCSection payInStoreVCCSection = (com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreVCCSection) other;
            return this.type == payInStoreVCCSection.type && kotlin.jvm.internal.Intrinsics.areEqual(this.title, payInStoreVCCSection.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryText, payInStoreVCCSection.expiryText) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, payInStoreVCCSection.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailUrl, payInStoreVCCSection.thumbnailUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedCurrency, payInStoreVCCSection.formattedCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreSectionHeader, payInStoreVCCSection.instoreSectionHeader) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointCardTitle, payInStoreVCCSection.instoreEntryPointCardTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointSectionHeader, payInStoreVCCSection.instoreEntryPointSectionHeader) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointCardSubtitle, payInStoreVCCSection.instoreEntryPointCardSubtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointActionButtonText, payInStoreVCCSection.instoreEntryPointActionButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreCardFooterText, payInStoreVCCSection.instoreCardFooterText) && kotlin.jvm.internal.Intrinsics.areEqual(this.singleUseText, payInStoreVCCSection.singleUseText);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreVCCSection copy(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType type, java.lang.String title, java.lang.String expiryText, java.lang.String url, java.lang.String thumbnailUrl, java.lang.String formattedCurrency, java.lang.String instoreSectionHeader, java.lang.String instoreEntryPointCardTitle, java.lang.String instoreEntryPointSectionHeader, java.lang.String instoreEntryPointCardSubtitle, java.lang.String instoreEntryPointActionButtonText, java.lang.String instoreCardFooterText, java.lang.String singleUseText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thumbnailUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedCurrency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreSectionHeader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointCardTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointSectionHeader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointCardSubtitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointActionButtonText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreCardFooterText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleUseText, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreVCCSection(type, title, expiryText, url, thumbnailUrl, formattedCurrency, instoreSectionHeader, instoreEntryPointCardTitle, instoreEntryPointSectionHeader, instoreEntryPointCardSubtitle, instoreEntryPointActionButtonText, instoreCardFooterText, singleUseText);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getInstoreEntryPointSectionHeader() {
            return this.instoreEntryPointSectionHeader;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getInstoreEntryPointCardTitle() {
            return this.instoreEntryPointCardTitle;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getInstoreSectionHeader() {
            return this.instoreSectionHeader;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFormattedCurrency() {
            return this.formattedCurrency;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExpiryText() {
            return this.expiryText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getSingleUseText() {
            return this.singleUseText;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getInstoreCardFooterText() {
            return this.instoreCardFooterText;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getInstoreEntryPointActionButtonText() {
            return this.instoreEntryPointActionButtonText;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getInstoreEntryPointCardSubtitle() {
            return this.instoreEntryPointCardSubtitle;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType getType() {
            return this.type;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0088\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b2\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b3\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b4\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b5\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b7\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b8\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection$PayInStoreSection;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "type", "", "title", "url", "thumbnailUrl", "instoreSectionHeader", "instoreEntryPointSectionHeader", "instoreEntryPointCardSubtitle", "instoreEntryPointActionButtonText", "instoreCardFooterText", "singleUseText", "deepLink", "instoreEntryPointNewBadgeText", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSection$PayInStoreSection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubSectionType;", "getType", "Ljava/lang/String;", "getTitle", "getUrl", "getThumbnailUrl", "getInstoreSectionHeader", "getInstoreEntryPointSectionHeader", "getInstoreEntryPointCardSubtitle", "getInstoreEntryPointActionButtonText", "getInstoreCardFooterText", "getSingleUseText", "getDeepLink", "getInstoreEntryPointNewBadgeText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayInStoreSection extends com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection {
        public static final int $stable = 0;
        private final java.lang.String deepLink;
        private final java.lang.String instoreCardFooterText;
        private final java.lang.String instoreEntryPointActionButtonText;
        private final java.lang.String instoreEntryPointCardSubtitle;
        private final java.lang.String instoreEntryPointNewBadgeText;
        private final java.lang.String instoreEntryPointSectionHeader;
        private final java.lang.String instoreSectionHeader;
        private final java.lang.String singleUseText;
        private final java.lang.String thumbnailUrl;
        private final java.lang.String title;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType type;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayInStoreSection(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType payLaterHubSectionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubSectionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
            this.type = payLaterHubSectionType;
            this.title = str;
            this.url = str2;
            this.thumbnailUrl = str3;
            this.instoreSectionHeader = str4;
            this.instoreEntryPointSectionHeader = str5;
            this.instoreEntryPointCardSubtitle = str6;
            this.instoreEntryPointActionButtonText = str7;
            this.instoreCardFooterText = str8;
            this.singleUseText = str9;
            this.deepLink = str10;
            this.instoreEntryPointNewBadgeText = str11;
        }

        public /* synthetic */ PayInStoreSection(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType payLaterHubSectionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType.IN_STORE_SECTION : payLaterHubSectionType, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection
        public final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType getType() {
            return this.type;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public final java.lang.String getInstoreSectionHeader() {
            return this.instoreSectionHeader;
        }

        public final java.lang.String getInstoreEntryPointSectionHeader() {
            return this.instoreEntryPointSectionHeader;
        }

        public final java.lang.String getInstoreEntryPointCardSubtitle() {
            return this.instoreEntryPointCardSubtitle;
        }

        public final java.lang.String getInstoreEntryPointActionButtonText() {
            return this.instoreEntryPointActionButtonText;
        }

        public final java.lang.String getInstoreCardFooterText() {
            return this.instoreCardFooterText;
        }

        public final java.lang.String getSingleUseText() {
            return this.singleUseText;
        }

        public final java.lang.String getDeepLink() {
            return this.deepLink;
        }

        public final java.lang.String getInstoreEntryPointNewBadgeText() {
            return this.instoreEntryPointNewBadgeText;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType payLaterHubSectionType = this.type;
            java.lang.String str = this.title;
            java.lang.String str2 = this.url;
            java.lang.String str3 = this.thumbnailUrl;
            java.lang.String str4 = this.instoreSectionHeader;
            java.lang.String str5 = this.instoreEntryPointSectionHeader;
            java.lang.String str6 = this.instoreEntryPointCardSubtitle;
            java.lang.String str7 = this.instoreEntryPointActionButtonText;
            java.lang.String str8 = this.instoreCardFooterText;
            java.lang.String str9 = this.singleUseText;
            java.lang.String str10 = this.deepLink;
            java.lang.String str11 = this.instoreEntryPointNewBadgeText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PayInStoreSection(type=");
            sb.append(payLaterHubSectionType);
            sb.append(", title=");
            sb.append(str);
            sb.append(", url=");
            sb.append(str2);
            sb.append(", thumbnailUrl=");
            sb.append(str3);
            sb.append(", instoreSectionHeader=");
            sb.append(str4);
            sb.append(", instoreEntryPointSectionHeader=");
            sb.append(str5);
            sb.append(", instoreEntryPointCardSubtitle=");
            sb.append(str6);
            sb.append(", instoreEntryPointActionButtonText=");
            sb.append(str7);
            sb.append(", instoreCardFooterText=");
            sb.append(str8);
            sb.append(", singleUseText=");
            sb.append(str9);
            sb.append(", deepLink=");
            sb.append(str10);
            sb.append(", instoreEntryPointNewBadgeText=");
            sb.append(str11);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + this.instoreSectionHeader.hashCode()) * 31) + this.instoreEntryPointSectionHeader.hashCode()) * 31) + this.instoreEntryPointCardSubtitle.hashCode()) * 31) + this.instoreEntryPointActionButtonText.hashCode()) * 31) + this.instoreCardFooterText.hashCode()) * 31) + this.singleUseText.hashCode()) * 31) + this.deepLink.hashCode()) * 31) + this.instoreEntryPointNewBadgeText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreSection)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreSection payInStoreSection = (com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreSection) other;
            return this.type == payInStoreSection.type && kotlin.jvm.internal.Intrinsics.areEqual(this.title, payInStoreSection.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, payInStoreSection.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailUrl, payInStoreSection.thumbnailUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreSectionHeader, payInStoreSection.instoreSectionHeader) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointSectionHeader, payInStoreSection.instoreEntryPointSectionHeader) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointCardSubtitle, payInStoreSection.instoreEntryPointCardSubtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointActionButtonText, payInStoreSection.instoreEntryPointActionButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreCardFooterText, payInStoreSection.instoreCardFooterText) && kotlin.jvm.internal.Intrinsics.areEqual(this.singleUseText, payInStoreSection.singleUseText) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, payInStoreSection.deepLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEntryPointNewBadgeText, payInStoreSection.instoreEntryPointNewBadgeText);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreSection copy(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType type, java.lang.String title, java.lang.String url, java.lang.String thumbnailUrl, java.lang.String instoreSectionHeader, java.lang.String instoreEntryPointSectionHeader, java.lang.String instoreEntryPointCardSubtitle, java.lang.String instoreEntryPointActionButtonText, java.lang.String instoreCardFooterText, java.lang.String singleUseText, java.lang.String deepLink, java.lang.String instoreEntryPointNewBadgeText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thumbnailUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreSectionHeader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointSectionHeader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointCardSubtitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointActionButtonText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreCardFooterText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleUseText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEntryPointNewBadgeText, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSection.PayInStoreSection(type, title, url, thumbnailUrl, instoreSectionHeader, instoreEntryPointSectionHeader, instoreEntryPointCardSubtitle, instoreEntryPointActionButtonText, instoreCardFooterText, singleUseText, deepLink, instoreEntryPointNewBadgeText);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getInstoreCardFooterText() {
            return this.instoreCardFooterText;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getInstoreEntryPointActionButtonText() {
            return this.instoreEntryPointActionButtonText;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getInstoreEntryPointCardSubtitle() {
            return this.instoreEntryPointCardSubtitle;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getInstoreEntryPointSectionHeader() {
            return this.instoreEntryPointSectionHeader;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getInstoreSectionHeader() {
            return this.instoreSectionHeader;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getInstoreEntryPointNewBadgeText() {
            return this.instoreEntryPointNewBadgeText;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getDeepLink() {
            return this.deepLink;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getSingleUseText() {
            return this.singleUseText;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubSectionType getType() {
            return this.type;
        }
    }

    public /* synthetic */ PayLaterHubSection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
