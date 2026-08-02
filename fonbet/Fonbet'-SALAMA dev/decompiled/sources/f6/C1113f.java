package f6;

import java.io.Serializable;

/* renamed from: f6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1113f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13003a;

    public /* synthetic */ C1113f(Object obj) {
        this.f13003a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C1112e) {
            return ((C1112e) obj).f13002a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1113f) {
            return t6.h.a(this.f13003a, ((C1113f) obj).f13003a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13003a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13003a;
        if (obj instanceof C1112e) {
            return ((C1112e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
