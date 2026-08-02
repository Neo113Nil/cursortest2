package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        KClass clazz = (KClass) obj;
        List types = (List) obj2;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        ArrayList d = p.d(kotlinx.serialization.modules.h.a, types, true);
        Intrinsics.checkNotNull(d);
        return p.a(clazz, d, new androidx.datastore.core.h(types, 1));
    }
}
