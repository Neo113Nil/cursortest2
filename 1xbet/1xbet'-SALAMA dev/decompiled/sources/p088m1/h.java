package p088m1;

import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15221b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f15221b != hVar.f15221b) {
            return false;
        }
        return this.f15220a.equals(hVar.f15220a);
    }

    public final int hashCode() {
        return e.e(this.f15221b) + (this.f15220a.hashCode() * 31);
    }
}
