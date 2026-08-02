package com.google.android.material.shape;

import androidx.annotation.NonNull;
import com.google.android.material.shape.n;

/* loaded from: classes4.dex */
public final class j extends d {
    @Override // com.google.android.material.shape.d
    public final void a(@NonNull n nVar, float f, float f2) {
        nVar.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        n.c cVar = new n.c(0.0f, 0.0f, f3, f3);
        cVar.f = 180.0f;
        cVar.g = 90.0f;
        nVar.f.add(cVar);
        n.a aVar = new n.a(cVar);
        nVar.a(180.0f);
        nVar.g.add(aVar);
        nVar.d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        nVar.b = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        nVar.c = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
