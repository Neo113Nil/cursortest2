package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;", "", "identifier", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "Ljava/util/UUID;", "id", "localId", "(Ljava/util/UUID;)Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "tapOnPhoneReferences", "references", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FinalizeRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest.Companion.getHighResolutionOutputSizeshNQ4ISI;

    com.izettle.android.net.RequestBody build();

    com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest identifier(java.lang.String identifier);

    com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest localId(java.util.UUID id);

    com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest references(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapOnPhoneReferences);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "softspaceReaderInfo", "Lcom/zettle/sdk/meta/PlatformInfo;", "platformInfo", "Lcom/zettle/sdk/core/os/LocationData;", "lastLocation", "Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest create(com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData lastLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceReaderInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
            return new com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequestImpl(softspaceReaderInfo, platformInfo, lastLocation);
        }
    }
}
