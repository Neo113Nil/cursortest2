package com.startapp.sdk.internal;

import android.content.DialogInterface;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class f0 implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f3669a;

    public f0(WebView webView) {
        this.f3669a = webView;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f3669a.stopLoading();
    }
}
