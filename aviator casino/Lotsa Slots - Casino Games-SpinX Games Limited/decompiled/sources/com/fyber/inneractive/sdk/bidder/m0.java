package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public enum m0 implements com.fyber.inneractive.sdk.protobuf.d1 {
    UNITCONTENTTYPEUNKNOWN(0),
    DISPLAY(1),
    VIDEO(2),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_VALUE = 1;
    public static final int UNITCONTENTTYPEUNKNOWN_VALUE = 0;
    public static final int VIDEO_VALUE = 2;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.l0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.m0.UNITCONTENTTYPEUNKNOWN;
            }
            if (i == 1) {
                return com.fyber.inneractive.sdk.bidder.m0.DISPLAY;
            }
            if (i != 2) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.m0.VIDEO;
        }
    };
    private final int value;

    m0(int i) {
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
