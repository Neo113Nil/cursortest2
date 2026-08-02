package a;

import org.jetbrains.annotations.NotNull;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4903a {
    @NotNull
    public static StackTraceElement a() {
        Exception exc = new Exception();
        String simpleName = b.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
