package A50;

import com.vk.id.AuthResultHandler;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.offline.presentation.sheethow.OfflineSheetHow;
import sa0.e;
import v50.D;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f454b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f453a = i11;
        this.f454b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit finish$lambda$13;
        AuthResultHandler authResultHandler$lambda$15;
        switch (this.f453a) {
            case 0:
                return c.a((c) this.f454b);
            case 1:
                c30.b bVar = (c30.b) this.f454b;
                e g10 = c30.b.e(bVar).g();
                bVar.f56453g.tryEmit(new Pair("a_mir_wallet_id", g10.b()));
                bVar.f56453g.tryEmit(new Pair("a_mir_device_id", g10.a()));
                L80.a.a("DeviceIdsProvider", "mir app info " + g10);
                return Unit.f71690a;
            case 2:
                return ((OfflineSheetHow) this.f454b).getFactory();
            case 3:
                finish$lambda$13 = AuthActivity.finish$lambda$13((AuthActivity) this.f454b);
                return finish$lambda$13;
            case 4:
                authResultHandler$lambda$15 = VKIDDepsProd.authResultHandler$lambda$15((VKIDDepsProd) this.f454b);
                return authResultHandler$lambda$15;
            default:
                return D.c((D) this.f454b);
        }
    }
}
