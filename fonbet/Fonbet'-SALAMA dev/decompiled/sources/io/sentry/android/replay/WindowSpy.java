package io.sentry.android.replay;

import Y4.D;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import f6.EnumC1110c;
import f6.InterfaceC1109b;
import java.lang.reflect.Field;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class WindowSpy {
    public static final int $stable;
    public static final WindowSpy INSTANCE = new WindowSpy();
    private static final InterfaceC1109b decorViewClass$delegate;
    private static final InterfaceC1109b windowField$delegate;

    static {
        EnumC1110c[] enumC1110cArr = EnumC1110c.f12999a;
        decorViewClass$delegate = D.B(WindowSpy$decorViewClass$2.INSTANCE);
        windowField$delegate = D.B(WindowSpy$windowField$2.INSTANCE);
        $stable = 8;
    }

    private WindowSpy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getDecorViewClass() {
        return (Class) decorViewClass$delegate.getValue();
    }

    private final Field getWindowField() {
        return (Field) windowField$delegate.getValue();
    }

    public final Window pullWindow(View view) {
        Field windowField;
        h.e(view, "maybeDecorView");
        Class<?> decorViewClass = getDecorViewClass();
        if (decorViewClass == null || !decorViewClass.isInstance(view) || (windowField = INSTANCE.getWindowField()) == null) {
            return null;
        }
        Object obj = windowField.get(view);
        h.c(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
