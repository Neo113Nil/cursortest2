package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.internal.ads.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983ff {

    /* renamed from: a, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0805bf f13477a;

    /* renamed from: b, reason: collision with root package name */
    public final Qt f13478b;

    public C0983ff(ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf, Qt qt) {
        this.f13478b = qt;
        this.f13477a = viewTreeObserverOnGlobalLayoutListenerC0805bf;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            T2.G.m("Click string is empty, not proceeding.");
            return "";
        }
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f13477a;
        Q4 q42 = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12882l;
        if (q42 == null) {
            T2.G.m("Signal utils is empty, ignoring.");
            return "";
        }
        N4 n42 = q42.f11167b;
        if (n42 == null) {
            T2.G.m("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf.getContext() != null) {
            return n42.h(viewTreeObserverOnGlobalLayoutListenerC0805bf.getContext(), str, viewTreeObserverOnGlobalLayoutListenerC0805bf, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12880k.f14252a);
        }
        T2.G.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f13477a;
        Q4 q42 = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12882l;
        if (q42 == null) {
            T2.G.m("Signal utils is empty, ignoring.");
            return "";
        }
        N4 n42 = q42.f11167b;
        if (n42 == null) {
            T2.G.m("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf.getContext() != null) {
            return n42.e(viewTreeObserverOnGlobalLayoutListenerC0805bf.getContext(), viewTreeObserverOnGlobalLayoutListenerC0805bf, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12880k.f14252a);
        }
        T2.G.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            U2.j.i("URL is empty, ignoring message");
        } else {
            T2.L.f5672l.post(new Kw(18, this, str));
        }
    }
}
