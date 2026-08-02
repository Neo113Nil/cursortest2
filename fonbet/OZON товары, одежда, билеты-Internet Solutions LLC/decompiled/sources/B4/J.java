package B4;

import B4.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class J<D extends H> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0<? extends D> f2528a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2529b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2530c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f2531d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private ArrayList f2532e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f2533f;

    public J(@NotNull b0<? extends D> navigator, String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f2528a = navigator;
        this.f2529b = -1;
        this.f2530c = str;
        this.f2531d = new LinkedHashMap();
        this.f2532e = new ArrayList();
        this.f2533f = new LinkedHashMap();
    }

    public final void a(@NotNull String name, @NotNull C2578g argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f2531d.put(name, argument);
    }

    @NotNull
    public D b() {
        D e11 = e();
        e11.w(null);
        for (Map.Entry entry : this.f2531d.entrySet()) {
            e11.b((String) entry.getKey(), (C2578g) entry.getValue());
        }
        Iterator it = this.f2532e.iterator();
        while (it.hasNext()) {
            e11.c((A) it.next());
        }
        for (Map.Entry entry2 : this.f2533f.entrySet()) {
            e11.u(((Number) entry2.getKey()).intValue(), (C2577f) entry2.getValue());
        }
        String str = this.f2530c;
        if (str != null) {
            e11.z(str);
        }
        int i11 = this.f2529b;
        if (i11 != -1) {
            e11.v(i11);
        }
        return e11;
    }

    public final void c(@NotNull A navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        this.f2532e.add(navDeepLink);
    }

    public final String d() {
        return this.f2530c;
    }

    @NotNull
    protected D e() {
        return this.f2528a.a();
    }
}
