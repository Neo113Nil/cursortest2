package p000;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: yv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0928yv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9504a;

    /* JADX INFO: renamed from: b */
    public int f9505b;

    /* JADX INFO: renamed from: c */
    public int f9506c;

    /* JADX INFO: renamed from: d */
    public int f9507d;

    /* JADX INFO: renamed from: e */
    public final Object f9508e;

    /* JADX INFO: renamed from: f */
    public Object f9509f;

    /* JADX INFO: renamed from: g */
    public Object f9510g;

    public C0928yv(vm1 vm1Var, Object[] objArr, StringBuilder sb) {
        this.f9504a = 2;
        this.f9505b = 0;
        this.f9506c = -1;
        p80.m3874s(vm1Var, "context");
        this.f9508e = vm1Var;
        this.f9507d = 0;
        this.f9509f = objArr;
        this.f9510g = sb;
    }

    /* JADX INFO: renamed from: h */
    public static void m5839h(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(rb2.m4300a(obj));
        sb.append("]");
    }

    /* JADX INFO: renamed from: a */
    public void m5840a() {
        this.f9505b = 1;
        this.f9509f = (sp0) this.f9508e;
        this.f9507d = 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5841b() {
        qp0 qp0VarM202b = ((sp0) this.f9509f).f7185b.m202b();
        int iM3375a = qp0VarM202b.m3375a(6);
        return !(iM3375a == 0 || qp0VarM202b.f5024b.get(iM3375a + qp0VarM202b.f5023a) == 0) || this.f9506c == 65039;
    }

    /* JADX INFO: renamed from: c */
    public void m5842c() {
        if (this.f9506c == 0) {
            return;
        }
        HashMap map = ((fa2) this.f9510g).f2365d;
        int[] iArr = (int[]) this.f9508e;
        fa2 fa2Var = (fa2) map.get(Integer.valueOf(iArr[this.f9505b]));
        while (true) {
            int i = (fa2Var.f2363b - fa2Var.f2362a) + 1;
            int i2 = this.f9506c;
            if (i > i2) {
                return;
            }
            int i3 = this.f9505b + i;
            this.f9505b = i3;
            this.f9510g = fa2Var;
            int i4 = i2 - i;
            this.f9506c = i4;
            if (i4 > 0) {
                fa2Var = (fa2) fa2Var.f2365d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5843d() {
        fa2 fa2Var = ((fa2) this.f9510g).f2364c;
        if (fa2Var != null) {
            this.f9510g = fa2Var;
        } else {
            this.f9510g = (fa2) this.f9509f;
            int i = this.f9506c;
            if (i > 0) {
                this.f9506c = i - 1;
            }
            if (this.f9507d > 0) {
                this.f9505b++;
            }
        }
        m5842c();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    /* JADX INFO: renamed from: e */
    public void m5844e(Object obj, nb2 nb2Var, pb2 pb2Var) {
        String simpleName;
        pb2 pb2Var2;
        boolean zIsValidCodePoint;
        StringBuilder sb = (StringBuilder) this.f9510g;
        int i = nb2Var.f5364k;
        String string = nb2Var.f5366m;
        int iM292o = AbstractC0024an.m292o(i);
        if (iM292o != 0) {
            if (iM292o == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iM292o != 2) {
                if (iM292o != 3) {
                    if (iM292o != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                m5839h(sb, obj, string);
                return;
            }
        }
        int iOrdinal = nb2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (pb2Var.m3897a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (pb2Var.m3897a()) {
                            pb2Var2 = pb2Var;
                        } else {
                            int i2 = pb2Var.f6077a;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                pb2Var2 = pb2.f6076e;
                            } else if (i3 == i2 && pb2Var.f6078b == -1 && pb2Var.f6079c == -1) {
                                pb2Var2 = pb2Var;
                            } else {
                                pb2Var2 = new pb2(i3, -1, -1);
                            }
                        }
                        if (pb2Var2.equals(pb2Var)) {
                            Number number = (Number) obj;
                            Locale locale = rb2.f6801a;
                            boolean zM3899c = pb2Var.m3899c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                rb2.m4301b(sb, jLongValue, zM3899c);
                                return;
                            }
                            if (number instanceof Integer) {
                                rb2.m4301b(sb, jLongValue & 4294967295L, zM3899c);
                                return;
                            }
                            if (number instanceof Byte) {
                                rb2.m4301b(sb, jLongValue & 255, zM3899c);
                                return;
                            }
                            if (number instanceof Short) {
                                rb2.m4301b(sb, jLongValue & 65535, zM3899c);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                C0270h1.m2191g("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zM3899c) {
                                string2 = string2.toUpperCase(rb2.f6801a);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (pb2Var.m3897a()) {
                    sb.append(obj);
                    return;
                }
            } else if (pb2Var.m3897a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = rb2.f6801a;
                int i4 = pb2Var.f6077a;
                int i5 = i4 & 162;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, rb2.f6801a);
                try {
                    formattable.formatTo(formatter, i5, pb2Var.f6078b, pb2Var.f6079c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(rb2.m4302c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (pb2Var.m3897a()) {
                sb.append(rb2.m4300a(obj));
                return;
            }
        }
        if (!pb2Var.m3897a()) {
            int i6 = nb2Var.f5363j;
            if (pb2Var.m3899c()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            pb2Var.m3900d(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(rb2.f6801a, string, obj));
    }

    /* JADX INFO: renamed from: f */
    public void m5845f(fa2 fa2Var, StringBuilder sb) {
        for (fa2 fa2Var2 : fa2Var.f2365d.values()) {
            sb.append("  ");
            sb.append(fa2Var);
            sb.append(" -> ");
            sb.append(fa2Var2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.f9508e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, fa2Var2.f2362a, Math.min(iArr.length, fa2Var2.f2363b + 1))));
            sb.append("\"]\n");
            m5845f(fa2Var2, sb);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m5846g(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.f9508e;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.f9504a) {
            case 1:
                StringBuilder sb = new StringBuilder("digraph {\n");
                m5845f((fa2) this.f9509f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0928yv(int[] iArr) {
        this.f9504a = 1;
        this.f9508e = iArr;
        fa2 fa2Var = new fa2(-1, -1);
        this.f9509f = fa2Var;
        this.f9510g = fa2Var;
    }

    public C0928yv(sp0 sp0Var) {
        this.f9504a = 0;
        this.f9505b = 1;
        this.f9508e = sp0Var;
        this.f9509f = sp0Var;
    }
}
