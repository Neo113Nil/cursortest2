package B20;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Object f2199a = U.c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, r20.c>] */
    @NotNull
    public final Map<String, AbstractC9166c> a() {
        return this.f2199a;
    }

    public final void b(@NotNull LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.f2199a = linkedHashMap;
    }
}
