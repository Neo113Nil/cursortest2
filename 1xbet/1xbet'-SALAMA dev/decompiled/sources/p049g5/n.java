package p049g5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f13293d;

    public n(String str, String str2, long j, m mVar) {
        this.f13290a = str;
        this.f13291b = str2;
        this.f13292c = j;
        this.f13293d = mVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f13290a.equals(nVar.f13290a) && this.f13291b.equals(nVar.f13291b) && this.f13292c == nVar.f13292c && Objects.equals(this.f13293d, nVar.f13293d);
    }
}
