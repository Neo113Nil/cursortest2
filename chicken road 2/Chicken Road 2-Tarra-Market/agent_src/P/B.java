package P;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public int f286a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f287b;

    public B(N.b bVar, int i2) {
        Q.s.c(bVar);
        this.f287b = bVar;
        this.f286a = i2;
    }

    public int a() {
        if ((this.f286a & 128) != 0) {
            return ((int[]) this.f287b)[7];
        }
        return 65535;
    }

    public void b(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = (int[]) this.f287b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f286a = (1 << i2) | this.f286a;
            iArr[i2] = i3;
        }
    }

    public B() {
        this.f287b = new int[10];
    }

    public B(int i2, s0.v[] vVarArr) {
        this.f286a = i2;
        this.f287b = vVarArr;
    }

    public B(ArrayList arrayList) {
        this.f286a = 0;
        this.f287b = arrayList;
    }
}
