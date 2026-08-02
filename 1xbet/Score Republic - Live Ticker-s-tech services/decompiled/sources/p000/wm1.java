package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wm1 {

    /* JADX INFO: renamed from: a */
    public static final iw1 f8586a = new iw1(3);

    /* JADX INFO: renamed from: b */
    public static final iw1 f8587b = new iw1(4);

    /* JADX INFO: renamed from: c */
    public static final Object f8588c = new Object();

    /* JADX INFO: renamed from: a */
    public static void m5355a(String str, int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m5356c(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static p01 m5357d(ComponentCallbacks2C0106a componentCallbacks2C0106a, ArrayList arrayList) {
        y11 c0169ec;
        y11 c0134dd;
        Class cls;
        InterfaceC0318ic interfaceC0318ic = componentCallbacks2C0106a.f1307j;
        nk0 nk0Var = componentCallbacks2C0106a.f1310m;
        q80 q80Var = componentCallbacks2C0106a.f1309l;
        Context applicationContext = q80Var.getApplicationContext();
        b90 b90Var = q80Var.f6411g;
        p01 p01Var = new p01();
        C0664rq c0664rq = new C0664rq();
        C0781uw c0781uw = p01Var.f5955g;
        synchronized (c0781uw) {
            c0781uw.f7915j.add(c0664rq);
        }
        C0376jy c0376jy = new C0376jy();
        C0781uw c0781uw2 = p01Var.f5955g;
        synchronized (c0781uw2) {
            c0781uw2.f7915j.add(c0376jy);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM3818e = p01Var.m3818e();
        C0245gd c0245gd = new C0245gd(applicationContext, arrayListM3818e, interfaceC0318ic, nk0Var);
        y11 ph1Var = new ph1(interfaceC0318ic, new u90(20));
        C0742tu c0742tu = new C0742tu(p01Var.m3818e(), resources.getDisplayMetrics(), interfaceC0318ic, nk0Var);
        if (((Map) b90Var.f793k).containsKey(m80.class)) {
            y11 c0134dd2 = new C0134dd(1);
            c0134dd = new C0134dd(0);
            c0169ec = c0134dd2;
        } else {
            y11 c0094cd = new C0094cd(c0742tu, 0);
            c0169ec = new C0169ec(2, c0742tu, nk0Var);
            c0134dd = c0094cd;
        }
        p01Var.m3817d("Animation", InputStream.class, Drawable.class, new C0346j4(new C0312i6(5, arrayListM3818e, nk0Var), 1));
        p01Var.m3817d("Animation", ByteBuffer.class, Drawable.class, new C0346j4(new C0312i6(5, arrayListM3818e, nk0Var), 0));
        y11 a21Var = new a21(applicationContext);
        b21 c0244gc = new C0244gc(nk0Var);
        h21 c0678s3 = new C0678s3(1);
        h21 wa0Var = new wa0(29);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        p01Var.m3814a(ByteBuffer.class, new nc1(13));
        p01Var.m3814a(InputStream.class, new jg0(15, nk0Var));
        p01Var.m3817d("Bitmap", ByteBuffer.class, Bitmap.class, c0134dd);
        p01Var.m3817d("Bitmap", InputStream.class, Bitmap.class, c0169ec);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            y11 c0094cd2 = new C0094cd(c0742tu, 1);
            cls = ParcelFileDescriptor.class;
            p01Var.m3817d("Bitmap", cls, Bitmap.class, c0094cd2);
        }
        p01Var.m3817d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new ph1(interfaceC0318ic, new u90(19)));
        p01Var.m3817d("Bitmap", cls, Bitmap.class, ph1Var);
        iq0 iq0Var = o31.f5609q;
        p01Var.m3816c(Bitmap.class, Bitmap.class, iq0Var);
        p01Var.m3817d("Bitmap", Bitmap.class, Bitmap.class, new c00(1));
        p01Var.m3815b(Bitmap.class, c0244gc);
        p01Var.m3817d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0169ec(resources, c0134dd));
        p01Var.m3817d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0169ec(resources, c0169ec));
        p01Var.m3817d("BitmapDrawable", cls, BitmapDrawable.class, new C0169ec(resources, ph1Var));
        p01Var.m3815b(BitmapDrawable.class, new C0312i6(14, interfaceC0318ic, c0244gc));
        p01Var.m3817d("Animation", InputStream.class, b80.class, new sa1(arrayListM3818e, c0245gd, nk0Var));
        p01Var.m3817d("Animation", ByteBuffer.class, b80.class, c0245gd);
        p01Var.m3815b(b80.class, new o31(29));
        p01Var.m3816c(y91.class, y91.class, iq0Var);
        p01Var.m3817d("Bitmap", y91.class, Bitmap.class, new C0281hc(interfaceC0318ic));
        p01Var.m3817d("legacy_append", Uri.class, Drawable.class, a21Var);
        p01Var.m3817d("legacy_append", Uri.class, Bitmap.class, new C0169ec(1, a21Var, interfaceC0318ic));
        p01Var.m3821h(new C0282hd(0));
        p01Var.m3816c(File.class, ByteBuffer.class, new wa0(14));
        p01Var.m3816c(File.class, InputStream.class, new e00(new wa0(25)));
        p01Var.m3817d("legacy_append", File.class, File.class, new c00(0));
        p01Var.m3816c(File.class, cls, new e00(new nc1(24)));
        p01Var.m3816c(File.class, File.class, iq0Var);
        p01Var.m3821h(new vd0(nk0Var));
        if (!"robolectric".equals(str)) {
            p01Var.m3821h(new C0282hd(2));
        }
        iq0 c0186et = new C0186et(applicationContext, 1, false);
        iq0 c0186et2 = new C0186et(applicationContext, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        iq0 c0181eo = new C0181eo(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        p01Var.m3816c(cls2, InputStream.class, c0186et);
        p01Var.m3816c(Integer.class, InputStream.class, c0186et);
        p01Var.m3816c(cls2, AssetFileDescriptor.class, c0186et2);
        p01Var.m3816c(Integer.class, AssetFileDescriptor.class, c0186et2);
        p01Var.m3816c(cls2, Drawable.class, c0181eo);
        p01Var.m3816c(Integer.class, Drawable.class, c0181eo);
        p01Var.m3816c(Uri.class, InputStream.class, new C0181eo(applicationContext, 6));
        p01Var.m3816c(Uri.class, AssetFileDescriptor.class, new C0186et(applicationContext, 4, false));
        iq0 d21Var = new d21(resources, 1);
        iq0 d21Var2 = new d21(resources, 0 == true ? 1 : 0);
        iq0 c0206fc = new C0206fc(resources);
        p01Var.m3816c(Integer.class, Uri.class, d21Var);
        p01Var.m3816c(cls2, Uri.class, d21Var);
        p01Var.m3816c(Integer.class, AssetFileDescriptor.class, d21Var2);
        p01Var.m3816c(cls2, AssetFileDescriptor.class, d21Var2);
        p01Var.m3816c(Integer.class, InputStream.class, c0206fc);
        p01Var.m3816c(cls2, InputStream.class, c0206fc);
        int i = 16;
        p01Var.m3816c(String.class, InputStream.class, new b90(16));
        p01Var.m3816c(Uri.class, InputStream.class, new b90(16));
        p01Var.m3816c(String.class, InputStream.class, new u90(i));
        p01Var.m3816c(String.class, cls, new x80(i));
        p01Var.m3816c(String.class, AssetFileDescriptor.class, new aa0(15));
        p01Var.m3816c(Uri.class, InputStream.class, new nu1(7, applicationContext.getAssets()));
        p01Var.m3816c(Uri.class, AssetFileDescriptor.class, new b90(9, applicationContext.getAssets()));
        p01Var.m3816c(Uri.class, InputStream.class, new C0186et(applicationContext, 2, false));
        p01Var.m3816c(Uri.class, InputStream.class, new C0181eo(applicationContext, 5));
        p01Var.m3816c(Uri.class, InputStream.class, new xy0(applicationContext, InputStream.class));
        p01Var.m3816c(Uri.class, cls, new xy0(applicationContext, cls));
        boolean zContainsKey = ((Map) b90Var.f793k).containsKey(p80.class);
        p01Var.m3816c(Uri.class, InputStream.class, new pg1(contentResolver, zContainsKey, 2));
        p01Var.m3816c(Uri.class, cls, new pg1(contentResolver, zContainsKey, 1));
        p01Var.m3816c(Uri.class, AssetFileDescriptor.class, new pg1(contentResolver, zContainsKey, 0));
        int i2 = 18;
        p01Var.m3816c(Uri.class, InputStream.class, new aa0(i2));
        p01Var.m3816c(URL.class, InputStream.class, new u90(i2));
        p01Var.m3816c(Uri.class, File.class, new C0181eo(applicationContext, 4));
        p01Var.m3816c(z80.class, InputStream.class, new nu1(24));
        p01Var.m3816c(byte[].class, ByteBuffer.class, new nc1(12));
        p01Var.m3816c(byte[].class, InputStream.class, new o31(13));
        p01Var.m3816c(Uri.class, Uri.class, iq0Var);
        p01Var.m3816c(Drawable.class, Drawable.class, iq0Var);
        p01Var.m3817d("legacy_append", Drawable.class, Drawable.class, new c00(2));
        p01Var.m3822i(Bitmap.class, BitmapDrawable.class, new C0206fc(resources));
        p01Var.m3822i(Bitmap.class, byte[].class, c0678s3);
        p01Var.m3822i(Drawable.class, byte[].class, new qd0(interfaceC0318ic, c0678s3, wa0Var, 15));
        p01Var.m3822i(b80.class, byte[].class, wa0Var);
        y11 ph1Var2 = new ph1(interfaceC0318ic, new aa0(19));
        p01Var.m3817d("legacy_append", ByteBuffer.class, Bitmap.class, ph1Var2);
        p01Var.m3817d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0169ec(resources, ph1Var2));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC0024an.m280c(it);
        }
        return p01Var;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0224fu m5358f(ag0 ag0Var, boolean z, eg0 eg0Var) {
        if (ag0Var instanceof ig0) {
            return ((ig0) ag0Var).m2609I(z, eg0Var);
        }
        boolean zMo1414r = eg0Var.mo1414r();
        dg0 dg0Var = new dg0(1, eg0Var, eg0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        return ((ig0) ag0Var).m2609I(z, zMo1414r ? new kf0(dg0Var) : new lf0(dg0Var));
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m5359g(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C0270h1.m2191g(j11.m2773h("Not enough bytes to read: ", i));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m5360h(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m5361i(InputStream inputStream, int i) throws IOException {
        byte[] bArrM5359g = m5359g(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM5359g[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: k */
    public static C0809vn m5362k(Object obj) {
        return new C0809vn(obj.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: l */
    public static void m5363l(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: m */
    public static void m5364m(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m5363l(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: n */
    public static int m5365n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2818b(C0915yi c0915yi, Set set);

    /* JADX INFO: renamed from: e */
    public abstract int mo2819e(C0915yi c0915yi);

    /* JADX INFO: renamed from: j */
    public void m5366j() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
