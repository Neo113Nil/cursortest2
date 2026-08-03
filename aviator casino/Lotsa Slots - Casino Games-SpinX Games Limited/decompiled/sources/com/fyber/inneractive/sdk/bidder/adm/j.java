package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public enum j implements com.fyber.inneractive.sdk.protobuf.d1 {
    MANUAL(0),
    AUTOMATIC(1),
    UNRECOGNIZED(-1);

    public static final int AUTOMATIC_VALUE = 1;
    public static final int MANUAL_VALUE = 0;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.i
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.adm.j.MANUAL;
            }
            if (i != 1) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.adm.j.AUTOMATIC;
        }
    };
    private final int value;

    j(int i) {
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
