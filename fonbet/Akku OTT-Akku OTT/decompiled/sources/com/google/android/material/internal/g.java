package com.google.android.material.internal;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class g {
    public float c;

    @Nullable
    public final WeakReference<b> e;

    @Nullable
    public com.google.android.material.resources.d f;
    public final TextPaint a = new TextPaint(1);
    public final a b = new a();
    public boolean d = true;

    public class a extends com.google.android.material.resources.f {
        public a() {
        }

        @Override // com.google.android.material.resources.f
        public final void a(int i) {
            g gVar = g.this;
            gVar.d = true;
            b bVar = gVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.google.android.material.resources.f
        public final void b(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            g gVar = g.this;
            gVar.d = true;
            b bVar = gVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public g(@Nullable com.google.android.material.chip.c cVar) {
        this.e = new WeakReference<>(null);
        this.e = new WeakReference<>(cVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
