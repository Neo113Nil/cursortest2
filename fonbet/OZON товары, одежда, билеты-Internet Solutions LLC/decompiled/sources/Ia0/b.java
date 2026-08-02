package Ia0;

import Jb.e;
import Jb.i;
import android.content.Context;
import e50.f;
import java.util.Map;
import u50.InterfaceC9967b;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12126a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f12127b;

    public /* synthetic */ b(Pc.a aVar, int i11) {
        this.f12126a = i11;
        this.f12127b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f12126a) {
            case 0:
                return new a((Map) ((i) this.f12127b).get());
            case 1:
                return new f((InterfaceC9967b) this.f12127b.get());
            default:
                return new ru.ozon.android.messenger.blocks.chatGroups.e((Context) ((Jb.f) this.f12127b).get());
        }
    }
}
