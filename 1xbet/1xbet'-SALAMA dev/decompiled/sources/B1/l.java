package B1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1012c;

    public int a() {
        int i7 = this.f1012c;
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 5) {
            return 11;
        }
        if (i7 == 29) {
            return 12;
        }
        if (i7 == 42) {
            return 16;
        }
        if (i7 != 22) {
            return i7 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public String toString() {
        switch (this.f1010a) {
            case 1:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f1011b + ", mEndLine=" + this.f1012c + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(int i7, int i8, int i9) {
        this.f1010a = i9;
        this.f1011b = i7;
        this.f1012c = i8;
    }

    public l(int i7) {
        this.f1010a = 4;
        this.f1011b = i7;
        this.f1012c = (int) (System.currentTimeMillis() / 1000);
    }
}
