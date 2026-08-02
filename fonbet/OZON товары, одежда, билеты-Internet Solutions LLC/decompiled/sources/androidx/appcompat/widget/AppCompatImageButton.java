package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    private final C5060e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C5068m mImageHelper;

    public AppCompatImageButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.a();
        }
        C5068m c5068m = this.mImageHelper;
        if (c5068m != null) {
            c5068m.b();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.c() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C5068m c5068m = this.mImageHelper;
        if (c5068m != null) {
            c5068m.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C5068m c5068m = this.mImageHelper;
        if (c5068m != null && drawable != null && !this.mHasLevel) {
            c5068m.e(drawable);
        }
        super.setImageDrawable(drawable);
        C5068m c5068m2 = this.mImageHelper;
        if (c5068m2 != null) {
            c5068m2.b();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i11) {
        super.setImageLevel(i11);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.mImageHelper.f(i11);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5068m c5068m = this.mImageHelper;
        if (c5068m != null) {
            c5068m.b();
        }
    }

    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Y.a(context);
        this.mHasLevel = false;
        W.a(this, getContext());
        C5060e c5060e = new C5060e(this);
        this.mBackgroundTintHelper = c5060e;
        c5060e.d(attributeSet, i11);
        C5068m c5068m = new C5068m(this);
        this.mImageHelper = c5068m;
        c5068m.d(attributeSet, i11);
    }
}
