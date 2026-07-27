package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12180a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WebView webView, i iVar) {
        super(0);
        this.f12180a = webView;
        this.b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.f12180a.getWidth(), this.f12180a.getHeight(), Bitmap.Config.ARGB_8888);
            this.f12180a.draw(new Canvas(createBitmap));
            this.b.invoke(createBitmap);
        } catch (Throwable th) {
            boolean z = u.f12190a;
            t.a("BlackScreenDetector", "Bitmap capture failed", th);
            this.b.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
