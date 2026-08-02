package W;

import android.net.Uri;
import androidx.annotation.NonNull;

/* renamed from: W.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4837h extends AbstractC4850v {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f33065a;

    C4837h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f33065a = uri;
    }

    @Override // W.AbstractC4850v
    @NonNull
    public final Uri a() {
        return this.f33065a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4850v) {
            return this.f33065a.equals(((AbstractC4850v) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f33065a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.f33065a + "}";
    }
}
