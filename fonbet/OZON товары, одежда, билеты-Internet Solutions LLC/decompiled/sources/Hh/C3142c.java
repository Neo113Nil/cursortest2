package Hh;

import Qj0.InterfaceC3896p;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.tracker.performance.ObjectTypes;

/* renamed from: Hh.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3142c extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3140a f10990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3142c(C3140a c3140a) {
        super(0);
        this.f10990b = c3140a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z11;
        boolean z12;
        InterfaceC3896p interfaceC3896p;
        Sg.a aVar;
        boolean isSupported;
        C3140a c3140a = this.f10990b;
        z11 = c3140a.f10970j;
        if (!z11) {
            interfaceC3896p = c3140a.f10963c;
            aVar = c3140a.f10962b;
            Rg.a a11 = aVar.a();
            String f7 = a11 != null ? a11.f() : null;
            if (f7 == null) {
                f7 = "";
            }
            isSupported = interfaceC3896p.isSupported(f7, ObjectTypes.PAGE_SCROLL, U.c());
            if (!isSupported) {
                z12 = false;
                return Boolean.valueOf(z12);
            }
        }
        z12 = true;
        return Boolean.valueOf(z12);
    }
}
