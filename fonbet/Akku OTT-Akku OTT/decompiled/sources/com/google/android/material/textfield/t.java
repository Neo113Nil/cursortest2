package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes4.dex */
public abstract class t {
    public final TextInputLayout a;
    public final s b;
    public final Context c;
    public final CheckableImageButton d;

    public t(@NonNull s sVar) {
        this.a = sVar.a;
        this.b = sVar;
        this.c = sVar.getContext();
        this.d = sVar.f;
    }

    @StringRes
    public int c() {
        return 0;
    }

    @DrawableRes
    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof q;
    }

    public boolean l() {
        return false;
    }

    public void m(@Nullable EditText editText) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.b.f(false);
    }

    public void r() {
    }

    public void s() {
    }

    public void a() {
    }

    public void b() {
    }

    public void n(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void o(@NonNull AccessibilityEvent accessibilityEvent) {
    }
}
