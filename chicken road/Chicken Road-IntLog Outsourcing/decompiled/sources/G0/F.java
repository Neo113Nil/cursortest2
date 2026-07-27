package G0;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC0326e;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C0329f;
import com.google.android.gms.internal.play_billing.InterfaceC0335h;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;
import g4.C0463h;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f752a;

    /* renamed from: b, reason: collision with root package name */
    public int f753b;

    /* renamed from: c, reason: collision with root package name */
    public Object f754c;

    public /* synthetic */ F(int i2, byte b6) {
        this.f752a = i2;
    }

    public void a(int i2, int i3) {
        int i6 = i3 + i2;
        char[] cArr = (char[]) this.f754c;
        if (cArr.length <= i6) {
            int i7 = i2 * 2;
            if (i6 < i7) {
                i6 = i7;
            }
            char[] copyOf = Arrays.copyOf(cArr, i6);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f754c = copyOf;
        }
    }

    public void b(int i2, j5.d dVar) {
        while (true) {
            int i3 = i2 >> 1;
            if (i3 == 0) {
                break;
            }
            j5.d dVar2 = ((j5.d[]) this.f754c)[i3];
            kotlin.jvm.internal.i.b(dVar2);
            if (kotlin.jvm.internal.i.h(0L, dVar.f10536c - dVar2.f10536c) <= 0) {
                break;
            }
            dVar2.f10488f = i2;
            ((j5.d[]) this.f754c)[i2] = dVar2;
            i2 = i3;
        }
        ((j5.d[]) this.f754c)[i2] = dVar;
        dVar.f10488f = i2;
    }

    public void c() {
        R4.b bVar = R4.b.f2675c;
        char[] array = (char[]) this.f754c;
        bVar.getClass();
        kotlin.jvm.internal.i.e(array, "array");
        synchronized (bVar) {
            int i2 = bVar.f2676a;
            if (array.length + i2 < R4.a.f2674a) {
                bVar.f2676a = i2 + array.length;
                ((C0463h) bVar.f2677b).addLast(array);
            }
        }
    }

    public void d(j5.d node) {
        j5.d dVar;
        kotlin.jvm.internal.i.e(node, "node");
        int i2 = node.f10488f;
        if (i2 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = this.f753b;
        j5.d dVar2 = ((j5.d[]) this.f754c)[i3];
        kotlin.jvm.internal.i.b(dVar2);
        node.f10488f = -1;
        ((j5.d[]) this.f754c)[i3] = null;
        this.f753b = i3 - 1;
        if (node == dVar2) {
            return;
        }
        int h3 = kotlin.jvm.internal.i.h(0L, dVar2.f10536c - node.f10536c);
        if (h3 == 0) {
            ((j5.d[]) this.f754c)[i2] = dVar2;
            dVar2.f10488f = i2;
            return;
        }
        if (h3 >= 0) {
            b(i2, dVar2);
            return;
        }
        while (true) {
            int i6 = i2 << 1;
            int i7 = i6 + 1;
            int i8 = this.f753b;
            if (i7 > i8) {
                if (i6 > i8) {
                    break;
                }
                dVar = ((j5.d[]) this.f754c)[i6];
                kotlin.jvm.internal.i.b(dVar);
            } else {
                dVar = ((j5.d[]) this.f754c)[i6];
                kotlin.jvm.internal.i.b(dVar);
                j5.d dVar3 = ((j5.d[]) this.f754c)[i7];
                kotlin.jvm.internal.i.b(dVar3);
                if (kotlin.jvm.internal.i.h(0L, dVar3.f10536c - dVar.f10536c) >= 0) {
                    dVar = dVar3;
                }
            }
            if (kotlin.jvm.internal.i.h(0L, dVar.f10536c - dVar2.f10536c) <= 0) {
                break;
            }
            int i9 = dVar.f10488f;
            dVar.f10488f = i2;
            ((j5.d[]) this.f754c)[i2] = dVar;
            i2 = i9;
        }
        ((j5.d[]) this.f754c)[i2] = dVar2;
        dVar2.f10488f = i2;
    }

    public void e(String text) {
        kotlin.jvm.internal.i.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f753b, length);
        text.getChars(0, text.length(), (char[]) this.f754c, this.f753b);
        this.f753b += length;
    }

    public void f(s2 s2Var) {
        String str;
        J j2 = (J) this.f754c;
        int i2 = this.f753b;
        j2.getClass();
        try {
            if (j2.f762H == null) {
                throw null;
            }
            InterfaceC0335h interfaceC0335h = j2.f762H;
            String packageName = j2.f760F.getPackageName();
            switch (i2) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            G g6 = new G(s2Var);
            C0329f c0329f = (C0329f) interfaceC0335h;
            Parcel c2 = c0329f.c();
            c2.writeString(packageName);
            c2.writeString(str);
            int i3 = AbstractC0326e.f5173a;
            c2.writeStrongBinder(g6);
            c0329f.f(c2, 1);
        } catch (Exception e3) {
            j2.Q(107, 28, O.f770E);
            AbstractC0357o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", e3);
            s2Var.f5256d = true;
            u2 u2Var = s2Var.f5254b;
            if (u2Var != null) {
                t2 t2Var = u2Var.f5269b;
                t2Var.getClass();
                if (r2.f5245f.D(t2Var, null, 0)) {
                    r2.d(t2Var);
                    s2Var.f5253a = null;
                    s2Var.f5254b = null;
                    s2Var.f5255c = null;
                }
            }
        }
    }

    public String toString() {
        switch (this.f752a) {
            case 4:
                return new String((char[]) this.f754c, 0, this.f753b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ F(int i2, int i3, Object obj) {
        this.f752a = i3;
        this.f754c = obj;
        this.f753b = i2;
    }

    public /* synthetic */ F(int i2, int i3, Object[] objArr) {
        this.f752a = i3;
        this.f753b = i2;
        this.f754c = objArr;
    }

    public F(l1.b bVar, int i2) {
        this.f752a = 7;
        o1.u.g(bVar);
        this.f754c = bVar;
        this.f753b = i2;
    }

    public F(int i2) {
        this.f752a = 2;
        if (i2 > 0) {
            this.f754c = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public F(ArrayList arrayList) {
        this.f752a = 5;
        this.f754c = arrayList;
    }
}
