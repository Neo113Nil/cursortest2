package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import com.google.android.exoplayer2.Format$Builder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F1.v[] f5123c;

    public B(int i7, List list) {
        this.f5121a = i7;
        switch (i7) {
            case 1:
                this.f5122b = list;
                this.f5123c = new F1.v[list.size()];
                break;
            default:
                this.f5122b = list;
                this.f5123c = new F1.v[list.size()];
                break;
        }
    }

    public void a(long j, C0095a c0095a) {
        if (c0095a.d() < 9) {
            return;
        }
        int iG = c0095a.g();
        int iG2 = c0095a.g();
        int iT = c0095a.t();
        if (iG == 434 && iG2 == 1195456820 && iT == 3) {
            P6.b.f(j, c0095a, this.f5123c);
        }
    }

    public final void b(F1.m mVar, J j) {
        switch (this.f5121a) {
            case 0:
                int i7 = 0;
                while (true) {
                    F1.v[] vVarArr = this.f5123c;
                    if (i7 < vVarArr.length) {
                        j.a();
                        j.d();
                        F1.v vVarR = mVar.r(j.f1236c, 3);
                        X x4 = (X) this.f5122b.get(i7);
                        String str = x4.f283C;
                        p151v2.a.e("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = x4.f304a;
                        if (str2 == null) {
                            j.d();
                            str2 = (String) j.f1238e;
                        }
                        Format$Builder format$Builder = new Format$Builder();
                        format$Builder.f10528a = str2;
                        format$Builder.f10537k = str;
                        format$Builder.f10531d = x4.f307d;
                        format$Builder.f10530c = x4.f306c;
                        format$Builder.f10526C = x4.f301U;
                        format$Builder.f10539m = x4.f285E;
                        vVarR.a(new X(format$Builder));
                        vVarArr[i7] = vVarR;
                        i7++;
                    }
                    break;
                }
                break;
            default:
                int i8 = 0;
                while (true) {
                    F1.v[] vVarArr2 = this.f5123c;
                    if (i8 < vVarArr2.length) {
                        j.a();
                        j.d();
                        F1.v vVarR2 = mVar.r(j.f1236c, 3);
                        X x7 = (X) this.f5122b.get(i8);
                        String str3 = x7.f283C;
                        p151v2.a.e("Invalid closed caption mime type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        Format$Builder format$Builder2 = new Format$Builder();
                        j.d();
                        format$Builder2.f10528a = (String) j.f1238e;
                        format$Builder2.f10537k = str3;
                        format$Builder2.f10531d = x7.f307d;
                        format$Builder2.f10530c = x7.f306c;
                        format$Builder2.f10526C = x7.f301U;
                        format$Builder2.f10539m = x7.f285E;
                        vVarR2.a(new X(format$Builder2));
                        vVarArr2[i8] = vVarR2;
                        i8++;
                    }
                    break;
                }
                break;
        }
    }
}
