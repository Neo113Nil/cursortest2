package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class a {
    public final MaterialButton a;

    @NonNull
    public k b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    @Nullable
    public PorterDuff.Mode h;

    @Nullable
    public ColorStateList i;

    @Nullable
    public ColorStateList j;

    @Nullable
    public ColorStateList k;

    @Nullable
    public g l;
    public boolean o;
    public RippleDrawable q;
    public int r;
    public boolean m = false;
    public boolean n = false;
    public boolean p = true;

    public a(MaterialButton materialButton, @NonNull k kVar) {
        this.a = materialButton;
        this.b = kVar;
    }

    @Nullable
    public final o a() {
        RippleDrawable rippleDrawable = this.q;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.q.getNumberOfLayers() > 2 ? (o) this.q.getDrawable(2) : (o) this.q.getDrawable(1);
    }

    @Nullable
    public final g b(boolean z) {
        RippleDrawable rippleDrawable = this.q;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.q.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(@NonNull k kVar) {
        this.b = kVar;
        if (b(false) != null) {
            b(false).b(kVar);
        }
        if (b(true) != null) {
            b(true).b(kVar);
        }
        if (a() != null) {
            a().b(kVar);
        }
    }
}
