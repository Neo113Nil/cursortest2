package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class l {
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.b> f = com.bumptech.glide.load.h.a(com.bumptech.glide.load.b.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.j> g = new com.bumptech.glide.load.h<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, com.bumptech.glide.load.h.e);
    public static final com.bumptech.glide.load.h<Boolean> h;
    public static final com.bumptech.glide.load.h<Boolean> i;
    public static final Set<String> j;
    public static final a k;
    public static final Set<ImageHeaderParser.ImageType> l;
    public static final ArrayDeque m;
    public final com.bumptech.glide.load.engine.bitmap_recycle.d a;
    public final DisplayMetrics b;
    public final com.bumptech.glide.load.engine.bitmap_recycle.b c;
    public final ArrayList d;
    public final p e = p.a();

    public interface b {
        void a(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) throws IOException;

        void b();
    }

    static {
        k.e eVar = k.a;
        Boolean bool = Boolean.FALSE;
        h = com.bumptech.glide.load.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = com.bumptech.glide.load.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new a();
        l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = com.bumptech.glide.util.m.a;
        m = new ArrayDeque(0);
    }

    public l(ArrayList arrayList, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.d = arrayList;
        com.bumptech.glide.util.l.c(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        com.bumptech.glide.util.l.c(dVar, "Argument must not be null");
        this.a = dVar;
        com.bumptech.glide.util.l.c(bVar, "Argument must not be null");
        this.c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(q qVar, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            qVar.b();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = x.b;
        lock.lock();
        try {
            try {
                Bitmap a2 = qVar.a(options);
                lock.unlock();
                return a2;
            } catch (IllegalArgumentException e) {
                StringBuilder c = androidx.collection.h.c("Exception decoding bitmap, outWidth: ", i2, i3, ", outHeight: ", ", outMimeType: ");
                c.append(str);
                c.append(", inBitmap: ");
                c.append(d(options.inBitmap));
                IOException iOException = new IOException(c.toString(), e);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    dVar.d(bitmap);
                    options.inBitmap = null;
                    Bitmap c2 = c(qVar, options, bVar, dVar);
                    x.b.unlock();
                    return c2;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            x.b.unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final e a(q qVar, int i2, int i3, com.bumptech.glide.load.i iVar, b bVar) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.c(byte[].class, 65536);
        synchronized (l.class) {
            arrayDeque = m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) iVar.b(f);
        com.bumptech.glide.load.j jVar = (com.bumptech.glide.load.j) iVar.b(g);
        k kVar = (k) iVar.b(k.e);
        boolean booleanValue = ((Boolean) iVar.b(h)).booleanValue();
        com.bumptech.glide.load.h<Boolean> hVar = i;
        try {
            e b2 = e.b(b(qVar, options, kVar, bVar2, jVar, iVar.b(hVar) != null && ((Boolean) iVar.b(hVar)).booleanValue(), i2, i3, booleanValue, bVar), this.a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.put(bArr);
            return b2;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(q qVar, BitmapFactory.Options options, k kVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.j jVar, boolean z, int i2, int i3, boolean z2, b bVar2) throws IOException {
        char c;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        l lVar;
        boolean z5;
        boolean z6;
        boolean z7;
        int i8;
        int i9;
        Bitmap c2;
        ColorSpace colorSpace;
        boolean z8;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        int i10;
        int i11;
        int floor;
        int floor2;
        ColorSpace.Named unused;
        int i12 = com.bumptech.glide.util.h.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        com.bumptech.glide.load.engine.bitmap_recycle.d dVar = this.a;
        c(qVar, options, bVar2, dVar);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i13 = iArr[0];
        int i14 = iArr[1];
        boolean z9 = (i13 == -1 || i14 == -1) ? false : z;
        int c3 = qVar.c();
        switch (c3) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (c3) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i15 = i2;
        if (i15 != Integer.MIN_VALUE) {
            i4 = i3;
        } else if (c == 'Z' || c == 270) {
            i4 = i3;
            i15 = i14;
        } else {
            i4 = i3;
            i15 = i13;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = (c == 'Z' || c == 270) ? i13 : i14;
        }
        ImageHeaderParser.ImageType d = qVar.d();
        if (i13 <= 0 || i14 <= 0) {
            i5 = i14;
            i6 = i13;
            z4 = z9;
            i7 = c3;
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(d);
            }
            lVar = this;
        } else {
            i7 = c3;
            if (c == 'Z' || c == 270) {
                i10 = i14;
                i11 = i13;
            } else {
                i11 = i14;
                i10 = i13;
            }
            float b2 = kVar.b(i10, i11, i15, i4);
            if (b2 <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + kVar + ", source: [" + i13 + "x" + i14 + "], target: [" + i15 + "x" + i4 + "]");
            }
            z4 = z9;
            k.g a2 = kVar.a(i10, i11, i15, i4);
            if (a2 == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f2 = i10;
            float f3 = i11;
            int i16 = i10 / ((int) ((b2 * f2) + 0.5d));
            int i17 = i11 / ((int) ((b2 * f3) + 0.5d));
            k.g gVar = k.g.a;
            int max = Math.max(1, Integer.highestOneBit(a2 == gVar ? Math.max(i16, i17) : Math.min(i16, i17)));
            if (a2 == gVar && max < 1.0f / b2) {
                max <<= 1;
            }
            options.inSampleSize = max;
            if (d == ImageHeaderParser.ImageType.JPEG) {
                float min = Math.min(max, 8);
                floor = (int) Math.ceil(f2 / min);
                floor2 = (int) Math.ceil(f3 / min);
                int i18 = max / 8;
                if (i18 > 0) {
                    floor /= i18;
                    floor2 /= i18;
                }
            } else if (d == ImageHeaderParser.ImageType.PNG || d == ImageHeaderParser.ImageType.PNG_A) {
                float f4 = max;
                floor = (int) Math.floor(f2 / f4);
                floor2 = (int) Math.floor(f3 / f4);
            } else if (d.isWebp()) {
                float f5 = max;
                floor = Math.round(f2 / f5);
                floor2 = Math.round(f3 / f5);
            } else if (i10 % max == 0 && i11 % max == 0) {
                floor = i10 / max;
                floor2 = i11 / max;
            } else {
                options.inJustDecodeBounds = true;
                c(qVar, options, bVar2, dVar);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                floor = iArr2[0];
                floor2 = iArr2[1];
            }
            double b3 = kVar.b(floor, floor2, i15, i4);
            options.inTargetDensity = (int) (((b3 / (r11 / r10)) * ((int) ((((int) Math.round((b3 <= 1.0d ? b3 : 1.0d / b3) * 2.147483647E9d)) * b3) + 0.5d))) + 0.5d);
            if (b3 > 1.0d) {
                b3 = 1.0d / b3;
            }
            int round = (int) Math.round(b3 * 2.147483647E9d);
            options.inDensity = round;
            int i19 = options.inTargetDensity;
            if (i19 <= 0 || round <= 0 || i19 == round) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            Log.isLoggable("Downsampler", 2);
            lVar = this;
            i6 = i13;
            i5 = i14;
        }
        boolean c4 = lVar.e.c(i15, i4, z4, z3);
        if (c4) {
            config3 = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config3;
            z5 = false;
            options.inMutable = false;
        } else {
            z5 = false;
        }
        if (!c4) {
            if (bVar != com.bumptech.glide.load.b.a) {
                try {
                    z6 = qVar.d().hasAlpha();
                } catch (IOException unused2) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(bVar);
                    }
                    z6 = z5;
                }
                Bitmap.Config config4 = z6 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config4;
                if (config4 == Bitmap.Config.RGB_565) {
                    z7 = true;
                    options.inDither = true;
                }
            } else {
                z7 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            i8 = Build.VERSION.SDK_INT;
            if (i6 >= 0 || i5 < 0 || !z2) {
                int i20 = options.inTargetDensity;
                float f6 = !((i20 > 0 || (i9 = options.inDensity) <= 0 || i20 == i9) ? z5 : z7) ? i20 / options.inDensity : 1.0f;
                float f7 = options.inSampleSize;
                int ceil = (int) Math.ceil(i6 / f7);
                int ceil2 = (int) Math.ceil(i5 / f7);
                int round2 = Math.round(ceil * f6);
                i4 = Math.round(ceil2 * f6);
                Log.isLoggable("Downsampler", 2);
                i15 = round2;
            }
            Bitmap bitmap = null;
            if (i15 > 0 && i4 > 0) {
                if (i8 < 26) {
                    Bitmap.Config config5 = options.inPreferredConfig;
                    config2 = Bitmap.Config.HARDWARE;
                    if (config5 != config2) {
                        config = options.outConfig;
                    }
                } else {
                    config = null;
                }
                if (config == null) {
                    config = options.inPreferredConfig;
                }
                options.inBitmap = dVar.c(i15, i4, config);
            }
            if (jVar != null) {
                if (i8 >= 28) {
                    if (jVar == com.bumptech.glide.load.j.a) {
                        colorSpace3 = options.outColorSpace;
                        if (colorSpace3 != null) {
                            colorSpace4 = options.outColorSpace;
                            isWideGamut = colorSpace4.isWideGamut();
                            if (isWideGamut) {
                                z8 = z7;
                                colorSpace2 = ColorSpace.get(!z8 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                options.inPreferredColorSpace = colorSpace2;
                            }
                        }
                    }
                    z8 = z5;
                    colorSpace2 = ColorSpace.get(!z8 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                    options.inPreferredColorSpace = colorSpace2;
                } else if (i8 >= 26) {
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    options.inPreferredColorSpace = colorSpace;
                }
            }
            c2 = c(qVar, options, bVar2, dVar);
            bVar2.a(c2, dVar);
            if (Log.isLoggable("Downsampler", 2)) {
                d(c2);
                d(options.inBitmap);
                Thread.currentThread().getName();
                SystemClock.elapsedRealtimeNanos();
            }
            if (c2 != null) {
                c2.setDensity(lVar.b.densityDpi);
                switch (i7) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix = new Matrix();
                        switch (i7) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, c2.getWidth(), c2.getHeight());
                        matrix.mapRect(rectF);
                        bitmap = dVar.e(Math.round(rectF.width()), Math.round(rectF.height()), c2.getConfig() != null ? c2.getConfig() : Bitmap.Config.ARGB_8888);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        bitmap.setHasAlpha(c2.hasAlpha());
                        x.a(c2, bitmap, matrix);
                        break;
                    default:
                        bitmap = c2;
                        break;
                }
                if (!c2.equals(bitmap)) {
                    dVar.d(c2);
                }
            }
            return bitmap;
        }
        z7 = true;
        i8 = Build.VERSION.SDK_INT;
        if (i6 >= 0) {
        }
        int i202 = options.inTargetDensity;
        if (!((i202 > 0 || (i9 = options.inDensity) <= 0 || i202 == i9) ? z5 : z7)) {
        }
        float f72 = options.inSampleSize;
        int ceil3 = (int) Math.ceil(i6 / f72);
        int ceil22 = (int) Math.ceil(i5 / f72);
        int round22 = Math.round(ceil3 * f6);
        i4 = Math.round(ceil22 * f6);
        Log.isLoggable("Downsampler", 2);
        i15 = round22;
        Bitmap bitmap2 = null;
        if (i15 > 0) {
            if (i8 < 26) {
            }
            if (config == null) {
            }
            options.inBitmap = dVar.c(i15, i4, config);
        }
        if (jVar != null) {
        }
        c2 = c(qVar, options, bVar2, dVar);
        bVar2.a(c2, dVar);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        if (c2 != null) {
        }
        return bitmap2;
    }

    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public final void a(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        }
    }
}
