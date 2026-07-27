package b0;

import a.AbstractC0086a;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2469a;

    static {
        p c0159e;
        try {
            c0159e = new J1.i(28, (WebViewProviderFactoryBoundaryInterface) F2.b.j(WebViewProviderFactoryBoundaryInterface.class, AbstractC0086a.v()));
        } catch (ClassNotFoundException unused) {
            c0159e = new C0159e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        f2469a = c0159e;
    }
}
