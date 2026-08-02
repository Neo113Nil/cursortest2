package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends j {
    public final List<String> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List missingFields, String str, c cVar) {
        super(str, cVar);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.a = missingFields;
    }
}
