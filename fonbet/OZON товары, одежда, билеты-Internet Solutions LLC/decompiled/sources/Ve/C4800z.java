package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4800z extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4182dc f32614a;

    public C4800z(AbstractC4182dc result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f32614a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4800z) && Intrinsics.d(this.f32614a, ((C4800z) obj).f32614a);
    }

    public final int hashCode() {
        return Long.hashCode(45000L) + (this.f32614a.hashCode() * 31);
    }

    public final String toString() {
        return "HandleCreateOtpSdkResult(result=" + this.f32614a + ", timerTime=45000)";
    }
}
