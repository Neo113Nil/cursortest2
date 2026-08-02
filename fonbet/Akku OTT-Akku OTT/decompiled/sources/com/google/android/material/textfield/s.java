package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.haryanvi.netstream.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class s extends LinearLayout {
    public final TextInputLayout a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final CheckableImageButton c;
    public final ColorStateList d;
    public final PorterDuff.Mode e;

    @NonNull
    public final CheckableImageButton f;
    public final d i;
    public int j;
    public final LinkedHashSet<TextInputLayout.e> k;
    public final ColorStateList l;
    public final PorterDuff.Mode m;
    public final int n;

    @Nullable
    public final CharSequence o;

    @NonNull
    public final AppCompatTextView p;
    public boolean q;
    public EditText r;

    @Nullable
    public final AccessibilityManager s;

    @Nullable
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener t;
    public final a u;

    public class a extends com.google.android.material.internal.h {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            s.this.b().a();
        }

        @Override // com.google.android.material.internal.h, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            s.this.b().b();
        }
    }

    public class b implements TextInputLayout.d {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.d
        public final void a(@NonNull TextInputLayout textInputLayout) {
            s sVar = s.this;
            a aVar = sVar.u;
            EditText editText = sVar.r;
            if (editText == textInputLayout.d) {
                return;
            }
            if (editText != null) {
                editText.removeTextChangedListener(aVar);
                if (sVar.r.getOnFocusChangeListener() == sVar.b().e()) {
                    sVar.r.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.d;
            sVar.r = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(aVar);
            }
            sVar.b().m(sVar.r);
            sVar.i(sVar.b());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            s sVar = s.this;
            AccessibilityManager accessibilityManager = sVar.s;
            if (sVar.t == null || accessibilityManager == null || !ViewCompat.isAttachedToWindow(sVar)) {
                return;
            }
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, sVar.t);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            s sVar = s.this;
            AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = sVar.t;
            if (touchExplorationStateChangeListener == null || (accessibilityManager = sVar.s) == null) {
                return;
            }
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
    }

    public static class d {
        public final SparseArray<t> a = new SparseArray<>();
        public final s b;
        public final int c;
        public final int d;

        public d(s sVar, TintTypedArray tintTypedArray) {
            this.b = sVar;
            this.c = tintTypedArray.getResourceId(28, 0);
            this.d = tintTypedArray.getResourceId(52, 0);
        }
    }

    public s(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.j = 0;
        this.k = new LinkedHashSet<>();
        this.u = new a();
        b bVar = new b();
        this.s = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f = a3;
        this.i = new d(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.p = appCompatTextView;
        if (tintTypedArray.hasValue(38)) {
            this.d = com.google.android.material.resources.c.b(getContext(), tintTypedArray, 38);
        }
        if (tintTypedArray.hasValue(39)) {
            this.e = com.google.android.material.internal.m.b(tintTypedArray.getInt(39, -1), null);
        }
        if (tintTypedArray.hasValue(37)) {
            a2.setImageDrawable(tintTypedArray.getDrawable(37));
            k();
            u.a(textInputLayout, a2, this.d, this.e);
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(a2, 2);
        a2.setClickable(false);
        a2.c = false;
        a2.setFocusable(false);
        if (!tintTypedArray.hasValue(53)) {
            if (tintTypedArray.hasValue(32)) {
                this.l = com.google.android.material.resources.c.b(getContext(), tintTypedArray, 32);
            }
            if (tintTypedArray.hasValue(33)) {
                this.m = com.google.android.material.internal.m.b(tintTypedArray.getInt(33, -1), null);
            }
        }
        if (tintTypedArray.hasValue(30)) {
            g(tintTypedArray.getInt(30, 0));
            if (tintTypedArray.hasValue(27) && a3.getContentDescription() != (text = tintTypedArray.getText(27))) {
                a3.setContentDescription(text);
            }
            boolean z = tintTypedArray.getBoolean(26, true);
            if (a3.b != z) {
                a3.b = z;
                a3.sendAccessibilityEvent(0);
            }
        } else if (tintTypedArray.hasValue(53)) {
            if (tintTypedArray.hasValue(54)) {
                this.l = com.google.android.material.resources.c.b(getContext(), tintTypedArray, 54);
            }
            if (tintTypedArray.hasValue(55)) {
                this.m = com.google.android.material.internal.m.b(tintTypedArray.getInt(55, -1), null);
            }
            g(tintTypedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = tintTypedArray.getText(51);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.n) {
            this.n = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (tintTypedArray.hasValue(31)) {
            ImageView.ScaleType b2 = u.b(tintTypedArray.getInt(31, -1));
            a3.setScaleType(b2);
            a2.setScaleType(b2);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(72, 0));
        if (tintTypedArray.hasValue(73)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(73));
        }
        CharSequence text3 = tintTypedArray.getText(71);
        this.o = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        m();
        frameLayout.addView(a3);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f0.add(bVar);
        if (textInputLayout.d != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (com.google.android.material.resources.c.d(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final t b() {
        t hVar;
        int i = this.j;
        d dVar = this.i;
        SparseArray<t> sparseArray = dVar.a;
        t tVar = sparseArray.get(i);
        if (tVar != null) {
            return tVar;
        }
        s sVar = dVar.b;
        if (i == -1) {
            hVar = new h(sVar);
        } else if (i == 0) {
            hVar = new y(sVar);
        } else if (i == 1) {
            hVar = new A(sVar, dVar.d);
        } else if (i == 2) {
            hVar = new g(sVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Invalid end icon mode: "));
            }
            hVar = new q(sVar);
        }
        sparseArray.append(i, hVar);
        return hVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f;
            marginStart = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return ViewCompat.getPaddingEnd(this.p) + ViewCompat.getPaddingEnd(this) + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.f.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        t b2 = b();
        boolean k = b2.k();
        boolean z4 = true;
        CheckableImageButton checkableImageButton = this.f;
        if (!k || (z3 = checkableImageButton.a) == b2.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b2 instanceof q) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            u.c(this.a, checkableImageButton, this.l);
        }
    }

    public final void g(int i) {
        if (this.j == i) {
            return;
        }
        t b2 = b();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.t;
        AccessibilityManager accessibilityManager = this.s;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
        this.t = null;
        b2.s();
        this.j = i;
        Iterator<TextInputLayout.e> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        h(i != 0);
        t b3 = b();
        int i2 = this.i.c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable drawable = i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.a;
        if (drawable != null) {
            u.a(textInputLayout, checkableImageButton, this.l, this.m);
            u.c(textInputLayout, checkableImageButton, this.l);
        }
        int c2 = b3.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        boolean k = b3.k();
        if (checkableImageButton.b != k) {
            checkableImageButton.b = k;
            checkableImageButton.sendAccessibilityEvent(0);
        }
        if (!b3.i(textInputLayout.Q)) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.Q + " is not supported by the end icon mode " + i);
        }
        b3.r();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener h = b3.h();
        this.t = h;
        if (h != null && accessibilityManager != null && ViewCompat.isAttachedToWindow(this)) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, this.t);
        }
        checkableImageButton.setOnClickListener(b3.f());
        u.d(checkableImageButton);
        EditText editText = this.r;
        if (editText != null) {
            b3.m(editText);
            i(b3);
        }
        u.a(textInputLayout, checkableImageButton, this.l, this.m);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.f.setVisibility(z ? 0 : 8);
            j();
            l();
            this.a.u();
        }
    }

    public final void i(t tVar) {
        if (this.r == null) {
            return;
        }
        if (tVar.e() != null) {
            this.r.setOnFocusChangeListener(tVar.e());
        }
        if (tVar.g() != null) {
            this.f.setOnFocusChangeListener(tVar.g());
        }
    }

    public final void j() {
        this.b.setVisibility((this.f.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.o == null || this.q) ? 8 : false)) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.l.q && textInputLayout.q()) ? 0 : 8);
        j();
        l();
        if (this.j != 0) {
            return;
        }
        textInputLayout.u();
    }

    public final void l() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.d == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.p, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.d.getPaddingTop(), (d() || e()) ? 0 : ViewCompat.getPaddingEnd(textInputLayout.d), textInputLayout.d.getPaddingBottom());
    }

    public final void m() {
        AppCompatTextView appCompatTextView = this.p;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.o == null || this.q) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        j();
        appCompatTextView.setVisibility(i);
        this.a.u();
    }
}
