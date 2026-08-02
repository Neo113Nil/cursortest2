package Ih0;

import Ih0.e;
import Wh0.d;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xh0.d;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ch0.a f12548a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Hh0.a f12549b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ch0.b f12550c;

    public m(@NotNull Ch0.a pushStatusRepository, @NotNull Hh0.a pushStatusWorkManager, @NotNull xh0.d responseTypeResolver, @NotNull Ch0.b deviceStatsRepository) {
        Intrinsics.checkNotNullParameter(pushStatusRepository, "pushStatusRepository");
        Intrinsics.checkNotNullParameter(pushStatusWorkManager, "pushStatusWorkManager");
        Intrinsics.checkNotNullParameter(responseTypeResolver, "responseTypeResolver");
        Intrinsics.checkNotNullParameter(deviceStatsRepository, "deviceStatsRepository");
        this.f12548a = pushStatusRepository;
        this.f12549b = pushStatusWorkManager;
        this.f12550c = deviceStatsRepository;
    }

    public static final void c(m mVar, c cVar) {
        mVar.f12548a.a(cVar);
    }

    public static final void d(m mVar, b bVar, n nVar, boolean z11, boolean z12) {
        String d11;
        Wh0.d aVar;
        d.a aVar2;
        Ch0.a aVar3 = mVar.f12548a;
        ArrayList b11 = aVar3.b();
        if (b11.isEmpty()) {
            return;
        }
        if (bVar != null) {
            try {
                d11 = bVar.d();
            } catch (Throwable th2) {
                aVar = new d.a(th2);
            }
        } else {
            d11 = null;
        }
        aVar = new d.b(Integer.valueOf(aVar3.e(b11, d11, nVar, z12)));
        if (aVar instanceof d.b) {
            int i11 = sh0.b.f98783c;
            sh0.b.f("SendPushStatusInteractor", null, new h(nVar, (d.b) aVar), 6);
            aVar2 = xh0.d.a(((Number) ((d.b) aVar).a()).intValue());
        } else {
            int i12 = sh0.b.f98783c;
            sh0.b.f("SendPushStatusInteractor", null, new i(nVar, aVar), 6);
            aVar2 = null;
        }
        if (aVar2 == d.a.SUCCESS || aVar2 == d.a.CLIENT_ERROR) {
            aVar3.d(b11);
        } else {
            aVar3.c(b11);
            mVar.f12549b.a(bVar != null ? new e.a(bVar.d(), bVar.h()) : null, z11);
        }
    }

    public final void e(@NotNull n senderPlace) {
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        Wh0.c.a(new l(this, senderPlace));
    }
}
