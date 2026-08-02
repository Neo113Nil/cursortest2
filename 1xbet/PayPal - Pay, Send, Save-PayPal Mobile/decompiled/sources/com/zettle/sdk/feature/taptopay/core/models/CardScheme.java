package com.zettle.sdk.feature.taptopay.core.models;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/models/CardScheme;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "UNKNOWN", "MCCS", "VISA", "MASTER", "JCB", "AMEX", "CUP", "VCCS", "DISCOVER", "MADA", "ALL"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum CardScheme {
    UNKNOWN(0),
    MCCS(1),
    VISA(2),
    MASTER(4),
    JCB(8),
    AMEX(16),
    CUP(32),
    VCCS(64),
    DISCOVER(128),
    MADA(256),
    ALL(511);


    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    CardScheme(int i) {
        this.getHighSpeedVideoSizes = i;
    }
}
