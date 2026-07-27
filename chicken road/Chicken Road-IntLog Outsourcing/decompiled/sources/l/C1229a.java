package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f10823a;

    public C1229a(ActionBarContainer actionBarContainer) {
        this.f10823a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f10823a;
        if (actionBarContainer.f4115g) {
            Drawable drawable = actionBarContainer.f4114f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4112d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4113e;
        if (drawable3 == null || !actionBarContainer.f4116h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f10823a;
        if (actionBarContainer.f4115g) {
            Drawable drawable = actionBarContainer.f4114f;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4112d;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
