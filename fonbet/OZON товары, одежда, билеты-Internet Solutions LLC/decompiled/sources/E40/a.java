package E40;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.adapter.CbottomWidget2DTOAdapter;

/* loaded from: classes3.dex */
public final class a implements JsonAdapter.a {
    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.d(Ep.a.b(set, "annotations", moshi, "moshi", type), F40.a.class)) {
            return new CbottomWidget2DTOAdapter(moshi);
        }
        return null;
    }
}
