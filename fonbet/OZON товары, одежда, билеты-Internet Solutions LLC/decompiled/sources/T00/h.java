package T00;

import T7.E;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7243a<? extends Object> f26467a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7244b f26468b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final JSONObject f26469c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f26470d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f26471e;

    public h(InterfaceC7243a<? extends Object> interfaceC7243a, @NotNull C7244b widgetState, @NotNull JSONObject state, @NotNull Map<String, g> placeholdersData) {
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(placeholdersData, "placeholdersData");
        this.f26467a = interfaceC7243a;
        this.f26468b = widgetState;
        this.f26469c = state;
        this.f26470d = placeholdersData;
        widgetState.c().getClass();
        widgetState.c().getClass();
        String c11 = widgetState.c().c();
        this.f26471e = c11 == null ? "" : c11;
    }

    public final InterfaceC7243a<? extends Object> a() {
        return this.f26467a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, T00.g>] */
    @NotNull
    public final Map<String, g> b() {
        return this.f26470d;
    }

    @NotNull
    public final JSONObject c() {
        return this.f26469c;
    }

    @NotNull
    public final String d() {
        return this.f26471e;
    }

    @NotNull
    public final C7244b e() {
        return this.f26468b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f26467a, hVar.f26467a) && this.f26468b.equals(hVar.f26468b) && this.f26469c.equals(hVar.f26469c) && this.f26470d.equals(hVar.f26470d);
    }

    public final int hashCode() {
        InterfaceC7243a<? extends Object> interfaceC7243a = this.f26467a;
        return this.f26470d.hashCode() + ((this.f26469c.hashCode() + ((this.f26468b.hashCode() + ((interfaceC7243a == null ? 0 : interfaceC7243a.hashCode()) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreparedWidgetModel(config=");
        sb2.append(this.f26467a);
        sb2.append(", widgetState=");
        sb2.append(this.f26468b);
        sb2.append(", state=");
        sb2.append(this.f26469c);
        sb2.append(", placeholdersData=");
        return E.c(this.f26470d, ")", sb2);
    }
}
