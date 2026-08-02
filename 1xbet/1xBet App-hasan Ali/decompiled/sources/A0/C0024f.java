package A0;

/* renamed from: A0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024f extends AbstractC0015c {

    /* renamed from: c, reason: collision with root package name */
    public static C0024f f496c;

    @Override // A0.AbstractC0015c
    public final int[] a(int i) {
        int length = e().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && e().charAt(i) == '\n' && (e().charAt(i) == '\n' || (i != 0 && e().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i5 = i + 1;
        while (i5 < length && !q(i5)) {
            i5++;
        }
        return b(i, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // A0.AbstractC0015c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] k(int i) {
        int length = e().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && e().charAt(i - 1) == '\n' && !q(i)) {
            i--;
        }
        int i5 = i - 1;
        while (i5 > 0 && (e().charAt(i5) == '\n' || (i5 != 0 && e().charAt(i5 - 1) != '\n'))) {
            i5--;
        }
        return b(i5, i);
    }

    public final boolean q(int i) {
        if (i <= 0 || e().charAt(i - 1) == '\n') {
            return false;
        }
        return i == e().length() || e().charAt(i) == '\n';
    }
}
