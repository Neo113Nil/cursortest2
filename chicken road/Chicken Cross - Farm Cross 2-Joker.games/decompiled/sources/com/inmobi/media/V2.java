package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class V2 extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f6904a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6904a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.V2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V2.a(V2.this);
            }
        });
    }

    public static final Ub a(V2 v2) {
        return v2.d();
    }

    public abstract Ub d();

    public final Ub getLandingPageHandler() {
        return (Ub) this.f6904a.getValue();
    }
}
