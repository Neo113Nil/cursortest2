package androidx.compose.foundation.lazy.layout;

import S0.InterfaceC3967k;
import a1.C4912a;
import b1.InterfaceC5505h;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10620y;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5505h f39637a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<InterfaceC10620y> f39638b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f39639c = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f39640a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f39641b;

        /* renamed from: c, reason: collision with root package name */
        private int f39642c;

        /* renamed from: d, reason: collision with root package name */
        private C4912a f39643d;

        public a(int i11, @NotNull Object obj, Object obj2) {
            this.f39640a = obj;
            this.f39641b = obj2;
            this.f39642c = i11;
        }

        @NotNull
        public final Function2<InterfaceC3967k, Integer, Unit> c() {
            C4912a c4912a = this.f39643d;
            if (c4912a != null) {
                return c4912a;
            }
            C4912a c4912a2 = new C4912a(true, 1403994769, new e(f.this, this));
            this.f39643d = c4912a2;
            return c4912a2;
        }

        public final Object d() {
            return this.f39641b;
        }

        public final int e() {
            return this.f39642c;
        }

        @NotNull
        public final Object f() {
            return this.f39640a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull InterfaceC5505h interfaceC5505h, @NotNull Function0<? extends InterfaceC10620y> function0) {
        this.f39637a = interfaceC5505h;
        this.f39638b = function0;
    }

    @NotNull
    public final Function2<InterfaceC3967k, Integer, Unit> b(int i11, @NotNull Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.f39639c;
        a aVar = (a) linkedHashMap.get(obj);
        if (aVar != null && aVar.e() == i11 && Intrinsics.d(aVar.d(), obj2)) {
            return aVar.c();
        }
        a aVar2 = new a(i11, obj, obj2);
        linkedHashMap.put(obj, aVar2);
        return aVar2.c();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.f39639c.get(obj);
        if (aVar != null) {
            return aVar.d();
        }
        InterfaceC10620y interfaceC10620y = (InterfaceC10620y) ((k) this.f39638b).invoke();
        int b11 = interfaceC10620y.b(obj);
        if (b11 != -1) {
            return interfaceC10620y.c(b11);
        }
        return null;
    }

    @NotNull
    public final Function0<InterfaceC10620y> d() {
        return this.f39638b;
    }
}
