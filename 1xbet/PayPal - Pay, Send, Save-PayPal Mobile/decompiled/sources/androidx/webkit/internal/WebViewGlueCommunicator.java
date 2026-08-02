package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewGlueCommunicator {
    public static androidx.webkit.internal.WebViewProviderFactory getFactory() {
        return androidx.webkit.internal.WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.Camera2StreamConfigurationMap;
    }

    public static androidx.webkit.internal.WebkitToCompatConverter getCompatConverter() {
        return androidx.webkit.internal.WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.getHighSpeedVideoSizes;
    }

    static class LAZY_FACTORY_HOLDER {
        static final androidx.webkit.internal.WebViewProviderFactory Camera2StreamConfigurationMap = androidx.webkit.internal.WebViewGlueCommunicator.getHighSpeedVideoFpsRangesFor();

        private LAZY_FACTORY_HOLDER() {
        }
    }

    static class LAZY_COMPAT_CONVERTER_HOLDER {
        static final androidx.webkit.internal.WebkitToCompatConverter getHighSpeedVideoSizes = new androidx.webkit.internal.WebkitToCompatConverter(androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getWebkitToCompatConverter());

        private LAZY_COMPAT_CONVERTER_HOLDER() {
        }
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.webkit.internal.ApiHelperForP.getWebViewClassLoader();
        }
        return getHighSpeedVideoSizes().getClass().getClassLoader();
    }

    private static java.lang.Object getHighSpeedVideoSizes() {
        try {
            java.lang.reflect.Method declaredMethod = android.webkit.WebView.class.getDeclaredMethod("getFactory", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private WebViewGlueCommunicator() {
    }

    static androidx.webkit.internal.WebViewProviderFactory getHighSpeedVideoFpsRangesFor() {
        try {
            return new androidx.webkit.internal.WebViewProviderFactoryAdapter((org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.class, (java.lang.reflect.InvocationHandler) java.lang.Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])));
        } catch (java.lang.ClassNotFoundException unused) {
            return new androidx.webkit.internal.IncompatibleApkWebViewProviderFactory();
        } catch (java.lang.IllegalAccessException e) {
            e = e;
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.NoSuchMethodException e2) {
            e = e2;
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            e = e3;
            throw new java.lang.RuntimeException(e);
        }
    }
}
