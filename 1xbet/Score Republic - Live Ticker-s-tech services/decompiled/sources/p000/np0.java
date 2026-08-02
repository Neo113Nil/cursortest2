package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class np0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f5484c = Logger.getLogger(np0.class.getName());

    /* JADX INFO: renamed from: d */
    public static final x80 f5485d = new x80(7);

    /* JADX INFO: renamed from: e */
    public static final C0353jb f5486e;

    /* JADX INFO: renamed from: a */
    public Object[] f5487a;

    /* JADX INFO: renamed from: b */
    public int f5488b;

    static {
        C0353jb c0353jb = C0427lb.f4748d;
        if (c0353jb.f4752b != null) {
            c0353jb = new C0353jb(c0353jb.f4751a, (Character) null);
        }
        f5486e = c0353jb;
    }

    /* JADX INFO: renamed from: a */
    public final void m3577a(kp0 kp0Var) {
        if (this.f5488b == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.f5488b;
            if (i >= i3) {
                Arrays.fill(this.f5487a, i2 * 2, i3 * 2, (Object) null);
                this.f5488b = i2;
                return;
            }
            int i4 = i * 2;
            if (!Arrays.equals(kp0Var.f4495b, (byte[]) this.f5487a[i4])) {
                Object[] objArr = this.f5487a;
                int i5 = i2 * 2;
                objArr[i5] = (byte[]) objArr[i4];
                Object obj = objArr[i4 + 1];
                if (objArr instanceof byte[][]) {
                    m3578b(objArr.length);
                }
                this.f5487a[i5 + 1] = obj;
                i2++;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3578b(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.f5488b;
        if (i2 != 0) {
            System.arraycopy(this.f5487a, 0, objArr, 0, i2 * 2);
        }
        this.f5487a = objArr;
    }

    /* JADX INFO: renamed from: c */
    public final Object m3579c(kp0 kp0Var) {
        int i;
        int i2 = this.f5488b;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
            i = i2 * 2;
        } while (!Arrays.equals(kp0Var.f4495b, (byte[]) this.f5487a[i]));
        Object obj = this.f5487a[i + 1];
        if (obj instanceof byte[]) {
            return kp0Var.mo2949a((byte[]) obj);
        }
        obj.getClass();
        dd0.m1158c();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m3580d(np0 np0Var) {
        int i = np0Var.f5488b;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.f5487a;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.f5488b;
        int i3 = length - (i2 * 2);
        if (i2 == 0 || i3 < i * 2) {
            m3578b((i * 2) + (i2 * 2));
        }
        System.arraycopy(np0Var.f5487a, 0, this.f5487a, this.f5488b * 2, np0Var.f5488b * 2);
        this.f5488b += np0Var.f5488b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: e */
    public final void m3581e(kp0 kp0Var, Object obj) {
        a90.m127k(kp0Var, "key");
        a90.m127k(obj, "value");
        int i = this.f5488b;
        int i2 = i * 2;
        if (i2 == 0) {
            m3578b(Math.max(i * 4, 8));
        } else {
            Object[] objArr = this.f5487a;
            if (i2 == (objArr != null ? objArr.length : 0)) {
                m3578b(Math.max(i * 4, 8));
            }
        }
        int i3 = this.f5488b;
        this.f5487a[i3 * 2] = kp0Var.f4495b;
        this.f5487a[(i3 * 2) + 1] = kp0Var.mo2950b(obj);
        this.f5488b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f5488b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            int i2 = i * 2;
            byte[] bArr = (byte[]) this.f5487a[i2];
            Charset charset = AbstractC0358jg.f3919a;
            String str = new String(bArr, charset);
            sb.append(str);
            sb.append('=');
            boolean zEndsWith = str.endsWith("-bin");
            Object[] objArr = this.f5487a;
            if (zEndsWith) {
                Object obj = objArr[i2 + 1];
                if (!(obj instanceof byte[])) {
                    AbstractC0024an.m289l(obj);
                    throw null;
                }
                sb.append(f5486e.m3197c((byte[]) obj));
            } else {
                Object obj2 = objArr[i2 + 1];
                if (!(obj2 instanceof byte[])) {
                    AbstractC0024an.m289l(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
