package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zq extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f7532a = true;
        super.destroy();
    }
}
