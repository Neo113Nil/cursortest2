package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4347c3 extends AbstractC4490k3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4347c3(int i, String placementName, boolean z, C4429gd c4429gd) {
        super(i, placementName, z, c4429gd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC4490k3
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
