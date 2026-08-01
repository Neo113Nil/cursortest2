package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dd extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f4730a;
    public boolean b;

    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            dd.this.b = true;
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4730a = new GestureDetector(context, new a());
    }

    public final boolean getGestureDetected() {
        return this.b;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4730a.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public final void a() {
        this.b = false;
    }
}
