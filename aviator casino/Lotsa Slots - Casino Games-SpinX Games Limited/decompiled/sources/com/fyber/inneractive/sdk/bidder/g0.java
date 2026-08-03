package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public enum g0 implements com.fyber.inneractive.sdk.protobuf.d1 {
    UNSECURE(0),
    SECURE(1),
    PARTIALLYSECURE(2),
    UNRECOGNIZED(-1);

    public static final int PARTIALLYSECURE_VALUE = 2;
    public static final int SECURE_VALUE = 1;
    public static final int UNSECURE_VALUE = 0;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.f0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.g0.UNSECURE;
            }
            if (i == 1) {
                return com.fyber.inneractive.sdk.bidder.g0.SECURE;
            }
            if (i != 2) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.g0.PARTIALLYSECURE;
        }
    };
    private final int value;

    g0(int i) {
        this.value = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
