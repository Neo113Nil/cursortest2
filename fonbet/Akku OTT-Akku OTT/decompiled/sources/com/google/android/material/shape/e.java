package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class e extends d {
    @Override // com.google.android.material.shape.d
    public final void a(@NonNull n nVar, float f, float f2) {
        nVar.d(f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        nVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(0.0f)) * d * d2));
    }
}
