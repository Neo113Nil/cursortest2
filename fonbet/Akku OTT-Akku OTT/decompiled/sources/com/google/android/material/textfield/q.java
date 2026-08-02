package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.exoplayer2.L0;
import com.google.android.material.internal.CheckableImageButton;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public final class q extends t {
    public final int e;
    public final int f;

    @NonNull
    public final TimeInterpolator g;

    @Nullable
    public AutoCompleteTextView h;
    public final m i;
    public final n j;
    public final L0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;

    @Nullable
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.textfield.m] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.n] */
    public q(@NonNull s sVar) {
        super(sVar);
        this.i = new View.OnClickListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.u();
            }
        };
        this.j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                q qVar = q.this;
                qVar.l = z;
                qVar.q();
                if (z) {
                    return;
                }
                qVar.t(false);
                qVar.m = false;
            }
        };
        this.k = new L0(this, 1);
        this.o = Long.MAX_VALUE;
        this.f = com.google.android.material.motion.a.c(sVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = com.google.android.material.motion.a.c(sVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = com.google.android.material.motion.a.d(sVar.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.a.a);
    }

    @Override // com.google.android.material.textfield.t
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && r.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                boolean isPopupShowing = qVar.h.isPopupShowing();
                qVar.t(isPopupShowing);
                qVar.m = isPopupShowing;
            }
        });
    }

    @Override // com.google.android.material.textfield.t
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.t
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.t
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.t
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // com.google.android.material.textfield.t
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.t
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.t
    public final boolean j() {
        return this.l;
    }

    @Override // com.google.android.material.textfield.t
    public final boolean l() {
        return this.n;
    }

    @Override // com.google.android.material.textfield.t
    public final void m(@Nullable EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    q qVar = q.this;
                    long j = currentTimeMillis - qVar.o;
                    if (j < 0 || j > 300) {
                        qVar.m = false;
                    }
                    qVar.u();
                    qVar.m = true;
                    qVar.o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.l
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                q qVar = q.this;
                qVar.m = true;
                qVar.o = System.currentTimeMillis();
                qVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        s sVar = textInputLayout.c;
        CheckableImageButton checkableImageButton = sVar.c;
        checkableImageButton.setImageDrawable(null);
        sVar.k();
        u.a(sVar.a, checkableImageButton, sVar.d, sVar.e);
        if (!r.a(editText) && this.p.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.d, 2);
        }
        textInputLayout.c.h(true);
    }

    @Override // com.google.android.material.textfield.t
    public final void n(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!r.a(this.h)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.t
    @SuppressLint({"WrongConstant"})
    public final void o(@NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || r.a(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.t
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q qVar = q.this;
                qVar.getClass();
                qVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q qVar = q.this;
                qVar.getClass();
                qVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.q = ofFloat2;
        ofFloat2.addListener(new p(this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.t
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
