package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ko1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: k */
    public static final jo1 f4486k = new jo1(ip1.f3634a);

    /* JADX INFO: renamed from: j */
    public int f4487j;

    static {
        int i = fo1.f2465a;
    }

    /* JADX INFO: renamed from: j */
    public static jo1 m3063j(byte[] bArr, int i, int i2) {
        try {
            return m3064l(bArr, i, i2);
        } catch (mp1 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: l */
    public static jo1 m3064l(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return f4486k;
        }
        m3065q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new jo1(bArr2);
    }

    /* JADX INFO: renamed from: q */
    public static int m3065q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m3066r(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        m3065q(i, i4, bArr.length);
        m3065q(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract byte mo2329b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo2330c();

    /* JADX INFO: renamed from: d */
    public abstract io1 mo2331d(int i, int i2);

    /* JADX INFO: renamed from: e */
    public abstract void mo2332e(int i, byte[] bArr);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ko1)) {
            return false;
        }
        ko1 ko1Var = (ko1) obj;
        int iMo2330c = mo2330c();
        if (iMo2330c != ko1Var.mo2330c()) {
            return false;
        }
        if (iMo2330c == 0) {
            return true;
        }
        int i = this.f4487j;
        int i2 = ko1Var.f4487j;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo2334g(ko1Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2333f(ro1 ro1Var);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2334g(ko1 ko1Var);

    /* JADX INFO: renamed from: h */
    public abstract int mo2335h(int i, int i2);

    public final int hashCode() {
        int iMo2335h = this.f4487j;
        if (iMo2335h == 0) {
            int iMo2330c = mo2330c();
            iMo2335h = mo2335h(iMo2330c, iMo2330c);
            if (iMo2335h == 0) {
                iMo2335h = 1;
            }
            this.f4487j = iMo2335h;
        }
        return iMo2335h;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0577pd(this);
    }

    /* JADX INFO: renamed from: p */
    public final byte[] m3067p() {
        int iMo2330c = mo2330c();
        if (iMo2330c == 0) {
            return ip1.f3634a;
        }
        byte[] bArr = new byte[iMo2330c];
        mo2332e(iMo2330c, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo2330c = mo2330c();
        String strM3020t = mo2330c() <= 50 ? kd0.m3020t(m3067p()) : kd0.m3020t(mo2331d(0, 47).m3067p()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo2330c);
        sb.append(" contents=\"");
        return AbstractC0024an.m285h(sb, strM3020t, "\">");
    }
}
