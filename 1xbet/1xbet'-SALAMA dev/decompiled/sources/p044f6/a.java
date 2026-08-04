package p044f6;

import io.sentry.protocol.Request;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13003b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13004a = 131328;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        h.e(aVar, Request.JsonKeys.OTHER);
        return this.f13004a - aVar.f13004a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a aVar = obj instanceof a ? (a) obj : null;
        return aVar != null && this.f13004a == aVar.f13004a;
    }

    public final int hashCode() {
        return this.f13004a;
    }

    public final String toString() {
        return "2.1.0";
    }
}
