package androidx.fragment.app;

import androidx.lifecycle.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class a0 extends AbstractC7737t implements Function0<z0.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f43017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(ComponentCallbacksC5392m componentCallbacksC5392m) {
        super(0);
        this.f43017b = componentCallbacksC5392m;
    }

    @Override // kotlin.jvm.functions.Function0
    public final z0.b invoke() {
        return this.f43017b.getDefaultViewModelProviderFactory();
    }
}
