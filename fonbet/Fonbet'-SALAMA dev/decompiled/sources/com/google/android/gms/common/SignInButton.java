package com.google.android.gms.common;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.z;
import f3.AbstractC1083a;
import o3.C1508c;

/* loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public int f11067a;

    /* renamed from: b, reason: collision with root package name */
    public int f11068b;

    /* renamed from: c, reason: collision with root package name */
    public View f11069c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f11070d;

    public SignInButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f11070d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1083a.f12900a, 0, 0);
        try {
            this.f11067a = obtainStyledAttributes.getInt(0, 0);
            this.f11068b = obtainStyledAttributes.getInt(1, 2);
            obtainStyledAttributes.recycle();
            a(this.f11067a, this.f11068b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(int i7, int i8) {
        this.f11067a = i7;
        this.f11068b = i8;
        Context context = getContext();
        View view = this.f11069c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f11069c = z.a(this.f11067a, context, this.f11068b);
        } catch (C1508c unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i9 = this.f11067a;
            int i10 = this.f11068b;
            r rVar = new r(context, null, R.attr.buttonStyle);
            Resources resources = context.getResources();
            rVar.setTypeface(Typeface.DEFAULT_BOLD);
            rVar.setTextSize(14.0f);
            int i11 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            rVar.setMinHeight(i11);
            rVar.setMinWidth(i11);
            int a2 = r.a(i10, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.common_google_signin_btn_icon_dark, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.common_google_signin_btn_icon_light, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.common_google_signin_btn_icon_light);
            int a4 = r.a(i10, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.common_google_signin_btn_text_dark, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.common_google_signin_btn_text_light, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.common_google_signin_btn_text_light);
            if (i9 == 0 || i9 == 1) {
                a2 = a4;
            } else if (i9 != 2) {
                throw new IllegalStateException(e1.k.d(i9, "Unknown button size: "));
            }
            Drawable drawable = resources.getDrawable(a2);
            J.a.h(drawable, resources.getColorStateList(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.color.common_google_signin_btn_tint));
            J.a.i(drawable, PorterDuff.Mode.SRC_ATOP);
            rVar.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(r.a(i10, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.color.common_google_signin_btn_text_dark, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.color.common_google_signin_btn_text_light, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.color.common_google_signin_btn_text_light));
            D.i(colorStateList);
            rVar.setTextColor(colorStateList);
            if (i9 == 0) {
                rVar.setText(resources.getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_signin_button_text));
            } else if (i9 == 1) {
                rVar.setText(resources.getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_signin_button_text_long));
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException(e1.k.d(i9, "Unknown button size: "));
                }
                rVar.setText((CharSequence) null);
            }
            rVar.setTransformationMethod(null);
            if (m3.c.l(rVar.getContext())) {
                rVar.setGravity(19);
            }
            this.f11069c = rVar;
        }
        addView(this.f11069c);
        this.f11069c.setEnabled(isEnabled());
        this.f11069c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f11070d;
        if (onClickListener == null || view != this.f11069c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i7) {
        a(this.f11067a, i7);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.f11069c.setEnabled(z4);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11070d = onClickListener;
        View view = this.f11069c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f11067a, this.f11068b);
    }

    public void setSize(int i7) {
        a(i7, this.f11068b);
    }
}
