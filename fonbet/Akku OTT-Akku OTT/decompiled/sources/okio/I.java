package okio;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
/* loaded from: classes5.dex */
public final class I extends C1193h {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(byte[][] segments, int[] directory) {
        super(C1193h.d.a);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.e = segments;
        this.f = directory;
    }

    private final Object writeReplace() {
        C1193h u = u();
        Intrinsics.checkNotNull(u, "null cannot be cast to non-null type java.lang.Object");
        return u;
    }

    @Override // okio.C1193h
    public final String a() {
        return u().a();
    }

    @Override // okio.C1193h
    public final C1193h c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new C1193h(digest);
    }

    @Override // okio.C1193h
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // okio.C1193h
    public final String e() {
        return u().e();
    }

    @Override // okio.C1193h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1193h) {
            C1193h c1193h = (C1193h) obj;
            if (c1193h.d() == d() && l(0, c1193h, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.C1193h
    public final int f(byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return u().f(other, i);
    }

    @Override // okio.C1193h
    public final byte[] h() {
        return t();
    }

    @Override // okio.C1193h
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // okio.C1193h
    public final byte i(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        C1187b.b(iArr[length], i, 1L);
        int a = okio.internal.j.a(this, i);
        return bArr[a][(i - (a == 0 ? 0 : iArr[a - 1])) + iArr[bArr.length + a]];
    }

    @Override // okio.C1193h
    public final int j(byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return u().j(other, i);
    }

    @Override // okio.C1193h
    public final boolean l(int i, C1193h other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int a = okio.internal.j.a(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = a == 0 ? 0 : iArr[a - 1];
                int i6 = iArr[a] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + a];
                int min = Math.min(i3, i6 + i5) - i;
                if (other.m(i4, bArr[a], (i - i5) + i7, min)) {
                    i4 += min;
                    i += min;
                    a++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.C1193h
    public final boolean m(int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = okio.internal.j.a(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = a == 0 ? 0 : iArr[a - 1];
            int i6 = iArr[a] - i5;
            byte[][] bArr = this.e;
            int i7 = iArr[bArr.length + a];
            int min = Math.min(i4, i6 + i5) - i;
            if (!C1187b.a(bArr[a], (i - i5) + i7, other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    @Override // okio.C1193h
    public final String n(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return u().n(charset);
    }

    @Override // okio.C1193h
    public final C1193h o(int i, int i2) {
        int c = C1187b.c(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException(androidx.compose.runtime.u.a(i, "beginIndex=", " < 0").toString());
        }
        if (c > d()) {
            StringBuilder c2 = androidx.collection.g.c(c, "endIndex=", " > length(");
            c2.append(d());
            c2.append(')');
            throw new IllegalArgumentException(c2.toString().toString());
        }
        int i3 = c - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a("endIndex=", c, " < beginIndex=", i).toString());
        }
        if (i == 0 && c == d()) {
            return this;
        }
        if (i == c) {
            return C1193h.d;
        }
        int a = okio.internal.j.a(this, i);
        int a2 = okio.internal.j.a(this, c - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) ArraysKt.copyOfRange(bArr, a, a2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (a <= a2) {
            int i4 = a;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == a2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = a != 0 ? iArr2[a - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new I(bArr2, iArr);
    }

    @Override // okio.C1193h
    public final C1193h q() {
        return u().q();
    }

    @Override // okio.C1193h
    public final void s(int i, C1190e buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int a = okio.internal.j.a(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = a == 0 ? 0 : iArr[a - 1];
            int i4 = iArr[a] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + a];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            G g = new G(bArr[a], i6, i6 + min, true, false);
            G g2 = buffer.a;
            if (g2 == null) {
                g.g = g;
                g.f = g;
                buffer.a = g;
            } else {
                Intrinsics.checkNotNull(g2);
                G g3 = g2.g;
                Intrinsics.checkNotNull(g3);
                g3.b(g);
            }
            i2 += min;
            a++;
        }
        buffer.b += i;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt.copyInto(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.C1193h
    public final String toString() {
        return u().toString();
    }

    public final C1193h u() {
        return new C1193h(t());
    }
}
