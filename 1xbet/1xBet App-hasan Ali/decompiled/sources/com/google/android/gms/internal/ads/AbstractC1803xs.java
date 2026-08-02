package com.google.android.gms.internal.ads;

import B.C0072a;
import Q2.C0375o;
import Q2.C0387u0;
import T2.C0437o;
import a3.AbstractC0467k;
import android.app.UiModeManager;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import n.AbstractC2107A;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1803xs {

    /* renamed from: b, reason: collision with root package name */
    public static final H2.j f16343b = new H2.j(5);

    /* renamed from: c, reason: collision with root package name */
    public static final Ax f16344c = new Ax(7);

    /* renamed from: d, reason: collision with root package name */
    public static final C0824bz f16345d = new C0824bz(C0957ey.class, InterfaceC0911dx.class, new Aq(24, 0));

    /* renamed from: e, reason: collision with root package name */
    public static UiModeManager f16346e = null;
    public static int f = 2;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16347a = 11;

    public static int A(C0826c0 c0826c0, int i, int i5, int i6) {
        AbstractC1668us.S(Math.max(Math.max(i, i5), i6) <= 31);
        int i7 = (1 << i) - 1;
        int i8 = (1 << i5) - 1;
        AbstractC0952et.b(AbstractC0952et.b(i7, i8), 1 << i6);
        if (c0826c0.a() >= i) {
            int f5 = c0826c0.f(i);
            if (f5 == i7) {
                if (c0826c0.a() >= i5) {
                    int f6 = c0826c0.f(i5);
                    f5 += f6;
                    if (f6 == i8) {
                        if (c0826c0.a() >= i6) {
                            return c0826c0.f(i6) + f5;
                        }
                    }
                }
            }
            return f5;
        }
        return -1;
    }

    public static C0387u0 B(int i, C0387u0 c0387u0) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) Q2.r.f5053d.f5056c.a(F7.R7)).intValue() > 0) {
                return c0387u0;
            }
            i = 8;
        }
        return I(i, null, c0387u0);
    }

    public static K0 C(int i, String str, C1617tm c1617tm, boolean z3, boolean z5) {
        int r5 = r(c1617tm);
        if (z5) {
            r5 = Math.min(1, r5);
        }
        if (r5 >= 0) {
            return z3 ? new P0(str, null, AbstractC1044gv.n(Integer.toString(r5))) : new H0("und", str, Integer.toString(r5));
        }
        JB.l("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC1665up.b(i)));
        return null;
    }

    public static void D(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void E(ArrayList arrayList, G3 g32) {
        String str = (String) g32.s();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static boolean F(B b3) {
        C1617tm c1617tm = new C1617tm(8);
        int i = C1141j3.a(b3, c1617tm).f14059a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        b3.G(c1617tm.f15724a, 0, 4, false);
        c1617tm.j(0);
        int q5 = c1617tm.q();
        if (q5 == 1463899717) {
            return true;
        }
        JB.f("WavHeaderReader", "Unsupported form type: " + q5);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r3 != r25.f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if ((r24.v() * 1000) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (r5 == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean G(C1617tm c1617tm, K k5, int i, C0072a c0072a) {
        int i5 = c1617tm.f15725b;
        long D5 = c1617tm.D();
        long j5 = D5 >>> 16;
        if (j5 == i) {
            boolean z3 = (j5 & 1) == 1;
            long j6 = D5 >> 12;
            long j7 = D5 >> 8;
            long j8 = D5 >> 4;
            long j9 = D5 >> 1;
            long j10 = D5 & 1;
            int i6 = (int) (j8 & 15);
            if (i6 > 7 ? !(i6 > 10 || k5.f10094g != 2) : i6 == k5.f10094g - 1) {
                int i7 = (int) (j9 & 7);
                if ((i7 == 0 || i7 == k5.i) && j10 != 1) {
                    try {
                        long F5 = c1617tm.F();
                        if (!z3) {
                            F5 *= k5.f10090b;
                        }
                        c0072a.f658a = F5;
                        int b3 = b((int) (j6 & 15), c1617tm);
                        if (b3 != -1 && b3 <= k5.f10090b) {
                            int i8 = (int) (j7 & 15);
                            if (i8 != 0) {
                                if (i8 > 11) {
                                    int i9 = k5.f10093e;
                                    if (i8 != 12) {
                                        if (i8 <= 14) {
                                            int z5 = c1617tm.z();
                                            if (i8 == 14) {
                                                z5 *= 10;
                                            }
                                        }
                                    }
                                }
                            }
                            int v4 = c1617tm.v();
                            int i10 = c1617tm.f15725b;
                            byte[] bArr = c1617tm.f15724a;
                            int i11 = i10 - 1;
                            int i12 = AbstractC1260lo.f14419a;
                            int i13 = 0;
                            for (int i14 = i5; i14 < i11; i14++) {
                                i13 = AbstractC1260lo.f14429m[i13 ^ (bArr[i14] & 255)];
                            }
                            if (v4 == i13) {
                                return true;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    public static boolean H(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C0387u0 I(int i, String str, C0387u0 c0387u0) {
        String str2;
        int i5 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i5) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) Q2.r.f5053d.f5056c.a(F7.U7)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i == 0) {
            throw null;
        }
        int i6 = 0;
        int i7 = 2;
        switch (i5) {
            case 0:
            case 11:
            case 15:
                i7 = i6;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i7 = 1;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 2:
            case 10:
            case 18:
                i7 = 3;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 3:
                i6 = 8;
                i7 = i6;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 4:
            case 8:
            case 17:
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 7:
                i6 = 4;
                i7 = i6;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 12:
                if (((Integer) Q2.r.f5053d.f5056c.a(F7.U7)).intValue() <= 0) {
                    i6 = 9;
                    i7 = i6;
                    return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
                }
                i7 = 3;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 13:
                i6 = 10;
                i7 = i6;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            case 14:
                i6 = 11;
                i7 = i6;
                return new C0387u0(i7, str3, "com.google.android.gms.ads", c0387u0, null);
            default:
                switch (i) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static P0 J(int i, String str, C1617tm c1617tm) {
        int q5 = c1617tm.q();
        if (c1617tm.q() == 1684108385 && q5 >= 22) {
            c1617tm.k(10);
            int z3 = c1617tm.z();
            if (z3 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(z3);
                String sb2 = sb.toString();
                int z5 = c1617tm.z();
                if (z5 > 0) {
                    sb2 = sb2 + "/" + z5;
                }
                return new P0(str, null, AbstractC1044gv.n(sb2));
            }
        }
        JB.l("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC1665up.b(i)));
        return null;
    }

    public static C1141j3 K(int i, B b3, C1617tm c1617tm) {
        C1141j3 a5 = C1141j3.a(b3, c1617tm);
        while (true) {
            int i5 = a5.f14059a;
            if (i5 == i) {
                return a5;
            }
            AbstractC0467k.y(i5, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j5 = a5.f14060b;
            long j6 = 8 + j5;
            if ((1 & j5) != 0) {
                j6 = 9 + j5;
            }
            if (j6 > 2147483647L) {
                throw B7.b("Chunk is too large (~2GB+) to skip; id: " + i5);
            }
            b3.k((int) j6);
            a5 = C1141j3.a(b3, c1617tm);
        }
    }

    public static void L(int i, long j5, String str, int i5, PriorityQueue priorityQueue) {
        X5 x5 = new X5(i5, j5, str);
        if ((priorityQueue.size() != i || (((X5) priorityQueue.peek()).f12152c <= i5 && ((X5) priorityQueue.peek()).f12150a <= j5)) && !priorityQueue.contains(x5)) {
            priorityQueue.add(x5);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void M(E3.a aVar, Jr jr) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            Hw r5 = Hw.r(aVar);
            Qt qt = new Qt(29, jr);
            r5.a(new Kw(0, r5, qt), AbstractC0613Id.f9544g);
        }
    }

    public static void N(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void O(C0826c0 c0826c0) {
        c0826c0.u(3);
        c0826c0.u(8);
        boolean w5 = c0826c0.w();
        boolean w6 = c0826c0.w();
        if (w5) {
            c0826c0.u(5);
        }
        if (w6) {
            c0826c0.u(6);
        }
    }

    public static long P(int i, String[] strArr) {
        long d5 = (AbstractC1668us.d(strArr[0]) + 2147483647L) % 1073807359;
        for (int i5 = 1; i5 < i; i5++) {
            d5 = (((AbstractC1668us.d(strArr[i5]) + 2147483647L) % 1073807359) + ((d5 * 16785407) % 1073807359)) % 1073807359;
        }
        return d5;
    }

    public static long Q(ByteBuffer byteBuffer) {
        long j5 = byteBuffer.getInt();
        return j5 < 0 ? j5 + 4294967296L : j5;
    }

    public static TextView R(Context context, String str, int i, int i5, float f5, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        a0(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f5, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i5);
        textView.setText(str);
        return textView;
    }

    public static P0 S(int i, String str, C1617tm c1617tm) {
        int q5 = c1617tm.q();
        if (c1617tm.q() == 1684108385) {
            c1617tm.k(8);
            return new P0(str, null, AbstractC1044gv.n(c1617tm.a(q5 - 16)));
        }
        JB.l("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC1665up.b(i)));
        return null;
    }

    public static ArrayList T(byte[] bArr) {
        long j5 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j5 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void U(Bundle bundle, String str, int i, boolean z3) {
        if (z3) {
            bundle.putInt(str, i);
        }
    }

    public static void V(C0826c0 c0826c0) {
        int f5;
        int f6 = c0826c0.f(2);
        if (f6 == 0) {
            c0826c0.u(6);
            return;
        }
        int A3 = A(c0826c0, 5, 8, 16) + 1;
        if (f6 == 1) {
            c0826c0.u(A3 * 7);
            return;
        }
        if (f6 == 2) {
            boolean w5 = c0826c0.w();
            int i = true != w5 ? 5 : 1;
            int i5 = true == w5 ? 7 : 5;
            int i6 = true == w5 ? 8 : 6;
            int i7 = 0;
            while (i7 < A3) {
                if (c0826c0.w()) {
                    c0826c0.u(7);
                    f5 = 0;
                } else {
                    if (c0826c0.f(2) == 3 && c0826c0.f(i5) * i != 0) {
                        c0826c0.t();
                    }
                    f5 = c0826c0.f(i6) * i;
                    if (f5 != 0 && f5 != 180) {
                        c0826c0.t();
                    }
                    c0826c0.t();
                }
                if (f5 != 0 && f5 != 180 && c0826c0.w()) {
                    i7++;
                }
                i7++;
            }
        }
    }

    public static int W(Wq wq) {
        int S4 = G4.d.S(wq) - 1;
        return (S4 == 0 || S4 == 1) ? 7 : 23;
    }

    public static long X(ByteBuffer byteBuffer) {
        long Q5 = Q(byteBuffer) << 32;
        if (Q5 >= 0) {
            return Q(byteBuffer) + Q5;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static Pair Y(RandomAccessFile randomAccessFile, int i) {
        int i5;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        e0(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i6 = capacity2 - 22;
            int min = Math.min(i6, 65535);
            for (int i7 = 0; i7 < min; i7++) {
                i5 = i6 - i7;
                if (allocate.getInt(i5) == 101010256 && ((char) allocate.getShort(i5 + 20)) == i7) {
                    break;
                }
            }
        }
        i5 = -1;
        if (i5 == -1) {
            return null;
        }
        allocate.position(i5);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i5));
    }

    public static void Z(Bundle bundle, String str, String str2, boolean z3) {
        if (!z3 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static double a(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static void a0(View view, int i, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i5;
        view.setLayoutParams(layoutParams2);
    }

    public static int b(int i, C1617tm c1617tm) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c1617tm.v() + 1;
            case 7:
                return c1617tm.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long b0(byte b3, byte b5) {
        int i;
        int i5 = b3 & 255;
        int i6 = b3 & 3;
        if (i6 != 0) {
            i = 2;
            if (i6 != 1 && i6 != 2) {
                i = b5 & 63;
            }
        } else {
            i = 1;
        }
        int i7 = i5 >> 3;
        return i * (i7 >= 16 ? 2500 << r6 : i7 >= 12 ? 10000 << (i7 & 1) : (i7 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static long c(int i, long j5) {
        if (i == 1) {
            return j5;
        }
        int i5 = i >> 1;
        long j6 = (j5 * j5) % 1073807359;
        return (i & 1) == 0 ? c(i5, j6) % 1073807359 : ((c(i5, j6) % 1073807359) * j5) % 1073807359;
    }

    public static void c0(E3.a aVar, Mr mr, Jr jr, boolean z3) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            Hw r5 = Hw.r(aVar);
            D3.l lVar = new D3.l(mr, jr, z3);
            r5.a(new Kw(0, r5, lVar), AbstractC0613Id.f9544g);
        }
    }

    public static C0387u0 d(Throwable th) {
        if (th instanceof C1484qn) {
            C1484qn c1484qn = (C1484qn) th;
            return B(c1484qn.f13035k, c1484qn.f15174l);
        }
        if (th instanceof C0856cm) {
            return th.getMessage() == null ? I(((C0856cm) th).f13035k, null, null) : I(((C0856cm) th).f13035k, th.getMessage(), null);
        }
        if (!(th instanceof C0437o)) {
            return I(1, null, null);
        }
        C0437o c0437o = (C0437o) th;
        int i = c0437o.f5729k;
        String message = c0437o.getMessage();
        if (message == null) {
            message = "";
        }
        return new C0387u0(i, message, "com.google.android.gms.ads", null, null);
    }

    public static void d0(Bundle bundle, String str, boolean z3, boolean z5) {
        if (z5) {
            bundle.putBoolean(str, z3);
        }
    }

    public static Bundle e(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void e0(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static C1365o2 f(C1365o2 c1365o2, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (c1365o2 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (C1365o2) map.get(strArr[0]);
            }
            if (length2 > 1) {
                C1365o2 c1365o22 = new C1365o2();
                while (i < length2) {
                    c1365o22.b((C1365o2) map.get(strArr[i]));
                    i++;
                }
                return c1365o22;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c1365o2.b((C1365o2) map.get(strArr[0]));
                return c1365o2;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    c1365o2.b((C1365o2) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c1365o2;
    }

    public static C1367o4 g(Context context, String str, String str2) {
        C1367o4 c1367o4;
        try {
            c1367o4 = (C1367o4) ((LinkedBlockingQueue) new C0375o(context, str, str2).f5045o).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c1367o4 = null;
        }
        return c1367o4 == null ? C0375o.F() : c1367o4;
    }

    public static String h(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static HashMap i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("xs", "decode object failure");
            return null;
        }
    }

    public static void j(long j5, C1617tm c1617tm, InterfaceC0737a0[] interfaceC0737a0Arr) {
        int i;
        int i5;
        while (true) {
            if (c1617tm.o() <= 1) {
                return;
            }
            int i6 = 0;
            while (true) {
                if (c1617tm.o() == 0) {
                    i = -1;
                    break;
                }
                int v4 = c1617tm.v();
                i6 += v4;
                if (v4 != 255) {
                    i = i6;
                    break;
                }
            }
            int i7 = 0;
            while (true) {
                if (c1617tm.o() == 0) {
                    i7 = -1;
                    break;
                }
                int v5 = c1617tm.v();
                i7 += v5;
                if (v5 != 255) {
                    break;
                }
            }
            int i8 = c1617tm.f15725b + i7;
            if (i7 == -1 || i7 > c1617tm.o()) {
                JB.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i8 = c1617tm.f15726c;
            } else if (i == 4 && i7 >= 8) {
                int v6 = c1617tm.v();
                int z3 = c1617tm.z();
                if (z3 == 49) {
                    i5 = c1617tm.q();
                    z3 = 49;
                } else {
                    i5 = 0;
                }
                int v7 = c1617tm.v();
                if (z3 == 47) {
                    c1617tm.k(1);
                    z3 = 47;
                }
                boolean z5 = v6 == 181 && (z3 == 49 || z3 == 47) && v7 == 3;
                if (z3 == 49) {
                    z5 &= i5 == 1195456820;
                }
                if (z5) {
                    v(j5, c1617tm, interfaceC0737a0Arr);
                }
            }
            c1617tm.j(i8);
        }
    }

    public static void k(E3.a aVar, String str) {
        Ix ix = new Ix(str, 3);
        aVar.a(new Kw(0, aVar, ix), AbstractC0613Id.f9544g);
    }

    public static void l(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void m(L7 l7, I7 i7, String... strArr) {
        if (i7 == null) {
            return;
        }
        P2.o.f4767B.f4776j.getClass();
        l7.c(i7, SystemClock.elapsedRealtime(), strArr);
    }

    public static void n(String str) {
        if (((Boolean) AbstractC1416p8.f14970a.s()).booleanValue()) {
            U2.j.d(str);
        }
    }

    public static void o(String str, boolean z3) {
        if (!z3) {
            throw new Yi(str);
        }
    }

    public static void p(AtomicReference atomicReference, InterfaceC1307mq interfaceC1307mq) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC1307mq.k(obj);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    public static double q(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static int r(C1617tm c1617tm) {
        int q5 = c1617tm.q();
        if (c1617tm.q() == 1684108385) {
            c1617tm.k(8);
            int i = q5 - 16;
            if (i == 1) {
                return c1617tm.v();
            }
            if (i == 2) {
                return c1617tm.z();
            }
            if (i == 3) {
                return c1617tm.x();
            }
            if (i == 4 && (c1617tm.f15724a[c1617tm.f15725b] & 128) == 0) {
                return c1617tm.y();
            }
        }
        JB.l("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static C0387u0 s(Throwable th, C1528rn c1528rn) {
        C0387u0 c0387u0;
        C0387u0 d5 = d(th);
        int i = d5.f5058k;
        if ((i == 3 || i == 0) && (c0387u0 = d5.f5061n) != null && !c0387u0.f5060m.equals("com.google.android.gms.ads")) {
            d5.f5061n = null;
        }
        if (c1528rn != null) {
            d5.f5062o = new Ih(c1528rn.f15379e, "", c1528rn, c1528rn.f15378d, c1528rn.f15377c);
        }
        return d5;
    }

    public static String t(String[] strArr, int i, int i5) {
        int i6 = i5 + i;
        if (strArr.length < i6) {
            U2.j.f("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i7 = i6 - 1;
            if (i >= i7) {
                sb.append(strArr[i7]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void v(long j5, C1617tm c1617tm, InterfaceC0737a0[] interfaceC0737a0Arr) {
        int v4 = c1617tm.v();
        if ((v4 & 64) != 0) {
            int i = v4 & 31;
            c1617tm.k(1);
            int i5 = c1617tm.f15725b;
            for (InterfaceC0737a0 interfaceC0737a0 : interfaceC0737a0Arr) {
                int i6 = i * 3;
                c1617tm.j(i5);
                interfaceC0737a0.c(i6, c1617tm);
                AbstractC1668us.a0(j5 != -9223372036854775807L);
                interfaceC0737a0.d(j5, 1, i6, 0, null);
            }
        }
    }

    public static void w(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC2107A.q("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void x(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i5) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i5, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i5 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i5, 33);
    }

    public static void y(InterfaceC0933ea interfaceC0933ea, JSONObject jSONObject) {
        StringBuilder w5 = AbstractC0467k.w("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        U2.j.d("Dispatching AFMA event: ".concat(w5.toString()));
        interfaceC0933ea.d(w5.toString());
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public String toString() {
        switch (this.f16347a) {
            case 11:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(u());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }

    public abstract HashMap u();
}
