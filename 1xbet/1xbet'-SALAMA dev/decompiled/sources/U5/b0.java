package U5;

import W5.AbstractC0486a1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f6456c = Logger.getLogger(b0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0443j f6457d = new C0443j(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F3.c f6458e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f6459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6460b;

    static {
        F3.c cVar = F3.e.f2737c;
        if (cVar.f2739b != null) {
            cVar = new F3.c(cVar.f2738a, (Character) null);
        }
        f6458e = cVar;
    }

    public final void a(Y y4) {
        if (this.f6460b == 0) {
            return;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f6460b;
            if (i7 >= i9) {
                Arrays.fill(this.f6459a, i8 * 2, i9 * 2, (Object) null);
                this.f6460b = i8;
                return;
            }
            if (!Arrays.equals(y4.f6450b, e(i7))) {
                byte[] bArrE = e(i7);
                Object[] objArr = this.f6459a;
                int i10 = i8 * 2;
                objArr[i10] = bArrE;
                Object obj = objArr[(i7 * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr != null ? objArr.length : 0);
                }
                this.f6459a[i10 + 1] = obj;
                i8++;
            }
            i7++;
        }
    }

    public final void b(int i7) {
        Object[] objArr = new Object[i7];
        int i8 = this.f6460b;
        if (i8 != 0) {
            System.arraycopy(this.f6459a, 0, objArr, 0, i8 * 2);
        }
        this.f6459a = objArr;
    }

    public final Object c(Y y4) {
        for (int i7 = this.f6460b - 1; i7 >= 0; i7--) {
            if (Arrays.equals(y4.f6450b, e(i7))) {
                Object obj = this.f6459a[(i7 * 2) + 1];
                if (obj instanceof byte[]) {
                    return y4.a((byte[]) obj);
                }
                obj.getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public final void d(b0 b0Var) {
        int i7 = b0Var.f6460b;
        if (i7 == 0) {
            return;
        }
        Object[] objArr = this.f6459a;
        int length = objArr != null ? objArr.length : 0;
        int i8 = this.f6460b;
        int i9 = length - (i8 * 2);
        if (i8 == 0 || i9 < i7 * 2) {
            b((i7 * 2) + (i8 * 2));
        }
        System.arraycopy(b0Var.f6459a, 0, this.f6459a, this.f6460b * 2, b0Var.f6460b * 2);
        this.f6460b += b0Var.f6460b;
    }

    public final byte[] e(int i7) {
        return (byte[]) this.f6459a[i7 * 2];
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final void f(Y y4, Object obj) {
        p113p3.f.k(y4, "key");
        p113p3.f.k(obj, "value");
        int i7 = this.f6460b;
        int i8 = i7 * 2;
        if (i8 == 0) {
            b(Math.max(i7 * 4, 8));
        } else {
            Object[] objArr = this.f6459a;
            if (i8 == (objArr != null ? objArr.length : 0)) {
                b(Math.max(i7 * 4, 8));
            }
        }
        int i9 = this.f6460b;
        this.f6459a[i9 * 2] = y4.f6450b;
        this.f6459a[(i9 * 2) + 1] = y4.b(obj);
        this.f6460b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i7 = 0; i7 < this.f6460b; i7++) {
            if (i7 != 0) {
                sb.append(',');
            }
            byte[] bArrE = e(i7);
            Charset charset = D3.f.f1717a;
            String str = new String(bArrE, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f6459a[(i7 * 2) + 1];
                if (!(obj instanceof byte[])) {
                    AbstractC0486a1.n(obj);
                    throw null;
                }
                sb.append(f6458e.c((byte[]) obj));
            } else {
                Object obj2 = this.f6459a[(i7 * 2) + 1];
                if (!(obj2 instanceof byte[])) {
                    AbstractC0486a1.n(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
