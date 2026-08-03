package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Co extends android.webkit.WebView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Co(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f4650a = true;
        super.destroy();
    }
}
