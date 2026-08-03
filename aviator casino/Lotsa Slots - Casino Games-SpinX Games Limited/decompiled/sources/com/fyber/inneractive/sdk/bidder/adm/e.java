package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public enum e implements com.fyber.inneractive.sdk.protobuf.d1 {
    DISPLAY(0),
    VIDEO(1),
    VIDEOANDDISPLAY(2),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_VALUE = 0;
    public static final int VIDEOANDDISPLAY_VALUE = 2;
    public static final int VIDEO_VALUE = 1;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.d
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.adm.e.DISPLAY;
            }
            if (i == 1) {
                return com.fyber.inneractive.sdk.bidder.adm.e.VIDEO;
            }
            if (i != 2) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.adm.e.VIDEOANDDISPLAY;
        }
    };
    private final int value;

    e(int i) {
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
