package com.vungle.ads.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12184a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WebView webView, j jVar, int i) {
        super(1);
        this.f12184a = webView;
        this.b = jVar;
        this.c = i;
    }

    public final void a(final Bitmap bitmap) {
        Context context = this.f12184a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        com.vungle.ads.internal.executor.j d = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new h(context)).getValue())).d();
        final j jVar = this.b;
        final int i = this.c;
        d.execute(new Runnable() { // from class: com.vungle.ads.internal.util.i$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i.a(j.this, bitmap, i);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Bitmap) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r5 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(j this$0, Bitmap bitmap, int i) {
        Function2 function2;
        Function2 function22;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.getClass();
            Pair a2 = j.a(bitmap, i);
            int intValue = ((Number) a2.component1()).intValue();
            String str = (String) a2.component2();
            function22 = this$0.f12185a;
            if (function22 != null) {
                function22.invoke(Integer.valueOf(intValue), str);
            }
        } catch (Throwable th) {
            try {
                boolean z = u.f12190a;
                t.a("BlackScreenDetector", "Black screen detection failed", th);
                function2 = this$0.f12185a;
                if (function2 != null) {
                    function2.invoke(-1, "Internal calculation error: " + th.getMessage());
                }
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this$0.f12185a = null;
            }
        }
    }
}
