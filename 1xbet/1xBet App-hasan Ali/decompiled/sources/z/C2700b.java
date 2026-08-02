package z;

import java.util.WeakHashMap;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2700b implements InterfaceC2702d, InterfaceC2704f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21528a;

    public /* synthetic */ C2700b(int i) {
        this.f21528a = i;
    }

    public static final C2699a d(String str, int i) {
        WeakHashMap weakHashMap = C2693Q.f21496u;
        return new C2699a(str, i);
    }

    public static final C2691O e(String str, int i) {
        WeakHashMap weakHashMap = C2693Q.f21496u;
        return new C2691O(new C2724z(0, 0, 0, 0), str);
    }

    @Override // z.InterfaceC2702d, z.InterfaceC2704f
    public float a() {
        switch (this.f21528a) {
        }
        return 0;
    }

    @Override // z.InterfaceC2702d
    public void b(x0.Q q5, int i, int[] iArr, W0.m mVar, int[] iArr2) {
        switch (this.f21528a) {
            case 0:
                AbstractC2706h.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC2706h.c(i, iArr, iArr2, false);
                break;
            default:
                if (mVar != W0.m.f6016k) {
                    AbstractC2706h.c(i, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2706h.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // z.InterfaceC2704f
    public void c(int i, x0.Q q5, int[] iArr, int[] iArr2) {
        switch (this.f21528a) {
            case 2:
                AbstractC2706h.c(i, iArr, iArr2, false);
                break;
            default:
                AbstractC2706h.b(iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.f21528a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#Bottom";
            case 3:
                return "Arrangement#Start";
            case 4:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
