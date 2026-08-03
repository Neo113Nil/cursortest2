package com.ironsource;

/* renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3018e3 extends com.ironsource.AbstractC3179n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3018e3(int i, java.lang.String placementName, boolean z, com.ironsource.C3082hd c3082hd) {
        super(i, placementName, z, c3082hd);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC3179n3
    public java.lang.String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
