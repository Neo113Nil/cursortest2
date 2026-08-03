package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public enum q implements com.fyber.inneractive.sdk.protobuf.d1 {
    NATIVE(0),
    UNITY3D(1),
    UNRECOGNIZED(-1);

    public static final int NATIVE_VALUE = 0;
    public static final int UNITY3D_VALUE = 1;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.p
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.q.NATIVE;
            }
            if (i != 1) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.q.UNITY3D;
        }
    };
    private final int value;

    q(int i) {
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
