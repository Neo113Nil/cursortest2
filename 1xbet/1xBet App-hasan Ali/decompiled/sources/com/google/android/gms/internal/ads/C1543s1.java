package com.google.android.gms.internal.ads;

import I.C0160m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543s1 implements Y, InterfaceC0972fC, InterfaceC1805xu, InterfaceC1452q, InterfaceC1766x, C, H, H1, O1, SB {

    /* renamed from: l, reason: collision with root package name */
    public static final C1543s1 f15405l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1543s1 f15406m;

    /* renamed from: o, reason: collision with root package name */
    public static Cipher f15408o;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15418k;

    /* renamed from: n, reason: collision with root package name */
    public static final C1543s1 f15407n = new C1543s1(1);

    /* renamed from: p, reason: collision with root package name */
    public static final Object f15409p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final Object f15410q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f15411r = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f15412s = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: t, reason: collision with root package name */
    public static final C1543s1 f15413t = new C1543s1(4);

    /* renamed from: u, reason: collision with root package name */
    public static final C1543s1 f15414u = new C1543s1(5);

    /* renamed from: v, reason: collision with root package name */
    public static final C1543s1 f15415v = new C1543s1(7);

    /* renamed from: w, reason: collision with root package name */
    public static final C1543s1 f15416w = new C1543s1(8);

    /* renamed from: x, reason: collision with root package name */
    public static final C1543s1 f15417x = new C1543s1(9);

    static {
        int i = 0;
        f15405l = new C1543s1(i);
        f15406m = new C1543s1(i);
    }

    public /* synthetic */ C1543s1(int i) {
        this.f15418k = i;
    }

    public static boolean A(int i, C0160m c0160m, Object obj) {
        int i5 = c0160m.f2498b;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) c0160m.f2501e;
        if (i7 == 0) {
            c0160m.v(0);
            ((C1779xC) obj).c(i6 << 3, Long.valueOf(abstractC1674uy.z()));
            return true;
        }
        if (i7 == 1) {
            c0160m.v(1);
            ((C1779xC) obj).c((i6 << 3) | 1, Long.valueOf(abstractC1674uy.y()));
            return true;
        }
        if (i7 == 2) {
            c0160m.v(2);
            ((C1779xC) obj).c((i6 << 3) | 2, abstractC1674uy.D());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw new WB();
            }
            c0160m.v(5);
            ((C1779xC) obj).c(5 | (i6 << 3), Integer.valueOf(abstractC1674uy.s()));
            return true;
        }
        C1779xC b3 = C1779xC.b();
        int i8 = i6 << 3;
        int i9 = i + 1;
        if (i9 >= 100) {
            throw new XB("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0160m.z() != Integer.MAX_VALUE && A(i9, c0160m, b3)) {
        }
        if ((i8 | 4) != c0160m.f2498b) {
            throw new XB("Protocol message end-group tag did not match expected tag.");
        }
        if (b3.f16276e) {
            b3.f16276e = false;
        }
        ((C1779xC) obj).c(i8 | 3, b3);
        return true;
    }

    public static M0.e n(A3 a32, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(a32.c());
        URL url = new URL(a32.f7521m);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = a32.f7530v.f1041a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z3 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (a32.f7520l != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] m5 = a32.m();
                if (m5 != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(m5);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                M0.e eVar = new M0.e(responseCode, u(httpURLConnection.getHeaderFields()), -1, (L3) null);
                httpURLConnection.disconnect();
                return eVar;
            }
            try {
                return new M0.e(responseCode, u(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new L3(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z3 = true;
                if (!z3) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final SharedPreferences o(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e3) {
            U2.j.j("", e3);
            return null;
        }
    }

    public static final C1548s6 p(Context context, C1459q6 c1459q6) {
        D3.l lVar = new D3.l(context, 4);
        C1548s6 c1548s6 = new C1548s6(lVar);
        int i = 7;
        C0905dr c0905dr = new C0905dr(lVar, c1459q6, c1548s6, i);
        C0709Wb c0709Wb = new C0709Wb(i, lVar, c1548s6, false);
        synchronized (lVar.f962m) {
            C1414p6 c1414p6 = new C1414p6(context, P2.o.f4767B.f4785s.n(), c0905dr, c0709Wb);
            lVar.f963n = c1414p6;
            c1414p6.n();
        }
        return c1548s6;
    }

    public static /* bridge */ C1779xC q(Object obj) {
        MB mb = (MB) obj;
        C1779xC c1779xC = mb.zzt;
        if (c1779xC != C1779xC.f) {
            return c1779xC;
        }
        C1779xC b3 = C1779xC.b();
        mb.zzt = b3;
        return b3;
    }

    public static String r(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f15409p) {
                z().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = z().doFinal(bArr2);
                iv = z().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e3) {
            throw new V4(e3);
        } catch (NoSuchAlgorithmException e5) {
            throw new V4(e5);
        } catch (BadPaddingException e6) {
            throw new V4(e6);
        } catch (IllegalBlockSizeException e7) {
            throw new V4(e7);
        } catch (NoSuchPaddingException e8) {
            throw new V4(e8);
        }
    }

    public static final void s(G7 g7, C1071hd c1071hd) {
        File externalStorageDirectory;
        Context context = (Context) c1071hd.f13763n;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        String str = (String) c1071hd.f13764o;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1071hd.f13762m;
        g7.f = context;
        g7.f9174e = str;
        g7.f9173d = (String) c1071hd.f13761l;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        g7.f9176h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC0879d8.f13101c.s()).booleanValue());
        if (((AtomicBoolean) g7.f9176h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            g7.i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) g7.f9171b).put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC0613Id.f9539a.execute(new K4(8, g7));
        HashMap hashMap = (HashMap) g7.f9172c;
        H7 h7 = H7.f9334c;
        hashMap.put("action", h7);
        hashMap.put("ad_format", h7);
        hashMap.put("e", H7.f9335d);
    }

    public static boolean t(File file) {
        try {
            X509Certificate[][] s2 = AbstractC1668us.s(file.getAbsolutePath());
            if (s2.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(s2[0][0].getEncoded());
            return Arrays.equals(f15411r, digest) || (!"user".equals(Build.TYPE) && Arrays.equals(f15412s, digest));
        } catch (C1321n3 e3) {
            throw new GeneralSecurityException("Package is not signed", e3);
        } catch (IOException | RuntimeException e5) {
            throw new GeneralSecurityException("Failed to verify signatures", e5);
        }
    }

    public static ArrayList u(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1635u3((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static byte[] y(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = decode.length;
            if (length2 <= 16) {
                throw new V4();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(decode);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f15409p) {
                z().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = z().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e3) {
            throw new V4(e3);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new V4(e5);
        } catch (InvalidKeyException e6) {
            throw new V4(e6);
        } catch (NoSuchAlgorithmException e7) {
            throw new V4(e7);
        } catch (BadPaddingException e8) {
            throw new V4(e8);
        } catch (IllegalBlockSizeException e9) {
            throw new V4(e9);
        } catch (NoSuchPaddingException e10) {
            throw new V4(e10);
        }
    }

    public static final Cipher z() {
        Cipher cipher;
        synchronized (f15410q) {
            try {
                if (f15408o == null) {
                    f15408o = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f15408o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1452q
    /* renamed from: a */
    public void mo10a() {
    }

    @Override // com.google.android.gms.internal.ads.H1
    public U b() {
        return new J(-9223372036854775807L, 0L);
    }

    @Override // com.google.android.gms.internal.ads.O1
    public boolean e(C1407p c1407p) {
        switch (this.f15418k) {
            case C1639u7.zzm /* 21 */:
                String str = c1407p.f14904m;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.O1
    public P1 f(C1407p c1407p) {
        char c5;
        P1 c0828c2;
        switch (this.f15418k) {
            case C1639u7.zzm /* 21 */:
                String str = c1407p.f14904m;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                c5 = 7;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    List list = c1407p.f14907p;
                    switch (c5) {
                        case 0:
                            c0828c2 = new C0828c2(list);
                            break;
                        case 1:
                            return new C1390oj(3);
                        case 2:
                            return new P(1);
                        case 3:
                            return new C1007g2();
                        case 4:
                            c0828c2 = new C1410p2(list);
                            break;
                        case 5:
                            return new C1071hd(3);
                        case 6:
                            c0828c2 = new Z1(list);
                            break;
                        case 7:
                            return new C1275m2();
                    }
                    return c0828c2;
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // com.google.android.gms.internal.ads.H1
    public long g(B b3) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0972fC
    public C1375oC h(Class cls) {
        if (!MB.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C1375oC) MB.m(cls.asSubclass(MB.class)).s(3, null);
        } catch (Exception e3) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.O1
    public int j(C1407p c1407p) {
        char c5;
        switch (this.f15418k) {
            case C1639u7.zzm /* 21 */:
                String str = c1407p.f14904m;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                c5 = 7;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                        case 1:
                        case 3:
                        case 7:
                            return 1;
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                            return 2;
                    }
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                return 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0972fC
    public boolean l(Class cls) {
        return MB.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.H
    public void v() {
        switch (this.f15418k) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.H
    public InterfaceC0737a0 w(int i, int i5) {
        switch (this.f15418k) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return new E();
        }
    }

    @Override // com.google.android.gms.internal.ads.H
    public void x(U u5) {
        switch (this.f15418k) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public C1543s1(C1543s1 c1543s1) {
        this.f15418k = 24;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        int i = C0870d.f13070a;
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
            if (invoke != null) {
                return (InterfaceC0627Kd) invoke;
            }
            throw null;
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Constructor mo12a() {
        switch (this.f15418k) {
            case 13:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(F.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(F.class).getConstructor(null);
        }
    }

    private final void k() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1452q
    public void d() {
    }

    private final void m(U u5) {
    }

    @Override // com.google.android.gms.internal.ads.H1
    public void c(long j5) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1766x
    public long i(long j5) {
        return j5;
    }
}
