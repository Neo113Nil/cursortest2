package E4;

import java.util.ArrayList;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final C f2156a;

    /* renamed from: b, reason: collision with root package name */
    public final H4.i f2157b;

    /* renamed from: c, reason: collision with root package name */
    public final H4.i f2158c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2159d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2160e;

    /* renamed from: f, reason: collision with root package name */
    public final C1343e f2161f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2162g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2163h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2164i;

    public O(C c3, H4.i iVar, H4.i iVar2, ArrayList arrayList, boolean z4, C1343e c1343e, boolean z7, boolean z8, boolean z9) {
        this.f2156a = c3;
        this.f2157b = iVar;
        this.f2158c = iVar2;
        this.f2159d = arrayList;
        this.f2160e = z4;
        this.f2161f = c1343e;
        this.f2162g = z7;
        this.f2163h = z8;
        this.f2164i = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        if (this.f2160e == o7.f2160e && this.f2162g == o7.f2162g && this.f2163h == o7.f2163h && this.f2156a.equals(o7.f2156a) && this.f2161f.equals(o7.f2161f) && this.f2157b.equals(o7.f2157b) && this.f2158c.equals(o7.f2158c) && this.f2164i == o7.f2164i) {
            return this.f2159d.equals(o7.f2159d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f2161f.f14775a.hashCode() + ((this.f2159d.hashCode() + ((this.f2158c.hashCode() + ((this.f2157b.hashCode() + (this.f2156a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f2160e ? 1 : 0)) * 31) + (this.f2162g ? 1 : 0)) * 31) + (this.f2163h ? 1 : 0)) * 31) + (this.f2164i ? 1 : 0);
    }

    public final String toString() {
        return "ViewSnapshot(" + this.f2156a + ", " + this.f2157b + ", " + this.f2158c + ", " + this.f2159d + ", isFromCache=" + this.f2160e + ", mutatedKeys=" + this.f2161f.f14775a.size() + ", didSyncStateChange=" + this.f2162g + ", excludesMetadataChanges=" + this.f2163h + ", hasCachedResults=" + this.f2164i + ")";
    }
}
