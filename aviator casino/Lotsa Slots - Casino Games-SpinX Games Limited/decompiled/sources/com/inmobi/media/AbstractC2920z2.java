package com.inmobi.media;

/* renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2920z2 extends android.webkit.WebView {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.Lazy f5580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2920z2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f5580a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.z2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.AbstractC2920z2.a(com.inmobi.media.AbstractC2920z2.this);
            }
        });
    }

    public static final com.inmobi.media.C2325cb a(com.inmobi.media.AbstractC2920z2 abstractC2920z2) {
        return abstractC2920z2.d();
    }

    public abstract com.inmobi.media.C2325cb d();

    public final com.inmobi.media.C2325cb getLandingPageHandler() {
        return (com.inmobi.media.C2325cb) this.f5580a.getValue();
    }
}
