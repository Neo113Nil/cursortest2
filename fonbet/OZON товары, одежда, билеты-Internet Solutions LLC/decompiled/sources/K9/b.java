package K9;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15386a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f15387b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15388c;

    /* renamed from: d, reason: collision with root package name */
    private final Serializable f15389d;

    public b(String str, int i11, int i12) {
        this.f15389d = str;
        this.f15387b = i11;
        this.f15388c = i12;
    }

    public void a() {
        for (byte[] bArr : (byte[][]) this.f15389d) {
            Arrays.fill(bArr, (byte) -1);
        }
    }

    public byte b(int i11, int i12) {
        return ((byte[][]) this.f15389d)[i12][i11];
    }

    public byte[][] c() {
        return (byte[][]) this.f15389d;
    }

    public String d() {
        return (String) this.f15389d;
    }

    public int e() {
        return this.f15388c;
    }

    public int f() {
        return this.f15387b;
    }

    public int g() {
        return this.f15388c;
    }

    public int h() {
        return this.f15387b;
    }

    public void i(int i11, int i12, int i13) {
        ((byte[][]) this.f15389d)[i12][i11] = (byte) i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(int i11, int i12, boolean z11) {
        ((byte[][]) this.f15389d)[i12][i11] = z11 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        switch (this.f15386a) {
            case 0:
                int i11 = this.f15387b;
                int i12 = this.f15388c;
                StringBuilder sb2 = new StringBuilder((i11 * 2 * i12) + 2);
                for (int i13 = 0; i13 < i12; i13++) {
                    byte[] bArr = ((byte[][]) this.f15389d)[i13];
                    for (int i14 = 0; i14 < i11; i14++) {
                        byte b11 = bArr[i14];
                        if (b11 == 0) {
                            sb2.append(" 0");
                        } else if (b11 != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder("ClientInfoRequest{mBankId='");
                sb3.append((String) this.f15389d);
                sb3.append("', mVersionMajor=");
                sb3.append(this.f15387b);
                sb3.append(", mVersionMinor=");
                return Ek.a.d(sb3, this.f15388c, '}');
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte[][], java.io.Serializable] */
    public b(int i11, int i12) {
        this.f15389d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
        this.f15387b = i11;
        this.f15388c = i12;
    }
}
