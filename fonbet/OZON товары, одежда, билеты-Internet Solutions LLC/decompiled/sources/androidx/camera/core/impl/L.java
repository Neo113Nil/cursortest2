package androidx.camera.core.impl;

import C.C2698s;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38132a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f38133b = new LinkedHashMap();

    public L() {
        new HashSet();
    }

    @NonNull
    public final LinkedHashSet<I> a() {
        LinkedHashSet<I> linkedHashSet;
        synchronized (this.f38132a) {
            linkedHashSet = new LinkedHashSet<>((Collection<? extends I>) this.f38133b.values());
        }
        return linkedHashSet;
    }

    public final void b(@NonNull G g10) throws C.P {
        synchronized (this.f38132a) {
            try {
                for (String str : g10.c()) {
                    C.S.a("CameraRepository", "Added camera: " + str);
                    this.f38133b.put(str, g10.b(str));
                }
            } catch (C2698s e11) {
                throw new C.P(e11);
            }
        }
    }
}
