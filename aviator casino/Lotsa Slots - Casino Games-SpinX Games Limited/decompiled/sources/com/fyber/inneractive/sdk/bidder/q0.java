package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public enum q0 implements com.fyber.inneractive.sdk.protobuf.d1 {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    OTHER(3),
    UNRECOGNIZED(-1);

    public static final int FEMALE_VALUE = 2;
    public static final int MALE_VALUE = 1;
    public static final int OTHER_VALUE = 3;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.p0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.q0.UNKNOWN;
            }
            if (i == 1) {
                return com.fyber.inneractive.sdk.bidder.q0.MALE;
            }
            if (i == 2) {
                return com.fyber.inneractive.sdk.bidder.q0.FEMALE;
            }
            if (i != 3) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.q0.OTHER;
        }
    };
    private final int value;

    q0(int i) {
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
