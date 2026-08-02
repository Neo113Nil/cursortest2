package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.material.shape.g;

/* loaded from: classes4.dex */
public class i extends com.google.android.material.shape.g {
    public static final /* synthetic */ int A = 0;

    @NonNull
    public a z;

    @TargetApi(18)
    public static class b extends i {
        @Override // com.google.android.material.shape.g
        public final void g(@NonNull Canvas canvas) {
            if (this.z.q.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.z.q);
            } else {
                canvas.clipRect(this.z.q, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.z = new a(this.z);
        return this;
    }

    public final void p(float f, float f2, float f3, float f4) {
        RectF rectF = this.z.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public static final class a extends g.b {

        @NonNull
        public final RectF q;

        public a(com.google.android.material.shape.k kVar, RectF rectF) {
            super(kVar);
            this.q = rectF;
        }

        @Override // com.google.android.material.shape.g.b, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.z = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.q = aVar.q;
        }
    }
}
