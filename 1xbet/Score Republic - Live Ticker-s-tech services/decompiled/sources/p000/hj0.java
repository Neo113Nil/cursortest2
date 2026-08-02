package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3221a = 0;

    /* JADX INFO: renamed from: b */
    public List f3222b;

    /* JADX INFO: renamed from: c */
    public C0831w8 f3223c;

    /* JADX INFO: renamed from: d */
    public Object[][] f3224d;

    public hj0(List list, C0831w8 c0831w8, Object[][] objArr) {
        a90.m127k(list, "addresses are not set");
        this.f3222b = list;
        a90.m127k(c0831w8, "attrs");
        this.f3223c = c0831w8;
        a90.m127k(objArr, "customOptions");
        this.f3224d = objArr;
    }

    /* JADX INFO: renamed from: d */
    public static hj0 m2270d() {
        hj0 hj0Var = new hj0();
        hj0Var.f3223c = C0831w8.f8454b;
        hj0Var.f3224d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return hj0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m2271a(lj0 lj0Var) {
        Object[][] objArr;
        u90 u90Var;
        int length = 0;
        while (true) {
            objArr = this.f3224d;
            int length2 = objArr.length;
            u90Var = mj0.f5055c;
            if (length >= length2) {
                length = -1;
                break;
            } else if (u90Var == objArr[length][0]) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + 1, 2);
            Object[][] objArr3 = this.f3224d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3224d = objArr2;
            length = objArr2.length - 1;
        }
        this.f3224d[length] = new Object[]{u90Var, lj0Var};
    }

    /* JADX INFO: renamed from: b */
    public hj0 m2272b() {
        return new hj0(this.f3222b, this.f3223c, this.f3224d);
    }

    /* JADX INFO: renamed from: c */
    public Object m2273c() {
        int i = 0;
        while (true) {
            Object[][] objArr = this.f3224d;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (mj0.f5055c == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2274e(List list) {
        a90.m122f("addrs is empty", !list.isEmpty());
        this.f3222b = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        switch (this.f3221a) {
            case 1:
                C0809vn c0809vnM5362k = wm1.m5362k(this);
                c0809vnM5362k.m5172c(this.f3222b, "addrs");
                c0809vnM5362k.m5172c(this.f3223c, "attrs");
                c0809vnM5362k.m5172c(Arrays.deepToString(this.f3224d), "customOptions");
                return c0809vnM5362k.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hj0() {
    }
}
