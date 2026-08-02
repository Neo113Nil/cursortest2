package Ve;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.xd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4758xd implements InterfaceC4126be {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f32484a;

    public C4758xd(Uri uri) {
        this.f32484a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4758xd) && Intrinsics.d(this.f32484a, ((C4758xd) obj).f32484a);
    }

    public final int hashCode() {
        Uri uri = this.f32484a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "OnProcessRedirectUrl(url=" + this.f32484a + ")";
    }
}
