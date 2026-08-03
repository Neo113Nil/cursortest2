package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public enum g implements com.fyber.inneractive.sdk.protobuf.d1 {
    AUTOSTOREKITNONE(0),
    AUTOSTOREKITPRESENTONLY(1),
    AUTOSTOREKITPRESENTANDTRACK(2),
    UNRECOGNIZED(-1);

    public static final int AUTOSTOREKITNONE_VALUE = 0;
    public static final int AUTOSTOREKITPRESENTANDTRACK_VALUE = 2;
    public static final int AUTOSTOREKITPRESENTONLY_VALUE = 1;
    private static final com.fyber.inneractive.sdk.protobuf.e1 internalValueMap = new com.fyber.inneractive.sdk.protobuf.e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.f
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final com.fyber.inneractive.sdk.protobuf.d1 a(int i) {
            if (i == 0) {
                return com.fyber.inneractive.sdk.bidder.adm.g.AUTOSTOREKITNONE;
            }
            if (i == 1) {
                return com.fyber.inneractive.sdk.bidder.adm.g.AUTOSTOREKITPRESENTONLY;
            }
            if (i != 2) {
                return null;
            }
            return com.fyber.inneractive.sdk.bidder.adm.g.AUTOSTOREKITPRESENTANDTRACK;
        }
    };
    private final int value;

    g(int i) {
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
