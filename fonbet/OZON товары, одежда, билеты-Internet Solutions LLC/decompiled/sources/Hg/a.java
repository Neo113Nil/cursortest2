package Hg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, String> f10938a = new ConcurrentHashMap<>();

    @NotNull
    public final Tc.b a() {
        Tc.b builder = C7714v.B();
        synchronized (this.f10938a) {
            try {
                for (Map.Entry<String, String> entry : this.f10938a.entrySet()) {
                    builder.add(entry.getKey() + '=' + entry.getValue());
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter("ClientId", "rawKey");
        String q02 = h.q0(31, "ClientId");
        String q03 = str != null ? h.q0(31, str) : null;
        synchronized (this.f10938a) {
            try {
                String remove = this.f10938a.remove(q02);
                if (q03 != null) {
                    this.f10938a.put(q02, q03);
                    if (remove == null && this.f10938a.size() > 63) {
                        this.f10938a.entrySet().iterator().remove();
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
