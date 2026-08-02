package N3;

import F3.i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class b implements Closeable, Flushable, AutoCloseable {

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f3778v = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f3779w = new String[128];

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f3780x;

    /* renamed from: k, reason: collision with root package name */
    public final Writer f3781k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f3782l;

    /* renamed from: m, reason: collision with root package name */
    public int f3783m;

    /* renamed from: n, reason: collision with root package name */
    public i f3784n;

    /* renamed from: o, reason: collision with root package name */
    public String f3785o;

    /* renamed from: p, reason: collision with root package name */
    public String f3786p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3787q;

    /* renamed from: r, reason: collision with root package name */
    public int f3788r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3789s;

    /* renamed from: t, reason: collision with root package name */
    public String f3790t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3791u;

    static {
        for (int i = 0; i <= 31; i++) {
            f3779w[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f3779w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f3780x = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f3782l = iArr;
        this.f3783m = 0;
        if (iArr.length == 0) {
            this.f3782l = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f3782l;
        int i = this.f3783m;
        this.f3783m = i + 1;
        iArr2[i] = 6;
        this.f3788r = 2;
        this.f3791u = true;
        Objects.requireNonNull(writer, "out == null");
        this.f3781k = writer;
        r(i.f1540d);
    }

    public void A(Number number) {
        if (number == null) {
            n();
            return;
        }
        G();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f3778v.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f3788r != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        b();
        this.f3781k.append((CharSequence) obj);
    }

    public void E(String str) {
        if (str == null) {
            n();
            return;
        }
        G();
        b();
        s(str);
    }

    public void F(boolean z3) {
        G();
        b();
        this.f3781k.write(z3 ? "true" : "false");
    }

    public final void G() {
        if (this.f3790t != null) {
            int p5 = p();
            if (p5 == 5) {
                this.f3781k.write(this.f3786p);
            } else if (p5 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m();
            this.f3782l[this.f3783m - 1] = 4;
            s(this.f3790t);
            this.f3790t = null;
        }
    }

    public final void b() {
        int p5 = p();
        if (p5 == 1) {
            this.f3782l[this.f3783m - 1] = 2;
            m();
            return;
        }
        Writer writer = this.f3781k;
        if (p5 == 2) {
            writer.append((CharSequence) this.f3786p);
            m();
        } else {
            if (p5 == 4) {
                writer.append((CharSequence) this.f3785o);
                this.f3782l[this.f3783m - 1] = 5;
                return;
            }
            if (p5 != 6) {
                if (p5 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f3788r != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f3782l[this.f3783m - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3781k.close();
        int i = this.f3783m;
        if (i > 1 || (i == 1 && this.f3782l[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f3783m = 0;
    }

    public void d() {
        G();
        b();
        int i = this.f3783m;
        int[] iArr = this.f3782l;
        if (i == iArr.length) {
            this.f3782l = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f3782l;
        int i5 = this.f3783m;
        this.f3783m = i5 + 1;
        iArr2[i5] = 1;
        this.f3781k.write(91);
    }

    public void f() {
        G();
        b();
        int i = this.f3783m;
        int[] iArr = this.f3782l;
        if (i == iArr.length) {
            this.f3782l = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f3782l;
        int i5 = this.f3783m;
        this.f3783m = i5 + 1;
        iArr2[i5] = 3;
        this.f3781k.write(123);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f3783m == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f3781k.flush();
    }

    public final void h(int i, int i5, char c5) {
        int p5 = p();
        if (p5 != i5 && p5 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f3790t != null) {
            throw new IllegalStateException("Dangling name: " + this.f3790t);
        }
        this.f3783m--;
        if (p5 == i5) {
            m();
        }
        this.f3781k.write(c5);
    }

    public void i() {
        h(1, 2, ']');
    }

    public void k() {
        h(3, 5, '}');
    }

    public void l(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f3790t != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int p5 = p();
        if (p5 != 3 && p5 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f3790t = str;
    }

    public final void m() {
        if (this.f3787q) {
            return;
        }
        String str = this.f3784n.f1541a;
        Writer writer = this.f3781k;
        writer.write(str);
        int i = this.f3783m;
        for (int i5 = 1; i5 < i; i5++) {
            writer.write(this.f3784n.f1542b);
        }
    }

    public b n() {
        if (this.f3790t != null) {
            if (!this.f3791u) {
                this.f3790t = null;
                return this;
            }
            G();
        }
        b();
        this.f3781k.write("null");
        return this;
    }

    public final int p() {
        int i = this.f3783m;
        if (i != 0) {
            return this.f3782l[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void r(i iVar) {
        Objects.requireNonNull(iVar);
        this.f3784n = iVar;
        this.f3786p = ",";
        if (iVar.f1543c) {
            this.f3785o = ": ";
            if (iVar.f1541a.isEmpty()) {
                this.f3786p = ", ";
            }
        } else {
            this.f3785o = ":";
        }
        this.f3787q = this.f3784n.f1541a.isEmpty() && this.f3784n.f1542b.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(String str) {
        int i;
        String str2;
        String[] strArr = this.f3789s ? f3780x : f3779w;
        Writer writer = this.f3781k;
        writer.write(34);
        int length = str.length();
        int i5 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i5 < i) {
                    writer.write(str, i5, i - i5);
                }
                writer.write(str2);
                i5 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i5 < i) {
                }
                writer.write(str2);
                i5 = i + 1;
            }
        }
        if (i5 < length) {
            writer.write(str, i5, length - i5);
        }
        writer.write(34);
    }

    public void t(double d5) {
        G();
        if (this.f3788r == 1 || !(Double.isNaN(d5) || Double.isInfinite(d5))) {
            b();
            this.f3781k.append((CharSequence) Double.toString(d5));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d5);
        }
    }

    public void v(long j5) {
        G();
        b();
        this.f3781k.write(Long.toString(j5));
    }
}
