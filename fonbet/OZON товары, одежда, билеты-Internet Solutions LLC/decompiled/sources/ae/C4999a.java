package ae;

import Fd.k;
import Gd.C3085o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import wd.Q;

/* renamed from: ae.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4999a implements InterfaceC5004f {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K f36616b;

    public C4999a(@NotNull K inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f36616b = inner;
    }

    @Override // ae.InterfaceC5004f
    @NotNull
    public final Q a(@NotNull InterfaceC9839e thisDescriptor, @NotNull Q propertyDescriptor, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(propertyDescriptor, "propertyDescriptor");
        Intrinsics.checkNotNullParameter(c11, "c");
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((InterfaceC5004f) it.next()).a(thisDescriptor, propertyDescriptor, c11);
        }
        return propertyDescriptor;
    }

    @Override // ae.InterfaceC5004f
    public final void b(@NotNull C3085o thisDescriptor, @NotNull Sd.f name, @NotNull Tc.b result, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c11, "c");
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5004f) it.next()).b(thisDescriptor, name, result, c11);
        }
    }

    @Override // ae.InterfaceC5004f
    @NotNull
    public final ArrayList c(@NotNull C3085o thisDescriptor, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(c11, "c");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            C7714v.p(((InterfaceC5004f) it.next()).c(thisDescriptor, c11), arrayList);
        }
        return arrayList;
    }

    @Override // ae.InterfaceC5004f
    public final void d(@NotNull C3085o thisDescriptor, @NotNull Sd.f name, @NotNull ArrayList result, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c11, "c");
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5004f) it.next()).d(thisDescriptor, name, result, c11);
        }
    }

    @Override // ae.InterfaceC5004f
    @NotNull
    public final ArrayList e(@NotNull C3085o thisDescriptor, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(c11, "c");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            C7714v.p(((InterfaceC5004f) it.next()).e(thisDescriptor, c11), arrayList);
        }
        return arrayList;
    }

    @Override // ae.InterfaceC5004f
    public final void f(@NotNull C3085o thisDescriptor, @NotNull ArrayList result, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c11, "c");
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5004f) it.next()).f(thisDescriptor, result, c11);
        }
    }

    @Override // ae.InterfaceC5004f
    public final void g(@NotNull C3085o thisDescriptor, @NotNull Sd.f name, @NotNull ArrayList result, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(c11, "c");
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5004f) it.next()).g(thisDescriptor, name, result, c11);
        }
    }

    @Override // ae.InterfaceC5004f
    @NotNull
    public final ArrayList h(@NotNull C3085o thisDescriptor, @NotNull k c11) {
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(c11, "c");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f36616b.iterator();
        while (it.hasNext()) {
            C7714v.p(((InterfaceC5004f) it.next()).h(thisDescriptor, c11), arrayList);
        }
        return arrayList;
    }
}
