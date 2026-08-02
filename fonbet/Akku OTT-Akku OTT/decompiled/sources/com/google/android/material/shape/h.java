package com.google.android.material.shape;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.g;

/* loaded from: classes4.dex */
public final class h {
    @NonNull
    public static d a(int i) {
        return i != 0 ? i != 1 ? new j() : new e() : new j();
    }

    public static void b(@NonNull View view, @NonNull g gVar) {
        com.google.android.material.elevation.a aVar = gVar.a.b;
        if (aVar == null || !aVar.a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ViewCompat.getElevation((View) parent);
        }
        g.b bVar = gVar.a;
        if (bVar.l != f) {
            bVar.l = f;
            gVar.o();
        }
    }
}
