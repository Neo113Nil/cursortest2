package b2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f7269a;

    /* renamed from: b, reason: collision with root package name */
    public m f7270b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f7271c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f7272d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7273e;
    public Bitmap f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f7274g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f7275h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7276j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7277k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f7278l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7269a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
