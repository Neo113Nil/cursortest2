package F90;

import P60.g;
import android.content.Context;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;

/* loaded from: classes3.dex */
public final class f implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9170a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f9171b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f9172c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f9173d;

    public /* synthetic */ f(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, int i11) {
        this.f9170a = i11;
        this.f9171b = aVar;
        this.f9172c = aVar2;
        this.f9173d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f9170a) {
            case 0:
                return new e((Context) this.f9171b.get(), (S80.b) this.f9172c.get(), (InterfaceC6083a) this.f9173d.get());
            default:
                return new P60.e((Moshi) this.f9171b.get(), (Q90.c) this.f9172c.get(), (g) this.f9173d.get());
        }
    }
}
