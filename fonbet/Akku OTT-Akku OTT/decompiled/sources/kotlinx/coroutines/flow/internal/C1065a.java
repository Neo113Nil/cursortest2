package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.flow.InterfaceC1061f;

/* renamed from: kotlinx.coroutines.flow.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1065a extends CancellationException {

    @JvmField
    public final transient Object a;

    public C1065a(InterfaceC1061f interfaceC1061f) {
        super("Flow was aborted, no more elements needed");
        this.a = interfaceC1061f;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
