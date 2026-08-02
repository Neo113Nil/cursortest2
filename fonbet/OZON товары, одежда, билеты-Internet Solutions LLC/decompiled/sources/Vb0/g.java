package Vb0;

import Lm0.a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g extends b {
    @Override // Vb0.b
    protected final boolean i() {
        Lm0.a.f17149a.getClass();
        return Lm0.a.f17151c.length > 0;
    }

    @Override // Vb0.b
    protected final void j(@NotNull String message, @NotNull Map<String, ? extends Object> customFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        a.b bVar = Lm0.a.f17149a;
        bVar.b(b.h());
        bVar.e("OzonID SDK: message = " + message + "\ncustomFields = " + customFields, new Object[0]);
    }

    @Override // Vb0.b
    protected final void k(@NotNull String message, @NotNull Map<String, ? extends Object> customFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        a.b bVar = Lm0.a.f17149a;
        bVar.b(b.h());
        bVar.i("OzonID SDK: message = " + message + "\ncustomFields = " + customFields, new Object[0]);
    }

    @Override // Vb0.b
    protected final void l(@NotNull String key, @NotNull Exception t2, @NotNull Map customFields) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        a.b bVar = Lm0.a.f17149a;
        bVar.b(b.h());
        bVar.e(t2, "OzonID SDK: customFields = " + customFields, new Object[0]);
    }
}
