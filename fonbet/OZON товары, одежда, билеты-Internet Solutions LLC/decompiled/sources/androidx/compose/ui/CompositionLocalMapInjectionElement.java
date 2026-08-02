package androidx.compose.ui;

import D1.AbstractC2794c0;
import S0.A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "LD1/c0;", "Landroidx/compose/ui/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompositionLocalMapInjectionElement extends AbstractC2794c0<d> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A f40319a;

    public CompositionLocalMapInjectionElement(@NotNull A a11) {
        this.f40319a = a11;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final d getF41119a() {
        return new d(this.f40319a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && Intrinsics.d(((CompositionLocalMapInjectionElement) obj).f40319a, this.f40319a);
    }

    public final int hashCode() {
        return this.f40319a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(d dVar) {
        dVar.I1(this.f40319a);
    }
}
