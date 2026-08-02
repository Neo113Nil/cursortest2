package V2;

import Sc.s;
import W2.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<W2.f, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f27955d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Set<String> f27956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(Set<String> set, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f27956e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        k kVar = new k(this.f27956e, dVar);
        kVar.f27955d = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.f fVar, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((k) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Set<f.a<?>> keySet = ((W2.f) this.f27955d).a().keySet();
        ArrayList arrayList = new ArrayList(C7714v.z(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((f.a) it.next()).a());
        }
        LinkedHashSet c11 = l.c();
        boolean z11 = true;
        Set<String> set = this.f27956e;
        if (set != c11) {
            Set<String> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
            }
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
