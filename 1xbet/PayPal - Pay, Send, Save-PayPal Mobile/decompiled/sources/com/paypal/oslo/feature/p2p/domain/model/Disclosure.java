package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jx\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b+\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b,\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "", "", "type", "", "priority", "maxDuration", "holdDuration", "expiryTime", "email", "scamUrl", "linkText", "linkUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getType", com.visa.cbp.getEncExpo.warmup, "getPriority", "getMaxDuration", "getHoldDuration", "getExpiryTime", "getEmail", "getScamUrl", "getLinkText", "getLinkUrl", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Disclosure {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.domain.model.Disclosure.Companion INSTANCE = new com.paypal.oslo.feature.p2p.domain.model.Disclosure.Companion(null);
    private static final java.util.Set<java.lang.String> PAYMENT_LINK_TYPENAMES = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"PaymentLinkAchDisclosure", "PaymentLinkGenericDisclosure", "PaymentLinkAchWithTermDisclosure", "PaymentLinkGenericWithTermDisclosure"});
    public static final java.lang.String TYPENAME_BANK_ACCOUNT_ECHECK = "BankAccountEcheckDisclosure";
    public static final java.lang.String TYPENAME_FOREIGN_TAX_DISCLOSURE = "ForeignTaxDisclosure";
    public static final java.lang.String TYPENAME_PREFIX_PAYMENT_LINK = "PaymentLink";
    public static final java.lang.String TYPENAME_QUASI_CASH = "QuasiCashDisclosure";
    public static final int UNKNOWN_DISCLOSURE_PRIORITY = 0;
    private final java.lang.String email;
    private final java.lang.String expiryTime;
    private final java.lang.String holdDuration;
    private final java.lang.String linkText;
    private final java.lang.String linkUrl;
    private final java.lang.String maxDuration;
    private final int priority;
    private final java.lang.String scamUrl;
    private final java.lang.String type;

    public Disclosure(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.priority = i;
        this.maxDuration = str2;
        this.holdDuration = str3;
        this.expiryTime = str4;
        this.email = str5;
        this.scamUrl = str6;
        this.linkText = str7;
        this.linkUrl = str8;
    }

    public /* synthetic */ Disclosure(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final java.lang.String getMaxDuration() {
        return this.maxDuration;
    }

    public final java.lang.String getHoldDuration() {
        return this.holdDuration;
    }

    public final java.lang.String getExpiryTime() {
        return this.expiryTime;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getScamUrl() {
        return this.scamUrl;
    }

    public final java.lang.String getLinkText() {
        return this.linkText;
    }

    public final java.lang.String getLinkUrl() {
        return this.linkUrl;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure$Companion;", "", "<init>", "()V", "", "UNKNOWN_DISCLOSURE_PRIORITY", com.visa.cbp.getEncExpo.warmup, "", "TYPENAME_QUASI_CASH", "Ljava/lang/String;", "TYPENAME_BANK_ACCOUNT_ECHECK", "TYPENAME_PREFIX_PAYMENT_LINK", "TYPENAME_FOREIGN_TAX_DISCLOSURE", "", "PAYMENT_LINK_TYPENAMES", "Ljava/util/Set;", "getPAYMENT_LINK_TYPENAMES", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<java.lang.String> getPAYMENT_LINK_TYPENAMES() {
            return com.paypal.oslo.feature.p2p.domain.model.Disclosure.PAYMENT_LINK_TYPENAMES;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        int i = this.priority;
        java.lang.String str2 = this.maxDuration;
        java.lang.String str3 = this.holdDuration;
        java.lang.String str4 = this.expiryTime;
        java.lang.String str5 = this.email;
        java.lang.String str6 = this.scamUrl;
        java.lang.String str7 = this.linkText;
        java.lang.String str8 = this.linkUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Disclosure(type=");
        sb.append(str);
        sb.append(", priority=");
        sb.append(i);
        sb.append(", maxDuration=");
        sb.append(str2);
        sb.append(", holdDuration=");
        sb.append(str3);
        sb.append(", expiryTime=");
        sb.append(str4);
        sb.append(", email=");
        sb.append(str5);
        sb.append(", scamUrl=");
        sb.append(str6);
        sb.append(", linkText=");
        sb.append(str7);
        sb.append(", linkUrl=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.priority);
        java.lang.String str = this.maxDuration;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.holdDuration;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.expiryTime;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.email;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.scamUrl;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.linkText;
        int hashCode8 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.linkUrl;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.Disclosure)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.Disclosure disclosure = (com.paypal.oslo.feature.p2p.domain.model.Disclosure) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, disclosure.type) && this.priority == disclosure.priority && kotlin.jvm.internal.Intrinsics.areEqual(this.maxDuration, disclosure.maxDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdDuration, disclosure.holdDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryTime, disclosure.expiryTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, disclosure.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.scamUrl, disclosure.scamUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkText, disclosure.linkText) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkUrl, disclosure.linkUrl);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Disclosure copy(java.lang.String type, int priority, java.lang.String maxDuration, java.lang.String holdDuration, java.lang.String expiryTime, java.lang.String email, java.lang.String scamUrl, java.lang.String linkText, java.lang.String linkUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(type, priority, maxDuration, holdDuration, expiryTime, email, scamUrl, linkText, linkUrl);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getLinkUrl() {
        return this.linkUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getLinkText() {
        return this.linkText;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getScamUrl() {
        return this.scamUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getExpiryTime() {
        return this.expiryTime;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getHoldDuration() {
        return this.holdDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMaxDuration() {
        return this.maxDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }
}
