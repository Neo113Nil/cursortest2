package Jb;

import androidx.lifecycle.C5423j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {
    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    private static long b(byte b11, byte b12) {
        int i11;
        int i12 = b11 & 255;
        int i13 = b11 & 3;
        if (i13 != 0) {
            i11 = 2;
            if (i13 != 1 && i13 != 2) {
                i11 = b12 & 63;
            }
        } else {
            i11 = 1;
        }
        int i14 = i12 >> 3;
        return i11 * (i14 >= 16 ? 2500 << r6 : i14 >= 12 ? 10000 << (i14 & 1) : (i14 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static long c(byte[] bArr) {
        return b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static C5423j d(Function2 block) {
        kotlin.coroutines.g context = kotlin.coroutines.g.f71771a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new C5423j(context, block);
    }

    public static boolean e(long j11, long j12) {
        return j11 - j12 <= 80000;
    }

    public static LinkedHashMap f(int i11) {
        return new LinkedHashMap(i11 < 3 ? i11 + 1 : i11 < 1073741824 ? (int) ((i11 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static int g(ByteBuffer byteBuffer) {
        int i11;
        if ((byteBuffer.get(5) & 2) == 0) {
            i11 = 0;
        } else {
            byte b11 = byteBuffer.get(26);
            int i12 = 28;
            int i13 = 28;
            for (int i14 = 0; i14 < b11; i14++) {
                i13 += byteBuffer.get(i14 + 27);
            }
            byte b12 = byteBuffer.get(i13 + 26);
            for (int i15 = 0; i15 < b12; i15++) {
                i12 += byteBuffer.get(i13 + 27 + i15);
            }
            i11 = i13 + i12;
        }
        int i16 = byteBuffer.get(i11 + 26) + 27 + i11;
        return (int) ((b(byteBuffer.get(i16), byteBuffer.limit() - i16 > 1 ? byteBuffer.get(i16 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int h(ByteBuffer byteBuffer) {
        return (int) ((b(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }
}
