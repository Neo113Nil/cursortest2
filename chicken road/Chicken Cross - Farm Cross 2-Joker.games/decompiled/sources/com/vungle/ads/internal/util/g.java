package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12182a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ j c;
    public final /* synthetic */ Window d;
    public final /* synthetic */ Function1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WebView webView, Lazy lazy, j jVar, Window window, i iVar) {
        super(0);
        this.f12182a = webView;
        this.b = lazy;
        this.c = jVar;
        this.d = window;
        this.e = iVar;
    }

    public final void a() {
        final int width = this.f12182a.getWidth();
        final int height = this.f12182a.getHeight();
        int[] iArr = new int[2];
        this.f12182a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        final Rect rect = new Rect(i, i2, i + width, i2 + height);
        com.vungle.ads.internal.executor.j jVar = ((com.vungle.ads.internal.executor.d) j.a(this.b)).c;
        final j jVar2 = this.c;
        final Window window = this.d;
        final Function1 function1 = this.e;
        jVar.execute(new Runnable() { // from class: com.vungle.ads.internal.util.g$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                g.a(width, height, jVar2, window, rect, function1);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.INSTANCE;
    }

    public static final void a(int i, int i2, j this$0, Window window, Rect rect, Function1 onComplete) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rect, "$rect");
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        try {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            try {
                j.a(this$0, window, rect, bitmap, onComplete);
            } catch (Throwable th) {
                th = th;
                boolean z = u.f12190a;
                t.a("BlackScreenDetector", "Bitmap creation failed", th);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                onComplete.invoke(null);
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
    }
}
