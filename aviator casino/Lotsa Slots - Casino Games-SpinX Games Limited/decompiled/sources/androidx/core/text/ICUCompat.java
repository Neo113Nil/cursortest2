package androidx.core.text;

/* loaded from: classes.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    static {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            try {
                sAddLikelySubtagsMethod = java.lang.Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", java.util.Locale.class);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    public static java.lang.String maximizeAndGetScript(java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.text.ICUCompat.Api24Impl.getScript(androidx.core.text.ICUCompat.Api24Impl.addLikelySubtags(androidx.core.text.ICUCompat.Api24Impl.forLocale(locale)));
        }
        try {
            return androidx.core.text.ICUCompat.Api21Impl.getScript((java.util.Locale) sAddLikelySubtagsMethod.invoke(null, locale));
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
            return androidx.core.text.ICUCompat.Api21Impl.getScript(locale);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w(TAG, e2);
            return androidx.core.text.ICUCompat.Api21Impl.getScript(locale);
        }
    }

    private static java.lang.String getScriptBelowApi21(java.lang.String str) {
        try {
            java.lang.reflect.Method method = sGetScriptMethod;
            if (method != null) {
                return (java.lang.String) method.invoke(null, str);
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w(TAG, e2);
        }
        return null;
    }

    private static java.lang.String addLikelySubtagsBelowApi21(java.util.Locale locale) {
        java.lang.String locale2 = locale.toString();
        try {
            java.lang.reflect.Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (java.lang.String) method.invoke(null, locale2);
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w(TAG, e2);
        }
        return locale2;
    }

    private ICUCompat() {
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.icu.util.ULocale forLocale(java.util.Locale locale) {
            return android.icu.util.ULocale.forLocale(locale);
        }

        static android.icu.util.ULocale addLikelySubtags(java.lang.Object obj) {
            return android.icu.util.ULocale.addLikelySubtags((android.icu.util.ULocale) obj);
        }

        static java.lang.String getScript(java.lang.Object obj) {
            return ((android.icu.util.ULocale) obj).getScript();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.lang.String getScript(java.util.Locale locale) {
            return locale.getScript();
        }
    }
}
