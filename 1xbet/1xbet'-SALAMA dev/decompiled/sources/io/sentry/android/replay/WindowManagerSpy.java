package io.sentry.android.replay;

import Y4.D;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import p044f6.c;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class WindowManagerSpy {
    public static final int $stable;
    public static final WindowManagerSpy INSTANCE = new WindowManagerSpy();
    private static final p044f6.b mViewsField$delegate;
    private static final p044f6.b windowManagerClass$delegate;
    private static final p044f6.b windowManagerInstance$delegate;

    static {
        c[] cVarArr = c.f13005a;
        windowManagerClass$delegate = D.B(WindowManagerSpy$windowManagerClass$2.INSTANCE);
        windowManagerInstance$delegate = D.B(WindowManagerSpy$windowManagerInstance$2.INSTANCE);
        mViewsField$delegate = D.B(WindowManagerSpy$mViewsField$2.INSTANCE);
        $stable = 8;
    }

    private WindowManagerSpy() {
    }

    private final Field getMViewsField() {
        return (Field) mViewsField$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowManagerClass() {
        return (Class) windowManagerClass$delegate.getValue();
    }

    private final Object getWindowManagerInstance() {
        return windowManagerInstance$delegate.getValue();
    }

    public final void swapWindowManagerGlobalMViews(Function1 function1) {
        Field mViewsField;
        h.e(function1, "swap");
        try {
            Object windowManagerInstance = getWindowManagerInstance();
            if (windowManagerInstance == null || (mViewsField = INSTANCE.getMViewsField()) == null) {
                return;
            }
            Object obj = mViewsField.get(windowManagerInstance);
            h.c(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            mViewsField.set(windowManagerInstance, function1.invoke((ArrayList) obj));
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
        }
    }
}
