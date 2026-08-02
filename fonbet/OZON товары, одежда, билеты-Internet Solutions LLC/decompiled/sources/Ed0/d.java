package Ed0;

import Jb.j;
import j10.InterfaceC7238a;
import kotlin.jvm.internal.Intrinsics;
import r10.C9158a;
import ru.ozon.inapp.push.sdk.internal.data.NewInAppPushApi;
import ru.ozon.inapp.push.sdk.internal.data.OldInAppPushApi;

/* loaded from: classes7.dex */
public final class d implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7849a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f7850b;

    public /* synthetic */ d(Object obj, Pc.a aVar, int i11) {
        this.f7849a = i11;
        this.f7850b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f7849a) {
            case 0:
                i retrofitWrapper = (i) this.f7850b.get();
                Intrinsics.checkNotNullParameter(retrofitWrapper, "retrofitWrapper");
                Cd0.a aVar = (Cd0.a) retrofitWrapper.a().create(retrofitWrapper.b() ? NewInAppPushApi.class : OldInAppPushApi.class);
                Intrinsics.checkNotNullExpressionValue(aVar, "with(...)");
                j.d(aVar);
                return aVar;
            case 1:
                InterfaceC7238a composerStore = (InterfaceC7238a) this.f7850b.get();
                Intrinsics.checkNotNullParameter(composerStore, "composerStore");
                return new C9158a(composerStore);
            default:
                return new Fd0.c((Cd0.f) ((Cd0.g) this.f7850b).get());
        }
    }

    public d(Cd0.g gVar) {
        this.f7849a = 2;
        this.f7850b = gVar;
    }
}
