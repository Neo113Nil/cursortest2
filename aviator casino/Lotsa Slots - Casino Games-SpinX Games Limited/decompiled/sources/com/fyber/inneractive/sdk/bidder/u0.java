package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public enum u0 implements com.fyber.inneractive.sdk.protobuf.d1 {
    NOCLICK(0),
    CTABUTTON(1),
    COMPANION(2),
    VIDEOVIEW(3),
    APPINFO(4),
    STOREPROMO(5),
    UNRECOGNIZED(-1);

    public static final int APPINFO_VALUE = 4;
    public static final int COMPANION_VALUE = 2;
    public static final int CTABUTTON_VALUE = 1;
    public static final int NOCLICK_VALUE = 0;
    public static final int STOREPROMO_VALUE = 5;
    public static final int VIDEOVIEW_VALUE = 3;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.t0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.u0.NOCLICK;
            }
            if (i == 1) {
                return com.fyber.inneractive.sdk.bidder.u0.CTABUTTON;
            }
            if (i == 2) {
                return com.fyber.inneractive.sdk.bidder.u0.COMPANION;
            }
            if (i == 3) {
                return com.fyber.inneractive.sdk.bidder.u0.VIDEOVIEW;
            }
            if (i == 4) {
                return com.fyber.inneractive.sdk.bidder.u0.APPINFO;
            }
            if (i != 5) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.u0.STOREPROMO;
        }
    };
    private final int value;

    u0(int i) {
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
