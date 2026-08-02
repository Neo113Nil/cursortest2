package g5;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f13284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13285b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13286c;

    /* renamed from: d, reason: collision with root package name */
    public final m f13287d;

    public n(String str, String str2, long j, m mVar) {
        this.f13284a = str;
        this.f13285b = str2;
        this.f13286c = j;
        this.f13287d = mVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f13284a.equals(nVar.f13284a) && this.f13285b.equals(nVar.f13285b) && this.f13286c == nVar.f13286c && Objects.equals(this.f13287d, nVar.f13287d);
    }
}
