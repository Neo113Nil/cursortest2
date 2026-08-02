package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class a extends f {
    public final Typeface a;
    public final com.google.android.material.internal.a b;
    public boolean c;

    public a(com.google.android.material.internal.a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // com.google.android.material.resources.f
    public final void a(int i) {
        if (this.c) {
            return;
        }
        com.google.android.material.internal.b bVar = this.b.a;
        if (bVar.j(this.a)) {
            bVar.h(false);
        }
    }

    @Override // com.google.android.material.resources.f
    public final void b(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        com.google.android.material.internal.b bVar = this.b.a;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
