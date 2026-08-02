package n4;

import i4.C1267d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k4.C1349k;
import w4.InterfaceC1775a;

/* loaded from: classes2.dex */
public final class I implements InterfaceC1775a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f15374a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f15375b;

    public I(C1473g c1473g) {
        this.f15375b = 0;
        c1473g.getClass();
        C1349k c1349k = new C1349k(c1473g);
        while (c1349k.hasNext()) {
            this.f15374a.add(((v4.c) c1349k.next()).f17173a);
        }
        this.f15375b = Math.max(1, this.f15374a.size());
        for (int i7 = 0; i7 < this.f15374a.size(); i7++) {
            this.f15375b = f((CharSequence) this.f15374a.get(i7)) + this.f15375b;
        }
        c();
    }

    public static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt <= 127) {
                i8++;
            } else if (charAt <= 2047) {
                i8 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i8 += 4;
                i7++;
            } else {
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    @Override // w4.InterfaceC1775a
    public boolean a(byte[] bArr) {
        this.f15374a.add(bArr);
        this.f15375b += bArr.length;
        return true;
    }

    @Override // w4.InterfaceC1775a
    public J2.e b() {
        byte[] bArr = new byte[this.f15375b];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f15374a;
            if (i7 >= arrayList.size()) {
                return new J2.e();
            }
            byte[] bArr2 = (byte[]) arrayList.get(i7);
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            i8 += bArr2.length;
            i7++;
        }
    }

    public void c() {
        String str;
        if (this.f15375b > 768) {
            throw new C1267d(e1.k.g(new StringBuilder("Data has a key path longer than 768 bytes ("), this.f15375b, ")."));
        }
        ArrayList arrayList = this.f15374a;
        if (arrayList.size() > 32) {
            StringBuilder sb = new StringBuilder("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            if (arrayList.size() != 0) {
                StringBuilder sb2 = new StringBuilder("in path '");
                StringBuilder sb3 = new StringBuilder();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (i7 > 0) {
                        sb3.append("/");
                    }
                    sb3.append((String) arrayList.get(i7));
                }
                sb2.append(sb3.toString());
                sb2.append("'");
                str = sb2.toString();
            } else {
                str = "";
            }
            sb.append(str);
            throw new C1267d(sb.toString());
        }
    }

    public void d() {
        ArrayList arrayList = this.f15374a;
        this.f15375b -= f((String) arrayList.remove(arrayList.size() - 1));
        if (arrayList.size() > 0) {
            this.f15375b--;
        }
    }

    public void e(String str) {
        ArrayList arrayList = this.f15374a;
        if (arrayList.size() > 0) {
            this.f15375b++;
        }
        arrayList.add(str);
        this.f15375b = f(str) + this.f15375b;
        c();
    }

    public void g(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    e(str);
                    g(map.get(str));
                    d();
                }
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i7 = 0; i7 < list.size(); i7++) {
                e(Integer.toString(i7));
                g(list.get(i7));
                d();
            }
        }
    }
}
