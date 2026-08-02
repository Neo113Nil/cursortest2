package D90;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.network.FeaturesNetwork;

/* loaded from: classes3.dex */
public final class k implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6215a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f6216b;

    public /* synthetic */ k(Pc.a aVar, int i11) {
        this.f6215a = i11;
        this.f6216b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f6215a) {
            case 0:
                return new j((S80.b) this.f6216b.get());
            case 1:
                FeaturesNetwork featuresNetwork = (FeaturesNetwork) this.f6216b.get();
                Intrinsics.checkNotNullParameter(featuresNetwork, "featuresNetwork");
                return new T90.d(featuresNetwork);
            default:
                return new s90.i((Context) this.f6216b.get());
        }
    }
}
