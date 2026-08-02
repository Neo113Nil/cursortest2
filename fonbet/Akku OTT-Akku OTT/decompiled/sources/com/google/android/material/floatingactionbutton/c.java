package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.haryanvi.netstream.R;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class c {
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;

    @Nullable
    public Animator a;

    @Nullable
    public com.google.android.material.animation.c b;

    @Nullable
    public com.google.android.material.animation.c c;
    public float d;
    public int e;
    public ArrayList<Animator.AnimatorListener> f;
    public ArrayList<Animator.AnimatorListener> g;
    public ArrayList<a> h;

    public interface a {
        void a();
    }

    static {
        FastOutLinearInInterpolator fastOutLinearInInterpolator = com.google.android.material.animation.a.c;
        i = R.attr.motionDurationLong2;
        j = R.attr.motionEasingEmphasizedInterpolator;
        k = R.attr.motionDurationMedium1;
        l = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    @NonNull
    public final AnimatorSet a(@NonNull com.google.android.material.animation.c cVar, float f, float f2) {
        throw null;
    }

    public final AnimatorSet b(int i2, float f, float f2, int i3, float f3) {
        throw null;
    }

    public final void c() {
        throw null;
    }
}
