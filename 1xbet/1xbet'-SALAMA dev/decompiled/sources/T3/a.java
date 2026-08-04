package T3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6342b = new a(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6343a;

    public a(Map map) {
        this.f6343a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6343a.equals(((a) obj).f6343a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6343a.hashCode();
    }

    public final String toString() {
        return this.f6343a.toString();
    }
}
