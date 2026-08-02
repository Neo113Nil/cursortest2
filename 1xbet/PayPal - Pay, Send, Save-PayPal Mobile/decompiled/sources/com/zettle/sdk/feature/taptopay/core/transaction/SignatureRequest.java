package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H&¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;", "", "identifier", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "Ljava/util/UUID;", "id", "localId", "(Ljava/util/UUID;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "state", "protocolState", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "tapOnPhoneReferences", "references", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "skipSignature", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SignatureRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest.Companion.getHighSpeedVideoFpsRanges;

    com.izettle.android.net.RequestBody build();

    com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest identifier(java.lang.String identifier);

    com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest localId(java.util.UUID id);

    com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest protocolState(java.lang.String state);

    com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest references(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapOnPhoneReferences);

    com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest signature(com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature);

    com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest skipSignature();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "softspaceReaderInfo", "Lcom/zettle/sdk/meta/PlatformInfo;", "platformInfo", "Lcom/zettle/sdk/core/os/LocationData;", "lastLocation", "Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "create", "(Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest create(com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData lastLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceReaderInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
            return new com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequestImpl(appInfo, softspaceReaderInfo, platformInfo, lastLocation);
        }
    }
}
