package androidx.core.graphics;

/* loaded from: classes3.dex */
public class TypefaceCompatApi28Impl extends androidx.core.graphics.TypefaceCompatApi26Impl {
    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(this.mFontFamily, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.mCreateFromFamiliesWithDefault.invoke(null, newInstance, androidx.media3.common.C.SANS_SERIF_NAME, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass(), java.lang.String.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl, androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface Camera2StreamConfigurationMap(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        return android.graphics.Typeface.create(typeface, i, z);
    }
}
