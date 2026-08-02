package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.CheckableImageButton;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public final class g extends t {
    public final int e;
    public final int f;

    @NonNull
    public final TimeInterpolator g;

    @NonNull
    public final TimeInterpolator h;

    @Nullable
    public EditText i;
    public final ViewOnClickListenerC0950a j;
    public final ViewOnFocusChangeListenerC0951b k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.textfield.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.b] */
    public g(@NonNull s sVar) {
        super(sVar);
        this.j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g gVar = g.this;
                EditText editText = gVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                gVar.q();
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                g gVar = g.this;
                gVar.t(gVar.u());
            }
        };
        this.e = com.google.android.material.motion.a.c(sVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = com.google.android.material.motion.a.c(sVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = com.google.android.material.motion.a.d(sVar.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.a.a);
        this.h = com.google.android.material.motion.a.d(sVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.d);
    }

    @Override // com.google.android.material.textfield.t
    public final void a() {
        if (this.b.o != null) {
            return;
        }
        t(u());
    }

    @Override // com.google.android.material.textfield.t
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.t
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.t
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.t
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.t
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.t
    public final void m(@Nullable EditText editText) {
        this.i = editText;
        this.a.c.h(u());
    }

    @Override // com.google.android.material.textfield.t
    public final void p(boolean z) {
        if (this.b.o == null) {
            return;
        }
        t(z);
    }

    @Override // com.google.android.material.textfield.t
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = g.this;
                gVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = gVar.d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = g.this;
                gVar.getClass();
                gVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new e(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = g.this;
                gVar.getClass();
                gVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new f(this));
    }

    @Override // com.google.android.material.textfield.t
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new com.csdcorp.speech_to_text.g(this, 1));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
