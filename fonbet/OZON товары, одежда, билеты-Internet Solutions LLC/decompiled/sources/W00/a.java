package W00;

import T00.k;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.network.decode.serialize.adapter.shared.ExpandedStateDTOJsonAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.shared.SharedDTOJsonAdapter;

/* loaded from: classes7.dex */
public final class a implements JsonAdapter.a {
    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Class b11 = Ep.a.b(set, "annotations", moshi, "moshi", type);
        if (Intrinsics.d(b11, k.class)) {
            return new SharedDTOJsonAdapter(moshi);
        }
        if (Intrinsics.d(b11, k.a.class)) {
            return new ExpandedStateDTOJsonAdapter(moshi);
        }
        return null;
    }
}
