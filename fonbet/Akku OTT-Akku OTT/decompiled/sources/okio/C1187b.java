package okio;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.C1190e;

@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n67#1:186\n73#1:187\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n105#1:186\n106#1:187\n*E\n"})
/* renamed from: okio.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1187b {
    public static final C1190e.a a = new C1190e.a();
    public static final int b = -1234567890;

    public static final boolean a(byte[] a2, int i, byte[] b2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a2[i4 + i] != b2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder b2 = androidx.compose.runtime.snapshots.m.b(j, "size=", " offset=");
            b2.append(j2);
            b2.append(" byteCount=");
            b2.append(j3);
            throw new ArrayIndexOutOfBoundsException(b2.toString());
        }
    }

    public static final int c(C1193h c1193h, int i) {
        Intrinsics.checkNotNullParameter(c1193h, "<this>");
        return i == b ? c1193h.d() : i;
    }

    public static final int d(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final String e(byte b2) {
        char[] cArr = okio.internal.b.a;
        return StringsKt.concatToString(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String f(int i) {
        String concatToString;
        if (i == 0) {
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
        char[] cArr = okio.internal.b.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        concatToString = StringsKt__StringsJVMKt.concatToString(cArr2, i2, 8);
        return concatToString;
    }
}
