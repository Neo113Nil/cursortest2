package U2;

import R2.InterfaceC3912f;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b<T> implements InterfaceC3912f<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<T, kotlin.coroutines.d<? super Boolean>, Object> f27276a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<e, T, kotlin.coroutines.d<? super T>, Object> f27277b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27278c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27279d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27280e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashSet f27281f;

    /* loaded from: classes8.dex */
    private static final class a {
        public static final boolean a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, InterfaceC6511n<? super e, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> interfaceC6511n, Context context, String str) {
        this.f27276a = function2;
        this.f27277b = interfaceC6511n;
        this.f27278c = context;
        this.f27279d = str;
        this.f27280e = k.b(function0);
        this.f27281f = set == d.a() ? null : C7714v.X0(set);
    }

    @Override // R2.InterfaceC3912f
    public final Unit i() throws IOException {
        Context context;
        String str;
        InterfaceC4008j interfaceC4008j = this.f27280e;
        SharedPreferences.Editor edit = ((SharedPreferences) interfaceC4008j.getValue()).edit();
        LinkedHashSet linkedHashSet = this.f27281f;
        if (linkedHashSet == null) {
            edit.clear();
        } else {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) interfaceC4008j.getValue()).getAll().isEmpty() && (context = this.f27278c) != null && (str = this.f27279d) != null) {
            a.a(context, str);
        }
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r5.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.InterfaceC3912f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        Object obj2;
        int i11;
        b<T> bVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f27285g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f27285g = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj2 = cVar2.f27283e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f27285g;
                boolean z11 = true;
                if (i11 != 0) {
                    s.b(obj2);
                    cVar2.f27282d = this;
                    cVar2.f27285g = 1;
                    obj2 = this.f27276a.invoke(obj, cVar2);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    bVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = cVar2.f27282d;
                    s.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = bVar.f27281f;
                InterfaceC4008j interfaceC4008j = bVar.f27280e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) interfaceC4008j.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator<T> it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z11 = false;
                    return Boolean.valueOf(z11);
                }
                Map<String, ?> all = ((SharedPreferences) interfaceC4008j.getValue()).getAll();
                Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            }
        }
        cVar2 = new c(this, cVar);
        obj2 = cVar2.f27283e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f27285g;
        boolean z112 = true;
        if (i11 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    @Override // R2.InterfaceC3912f
    public final Object k(T t2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return this.f27277b.invoke(new e((SharedPreferences) this.f27280e.getValue(), this.f27281f), t2, dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull InterfaceC6511n<? super e, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, null, null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull Set keysToMigrate, @NotNull Function2 shouldRunMigration, @NotNull InterfaceC6511n migrate) {
        this(new U2.a(context), keysToMigrate, shouldRunMigration, migrate, context, "vkpns_client_sdk");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("vkpns_client_sdk", "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
