package e2;

import A0.J0;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: e2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1934o {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1935p f16917a;

    static {
        InterfaceC1935p c1927h;
        try {
            c1927h = new J0((WebViewProviderFactoryBoundaryInterface) N4.b.m(WebViewProviderFactoryBoundaryInterface.class, G4.d.r()));
        } catch (ClassNotFoundException unused) {
            c1927h = new C1927h();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
        f16917a = c1927h;
    }
}
