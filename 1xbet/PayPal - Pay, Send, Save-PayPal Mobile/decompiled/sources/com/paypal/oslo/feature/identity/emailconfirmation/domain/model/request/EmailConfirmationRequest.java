package com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/request/EmailConfirmationRequest;", "", "", "encryptedEmail", "confirmationCode", "encryptedCustomerId", "source", "sourceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/request/EmailConfirmationRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEncryptedEmail", "getConfirmationCode", "getEncryptedCustomerId", "getSource", "getSourceType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmailConfirmationRequest {
    public static final int $stable = 0;
    private final java.lang.String confirmationCode;
    private final java.lang.String encryptedCustomerId;
    private final java.lang.String encryptedEmail;
    private final java.lang.String source;
    private final java.lang.String sourceType;

    public EmailConfirmationRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.encryptedEmail = str;
        this.confirmationCode = str2;
        this.encryptedCustomerId = str3;
        this.source = str4;
        this.sourceType = str5;
    }

    public /* synthetic */ EmailConfirmationRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final java.lang.String getEncryptedEmail() {
        return this.encryptedEmail;
    }

    public final java.lang.String getConfirmationCode() {
        return this.confirmationCode;
    }

    public final java.lang.String getEncryptedCustomerId() {
        return this.encryptedCustomerId;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String getSourceType() {
        return this.sourceType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.encryptedEmail;
        java.lang.String str2 = this.confirmationCode;
        java.lang.String str3 = this.encryptedCustomerId;
        java.lang.String str4 = this.source;
        java.lang.String str5 = this.sourceType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailConfirmationRequest(encryptedEmail=");
        sb.append(str);
        sb.append(", confirmationCode=");
        sb.append(str2);
        sb.append(", encryptedCustomerId=");
        sb.append(str3);
        sb.append(", source=");
        sb.append(str4);
        sb.append(", sourceType=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.encryptedEmail.hashCode();
        int hashCode2 = this.confirmationCode.hashCode();
        java.lang.String str = this.encryptedCustomerId;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.source;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.sourceType;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest emailConfirmationRequest = (com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedEmail, emailConfirmationRequest.encryptedEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationCode, emailConfirmationRequest.confirmationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedCustomerId, emailConfirmationRequest.encryptedCustomerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, emailConfirmationRequest.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceType, emailConfirmationRequest.sourceType);
    }

    public final com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest copy(java.lang.String encryptedEmail, java.lang.String confirmationCode, java.lang.String encryptedCustomerId, java.lang.String source, java.lang.String sourceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedEmail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationCode, "");
        return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest(encryptedEmail, confirmationCode, encryptedCustomerId, source, sourceType);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSourceType() {
        return this.sourceType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEncryptedCustomerId() {
        return this.encryptedCustomerId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getConfirmationCode() {
        return this.confirmationCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEncryptedEmail() {
        return this.encryptedEmail;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest copy$default(com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest emailConfirmationRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailConfirmationRequest.encryptedEmail;
        }
        if ((i & 2) != 0) {
            str2 = emailConfirmationRequest.confirmationCode;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = emailConfirmationRequest.encryptedCustomerId;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = emailConfirmationRequest.source;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = emailConfirmationRequest.sourceType;
        }
        return emailConfirmationRequest.copy(str, str6, str7, str8, str5);
    }
}
