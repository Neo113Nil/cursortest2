package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.util.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface q {

    public static final class a implements q {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;
        public final com.bumptech.glide.load.engine.bitmap_recycle.b c;

        public a(ByteBuffer byteBuffer, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.a = byteBuffer;
            this.b = arrayList;
            this.c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        @Nullable
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new a.C0067a(com.bumptech.glide.util.a.c(this.a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final int c() throws IOException {
            ByteBuffer c = com.bumptech.glide.util.a.c(this.a);
            com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.c;
            if (c != null) {
                List<ImageHeaderParser> list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int b = list.get(i).b(c, bVar);
                        if (b != -1) {
                            return b;
                        }
                    } finally {
                        com.bumptech.glide.util.a.c(c);
                    }
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.f.c(this.b, com.bumptech.glide.util.a.c(this.a));
        }
    }

    public static final class b implements q {
        public final com.bumptech.glide.load.data.k a;
        public final com.bumptech.glide.load.engine.bitmap_recycle.b b;
        public final List<ImageHeaderParser> c;

        public b(com.bumptech.glide.util.j jVar, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            com.bumptech.glide.util.l.c(bVar, "Argument must not be null");
            this.b = bVar;
            com.bumptech.glide.util.l.c(arrayList, "Argument must not be null");
            this.c = arrayList;
            this.a = new com.bumptech.glide.load.data.k(jVar, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        @Nullable
        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            u uVar = this.a.a;
            uVar.reset();
            return BitmapFactory.decodeStream(uVar, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final void b() {
            u uVar = this.a.a;
            synchronized (uVar) {
                uVar.c = uVar.a.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final int c() throws IOException {
            u uVar = this.a.a;
            uVar.reset();
            return com.bumptech.glide.load.f.a(this.c, uVar, this.b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final ImageHeaderParser.ImageType d() throws IOException {
            u uVar = this.a.a;
            uVar.reset();
            return com.bumptech.glide.load.f.b(this.c, uVar, this.b);
        }
    }

    @RequiresApi(21)
    public static final class c implements q {
        public final com.bumptech.glide.load.engine.bitmap_recycle.b a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            com.bumptech.glide.util.l.c(bVar, "Argument must not be null");
            this.a = bVar;
            com.bumptech.glide.util.l.c(arrayList, "Argument must not be null");
            this.b = arrayList;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        @Nullable
        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.b().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final int c() throws IOException {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                u uVar = null;
                try {
                    u uVar2 = new u(new FileInputStream(parcelFileDescriptorRewinder.b().getFileDescriptor()), bVar);
                    try {
                        int d = imageHeaderParser.d(uVar2, bVar);
                        uVar2.l();
                        parcelFileDescriptorRewinder.b();
                        if (d != -1) {
                            return d;
                        }
                    } catch (Throwable th) {
                        th = th;
                        uVar = uVar2;
                        if (uVar != null) {
                            uVar.l();
                        }
                        parcelFileDescriptorRewinder.b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public final ImageHeaderParser.ImageType d() throws IOException {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                u uVar = null;
                try {
                    u uVar2 = new u(new FileInputStream(parcelFileDescriptorRewinder.b().getFileDescriptor()), bVar);
                    try {
                        ImageHeaderParser.ImageType c = imageHeaderParser.c(uVar2);
                        uVar2.l();
                        parcelFileDescriptorRewinder.b();
                        if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                            return c;
                        }
                    } catch (Throwable th) {
                        th = th;
                        uVar = uVar2;
                        if (uVar != null) {
                            uVar.l();
                        }
                        parcelFileDescriptorRewinder.b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    @Nullable
    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
