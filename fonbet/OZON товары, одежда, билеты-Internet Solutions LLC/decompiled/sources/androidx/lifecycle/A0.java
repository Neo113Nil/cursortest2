package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f43188a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f43188a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }

    public final w0 b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (w0) this.f43188a.get(key);
    }

    @NotNull
    public final HashSet c() {
        return new HashSet(this.f43188a.keySet());
    }

    public final void d(@NotNull String key, @NotNull w0 viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        w0 w0Var = (w0) this.f43188a.put(key, viewModel);
        if (w0Var != null) {
            w0Var.clear$lifecycle_viewmodel_release();
        }
    }
}
