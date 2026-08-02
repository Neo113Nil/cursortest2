package androidx.core.view;

/* loaded from: classes.dex */
public class KeyEventDispatcher {
    private static boolean Camera2StreamConfigurationMap = false;
    private static java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI = null;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

    public interface Component {
        boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent);
    }

    private KeyEventDispatcher() {
    }

    public static boolean dispatchBeforeHierarchy(android.view.View view, android.view.KeyEvent keyEvent) {
        return androidx.core.view.ViewCompat.getHighResolutionOutputSizeshNQ4ISI(view, keyEvent);
    }

    public static boolean dispatchKeyEvent(androidx.core.view.KeyEventDispatcher.Component component, android.view.View view, android.view.Window.Callback callback, android.view.KeyEvent keyEvent) {
        if (component == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return component.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) callback;
            activity.onUserInteraction();
            android.view.Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                android.app.ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null && getHighSpeedVideoFpsRangesFor(actionBar, keyEvent)) {
                    return true;
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            android.view.View decorView = window.getDecorView();
            if (androidx.core.view.ViewCompat.Camera2StreamConfigurationMap(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof android.app.Dialog)) {
            return (view != null && androidx.core.view.ViewCompat.Camera2StreamConfigurationMap(view, keyEvent)) || component.superDispatchKeyEvent(keyEvent);
        }
        android.app.Dialog dialog = (android.app.Dialog) callback;
        android.content.DialogInterface.OnKeyListener highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dialog);
        if (highSpeedVideoFpsRanges != null && highSpeedVideoFpsRanges.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        android.view.Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        android.view.View decorView2 = window2.getDecorView();
        if (androidx.core.view.ViewCompat.Camera2StreamConfigurationMap(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    private static boolean getHighSpeedVideoFpsRangesFor(android.app.ActionBar actionBar, android.view.KeyEvent keyEvent) {
        if (!Camera2StreamConfigurationMap) {
            try {
                getHighSpeedVideoFpsRangesFor = actionBar.getClass().getMethod("onMenuKeyEvent", android.view.KeyEvent.class);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            Camera2StreamConfigurationMap = true;
        }
        java.lang.reflect.Method method = getHighSpeedVideoFpsRangesFor;
        if (method != null) {
            try {
                java.lang.Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((java.lang.Boolean) invoke).booleanValue();
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static android.content.DialogInterface.OnKeyListener getHighSpeedVideoFpsRanges(android.app.Dialog dialog) {
        if (!getHighSpeedVideoFpsRanges) {
            try {
                java.lang.reflect.Field declaredField = android.app.Dialog.class.getDeclaredField("mOnKeyListener");
                getHighResolutionOutputSizeshNQ4ISI = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            getHighSpeedVideoFpsRanges = true;
        }
        java.lang.reflect.Field field = getHighResolutionOutputSizeshNQ4ISI;
        if (field == null) {
            return null;
        }
        try {
            return (android.content.DialogInterface.OnKeyListener) field.get(dialog);
        } catch (java.lang.IllegalAccessException unused2) {
            return null;
        }
    }
}
