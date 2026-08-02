package S5;

import Am.C2438a;
import J0.P;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import c6.C;
import c6.C5753e;
import c6.n;
import c6.o;
import com.bumptech.glide.integration.webp.WebpBitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final T5.h<Boolean> f25816e = T5.h.c(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder");

    /* renamed from: f, reason: collision with root package name */
    public static final T5.h<Boolean> f25817f = T5.h.c(Boolean.TRUE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.SystemDecoder");

    /* renamed from: g, reason: collision with root package name */
    private static final o.b f25818g = new a();

    /* renamed from: h, reason: collision with root package name */
    private static final ArrayDeque f25819h;

    /* renamed from: a, reason: collision with root package name */
    private final W5.d f25820a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f25821b;

    /* renamed from: c, reason: collision with root package name */
    private final W5.b f25822c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f25823d;

    static class a implements o.b {
        @Override // c6.o.b
        public final void a() {
        }

        @Override // c6.o.b
        public final void b(W5.d dVar, Bitmap bitmap) throws IOException {
        }
    }

    static {
        int i11 = p6.l.f80283d;
        f25819h = new ArrayDeque(0);
    }

    public j(ArrayList arrayList, DisplayMetrics displayMetrics, W5.d dVar, W5.b bVar) {
        this.f25823d = arrayList;
        p6.k.c(displayMetrics, "Argument must not be null");
        this.f25821b = displayMetrics;
        p6.k.c(dVar, "Argument must not be null");
        this.f25820a = dVar;
        p6.k.c(bVar, "Argument must not be null");
        this.f25822c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap b(InputStream inputStream, BitmapFactory.Options options, c6.n nVar, T5.b bVar, int i11, int i12, boolean z11, o.b bVar2) throws IOException {
        char c11;
        int i13;
        String str;
        W5.d dVar;
        String str2;
        boolean z12;
        String str3;
        boolean z13;
        W5.d dVar2;
        Bitmap.Config config;
        int i14;
        boolean z14;
        int floor;
        int floor2;
        int i15;
        int i16;
        int i17 = p6.g.f80269b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        W5.d dVar3 = this.f25820a;
        c(inputStream, options, bVar2, dVar3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i18 = iArr[0];
        int i19 = iArr[1];
        String str4 = options.outMimeType;
        ArrayList arrayList = this.f25823d;
        W5.b bVar3 = this.f25822c;
        int b11 = com.bumptech.glide.load.c.b(arrayList, inputStream, bVar3);
        switch (b11) {
            case 3:
            case 4:
                c11 = 180;
                i13 = b11;
                break;
            case 5:
            case 6:
                i13 = b11;
                c11 = 'Z';
                break;
            case 7:
            case 8:
                i13 = b11;
                c11 = 270;
                break;
            default:
                i13 = b11;
                c11 = 0;
                break;
        }
        int i21 = i11 == Integer.MIN_VALUE ? i18 : i11;
        int i22 = i12 == Integer.MIN_VALUE ? i19 : i12;
        ImageHeaderParser.ImageType d11 = com.bumptech.glide.load.c.d(arrayList, inputStream, bVar3);
        if (i18 <= 0 || i19 <= 0) {
            str = ", target density: ";
            dVar = dVar3;
            str2 = ", density: ";
            z12 = false;
            str3 = "x";
        } else {
            float b12 = (c11 == 'Z' || c11 == 270) ? nVar.b(i19, i18, i21, i22) : nVar.b(i18, i19, i21, i22);
            if (b12 <= 0.0f) {
                StringBuilder sb2 = new StringBuilder("Cannot scale with factor: ");
                sb2.append(b12);
                sb2.append(" from: ");
                sb2.append(nVar);
                sb2.append(", source: [");
                Ek.a.f(i18, i19, "x", "], target: [", sb2);
                throw new IllegalArgumentException(P.a(i21, i22, "x", "]", sb2));
            }
            n.g a11 = nVar.a(i18, i19, i21, i22);
            if (a11 == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f7 = i18;
            float f11 = b12;
            int i23 = (int) ((b12 * f7) + 0.5d);
            float f12 = i19;
            int i24 = (int) ((f11 * f12) + 0.5d);
            int i25 = i18 / i23;
            int i26 = i19 / i24;
            n.g gVar = n.g.MEMORY;
            int max = Math.max(1, Integer.highestOneBit(a11 == gVar ? Math.max(i25, i26) : Math.min(i25, i26)));
            if (a11 == gVar && max < 1.0f / f11) {
                max <<= 1;
            }
            options.inSampleSize = max;
            if (d11 == ImageHeaderParser.ImageType.JPEG) {
                float min = Math.min(max, 8);
                floor = (int) Math.ceil(f7 / min);
                int ceil = (int) Math.ceil(f12 / min);
                int i27 = max / 8;
                if (i27 > 0) {
                    floor /= i27;
                    ceil /= i27;
                }
                floor2 = ceil;
            } else if (d11 == ImageHeaderParser.ImageType.PNG || d11 == ImageHeaderParser.ImageType.PNG_A) {
                float f13 = max;
                floor = (int) Math.floor(f7 / f13);
                floor2 = (int) Math.floor(f12 / f13);
            } else {
                if (d11 == ImageHeaderParser.ImageType.WEBP || d11 == ImageHeaderParser.ImageType.WEBP_A) {
                    float f14 = max;
                    int round = Math.round(f7 / f14);
                    floor2 = Math.round(f12 / f14);
                    i15 = round;
                } else if (i18 % max == 0 && i19 % max == 0) {
                    i15 = i18 / max;
                    floor2 = i19 / max;
                } else {
                    options.inJustDecodeBounds = true;
                    c(inputStream, options, bVar2, dVar3);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    int i28 = iArr2[0];
                    floor2 = iArr2[1];
                    i15 = i28;
                }
                double b13 = nVar.b(i15, floor2, i21, i22);
                dVar = dVar3;
                i16 = (int) ((((int) ((1.0E9d * b13) + 0.5d)) * (b13 / (r0 / 1.0E9f))) + 0.5d);
                options.inTargetDensity = i16;
                options.inDensity = 1000000000;
                if (i16 > 0 || i16 == 1000000000) {
                    z12 = false;
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                    z12 = false;
                }
                if (Log.isLoggable("WebpDownsampler", 2)) {
                    str2 = ", density: ";
                    str = ", target density: ";
                    str3 = "x";
                } else {
                    str3 = "x";
                    StringBuilder a12 = C2438a.a("Calculate scaling, source: [", i18, str3, "], target: [", i19);
                    Ek.a.f(i21, i22, str3, "], power of two scaled: [", a12);
                    Ek.a.f(i15, floor2, str3, "], exact scale factor: ", a12);
                    a12.append(f11);
                    a12.append(", power of 2 sample size: ");
                    a12.append(max);
                    a12.append(", adjusted scale factor: ");
                    a12.append(b13);
                    str = ", target density: ";
                    a12.append(str);
                    a12.append(options.inTargetDensity);
                    str2 = ", density: ";
                    a12.append(str2);
                    a12.append(options.inDensity);
                    Log.v("WebpDownsampler", a12.toString());
                }
            }
            i15 = floor;
            double b132 = nVar.b(i15, floor2, i21, i22);
            dVar = dVar3;
            i16 = (int) ((((int) ((1.0E9d * b132) + 0.5d)) * (b132 / (r0 / 1.0E9f))) + 0.5d);
            options.inTargetDensity = i16;
            options.inDensity = 1000000000;
            if (i16 > 0) {
            }
            z12 = false;
            options.inTargetDensity = 0;
            options.inDensity = 0;
            if (Log.isLoggable("WebpDownsampler", 2)) {
            }
        }
        if (bVar != T5.b.PREFER_ARGB_8888) {
            try {
                z14 = com.bumptech.glide.load.c.d(arrayList, inputStream, bVar3).hasAlpha();
            } catch (IOException e11) {
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e11);
                }
                z14 = z12;
            }
            Bitmap.Config config2 = z14 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444 || config2 == Bitmap.Config.ALPHA_8) {
                z13 = true;
                options.inDither = true;
            } else {
                z13 = true;
            }
        } else {
            z13 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        if (!z11) {
            int i29 = options.inTargetDensity;
            if (i29 > 0 && (i14 = options.inDensity) > 0 && i29 != i14) {
                z12 = z13;
            }
            float f15 = z12 ? i29 / options.inDensity : 1.0f;
            int i31 = options.inSampleSize;
            float f16 = i31;
            int ceil2 = (int) Math.ceil(i18 / f16);
            int ceil3 = (int) Math.ceil(i19 / f16);
            int round2 = Math.round(ceil2 * f15);
            i22 = Math.round(ceil3 * f15);
            if (Log.isLoggable("WebpDownsampler", 2)) {
                StringBuilder a13 = C2438a.a("Calculated target [", round2, str3, "] for source [", i22);
                Ek.a.f(i18, i19, str3, "], sampleSize: ", a13);
                a13.append(i31);
                a13.append(", targetDensity: ");
                a13.append(options.inTargetDensity);
                a13.append(str2);
                a13.append(options.inDensity);
                a13.append(", density multiplier: ");
                a13.append(f15);
                Log.v("WebpDownsampler", a13.toString());
            }
            i21 = round2;
        }
        if (i21 <= 0 || i22 <= 0 || (config = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            options.inBitmap = dVar2.d(i21, i22, config);
        }
        Bitmap c12 = c(inputStream, options, bVar2, dVar2);
        bVar2.getClass();
        if (Log.isLoggable("WebpDownsampler", 2)) {
            StringBuilder sb3 = new StringBuilder("Decoded ");
            Pk0.g.d(i18, d(c12), " from [", str3, sb3);
            Pk0.i.c(i19, "] ", str4, " with inBitmap ", sb3);
            Pk0.g.d(i11, d(options.inBitmap), " for [", str3, sb3);
            sb3.append(i12);
            sb3.append("], sample size: ");
            sb3.append(options.inSampleSize);
            sb3.append(str2);
            sb3.append(options.inDensity);
            sb3.append(str);
            sb3.append(options.inTargetDensity);
            sb3.append(", thread: ");
            sb3.append(Thread.currentThread().getName());
            sb3.append(", duration: ");
            sb3.append(p6.g.a(elapsedRealtimeNanos));
            Log.v("WebpDownsampler", sb3.toString());
        }
        if (c12 == null) {
            return null;
        }
        c12.setDensity(this.f25821b.densityDpi);
        Bitmap g10 = C.g(dVar2, c12, i13);
        if (c12.equals(g10)) {
            return g10;
        }
        dVar2.c(c12);
        return g10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap c(InputStream inputStream, BitmapFactory.Options options, o.b bVar, W5.d dVar) throws IOException {
        if (options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            bVar.getClass();
        }
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        String str = options.outMimeType;
        C.f().lock();
        try {
            try {
                Bitmap decodeStream = WebpBitmapFactory.decodeStream(inputStream, null, options);
                C.f().unlock();
                if (options.inJustDecodeBounds) {
                    inputStream.reset();
                }
                return decodeStream;
            } catch (IllegalArgumentException e11) {
                StringBuilder a11 = C2438a.a("Exception decoding bitmap, outWidth: ", i11, ", outHeight: ", ", outMimeType: ", i12);
                a11.append(str);
                a11.append(", inBitmap: ");
                a11.append(d(options.inBitmap));
                IOException iOException = new IOException(a11.toString(), e11);
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                if (options.inBitmap == null) {
                    throw iOException;
                }
                try {
                    inputStream.reset();
                    dVar.c(options.inBitmap);
                    options.inBitmap = null;
                    Bitmap c11 = c(inputStream, options, bVar, dVar);
                    C.f().unlock();
                    return c11;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th2) {
            C.f().unlock();
            throw th2;
        }
    }

    @TargetApi(19)
    private static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C5753e a(InputStream inputStream, int i11, int i12, T5.i iVar) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        o.b bVar = f25818g;
        p6.k.a("You must provide an InputStream that supports mark()", inputStream.markSupported());
        byte[] bArr = (byte[]) this.f25822c.b(65536, byte[].class);
        synchronized (j.class) {
            arrayDeque = f25819h;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        T5.b bVar2 = (T5.b) iVar.a(c6.o.f56570f);
        c6.n nVar = (c6.n) iVar.a(c6.o.f56572h);
        boolean booleanValue = ((Boolean) iVar.a(c6.o.f56573i)).booleanValue();
        T5.h<Boolean> hVar = c6.o.f56574j;
        if (iVar.a(hVar) != null) {
            ((Boolean) iVar.a(hVar)).booleanValue();
        }
        try {
            C5753e c11 = C5753e.c(this.f25820a, b(inputStream, options2, nVar, bVar2, i11, i12, booleanValue, bVar));
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f25822c.put(bArr);
            return c11;
        } catch (Throwable th2) {
            f(options2);
            ArrayDeque arrayDeque2 = f25819h;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f25822c.put(bArr);
                throw th2;
            }
        }
    }

    public final boolean e(InputStream inputStream, T5.i iVar) throws IOException {
        if (((Boolean) iVar.a(f25816e)).booleanValue() || ((Boolean) iVar.a(f25817f)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.c.e(com.bumptech.glide.integration.webp.c.c(inputStream, this.f25822c));
    }
}
