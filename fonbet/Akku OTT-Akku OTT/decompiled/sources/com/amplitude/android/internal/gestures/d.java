package com.amplitude.android.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class d extends g {
    public final Activity b;
    public final List<com.amplitude.android.internal.locators.b> c;
    public final com.amplitude.common.a d;
    public final b e;
    public final GestureDetector f;
    public com.amplitude.android.internal.c i;

    public d() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Window.Callback delegate, Activity activity, Function2 track, List viewTargetLocators, com.amplitude.common.a logger, com.amplitude.android.g autocaptureState) {
        super(delegate);
        b motionEventObtainer = new b();
        a gestureListener = new a(activity, track, logger, viewTargetLocators, autocaptureState);
        GestureDetector gestureDetector = new GestureDetector(activity, gestureListener);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(autocaptureState, "autocaptureState");
        Intrinsics.checkNotNullParameter(motionEventObtainer, "motionEventObtainer");
        Intrinsics.checkNotNullParameter(gestureListener, "gestureListener");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        this.b = activity;
        this.c = viewTargetLocators;
        this.d = logger;
        this.e = motionEventObtainer;
        this.f = gestureDetector;
        c callback = new c(this);
        Intrinsics.checkNotNullParameter(callback, "callback");
        gestureListener.e = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent origin) {
        if (origin != null) {
            this.e.getClass();
            Intrinsics.checkNotNullParameter(origin, "origin");
            MotionEvent obtain = MotionEvent.obtain(origin);
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
            try {
                try {
                    this.f.onTouchEvent(obtain);
                } catch (Exception e) {
                    this.d.b("Error handling touch event: " + e);
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                obtain.recycle();
            }
        }
        return this.a.dispatchTouchEvent(origin);
    }
}
