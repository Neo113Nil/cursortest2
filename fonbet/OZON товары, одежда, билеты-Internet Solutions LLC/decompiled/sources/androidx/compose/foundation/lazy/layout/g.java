package androidx.compose.foundation.lazy.layout;

import B1.A0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class g implements A0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f39645a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f39646b = new LinkedHashMap();

    public g(@NotNull f fVar) {
        this.f39645a = fVar;
    }

    @Override // B1.A0
    public final void a(@NotNull A0.a aVar) {
        LinkedHashMap linkedHashMap = this.f39646b;
        linkedHashMap.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object c11 = this.f39645a.c(it.next());
            Integer num = (Integer) linkedHashMap.get(c11);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(c11, Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // B1.A0
    public final boolean b(Object obj, Object obj2) {
        f fVar = this.f39645a;
        return Intrinsics.d(fVar.c(obj), fVar.c(obj2));
    }
}
