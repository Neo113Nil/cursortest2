package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}
