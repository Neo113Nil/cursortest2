package I50;

import android.os.Parcelable;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.InterfaceC5431s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w40.InterfaceC10428a;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f11991a;

    public b(@NotNull C10656a cbottomMapper2, @NotNull S80.b navigation) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f11991a = navigation;
    }

    @Override // I50.a
    @NotNull
    public final Set<String> a() {
        Collection collection;
        List<ComponentCallbacksC5392m> i02 = this.f11991a.i0();
        if (i02 != null) {
            ArrayList<InterfaceC5431s> arrayList = new ArrayList();
            for (Object obj : i02) {
                if (((ComponentCallbacksC5392m) obj) instanceof InterfaceC10428a) {
                    arrayList.add(obj);
                }
            }
            collection = new ArrayList();
            for (InterfaceC5431s interfaceC5431s : arrayList) {
                Intrinsics.g(interfaceC5431s, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.domain.CbottomHolder");
                String provideId = ((InterfaceC10428a) interfaceC5431s).provideId();
                if (provideId != null) {
                    collection.add(provideId);
                }
            }
        } else {
            collection = M.f71699a;
        }
        return C7714v.Y0(collection);
    }

    @Override // I50.a
    public final void b() {
        ArrayList arrayList;
        S80.b bVar = this.f11991a;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        if (i02 != null) {
            arrayList = new ArrayList();
            for (Object obj : i02) {
                if (((ComponentCallbacksC5392m) obj) instanceof InterfaceC10428a) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.H0((ComponentCallbacksC5392m) it.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I50.a
    public final void c(@NotNull String id2, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        S80.b bVar = this.f11991a;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        ComponentCallbacksC5392m componentCallbacksC5392m = null;
        if (i02 != null) {
            Iterator<T> it = i02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC5431s interfaceC5431s = (ComponentCallbacksC5392m) next;
                InterfaceC10428a interfaceC10428a = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
                if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, id2)) {
                    componentCallbacksC5392m = next;
                    break;
                }
            }
            componentCallbacksC5392m = componentCallbacksC5392m;
        }
        if (componentCallbacksC5392m != null) {
            bVar.H0(componentCallbacksC5392m);
        }
    }

    @Override // I50.a
    public final void d(Parcelable parcelable, @NotNull String uuid) {
        InterfaceC5431s interfaceC5431s;
        Object obj;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        A40.a aVar = (parcelable == null || !(parcelable instanceof A40.a)) ? null : (A40.a) parcelable;
        S80.b bVar = this.f11991a;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        if (i02 != null) {
            Iterator<T> it = i02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                InterfaceC5431s interfaceC5431s2 = (ComponentCallbacksC5392m) obj;
                InterfaceC10428a interfaceC10428a = interfaceC5431s2 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s2 : null;
                if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, aVar != null ? aVar.getId() : null)) {
                    break;
                }
            }
            interfaceC5431s = (ComponentCallbacksC5392m) obj;
        } else {
            interfaceC5431s = null;
        }
        InterfaceC10428a interfaceC10428a2 = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
        if (interfaceC10428a2 != null) {
            interfaceC10428a2.updateState(null, parcelable, 2, uuid);
        } else {
            bVar.F0(aVar, uuid);
        }
    }
}
