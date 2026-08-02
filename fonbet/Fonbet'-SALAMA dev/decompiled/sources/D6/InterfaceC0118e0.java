package D6;

import i6.InterfaceC1287d;
import i6.InterfaceC1290g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* renamed from: D6.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0118e0 extends InterfaceC1290g {
    InterfaceC0133p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    B6.b getChildren();

    InterfaceC0118e0 getParent();

    O invokeOnCompletion(Function1 function1);

    O invokeOnCompletion(boolean z4, boolean z7, Function1 function1);

    boolean isActive();

    Object join(InterfaceC1287d interfaceC1287d);

    boolean start();
}
