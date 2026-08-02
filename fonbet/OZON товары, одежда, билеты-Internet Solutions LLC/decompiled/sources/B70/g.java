package B70;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.EnumJsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.operations.network.BonusType;

/* loaded from: classes3.dex */
public final class g implements Jb.e<Moshi> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f3017a = new g();
    }

    @Override // Pc.a
    public final Object get() {
        Moshi.a aVar = new Moshi.a();
        aVar.c(E70.f.class, EnumJsonAdapter.create(E70.f.class));
        aVar.c(E70.b.class, EnumJsonAdapter.create(E70.b.class));
        aVar.c(E70.c.class, EnumJsonAdapter.create(E70.c.class));
        aVar.c(E70.d.class, EnumJsonAdapter.create(E70.d.class));
        aVar.c(E70.e.class, EnumJsonAdapter.create(E70.e.class));
        aVar.c(E70.b.class, EnumJsonAdapter.create(E70.b.class));
        aVar.c(E70.a.class, EnumJsonAdapter.create(E70.a.class));
        aVar.b(BonusType.BonusTypeAdapter.f95964a);
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
