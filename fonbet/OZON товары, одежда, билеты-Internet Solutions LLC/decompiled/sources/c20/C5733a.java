package c20;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C5733a implements i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5733a f56386a = new C5733a();

    @Override // c20.i
    public final boolean a() {
        return true;
    }

    @Override // c20.i
    public final void b() {
    }

    @Override // c20.i
    public final void c(long j11, @NotNull Function0<Unit> transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
    }

    @Override // c20.i
    public final void clear() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5733a);
    }

    public final int hashCode() {
        return 691752944;
    }

    @NotNull
    public final String toString() {
        return "DisabledOverlayWidgetDeferredTrackingDelegate";
    }
}
