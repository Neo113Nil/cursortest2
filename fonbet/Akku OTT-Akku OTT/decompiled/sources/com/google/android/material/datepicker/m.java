package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public final class m extends AccessibilityDelegateCompat {
    public final /* synthetic */ j a;

    public m(j jVar) {
        this.a = jVar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        j jVar = this.a;
        accessibilityNodeInfoCompat.setHintText(jVar.p.getVisibility() == 0 ? jVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : jVar.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
