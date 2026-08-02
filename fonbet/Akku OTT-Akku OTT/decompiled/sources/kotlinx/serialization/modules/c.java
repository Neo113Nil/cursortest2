package kotlinx.serialization.modules;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
