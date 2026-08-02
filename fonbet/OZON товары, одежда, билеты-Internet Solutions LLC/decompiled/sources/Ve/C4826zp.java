package Ve;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.zp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4826zp implements InterfaceC4195dq {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f32679a;

    public C4826zp() {
        this.f32679a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4826zp) && Intrinsics.d(this.f32679a, ((C4826zp) obj).f32679a);
    }

    public final int hashCode() {
        Uri uri = this.f32679a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "OnProcessAuthSdk(url=" + this.f32679a + ")";
    }

    public C4826zp(Uri uri) {
        this.f32679a = uri;
    }
}
