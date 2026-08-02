package S0;

import a.AbstractC0603a;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final A f6312a;

    static {
        A hVar;
        try {
            hVar = new B((WebViewProviderFactoryBoundaryInterface) P6.b.a(WebViewProviderFactoryBoundaryInterface.class, AbstractC0603a.U()), 6);
        } catch (ClassNotFoundException unused) {
            hVar = new h();
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e8) {
            e = e8;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e9) {
            e = e9;
            throw new RuntimeException(e);
        }
        f6312a = hVar;
    }
}
