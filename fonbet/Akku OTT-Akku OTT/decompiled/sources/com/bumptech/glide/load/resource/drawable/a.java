package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.h;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import com.bumptech.glide.util.m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class a {
    public final ArrayList a;
    public final com.bumptech.glide.load.engine.bitmap_recycle.b b;

    /* renamed from: com.bumptech.glide.load.resource.drawable.a$a, reason: collision with other inner class name */
    public static final class C0063a implements x<Drawable> {
        public final AnimatedImageDrawable a;

        public C0063a(AnimatedImageDrawable animatedImageDrawable) {
            this.a = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.x
        public final int a() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.a.getIntrinsicWidth();
            intrinsicHeight = this.a.getIntrinsicHeight();
            return m.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
        }

        @Override // com.bumptech.glide.load.engine.x
        @NonNull
        public final Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.x
        @NonNull
        public final Drawable get() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.engine.x
        public final void recycle() {
            this.a.stop();
            this.a.clearAnimationCallbacks();
        }
    }

    public static final class b implements k<ByteBuffer, Drawable> {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.k
        public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull i iVar) throws IOException {
            ImageHeaderParser.ImageType c = com.bumptech.glide.load.f.c(this.a.a, byteBuffer);
            if (c != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && c == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // com.bumptech.glide.load.k
        public final x<Drawable> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return a.a(createSource, i, i2, iVar);
        }
    }

    public static final class c implements k<InputStream, Drawable> {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.k
        public final boolean a(@NonNull InputStream inputStream, @NonNull i iVar) throws IOException {
            a aVar = this.a;
            ImageHeaderParser.ImageType b = com.bumptech.glide.load.f.b(aVar.a, inputStream, aVar.b);
            if (b != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && b == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // com.bumptech.glide.load.k
        public final x<Drawable> b(@NonNull InputStream inputStream, int i, int i2, @NonNull i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
            return a.a(createSource, i, i2, iVar);
        }
    }

    public a(ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.a = arrayList;
        this.b = bVar;
    }

    public static C0063a a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull i iVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new com.bumptech.glide.load.resource.b(i, i2, iVar));
        if (h.e(decodeDrawable)) {
            return new C0063a(androidx.core.view.accessibility.i.b(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }
}
