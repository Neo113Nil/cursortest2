package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 #2\u00020\u0001:\u0001#J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "", "", "amount", "(J)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;", "", "context", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "cotsId", "deviceIdentifier", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "identifier", "Ljava/util/UUID;", "id", "localId", "(Ljava/util/UUID;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "paymentProperties", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;", "pinBlock", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "state", "protocolState", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "references", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "offset", "timeZoneOffset", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TransactionRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest.Companion.getHighSpeedVideoFpsRangesFor;

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest amount(long amount);

    com.izettle.android.net.RequestBody build();

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest context(java.lang.String context);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest deviceIdentifier(java.lang.String cotsId);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest gratuityAmount(long amount);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest identifier(java.lang.String identifier);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest localId(java.util.UUID id);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest onlineHostRequestMessage(com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest paymentProperties(com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties paymentProperties);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest pinBlock(com.zettle.sdk.feature.taptopay.core.transaction.PinBlock pinBlock);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest protocolState(java.lang.String state);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest references(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference references);

    com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest timeZoneOffset(long offset);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "softspaceReaderInfo", "Lcom/zettle/sdk/meta/PlatformInfo;", "platformInfo", "Lcom/zettle/sdk/core/os/LocationData;", "lastLocation", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "create", "(Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest create(com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData lastLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceReaderInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequestImpl(appInfo, softspaceReaderInfo, platformInfo, lastLocation);
        }
    }
}
