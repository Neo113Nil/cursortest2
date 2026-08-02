package O3;

import android.content.Context;
import x0.Q;
import z.AbstractC2706h;
import z.InterfaceC2702d;
import z.InterfaceC2704f;

/* loaded from: classes.dex */
public final class m implements InterfaceC2702d, InterfaceC2704f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4083a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4084b;

    public m(int i) {
        this.f4083a = i;
        switch (i) {
            case 2:
                this.f4084b = 0;
                break;
            case 3:
                this.f4084b = 0;
                break;
            case 4:
                this.f4084b = 0;
                break;
            default:
                this.f4084b = 0;
                break;
        }
    }

    @Override // z.InterfaceC2702d, z.InterfaceC2704f
    public float a() {
        switch (this.f4083a) {
        }
        return this.f4084b;
    }

    @Override // z.InterfaceC2702d
    public void b(Q q5, int i, int[] iArr, W0.m mVar, int[] iArr2) {
        switch (this.f4083a) {
            case 1:
                if (mVar != W0.m.f6016k) {
                    AbstractC2706h.a(i, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2706h.a(i, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (mVar != W0.m.f6016k) {
                    AbstractC2706h.d(i, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2706h.d(i, iArr, iArr2, false);
                    break;
                }
            case 3:
                if (mVar != W0.m.f6016k) {
                    AbstractC2706h.e(i, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2706h.e(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (mVar != W0.m.f6016k) {
                    AbstractC2706h.f(i, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2706h.f(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // z.InterfaceC2704f
    public void c(int i, Q q5, int[] iArr, int[] iArr2) {
        switch (this.f4083a) {
            case 1:
                AbstractC2706h.a(i, iArr, iArr2, false);
                break;
            case 2:
                AbstractC2706h.d(i, iArr, iArr2, false);
                break;
            case 3:
                AbstractC2706h.e(i, iArr, iArr2, false);
                break;
            default:
                AbstractC2706h.f(i, iArr, iArr2, false);
                break;
        }
    }

    public int d(int i) {
        return (int) (i * this.f4084b);
    }

    public String toString() {
        switch (this.f4083a) {
            case 1:
                return "Arrangement#Center";
            case 2:
                return "Arrangement#SpaceAround";
            case 3:
                return "Arrangement#SpaceBetween";
            case 4:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    public m(Context context) {
        this.f4083a = 0;
        kotlin.jvm.internal.l.f("context", context);
        this.f4084b = context.getResources().getDisplayMetrics().density;
    }
}
