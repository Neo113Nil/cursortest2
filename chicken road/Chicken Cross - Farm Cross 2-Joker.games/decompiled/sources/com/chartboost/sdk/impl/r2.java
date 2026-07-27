package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r2 extends n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final boolean a(ah ahVar, View view, MotionEvent motionEvent) {
        if (ahVar != null) {
            Intrinsics.checkNotNull(motionEvent);
            ahVar.a(motionEvent);
        }
        return motionEvent.getAction() == 2;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        super.setWebViewClient(client);
        final ah a2 = client instanceof s2 ? ((s2) client).a() : null;
        setOnTouchListener(new View.OnTouchListener() { // from class: com.chartboost.sdk.impl.r2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return r2.a(ah.this, view, motionEvent);
            }
        });
    }
}
