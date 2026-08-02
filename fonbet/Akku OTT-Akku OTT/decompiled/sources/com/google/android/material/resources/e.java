package com.google.android.material.resources;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class e extends f {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ f c;
    public final /* synthetic */ d d;

    public e(d dVar, Context context, TextPaint textPaint, f fVar) {
        this.d = dVar;
        this.a = context;
        this.b = textPaint;
        this.c = fVar;
    }

    @Override // com.google.android.material.resources.f
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // com.google.android.material.resources.f
    public final void b(@NonNull Typeface typeface, boolean z) {
        this.d.f(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
