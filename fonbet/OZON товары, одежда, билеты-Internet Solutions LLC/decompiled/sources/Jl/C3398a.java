package Jl;

import aM.f;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.android.core.internal.gestures.e;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigServiceImpl;

/* renamed from: Jl.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3398a implements o, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14828a;

    public /* synthetic */ C3398a(Object obj) {
        this.f14828a = obj;
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Boolean isLibraryAvailable$lambda$3;
        isLibraryAvailable$lambda$3 = ThirdPartyLibrariesConfigServiceImpl.isLibraryAvailable$lambda$3((Function1) this.f14828a, obj);
        return isLibraryAvailable$lambda$3;
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        e eVar = (e) this.f14828a;
        eVar.getClass();
        u11.L(new f(eVar, u11));
    }
}
