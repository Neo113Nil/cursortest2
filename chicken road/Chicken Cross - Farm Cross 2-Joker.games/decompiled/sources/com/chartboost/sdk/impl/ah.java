package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ah extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f4680a;
    public boolean b;

    public ah(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4680a = new GestureDetector(context, this);
    }

    public final boolean a() {
        return this.b;
    }

    public final void b() {
        this.b = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.b = true;
        return super.onSingleTapUp(e);
    }

    public final boolean a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f4680a.onTouchEvent(event);
    }
}
