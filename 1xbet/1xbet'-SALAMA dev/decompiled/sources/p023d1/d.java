package p023d1;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f12357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12358b;

    public d(boolean z4, Uri uri) {
        this.f12357a = uri;
        this.f12358b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12358b == dVar.f12358b && this.f12357a.equals(dVar.f12357a);
    }

    public final int hashCode() {
        return (this.f12357a.hashCode() * 31) + (this.f12358b ? 1 : 0);
    }
}
