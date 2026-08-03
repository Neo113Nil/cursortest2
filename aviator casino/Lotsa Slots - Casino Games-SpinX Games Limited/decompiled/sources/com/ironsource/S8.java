package com.ironsource;

/* loaded from: classes5.dex */
public final class S8 implements com.ironsource.T8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Q3 f5960a;

    /* JADX WARN: Multi-variable type inference failed */
    public S8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final java.lang.Object b(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("file does not exists")));
        }
        android.graphics.drawable.Drawable createFromPath = android.graphics.drawable.Drawable.createFromPath(file.getPath());
        if (createFromPath == null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("failed to create a drawable")));
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(createFromPath);
    }

    private final java.lang.Object c(java.lang.String str) {
        java.io.InputStream a2 = this.f5960a.a(str);
        try {
            android.graphics.drawable.Drawable createFromStream = android.graphics.drawable.Drawable.createFromStream(a2, new java.io.File(str).getName());
            kotlin.io.CloseableKt.closeFinally(a2, null);
            if (createFromStream == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("failed to create a drawable")));
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(createFromStream);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(a2, th);
                throw th2;
            }
        }
    }

    private final boolean d(java.lang.String str) {
        return android.webkit.URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.T8
    public java.lang.Object a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e));
        }
    }

    public S8(com.ironsource.Q3 connectionFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f5960a = connectionFactory;
    }

    public /* synthetic */ S8(com.ironsource.Q3 q3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.ironsource.H4.f5738a : q3);
    }
}
