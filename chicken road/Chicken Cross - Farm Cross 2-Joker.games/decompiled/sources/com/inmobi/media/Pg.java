package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Pg implements Transformation {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f6785a;

    public Pg(Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6785a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.f6785a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Bitmap copy = source.copy(this.f6785a, false);
        source.recycle();
        Intrinsics.checkNotNull(copy);
        return copy;
    }
}
