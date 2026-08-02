package I20;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import B20.e;
import I20.a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import ze.C11115c;
import ze.k;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f11809a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C11115c f11810b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<a> f11811c;

    public b(@NotNull e inMemoryCache) {
        Intrinsics.checkNotNullParameter(inMemoryCache, "inMemoryCache");
        this.f11809a = inMemoryCache;
        C11115c a11 = k.a(0, 7, null);
        this.f11810b = a11;
        this.f11811c = C2399j.H(a11);
    }

    @NotNull
    public final InterfaceC2395h<a> a() {
        return this.f11811c;
    }

    public final void b(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f11810b.b(new a.b(groupId));
    }

    public final void c(@NotNull AbstractC9166c provider) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(provider, "provider");
        Iterator<T> it = this.f11809a.a().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((Map.Entry) obj).getValue(), provider)) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (str = (String) entry.getKey()) == null) {
            return;
        }
        this.f11810b.b(new a.b(str));
    }
}
