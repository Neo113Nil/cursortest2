package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* compiled from: WindVanePlugin.java */
/* loaded from: classes6.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    protected Context f9632a;
    protected Object b;
    protected WindVaneWebView c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f9632a = context;
        this.c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.b = obj;
        this.c = windVaneWebView;
    }
}
