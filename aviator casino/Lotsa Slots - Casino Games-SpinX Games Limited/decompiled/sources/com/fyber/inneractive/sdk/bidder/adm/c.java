package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public enum c implements com.fyber.inneractive.sdk.protobuf.d1 {
    OTHER(0),
    HTML(4),
    MRAID(6),
    VAST(8),
    NATIVE(10),
    DV360(15),
    UNRECOGNIZED(-1);

    public static final int DV360_VALUE = 15;
    public static final int HTML_VALUE = 4;
    public static final int MRAID_VALUE = 6;
    public static final int NATIVE_VALUE = 10;
    public static final int OTHER_VALUE = 0;
    public static final int VAST_VALUE = 8;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.b
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.adm.c.OTHER;
            }
            if (i == 4) {
                return com.fyber.inneractive.sdk.bidder.adm.c.HTML;
            }
            if (i == 6) {
                return com.fyber.inneractive.sdk.bidder.adm.c.MRAID;
            }
            if (i == 8) {
                return com.fyber.inneractive.sdk.bidder.adm.c.VAST;
            }
            if (i == 10) {
                return com.fyber.inneractive.sdk.bidder.adm.c.NATIVE;
            }
            if (i != 15) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.adm.c.DV360;
        }
    };
    private final int value;

    c(int i) {
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
