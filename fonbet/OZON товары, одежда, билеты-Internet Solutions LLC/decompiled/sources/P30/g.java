package P30;

import Jb.j;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import d90.C6119g;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes3.dex */
public final class g implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21805a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f21806b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f21807c;

    public /* synthetic */ g(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f21805a = i11;
        this.f21806b = aVar;
        this.f21807c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f21805a) {
            case 0:
                Context appContext = (Context) this.f21806b.get();
                O30.b type = (O30.b) ((Jb.f) this.f21807c).get();
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(type, "type");
                SharedPreferences a11 = W30.a.a(appContext, type);
                j.d(a11);
                return a11;
            case 1:
                return new C6119g((SharedPreferences) this.f21806b.get(), (ExternalNetworkSettings) ((Jb.f) this.f21807c).get());
            default:
                return new ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.b((Context) this.f21806b.get(), (Moshi) this.f21807c.get());
        }
    }
}
