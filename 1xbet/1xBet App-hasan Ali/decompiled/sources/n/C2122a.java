package n;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2122a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f18212a;

    public C2122a(ActionBarContainer actionBarContainer) {
        this.f18212a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f18212a;
        if (actionBarContainer.f6687q) {
            Drawable drawable = actionBarContainer.f6686p;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f6684n;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f6685o;
        if (drawable3 == null || !actionBarContainer.f6688r) {
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
        ActionBarContainer actionBarContainer = this.f18212a;
        if (actionBarContainer.f6687q) {
            if (actionBarContainer.f6686p != null) {
                actionBarContainer.f6684n.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f6684n;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
