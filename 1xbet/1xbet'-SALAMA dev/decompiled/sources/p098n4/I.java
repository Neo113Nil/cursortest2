package p098n4;

import J2.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p063i4.d;
import p075k4.k;
import p158w4.a;
import v4.c;

/* JADX INFO: loaded from: classes2.dex */
public final class I implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15380a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15381b;

    public I(C0934g c0934g) {
        this.f15381b = 0;
        c0934g.getClass();
        k kVar = new k(c0934g);
        while (kVar.hasNext()) {
            this.f15380a.add(((c) kVar.next()).f17179a);
        }
        this.f15381b = Math.max(1, this.f15380a.size());
        for (int i7 = 0; i7 < this.f15380a.size(); i7++) {
            this.f15381b = f((CharSequence) this.f15380a.get(i7)) + this.f15381b;
        }
        c();
    }

    public static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt <= 127) {
                i8++;
            } else if (cCharAt <= 2047) {
                i8 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i8 += 4;
                i7++;
            } else {
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    @Override // p158w4.a
    public boolean a(byte[] bArr) {
        this.f15380a.add(bArr);
        this.f15381b += bArr.length;
        return true;
    }

    @Override // p158w4.a
    public e b() {
        byte[] bArr = new byte[this.f15381b];
        int i7 = 0;
        int length = 0;
        while (true) {
            ArrayList arrayList = this.f15380a;
            if (i7 >= arrayList.size()) {
                return new e();
            }
            byte[] bArr2 = (byte[]) arrayList.get(i7);
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
            i7++;
        }
    }

    public void c() {
        String string;
        if (this.f15381b > 768) {
            throw new d(p031e1.k.g(new StringBuilder("Data has a key path longer than 768 bytes ("), this.f15381b, ")."));
        }
        ArrayList arrayList = this.f15380a;
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
                string = sb2.toString();
            } else {
                string = "";
            }
            sb.append(string);
            throw new d(sb.toString());
        }
    }

    public void d() {
        ArrayList arrayList = this.f15380a;
        this.f15381b -= f((String) arrayList.remove(arrayList.size() - 1));
        if (arrayList.size() > 0) {
            this.f15381b--;
        }
    }

    public void e(String str) {
        ArrayList arrayList = this.f15380a;
        if (arrayList.size() > 0) {
            this.f15381b++;
        }
        arrayList.add(str);
        this.f15381b = f(str) + this.f15381b;
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
