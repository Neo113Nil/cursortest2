package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5057b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f37864a;

    public C5057b(ActionBarContainer actionBarContainer) {
        this.f37864a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f37864a;
        if (actionBarContainer.f37535g) {
            Drawable drawable = actionBarContainer.f37534f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f37532d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f37533e;
        if (drawable3 == null || !actionBarContainer.f37536h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.f37864a;
        if (actionBarContainer.f37535g) {
            if (actionBarContainer.f37534f != null) {
                actionBarContainer.f37532d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f37532d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
