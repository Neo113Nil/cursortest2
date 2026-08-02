package Pa0;

import android.content.Context;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import s90.C9634c;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22127a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f22128b;

    public /* synthetic */ e(Pc.a aVar, int i11) {
        this.f22127a = i11;
        this.f22128b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22127a) {
            case 0:
                return new d(Jb.d.a(this.f22128b));
            case 1:
                return new C9634c((Context) this.f22128b.get());
            case 2:
                return new C10656a((Moshi) this.f22128b.get());
            default:
                return new Bi0.f((InterfaceC6369b) ((Jb.f) this.f22128b).get());
        }
    }
}
