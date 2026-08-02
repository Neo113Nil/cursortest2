package Rj0;

import Qj0.AbstractC3880a;
import Qj0.B;
import Qj0.C3884d;
import Qj0.I;
import Qj0.InterfaceC3896p;
import Qj0.U;
import ei0.InterfaceC6369b;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ObjectTypes;

/* loaded from: classes7.dex */
public final class a implements InterfaceC3896p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f25159a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<I> f25160b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f25161c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull InterfaceC6369b ozonTracker, @NotNull List<? extends I> interceptors) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f25159a = ozonTracker;
        this.f25160b = interceptors;
        I i11 = (I) C7714v.Z(interceptors);
        if (i11 == null) {
            throw new IllegalStateException("Performance interceptors must not be empty.");
        }
        this.f25161c = i11;
    }

    private final I a(String str, Collection collection) {
        LinkedList linkedList = new LinkedList();
        for (Object obj : collection) {
            if (((I) obj).pages().b().contains(str)) {
                linkedList.add(obj);
            }
        }
        I i11 = (I) linkedList.poll();
        if (i11 == null) {
            return this.f25161c;
        }
        I i12 = i11;
        while (!linkedList.isEmpty()) {
            I i13 = (I) linkedList.pop();
            i12.setNext$intercepted_performance_tracker_release(i13);
            i12 = i13;
        }
        return i11;
    }

    @Override // Qj0.InterfaceC3896p
    @NotNull
    public final U beginTrace(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return this.f25159a.beginTrace(trace);
    }

    @Override // Qj0.InterfaceC3896p
    public final void endTrace(@NotNull String name, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        InterfaceC6369b interfaceC6369b = this.f25159a;
        if (interfaceC6369b.hasTrace(name)) {
            U beginTrace = interfaceC6369b.beginTrace(name);
            AbstractC3880a d11 = beginTrace.d(C3884d.class);
            C3884d c3884d = d11 instanceof C3884d ? (C3884d) d11 : null;
            String a11 = c3884d != null ? c3884d.a() : null;
            AbstractC3880a d12 = beginTrace.d(B.class);
            B b11 = d12 instanceof B ? (B) d12 : null;
            I.a.C0475a c0475a = new I.a.C0475a(a11, b11 != null ? b11.a() : null);
            c0475a.b(properties);
            I.a a12 = c0475a.a();
            List<I> list = this.f25160b;
            if (a11 == null) {
                a11 = "";
            }
            if (a(a11, list).canIntercept$intercepted_performance_tracker_release(a12)) {
                interfaceC6369b.endTrace(name);
            } else {
                interfaceC6369b.removeTrace(name);
            }
        }
    }

    @Override // Qj0.InterfaceC3896p
    public final boolean hasTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f25159a.hasTrace(name);
    }

    @Override // Qj0.InterfaceC3896p
    public final boolean isSupported(@NotNull String page, @NotNull ObjectTypes objectType, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(properties, "properties");
        I.a.C0475a c0475a = new I.a.C0475a(page, objectType);
        c0475a.b(properties);
        return a(page, this.f25160b).canIntercept$intercepted_performance_tracker_release(c0475a.a());
    }

    @Override // Qj0.InterfaceC3896p
    public final U removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f25159a.removeTrace(name);
    }

    @Override // Qj0.InterfaceC3896p
    @NotNull
    public final U beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f25159a.beginTrace(name);
    }
}
