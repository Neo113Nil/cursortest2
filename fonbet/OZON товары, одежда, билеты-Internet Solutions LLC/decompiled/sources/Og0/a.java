package Og0;

import Ae.C;
import Ae.C2399j;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a implements Sg0.a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f.a<Boolean> f20372c = W2.i.a("is_disabled");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<W2.f> f20373a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f20374b;

    /* renamed from: Og0.a$a, reason: collision with other inner class name */
    private static final class C0414a {
    }

    public a(@NotNull InterfaceC3917k<W2.f> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f20373a = dataStore;
        this.f20374b = new AtomicBoolean(false);
    }

    @Override // Sg0.a
    public final void a() {
        this.f20374b.set(true);
    }

    @Override // Sg0.a
    public final Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f20373a, new b(2, null), dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (a11 != aVar) {
            a11 = Unit.f71690a;
        }
        return a11 == aVar ? a11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Sg0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f20378f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f20378f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f20376d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f20378f;
                if (i11 != 0) {
                    s.b(obj);
                    C c11 = new C(new e(this.f20373a.getData()), new d());
                    cVar2.f20378f = 1;
                    obj = C2399j.w(c11, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f20376d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f20378f;
        if (i11 != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    @Override // Sg0.a
    public final boolean d() {
        return this.f20374b.get();
    }
}
