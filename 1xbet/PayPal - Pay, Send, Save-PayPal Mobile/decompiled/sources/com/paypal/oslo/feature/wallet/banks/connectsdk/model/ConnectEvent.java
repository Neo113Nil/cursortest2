package com.paypal.oslo.feature.wallet.banks.connectsdk.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEvent;", "", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEventType;", "type", "", "message", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "credentialToken", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEventType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEventType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "component4", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEventType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEventType;", "getType", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getData", "getCredentialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConnectEvent {
    public static final int $stable = 8;
    private final java.lang.String credentialToken;
    private final java.util.Map<java.lang.String, java.lang.Object> data;
    private final java.lang.String message;
    private final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType type;

    public ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectEventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.type = connectEventType;
        this.message = str;
        this.data = map;
        this.credentialToken = str2;
    }

    public final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType getType() {
        return this.type;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public /* synthetic */ ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType, java.lang.String str, java.util.Map map, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(connectEventType, str, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 8) != 0 ? null : str2);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType = this.type;
        java.lang.String str = this.message;
        java.util.Map<java.lang.String, java.lang.Object> map = this.data;
        java.lang.String str2 = this.credentialToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectEvent(type=");
        sb.append(connectEventType);
        sb.append(", message=");
        sb.append(str);
        sb.append(", data=");
        sb.append(map);
        sb.append(", credentialToken=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        int hashCode2 = this.message.hashCode();
        int hashCode3 = this.data.hashCode();
        java.lang.String str = this.credentialToken;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent connectEvent = (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent) other;
        return this.type == connectEvent.type && kotlin.jvm.internal.Intrinsics.areEqual(this.message, connectEvent.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, connectEvent.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, connectEvent.credentialToken);
    }

    public final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent copy(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType type, java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> data, java.lang.String credentialToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent(type, message, data, credentialToken);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent copy$default(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent connectEvent, com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType, java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            connectEventType = connectEvent.type;
        }
        if ((i & 2) != 0) {
            str = connectEvent.message;
        }
        if ((i & 4) != 0) {
            map = connectEvent.data;
        }
        if ((i & 8) != 0) {
            str2 = connectEvent.credentialToken;
        }
        return connectEvent.copy(connectEventType, str, map, str2);
    }
}
