package X10;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class k extends AbstractC7737t implements Function0<fk0.c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f33996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar) {
        super(0);
        this.f33996b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final fk0.c invoke() {
        ComponentCallbacks2 componentCallbacks2;
        componentCallbacks2 = this.f33996b.f33997a;
        fk0.d dVar = componentCallbacks2 instanceof fk0.d ? (fk0.d) componentCallbacks2 : null;
        if (dVar != null) {
            return dVar.getPrefetchViewPool();
        }
        return null;
    }
}
