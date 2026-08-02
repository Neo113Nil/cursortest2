package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardMetadata;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/ConsentLevel;", "consentLevel", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsConsentMetadata;", "consentMetadata", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsMetadata;", "threeDsMetadata", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/ConsentLevel;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsMetadata;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/ConsentLevel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsMetadata;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/ConsentLevel;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsMetadata;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/ConsentLevel;", "getConsentLevel", "Ljava/util/List;", "getConsentMetadata", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsMetadata;", "getThreeDsMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardMetadata {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel consentLevel;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsConsentMetadata> consentMetadata;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata threeDsMetadata;

    public CardMetadata(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel consentLevel, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsConsentMetadata> list, com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata threeDsMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentLevel, "");
        this.consentLevel = consentLevel;
        this.consentMetadata = list;
        this.threeDsMetadata = threeDsMetadata;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel getConsentLevel() {
        return this.consentLevel;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsConsentMetadata> getConsentMetadata() {
        return this.consentMetadata;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata getThreeDsMetadata() {
        return this.threeDsMetadata;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel consentLevel = this.consentLevel;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsConsentMetadata> list = this.consentMetadata;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata threeDsMetadata = this.threeDsMetadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardMetadata(consentLevel=");
        sb.append(consentLevel);
        sb.append(", consentMetadata=");
        sb.append(list);
        sb.append(", threeDsMetadata=");
        sb.append(threeDsMetadata);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.consentLevel.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsConsentMetadata> list = this.consentMetadata;
        int hashCode2 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata threeDsMetadata = this.threeDsMetadata;
        return (((hashCode * 31) + hashCode2) * 31) + (threeDsMetadata != null ? threeDsMetadata.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardMetadata cardMetadata = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardMetadata) other;
        return this.consentLevel == cardMetadata.consentLevel && kotlin.jvm.internal.Intrinsics.areEqual(this.consentMetadata, cardMetadata.consentMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDsMetadata, cardMetadata.threeDsMetadata);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardMetadata copy(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel consentLevel, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsConsentMetadata> consentMetadata, com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata threeDsMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentLevel, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardMetadata(consentLevel, consentMetadata, threeDsMetadata);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata getThreeDsMetadata() {
        return this.threeDsMetadata;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsConsentMetadata> component2() {
        return this.consentMetadata;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel getConsentLevel() {
        return this.consentLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardMetadata copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardMetadata cardMetadata, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel consentLevel, java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata threeDsMetadata, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            consentLevel = cardMetadata.consentLevel;
        }
        if ((i & 2) != 0) {
            list = cardMetadata.consentMetadata;
        }
        if ((i & 4) != 0) {
            threeDsMetadata = cardMetadata.threeDsMetadata;
        }
        return cardMetadata.copy(consentLevel, list, threeDsMetadata);
    }
}
