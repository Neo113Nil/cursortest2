package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public enum VerifyingEntity {
    NO_CD_CVM((byte) 0),
    MOBILE_APP((byte) 80),
    VERIFIED_CLOUD(com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4),
    VERIFIED_MOBILE_DEVICE(Byte.MIN_VALUE);

    private final byte value;

    VerifyingEntity(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }
}
