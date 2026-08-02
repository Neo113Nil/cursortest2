package x0;

import java.io.Serializable;
import k4.AbstractC2036a;

/* renamed from: x0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2631q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21042a;

    /* renamed from: b, reason: collision with root package name */
    public final C2630p f21043b;

    /* renamed from: c, reason: collision with root package name */
    public final C2630p f21044c;

    /* renamed from: d, reason: collision with root package name */
    public final C2630p f21045d;

    /* renamed from: e, reason: collision with root package name */
    public final C2630p f21046e;
    public final Serializable f;

    public C2631q(String str) {
        this.f21042a = 1;
        this.f = str;
        this.f21043b = new C2630p(1, null);
        this.f21044c = new C2630p(0, null);
        this.f21045d = new C2630p(1, null);
        this.f21046e = new C2630p(0, null);
    }

    public final C2630p a() {
        switch (this.f21042a) {
        }
        return this.f21046e;
    }

    public final C2630p b() {
        switch (this.f21042a) {
        }
        return this.f21043b;
    }

    public final C2630p c() {
        switch (this.f21042a) {
        }
        return this.f21045d;
    }

    public final C2630p d() {
        switch (this.f21042a) {
        }
        return this.f21044c;
    }

    public final String toString() {
        switch (this.f21042a) {
            case 0:
                C2631q[] c2631qArr = (C2631q[]) this.f;
                kotlin.jvm.internal.l.f("<this>", c2631qArr);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (C2631q c2631q : c2631qArr) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    AbstractC2036a.j(sb, c2631q, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                String str = (String) this.f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2631q(C2631q[] c2631qArr) {
        this.f21042a = 0;
        this.f = c2631qArr;
        int length = c2631qArr.length;
        C2630p[] c2630pArr = new C2630p[length];
        for (int i = 0; i < length; i++) {
            c2630pArr[i] = ((C2631q[]) this.f)[i].b();
        }
        this.f21043b = new C2630p(1, new l0(c2630pArr, 0));
        int length2 = ((C2631q[]) this.f).length;
        C2630p[] c2630pArr2 = new C2630p[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            c2630pArr2[i5] = ((C2631q[]) this.f)[i5].d();
        }
        this.f21044c = new C2630p(0, new C2629o(c2630pArr2, 0));
        int length3 = ((C2631q[]) this.f).length;
        C2630p[] c2630pArr3 = new C2630p[length3];
        for (int i6 = 0; i6 < length3; i6++) {
            c2630pArr3[i6] = ((C2631q[]) this.f)[i6].c();
        }
        this.f21045d = new C2630p(1, new l0(c2630pArr3, 1));
        int length4 = ((C2631q[]) this.f).length;
        C2630p[] c2630pArr4 = new C2630p[length4];
        for (int i7 = 0; i7 < length4; i7++) {
            c2630pArr4[i7] = ((C2631q[]) this.f)[i7].a();
        }
        this.f21046e = new C2630p(0, new C2629o(c2630pArr4, 1));
    }
}
