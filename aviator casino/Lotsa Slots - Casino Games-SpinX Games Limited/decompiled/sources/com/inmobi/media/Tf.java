package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Tf implements com.squareup.picasso.Transformation {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f4977a;

    public Tf(android.graphics.Bitmap.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f4977a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final java.lang.String key() {
        return "config(" + this.f4977a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final android.graphics.Bitmap transform(android.graphics.Bitmap source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        android.graphics.Bitmap copy = source.copy(this.f4977a, false);
        source.recycle();
        kotlin.jvm.internal.Intrinsics.checkNotNull(copy);
        return copy;
    }
}
