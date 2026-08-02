package a00;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a00.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4910e implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f36128a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0 f36129b;

    public C4910e(ComponentCallbacksC5392m viewModelStoreOwner, B0 sharedViewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "fragment");
        Intrinsics.checkNotNullParameter(sharedViewModelStoreOwner, "sharedViewModelStoreOwner");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f36128a = sharedViewModelStoreOwner;
        this.f36129b = viewModelStoreOwner;
    }

    @Override // a00.h
    @NotNull
    public final B0 a() {
        return this.f36129b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.B0, java.lang.Object] */
    @Override // a00.h
    @NotNull
    public final B0 b() {
        return this.f36128a;
    }
}
