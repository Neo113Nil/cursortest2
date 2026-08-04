package p044f6;

import java.io.Serializable;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13009a;

    public /* synthetic */ f(Object obj) {
        this.f13009a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f13008a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return h.a(this.f13009a, ((f) obj).f13009a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13009a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13009a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
