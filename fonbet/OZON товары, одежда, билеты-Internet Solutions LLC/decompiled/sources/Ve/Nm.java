package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Nm extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nm(String endPoint) {
        super("Body from this service ---" + endPoint + "--- can not be null");
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
    }
}
