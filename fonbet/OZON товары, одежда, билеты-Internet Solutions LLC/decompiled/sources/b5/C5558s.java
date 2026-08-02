package b5;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import yf.C10890a;

/* renamed from: b5.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5558s {

    /* renamed from: b5.s$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final C5561v f55542a = new C5561v(b.f55543a.getWebkitToCompatConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b5.s$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        static final InterfaceC5559t f55543a = C5558s.a();
    }

    @NonNull
    static InterfaceC5559t a() {
        try {
            return new C5560u((WebViewProviderFactoryBoundaryInterface) C10890a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new C5554o();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = C5546g.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(e13);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    @NonNull
    public static C5561v c() {
        return a.f55542a;
    }
}
