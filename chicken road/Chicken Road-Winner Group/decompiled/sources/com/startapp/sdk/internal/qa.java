package com.startapp.sdk.internal;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class qa implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f4260a;

    public qa(wa waVar) {
        this.f4260a = waVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f4260a.y = true;
        return false;
    }
}
