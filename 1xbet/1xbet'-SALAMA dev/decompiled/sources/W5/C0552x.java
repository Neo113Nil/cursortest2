package W5;

import U5.C0435b;
import U5.C0458z;
import java.util.Arrays;

/* JADX INFO: renamed from: W5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0552x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0435b f7388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0458z f7389c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0552x)) {
            return false;
        }
        C0552x c0552x = (C0552x) obj;
        return this.f7387a.equals(c0552x.f7387a) && this.f7388b.equals(c0552x.f7388b) && p097n3.a.t(null, null) && p097n3.a.t(this.f7389c, c0552x.f7389c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7387a, this.f7388b, null, this.f7389c});
    }
}
