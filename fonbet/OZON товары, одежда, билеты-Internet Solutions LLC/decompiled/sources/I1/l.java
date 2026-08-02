package I1;

import Kk.C3532b;
import Sc.InterfaceC4003e;
import androidx.compose.ui.platform.C5251h1;
import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l implements D, Iterable<Map.Entry<? extends C<?>, ? extends Object>>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f11724a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f11725b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11726c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I1.D
    public final <T> void b(@NotNull C<T> c11, T t2) {
        boolean z11 = t2 instanceof C3222a;
        LinkedHashMap linkedHashMap = this.f11724a;
        if (!z11 || !linkedHashMap.containsKey(c11)) {
            linkedHashMap.put(c11, t2);
            return;
        }
        Object obj = linkedHashMap.get(c11);
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C3222a c3222a = (C3222a) obj;
        C3222a c3222a2 = (C3222a) t2;
        String b11 = c3222a2.b();
        if (b11 == null) {
            b11 = c3222a.b();
        }
        InterfaceC4003e a11 = c3222a2.a();
        if (a11 == null) {
            a11 = c3222a.a();
        }
        linkedHashMap.put(c11, new C3222a(b11, a11));
    }

    public final void c(@NotNull l lVar) {
        if (lVar.f11725b) {
            this.f11725b = true;
        }
        if (lVar.f11726c) {
            this.f11726c = true;
        }
        for (Map.Entry entry : lVar.f11724a.entrySet()) {
            C c11 = (C) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f11724a;
            if (!linkedHashMap.containsKey(c11)) {
                linkedHashMap.put(c11, value);
            } else if (value instanceof C3222a) {
                Object obj = linkedHashMap.get(c11);
                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C3222a c3222a = (C3222a) obj;
                String b11 = c3222a.b();
                if (b11 == null) {
                    b11 = ((C3222a) value).b();
                }
                InterfaceC4003e a11 = c3222a.a();
                if (a11 == null) {
                    a11 = ((C3222a) value).a();
                }
                linkedHashMap.put(c11, new C3222a(b11, a11));
            }
        }
    }

    public final <T> boolean e(@NotNull C<T> c11) {
        return this.f11724a.containsKey(c11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f11724a, lVar.f11724a) && this.f11725b == lVar.f11725b && this.f11726c == lVar.f11726c;
    }

    public final boolean h() {
        Set keySet = this.f11724a.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11726c) + C3532b.a(this.f11724a.hashCode() * 31, 31, this.f11725b);
    }

    @NotNull
    public final l i() {
        l lVar = new l();
        lVar.f11725b = this.f11725b;
        lVar.f11726c = this.f11726c;
        lVar.f11724a.putAll(this.f11724a);
        return lVar;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Map.Entry<? extends C<?>, ? extends Object>> iterator() {
        return this.f11724a.entrySet().iterator();
    }

    public final <T> T k(@NotNull C<T> c11) {
        T t2 = (T) this.f11724a.get(c11);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Key not present: " + c11 + " - consider getOrElse or getOrNull");
    }

    public final <T> T l(@NotNull C<T> c11, @NotNull Function0<? extends T> function0) {
        T t2 = (T) this.f11724a.get(c11);
        return t2 == null ? function0.invoke() : t2;
    }

    public final <T> T m(@NotNull C<T> c11, @NotNull Function0<? extends T> function0) {
        T t2 = (T) this.f11724a.get(c11);
        if (t2 != null) {
            return t2;
        }
        function0.getClass();
        return null;
    }

    public final boolean n() {
        return this.f11726c;
    }

    public final boolean o() {
        return this.f11725b;
    }

    public final void q(@NotNull l lVar) {
        for (Map.Entry entry : lVar.f11724a.entrySet()) {
            C c11 = (C) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f11724a;
            Object obj = linkedHashMap.get(c11);
            Intrinsics.g(c11, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object c12 = c11.c(obj, value);
            if (c12 != null) {
                linkedHashMap.put(c11, c12);
            }
        }
    }

    public final void r(boolean z11) {
        this.f11726c = z11;
    }

    public final void s(boolean z11) {
        this.f11725b = z11;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f11725b) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f11726c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f11724a.entrySet()) {
            C c11 = (C) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(c11.a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return C5251h1.a(this) + "{ " + ((Object) sb2) + " }";
    }
}
