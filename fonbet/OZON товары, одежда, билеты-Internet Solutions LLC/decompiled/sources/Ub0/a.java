package Ub0;

import Fb0.f;
import Sc.InterfaceC4008j;
import Tc.d;
import Tc.e;
import We.B;
import We.G;
import We.L;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule;

/* loaded from: classes7.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<f> f27526a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull InterfaceC4008j<? extends f> ozonIdConfig) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        this.f27526a = ozonIdConfig;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        d localeProvider$lambda$1;
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        f value = this.f27526a.getValue();
        Tc.d builder = new Tc.d();
        localeProvider$lambda$1 = Limb2PluginProvidersModule.getLocaleProvider$lambda$1((InterfaceC4008j) ((BY.b) value.getLocaleProvider()).f3307a);
        builder.put("x-o3-language", localeProvider$lambda$1.b());
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object it = ((e) builder.u().entrySet()).iterator();
        while (((d.C0541d) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((d.b) it).next();
            aVar2.d((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar.proceed(aVar2.b());
    }
}
