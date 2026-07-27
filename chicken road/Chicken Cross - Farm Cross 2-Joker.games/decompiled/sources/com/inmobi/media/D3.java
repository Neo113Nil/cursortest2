package com.inmobi.media;

import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D3 implements M3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H3 f6503a;

    public D3(H3 h3) {
        this.f6503a = h3;
    }

    @Override // com.inmobi.media.M3
    public final void a(C4066s3 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        H3 h3 = this.f6503a;
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = click;
        h3.sendMessage(obtain);
    }

    @Override // com.inmobi.media.M3
    public final void a(C4066s3 click, B6 b6) {
        B6 errorCode = B6.d;
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        X3 x3 = X3.f6941a;
        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
        String str = "Pinging click (" + click.b + ") via WebView failed ...";
        X3.b(click);
        this.f6503a.b(click);
    }
}
