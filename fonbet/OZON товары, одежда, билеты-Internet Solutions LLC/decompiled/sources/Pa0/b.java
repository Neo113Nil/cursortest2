package Pa0;

import android.content.Context;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.converter.moshi.MoshiConverterFactory;
import s90.C9632a;

/* loaded from: classes3.dex */
public final class b implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22116a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f22117b;

    public /* synthetic */ b(Pc.a aVar, int i11) {
        this.f22116a = i11;
        this.f22117b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22116a) {
            case 0:
                return new a(Jb.d.a(this.f22117b));
            case 1:
                Moshi moshi = (Moshi) this.f22117b.get();
                Intrinsics.checkNotNullParameter(moshi, "moshi");
                MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Jb.j.d(create);
                return create;
            case 2:
                return new C9632a((Context) this.f22117b.get());
            default:
                return new Bi0.c((InterfaceC6369b) ((Jb.f) this.f22117b).get());
        }
    }
}
