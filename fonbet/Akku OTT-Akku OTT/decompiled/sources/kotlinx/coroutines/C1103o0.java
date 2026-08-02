package kotlinx.coroutines;

import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmName;

/* renamed from: kotlinx.coroutines.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1103o0 {
    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    public static final I a(Executor executor) {
        I i;
        ExecutorC1047b0 executorC1047b0 = executor instanceof ExecutorC1047b0 ? (ExecutorC1047b0) executor : null;
        return (executorC1047b0 == null || (i = executorC1047b0.a) == null) ? new C1101n0(executor) : i;
    }
}
