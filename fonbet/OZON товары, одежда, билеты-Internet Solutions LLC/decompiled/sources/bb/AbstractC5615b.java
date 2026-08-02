package bb;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bb.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5615b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f55786a;

    public AbstractC5615b(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f55786a = eventName;
    }

    @NotNull
    public final String a() {
        return this.f55786a;
    }

    @NotNull
    public abstract Map<String, String> b();
}
