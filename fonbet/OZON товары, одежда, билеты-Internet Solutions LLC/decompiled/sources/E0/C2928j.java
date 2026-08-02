package E0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2928j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2928j f7253a = new C2928j();

    public final boolean a(@NotNull InputConnection inputConnection, @NotNull InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i11, bundle);
    }
}
