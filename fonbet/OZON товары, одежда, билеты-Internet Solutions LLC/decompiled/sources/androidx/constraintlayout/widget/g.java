package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import m2.e;

/* loaded from: classes.dex */
public final class g extends View {

    /* renamed from: a, reason: collision with root package name */
    private View f41843a;

    public final View a() {
        return this.f41843a;
    }

    public final void b() {
        if (this.f41843a == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f41843a.getLayoutParams();
        bVar2.f41653q0.S0(0);
        m2.e eVar = bVar.f41653q0;
        e.b bVar3 = eVar.f74115V[0];
        e.b bVar4 = e.b.FIXED;
        if (bVar3 != bVar4) {
            eVar.T0(bVar2.f41653q0.N());
        }
        m2.e eVar2 = bVar.f41653q0;
        if (eVar2.f74115V[1] != bVar4) {
            eVar2.z0(bVar2.f41653q0.v());
        }
        bVar2.f41653q0.S0(8);
    }

    public final void c(ConstraintLayout constraintLayout) {
        View findViewById = constraintLayout.findViewById(0);
        this.f41843a = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f41631f0 = true;
            this.f41843a.setVisibility(0);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }
}
