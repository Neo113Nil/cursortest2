package androidx.test.internal.platform.reflect;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ReflectionException extends Exception {
    public ReflectionException(Exception exc) {
        super("Reflection access failed", exc);
    }
}
