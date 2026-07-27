package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ed extends hg {
    public /* synthetic */ ed(Context context, String str, t5 t5Var, da daVar, String str2, id idVar, h7 h7Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, t5Var, daVar, str2, idVar, h7Var, (i & 128) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.ed$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ed.a((Context) obj);
            }
        } : function1);
    }

    public static final n3 a(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new n3(it);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(Context context, String html, t5 callback, da impressionInterface, String str, id nativeBridgeCommand, h7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }
}
