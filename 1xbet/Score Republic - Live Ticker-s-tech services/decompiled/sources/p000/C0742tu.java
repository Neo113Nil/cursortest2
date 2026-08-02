package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0107a;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: tu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0742tu {

    /* JADX INFO: renamed from: f */
    public static final ru0 f7590f = ru0.m4406a(EnumC0034aq.f594l, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g */
    public static final ru0 f7591g = new ru0("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, ru0.f6969e);

    /* JADX INFO: renamed from: h */
    public static final ru0 f7592h;

    /* JADX INFO: renamed from: i */
    public static final ru0 f7593i;

    /* JADX INFO: renamed from: j */
    public static final wa0 f7594j;

    /* JADX INFO: renamed from: k */
    public static final ArrayDeque f7595k;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0318ic f7596a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f7597b;

    /* JADX INFO: renamed from: c */
    public final nk0 f7598c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f7599d;

    /* JADX INFO: renamed from: e */
    public final na0 f7600e = na0.m3507a();

    static {
        C0594pu c0594pu = AbstractC0668ru.f6965a;
        Boolean bool = Boolean.FALSE;
        f7592h = ru0.m4406a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f7593i = ru0.m4406a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f7594j = new wa0(21);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        f7595k = new ArrayDeque(0);
    }

    public C0742tu(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0318ic interfaceC0318ic, nk0 nk0Var) {
        this.f7599d = arrayList;
        o80.m3647h(displayMetrics, "Argument must not be null");
        this.f7597b = displayMetrics;
        o80.m3647h(interfaceC0318ic, "Argument must not be null");
        this.f7596a = interfaceC0318ic;
        o80.m3647h(nk0Var, "Argument must not be null");
        this.f7598c = nk0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m4844c(qd0 qd0Var, BitmapFactory.Options options, InterfaceC0705su interfaceC0705su, InterfaceC0318ic interfaceC0318ic) {
        if (!options.inJustDecodeBounds) {
            interfaceC0705su.mo90n();
            switch (qd0Var.f6470j) {
                case 23:
                    h01 h01Var = (h01) ((b90) qd0Var.f6471k).f793k;
                    synchronized (h01Var) {
                        h01Var.f2987l = h01Var.f2985j.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = ke1.f4359a;
        lock.lock();
        try {
            try {
                Bitmap bitmapM4077l = qd0Var.m4077l(options);
                lock.unlock();
                return bitmapM4077l;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM4846e = m4846e(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM4846e);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM4846e;
                }
                try {
                    interfaceC0318ic.mo2591h(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM4844c = m4844c(qd0Var, options, interfaceC0705su, interfaceC0318ic);
                    ke1.f4359a.unlock();
                    return bitmapM4844c;
                } catch (IOException unused) {
                    throw iOExceptionM4846e;
                }
            }
        } catch (Throwable th) {
            ke1.f4359a.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m4845d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: e */
    public static IOException m4846e(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m4845d(options.inBitmap), illegalArgumentException);
    }

    /* JADX INFO: renamed from: f */
    public static void m4847f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: a */
    public final C0354jc m4848a(qd0 qd0Var, int i, int i2, uu0 uu0Var, InterfaceC0705su interfaceC0705su) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f7598c.m3543c(65536, byte[].class);
        synchronized (C0742tu.class) {
            arrayDeque = f7595k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m4847f(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC0034aq enumC0034aq = (EnumC0034aq) uu0Var.m4955c(f7590f);
        bx0 bx0Var = (bx0) uu0Var.m4955c(f7591g);
        AbstractC0668ru abstractC0668ru = (AbstractC0668ru) uu0Var.m4955c(AbstractC0668ru.f6967c);
        boolean zBooleanValue = ((Boolean) uu0Var.m4955c(f7592h)).booleanValue();
        ru0 ru0Var = f7593i;
        try {
            Bitmap bitmapM4849b = m4849b(qd0Var, options, abstractC0668ru, enumC0034aq, bx0Var, uu0Var.m4955c(ru0Var) != null && ((Boolean) uu0Var.m4955c(ru0Var)).booleanValue(), i, i2, zBooleanValue, interfaceC0705su);
            C0354jc c0354jc = bitmapM4849b == null ? null : new C0354jc(this.f7596a, bitmapM4849b);
            m4847f(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f7598c.m3547g(bArr);
            return c0354jc;
        } catch (Throwable th) {
            m4847f(options);
            ArrayDeque arrayDeque2 = f7595k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f7598c.m3547g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0366  */
    /* JADX WARN: Code duplicated, block: B:146:0x0395  */
    /* JADX WARN: Code duplicated, block: B:147:0x039d  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:161:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x03db  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:172:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:176:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:179:0x041d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x0481  */
    /* JADX WARN: Code duplicated, block: B:193:0x0485  */
    /* JADX WARN: Code duplicated, block: B:195:0x048b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0498  */
    /* JADX WARN: Code duplicated, block: B:204:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:206:0x0535  */
    /* JADX WARN: Code duplicated, block: B:208:0x053f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0541  */
    /* JADX WARN: Code duplicated, block: B:212:0x0552  */
    /* JADX WARN: Code duplicated, block: B:213:0x0556  */
    /* JADX WARN: Code duplicated, block: B:214:0x055f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0563  */
    /* JADX WARN: Code duplicated, block: B:216:0x056c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0575  */
    /* JADX WARN: Code duplicated, block: B:218:0x0579  */
    /* JADX WARN: Code duplicated, block: B:222:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:227:0x03a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x0366, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x041d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:204:0x04b0, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final Bitmap m4849b(qd0 qd0Var, BitmapFactory.Options options, AbstractC0668ru abstractC0668ru, EnumC0034aq enumC0034aq, bx0 bx0Var, boolean z, int i, int i2, boolean z2, InterfaceC0705su interfaceC0705su) throws Throwable {
        long j;
        String str;
        int iMo1768d;
        int iM5769h;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM4080q;
        int i7;
        String str2;
        InterfaceC0318ic interfaceC0318ic;
        String str3;
        int i8;
        boolean zM3508b;
        boolean z4;
        int i9;
        float f;
        int i10;
        int iRound;
        int iRound2;
        int i11;
        InterfaceC0318ic interfaceC0318ic2;
        Bitmap bitmapM4844c;
        Matrix matrix;
        Bitmap bitmap;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config;
        boolean zHasAlpha;
        Bitmap.Config config2;
        int i12;
        int i13;
        int iFloor;
        int iFloor2;
        int iRound3;
        int i14 = hk0.f3252b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC0318ic interfaceC0318ic3 = this.f7596a;
        m4844c(qd0Var, options, interfaceC0705su, interfaceC0318ic3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i15 = iArr[0];
        int i16 = iArr[1];
        String str4 = options.outMimeType;
        boolean z5 = (i15 == -1 || i16 == -1) ? false : z;
        h01 h01Var = null;
        switch (qd0Var.f6470j) {
            case 22:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) qd0Var.f6472l;
                ByteBuffer byteBufferM3211c = AbstractC0429ld.m3211c((ByteBuffer) qd0Var.f6471k);
                nk0 nk0Var = (nk0) qd0Var.f6473m;
                if (byteBufferM3211c != null) {
                    int size = list.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size) {
                            List list2 = list;
                            try {
                                iMo1768d = ((fc0) list.get(i17)).mo1768d(byteBufferM3211c, nk0Var);
                                nk0 nk0Var2 = nk0Var;
                                if (iMo1768d != -1) {
                                    iM5769h = iMo1768d;
                                    switch (iM5769h) {
                                        case 3:
                                        case 4:
                                            i3 = 180;
                                            break;
                                        case 5:
                                        case 6:
                                            i3 = 90;
                                            break;
                                        case 7:
                                        case 8:
                                            i3 = 270;
                                            break;
                                        default:
                                            i3 = 0;
                                            break;
                                    }
                                    switch (iM5769h) {
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
                                    if (i == Integer.MIN_VALUE) {
                                        if (i3 != 90) {
                                            i4 = 270;
                                            if (i3 == 270) {
                                                i5 = i15;
                                            }
                                        } else {
                                            i4 = 270;
                                        }
                                        i5 = i16;
                                    } else {
                                        i4 = 270;
                                        i5 = i;
                                    }
                                    if (i2 == Integer.MIN_VALUE) {
                                        i6 = i2;
                                    } else if (i3 != 90 || i3 == i4) {
                                        i6 = i15;
                                    } else {
                                        i6 = i16;
                                    }
                                    imageHeaderParser$ImageTypeM4080q = qd0Var.m4080q();
                                    i7 = iM5769h;
                                    boolean z6 = z3;
                                    if (i15 > 0 || i16 <= 0) {
                                        str2 = ", density: ";
                                        interfaceC0318ic = interfaceC0318ic3;
                                        str3 = ", target density: ";
                                        i8 = i5;
                                        if (Log.isLoggable("Downsampler", 3)) {
                                            Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM4080q + " with target [" + i8 + "x" + i6 + "]");
                                        }
                                    } else {
                                        if (i3 == 90 || i3 == 270) {
                                            i12 = i16;
                                            i13 = i15;
                                        } else {
                                            i13 = i16;
                                            i12 = i15;
                                        }
                                        i8 = i5;
                                        float fMo3991b = abstractC0668ru.mo3991b(i12, i13, i8, i6);
                                        if (fMo3991b <= 0.0f) {
                                            throw new IllegalArgumentException("Cannot scale with factor: " + fMo3991b + " from: " + abstractC0668ru + ", source: [" + i15 + "x" + i16 + "], target: [" + i8 + "x" + i6 + "]");
                                        }
                                        int iMo3990a = abstractC0668ru.mo3990a(i12, i13, i8, i6);
                                        if (iMo3990a == 0) {
                                            C0270h1.m2190f("Cannot round with null rounding");
                                            return null;
                                        }
                                        int i18 = i3;
                                        float f2 = i12;
                                        int i19 = i12;
                                        float f3 = i13;
                                        int i20 = i13;
                                        int i21 = (int) (((double) (fMo3991b * f3)) + 0.5d);
                                        int i22 = i19 / ((int) (((double) (fMo3991b * f2)) + 0.5d));
                                        int i23 = i20 / i21;
                                        int iMax = Math.max(1, Integer.highestOneBit(iMo3990a == 1 ? Math.max(i22, i23) : Math.min(i22, i23)));
                                        if (iMo3990a == 1 && iMax < 1.0f / fMo3991b) {
                                            iMax <<= 1;
                                        }
                                        options.inSampleSize = iMax;
                                        if (imageHeaderParser$ImageTypeM4080q == ImageHeaderParser$ImageType.JPEG) {
                                            float fMin = Math.min(iMax, 8);
                                            iFloor = (int) Math.ceil(f2 / fMin);
                                            iFloor2 = (int) Math.ceil(f3 / fMin);
                                            int i24 = iMax / 8;
                                            if (i24 > 0) {
                                                iFloor2 /= i24;
                                                iRound3 = iFloor / i24;
                                            } else {
                                                iRound3 = iFloor;
                                            }
                                        } else {
                                            if (imageHeaderParser$ImageTypeM4080q == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM4080q == ImageHeaderParser$ImageType.PNG_A) {
                                                float f4 = iMax;
                                                iFloor = (int) Math.floor(f2 / f4);
                                                iFloor2 = (int) Math.floor(f3 / f4);
                                            } else if (imageHeaderParser$ImageTypeM4080q.isWebp()) {
                                                float f5 = iMax;
                                                iRound3 = Math.round(f2 / f5);
                                                iFloor2 = Math.round(f3 / f5);
                                            } else if (i19 % iMax == 0 && i20 % iMax == 0) {
                                                iRound3 = i19 / iMax;
                                                iFloor2 = i20 / iMax;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                m4844c(qd0Var, options, interfaceC0705su, interfaceC0318ic3);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                iFloor = iArr2[0];
                                                iFloor2 = iArr2[1];
                                            }
                                            iRound3 = iFloor;
                                        }
                                        double dMo3991b = abstractC0668ru.mo3991b(iRound3, iFloor2, i8, i6);
                                        int iRound4 = (int) Math.round((dMo3991b <= 1.0d ? dMo3991b : 1.0d / dMo3991b) * 2.147483647E9d);
                                        interfaceC0318ic = interfaceC0318ic3;
                                        int i25 = (int) ((((double) iRound4) * dMo3991b) + 0.5d);
                                        float f6 = i25 / iRound4;
                                        int i26 = iMax;
                                        options.inTargetDensity = (int) (((dMo3991b / ((double) f6)) * ((double) i25)) + 0.5d);
                                        int iRound5 = (int) Math.round((dMo3991b <= 1.0d ? dMo3991b : 1.0d / dMo3991b) * 2.147483647E9d);
                                        options.inDensity = iRound5;
                                        int i27 = options.inTargetDensity;
                                        if (i27 <= 0 || iRound5 <= 0 || i27 == iRound5) {
                                            options.inTargetDensity = 0;
                                            options.inDensity = 0;
                                        } else {
                                            options.inScaled = true;
                                        }
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder sb = new StringBuilder("Calculate scaling, source: [");
                                            sb.append(i15);
                                            sb.append("x");
                                            sb.append(i16);
                                            sb.append("], degreesToRotate: ");
                                            sb.append(i18);
                                            sb.append(", target: [");
                                            sb.append(i8);
                                            sb.append("x");
                                            sb.append(i6);
                                            sb.append("], power of two scaled: [");
                                            sb.append(iRound3);
                                            sb.append("x");
                                            sb.append(iFloor2);
                                            sb.append("], exact scale factor: ");
                                            sb.append(fMo3991b);
                                            sb.append(", power of 2 sample size: ");
                                            sb.append(i26);
                                            sb.append(", adjusted scale factor: ");
                                            sb.append(dMo3991b);
                                            str3 = ", target density: ";
                                            sb.append(str3);
                                            sb.append(options.inTargetDensity);
                                            str2 = ", density: ";
                                            sb.append(str2);
                                            sb.append(options.inDensity);
                                            Log.v("Downsampler", sb.toString());
                                        } else {
                                            str2 = r7;
                                            str3 = ", target density: ";
                                        }
                                    }
                                    zM3508b = this.f7600e.m3508b(i8, i6, z5, z6);
                                    if (zM3508b) {
                                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                        z4 = false;
                                        options.inMutable = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!zM3508b) {
                                        if (enumC0034aq != EnumC0034aq.f592j) {
                                            try {
                                                zHasAlpha = qd0Var.m4080q().hasAlpha();
                                            } catch (IOException e) {
                                                if (Log.isLoggable("Downsampler", 3)) {
                                                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC0034aq, e);
                                                }
                                                zHasAlpha = z4;
                                            }
                                            if (zHasAlpha) {
                                                config2 = Bitmap.Config.ARGB_8888;
                                            } else {
                                                config2 = Bitmap.Config.RGB_565;
                                            }
                                            options.inPreferredConfig = config2;
                                            if (config2 == Bitmap.Config.RGB_565) {
                                                options.inDither = true;
                                            }
                                        } else {
                                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        }
                                        break;
                                    }
                                    if (i15 >= 0 || i16 < 0 || !z2) {
                                        i9 = options.inTargetDensity;
                                        if (i9 > 0 || (i11 = options.inDensity) <= 0 || i9 == i11) {
                                            f = 1.0f;
                                        } else {
                                            f = i9 / i11;
                                        }
                                        i10 = options.inSampleSize;
                                        float f7 = i10;
                                        int iCeil = (int) Math.ceil(i15 / f7);
                                        int iCeil2 = (int) Math.ceil(i16 / f7);
                                        iRound = Math.round(iCeil * f);
                                        iRound2 = Math.round(iCeil2 * f);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                                        }
                                        i8 = iRound;
                                        i6 = iRound2;
                                    }
                                    if (i8 > 0 || i6 <= 0 || (config = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
                                        interfaceC0318ic2 = interfaceC0318ic;
                                    } else {
                                        Bitmap.Config config3 = options.outConfig;
                                        if (config3 != null) {
                                            config = config3;
                                        }
                                        interfaceC0318ic2 = interfaceC0318ic;
                                        options.inBitmap = interfaceC0318ic2.mo2590f(i8, i6, config);
                                    }
                                    if (bx0Var != null) {
                                        if (bx0Var == bx0.f1039j || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
                                            named = ColorSpace.Named.SRGB;
                                        } else {
                                            named = ColorSpace.Named.DISPLAY_P3;
                                        }
                                        options.inPreferredColorSpace = ColorSpace.get(named);
                                    }
                                    bitmapM4844c = m4844c(qd0Var, options, interfaceC0705su, interfaceC0318ic2);
                                    interfaceC0705su.mo83g(interfaceC0318ic2, bitmapM4844c);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        Log.v("Downsampler", "Decoded " + m4845d(bitmapM4844c) + " from [" + i15 + "x" + i16 + "] " + str + " with inBitmap " + m4845d(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + hk0.m2289a(j));
                                    }
                                    if (bitmapM4844c != null) {
                                        return null;
                                    }
                                    bitmapM4844c.setDensity(this.f7597b.densityDpi);
                                    switch (i7) {
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            matrix = new Matrix();
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
                                            bitmapM4844c = Bitmap.createBitmap(bitmapM4844c, 0, 0, bitmapM4844c.getWidth(), bitmapM4844c.getHeight(), matrix, true);
                                            bitmap = bitmapM4844c;
                                            break;
                                        default:
                                            bitmap = bitmapM4844c;
                                            break;
                                    }
                                    if (!bitmap.equals(bitmapM4844c)) {
                                        interfaceC0318ic2.mo2591h(bitmap);
                                    }
                                    return bitmapM4844c;
                                }
                                i17++;
                                list = list2;
                                nk0Var = nk0Var2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                iM5769h = -1;
                switch (iM5769h) {
                    case 3:
                    case 4:
                        i3 = 180;
                        break;
                    case 5:
                    case 6:
                        i3 = 90;
                        break;
                    case 7:
                    case 8:
                        i3 = 270;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (iM5769h) {
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
                if (i == Integer.MIN_VALUE) {
                    if (i3 != 90) {
                        i4 = 270;
                        if (i3 == 270) {
                            i5 = i15;
                        }
                    } else {
                        i4 = 270;
                    }
                    i5 = i16;
                } else {
                    i4 = 270;
                    i5 = i;
                }
                if (i2 == Integer.MIN_VALUE) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i15;
                } else {
                    i6 = i15;
                }
                imageHeaderParser$ImageTypeM4080q = qd0Var.m4080q();
                i7 = iM5769h;
                boolean z7 = z3;
                if (i15 > 0) {
                    str2 = ", density: ";
                    interfaceC0318ic = interfaceC0318ic3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM4080q + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0318ic = interfaceC0318ic3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM4080q + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3508b = this.f7600e.m3508b(i8, i6, z5, z7);
                if (zM3508b) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (!zM3508b) {
                    if (enumC0034aq != EnumC0034aq.f592j) {
                        zHasAlpha = qd0Var.m4080q().hasAlpha();
                        if (zHasAlpha) {
                            config2 = Bitmap.Config.ARGB_8888;
                        } else {
                            config2 = Bitmap.Config.RGB_565;
                        }
                        options.inPreferredConfig = config2;
                        if (config2 == Bitmap.Config.RGB_565) {
                            options.inDither = true;
                        }
                    } else {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                }
                if (i15 >= 0) {
                    i9 = options.inTargetDensity;
                    if (i9 > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                    i10 = options.inSampleSize;
                    float f8 = i10;
                    int iCeil3 = (int) Math.ceil(i15 / f8);
                    int iCeil4 = (int) Math.ceil(i16 / f8);
                    iRound = Math.round(iCeil3 * f);
                    iRound2 = Math.round(iCeil4 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i8 = iRound;
                    i6 = iRound2;
                } else {
                    i9 = options.inTargetDensity;
                    if (i9 > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                    i10 = options.inSampleSize;
                    float f9 = i10;
                    int iCeil5 = (int) Math.ceil(i15 / f9);
                    int iCeil6 = (int) Math.ceil(i16 / f9);
                    iRound = Math.round(iCeil5 * f);
                    iRound2 = Math.round(iCeil6 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i8 = iRound;
                    i6 = iRound2;
                }
                if (i8 > 0) {
                    interfaceC0318ic2 = interfaceC0318ic;
                } else {
                    interfaceC0318ic2 = interfaceC0318ic;
                }
                if (bx0Var != null) {
                    if (bx0Var == bx0.f1039j) {
                        named = ColorSpace.Named.SRGB;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                }
                bitmapM4844c = m4844c(qd0Var, options, interfaceC0705su, interfaceC0318ic2);
                interfaceC0705su.mo83g(interfaceC0318ic2, bitmapM4844c);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m4845d(bitmapM4844c) + " from [" + i15 + "x" + i16 + "] " + str + " with inBitmap " + m4845d(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + hk0.m2289a(j));
                }
                if (bitmapM4844c != null) {
                    return null;
                }
                bitmapM4844c.setDensity(this.f7597b.densityDpi);
                switch (i7) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
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
                        bitmapM4844c = Bitmap.createBitmap(bitmapM4844c, 0, 0, bitmapM4844c.getWidth(), bitmapM4844c.getHeight(), matrix, true);
                        bitmap = bitmapM4844c;
                        break;
                    default:
                        bitmap = bitmapM4844c;
                        break;
                }
                if (!bitmap.equals(bitmapM4844c)) {
                    interfaceC0318ic2.mo2591h(bitmap);
                }
                return bitmapM4844c;
            case 23:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) qd0Var.f6473m;
                h01 h01Var2 = (h01) ((b90) qd0Var.f6471k).f793k;
                h01Var2.reset();
                iM5769h = yd0.m5769h(list3, h01Var2, (nk0) qd0Var.f6472l);
                switch (iM5769h) {
                    case 3:
                    case 4:
                        i3 = 180;
                        break;
                    case 5:
                    case 6:
                        i3 = 90;
                        break;
                    case 7:
                    case 8:
                        i3 = 270;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (iM5769h) {
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
                if (i == Integer.MIN_VALUE) {
                    if (i3 != 90) {
                        i4 = 270;
                        if (i3 == 270) {
                            i5 = i15;
                        }
                    } else {
                        i4 = 270;
                    }
                    i5 = i16;
                } else {
                    i4 = 270;
                    i5 = i;
                }
                if (i2 == Integer.MIN_VALUE) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i15;
                } else {
                    i6 = i15;
                }
                imageHeaderParser$ImageTypeM4080q = qd0Var.m4080q();
                i7 = iM5769h;
                boolean z8 = z3;
                if (i15 > 0) {
                    str2 = ", density: ";
                    interfaceC0318ic = interfaceC0318ic3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM4080q + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0318ic = interfaceC0318ic3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM4080q + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3508b = this.f7600e.m3508b(i8, i6, z5, z8);
                if (zM3508b) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (!zM3508b) {
                    if (enumC0034aq != EnumC0034aq.f592j) {
                        zHasAlpha = qd0Var.m4080q().hasAlpha();
                        if (zHasAlpha) {
                            config2 = Bitmap.Config.ARGB_8888;
                        } else {
                            config2 = Bitmap.Config.RGB_565;
                        }
                        options.inPreferredConfig = config2;
                        if (config2 == Bitmap.Config.RGB_565) {
                            options.inDither = true;
                        }
                    } else {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                }
                if (i15 >= 0) {
                    i9 = options.inTargetDensity;
                    if (i9 > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                    i10 = options.inSampleSize;
                    float f10 = i10;
                    int iCeil7 = (int) Math.ceil(i15 / f10);
                    int iCeil8 = (int) Math.ceil(i16 / f10);
                    iRound = Math.round(iCeil7 * f);
                    iRound2 = Math.round(iCeil8 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i8 = iRound;
                    i6 = iRound2;
                } else {
                    i9 = options.inTargetDensity;
                    if (i9 > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                    i10 = options.inSampleSize;
                    float f11 = i10;
                    int iCeil9 = (int) Math.ceil(i15 / f11);
                    int iCeil10 = (int) Math.ceil(i16 / f11);
                    iRound = Math.round(iCeil9 * f);
                    iRound2 = Math.round(iCeil10 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i8 = iRound;
                    i6 = iRound2;
                }
                if (i8 > 0) {
                    interfaceC0318ic2 = interfaceC0318ic;
                } else {
                    interfaceC0318ic2 = interfaceC0318ic;
                }
                if (bx0Var != null) {
                    if (bx0Var == bx0.f1039j) {
                        named = ColorSpace.Named.SRGB;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                }
                bitmapM4844c = m4844c(qd0Var, options, interfaceC0705su, interfaceC0318ic2);
                interfaceC0705su.mo83g(interfaceC0318ic2, bitmapM4844c);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m4845d(bitmapM4844c) + " from [" + i15 + "x" + i16 + "] " + str + " with inBitmap " + m4845d(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + hk0.m2289a(j));
                }
                if (bitmapM4844c != null) {
                    return null;
                }
                bitmapM4844c.setDensity(this.f7597b.densityDpi);
                switch (i7) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
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
                        bitmapM4844c = Bitmap.createBitmap(bitmapM4844c, 0, 0, bitmapM4844c.getWidth(), bitmapM4844c.getHeight(), matrix, true);
                        bitmap = bitmapM4844c;
                        break;
                    default:
                        bitmap = bitmapM4844c;
                        break;
                }
                if (!bitmap.equals(bitmapM4844c)) {
                    interfaceC0318ic2.mo2591h(bitmap);
                }
                return bitmapM4844c;
            default:
                List list4 = (List) qd0Var.f6472l;
                j = jElapsedRealtimeNanos;
                C0107a c0107a = (C0107a) qd0Var.f6473m;
                nk0 nk0Var3 = (nk0) qd0Var.f6471k;
                int size2 = list4.size();
                str = str4;
                int i28 = 0;
                while (true) {
                    if (i28 < size2) {
                        int i29 = size2;
                        fc0 fc0Var = (fc0) list4.get(i28);
                        int i30 = i28;
                        try {
                            List list5 = list4;
                            h01 h01Var3 = new h01(new FileInputStream(c0107a.m985a().getFileDescriptor()), nk0Var3);
                            try {
                                iMo1768d = fc0Var.mo1766b(h01Var3, nk0Var3);
                                h01Var3.m2184e();
                                c0107a.m985a();
                                if (iMo1768d != -1) {
                                    iM5769h = iMo1768d;
                                } else {
                                    i28 = i30 + 1;
                                    size2 = i29;
                                    list4 = list5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                h01Var = h01Var3;
                                if (h01Var != null) {
                                    h01Var.m2184e();
                                }
                                c0107a.m985a();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        iM5769h = -1;
                    }
                }
                switch (iM5769h) {
                    case 3:
                    case 4:
                        i3 = 180;
                        break;
                    case 5:
                    case 6:
                        i3 = 90;
                        break;
                    case 7:
                    case 8:
                        i3 = 270;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (iM5769h) {
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
                if (i == Integer.MIN_VALUE) {
                    if (i3 != 90) {
                        i4 = 270;
                        if (i3 == 270) {
                            i5 = i15;
                        }
                    } else {
                        i4 = 270;
                    }
                    i5 = i16;
                } else {
                    i4 = 270;
                    i5 = i;
                }
                if (i2 == Integer.MIN_VALUE) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i15;
                } else {
                    i6 = i15;
                }
                imageHeaderParser$ImageTypeM4080q = qd0Var.m4080q();
                i7 = iM5769h;
                boolean z9 = z3;
                if (i15 > 0) {
                    str2 = ", density: ";
                    interfaceC0318ic = interfaceC0318ic3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM4080q + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0318ic = interfaceC0318ic3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM4080q + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3508b = this.f7600e.m3508b(i8, i6, z5, z9);
                if (zM3508b) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (!zM3508b) {
                    if (enumC0034aq != EnumC0034aq.f592j) {
                        zHasAlpha = qd0Var.m4080q().hasAlpha();
                        if (zHasAlpha) {
                            config2 = Bitmap.Config.ARGB_8888;
                        } else {
                            config2 = Bitmap.Config.RGB_565;
                        }
                        options.inPreferredConfig = config2;
                        if (config2 == Bitmap.Config.RGB_565) {
                            options.inDither = true;
                        }
                    } else {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                }
                if (i15 >= 0) {
                    i9 = options.inTargetDensity;
                    if (i9 > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                    i10 = options.inSampleSize;
                    float f12 = i10;
                    int iCeil11 = (int) Math.ceil(i15 / f12);
                    int iCeil12 = (int) Math.ceil(i16 / f12);
                    iRound = Math.round(iCeil11 * f);
                    iRound2 = Math.round(iCeil12 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i8 = iRound;
                    i6 = iRound2;
                } else {
                    i9 = options.inTargetDensity;
                    if (i9 > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                    i10 = options.inSampleSize;
                    float f13 = i10;
                    int iCeil13 = (int) Math.ceil(i15 / f13);
                    int iCeil14 = (int) Math.ceil(i16 / f13);
                    iRound = Math.round(iCeil13 * f);
                    iRound2 = Math.round(iCeil14 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i8 = iRound;
                    i6 = iRound2;
                }
                if (i8 > 0) {
                    interfaceC0318ic2 = interfaceC0318ic;
                } else {
                    interfaceC0318ic2 = interfaceC0318ic;
                }
                if (bx0Var != null) {
                    if (bx0Var == bx0.f1039j) {
                        named = ColorSpace.Named.SRGB;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                }
                bitmapM4844c = m4844c(qd0Var, options, interfaceC0705su, interfaceC0318ic2);
                interfaceC0705su.mo83g(interfaceC0318ic2, bitmapM4844c);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m4845d(bitmapM4844c) + " from [" + i15 + "x" + i16 + "] " + str + " with inBitmap " + m4845d(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + hk0.m2289a(j));
                }
                if (bitmapM4844c != null) {
                    return null;
                }
                bitmapM4844c.setDensity(this.f7597b.densityDpi);
                switch (i7) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
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
                        bitmapM4844c = Bitmap.createBitmap(bitmapM4844c, 0, 0, bitmapM4844c.getWidth(), bitmapM4844c.getHeight(), matrix, true);
                        bitmap = bitmapM4844c;
                        break;
                    default:
                        bitmap = bitmapM4844c;
                        break;
                }
                if (!bitmap.equals(bitmapM4844c)) {
                    interfaceC0318ic2.mo2591h(bitmap);
                }
                return bitmapM4844c;
        }
    }
}
