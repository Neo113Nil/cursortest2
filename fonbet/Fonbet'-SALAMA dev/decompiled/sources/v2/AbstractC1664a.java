package v2;

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
import v0.AbstractC1663a;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1664a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f17084a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f17085b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f17086c = {0, 0, 0, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f17087d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f17088e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static int[] f17089f = new int[10];

    /* renamed from: g, reason: collision with root package name */
    public static final Object f17090g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f17091h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f17092i;
    public static long j;

    public static long A(int i7, byte[] bArr) {
        long z4 = z(i7, bArr);
        long z7 = z(i7 + 4, bArr);
        if (z4 == 0 && z7 == 0) {
            return 0L;
        }
        return ((z7 * 1000) / 4294967296L) + ((z4 - 2208988800L) * 1000);
    }

    public static String B(StringBuilder sb, int i7, int i8) {
        int i9;
        int i10;
        if (i7 >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i7) == '/') {
            i7++;
        }
        int i11 = i7;
        int i12 = i11;
        while (i11 <= i8) {
            if (i11 == i8) {
                i9 = i11;
            } else if (sb.charAt(i11) == '/') {
                i9 = i11 + 1;
            } else {
                i11++;
            }
            int i13 = i12 + 1;
            if (i11 == i13 && sb.charAt(i12) == '.') {
                sb.delete(i12, i9);
                i8 -= i9 - i12;
            } else {
                if (i11 == i12 + 2 && sb.charAt(i12) == '.' && sb.charAt(i13) == '.') {
                    i10 = sb.lastIndexOf("/", i12 - 2) + 1;
                    int i14 = i10 > i7 ? i10 : i7;
                    sb.delete(i14, i9);
                    i8 -= i9 - i14;
                } else {
                    i10 = i11 + 1;
                }
                i12 = i10;
            }
            i11 = i12;
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
        int[] q7 = q(str2);
        if (q7[0] != -1) {
            sb.append(str2);
            B(sb, q7[1], q7[2]);
            return sb.toString();
        }
        int[] q8 = q(str);
        if (q7[3] == 0) {
            sb.append((CharSequence) str, 0, q8[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (q7[2] == 0) {
            sb.append((CharSequence) str, 0, q8[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i7 = q7[1];
        if (i7 != 0) {
            int i8 = q8[0] + 1;
            sb.append((CharSequence) str, 0, i8);
            sb.append(str2);
            return B(sb, q7[1] + i8, i8 + q7[2]);
        }
        if (str2.charAt(i7) == '/') {
            sb.append((CharSequence) str, 0, q8[1]);
            sb.append(str2);
            int i9 = q8[1];
            return B(sb, i9, q7[2] + i9);
        }
        int i10 = q8[0] + 2;
        int i11 = q8[1];
        if (i10 >= i11 || i11 != q8[2]) {
            int lastIndexOf = str.lastIndexOf(47, q8[2] - 1);
            int i12 = lastIndexOf == -1 ? q8[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i12);
            sb.append(str2);
            return B(sb, q8[1], i12 + q7[2]);
        }
        sb.append((CharSequence) str, 0, i11);
        sb.append('/');
        sb.append(str2);
        int i13 = q8[1];
        return B(sb, i13, q7[2] + i13 + 1);
    }

    public static Uri D(String str, String str2) {
        return Uri.parse(C(str, str2));
    }

    public static void E(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(e1.k.d(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static int F(int i7, byte[] bArr) {
        int i8;
        synchronized (f17088e) {
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
                    int[] iArr = f17089f;
                    if (iArr.length <= i10) {
                        f17089f = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f17089f[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f17089f[i13] - i12;
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

    public static long a() {
        DatagramSocket datagramSocket;
        long j3;
        synchronized (f17091h) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j3 = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j7 = currentTimeMillis / 1000;
                long j8 = currentTimeMillis - (j7 * 1000);
                long j9 = j7 + 2208988800L;
                j3 = currentTimeMillis;
                bArr[40] = (byte) (j9 >> 24);
                bArr[41] = (byte) (j9 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j9 >> 8);
                    bArr[43] = (byte) j9;
                    long j10 = (j8 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j10 >> 24);
                    bArr[45] = (byte) (j10 >> 16);
                    bArr[46] = (byte) (j10 >> 8);
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
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j11 = (elapsedRealtime2 - elapsedRealtime) + j3;
            byte b7 = bArr[0];
            int i7 = bArr[1] & 255;
            long A7 = A(24, bArr);
            long A8 = A(32, bArr);
            long A9 = A(40, bArr);
            j((byte) ((b7 >> 6) & 3), (byte) (b7 & 7), i7, A9);
            long j12 = (j11 + (((A9 - j11) + (A8 - A7)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j12;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
                if (th2 instanceof UnknownHostException) {
                    replace = "UnknownHostException (no network)";
                    break;
                }
                th2 = th2.getCause();
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder d7 = t.e.d(str, "\n  ");
        d7.append(replace.replace("\n", "\n  "));
        d7.append('\n');
        return d7.toString();
    }

    public static void c(String str) {
        if (t.f17153a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String d(int i7, boolean z4, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = {f17085b[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i10)};
        int i11 = t.f17153a;
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

    public static void j(byte b7, byte b8, int i7, long j3) {
        if (b7 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b8 != 4 && b8 != 5) {
            throw new IOException(e1.k.d(b8, "SNTP: Untrusted mode: "));
        }
        if (i7 == 0 || i7 > 15) {
            throw new IOException(e1.k.d(i7, "SNTP: Untrusted stratum: "));
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
        if (t.f17153a >= 18) {
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
        Object[] objArr = new Object[4];
        int i7 = 0;
        int i8 = 0;
        while (i7 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i7);
            bundle.getClass();
            InterfaceC0027k d7 = interfaceC0025j.d(bundle);
            d7.getClass();
            int i9 = i8 + 1;
            if (objArr.length < i9) {
                objArr = Arrays.copyOf(objArr, C0164w.e(objArr.length, i9));
            }
            objArr[i8] = d7;
            i7++;
            i8 = i9;
        }
        return AbstractC0167z.B(i8, objArr);
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
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i8 = indexOf4 + 2;
        if (i8 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i8) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019b, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int r(String str) {
        boolean z4;
        String str2 = str;
        char c3 = 2;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = i.f17109a;
        switch (str.hashCode()) {
            case -1007807498:
                if (str2.equals("audio/x-flac")) {
                    z4 = false;
                    break;
                }
                z4 = -1;
                break;
            case -586683234:
                if (str2.equals("audio/x-wav")) {
                    z4 = true;
                    break;
                }
                z4 = -1;
                break;
            case 187090231:
                if (str2.equals("audio/mp3")) {
                    z4 = 2;
                    break;
                }
                z4 = -1;
                break;
            default:
                z4 = -1;
                break;
        }
        switch (z4) {
            case false:
                str2 = "audio/flac";
                break;
            case true:
                str2 = "audio/wav";
                break;
            case true:
                str2 = "audio/mpeg";
                break;
        }
        switch (str2.hashCode()) {
            case -2123537834:
                if (str2.equals("audio/eac3-joc")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1662384011:
                if (str2.equals("video/mp2p")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1662384007:
                break;
            case -1662095187:
                if (str2.equals("video/webm")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -1606874997:
                if (str2.equals("audio/amr-wb")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -1487394660:
                if (str2.equals("image/jpeg")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -1248337486:
                if (str2.equals("application/mp4")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -1079884372:
                if (str2.equals("video/x-msvideo")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -1004728940:
                if (str2.equals("text/vtt")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -387023398:
                if (str2.equals("audio/x-matroska")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -43467528:
                if (str2.equals("application/webm")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 13915911:
                if (str2.equals("video/x-flv")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 187078296:
                if (str2.equals("audio/ac3")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 187078297:
                if (str2.equals("audio/ac4")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 187078669:
                if (str2.equals("audio/amr")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 187090232:
                if (str2.equals("audio/mp4")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 187091926:
                if (str2.equals("audio/ogg")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 187099443:
                if (str2.equals("audio/wav")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 1331848029:
                if (str2.equals("video/mp4")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 1503095341:
                if (str2.equals("audio/3gpp")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 1504578661:
                if (str2.equals("audio/eac3")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 1504824762:
                if (str2.equals("audio/midi")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 1504831518:
                if (str2.equals("audio/mpeg")) {
                    c3 = 23;
                    break;
                }
                c3 = 65535;
                break;
            case 1505118770:
                if (str2.equals("audio/webm")) {
                    c3 = 24;
                    break;
                }
                c3 = 65535;
                break;
            case 2039520277:
                if (str2.equals("video/x-matroska")) {
                    c3 = 25;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
        }
        return -1;
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
        boolean h6 = xVar.h();
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
        int l7 = xVar.l();
        if (l7 == 3) {
            xVar.q();
        }
        int l8 = xVar.l();
        int l9 = xVar.l();
        if (xVar.h()) {
            int l10 = xVar.l();
            int l11 = xVar.l();
            int l12 = xVar.l();
            int l13 = xVar.l();
            l8 -= (l10 + l11) * ((l7 == 1 || l7 == 2) ? 2 : 1);
            l9 -= (l12 + l13) * (l7 == 1 ? 2 : 1);
        }
        int i20 = l9;
        int i21 = l8;
        xVar.l();
        xVar.l();
        int l14 = xVar.l();
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
                        int min = Math.min(64, 1 << ((i23 << 1) + 4));
                        if (i23 > 1) {
                            xVar.m();
                        }
                        for (int i25 = 0; i25 < min; i25++) {
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
        int l15 = xVar.l();
        boolean z4 = false;
        int i26 = 0;
        for (int i27 = 0; i27 < l15; i27++) {
            if (i27 != 0) {
                z4 = xVar.h();
            }
            if (z4) {
                xVar.q();
                xVar.l();
                for (int i28 = 0; i28 <= i26; i28++) {
                    if (!xVar.h()) {
                        xVar.q();
                    }
                }
            } else {
                int l16 = xVar.l();
                int l17 = xVar.l();
                int i29 = l16 + l17;
                for (int i30 = 0; i30 < l16; i30++) {
                    xVar.l();
                    xVar.q();
                }
                for (int i31 = 0; i31 < l17; i31++) {
                    xVar.l();
                    xVar.q();
                }
                i26 = i29;
            }
        }
        if (xVar.h()) {
            for (int i32 = 0; i32 < xVar.l(); i32++) {
                xVar.r(l14 + 5);
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
                    f7 = f17087d[i33];
                } else {
                    AbstractC1663a.j(i33, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
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
        return new j(i11, h6, i12, i13, iArr, i17, i21, i20, f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l y(byte[] bArr, int i7, int i8) {
        int l7;
        boolean h6;
        int i9;
        boolean z4;
        boolean h7;
        int i10;
        int i11;
        x xVar = new x(bArr, i7 + 1, i8);
        int i12 = xVar.i(8);
        int i13 = xVar.i(8);
        int i14 = xVar.i(8);
        int l8 = xVar.l();
        if (i12 == 100 || i12 == 110 || i12 == 122 || i12 == 244 || i12 == 44 || i12 == 83 || i12 == 86 || i12 == 118 || i12 == 128 || i12 == 138) {
            l7 = xVar.l();
            h6 = l7 == 3 ? xVar.h() : false;
            xVar.l();
            xVar.l();
            xVar.q();
            if (xVar.h()) {
                int i15 = l7 != 3 ? 8 : 12;
                int i16 = 0;
                while (i16 < i15) {
                    if (xVar.h()) {
                        int i17 = i16 < 6 ? 16 : 64;
                        int i18 = 8;
                        int i19 = 8;
                        for (int i20 = 0; i20 < i17; i20++) {
                            if (i18 != 0) {
                                i18 = ((xVar.m() + i19) + 256) % 256;
                            }
                            if (i18 != 0) {
                                i19 = i18;
                            }
                        }
                    }
                    i16++;
                }
            }
        } else {
            l7 = 1;
            h6 = false;
        }
        int l9 = xVar.l() + 4;
        int l10 = xVar.l();
        if (l10 == 0) {
            i9 = xVar.l() + 4;
        } else {
            if (l10 == 1) {
                boolean h8 = xVar.h();
                xVar.m();
                xVar.m();
                long l11 = xVar.l();
                for (int i21 = 0; i21 < l11; i21++) {
                    xVar.l();
                }
                z4 = h8;
                i9 = 0;
                xVar.l();
                xVar.q();
                int l12 = xVar.l() + 1;
                int l13 = xVar.l() + 1;
                h7 = xVar.h();
                int i22 = 2 - (h7 ? 1 : 0);
                int i23 = l13 * i22;
                if (!h7) {
                    xVar.q();
                }
                xVar.q();
                int i24 = l12 * 16;
                int i25 = i23 * 16;
                if (xVar.h()) {
                    int l14 = xVar.l();
                    int l15 = xVar.l();
                    int l16 = xVar.l();
                    int l17 = xVar.l();
                    if (l7 == 0) {
                        i11 = 1;
                    } else {
                        int i26 = l7 == 3 ? 1 : 2;
                        i22 *= l7 == 1 ? 2 : 1;
                        i11 = i26;
                    }
                    i24 -= (l14 + l15) * i11;
                    i25 -= (l16 + l17) * i22;
                }
                int i27 = i25;
                float f7 = 1.0f;
                if (xVar.h() && xVar.h()) {
                    i10 = xVar.i(8);
                    if (i10 != 255) {
                        int i28 = xVar.i(16);
                        int i29 = xVar.i(16);
                        if (i28 != 0 && i29 != 0) {
                            f7 = i28 / i29;
                        }
                    } else if (i10 < 17) {
                        f7 = f17087d[i10];
                    } else {
                        AbstractC1663a.j(i10, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                return new l(i12, i13, i14, l8, i24, i27, f7, h6, h7, l9, l10, i9, z4);
            }
            i9 = 0;
        }
        z4 = false;
        xVar.l();
        xVar.q();
        int l122 = xVar.l() + 1;
        int l132 = xVar.l() + 1;
        h7 = xVar.h();
        int i222 = 2 - (h7 ? 1 : 0);
        int i232 = l132 * i222;
        if (!h7) {
        }
        xVar.q();
        int i242 = l122 * 16;
        int i252 = i232 * 16;
        if (xVar.h()) {
        }
        int i272 = i252;
        float f72 = 1.0f;
        if (xVar.h()) {
            i10 = xVar.i(8);
            if (i10 != 255) {
            }
        }
        return new l(i12, i13, i14, l8, i242, i272, f72, h6, h7, l9, l10, i9, z4);
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
        return (i8 << 24) + (i9 << 16) + (i10 << 8) + i11;
    }
}
