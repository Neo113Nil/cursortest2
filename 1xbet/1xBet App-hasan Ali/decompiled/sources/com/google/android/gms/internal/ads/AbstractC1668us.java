package com.google.android.gms.internal.ads;

import Q2.C0379q;
import a3.AbstractC0467k;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import n.AbstractC2107A;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1668us {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15916a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f15917b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15918c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f15919d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f15920e = new byte[0];
    public static final String[] f = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static C5 A(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i5 = AbstractC1260lo.f14419a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                JB.l("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(A0.a(new C1617tm(Base64.decode(split[1], 0))));
                } catch (RuntimeException e3) {
                    JB.n("VorbisUtil", "Failed to parse vorbis picture", e3);
                }
            } else {
                arrayList.add(new W0(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5(arrayList);
    }

    public static C0709Wb B(C1617tm c1617tm) {
        c1617tm.k(1);
        int x5 = c1617tm.x();
        long j5 = c1617tm.f15725b;
        long j6 = x5;
        int i = x5 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                break;
            }
            long C5 = c1617tm.C();
            if (C5 == -1) {
                jArr = Arrays.copyOf(jArr, i5);
                jArr2 = Arrays.copyOf(jArr2, i5);
                break;
            }
            jArr[i5] = C5;
            jArr2[i5] = c1617tm.C();
            c1617tm.k(2);
            i5++;
        }
        c1617tm.k((int) ((j5 + j6) - c1617tm.f15725b));
        return new C0709Wb(2, jArr, jArr2);
    }

    public static Jr C(Context context, int i, int i5, Q2.X0 x02) {
        boolean matches;
        Jr j5 = j(context, i);
        if (j5 instanceof Kr) {
            j5.e();
            j5.c(i5);
            j5.b(G4.d.O(x02.f4969w));
            String str = x02.f4972z;
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) Q2.r.f5053d.f5056c.a(F7.t8), str);
            }
            if (matches) {
                j5.W(str);
            }
        }
        return j5;
    }

    public static void D(int i, String str, Throwable th) {
        U2.j.h("Ad failed to load : " + i);
        T2.G.n(str, th);
        if (i == 3) {
            return;
        }
        P2.o.f4767B.f4774g.h(str, th);
    }

    public static void E(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append('\"');
                        sb.append(obj2);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                k0(webView, sb2);
            } else {
                handler.post(new RunnableC1081hn(10, webView, sb2));
            }
        }
    }

    public static void F(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void G(String str, boolean z3) {
        if (!z3) {
            throw B7.a(null, str);
        }
    }

    public static boolean H(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                try {
                } catch (PatternSyntaxException e3) {
                    P2.o.f4767B.f4774g.i("RtbAdapterMap.hasAtleastOneRegexMatch", e3);
                }
                if ((((Boolean) Q2.r.f5053d.f5056c.a(F7.ya)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] I(String str, boolean z3) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z5 = false;
        int i5 = 0;
        while (i < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z5) {
                        arrayList.add(new String(charArray, i5, i - i5));
                    }
                    arrayList.add(new String(charArray, i, charCount));
                    z5 = false;
                    i += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z3 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z5) {
                        arrayList.add(new String(charArray, i5, i - i5));
                    }
                    z5 = false;
                }
            }
            i += charCount;
        }
        if (z5) {
            arrayList.add(new String(charArray, i5, i - i5));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int J(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static C1529ro K(C1617tm c1617tm, boolean z3, boolean z5) {
        if (z3) {
            T(3, c1617tm, false);
        }
        c1617tm.b((int) c1617tm.B(), StandardCharsets.UTF_8);
        long B5 = c1617tm.B();
        String[] strArr = new String[(int) B5];
        for (int i = 0; i < B5; i++) {
            strArr[i] = c1617tm.b((int) c1617tm.B(), StandardCharsets.UTF_8);
        }
        if (z5 && (c1617tm.v() & 1) == 0) {
            throw B7.a(null, "framing bit expected to be set");
        }
        return new C1529ro(1, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1263lr L(byte[] bArr, int i, int i5, C1071hd c1071hd) {
        boolean z3;
        int i6;
        int i7;
        int i8;
        int o5;
        int o6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int o7;
        int i14;
        float f5;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ?? r6;
        Rq rq;
        int i21;
        int i22;
        boolean z5;
        int i23;
        Rq rq2;
        E.H0 m02 = m0(new C0826c0(bArr, i, i5));
        C0826c0 c0826c0 = new C0826c0(bArr, i + 2, i5);
        c0826c0.k(4);
        int b3 = c0826c0.b(3);
        boolean z6 = true;
        int i24 = m02.f1042b;
        if (i24 == 0 || b3 != 7) {
            z3 = false;
        } else {
            b3 = 7;
            z3 = true;
        }
        if (c1071hd != null) {
            AbstractC1044gv abstractC1044gv = (AbstractC1044gv) c1071hd.f13761l;
            if (!abstractC1044gv.isEmpty()) {
                i6 = ((C0860cq) abstractC1044gv.get(Math.min(i24, abstractC1044gv.size() - 1))).f13047a;
                C1442pq c1442pq = null;
                if (z3) {
                    c0826c0.i();
                    c1442pq = o0(c0826c0, true, b3, null);
                } else if (c1071hd != null) {
                    C0709Wb c0709Wb = (C0709Wb) c1071hd.f13762m;
                    int i25 = ((int[]) c0709Wb.f12041m)[i6];
                    AbstractC1044gv abstractC1044gv2 = (AbstractC1044gv) c0709Wb.f12040l;
                    if (abstractC1044gv2.size() > i25) {
                        c1442pq = (C1442pq) abstractC1044gv2.get(i25);
                    }
                }
                C1442pq c1442pq2 = c1442pq;
                c0826c0.o();
                if (!z3) {
                    int b5 = c0826c0.n() ? c0826c0.b(8) : -1;
                    if (c1071hd != null && (rq2 = (Rq) c1071hd.f13763n) != null) {
                        if (b5 == -1) {
                            b5 = rq2.f11459b[i6];
                        }
                        if (b5 != -1) {
                            AbstractC1044gv abstractC1044gv3 = rq2.f11458a;
                            if (abstractC1044gv3.size() > b5) {
                                Eq eq = (Eq) abstractC1044gv3.get(b5);
                                int i26 = eq.f8611a;
                                i8 = eq.f8614d;
                                i7 = eq.f8615e;
                                o5 = eq.f8612b;
                                o6 = eq.f8613c;
                            }
                        }
                    }
                    i12 = 0;
                    i11 = 0;
                    i10 = 0;
                    i9 = 0;
                    int o8 = c0826c0.o();
                    if (z3) {
                        i13 = -1;
                    } else {
                        int i27 = -1;
                        for (int i28 = true != c0826c0.n() ? b3 : 0; i28 <= b3; i28++) {
                            c0826c0.o();
                            i27 = Math.max(c0826c0.o(), i27);
                            c0826c0.o();
                        }
                        i13 = i27;
                    }
                    c0826c0.o();
                    c0826c0.o();
                    c0826c0.o();
                    c0826c0.o();
                    c0826c0.o();
                    c0826c0.o();
                    if (c0826c0.n()) {
                        if (z3 && c0826c0.n()) {
                            c0826c0.k(6);
                        } else if (c0826c0.n()) {
                            int i29 = 0;
                            while (i29 < 4) {
                                for (int i30 = 0; i30 < 6; i30 += i29 == 3 ? 3 : 1) {
                                    if (c0826c0.n()) {
                                        int min = Math.min(64, 1 << ((i29 + i29) + 4));
                                        if (i29 > 1) {
                                            c0826c0.c();
                                        }
                                        for (int i31 = 0; i31 < min; i31++) {
                                            c0826c0.c();
                                        }
                                    } else {
                                        c0826c0.o();
                                    }
                                }
                                i29++;
                            }
                        }
                    }
                    c0826c0.k(2);
                    if (c0826c0.n()) {
                        c0826c0.k(8);
                        c0826c0.o();
                        c0826c0.o();
                        c0826c0.i();
                    }
                    o7 = c0826c0.o();
                    int[] iArr = new int[0];
                    int[] iArr2 = new int[0];
                    i14 = 0;
                    int i32 = -1;
                    int i33 = -1;
                    while (i14 < o7) {
                        if (i14 == 0 || !c0826c0.n()) {
                            i21 = o7;
                            i22 = i6;
                            z5 = z6;
                            int o9 = c0826c0.o();
                            int o10 = c0826c0.o();
                            int[] iArr3 = new int[o9];
                            int i34 = 0;
                            while (i34 < o9) {
                                iArr3[i34] = (i34 > 0 ? iArr3[i34 - 1] : 0) - (c0826c0.o() + 1);
                                c0826c0.i();
                                i34++;
                            }
                            int[] iArr4 = new int[o10];
                            int i35 = 0;
                            while (i35 < o10) {
                                iArr4[i35] = c0826c0.o() + 1 + (i35 > 0 ? iArr4[i35 - 1] : 0);
                                c0826c0.i();
                                i35++;
                            }
                            i33 = o9;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i32 = o10;
                        } else {
                            z5 = z6;
                            int i36 = i33 + i32;
                            boolean n5 = c0826c0.n();
                            int o11 = c0826c0.o() + 1;
                            int i37 = 1 - ((n5 ? 1 : 0) + (n5 ? 1 : 0));
                            int i38 = i36 + 1;
                            i21 = o7;
                            boolean[] zArr = new boolean[i38];
                            for (int i39 = 0; i39 <= i36; i39++) {
                                if (c0826c0.n()) {
                                    zArr[i39] = z5;
                                } else {
                                    zArr[i39] = c0826c0.n();
                                }
                            }
                            int i40 = i32 - 1;
                            int[] iArr5 = new int[i38];
                            int[] iArr6 = new int[i38];
                            int i41 = 0;
                            while (true) {
                                i23 = i37 * o11;
                                if (i40 < 0) {
                                    break;
                                }
                                int i42 = iArr2[i40] + i23;
                                if (i42 < 0 && zArr[i33 + i40]) {
                                    iArr5[i41] = i42;
                                    i41++;
                                }
                                i40--;
                            }
                            if (i23 < 0 && zArr[i36]) {
                                iArr5[i41] = i23;
                                i41++;
                            }
                            i22 = i6;
                            int[] iArr7 = iArr;
                            int i43 = i41;
                            for (int i44 = 0; i44 < i33; i44++) {
                                int i45 = iArr7[i44] + i23;
                                if (i45 < 0 && zArr[i44]) {
                                    iArr5[i43] = i45;
                                    i43++;
                                }
                            }
                            int[] copyOf = Arrays.copyOf(iArr5, i43);
                            int i46 = 0;
                            for (int i47 = i33 - 1; i47 >= 0; i47--) {
                                int i48 = iArr7[i47] + i23;
                                if (i48 > 0 && zArr[i47]) {
                                    iArr6[i46] = i48;
                                    i46++;
                                }
                            }
                            if (i23 > 0 && zArr[i36]) {
                                iArr6[i46] = i23;
                                i46++;
                            }
                            int i49 = i46;
                            for (int i50 = 0; i50 < i32; i50++) {
                                int i51 = iArr2[i50] + i23;
                                if (i51 > 0 && zArr[i33 + i50]) {
                                    iArr6[i49] = i51;
                                    i49++;
                                }
                            }
                            iArr2 = Arrays.copyOf(iArr6, i49);
                            i33 = i43;
                            i32 = i49;
                            iArr = copyOf;
                        }
                        i14++;
                        z6 = z5;
                        i6 = i22;
                        o7 = i21;
                    }
                    int i52 = i6;
                    boolean z7 = z6;
                    if (c0826c0.n()) {
                        int o12 = c0826c0.o();
                        for (int i53 = 0; i53 < o12; i53++) {
                            c0826c0.k(o8 + 5);
                        }
                    }
                    c0826c0.k(2);
                    float f6 = 1.0f;
                    if (c0826c0.n()) {
                        if (c0826c0.n()) {
                            int b6 = c0826c0.b(8);
                            if (b6 == 255) {
                                int b7 = c0826c0.b(16);
                                int b8 = c0826c0.b(16);
                                if (b7 != 0 && b8 != 0) {
                                    f6 = b7 / b8;
                                }
                            } else if (b6 < 17) {
                                f6 = f15917b[b6];
                            } else {
                                AbstractC0467k.y(b6, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            }
                        }
                        if (c0826c0.n()) {
                            c0826c0.i();
                        }
                        if (c0826c0.n()) {
                            c0826c0.k(3);
                            boolean z8 = z7 != c0826c0.n() ? 2 : z7;
                            if (c0826c0.n()) {
                                int b9 = c0826c0.b(8);
                                int b10 = c0826c0.b(8);
                                c0826c0.k(8);
                                i19 = C1242lE.a(b9);
                                i20 = C1242lE.b(b10);
                                r6 = z8;
                            } else {
                                i19 = -1;
                                i20 = -1;
                                r6 = z8;
                            }
                        } else {
                            if (c1071hd != null && (rq = (Rq) c1071hd.f13764o) != null) {
                                int i54 = rq.f11459b[i52];
                                AbstractC1044gv abstractC1044gv4 = rq.f11458a;
                                if (abstractC1044gv4.size() > i54) {
                                    C1847yr c1847yr = (C1847yr) abstractC1044gv4.get(i54);
                                    int i55 = c1847yr.f16490a;
                                    int i56 = c1847yr.f16491b;
                                    i20 = c1847yr.f16492c;
                                    i19 = i55;
                                    r6 = i56;
                                }
                            }
                            i19 = -1;
                            i20 = -1;
                            r6 = -1;
                        }
                        if (c0826c0.n()) {
                            c0826c0.o();
                            c0826c0.o();
                        }
                        c0826c0.i();
                        if (c0826c0.n()) {
                            i12 += i12;
                        }
                        i16 = i19;
                        i18 = i20;
                        f5 = f6;
                        i17 = r6;
                        i15 = i12;
                    } else {
                        f5 = 1.0f;
                        i15 = i12;
                        i16 = -1;
                        i17 = -1;
                        i18 = -1;
                    }
                    return new C1263lr(c1442pq2, i11, i10, i9, i15, f5, i13, i16, i17, i18);
                }
                int o13 = c0826c0.o();
                if (o13 == 3) {
                    c0826c0.i();
                    o13 = 3;
                }
                int o14 = c0826c0.o();
                int o15 = c0826c0.o();
                if (c0826c0.n()) {
                    int o16 = c0826c0.o();
                    int o17 = c0826c0.o();
                    int o18 = c0826c0.o();
                    int o19 = c0826c0.o();
                    o14 -= (o16 + o17) * ((o13 == 1 || o13 == 2) ? 2 : 1);
                    o15 -= (o18 + o19) * (o13 == 1 ? 2 : 1);
                }
                i7 = o15;
                i8 = o14;
                o5 = c0826c0.o();
                o6 = c0826c0.o();
                i9 = i8;
                i11 = o5;
                i12 = i7;
                i10 = o6;
                int o82 = c0826c0.o();
                if (z3) {
                }
                c0826c0.o();
                c0826c0.o();
                c0826c0.o();
                c0826c0.o();
                c0826c0.o();
                c0826c0.o();
                if (c0826c0.n()) {
                }
                c0826c0.k(2);
                if (c0826c0.n()) {
                }
                o7 = c0826c0.o();
                int[] iArr8 = new int[0];
                int[] iArr22 = new int[0];
                i14 = 0;
                int i322 = -1;
                int i332 = -1;
                while (i14 < o7) {
                }
                int i522 = i6;
                boolean z72 = z6;
                if (c0826c0.n()) {
                }
                c0826c0.k(2);
                float f62 = 1.0f;
                if (c0826c0.n()) {
                }
                return new C1263lr(c1442pq2, i11, i10, i9, i15, f5, i13, i16, i17, i18);
            }
        }
        i6 = 0;
        C1442pq c1442pq3 = null;
        if (z3) {
        }
        C1442pq c1442pq22 = c1442pq3;
        c0826c0.o();
        if (!z3) {
        }
        i9 = i8;
        i11 = o5;
        i12 = i7;
        i10 = o6;
        int o822 = c0826c0.o();
        if (z3) {
        }
        c0826c0.o();
        c0826c0.o();
        c0826c0.o();
        c0826c0.o();
        c0826c0.o();
        c0826c0.o();
        if (c0826c0.n()) {
        }
        c0826c0.k(2);
        if (c0826c0.n()) {
        }
        o7 = c0826c0.o();
        int[] iArr82 = new int[0];
        int[] iArr222 = new int[0];
        i14 = 0;
        int i3222 = -1;
        int i3322 = -1;
        while (i14 < o7) {
        }
        int i5222 = i6;
        boolean z722 = z6;
        if (c0826c0.n()) {
        }
        c0826c0.k(2);
        float f622 = 1.0f;
        if (c0826c0.n()) {
        }
        return new C1263lr(c1442pq22, i11, i10, i9, i15, f5, i13, i16, i17, i18);
    }

    public static String M(String str, Context context, boolean z3, HashMap hashMap) {
        C1204kd c1204kd;
        String a5;
        A7 a7 = F7.f8884q0;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && !z3) {
            return str;
        }
        P2.o oVar = P2.o.f4767B;
        if (!oVar.f4790x.e(context) || TextUtils.isEmpty(str) || (a5 = (c1204kd = oVar.f4790x).a(context)) == null) {
            return str;
        }
        A7 a72 = F7.f8842j0;
        D7 d7 = rVar.f5056c;
        String str2 = (String) d7.a(a72);
        boolean booleanValue = ((Boolean) d7.a(F7.f8837i0)).booleanValue();
        T2.L l5 = oVar.f4771c;
        if (booleanValue && str.contains(str2)) {
            l5.getClass();
            if (T2.L.v(str, l5.f5673a, (String) rVar.f5056c.a(F7.f8823f0))) {
                Map map = (Map) hashMap.get("_ac");
                c1204kd.getClass();
                c1204kd.k(context, "_ac", a5, C1204kd.f(map));
                return R(context, str).replace(str2, a5);
            }
            l5.getClass();
            if (!T2.L.v(str, l5.f5674b, (String) rVar.f5056c.a(F7.f8829g0))) {
                return str;
            }
            Map map2 = (Map) hashMap.get("_ai");
            c1204kd.getClass();
            c1204kd.k(context, "_ai", a5, C1204kd.f(map2));
            return R(context, str).replace(str2, a5);
        }
        if (str.contains("fbs_aeid") || ((Boolean) d7.a(F7.f8835h0)).booleanValue()) {
            return str;
        }
        l5.getClass();
        if (T2.L.v(str, l5.f5673a, (String) rVar.f5056c.a(F7.f8823f0))) {
            Map map3 = (Map) hashMap.get("_ac");
            c1204kd.getClass();
            c1204kd.k(context, "_ac", a5, C1204kd.f(map3));
            return h(R(context, str), "fbs_aeid", a5).toString();
        }
        l5.getClass();
        if (!T2.L.v(str, l5.f5674b, (String) rVar.f5056c.a(F7.f8829g0))) {
            return str;
        }
        Map map4 = (Map) hashMap.get("_ai");
        c1204kd.getClass();
        c1204kd.k(context, "_ai", a5, C1204kd.f(map4));
        return h(R(context, str), "fbs_aeid", a5).toString();
    }

    public static void N(SQLiteDatabase sQLiteDatabase, long j5, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j5));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j5)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static final ResolveInfo O(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            P2.o.f4767B.f4774g.i("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1071hd P(byte[] bArr, int i, int i5) {
        int[] iArr;
        Rq rq;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z5;
        int i10;
        int[] iArr2;
        boolean[][] zArr;
        int i11;
        C1761wv c1761wv;
        boolean[][] zArr2;
        int[] iArr3;
        int i12;
        int i13;
        int i14;
        boolean n5;
        int i15;
        int i16;
        int i17;
        int i18;
        int o5;
        int i19;
        int i20;
        boolean z6;
        boolean z7;
        C0826c0 c0826c0 = new C0826c0(bArr, i, i5);
        m0(c0826c0);
        c0826c0.k(4);
        boolean n6 = c0826c0.n();
        boolean n7 = c0826c0.n();
        int b3 = c0826c0.b(6);
        int i21 = b3 + 1;
        int b5 = c0826c0.b(3);
        c0826c0.k(17);
        C1442pq o02 = o0(c0826c0, true, b5, null);
        for (int i22 = true != c0826c0.n() ? b5 : 0; i22 <= b5; i22++) {
            c0826c0.o();
            c0826c0.o();
            c0826c0.o();
        }
        int b6 = c0826c0.b(6);
        int o6 = c0826c0.o() + 1;
        int i23 = 6;
        C0709Wb c0709Wb = new C0709Wb(AbstractC1044gv.n(o02), new int[1]);
        boolean z8 = i21 >= 2 && o6 >= 2;
        boolean z9 = n6 && n7;
        int i24 = b6 + 1;
        if (!z8 || !z9 || i24 < i21) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, o6, i24);
        int i25 = 1;
        int[] iArr5 = new int[o6];
        int[] iArr6 = new int[o6];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i26 = 1; i26 < o6; i26++) {
            int i27 = 0;
            for (int i28 = 0; i28 <= b6; i28++) {
                if (c0826c0.n()) {
                    iArr4[i26][i27] = i28;
                    iArr6[i26] = i28;
                    i27++;
                }
                iArr5[i26] = i27;
            }
        }
        if (c0826c0.n()) {
            c0826c0.k(64);
            if (c0826c0.n()) {
                c0826c0.o();
            }
            int o7 = c0826c0.o();
            int i29 = 0;
            while (i29 < o7) {
                c0826c0.o();
                if (i29 == 0 || c0826c0.n()) {
                    boolean n8 = c0826c0.n();
                    boolean n9 = c0826c0.n();
                    z7 = n8;
                    z6 = n9;
                    if (n8 || n9) {
                        n5 = c0826c0.n();
                        if (n5) {
                            c0826c0.k(19);
                        }
                        c0826c0.k(8);
                        if (n5) {
                            c0826c0.k(4);
                        }
                        c0826c0.k(15);
                        i16 = n8;
                        i15 = n9;
                        i17 = 0;
                        while (i17 <= b5) {
                            if (c0826c0.n() || c0826c0.n()) {
                                c0826c0.o();
                            } else if (c0826c0.n()) {
                                i18 = i29;
                                o5 = 0;
                                int[][] iArr7 = iArr4;
                                i19 = i16 + i15;
                                int[] iArr8 = iArr6;
                                i20 = 0;
                                while (i20 < i19) {
                                    int i30 = i19;
                                    for (int i31 = 0; i31 <= o5; i31++) {
                                        c0826c0.o();
                                        c0826c0.o();
                                        if (n5) {
                                            c0826c0.o();
                                            c0826c0.o();
                                        }
                                        c0826c0.i();
                                    }
                                    i20++;
                                    i19 = i30;
                                }
                                i17++;
                                iArr4 = iArr7;
                                i29 = i18;
                                iArr6 = iArr8;
                            }
                            i18 = i29;
                            o5 = c0826c0.o();
                            int[][] iArr72 = iArr4;
                            i19 = i16 + i15;
                            int[] iArr82 = iArr6;
                            i20 = 0;
                            while (i20 < i19) {
                            }
                            i17++;
                            iArr4 = iArr72;
                            i29 = i18;
                            iArr6 = iArr82;
                        }
                        i29++;
                    }
                } else {
                    z7 = false;
                    z6 = false;
                }
                n5 = false;
                i16 = z7;
                i15 = z6;
                i17 = 0;
                while (i17 <= b5) {
                }
                i29++;
            }
        }
        int[][] iArr9 = iArr4;
        int[] iArr10 = iArr6;
        if (!c0826c0.n()) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        int i32 = c0826c0.f12946e;
        if (i32 > 0) {
            c0826c0.k(8 - i32);
        }
        C1442pq o03 = o0(c0826c0, false, b5, o02);
        boolean n10 = c0826c0.n();
        boolean[] zArr3 = new boolean[16];
        int i33 = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            boolean n11 = c0826c0.n();
            zArr3[i34] = n11;
            if (n11) {
                i33++;
            }
        }
        if (i33 == 0 || !zArr3[1]) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        int i35 = i33 + 1;
        int[] iArr11 = new int[i33];
        for (int i36 = 0; i36 < i33 - (n10 ? 1 : 0); i36++) {
            iArr11[i36] = c0826c0.b(3);
        }
        int[] iArr12 = new int[i35];
        if (n10) {
            for (int i37 = 1; i37 < i33; i37++) {
                for (int i38 = 0; i38 < i37; i38++) {
                    iArr12[i37] = iArr11[i38] + 1 + iArr12[i37];
                }
            }
            iArr12[i33] = 6;
        }
        int[][] iArr13 = (int[][]) Array.newInstance((Class<?>) cls, i21, i33);
        int[] iArr14 = new int[i21];
        iArr14[0] = 0;
        boolean n12 = c0826c0.n();
        int i39 = 1;
        while (i39 < i21) {
            if (n12) {
                iArr14[i39] = c0826c0.b(i23);
            } else {
                iArr14[i39] = i39;
            }
            if (n10) {
                i14 = i39;
                for (int i40 = 0; i40 < i33; i40++) {
                    iArr13[i14][i40] = (iArr14[i14] & ((1 << iArr12[r32]) - 1)) >> iArr12[i40];
                }
            } else {
                int i41 = 0;
                while (i41 < i33) {
                    iArr13[i39][i41] = c0826c0.b(iArr11[i41] + 1);
                    i41++;
                    i39 = i39;
                }
                i14 = i39;
            }
            i39 = i14 + 1;
            i23 = 6;
        }
        int[] iArr15 = new int[i24];
        int i42 = 1;
        int i43 = 0;
        while (i43 < i21) {
            iArr15[iArr14[i43]] = -1;
            int[] iArr16 = iArr15;
            int i44 = 0;
            int i45 = 0;
            while (i44 < 16) {
                if (zArr3[i44]) {
                    i13 = i25;
                    if (i44 == i13) {
                        iArr16[iArr14[i43]] = iArr13[i43][i45];
                        i44 = i13;
                    }
                    i45++;
                } else {
                    i13 = i25;
                }
                i44 += i13;
                i25 = i13;
            }
            if (i43 > 0) {
                int i46 = 0;
                while (true) {
                    if (i46 >= i43) {
                        i42++;
                        break;
                    }
                    int i47 = i46;
                    if (iArr16[iArr14[i43]] == iArr16[iArr14[i46]]) {
                        break;
                    }
                    i46 = i47 + 1;
                }
            }
            i43++;
            iArr15 = iArr16;
            i25 = 1;
        }
        int[] iArr17 = iArr15;
        int b7 = c0826c0.b(4);
        if (i42 < 2 || b7 == 0) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        int[] iArr18 = new int[i42];
        for (int i48 = 0; i48 < i42; i48++) {
            iArr18[i48] = c0826c0.b(b7);
        }
        int[] iArr19 = new int[i24];
        for (int i49 = 0; i49 < i21; i49++) {
            iArr19[Math.min(iArr14[i49], b6)] = i49;
        }
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i50 = i42;
        int i51 = 0;
        int i52 = 0;
        while (i52 <= b6) {
            int[] iArr20 = iArr19;
            int[] iArr21 = iArr14;
            int min = Math.min(iArr17[i52], i50 - 1);
            int i53 = i52;
            C0860cq c0860cq = new C0860cq(iArr20[i53], min >= 0 ? iArr18[min] : -1);
            int length = objArr.length;
            int i54 = i51 + 1;
            int d5 = AbstractC0776av.d(length, i54);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i51] = c0860cq;
            i52 = i53 + 1;
            i51 = i54;
            iArr19 = iArr20;
            iArr14 = iArr21;
        }
        int[] iArr22 = iArr14;
        C1761wv k5 = AbstractC1044gv.k(i51, objArr);
        if (((C0860cq) k5.get(0)).f13048b == -1) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        int i55 = 1;
        while (true) {
            if (i55 > b6) {
                i55 = -1;
                break;
            }
            if (((C0860cq) k5.get(i55)).f13048b != -1) {
                break;
            }
            i55++;
        }
        if (i55 == -1) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        int i56 = 1;
        while (i56 < i21) {
            boolean[][] zArr6 = zArr5;
            for (int i57 = 0; i57 < i56; i57++) {
                boolean[] zArr7 = zArr4[i56];
                boolean[] zArr8 = zArr6[i56];
                boolean n13 = c0826c0.n();
                zArr8[i57] = n13;
                zArr7[i57] = n13;
            }
            i56++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i58 = 1; i58 < i21; i58++) {
            int i59 = 0;
            while (i59 < b3) {
                boolean[][] zArr10 = zArr4;
                int i60 = 0;
                while (true) {
                    if (i60 < i58) {
                        boolean[] zArr11 = zArr9[i58];
                        if (zArr11[i60] && zArr9[i60][i59]) {
                            zArr11[i59] = true;
                            break;
                        }
                        i60++;
                    }
                }
                i59++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr23 = new int[i24];
        for (int i61 = 0; i61 < i21; i61++) {
            int i62 = 0;
            for (int i63 = 0; i63 < i61; i63++) {
                i62 += zArr12[i61][i63] ? 1 : 0;
            }
            iArr23[iArr22[i61]] = i62;
        }
        int i64 = 0;
        for (int i65 = 0; i65 < i21; i65++) {
            if (iArr23[iArr22[i65]] == 0) {
                i64++;
            }
        }
        if (i64 > 1) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        int[] iArr24 = new int[i21];
        int[] iArr25 = new int[o6];
        if (c0826c0.n()) {
            iArr = iArr23;
            int i66 = 0;
            while (i66 < i21) {
                int i67 = i66;
                iArr24[i67] = c0826c0.b(3);
                i66 = i67 + 1;
            }
        } else {
            iArr = iArr23;
            Arrays.fill(iArr24, 0, i21, b5);
        }
        int i68 = 0;
        while (i68 < o6) {
            int i69 = i68;
            int[] iArr26 = iArr24;
            int[] iArr27 = iArr25;
            int i70 = 0;
            for (int i71 = 0; i71 < iArr5[i69]; i71++) {
                i70 = Math.max(i70, iArr26[((C0860cq) k5.get(iArr9[i69][i71])).f13047a]);
            }
            iArr27[i69] = i70 + 1;
            i68 = i69 + 1;
            iArr24 = iArr26;
            iArr25 = iArr27;
        }
        int[] iArr28 = iArr25;
        if (c0826c0.n()) {
            int i72 = 0;
            while (i72 < b3) {
                int i73 = i72 + 1;
                int i74 = i73;
                while (i74 < i21) {
                    if (zArr12[i74][i72]) {
                        i12 = b3;
                        c0826c0.k(3);
                    } else {
                        i12 = b3;
                    }
                    i74++;
                    b3 = i12;
                }
                i72 = i73;
            }
        }
        c0826c0.i();
        int o8 = c0826c0.o() + 1;
        C0909dv c0909dv = new C0909dv(4);
        c0909dv.a(o02);
        if (o8 > 1) {
            c0909dv.a(o03);
            for (int i75 = 2; i75 < o8; i75++) {
                o03 = o0(c0826c0, c0826c0.n(), b5, o03);
                c0909dv.a(o03);
            }
        }
        C1761wv f5 = c0909dv.f();
        int o9 = c0826c0.o() + o6;
        if (o9 > o6) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        int b8 = c0826c0.b(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, o9, i24);
        int[] iArr29 = new int[o9];
        int i76 = 0;
        int[] iArr30 = new int[o9];
        int i77 = 0;
        while (i77 < o6) {
            iArr29[i77] = i76;
            int i78 = i77;
            int i79 = iArr10[i78];
            iArr30[i78] = i79;
            if (b8 == 0) {
                zArr2 = zArr13;
                c1761wv = f5;
                iArr3 = iArr29;
                Arrays.fill(zArr13[i78], i76, iArr5[i78], true);
                iArr3[i78] = iArr5[i78];
            } else {
                c1761wv = f5;
                zArr2 = zArr13;
                iArr3 = iArr29;
                if (b8 == 1) {
                    for (int i80 = 0; i80 < iArr5[i78]; i80++) {
                        zArr2[i78][i80] = iArr9[i78][i80] == i79;
                    }
                    iArr3[i78] = 1;
                } else {
                    i76 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i77 = i78 + 1;
                    zArr13 = zArr2;
                    iArr29 = iArr3;
                    f5 = c1761wv;
                }
            }
            i76 = 0;
            i77 = i78 + 1;
            zArr13 = zArr2;
            iArr29 = iArr3;
            f5 = c1761wv;
        }
        C1761wv c1761wv2 = f5;
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i24];
        int i81 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i24;
        iArr33[i76] = o9;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i82 = 1;
        int i83 = 0;
        while (i82 < o9) {
            if (b8 == i81) {
                for (int i84 = 0; i84 < iArr5[i82]; i84++) {
                    zArr14[i82][i84] = c0826c0.n();
                    int i85 = iArr31[i82];
                    boolean z10 = zArr14[i82][i84];
                    iArr31[i82] = i85 + (z10 ? 1 : 0);
                    if (z10) {
                        iArr30[i82] = iArr9[i82][i84];
                    }
                }
            }
            if (i83 == 0) {
                i10 = 0;
                if (iArr9[i82][0] == 0 && zArr14[i82][0]) {
                    i83 = 0;
                    for (int i86 = 1; i86 < iArr5[i82]; i86++) {
                        if (iArr9[i82][i86] == i55 && zArr14[i82][i55]) {
                            i83 = i82;
                        }
                    }
                } else {
                    i83 = 0;
                }
            } else {
                i10 = 0;
            }
            int i87 = i10;
            while (i87 < iArr5[i82]) {
                if (o8 > 1) {
                    zArr15[i82][i87] = zArr14[i82][i87];
                    iArr2 = iArr32;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int a5 = Vv.a(o8);
                    if (!zArr[i82][i87]) {
                        C0860cq c0860cq2 = (C0860cq) k5.get(iArr9[i82][i87]);
                        i11 = o8;
                        int i88 = i10;
                        while (true) {
                            if (i88 >= i87) {
                                break;
                            }
                            int i89 = i88;
                            if (zArr9[c0860cq2.f13047a][((C0860cq) k5.get(iArr9[i82][i89])).f13047a]) {
                                zArr[i82][i87] = true;
                                break;
                            }
                            i88 = i89 + 1;
                        }
                    } else {
                        i11 = o8;
                    }
                    if (zArr[i82][i87]) {
                        if (i83 <= 0 || i82 != i83) {
                            c0826c0.k(a5);
                        } else {
                            iArr2[i87] = c0826c0.b(a5);
                        }
                    }
                } else {
                    iArr2 = iArr32;
                    zArr = zArr15;
                    i11 = o8;
                }
                i87++;
                iArr32 = iArr2;
                zArr15 = zArr;
                o8 = i11;
            }
            int[] iArr34 = iArr32;
            boolean[][] zArr16 = zArr15;
            int i90 = o8;
            if (iArr31[i82] == 1 && iArr[iArr30[i82]] > 0) {
                c0826c0.i();
            }
            i82++;
            iArr32 = iArr34;
            zArr15 = zArr16;
            o8 = i90;
            i81 = 2;
        }
        int[] iArr35 = iArr32;
        boolean[][] zArr17 = zArr15;
        if (i83 == 0) {
            return new C1071hd((C1761wv) null, c0709Wb, (Rq) null, (Rq) null);
        }
        int o10 = c0826c0.o();
        int i91 = o10 + 1;
        AbstractC0952et.q("expectedSize", i91);
        AbstractC0952et.q("initialCapacity", i91);
        int[] iArr36 = new int[i21];
        Object[] objArr2 = new Object[i91];
        int i92 = 0;
        int i93 = 0;
        boolean z11 = false;
        while (i92 < i91) {
            int b9 = c0826c0.b(16);
            int b10 = c0826c0.b(16);
            if (c0826c0.n()) {
                i6 = i92;
                i7 = c0826c0.b(2);
                if (i7 == 3) {
                    c0826c0.i();
                }
                i8 = c0826c0.b(4);
                i9 = c0826c0.b(4);
            } else {
                i6 = i92;
                i7 = 0;
                i8 = 0;
                i9 = 0;
            }
            if (c0826c0.n()) {
                int o11 = c0826c0.o();
                int o12 = c0826c0.o();
                int o13 = c0826c0.o();
                int o14 = c0826c0.o();
                z3 = z11;
                b9 -= (o11 + o12) * ((i7 == 1 || i7 == 2) ? 2 : 1);
                b10 -= (o13 + o14) * (i7 == 1 ? 2 : 1);
            } else {
                z3 = z11;
            }
            Eq eq = new Eq(i7, i8, i9, b9, b10);
            int length2 = objArr2.length;
            int d6 = AbstractC0776av.d(length2, i93 + 1);
            if (d6 > length2 || z3) {
                objArr2 = Arrays.copyOf(objArr2, d6);
                z5 = false;
            } else {
                z5 = z3;
            }
            objArr2[i93] = eq;
            i93++;
            i92 = i6 + 1;
            z11 = z5;
        }
        if (i91 <= 1 || !c0826c0.n()) {
            for (int i94 = 1; i94 < i21; i94++) {
                iArr36[i94] = Math.min(i94, o10);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int a6 = Vv.a(i91);
            for (int i95 = 1; i95 < i21; i95++) {
                iArr36[i95] = c0826c0.b(a6);
            }
        }
        Rq rq2 = new Rq(AbstractC1044gv.k(i93, objArr2), iArr36, 0);
        c0826c0.k(2);
        for (int i96 = 1; i96 < i21; i96++) {
            if (iArr[iArr22[i96]] == 0) {
                c0826c0.i();
            }
        }
        for (int i97 = 1; i97 < o9; i97++) {
            boolean n14 = c0826c0.n();
            int i98 = 0;
            while (i98 < iArr28[i97]) {
                if ((i98 <= 0 || !n14) ? i98 == 0 : c0826c0.n()) {
                    for (int i99 = 0; i99 < iArr5[i97]; i99++) {
                        if (zArr17[i97][i99]) {
                            c0826c0.o();
                        }
                    }
                    c0826c0.o();
                    c0826c0.o();
                }
                i98++;
            }
        }
        int o15 = c0826c0.o() + 2;
        if (c0826c0.n()) {
            c0826c0.k(o15);
        } else {
            for (int i100 = 1; i100 < i21; i100++) {
                for (int i101 = 0; i101 < i100; i101++) {
                    if (zArr12[i100][i101]) {
                        c0826c0.k(o15);
                    }
                }
            }
        }
        int o16 = c0826c0.o();
        for (int i102 = 1; i102 <= o16; i102++) {
            c0826c0.k(8);
        }
        if (c0826c0.n()) {
            int i103 = c0826c0.f12946e;
            if (i103 > 0) {
                c0826c0.k(8 - i103);
            }
            if (c0826c0.n() || c0826c0.n()) {
                c0826c0.i();
            }
            boolean n15 = c0826c0.n();
            boolean n16 = c0826c0.n();
            if (n15 || n16) {
                for (int i104 = 0; i104 < o6; i104++) {
                    for (int i105 = 0; i105 < iArr28[i104]; i105++) {
                        boolean n17 = n15 ? c0826c0.n() : false;
                        boolean n18 = n16 ? c0826c0.n() : false;
                        if (n17) {
                            c0826c0.k(32);
                        }
                        if (n18) {
                            c0826c0.k(18);
                        }
                    }
                }
            }
            boolean n19 = c0826c0.n();
            int b11 = n19 ? c0826c0.b(4) + 1 : i21;
            AbstractC0952et.q("expectedSize", b11);
            AbstractC0952et.q("initialCapacity", b11);
            int[] iArr37 = new int[i21];
            Object[] objArr3 = new Object[b11];
            int i106 = 0;
            int i107 = 0;
            boolean z12 = false;
            while (i106 < b11) {
                c0826c0.k(3);
                int i108 = true != c0826c0.n() ? 2 : 1;
                int a7 = C1242lE.a(c0826c0.b(8));
                int b12 = C1242lE.b(c0826c0.b(8));
                c0826c0.k(8);
                C1847yr c1847yr = new C1847yr(a7, i108, b12);
                int length3 = objArr3.length;
                int d7 = AbstractC0776av.d(length3, i107 + 1);
                if (d7 > length3 || z12) {
                    objArr3 = Arrays.copyOf(objArr3, d7);
                    z12 = false;
                }
                objArr3[i107] = c1847yr;
                i106++;
                i107++;
                z12 = z12;
            }
            if (n19 && b11 > 1) {
                for (int i109 = 0; i109 < i21; i109++) {
                    iArr37[i109] = c0826c0.b(4);
                }
            }
            rq = new Rq(AbstractC1044gv.k(i107, objArr3), iArr37, 1);
        } else {
            rq = null;
        }
        return new C1071hd(k5, new C0709Wb(c1761wv2, iArr35), rq2, rq);
    }

    public static String Q(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(AbstractC2107A.q("Unknown content digest algorthm: ", i));
    }

    public static String R(Context context, String str) {
        P2.o oVar = P2.o.f4767B;
        String c5 = oVar.f4790x.c(context);
        String b3 = oVar.f4790x.b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(c5)) {
            str = h(str, "gmp_app_id", c5).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(b3)) ? str : h(str, "fbs_aiid", b3).toString();
    }

    public static void S(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean T(int i, C1617tm c1617tm, boolean z3) {
        if (c1617tm.o() < 7) {
            if (z3) {
                return false;
            }
            throw B7.a(null, "too short header: " + c1617tm.o());
        }
        if (c1617tm.v() != i) {
            if (z3) {
                return false;
            }
            throw B7.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i))));
        }
        if (c1617tm.v() == 118 && c1617tm.v() == 111 && c1617tm.v() == 114 && c1617tm.v() == 98 && c1617tm.v() == 105 && c1617tm.v() == 115) {
            return true;
        }
        if (z3) {
            return false;
        }
        throw B7.a(null, "expected characters 'vorbis'");
    }

    public static ByteBuffer U(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i5 = i + position;
        if (i5 < position || i5 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i5);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i5);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static void V(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static void W(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int X(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences != null) {
            try {
                return sharedPreferences.getInt(str, 0);
            } catch (ClassCastException unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0996fs Y(byte[] bArr, int i, int i5) {
        int o5;
        int i6;
        int i7;
        int o6;
        int i8;
        int o7;
        boolean n5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f5;
        float f6;
        int i15;
        int i16;
        boolean n6;
        boolean n7;
        int i17;
        C0826c0 c0826c0 = new C0826c0(bArr, i, i5);
        int b3 = c0826c0.b(8);
        int b5 = c0826c0.b(8);
        int b6 = c0826c0.b(8);
        int o8 = c0826c0.o();
        if (b3 != 100 && b3 != 110 && b3 != 122 && b3 != 244 && b3 != 44 && b3 != 83 && b3 != 86 && b3 != 118 && b3 != 128) {
            if (b3 != 138) {
                o5 = 1;
                i7 = 16;
                i8 = 0;
                o6 = 0;
                c0826c0.o();
                o7 = c0826c0.o();
                if (o7 != 0) {
                    c0826c0.o();
                } else if (o7 == 1) {
                    c0826c0.n();
                    c0826c0.c();
                    c0826c0.c();
                    long o9 = c0826c0.o();
                    for (int i18 = 0; i18 < o9; i18++) {
                        c0826c0.o();
                    }
                }
                c0826c0.o();
                c0826c0.i();
                int o10 = c0826c0.o() + 1;
                int o11 = c0826c0.o() + 1;
                n5 = c0826c0.n();
                int i19 = 2 - (n5 ? 1 : 0);
                if (!n5) {
                    c0826c0.i();
                }
                c0826c0.i();
                int i20 = o10 * 16;
                int i21 = o11 * i19 * 16;
                if (c0826c0.n()) {
                    int o12 = c0826c0.o();
                    int o13 = c0826c0.o();
                    int o14 = c0826c0.o();
                    int o15 = c0826c0.o();
                    if (o5 == 0) {
                        i17 = 1;
                    } else {
                        i17 = o5 == 3 ? 1 : 2;
                        i19 *= o5 == 1 ? 2 : 1;
                    }
                    i20 -= (o12 + o13) * i17;
                    i21 -= (o14 + o15) * i19;
                }
                int i22 = i21;
                int i23 = i20;
                if (b3 != 44 || b3 == 86 || b3 == 100 || b3 == 110 || b3 == 122) {
                    i9 = b3;
                } else {
                    i9 = 244;
                    if (b3 != 244) {
                        i10 = i7;
                        int i24 = -1;
                        if (c0826c0.n()) {
                            if (c0826c0.n()) {
                                int b7 = c0826c0.b(8);
                                if (b7 == 255) {
                                    int i25 = i7;
                                    int b8 = c0826c0.b(i25);
                                    int b9 = c0826c0.b(i25);
                                    if (b8 != 0 && b9 != 0) {
                                        f6 = b8 / b9;
                                        if (c0826c0.n()) {
                                            c0826c0.i();
                                        }
                                        if (c0826c0.n()) {
                                            c0826c0.k(3);
                                            int i26 = true != c0826c0.n() ? 2 : 1;
                                            if (c0826c0.n()) {
                                                int b10 = c0826c0.b(8);
                                                int b11 = c0826c0.b(8);
                                                c0826c0.k(8);
                                                int a5 = C1242lE.a(b10);
                                                int i27 = i26;
                                                i16 = C1242lE.b(b11);
                                                i15 = a5;
                                                i24 = i27;
                                                if (c0826c0.n()) {
                                                    c0826c0.o();
                                                    c0826c0.o();
                                                }
                                                if (c0826c0.n()) {
                                                    c0826c0.k(65);
                                                }
                                                n6 = c0826c0.n();
                                                if (n6) {
                                                    p0(c0826c0);
                                                }
                                                n7 = c0826c0.n();
                                                if (n7) {
                                                    p0(c0826c0);
                                                }
                                                if (!n6 || n7) {
                                                    c0826c0.i();
                                                }
                                                c0826c0.i();
                                                if (c0826c0.n()) {
                                                    c0826c0.i();
                                                    c0826c0.o();
                                                    c0826c0.o();
                                                    c0826c0.o();
                                                    c0826c0.o();
                                                    i10 = c0826c0.o();
                                                    c0826c0.o();
                                                }
                                                i11 = i15;
                                                i12 = i24;
                                                i13 = i10;
                                                f5 = f6;
                                                i14 = i16;
                                            } else {
                                                i15 = -1;
                                                i24 = i26;
                                            }
                                        } else {
                                            i15 = -1;
                                        }
                                        i16 = i15;
                                        if (c0826c0.n()) {
                                        }
                                        if (c0826c0.n()) {
                                        }
                                        n6 = c0826c0.n();
                                        if (n6) {
                                        }
                                        n7 = c0826c0.n();
                                        if (n7) {
                                        }
                                        if (!n6) {
                                        }
                                        c0826c0.i();
                                        c0826c0.i();
                                        if (c0826c0.n()) {
                                        }
                                        i11 = i15;
                                        i12 = i24;
                                        i13 = i10;
                                        f5 = f6;
                                        i14 = i16;
                                    }
                                } else if (b7 < 17) {
                                    f6 = f15917b[b7];
                                    if (c0826c0.n()) {
                                    }
                                    if (c0826c0.n()) {
                                    }
                                    i16 = i15;
                                    if (c0826c0.n()) {
                                    }
                                    if (c0826c0.n()) {
                                    }
                                    n6 = c0826c0.n();
                                    if (n6) {
                                    }
                                    n7 = c0826c0.n();
                                    if (n7) {
                                    }
                                    if (!n6) {
                                    }
                                    c0826c0.i();
                                    c0826c0.i();
                                    if (c0826c0.n()) {
                                    }
                                    i11 = i15;
                                    i12 = i24;
                                    i13 = i10;
                                    f5 = f6;
                                    i14 = i16;
                                } else {
                                    AbstractC0467k.y(b7, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                                }
                            }
                            f6 = 1.0f;
                            if (c0826c0.n()) {
                            }
                            if (c0826c0.n()) {
                            }
                            i16 = i15;
                            if (c0826c0.n()) {
                            }
                            if (c0826c0.n()) {
                            }
                            n6 = c0826c0.n();
                            if (n6) {
                            }
                            n7 = c0826c0.n();
                            if (n7) {
                            }
                            if (!n6) {
                            }
                            c0826c0.i();
                            c0826c0.i();
                            if (c0826c0.n()) {
                            }
                            i11 = i15;
                            i12 = i24;
                            i13 = i10;
                            f5 = f6;
                            i14 = i16;
                        } else {
                            i11 = -1;
                            i12 = -1;
                            i13 = i10;
                            i14 = -1;
                            f5 = 1.0f;
                        }
                        return new C0996fs(b3, b5, b6, o8, i23, i22, f5, i8, o6, i11, i12, i14, i13);
                    }
                }
                if ((b5 & 16) == 0) {
                    b3 = i9;
                    i10 = 0;
                } else {
                    i10 = i7;
                    b3 = i9;
                }
                int i242 = -1;
                if (c0826c0.n()) {
                }
                return new C0996fs(b3, b5, b6, o8, i23, i22, f5, i8, o6, i11, i12, i14, i13);
            }
            b3 = 138;
        }
        o5 = c0826c0.o();
        if (o5 == 3) {
            c0826c0.n();
            i6 = 3;
        } else {
            i6 = o5;
        }
        i7 = 16;
        int o16 = c0826c0.o();
        o6 = c0826c0.o();
        c0826c0.i();
        if (c0826c0.n()) {
            int i28 = i6 != 3 ? 8 : 12;
            int i29 = 0;
            while (i29 < i28) {
                if (c0826c0.n()) {
                    int i30 = i29 < 6 ? 16 : 64;
                    int i31 = 8;
                    int i32 = 8;
                    for (int i33 = 0; i33 < i30; i33++) {
                        if (i31 != 0) {
                            i31 = ((c0826c0.c() + i32) + 256) % 256;
                        }
                        if (i31 != 0) {
                            i32 = i31;
                        }
                    }
                }
                i29++;
            }
        }
        i8 = o16;
        c0826c0.o();
        o7 = c0826c0.o();
        if (o7 != 0) {
        }
        c0826c0.o();
        c0826c0.i();
        int o102 = c0826c0.o() + 1;
        int o112 = c0826c0.o() + 1;
        n5 = c0826c0.n();
        int i192 = 2 - (n5 ? 1 : 0);
        if (!n5) {
        }
        c0826c0.i();
        int i202 = o102 * 16;
        int i212 = o112 * i192 * 16;
        if (c0826c0.n()) {
        }
        int i222 = i212;
        int i232 = i202;
        if (b3 != 44) {
        }
        i9 = b3;
        if ((b5 & 16) == 0) {
        }
        int i2422 = -1;
        if (c0826c0.n()) {
        }
        return new C0996fs(b3, b5, b6, o8, i232, i222, f5, i8, o6, i11, i12, i14, i13);
    }

    public static ByteBuffer Z(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(AbstractC2107A.q("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return U(i, byteBuffer);
        }
        throw new IOException(L1.a.k(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void a0(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static int b(int i) {
        int i5 = 0;
        while (i > 0) {
            i >>>= 1;
            i5++;
        }
        return i5;
    }

    public static Cursor b0(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static int c(SQLiteDatabase sQLiteDatabase, int i) {
        int i5 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor b02 = b0(sQLiteDatabase, i);
        if (b02.getCount() > 0) {
            b02.moveToNext();
            i5 = b02.getInt(b02.getColumnIndexOrThrow("value"));
        }
        b02.close();
        return i5;
    }

    public static String c0(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                AbstractC0952et.q("initialCapacity", 4);
                Object[] objArr = new Object[4];
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i5 >= length2) {
                        break;
                    }
                    int e3 = e(bArr, i5, length2, zArr);
                    if (e3 != length2) {
                        Integer valueOf = Integer.valueOf(e3);
                        int length3 = objArr.length;
                        int i7 = i6 + 1;
                        int d5 = AbstractC0776av.d(length3, i7);
                        if (d5 > length3) {
                            objArr = Arrays.copyOf(objArr, d5);
                        }
                        objArr[i6] = valueOf;
                        i6 = i7;
                    }
                    i5 = e3 + 3;
                }
                C1761wv k5 = AbstractC1044gv.k(i6, objArr);
                for (int i8 = 0; i8 < k5.f16186n; i8++) {
                    if (((Integer) k5.get(i8)).intValue() + 3 < length) {
                        C0826c0 c0826c0 = new C0826c0(bArr, ((Integer) k5.get(i8)).intValue() + 3, length);
                        E.H0 m02 = m0(c0826c0);
                        if (m02.f1041a == 33 && m02.f1042b == 0) {
                            c0826c0.k(4);
                            int b3 = c0826c0.b(3);
                            c0826c0.i();
                            C1442pq o02 = o0(c0826c0, true, b3, null);
                            return AbstractC1120ii.c(o02.f15053a, o02.f15054b, o02.f15055c, o02.f15056d, o02.f15057e, o02.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int d(String str) {
        byte[] bytes;
        int i;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = length & (-4);
            if (i5 >= i) {
                break;
            }
            int i7 = ((bytes[i5] & 255) | ((bytes[i5 + 1] & 255) << 8) | ((bytes[i5 + 2] & 255) << 16) | (bytes[i5 + 3] << 24)) * (-862048943);
            int i8 = i6 ^ (((i7 >>> 17) | (i7 << 15)) * 461845907);
            i6 = (((i8 >>> 19) | (i8 << 13)) * 5) - 430675100;
            i5 += 4;
        }
        int i9 = length & 3;
        if (i9 != 1) {
            if (i9 != 2) {
                r1 = i9 == 3 ? (bytes[i + 2] & 255) << 16 : 0;
                int i10 = i6 ^ length;
                int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
                int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
                return i12 ^ (i12 >>> 16);
            }
            r1 |= (bytes[i + 1] & 255) << 8;
        }
        int i13 = ((bytes[i] & 255) | r1) * (-862048943);
        i6 ^= ((i13 >>> 17) | (i13 << 15)) * 461845907;
        int i102 = i6 ^ length;
        int i112 = (i102 ^ (i102 >>> 16)) * (-2048144789);
        int i122 = (i112 ^ (i112 >>> 13)) * (-1028477387);
        return i122 ^ (i122 >>> 16);
    }

    public static void d0(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static int e(byte[] bArr, int i, int i5, boolean[] zArr) {
        int i6 = i5 - i;
        a0(i6 >= 0);
        if (i6 == 0) {
            return i5;
        }
        if (zArr[0]) {
            f0(zArr);
            return i - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i] == 1) {
            f0(zArr);
            return i - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            f0(zArr);
            return i - 1;
        }
        int i7 = i5 - 1;
        int i8 = i + 2;
        while (i8 < i7) {
            byte b3 = bArr[i8];
            if ((b3 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b3 == 1) {
                    f0(zArr);
                    return i9;
                }
                i8 = i9;
            }
            i8 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i5 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i5 + (-3)] == 0 && bArr[i5 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i5 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i5;
    }

    public static void e0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static long f(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e3) {
            if ("0".equals(str) || "-1".equals(str)) {
                F3.c("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", F3.d("Unable to parse dateStr: %s, falling back to 0", str), e3);
            return 0L;
        }
    }

    public static void f0(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static Q2.a1 g(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Mq mq = (Mq) it.next();
            if (mq.f10725c) {
                arrayList.add(J2.i.f2712j);
            } else {
                arrayList.add(new J2.i(mq.f10723a, mq.f10724b));
            }
        }
        return new Q2.a1(context, (J2.i[]) arrayList.toArray(new J2.i[arrayList.size()]));
    }

    public static void g0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static Uri h(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static boolean h0(byte b3) {
        if (((b3 & 96) >> 5) != 0) {
            return true;
        }
        int i = b3 & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    public static Bundle i(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static byte[] i0(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(L1.a.k(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static Jr j(Context context, int i) {
        boolean booleanValue;
        if (Nr.a()) {
            int i5 = i - 2;
            if (i5 != 20 && i5 != 21) {
                switch (i5) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) AbstractC0834c8.f12977c.s()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) AbstractC0834c8.f12978d.s()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) AbstractC0834c8.f12976b.s()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) AbstractC0834c8.f12979e.s()).booleanValue();
            }
            if (booleanValue) {
                return new Kr(context, i);
            }
        }
        return new Xr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r12 = J(r6);
        r13 = J(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r12 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r13 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] j0(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer Z4 = Z(byteBuffer);
        ByteBuffer Z5 = Z(byteBuffer);
        byte[] i02 = i0(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i5 = 0;
        while (Z5.hasRemaining()) {
            i5++;
            try {
                ByteBuffer Z6 = Z(Z5);
                if (Z6.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i6 = Z6.getInt();
                arrayList.add(Integer.valueOf(i6));
                if (i6 != 513 && i6 != 514 && i6 != 769) {
                    switch (i6) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = i0(Z6);
                i = i6;
            } catch (IOException e3) {
                e = e3;
                throw new SecurityException(AbstractC2107A.q("Failed to parse signature record #", i5), e);
            } catch (BufferUnderflowException e5) {
                e = e5;
                throw new SecurityException(AbstractC2107A.q("Failed to parse signature record #", i5), e);
            }
        }
        if (i == -1) {
            if (i5 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i02));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(Z4);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            Z4.clear();
            ByteBuffer Z7 = Z(Z4);
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            while (Z7.hasRemaining()) {
                i7++;
                try {
                    ByteBuffer Z8 = Z(Z7);
                    if (Z8.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i8 = Z8.getInt();
                    arrayList2.add(Integer.valueOf(i8));
                    if (i8 == i) {
                        bArr = i0(Z8);
                    }
                } catch (IOException e6) {
                    e = e6;
                    throw new IOException(AbstractC2107A.q("Failed to parse digest record #", i7), e);
                } catch (BufferUnderflowException e7) {
                    e = e7;
                    throw new IOException(AbstractC2107A.q("Failed to parse digest record #", i7), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int J = J(i);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(J), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(Q(J).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer Z9 = Z(Z4);
            ArrayList arrayList3 = new ArrayList();
            int i9 = 0;
            while (Z9.hasRemaining()) {
                i9++;
                byte[] i03 = i0(Z9);
                try {
                    arrayList3.add(new C1366o3((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(i03)), i03));
                } catch (CertificateException e8) {
                    throw new SecurityException(AbstractC2107A.q("Failed to decode certificate #", i9), e8);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(i02, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e9) {
            e = e9;
            throw new SecurityException(L1.a.n("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e10) {
            e = e10;
            throw new SecurityException(L1.a.n("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new SecurityException(L1.a.n("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e12) {
            e = e12;
            throw new SecurityException(L1.a.n("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e13) {
            e = e13;
            throw new SecurityException(L1.a.n("Failed to verify ", str2, " signature"), e);
        }
    }

    public static Object k(InterfaceC1805xu interfaceC1805xu) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC1805xu.mo12a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static final void k0(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        }
    }

    public static String l(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static byte[][] l0(int[] iArr, InterfaceC1231l3[] interfaceC1231l3Arr) {
        long j5;
        int i;
        int length;
        char c5;
        int i5 = 0;
        long j6 = 0;
        while (true) {
            j5 = 1048576;
            if (i5 >= 3) {
                break;
            }
            j6 += (interfaceC1231l3Arr[i5].a() + 1048575) / 1048576;
            i5++;
        }
        if (j6 >= 2097151) {
            throw new DigestException(AbstractC2107A.r("Too many chunks: ", j6));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i6 = 0;
        while (true) {
            length = iArr.length;
            c5 = 5;
            if (i6 >= length) {
                break;
            }
            int i7 = (int) j6;
            byte[] bArr2 = new byte[(u(iArr[i6]) * i7) + 5];
            bArr2[0] = 90;
            d0(i7, bArr2);
            bArr[i6] = bArr2;
            i6++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            String Q5 = Q(iArr[i8]);
            try {
                messageDigestArr[i8] = MessageDigest.getInstance(Q5);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(Q5.concat(" digest not supported"), e3);
            }
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (i = 3; i9 < i; i = 3) {
            InterfaceC1231l3 interfaceC1231l3 = interfaceC1231l3Arr[i9];
            int i12 = i9;
            long a5 = interfaceC1231l3.a();
            long j7 = 0;
            while (a5 > 0) {
                char c6 = c5;
                int i13 = i10;
                int min = (int) Math.min(a5, j5);
                d0(min, bArr3);
                for (int i14 = 0; i14 < length; i14++) {
                    messageDigestArr[i14].update(bArr3);
                }
                try {
                    interfaceC1231l3.c(messageDigestArr, j7, min);
                    int i15 = 0;
                    while (i15 < iArr.length) {
                        int i16 = iArr[i15];
                        byte[] bArr4 = bArr[i15];
                        int u5 = u(i16);
                        InterfaceC1231l3 interfaceC1231l32 = interfaceC1231l3;
                        MessageDigest messageDigest = messageDigestArr[i15];
                        long j8 = a5;
                        int digest = messageDigest.digest(bArr4, (i13 * u5) + 5, u5);
                        if (digest != u5) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i15++;
                        interfaceC1231l3 = interfaceC1231l32;
                        a5 = j8;
                    }
                    InterfaceC1231l3 interfaceC1231l33 = interfaceC1231l3;
                    long j9 = min;
                    j7 += j9;
                    i10 = i13 + 1;
                    a5 -= j9;
                    c5 = c6;
                    interfaceC1231l3 = interfaceC1231l33;
                    j5 = 1048576;
                } catch (IOException e5) {
                    throw new DigestException(L1.a.k(i13, i11, "Failed to digest chunk #", " of section #"), e5);
                }
            }
            i11++;
            i9 = i12 + 1;
            j5 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            byte[] bArr6 = bArr[i17];
            String Q6 = Q(i18);
            try {
                bArr5[i17] = MessageDigest.getInstance(Q6).digest(bArr6);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(Q6.concat(" digest not supported"), e6);
            }
        }
        return bArr5;
    }

    public static String m(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (H(optJSONArray2, str) && !H(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static E.H0 m0(C0826c0 c0826c0) {
        c0826c0.i();
        int b3 = c0826c0.b(6);
        int b5 = c0826c0.b(6);
        c0826c0.b(3);
        return new E.H0(b3, b5);
    }

    public static void n(int i, int i5) {
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static X509Certificate[][] n0(FileChannel fileChannel, C1276m3 c1276m3) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer Z4 = Z((ByteBuffer) c1276m3.f14468d);
                int i = 0;
                while (Z4.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(j0(Z(Z4), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e3) {
                        throw new SecurityException(L1.a.l(i, "Failed to parse/verify signer #", " block"), e3);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                long j5 = c1276m3.f14465a;
                T2.z zVar = new T2.z(fileChannel, 0L, j5);
                long j6 = c1276m3.f14467c;
                long j7 = c1276m3.f14466b;
                T2.z zVar2 = new T2.z(fileChannel, j7, j6 - j7);
                ByteBuffer duplicate = ((ByteBuffer) c1276m3.f14469e).duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                AbstractC1803xs.e0(duplicate);
                int position = duplicate.position() + 16;
                if (j5 < 0 || j5 > 4294967295L) {
                    throw new IllegalArgumentException(AbstractC2107A.r("uint32 value of out range: ", j5));
                }
                duplicate.putInt(duplicate.position() + position, (int) j5);
                Qt qt = new Qt(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    iArr[i5] = ((Integer) it.next()).intValue();
                    i5++;
                }
                try {
                    byte[][] l02 = l0(iArr, new InterfaceC1231l3[]{zVar, zVar2, qt});
                    for (int i6 = 0; i6 < size; i6++) {
                        int i7 = iArr[i6];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i7)), l02[i6])) {
                            throw new SecurityException(Q(i7).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e5) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e5);
                }
            } catch (IOException e6) {
                throw new SecurityException("Failed to read list of signers", e6);
            }
        } catch (CertificateException e7) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e7);
        }
    }

    public static void o(Context context, boolean z3) {
        if (z3) {
            U2.j.h("This request is sent from a test device.");
            return;
        }
        U2.e eVar = C0379q.f.f5048a;
        U2.j.h("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + U2.e.m(context) + "\")) to get test ads on this device.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1442pq o0(C0826c0 c0826c0, boolean z3, int i, C1442pq c1442pq) {
        int[] iArr;
        int i5;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int[] iArr2 = new int[6];
        if (z3) {
            int b3 = c0826c0.b(2);
            z6 = c0826c0.n();
            i8 = c0826c0.b(5);
            i9 = 0;
            for (int i10 = 0; i10 < 32; i10++) {
                if (c0826c0.n()) {
                    i9 |= 1 << i10;
                }
            }
            for (int i11 = 0; i11 < 6; i11++) {
                iArr2[i11] = c0826c0.b(8);
            }
            i5 = b3;
        } else {
            if (c1442pq == null) {
                iArr = iArr2;
                i5 = 0;
                z5 = false;
                i6 = 0;
                i7 = 0;
                int b5 = c0826c0.b(8);
                int i12 = 0;
                for (int i13 = 0; i13 < i; i13++) {
                    if (c0826c0.n()) {
                        i12 += 88;
                    }
                    if (c0826c0.n()) {
                        i12 += 8;
                    }
                }
                c0826c0.k(i12);
                if (i > 0) {
                    int i14 = 8 - i;
                    c0826c0.k(i14 + i14);
                }
                return new C1442pq(i5, z5, i6, i7, iArr, b5);
            }
            int i15 = c1442pq.f15053a;
            z6 = c1442pq.f15054b;
            i8 = c1442pq.f15055c;
            i9 = c1442pq.f15056d;
            iArr2 = c1442pq.f15057e;
            i5 = i15;
        }
        iArr = iArr2;
        z5 = z6;
        i6 = i8;
        i7 = i9;
        int b52 = c0826c0.b(8);
        int i122 = 0;
        while (i13 < i) {
        }
        c0826c0.k(i122);
        if (i > 0) {
        }
        return new C1442pq(i5, z5, i6, i7, iArr, b52);
    }

    public static void p(M1 m12, Q1 q12) {
        for (int i = 0; i < m12.a(); i++) {
            long z3 = m12.z(i);
            ArrayList f5 = m12.f(z3);
            if (!f5.isEmpty()) {
                if (i == m12.a() - 1) {
                    throw new IllegalStateException();
                }
                long z5 = m12.z(i + 1) - m12.z(i);
                if (z5 > 0) {
                    q12.mo11k(new L1(f5, z3, z5));
                }
            }
        }
    }

    public static void p0(C0826c0 c0826c0) {
        int o5 = c0826c0.o() + 1;
        c0826c0.k(8);
        for (int i = 0; i < o5; i++) {
            c0826c0.o();
            c0826c0.o();
            c0826c0.i();
        }
        c0826c0.k(20);
    }

    public static void q(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void r(InterfaceC2360a interfaceC2360a, Throwable th, String str) {
        C0802bc.a((Context) BinderC2361b.t1(interfaceC2360a)).c(th, str, ((Double) AbstractC1461q8.f15110g.s()).floatValue());
    }

    public static X509Certificate[][] s(String str) {
        Pair Y4;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                Y4 = null;
            } else {
                Y4 = AbstractC1803xs.Y(randomAccessFile, 0);
                if (Y4 == null) {
                    Y4 = AbstractC1803xs.Y(randomAccessFile, 65535);
                }
            }
            if (Y4 == null) {
                throw new C1321n3("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) Y4.first;
            long longValue = ((Long) Y4.second).longValue();
            long j5 = longValue - 20;
            if (j5 >= 0) {
                randomAccessFile.seek(j5);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new C1321n3("ZIP64 APK not supported");
                }
            }
            AbstractC1803xs.e0(byteBuffer);
            long j6 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j6 >= longValue) {
                throw new C1321n3("ZIP Central Directory offset out of range: " + j6 + ". ZIP End of Central Directory offset: " + longValue);
            }
            AbstractC1803xs.e0(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j6 != longValue) {
                throw new C1321n3("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j6 < 32) {
                throw new C1321n3("APK too small for APK Signing Block. ZIP Central Directory offset: " + j6);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j6 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new C1321n3("No APK Signing Block before ZIP Central Directory");
            }
            long j7 = allocate.getLong(0);
            if (j7 < allocate.capacity() || j7 > 2147483639) {
                throw new C1321n3("APK Signing Block size out of range: " + j7);
            }
            int i = (int) (j7 + 8);
            long j8 = j6 - i;
            if (j8 < 0) {
                throw new C1321n3("APK Signing Block offset out of range: " + j8);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j8);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j9 = allocate2.getLong(0);
            if (j9 != j7) {
                throw new C1321n3("APK Signing Block sizes in header and footer do not match: " + j9 + " vs " + j7);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j8));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i5 = 0;
                while (slice.hasRemaining()) {
                    i5++;
                    if (slice.remaining() < 8) {
                        throw new C1321n3("Insufficient data to read size of APK Signing Block entry #" + i5);
                    }
                    long j10 = slice.getLong();
                    if (j10 < 4 || j10 > 2147483647L) {
                        throw new C1321n3("APK Signing Block entry #" + i5 + " size out of range: " + j10);
                    }
                    int i6 = (int) j10;
                    int position2 = slice.position() + i6;
                    if (i6 > slice.remaining()) {
                        throw new C1321n3("APK Signing Block entry #" + i5 + " size out of range: " + i6 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] n02 = n0(randomAccessFile.getChannel(), new C1276m3(U(i6 - 4, slice), longValue2, j6, longValue, byteBuffer));
                        randomAccessFile.close();
                        return n02;
                    }
                    long j11 = j6;
                    long j12 = longValue2;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    long j13 = longValue;
                    slice.position(position2);
                    j6 = j11;
                    longValue2 = j12;
                    longValue = j13;
                    byteBuffer = byteBuffer3;
                }
                throw new C1321n3("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int t(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int u(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(AbstractC2107A.q("Unknown content digest algorthm: ", i));
    }

    public static int v(int i, byte[] bArr) {
        int i5;
        synchronized (f15918c) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i) {
                while (true) {
                    try {
                        if (i6 >= i - 2) {
                            i6 = i;
                            break;
                        }
                        int i8 = i6 + 1;
                        if (bArr[i6] == 0 && bArr[i8] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6 = i8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i) {
                    int[] iArr = f15919d;
                    int length = iArr.length;
                    if (length <= i7) {
                        f15919d = Arrays.copyOf(iArr, length + length);
                    }
                    f15919d[i7] = i6;
                    i6 += 3;
                    i7++;
                }
            }
            i5 = i - i7;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = f15919d[i11] - i9;
                System.arraycopy(bArr, i9, bArr, i10, i12);
                int i13 = i10 + i12;
                int i14 = i13 + 1;
                bArr[i13] = 0;
                i10 = i13 + 2;
                bArr[i14] = 0;
                i9 += i12 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i10, i5 - i10);
        }
        return i5;
    }

    public static long w(C1617tm c1617tm, int i, int i5) {
        c1617tm.j(i);
        if (c1617tm.o() < 5) {
            return -9223372036854775807L;
        }
        int q5 = c1617tm.q();
        if ((8388608 & q5) != 0 || ((q5 >> 8) & 8191) != i5 || (q5 & 32) == 0 || c1617tm.v() < 7 || c1617tm.o() < 7 || (c1617tm.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c1617tm.f(bArr, 0, 6);
        long j5 = bArr[0];
        long j6 = bArr[1];
        long j7 = bArr[2];
        long j8 = bArr[3] & 255;
        return ((j5 & 255) << 25) | ((j6 & 255) << 17) | ((j7 & 255) << 9) | (j8 + j8) | ((bArr[4] & 255) >> 7);
    }

    public static long x(String str) {
        int i = AbstractC1260lo.f14419a;
        String[] split = str.split("\\.", 2);
        long j5 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j5 = (j5 * 60) + Long.parseLong(str2);
        }
        long j6 = j5 * 1000;
        if (split.length == 2) {
            j6 += Long.parseLong(split[1]);
        }
        return j6 * 1000;
    }

    public static final Intent y(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static C1456q3 z(C1815y3 c1815y3) {
        long j5;
        boolean z3;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = c1815y3.f16388c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long f5 = str != null ? f(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z3 = false;
            j6 = 0;
            j7 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j7 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j6 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z3 = true;
                }
                i++;
            }
            j5 = 0;
            i = 1;
        } else {
            j5 = 0;
            z3 = false;
            j6 = 0;
            j7 = 0;
        }
        String str3 = (String) map.get("Expires");
        long f6 = str3 != null ? f(str3) : j5;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j8 = currentTimeMillis;
            j9 = f(str4);
        } else {
            j8 = currentTimeMillis;
            j9 = j5;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j12 = (j7 * 1000) + j8;
            if (z3) {
                j11 = j12;
            } else {
                Long.signum(j6);
                j11 = (j6 * 1000) + j12;
            }
            j10 = j12;
        } else {
            j10 = (f5 <= j5 || f6 < f5) ? j5 : (f6 - f5) + j8;
            j11 = j10;
        }
        C1456q3 c1456q3 = new C1456q3();
        c1456q3.f15087a = c1815y3.f16387b;
        c1456q3.f15088b = str5;
        c1456q3.f = j10;
        c1456q3.f15091e = j11;
        c1456q3.f15089c = f5;
        c1456q3.f15090d = j9;
        c1456q3.f15092g = map;
        c1456q3.f15093h = c1815y3.f16389d;
        return c1456q3;
    }
}
