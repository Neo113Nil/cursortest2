package X60;

import Jb.e;
import a70.InterfaceC4958a;
import f30.g;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.data.remote.parser.f;

/* loaded from: classes3.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34150a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f34151b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f34152c;

    public /* synthetic */ d(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f34150a = i11;
        this.f34151b = aVar;
        this.f34152c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f34150a) {
            case 0:
                return new c((InterfaceC4958a) this.f34151b.get(), (Z60.a) this.f34152c.get());
            default:
                return new f((JsonParser) ((ru.ozon.android.messenger.framework.data.remote.serialize.d) this.f34151b).get(), (ru.ozon.android.messenger.framework.data.remote.parser.c) ((g) this.f34152c).get());
        }
    }
}
