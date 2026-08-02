package V2;

import Sc.s;
import W2.f;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<U2.e, W2.f, kotlin.coroutines.d<? super W2.f>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ U2.e f27953d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ W2.f f27954e;

    @Override // fd.InterfaceC6511n
    public final Object invoke(U2.e eVar, W2.f fVar, kotlin.coroutines.d<? super W2.f> dVar) {
        j jVar = new j(3, dVar);
        jVar.f27953d = eVar;
        jVar.f27954e = fVar;
        return jVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        U2.e eVar = this.f27953d;
        W2.f fVar = this.f27954e;
        Set<f.a<?>> keySet = fVar.a().keySet();
        ArrayList arrayList = new ArrayList(C7714v.z(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((f.a) it.next()).a());
        }
        LinkedHashMap a11 = eVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a11.entrySet()) {
            if (!arrayList.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        W2.b d11 = fVar.d();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String name = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                f.a<Boolean> key = W2.i.a(name);
                Intrinsics.checkNotNullParameter(key, "key");
                d11.j(key, value);
            } else if (value instanceof Float) {
                Intrinsics.checkNotNullParameter(name, "name");
                f.a<?> key2 = new f.a<>(name);
                Intrinsics.checkNotNullParameter(key2, "key");
                d11.j(key2, value);
            } else if (value instanceof Integer) {
                f.a<Integer> key3 = W2.i.b(name);
                Intrinsics.checkNotNullParameter(key3, "key");
                d11.j(key3, value);
            } else if (value instanceof Long) {
                Intrinsics.checkNotNullParameter(name, "name");
                f.a<?> key4 = new f.a<>(name);
                Intrinsics.checkNotNullParameter(key4, "key");
                d11.j(key4, value);
            } else if (value instanceof String) {
                f.a<String> key5 = W2.i.c(name);
                Intrinsics.checkNotNullParameter(key5, "key");
                d11.j(key5, value);
            } else if (value instanceof Set) {
                f.a<Set<String>> key6 = W2.i.d(name);
                Intrinsics.g(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                Intrinsics.checkNotNullParameter(key6, "key");
                d11.j(key6, (Set) value);
            }
        }
        return new W2.b(U.u(d11.a()), true);
    }
}
