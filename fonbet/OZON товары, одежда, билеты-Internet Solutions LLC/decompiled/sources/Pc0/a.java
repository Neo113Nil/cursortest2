package Pc0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.C5418g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Nc0.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5418g0 f22154a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f22155b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<Integer> f22156c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<Integer> f22157d;

    public a(@NotNull C5418g0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.f22154a = savedStateHandle;
        List<b> list = (List) savedStateHandle.c("link_stack_saved_state_key");
        list = list == null ? new ArrayList<>() : list;
        this.f22155b = list;
        x0<Integer> a11 = O0.a(Integer.valueOf(list.size()));
        this.f22156c = a11;
        this.f22157d = C2399j.b(a11);
    }

    private final void f() {
        C5418g0 c5418g0 = this.f22154a;
        List<b> list = this.f22155b;
        c5418g0.g(list, "link_stack_saved_state_key");
        this.f22156c.tryEmit(Integer.valueOf(list.size()));
    }

    public final boolean a() {
        List<b> list = this.f22155b;
        b bVar = (b) C7714v.M(list);
        list.clear();
        if (bVar != null) {
            list.add(bVar);
        }
        f();
        return bVar != null;
    }

    public final b b() {
        return (b) C7714v.Z(this.f22155b);
    }

    public final b c(@NotNull String screenId) {
        Object obj;
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Iterator<T> it = this.f22155b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((b) obj).c(), screenId)) {
                break;
            }
        }
        return (b) obj;
    }

    public final boolean d() {
        return this.f22155b.isEmpty();
    }

    public final boolean e() {
        return this.f22155b.size() <= 1;
    }

    public final void g() {
        C7714v.x0(this.f22155b);
        f();
    }

    public final void h(@NotNull b newAuthBackStackEntry) {
        Intrinsics.checkNotNullParameter(newAuthBackStackEntry, "newAuthBackStackEntry");
        this.f22155b.add(newAuthBackStackEntry);
        f();
    }

    @Override // Nc0.c
    @NotNull
    public final M0<Integer> i() {
        return this.f22157d;
    }

    public final void j(@NotNull String newLink) {
        Intrinsics.checkNotNullParameter(newLink, "newLink");
        List<b> list = this.f22155b;
        b bVar = (b) C7714v.x0(list);
        if (bVar == null) {
            throw new IllegalStateException("Empty back stack!");
        }
        list.add(b.a(bVar, newLink));
        f();
    }

    public final void k(@NotNull b newAuthBackStackEntry) {
        Intrinsics.checkNotNullParameter(newAuthBackStackEntry, "newAuthBackStackEntry");
        List<b> list = this.f22155b;
        C7714v.x0(list);
        list.add(newAuthBackStackEntry);
        f();
    }
}
