package Ed0;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;

/* loaded from: classes7.dex */
public final class e implements Jb.e<Moshi> {
    @Override // Pc.a
    public final Object get() {
        Moshi.a aVar = new Moshi.a();
        aVar.a(new AtomDTOAdapterFactory());
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
