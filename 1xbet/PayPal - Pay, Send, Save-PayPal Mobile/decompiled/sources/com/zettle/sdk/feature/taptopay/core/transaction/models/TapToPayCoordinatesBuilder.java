package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesBuilder;", "", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinates;", "build", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinates;", "", "latitude", "(D)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesBuilder;", "longitude", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Double;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayCoordinatesBuilder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Double getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Double getHighSpeedVideoFpsRanges;

    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesBuilder latitude(double latitude) {
        this.getHighSpeedVideoSizes = java.lang.Double.valueOf(latitude);
        return this;
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesBuilder longitude(double longitude) {
        this.getHighSpeedVideoFpsRanges = java.lang.Double.valueOf(longitude);
        return this;
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates build() {
        java.lang.Double d = this.getHighSpeedVideoSizes;
        if (d == null) {
            throw new java.lang.IllegalArgumentException("This field is mandatory");
        }
        double doubleValue = d.doubleValue();
        java.lang.Double d2 = this.getHighSpeedVideoFpsRanges;
        if (d2 != null) {
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl(doubleValue, d2.doubleValue());
        }
        throw new java.lang.IllegalArgumentException("This field is mandatory");
    }
}
