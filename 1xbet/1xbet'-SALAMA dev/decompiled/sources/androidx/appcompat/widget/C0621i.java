package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0621i extends AppCompatImageView implements InterfaceC0625k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0623j f8633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621i(C0623j c0623j, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f8633d = c0623j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        P6.b.I(this, getContentDescription());
        setOnTouchListener(new C0619h(this, this, 0));
    }

    @Override // androidx.appcompat.widget.InterfaceC0625k
    public final boolean b() {
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0625k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f8633d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i7, i8, i9, i10);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            J.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
