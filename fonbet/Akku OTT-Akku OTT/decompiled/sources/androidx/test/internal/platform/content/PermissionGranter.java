package androidx.test.internal.platform.content;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface PermissionGranter {
    void addPermissions(@NonNull String... strArr);

    void requestPermissions();
}
