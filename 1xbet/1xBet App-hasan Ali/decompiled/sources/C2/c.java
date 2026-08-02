package C2;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f820a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f821b;

    public c(Bitmap bitmap, Map map) {
        this.f820a = bitmap;
        this.f821b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f820a, cVar.f820a) && l.a(this.f821b, cVar.f821b);
    }

    public final int hashCode() {
        return this.f821b.hashCode() + (this.f820a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f820a + ", extras=" + this.f821b + ')';
    }
}
