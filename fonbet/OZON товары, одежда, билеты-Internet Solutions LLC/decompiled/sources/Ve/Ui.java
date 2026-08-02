package Ve;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ui extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f30129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ui(LinkedHashMap notPassedDeviceParams) {
        super(12);
        Intrinsics.checkNotNullParameter(notPassedDeviceParams, "notPassedDeviceParams");
        this.f30129b = notPassedDeviceParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ui) && Intrinsics.d(this.f30129b, ((Ui) obj).f30129b);
    }

    public final int hashCode() {
        return this.f30129b.hashCode();
    }

    @Override // Lf.a
    public final String toString() {
        return "DeviceFailedCheck(notPassedDeviceParams=" + this.f30129b + ")";
    }
}
