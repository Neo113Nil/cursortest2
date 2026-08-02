package androidx.compose.ui.focus;

import D1.AbstractC2794c0;
import j1.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "LD1/c0;", "Landroidx/compose/ui/focus/j;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusRequesterElement extends AbstractC2794c0<j> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f40383a;

    public FocusRequesterElement(@NotNull r rVar) {
        this.f40383a = rVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final j getF41119a() {
        return new j(this.f40383a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.d(this.f40383a, ((FocusRequesterElement) obj).f40383a);
    }

    public final int hashCode() {
        return this.f40383a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f40383a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(j jVar) {
        j jVar2 = jVar;
        jVar2.W().f().s(jVar2);
        jVar2.I1(this.f40383a);
        jVar2.W().f().b(jVar2);
    }
}
