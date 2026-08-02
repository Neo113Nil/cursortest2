package c20;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c20.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5734b implements i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sg.a f56387a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<Long, Function0<Unit>> f56388b;

    public C5734b(@NotNull Sg.a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.f56387a = analyticsScreenStorage;
        this.f56388b = new LinkedHashMap<>();
    }

    @Override // c20.i
    public final boolean a() {
        return this.f56387a.a() != null;
    }

    @Override // c20.i
    public final void b() {
        LinkedHashMap<Long, Function0<Unit>> linkedHashMap = this.f56388b;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Collection<Function0<Unit>> values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        List U02 = C7714v.U0(values);
        linkedHashMap.clear();
        Iterator it = U02.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    @Override // c20.i
    public final void c(long j11, @NotNull Function0<Unit> transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f56388b.put(Long.valueOf(j11), transaction);
    }

    @Override // c20.i
    public final void clear() {
        this.f56388b.clear();
    }
}
