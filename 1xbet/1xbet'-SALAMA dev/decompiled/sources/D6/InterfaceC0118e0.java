package D6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: D6.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0118e0 extends p065i6.g {
    InterfaceC0133p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    B6.b getChildren();

    InterfaceC0118e0 getParent();

    O invokeOnCompletion(Function1 function1);

    O invokeOnCompletion(boolean z4, boolean z7, Function1 function1);

    boolean isActive();

    Object join(p065i6.d dVar);

    boolean start();
}
