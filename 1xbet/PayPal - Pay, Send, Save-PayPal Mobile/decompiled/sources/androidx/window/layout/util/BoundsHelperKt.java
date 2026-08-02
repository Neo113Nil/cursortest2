package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/Display;", "p0", "Landroid/view/DisplayCutout;", "dJ_", "(Landroid/view/Display;)Landroid/view/DisplayCutout;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BoundsHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.DisplayCutout dJ_(android.view.Display display) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("android.view.DisplayInfo").getConstructor(new java.lang.Class[0]);
            constructor.setAccessible(true);
            java.lang.Object newInstance = constructor.newInstance(new java.lang.Object[0]);
            java.lang.reflect.Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            java.lang.reflect.Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(newInstance);
            if (obj instanceof android.view.DisplayCutout) {
                return (android.view.DisplayCutout) obj;
            }
            return null;
        } catch (java.lang.Exception e) {
            if ((e instanceof java.lang.ClassNotFoundException) || (e instanceof java.lang.NoSuchMethodException) || (e instanceof java.lang.NoSuchFieldException) || (e instanceof java.lang.IllegalAccessException) || (e instanceof java.lang.reflect.InvocationTargetException) || (e instanceof java.lang.InstantiationException)) {
                androidx.window.layout.util.BoundsHelper.INSTANCE.getTAG();
                return null;
            }
            throw e;
        }
    }

    public static final /* synthetic */ int access$getNavigationBarHeight(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
