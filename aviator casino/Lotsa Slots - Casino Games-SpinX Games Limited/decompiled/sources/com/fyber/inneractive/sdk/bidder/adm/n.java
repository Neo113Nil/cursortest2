package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public enum n implements com.fyber.inneractive.sdk.protobuf.d1 {
    NONE(0),
    SINGLETAP(1),
    TRUESINGLETAP(2),
    UNRECOGNIZED(-1);

    public static final int NONE_VALUE = 0;
    public static final int SINGLETAP_VALUE = 1;
    public static final int TRUESINGLETAP_VALUE = 2;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.m
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.adm.n.NONE;
            }
            if (i == 1) {
                return com.fyber.inneractive.sdk.bidder.adm.n.SINGLETAP;
            }
            if (i != 2) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.adm.n.TRUESINGLETAP;
        }
    };
    private final int value;

    n(int i) {
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
