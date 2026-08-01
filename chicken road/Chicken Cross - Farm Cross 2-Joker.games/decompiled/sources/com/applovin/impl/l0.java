package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class l0 extends AppLovinWebViewBase {
    private static Boolean b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f4277a;

    public l0(Context context) {
        super(context);
        this.f4277a = new AtomicReference();
        if (b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f4277a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f4277a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f4277a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f4277a.set(MotionEvent.obtain(motionEvent));
        if (b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
