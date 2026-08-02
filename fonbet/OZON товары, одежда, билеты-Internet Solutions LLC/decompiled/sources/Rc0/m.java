package Rc0;

import Sc.InterfaceC4008j;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends AbstractC7737t implements Function0<z0.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f25002b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f25003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ComponentCallbacksC5392m componentCallbacksC5392m, InterfaceC4008j interfaceC4008j) {
        super(0);
        this.f25002b = componentCallbacksC5392m;
        this.f25003c = interfaceC4008j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final z0.b invoke() {
        z0.b defaultViewModelProviderFactory;
        B0 b02 = (B0) this.f25003c.getValue();
        InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
        if (interfaceC5431s != null && (defaultViewModelProviderFactory = interfaceC5431s.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        z0.b defaultViewModelProviderFactory2 = this.f25002b.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory2;
    }
}
