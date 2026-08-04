package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import p155w1.C1017n0;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f8738a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f8739b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8740c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8741d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8743f;

    public /* synthetic */ C0642t(TextView textView) {
        this.f8743f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f8743f;
        Drawable drawableA = V.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f8740c || this.f8741d) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f8740c) {
                    J.a.h(drawableMutate, this.f8738a);
                }
                if (this.f8741d) {
                    J.a.i(drawableMutate, this.f8739b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.f8743f;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f8740c || this.f8741d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f8740c) {
                    J.a.h(drawableMutate, this.f8738a);
                }
                if (this.f8741d) {
                    J.a.i(drawableMutate, this.f8739b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f8743f;
        Context context = compoundButton.getContext();
        int[] iArr = p051h.a.f13341n;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        P.U.g(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(p097n3.a.w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(p097n3.a.w(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(p097n3.a.w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                V.b.c(compoundButton, c1017n0F.q(2));
            }
            if (typedArray.hasValue(3)) {
                V.b.d(compoundButton, AbstractC0616f0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            c1017n0F.H();
        }
    }
}
