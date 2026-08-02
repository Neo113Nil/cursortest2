package F4;

import F4.F;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class H extends AbstractC7737t implements Function1<WeakReference<F.b>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3024d f8810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(C3024d c3024d) {
        super(1);
        this.f8810b = c3024d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<F.b> weakReference) {
        WeakReference<F.b> it = weakReference;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.get() == null || it.get() == this.f8810b);
    }
}
