package E6;

import D6.B;
import android.os.Build;
import i6.AbstractC1284a;
import i6.InterfaceC1290g;
import i6.InterfaceC1292i;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public final class b extends AbstractC1284a implements InterfaceC1290g {
    private volatile Object _preHandler;

    public b() {
        super(B.f1774a);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(InterfaceC1292i interfaceC1292i, Throwable th) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (26 > i7 || i7 >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            method = (Method) obj;
        } else {
            try {
                method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (Modifier.isPublic(method.getModifiers())) {
                }
            } catch (Throwable unused) {
            }
            method = null;
            this._preHandler = method;
        }
        Object invoke = method != null ? method.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
