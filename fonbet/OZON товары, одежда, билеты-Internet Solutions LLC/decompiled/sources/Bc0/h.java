package Bc0;

import Sc.InterfaceC4008j;
import android.net.ConnectivityManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f3537b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f3538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f fVar, i iVar) {
        super(1);
        this.f3537b = fVar;
        this.f3538c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f3537b.f3528c;
        ConnectivityManager connectivityManager = (ConnectivityManager) interfaceC4008j.getValue();
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.f3538c);
        }
        return Unit.f71690a;
    }
}
