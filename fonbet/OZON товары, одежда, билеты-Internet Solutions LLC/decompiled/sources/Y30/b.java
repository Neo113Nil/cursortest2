package Y30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends X30.a>, a<? extends X30.a>> f34566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap<Class<? extends X30.a>, X30.a> f34567b;

    public b(@NotNull Map<Class<? extends X30.a>, a<? extends X30.a>> factories) {
        Intrinsics.checkNotNullParameter(factories, "factories");
        this.f34566a = factories;
        this.f34567b = new HashMap<>();
    }

    @NotNull
    public final <T extends X30.a> T a(@NotNull Class<? extends T> clazz) {
        Object obj;
        Class<? extends T> cls;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        HashMap<Class<? extends X30.a>, X30.a> hashMap = this.f34567b;
        T t2 = (T) hashMap.get(clazz);
        if (t2 != null) {
            return t2;
        }
        Map<Class<? extends X30.a>, a<? extends X30.a>> map = this.f34566a;
        if (map.get(clazz) != null) {
            cls = clazz;
        } else {
            Iterator<T> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (clazz.isAssignableFrom((Class) obj)) {
                    break;
                }
            }
            cls = (Class) obj;
        }
        if (cls == null) {
            throw new IllegalStateException("Can not find component for ".concat(clazz.getSimpleName()));
        }
        T t11 = (T) hashMap.get(cls);
        if (t11 != null) {
            return t11;
        }
        Intrinsics.checkNotNullParameter(map, "<this>");
        T t12 = (T) ((a) U.d(map, cls)).create(this);
        hashMap.put(cls, t12);
        Intrinsics.g(t12, "null cannot be cast to non-null type T of ru.ozon.fintech.di.ozoncommon.provider.factory.ComponentStorage.getComponent");
        return t12;
    }
}
