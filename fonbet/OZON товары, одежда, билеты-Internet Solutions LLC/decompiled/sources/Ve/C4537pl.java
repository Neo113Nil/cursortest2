package Ve;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.pl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4537pl extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f31808a;

    public C4537pl(LinkedHashMap notPassedDeviceParams) {
        Intrinsics.checkNotNullParameter(notPassedDeviceParams, "notPassedDeviceParams");
        this.f31808a = notPassedDeviceParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4537pl) && Intrinsics.d(this.f31808a, ((C4537pl) obj).f31808a);
    }

    public final int hashCode() {
        return this.f31808a.hashCode();
    }

    public final String toString() {
        return "DeviceFailedCheck(notPassedDeviceParams=" + this.f31808a + ")";
    }
}
