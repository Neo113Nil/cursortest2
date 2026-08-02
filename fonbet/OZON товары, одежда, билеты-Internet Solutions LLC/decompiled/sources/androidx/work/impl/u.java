package androidx.work.impl;

import g5.C6643p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f45487a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f45488b = new LinkedHashMap();

    public final boolean a(@NotNull C6643p id2) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f45487a) {
            containsKey = this.f45488b.containsKey(id2);
        }
        return containsKey;
    }

    public final t b(@NotNull C6643p id2) {
        t tVar;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f45487a) {
            tVar = (t) this.f45488b.remove(id2);
        }
        return tVar;
    }

    @NotNull
    public final List<t> c(@NotNull String workSpecId) {
        List<t> U02;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f45487a) {
            try {
                LinkedHashMap linkedHashMap = this.f45488b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (Intrinsics.d(((C6643p) entry.getKey()).b(), workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    this.f45488b.remove((C6643p) it.next());
                }
                U02 = C7714v.U0(linkedHashMap2.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return U02;
    }

    @NotNull
    public final t d(@NotNull C6643p id2) {
        t tVar;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f45487a) {
            try {
                LinkedHashMap linkedHashMap = this.f45488b;
                Object obj = linkedHashMap.get(id2);
                if (obj == null) {
                    obj = new t(id2);
                    linkedHashMap.put(id2, obj);
                }
                tVar = (t) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
