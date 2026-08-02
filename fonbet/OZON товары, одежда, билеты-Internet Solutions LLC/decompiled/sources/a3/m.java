package a3;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class m extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ComponentCallbacksC5392m f36228a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull ComponentCallbacksC5392m fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f36228a = fragment;
    }

    @NotNull
    public final ComponentCallbacksC5392m a() {
        return this.f36228a;
    }
}
