package p146u2;

import G4.C0269b;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0269b f16750h = new C0269b(24);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0269b f16751i = new C0269b(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16752a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16758g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q[] f16754c = new Q[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16753b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16755d = -1;

    public S(int i7) {
        this.f16752a = i7;
    }

    public final void a(float f7, int i7) {
        Q q7;
        int i8 = this.f16755d;
        ArrayList arrayList = this.f16753b;
        if (i8 != 1) {
            Collections.sort(arrayList, f16750h);
            this.f16755d = 1;
        }
        int i9 = this.f16758g;
        Q[] qArr = this.f16754c;
        if (i9 > 0) {
            int i10 = i9 - 1;
            this.f16758g = i10;
            q7 = qArr[i10];
        } else {
            q7 = new Q();
        }
        int i11 = this.f16756e;
        this.f16756e = i11 + 1;
        q7.f16747a = i11;
        q7.f16748b = i7;
        q7.f16749c = f7;
        arrayList.add(q7);
        this.f16757f += i7;
        while (true) {
            int i12 = this.f16757f;
            int i13 = this.f16752a;
            if (i12 <= i13) {
                return;
            }
            int i14 = i12 - i13;
            Q q8 = (Q) arrayList.get(0);
            int i15 = q8.f16748b;
            if (i15 <= i14) {
                this.f16757f -= i15;
                arrayList.remove(0);
                int i16 = this.f16758g;
                if (i16 < 5) {
                    this.f16758g = i16 + 1;
                    qArr[i16] = q8;
                }
            } else {
                q8.f16748b = i15 - i14;
                this.f16757f -= i14;
            }
        }
    }

    public final float b() {
        int i7 = this.f16755d;
        ArrayList arrayList = this.f16753b;
        if (i7 != 0) {
            Collections.sort(arrayList, f16751i);
            this.f16755d = 0;
        }
        float f7 = 0.5f * this.f16757f;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Q q7 = (Q) arrayList.get(i9);
            i8 += q7.f16748b;
            if (i8 >= f7) {
                return q7.f16749c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((Q) arrayList.get(arrayList.size() - 1)).f16749c;
    }
}
