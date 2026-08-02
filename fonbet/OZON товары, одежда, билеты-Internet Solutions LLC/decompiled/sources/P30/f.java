package P30;

import Jb.j;
import N4.a;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import d90.C6118f;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes3.dex */
public final class f implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21802a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f21803b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f21804c;

    public /* synthetic */ f(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f21802a = i11;
        this.f21803b = aVar;
        this.f21804c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        SharedPreferences sharedPreferences;
        switch (this.f21802a) {
            case 0:
                Context context = (Context) this.f21803b.get();
                O30.b type = (O30.b) ((Jb.f) this.f21804c).get();
                Intrinsics.checkNotNullParameter(context, "appContext");
                Intrinsics.checkNotNullParameter(type, "type");
                String name = context.getPackageName() + "_" + type;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(name, "name");
                try {
                    sharedPreferences = N4.a.b(name, N4.c.a(N4.c.f18682a), context, a.c.AES256_SIV, a.d.AES256_GCM);
                } catch (Throwable th2) {
                    L80.a.b("fintech", "Cant create EncryptedSharedPreferences, fallback to normal SharedPreferences e=" + th2);
                    sharedPreferences = null;
                }
                if (sharedPreferences == null) {
                    sharedPreferences = W30.a.a(context, type);
                }
                j.d(sharedPreferences);
                return sharedPreferences;
            case 1:
                return new C6118f((SharedPreferences) this.f21803b.get(), (ExternalNetworkSettings) ((Jb.f) this.f21804c).get());
            default:
                return new ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.a((Context) this.f21803b.get(), (Moshi) this.f21804c.get());
        }
    }
}
