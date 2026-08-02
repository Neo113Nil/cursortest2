package com.paypal.oslo.feature.bnplacquisition.logger;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/logger/ScreenEventAttributes;", "", "", "sessionId", "creditProductIdentifier", "flowAttribute", "flowSpecifier", "flowOutcome", "creditAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/logger/ScreenEventAttributes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId", "getCreditProductIdentifier", "getFlowAttribute", "getFlowSpecifier", "getFlowOutcome", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ScreenEventAttributes {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final java.lang.String creditProductIdentifier;
    private final java.lang.String flowAttribute;
    private final java.lang.String flowOutcome;
    private final java.lang.String flowSpecifier;
    private final java.lang.String sessionId;

    public ScreenEventAttributes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.sessionId = str;
        this.creditProductIdentifier = str2;
        this.flowAttribute = str3;
        this.flowSpecifier = str4;
        this.flowOutcome = str5;
        this.creditAccountId = str6;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getFlowAttribute() {
        return this.flowAttribute;
    }

    public final java.lang.String getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public final java.lang.String getFlowOutcome() {
        return this.flowOutcome;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sessionId;
        java.lang.String str2 = this.creditProductIdentifier;
        java.lang.String str3 = this.flowAttribute;
        java.lang.String str4 = this.flowSpecifier;
        java.lang.String str5 = this.flowOutcome;
        java.lang.String str6 = this.creditAccountId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenEventAttributes(sessionId=");
        sb.append(str);
        sb.append(", creditProductIdentifier=");
        sb.append(str2);
        sb.append(", flowAttribute=");
        sb.append(str3);
        sb.append(", flowSpecifier=");
        sb.append(str4);
        sb.append(", flowOutcome=");
        sb.append(str5);
        sb.append(", creditAccountId=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.sessionId.hashCode() * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.flowAttribute.hashCode()) * 31) + this.flowSpecifier.hashCode()) * 31) + this.flowOutcome.hashCode()) * 31) + this.creditAccountId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.logger.ScreenEventAttributes)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.logger.ScreenEventAttributes screenEventAttributes = (com.paypal.oslo.feature.bnplacquisition.logger.ScreenEventAttributes) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, screenEventAttributes.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifier, screenEventAttributes.creditProductIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowAttribute, screenEventAttributes.flowAttribute) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowSpecifier, screenEventAttributes.flowSpecifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowOutcome, screenEventAttributes.flowOutcome) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, screenEventAttributes.creditAccountId);
    }

    public final com.paypal.oslo.feature.bnplacquisition.logger.ScreenEventAttributes copy(java.lang.String sessionId, java.lang.String creditProductIdentifier, java.lang.String flowAttribute, java.lang.String flowSpecifier, java.lang.String flowOutcome, java.lang.String creditAccountId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowAttribute, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowOutcome, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        return new com.paypal.oslo.feature.bnplacquisition.logger.ScreenEventAttributes(sessionId, creditProductIdentifier, flowAttribute, flowSpecifier, flowOutcome, creditAccountId);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFlowOutcome() {
        return this.flowOutcome;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFlowSpecifier() {
        return this.flowSpecifier;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFlowAttribute() {
        return this.flowAttribute;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.logger.ScreenEventAttributes copy$default(com.paypal.oslo.feature.bnplacquisition.logger.ScreenEventAttributes screenEventAttributes, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = screenEventAttributes.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = screenEventAttributes.creditProductIdentifier;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = screenEventAttributes.flowAttribute;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = screenEventAttributes.flowSpecifier;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = screenEventAttributes.flowOutcome;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = screenEventAttributes.creditAccountId;
        }
        return screenEventAttributes.copy(str, str7, str8, str9, str10, str6);
    }
}
