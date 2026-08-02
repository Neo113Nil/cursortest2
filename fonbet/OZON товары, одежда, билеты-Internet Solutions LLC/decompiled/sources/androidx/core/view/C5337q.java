package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5337q {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f42338a = false;

    /* renamed from: b, reason: collision with root package name */
    private static Method f42339b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f42340c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Field f42341d;

    /* renamed from: androidx.core.view.q$a */
    public interface a {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    public static boolean a(@NonNull View view, @NonNull KeyEvent keyEvent) {
        int i11 = Y.f42258g;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return Y.n.a(view).e(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fc, code lost:
    
        if ((r1 >= 28 ? false : androidx.core.view.Y.n.a(r8).b(r8, r10)) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"LambdaLast"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(@NonNull a aVar, View view, Window.Callback callback, @NonNull KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        Object invoke;
        boolean booleanValue;
        if (aVar != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                return aVar.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f42338a) {
                            try {
                                f42339b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f42338a = true;
                        }
                        Method method = f42339b;
                        if (method != null) {
                            try {
                                invoke = method.invoke(actionBar, keyEvent);
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                            if (invoke != null) {
                                booleanValue = ((Boolean) invoke).booleanValue();
                                if (booleanValue) {
                                    return true;
                                }
                            }
                        }
                        booleanValue = false;
                        if (booleanValue) {
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                int i12 = Y.f42258g;
                if (Build.VERSION.SDK_INT < 28 ? Y.n.a(decorView).b(decorView, keyEvent) : false) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f42340c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f42341d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f42340c = true;
                }
                Field field = f42341d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    int i13 = Y.f42258g;
                    if (Build.VERSION.SDK_INT < 28 ? Y.n.a(decorView2).b(decorView2, keyEvent) : false) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else {
                if (view != null) {
                    int i14 = Y.f42258g;
                }
                if (aVar.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
            }
        }
        return false;
    }
}
