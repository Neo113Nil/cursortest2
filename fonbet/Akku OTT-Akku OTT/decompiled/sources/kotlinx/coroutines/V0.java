package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
/* loaded from: classes5.dex */
public final class V0 extends CancellationException {

    @JvmField
    public final transient InterfaceC1120x0 a;

    public V0(String str, InterfaceC1120x0 interfaceC1120x0) {
        super(str);
        this.a = interfaceC1120x0;
    }
}
