package com.google.common.base;

import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C1124z0;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.InterfaceC1120x0;

/* loaded from: classes4.dex */
public final class r {
    public static C1124z0 a() {
        return new C1124z0(null);
    }

    public static final void b(CoroutineContext coroutineContext, CancellationException cancellationException) {
        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) coroutineContext.get(InterfaceC1120x0.a.a);
        if (interfaceC1120x0 != null) {
            interfaceC1120x0.cancel(cancellationException);
        }
    }

    public static final Object c(InterfaceC1120x0 interfaceC1120x0, SuspendLambda suspendLambda) {
        interfaceC1120x0.cancel((CancellationException) null);
        Object join = interfaceC1120x0.join(suspendLambda);
        return join == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : Unit.INSTANCE;
    }

    public static final void d(CoroutineContext coroutineContext) {
        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) coroutineContext.get(InterfaceC1120x0.a.a);
        if (interfaceC1120x0 != null && !interfaceC1120x0.isActive()) {
            throw interfaceC1120x0.getCancellationException();
        }
    }

    public static final InterfaceC1120x0 e(CoroutineContext coroutineContext) {
        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) coroutineContext.get(InterfaceC1120x0.a.a);
        if (interfaceC1120x0 != null) {
            return interfaceC1120x0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final InterfaceC1053e0 f(InterfaceC1120x0 interfaceC1120x0, boolean z, B0 b0) {
        return interfaceC1120x0 instanceof C0 ? ((C0) interfaceC1120x0).J(z, b0) : interfaceC1120x0.invokeOnCompletion(b0.i(), z, new A0(1, b0, B0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static String g(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder a = androidx.appcompat.view.a.a("<", str2, " threw ");
                    a.append(e.getClass().getName());
                    a.append(">");
                    sb = a.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
