package A1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends F0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f314c;

    public Y() {
        this.f313b = false;
        this.f314c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y4 = (Y) obj;
        return this.f314c == y4.f314c && this.f313b == y4.f313b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f313b), Boolean.valueOf(this.f314c)});
    }

    public Y(boolean z4) {
        this.f313b = true;
        this.f314c = z4;
    }
}
