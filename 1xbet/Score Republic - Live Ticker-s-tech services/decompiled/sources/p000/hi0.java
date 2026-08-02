package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 implements Iterator, sg0 {

    /* JADX INFO: renamed from: j */
    public final String f3213j;

    /* JADX INFO: renamed from: k */
    public int f3214k;

    /* JADX INFO: renamed from: l */
    public int f3215l;

    /* JADX INFO: renamed from: m */
    public int f3216m;

    /* JADX INFO: renamed from: n */
    public int f3217n;

    public hi0(String str) {
        this.f3213j = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f3214k;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f3217n < 0) {
            this.f3214k = 2;
            return false;
        }
        String str = this.f3213j;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f3215l; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f3214k = 1;
                this.f3217n = i;
                this.f3216m = length;
                return true;
            }
        }
        i = -1;
        this.f3214k = 1;
        this.f3217n = i;
        this.f3216m = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3214k = 0;
        int i = this.f3216m;
        int i2 = this.f3215l;
        this.f3215l = this.f3217n + i;
        return this.f3213j.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
