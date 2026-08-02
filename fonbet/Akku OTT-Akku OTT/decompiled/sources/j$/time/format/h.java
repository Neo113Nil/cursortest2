package j$.time.format;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.math.BigInteger;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes6.dex */
public class h implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};
    public final j$.time.temporal.q a;
    public final int b;
    public final int c;
    public final y d;
    public final int e;

    public h(j$.time.temporal.q qVar, int i, int i2, y yVar) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = yVar;
        this.e = 0;
    }

    public h(j$.time.temporal.q qVar, int i, int i2, y yVar, int i3) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = yVar;
        this.e = i3;
    }

    public h b() {
        if (this.e == -1) {
            return this;
        }
        return new h(this.a, this.b, this.c, this.d, -1);
    }

    public h c(int i) {
        return new h(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean o(s sVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.a;
        Long a = sVar.a(qVar);
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        v vVar = sVar.b.c;
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.c("Field " + qVar + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
        }
        vVar.getClass();
        int i2 = this.b;
        y yVar = this.d;
        if (longValue >= 0) {
            int i3 = b.a[yVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && longValue >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[yVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.c("Field " + qVar + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l.length(); i5++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public boolean a(p pVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == y.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        r6 = r12;
        r4 = r20;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int v(p pVar, CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        BigInteger bigInteger;
        boolean z3;
        boolean z4;
        int i2;
        long j;
        int i3;
        DateTimeFormatter dateTimeFormatter;
        boolean z5;
        int i4 = i;
        int length = charSequence.length();
        if (i4 == length) {
            return ~i4;
        }
        char charAt = charSequence.charAt(i);
        DateTimeFormatter dateTimeFormatter2 = pVar.a;
        dateTimeFormatter2.c.getClass();
        int i5 = this.c;
        y yVar = this.d;
        int i6 = this.b;
        int i7 = 0;
        boolean z6 = true;
        if (charAt == '+') {
            boolean z7 = pVar.c;
            boolean z8 = i6 == i5;
            int ordinal = yVar.ordinal();
            if (ordinal == 0 ? z7 : !(ordinal == 1 || ordinal == 4 || (!z7 && !z8))) {
                return ~i4;
            }
            i4++;
            z = false;
            z2 = true;
        } else {
            dateTimeFormatter2.c.getClass();
            if (charAt == '-') {
                boolean z9 = pVar.c;
                boolean z10 = i6 == i5;
                int ordinal2 = yVar.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 4 && (z9 || z10)) {
                    return ~i4;
                }
                i4++;
                z2 = false;
                z = true;
            } else {
                if (yVar == y.ALWAYS && pVar.c) {
                    return ~i4;
                }
                z = false;
                z2 = false;
            }
        }
        int i8 = (pVar.c || a(pVar)) ? i6 : 1;
        int i9 = i4 + i8;
        if (i9 > length) {
            return ~i4;
        }
        if (!pVar.c && !a(pVar)) {
            i5 = 9;
        }
        int i10 = this.e;
        int max = Math.max(i10, 0) + i5;
        while (true) {
            bigInteger = null;
            if (i7 >= 2) {
                z3 = z;
                z4 = z2;
                i2 = i4;
                j = 0;
                break;
            }
            int min = Math.min(i4 + max, length);
            boolean z11 = z6;
            long j2 = 0;
            int i11 = i4;
            while (true) {
                if (i11 >= min) {
                    i3 = length;
                    z3 = z;
                    break;
                }
                int i12 = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                i3 = length;
                dateTimeFormatter2.c.getClass();
                int i13 = charAt2 - '0';
                z3 = z;
                if (i13 < 0 || i13 > 9) {
                    i13 = -1;
                }
                if (i13 >= 0) {
                    if (i12 - i4 > 18) {
                        if (bigInteger == null) {
                            bigInteger = BigInteger.valueOf(j2);
                        }
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        bigInteger = bigInteger.multiply(BigInteger.TEN).add(BigInteger.valueOf(i13));
                    } else {
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        j2 = (j2 * 10) + i13;
                    }
                    i11 = i12;
                    z = z3;
                    length = i3;
                    dateTimeFormatter2 = dateTimeFormatter;
                    z2 = z5;
                } else if (i11 < i9) {
                    return ~i4;
                }
            }
            DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2;
            z4 = z2;
            if (i10 <= 0 || i7 != 0) {
                break;
            }
            int max2 = Math.max(i8, (i11 - i4) - i10);
            i7++;
            z6 = z11;
            z = z3;
            dateTimeFormatter2 = dateTimeFormatter3;
            z2 = z4;
            max = max2;
            length = i3;
        }
        BigInteger bigInteger2 = bigInteger;
        if (z3) {
            if (bigInteger2 != null) {
                if (bigInteger2.equals(BigInteger.ZERO) && pVar.c) {
                    return ~(i4 - 1);
                }
                bigInteger2 = bigInteger2.negate();
            } else {
                if (j == 0 && pVar.c) {
                    return ~(i4 - 1);
                }
                j = -j;
            }
        } else if (yVar == y.EXCEEDS_PAD && pVar.c) {
            int i14 = i2 - i4;
            if (z4) {
                if (i14 <= i6) {
                    return ~(i4 - 1);
                }
            } else if (i14 > i6) {
                return ~i4;
            }
        }
        if (bigInteger2 == null) {
            return pVar.f(this.a, j, i4, i2);
        }
        if (bigInteger2.bitLength() > 63) {
            bigInteger2 = bigInteger2.divide(BigInteger.TEN);
            i2--;
        }
        return pVar.f(this.a, bigInteger2.longValue(), i4, i2);
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.q qVar = this.a;
        y yVar = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && yVar == y.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i2 == i && yVar == y.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i2 + ")";
        }
        return "Value(" + qVar + "," + i2 + "," + i + "," + yVar + ")";
    }
}
