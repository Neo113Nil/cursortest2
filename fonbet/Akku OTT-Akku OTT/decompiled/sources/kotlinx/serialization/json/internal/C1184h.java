package kotlinx.serialization.json.internal;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.serialization.json.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1184h extends C1182f {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184h(u writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.c = z;
    }

    @Override // kotlinx.serialization.json.internal.C1182f
    public final void b(byte b) {
        boolean z = this.c;
        String m1778toStringimpl = UByte.m1778toStringimpl(UByte.m1734constructorimpl(b));
        if (z) {
            h(m1778toStringimpl);
        } else {
            f(m1778toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.C1182f
    public final void d(int i) {
        boolean z = this.c;
        int m1811constructorimpl = UInt.m1811constructorimpl(i);
        if (z) {
            h(Long.toString(m1811constructorimpl & KeyboardMap.kValueMask, 10));
        } else {
            f(Long.toString(m1811constructorimpl & KeyboardMap.kValueMask, 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.C1182f
    public final void e(long j) {
        boolean z = this.c;
        int i = 63;
        String str = SessionDescription.SUPPORTED_SDP_VERSION;
        long m1890constructorimpl = ULong.m1890constructorimpl(j);
        if (z) {
            if (m1890constructorimpl != 0) {
                if (m1890constructorimpl > 0) {
                    str = Long.toString(m1890constructorimpl, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (m1890constructorimpl >>> 1) / 5;
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (m1890constructorimpl - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            h(str);
            return;
        }
        if (m1890constructorimpl != 0) {
            if (m1890constructorimpl > 0) {
                str = Long.toString(m1890constructorimpl, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (m1890constructorimpl >>> 1) / 5;
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (m1890constructorimpl - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        f(str);
    }

    @Override // kotlinx.serialization.json.internal.C1182f
    public final void g(short s) {
        boolean z = this.c;
        String m2041toStringimpl = UShort.m2041toStringimpl(UShort.m1997constructorimpl(s));
        if (z) {
            h(m2041toStringimpl);
        } else {
            f(m2041toStringimpl);
        }
    }
}
