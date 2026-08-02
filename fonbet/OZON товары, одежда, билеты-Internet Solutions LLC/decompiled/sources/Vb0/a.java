package Vb0;

import android.util.Log;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a extends b {
    @Override // Vb0.b
    protected final boolean i() {
        return true;
    }

    @Override // Vb0.b
    protected final void j(@NotNull String message, @NotNull Map<String, ? extends Object> customFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Log.println(6, b.h(), J.d.b("OzonID SDK: message = ", message, "\ncustomFields = ", customFields));
    }

    @Override // Vb0.b
    protected final void k(@NotNull String message, @NotNull Map<String, ? extends Object> customFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Log.println(4, b.h(), J.d.b("OzonID SDK: message = ", message, "\ncustomFields = ", customFields));
    }

    @Override // Vb0.b
    protected final void l(@NotNull String key, @NotNull Exception t2, @NotNull Map customFields) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Log.println(6, b.h(), "OzonID SDK: customFields = " + customFields + "\n" + Log.getStackTraceString(t2));
    }
}
