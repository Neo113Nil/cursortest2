package p151v2;

import A1.InterfaceC0025j;
import A1.InterfaceC0027k;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import F1.x;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import p031e1.k;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17090a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f17091b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f17092c = {0, 0, 0, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f17093d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f17094e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int[] f17095f = new int[10];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f17096g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f17097h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f17098i;
    public static long j;

    public static long A(int i7, byte[] bArr) {
        long jZ = z(i7, bArr);
        long jZ2 = z(i7 + 4, bArr);
        if (jZ == 0 && jZ2 == 0) {
            return 0L;
        }
        return ((jZ2 * 1000) / 4294967296L) + ((jZ - 2208988800L) * 1000);
    }

    public static String B(StringBuilder sb, int i7, int i8) {
        int i9;
        int iLastIndexOf;
        if (i7 >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i7) == '/') {
            i7++;
        }
        int i10 = i7;
        int i11 = i10;
        while (i10 <= i8) {
            if (i10 == i8) {
                i9 = i10;
            } else if (sb.charAt(i10) == '/') {
                i9 = i10 + 1;
            } else {
                i10++;
            }
            int i12 = i11 + 1;
            if (i10 == i12 && sb.charAt(i11) == '.') {
                sb.delete(i11, i9);
                i8 -= i9 - i11;
            } else {
                if (i10 == i11 + 2 && sb.charAt(i11) == '.' && sb.charAt(i12) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i11 - 2) + 1;
                    int i13 = iLastIndexOf > i7 ? iLastIndexOf : i7;
                    sb.delete(i13, i9);
                    i8 -= i9 - i13;
                } else {
                    iLastIndexOf = i10 + 1;
                }
                i11 = iLastIndexOf;
            }
            i10 = i11;
        }
        return sb.toString();
    }

    public static String C(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrQ = q(str2);
        if (iArrQ[0] != -1) {
            sb.append(str2);
            B(sb, iArrQ[1], iArrQ[2]);
            return sb.toString();
        }
        int[] iArrQ2 = q(str);
        if (iArrQ[3] == 0) {
            sb.append((CharSequence) str, 0, iArrQ2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrQ[2] == 0) {
            sb.append((CharSequence) str, 0, iArrQ2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i7 = iArrQ[1];
        if (i7 != 0) {
            int i8 = iArrQ2[0] + 1;
            sb.append((CharSequence) str, 0, i8);
            sb.append(str2);
            return B(sb, iArrQ[1] + i8, i8 + iArrQ[2]);
        }
        if (str2.charAt(i7) == '/') {
            sb.append((CharSequence) str, 0, iArrQ2[1]);
            sb.append(str2);
            int i9 = iArrQ2[1];
            return B(sb, i9, iArrQ[2] + i9);
        }
        int i10 = iArrQ2[0] + 2;
        int i11 = iArrQ2[1];
        if (i10 >= i11 || i11 != iArrQ2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrQ2[2] - 1);
            int i12 = iLastIndexOf == -1 ? iArrQ2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i12);
            sb.append(str2);
            return B(sb, iArrQ2[1], i12 + iArrQ[2]);
        }
        sb.append((CharSequence) str, 0, i11);
        sb.append('/');
        sb.append(str2);
        int i13 = iArrQ2[1];
        return B(sb, i13, iArrQ[2] + i13 + 1);
    }

    public static Uri D(String str, String str2) {
        return Uri.parse(C(str, str2));
    }

    public static void E(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(k.d(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static int F(int i7, byte[] bArr) {
        int i8;
        synchronized (f17094e) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    if (i9 >= i7 - 2) {
                        i9 = i7;
                        break;
                    }
                    try {
                        if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = f17095f;
                    if (iArr.length <= i10) {
                        f17095f = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f17095f[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f17095f[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }

    public static void G(Exception exc, String str, String str2) {
        Log.w(str, b(str2, exc));
    }

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        synchronized (f17097h) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j3 = jCurrentTimeMillis / 1000;
                long j7 = jCurrentTimeMillis - (j3 * 1000);
                long j8 = j3 + 2208988800L;
                bArr[40] = (byte) (j8 >> 24);
                bArr[41] = (byte) (j8 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j8 >> 8);
                    bArr[43] = (byte) j8;
                    long j9 = (j7 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j9 >> 24);
                    bArr[45] = (byte) (j9 >> 16);
                    bArr[46] = (byte) (j9 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b7 = bArr[0];
            int i7 = bArr[1] & 255;
            long jA = A(24, bArr);
            long jA2 = A(32, bArr);
            long jA3 = A(40, bArr);
            j((byte) ((b7 >> 6) & 3), (byte) (b7 & 7), i7, jA3);
            long j11 = (j10 + (((jA3 - j10) + (jA2 - jA)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
                if (cause instanceof UnknownHostException) {
                    strReplace = "UnknownHostException (no network)";
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbD = e.d(str, "\n  ");
        sbD.append(strReplace.replace("\n", "\n  "));
        sbD.append('\n');
        return sbD.toString();
    }

    public static void c(String str) {
        if (t.f17159a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i7, boolean z4, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = {f17091b[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i10)};
        int i11 = t.f17159a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    public static void e(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void f(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void j(byte b7, byte b8, int i7, long j3) throws IOException {
        if (b7 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b8 != 4 && b8 != 5) {
            throw new IOException(k.d(b8, "SNTP: Untrusted mode: "));
        }
        if (i7 == 0 || i7 > 15) {
            throw new IOException(k.d(i7, "SNTP: Untrusted stratum: "));
        }
        if (j3 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void k(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void l(String str, String str2, Throwable th) {
        Log.e(str, b(str2, th));
    }

    public static void m() {
        if (t.f17159a >= 18) {
            Trace.endSection();
        }
    }

    public static int n(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        h(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            k(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            k(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            k(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b7 = bArr[i11];
            if ((b7 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                    k(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static L o(InterfaceC0025j interfaceC0025j, ArrayList arrayList) {
        C0165x c0165x = AbstractC0167z.f2083b;
        AbstractC0158p.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i7 = 0;
        int i8 = 0;
        while (i7 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i7);
            bundle.getClass();
            InterfaceC0027k interfaceC0027kD = interfaceC0025j.d(bundle);
            interfaceC0027kD.getClass();
            int i9 = i8 + 1;
            if (objArrCopyOf.length < i9) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C0164w.e(objArrCopyOf.length, i9));
            }
            objArrCopyOf[i8] = interfaceC0027kD;
            i7++;
            i8 = i9;
        }
        return AbstractC0167z.B(i8, objArrCopyOf);
    }

    public static String p(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static int[] q(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i7 = iIndexOf5 + 2;
        if (i7 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i7) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static int r(String str) {
        byte b7;
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = i.f17115a;
        switch (str.hashCode()) {
            case -1007807498:
                b7 = !str2.equals("audio/x-flac") ? (byte) -1 : (byte) 0;
                break;
            case -586683234:
                b7 = !str2.equals("audio/x-wav") ? (byte) -1 : (byte) 1;
                break;
            case 187090231:
                b7 = !str2.equals("audio/mp3") ? (byte) -1 : (byte) 2;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                str2 = "audio/flac";
                break;
            case 1:
                str2 = "audio/wav";
                break;
            case 2:
                str2 = "audio/mpeg";
                break;
        }
        switch (str2) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/jpeg":
                return 14;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int s(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static boolean t(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean u(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return u(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static void w(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static j x(byte[] bArr, int i7, int i8) {
        x xVar = new x(bArr, i7 + 2, i8);
        int i9 = 4;
        xVar.r(4);
        int i10 = xVar.i(3);
        xVar.q();
        int i11 = xVar.i(2);
        boolean zH = xVar.h();
        int i12 = xVar.i(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (xVar.h()) {
                i13 |= 1 << i14;
            }
        }
        int i15 = 6;
        int[] iArr = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr[i16] = xVar.i(8);
        }
        int i17 = xVar.i(8);
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            if (xVar.h()) {
                i18 += 89;
            }
            if (xVar.h()) {
                i18 += 8;
            }
        }
        xVar.r(i18);
        if (i10 > 0) {
            xVar.r((8 - i10) * 2);
        }
        xVar.l();
        int iL = xVar.l();
        if (iL == 3) {
            xVar.q();
        }
        int iL2 = xVar.l();
        int iL3 = xVar.l();
        if (xVar.h()) {
            int iL4 = xVar.l();
            int iL5 = xVar.l();
            int iL6 = xVar.l();
            int iL7 = xVar.l();
            iL2 -= (iL4 + iL5) * ((iL == 1 || iL == 2) ? 2 : 1);
            iL3 -= (iL6 + iL7) * (iL == 1 ? 2 : 1);
        }
        int i20 = iL3;
        int i21 = iL2;
        xVar.l();
        xVar.l();
        int iL8 = xVar.l();
        for (int i22 = xVar.h() ? 0 : i10; i22 <= i10; i22++) {
            xVar.l();
            xVar.l();
            xVar.l();
        }
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        xVar.l();
        if (xVar.h() && xVar.h()) {
            int i23 = 0;
            while (i23 < i9) {
                int i24 = 0;
                while (i24 < i15) {
                    if (xVar.h()) {
                        int iMin = Math.min(64, 1 << ((i23 << 1) + 4));
                        if (i23 > 1) {
                            xVar.m();
                        }
                        for (int i25 = 0; i25 < iMin; i25++) {
                            xVar.m();
                        }
                    } else {
                        xVar.l();
                    }
                    i24 += i23 == 3 ? 3 : 1;
                    i15 = 6;
                }
                i23++;
                i9 = 4;
                i15 = 6;
            }
        }
        xVar.r(2);
        if (xVar.h()) {
            xVar.r(8);
            xVar.l();
            xVar.l();
            xVar.q();
        }
        int iL9 = xVar.l();
        boolean zH2 = false;
        int i26 = 0;
        for (int i27 = 0; i27 < iL9; i27++) {
            if (i27 != 0) {
                zH2 = xVar.h();
            }
            if (zH2) {
                xVar.q();
                xVar.l();
                for (int i28 = 0; i28 <= i26; i28++) {
                    if (!xVar.h()) {
                        xVar.q();
                    }
                }
            } else {
                int iL10 = xVar.l();
                int iL11 = xVar.l();
                int i29 = iL10 + iL11;
                for (int i30 = 0; i30 < iL10; i30++) {
                    xVar.l();
                    xVar.q();
                }
                for (int i31 = 0; i31 < iL11; i31++) {
                    xVar.l();
                    xVar.q();
                }
                i26 = i29;
            }
        }
        if (xVar.h()) {
            for (int i32 = 0; i32 < xVar.l(); i32++) {
                xVar.r(iL8 + 5);
            }
        }
        xVar.r(2);
        float f7 = 1.0f;
        if (xVar.h()) {
            if (xVar.h()) {
                int i33 = xVar.i(8);
                if (i33 == 255) {
                    int i34 = xVar.i(16);
                    int i35 = xVar.i(16);
                    if (i34 != 0 && i35 != 0) {
                        f7 = i34 / i35;
                    }
                } else if (i33 < 17) {
                    f7 = f17093d[i33];
                } else {
                    p150v0.a.j(i33, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (xVar.h()) {
                xVar.q();
            }
            if (xVar.h()) {
                xVar.r(4);
                if (xVar.h()) {
                    xVar.r(24);
                }
            }
            if (xVar.h()) {
                xVar.l();
                xVar.l();
            }
            xVar.q();
            if (xVar.h()) {
                i20 *= 2;
            }
        }
        return new j(i11, zH, i12, i13, iArr, i17, i21, i20, f7);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x015f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    public static l y(byte[] bArr, int i7, int i8) {
        int iL;
        boolean zH;
        int iL2;
        boolean z4;
        boolean zH2;
        int i9;
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        x xVar = new x(bArr, i7 + 1, i8);
        int i17 = xVar.i(8);
        int i18 = xVar.i(8);
        int i19 = xVar.i(8);
        int iL3 = xVar.l();
        if (i17 == 100 || i17 == 110 || i17 == 122 || i17 == 244 || i17 == 44 || i17 == 83 || i17 == 86 || i17 == 118 || i17 == 128 || i17 == 138) {
            iL = xVar.l();
            zH = iL == 3 ? xVar.h() : false;
            xVar.l();
            xVar.l();
            xVar.q();
            if (xVar.h()) {
                int i20 = iL != 3 ? 8 : 12;
                int i21 = 0;
                while (i21 < i20) {
                    if (xVar.h()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int iM = 8;
                        int i23 = 8;
                        for (int i24 = 0; i24 < i22; i24++) {
                            if (iM != 0) {
                                iM = ((xVar.m() + i23) + 256) % 256;
                            }
                            if (iM != 0) {
                                i23 = iM;
                            }
                        }
                    }
                    i21++;
                }
            }
        } else {
            iL = 1;
            zH = false;
        }
        int iL4 = xVar.l() + 4;
        int iL5 = xVar.l();
        if (iL5 != 0) {
            if (iL5 == 1) {
                boolean zH3 = xVar.h();
                xVar.m();
                xVar.m();
                long jL = xVar.l();
                for (int i25 = 0; i25 < jL; i25++) {
                    xVar.l();
                }
                z4 = zH3;
                iL2 = 0;
            } else {
                iL2 = 0;
            }
            xVar.l();
            xVar.q();
            int iL6 = xVar.l() + 1;
            int iL7 = xVar.l() + 1;
            zH2 = xVar.h();
            i9 = 2 - (zH2 ? 1 : 0);
            int i26 = iL7 * i9;
            if (!zH2) {
                xVar.q();
            }
            xVar.q();
            i10 = iL6 * 16;
            i11 = i26 * 16;
            if (xVar.h()) {
                int iL8 = xVar.l();
                int iL9 = xVar.l();
                int iL10 = xVar.l();
                int iL11 = xVar.l();
                if (iL == 0) {
                    i16 = 1;
                } else {
                    if (iL == 3) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    i9 *= iL == 1 ? 2 : 1;
                    i16 = i15;
                }
                i10 -= (iL8 + iL9) * i16;
                i11 -= (iL10 + iL11) * i9;
            }
            int i27 = i11;
            f7 = 1.0f;
            if (xVar.h() && xVar.h()) {
                i12 = xVar.i(8);
                if (i12 == 255) {
                    i13 = xVar.i(16);
                    i14 = xVar.i(16);
                    if (i13 != 0 && i14 != 0) {
                        f7 = i13 / i14;
                    }
                } else if (i12 < 17) {
                    f7 = f17093d[i12];
                } else {
                    p150v0.a.j(i12, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            return new l(i17, i18, i19, iL3, i10, i27, f7, zH, zH2, iL4, iL5, iL2, z4);
        }
        iL2 = xVar.l() + 4;
        z4 = false;
        xVar.l();
        xVar.q();
        int iL12 = xVar.l() + 1;
        int iL13 = xVar.l() + 1;
        zH2 = xVar.h();
        i9 = 2 - (zH2 ? 1 : 0);
        int i28 = iL13 * i9;
        if (!zH2) {
            xVar.q();
        }
        xVar.q();
        i10 = iL12 * 16;
        i11 = i28 * 16;
        if (xVar.h()) {
            int iL14 = xVar.l();
            int iL15 = xVar.l();
            int iL16 = xVar.l();
            int iL17 = xVar.l();
            if (iL == 0) {
                i16 = 1;
            } else {
                if (iL == 3) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                i9 *= iL == 1 ? 2 : 1;
                i16 = i15;
            }
            i10 -= (iL14 + iL15) * i16;
            i11 -= (iL16 + iL17) * i9;
        }
        int i29 = i11;
        f7 = 1.0f;
        if (xVar.h()) {
            i12 = xVar.i(8);
            if (i12 == 255) {
                i13 = xVar.i(16);
                i14 = xVar.i(16);
                if (i13 != 0) {
                    f7 = i13 / i14;
                }
            } else if (i12 < 17) {
                f7 = f17093d[i12];
            } else {
                p150v0.a.j(i12, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
            }
        }
        return new l(i17, i18, i19, iL3, i10, i29, f7, zH, zH2, iL4, iL5, iL2, z4);
    }

    public static long z(int i7, byte[] bArr) {
        int i8 = bArr[i7];
        int i9 = bArr[i7 + 1];
        int i10 = bArr[i7 + 2];
        int i11 = bArr[i7 + 3];
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        if ((i9 & 128) == 128) {
            i9 = (i9 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        return (((long) i8) << 24) + (((long) i9) << 16) + (((long) i10) << 8) + ((long) i11);
    }
}
