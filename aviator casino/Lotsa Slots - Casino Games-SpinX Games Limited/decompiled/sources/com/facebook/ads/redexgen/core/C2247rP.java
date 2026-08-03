package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2247rP<ModelType, StateType> {
    public final ModelType A03;
    public final StateType A04;
    public final java.lang.String A05;
    public final java.lang.String A06;
    public java.util.List<com.facebook.ads.redexgen.core.ViewpointAction<ModelType, StateType>> A01 = null;
    public com.facebook.ads.redexgen.core.C2245rN A00 = com.facebook.ads.redexgen.core.C2245rN.A0B;
    public boolean A02 = false;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C2247rP(ModelType model, StateType state, java.lang.String str) {
        this.A03 = model;
        this.A04 = state;
        this.A06 = str;
        this.A05 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rS != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final com.facebook.ads.redexgen.core.C2247rP<ModelType, StateType> A06(com.facebook.ads.redexgen.core.ViewpointAction<ModelType, StateType> viewpointAction) {
        if (this.A01 == null) {
            this.A01 = new java.util.ArrayList();
        }
        this.A01.add(viewpointAction);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final com.facebook.ads.redexgen.core.C2245rN<ModelType, StateType> A07() {
        return new com.facebook.ads.redexgen.core.C2245rN<>(this);
    }
}
