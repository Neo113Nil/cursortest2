package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010&\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequestImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/meta/AppInfo;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "p1", "Lcom/zettle/sdk/meta/PlatformInfo;", "p2", "Lcom/zettle/sdk/core/os/LocationData;", "p3", "<init>", "(Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)V", "", "amount", "(J)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;", "", "context", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "deviceIdentifier", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "identifier", "Ljava/util/UUID;", "localId", "(Ljava/util/UUID;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "paymentProperties", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;", "pinBlock", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "protocolState", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "references", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "timeZoneOffset", "toString", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "Camera2StreamConfigurationMap", "Lorg/json/JSONObject;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionRequestImpl implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final org.json.JSONObject getHighSpeedVideoFpsRanges;

    public TransactionRequestImpl(com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData locationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceReaderInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.commons.network.JsonKt.putPlatformInfo(jSONObject, platformInfo);
        com.zettle.sdk.commons.network.JsonKt.putLastLocation(jSONObject, locationData);
        com.zettle.sdk.commons.network.JsonKt.putSdkInfo(jSONObject, appInfo);
        this.getHighSpeedVideoFpsRanges = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_READER_SOFTWARE_VERSION, softspaceReaderInfo.getSdkVersion());
        this.getHighResolutionOutputSizeshNQ4ISI = jSONObject2;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest references(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.packToObject$core_publicRelease(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES, this.getHighResolutionOutputSizeshNQ4ISI);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest localId(java.util.UUID p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_LOCAL_TRANSACTION_UUID, p0.toString());
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest amount(long p0) {
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest onlineHostRequestMessage(com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_INFO_KSN, p0.getKsn());
        this.getHighSpeedVideoFpsRanges.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_RESPONSE_PAYLOAD, p0.getEncryptedEmvTags());
        this.getHighSpeedVideoFpsRanges.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_CVM, p0.getCvmType().name());
        this.getHighSpeedVideoFpsRanges.putOpt(com.zettle.sdk.commons.network.JsonKt.ONLINE_HOST_REQUEST_MESSAGE_MAC, p0.getOnlineHostRequestMessageMac());
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest pinBlock(com.zettle.sdk.feature.taptopay.core.transaction.PinBlock p0) {
        if (p0 != null) {
            this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_PIN_BLOCK_KSN, p0.getKsn());
            this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_PIN_BLOCK, p0.getPinBlock());
        }
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest context(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_CONVERSATION_CONTEXT, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest identifier(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_READER_IDENTIFIER, "com.softspace.1");
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest deviceIdentifier(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_COTS_ID, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest protocolState(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_EMV_PROTOCOL_STATE, com.zettle.sdk.commons.network.JsonKt.EMV_STATE_RESPONSE_FROM_READER);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest timeZoneOffset(long p0) {
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_TIMEZONE_OFFSET, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.izettle.android.net.RequestBody build() {
        return com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequestKt.access$toRequestBody(this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest gratuityAmount(long p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, java.lang.Long.valueOf(p0));
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest paymentProperties(com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.lang.String payeePricingTierId = p0.getPayeePricingTierId();
        if (payeePricingTierId != null && payeePricingTierId.length() != 0) {
            this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_PAYEE_PRICING_TIER_ID, p0.getPayeePricingTierId());
        }
        return this;
    }

    public final java.lang.String toString() {
        java.lang.String jSONObject = this.getHighSpeedVideoFpsRanges.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        return jSONObject;
    }
}
