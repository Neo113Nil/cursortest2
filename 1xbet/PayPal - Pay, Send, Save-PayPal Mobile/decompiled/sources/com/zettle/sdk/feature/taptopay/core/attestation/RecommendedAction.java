package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJN\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b$\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "", "", "intent", "", "includePackage", "message", "", "errorCode", "action", "messageKey", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()I", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getAction", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Z", "getIncludePackage", "getIntent", "getMessage", "getMessageKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecommendedAction {
    private final java.lang.String action;
    private final int errorCode;
    private final boolean includePackage;
    private final java.lang.String intent;
    private final java.lang.String message;
    private final java.lang.String messageKey;

    public RecommendedAction(java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.intent = str;
        this.includePackage = z;
        this.message = str2;
        this.errorCode = i;
        this.action = str3;
        this.messageKey = str4;
    }

    public /* synthetic */ RecommendedAction(java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? i : 0, (i2 & 16) != 0 ? "" : str3, (i2 & 32) == 0 ? str4 : "");
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final boolean getIncludePackage() {
        return this.includePackage;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String getMessageKey() {
        return this.messageKey;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.intent;
        boolean z = this.includePackage;
        java.lang.String str2 = this.message;
        int i = this.errorCode;
        java.lang.String str3 = this.action;
        java.lang.String str4 = this.messageKey;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecommendedAction(intent=");
        sb.append(str);
        sb.append(", includePackage=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", errorCode=");
        sb.append(i);
        sb.append(", action=");
        sb.append(str3);
        sb.append(", messageKey=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        java.lang.String str = this.intent;
        int hashCode = str == null ? 0 : str.hashCode();
        boolean z = this.includePackage;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((((hashCode * 31) + i) * 31) + this.message.hashCode()) * 31) + java.lang.Integer.hashCode(this.errorCode)) * 31) + this.action.hashCode()) * 31) + this.messageKey.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction = (com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intent, recommendedAction.intent) && this.includePackage == recommendedAction.includePackage && kotlin.jvm.internal.Intrinsics.areEqual(this.message, recommendedAction.message) && this.errorCode == recommendedAction.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.action, recommendedAction.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageKey, recommendedAction.messageKey);
    }

    public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction copy(java.lang.String intent, boolean includePackage, java.lang.String message, int errorCode, java.lang.String action, java.lang.String messageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageKey, "");
        return new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction(intent, includePackage, message, errorCode, action, messageKey);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMessageKey() {
        return this.messageKey;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIncludePackage() {
        return this.includePackage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIntent() {
        return this.intent;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction copy$default(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendedAction.intent;
        }
        if ((i2 & 2) != 0) {
            z = recommendedAction.includePackage;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            str2 = recommendedAction.message;
        }
        java.lang.String str5 = str2;
        if ((i2 & 8) != 0) {
            i = recommendedAction.errorCode;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = recommendedAction.action;
        }
        java.lang.String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = recommendedAction.messageKey;
        }
        return recommendedAction.copy(str, z2, str5, i3, str6, str4);
    }
}
