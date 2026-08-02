package androidx.test.internal.platform;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface ThreadChecker {
    void checkMainThread();

    void checkNotMainThread();
}
