package com.paypal.oslo.feature.packagetracking.domain.model.display;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ<\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/EmailAccountsData;", "", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "linkedEmailProviders", "unlinkBySystemProviders", "paypalAccountEmail", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/domain/model/display/EmailAccountsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getLinkedEmailProviders", "getUnlinkBySystemProviders", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getPaypalAccountEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmailAccountsData {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> linkedEmailProviders;
    private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider paypalAccountEmail;
    private final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> unlinkBySystemProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public EmailAccountsData(java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> list, java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> list2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.linkedEmailProviders = list;
        this.unlinkBySystemProviders = list2;
        this.paypalAccountEmail = emailProvider;
    }

    public /* synthetic */ EmailAccountsData(java.util.List list, java.util.List list2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : emailProvider);
    }

    public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> getLinkedEmailProviders() {
        return this.linkedEmailProviders;
    }

    public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> getUnlinkBySystemProviders() {
        return this.unlinkBySystemProviders;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getPaypalAccountEmail() {
        return this.paypalAccountEmail;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> list = this.linkedEmailProviders;
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> list2 = this.unlinkBySystemProviders;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.paypalAccountEmail;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailAccountsData(linkedEmailProviders=");
        sb.append(list);
        sb.append(", unlinkBySystemProviders=");
        sb.append(list2);
        sb.append(", paypalAccountEmail=");
        sb.append(emailProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.linkedEmailProviders.hashCode();
        int hashCode2 = this.unlinkBySystemProviders.hashCode();
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.paypalAccountEmail;
        return (((hashCode * 31) + hashCode2) * 31) + (emailProvider == null ? 0 : emailProvider.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData emailAccountsData = (com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedEmailProviders, emailAccountsData.linkedEmailProviders) && kotlin.jvm.internal.Intrinsics.areEqual(this.unlinkBySystemProviders, emailAccountsData.unlinkBySystemProviders) && this.paypalAccountEmail == emailAccountsData.paypalAccountEmail;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData copy(java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> linkedEmailProviders, java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> unlinkBySystemProviders, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider paypalAccountEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedEmailProviders, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlinkBySystemProviders, "");
        return new com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData(linkedEmailProviders, unlinkBySystemProviders, paypalAccountEmail);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getPaypalAccountEmail() {
        return this.paypalAccountEmail;
    }

    public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> component2() {
        return this.unlinkBySystemProviders;
    }

    public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> component1() {
        return this.linkedEmailProviders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData copy$default(com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData emailAccountsData, java.util.List list, java.util.List list2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = emailAccountsData.linkedEmailProviders;
        }
        if ((i & 2) != 0) {
            list2 = emailAccountsData.unlinkBySystemProviders;
        }
        if ((i & 4) != 0) {
            emailProvider = emailAccountsData.paypalAccountEmail;
        }
        return emailAccountsData.copy(list, list2, emailProvider);
    }

    public EmailAccountsData() {
        this(null, null, null, 7, null);
    }
}
