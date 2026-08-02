package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinates;", "Landroid/os/Parcelable;", "", "getLatitude", "()D", "latitude", "getLongitude", "longitude", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TapToPayCoordinates extends android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates.Companion.Camera2StreamConfigurationMap;

    double getLatitude();

    double getLongitude();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinates$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesBuilder;", "builder", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesBuilder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates.Companion();

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesBuilder builder() {
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesBuilder();
        }
    }

    @kotlin.jvm.JvmStatic
    static com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesBuilder builder() {
        return INSTANCE.builder();
    }
}
