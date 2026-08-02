package Ha;

import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c extends ProtocolException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
