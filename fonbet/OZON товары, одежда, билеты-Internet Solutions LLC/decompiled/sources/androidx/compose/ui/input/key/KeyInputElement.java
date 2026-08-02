package androidx.compose.ui.input.key;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.C10177b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "LD1/c0;", "Landroidx/compose/ui/input/key/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class KeyInputElement extends AbstractC2794c0<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<C10177b, Boolean> f40466a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7737t f40467b;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(Function1<? super C10177b, Boolean> function1, Function1<? super C10177b, Boolean> function12) {
        this.f40466a = function1;
        this.f40467b = (AbstractC7737t) function12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final b getF41119a() {
        return new b(this.f40466a, this.f40467b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return Intrinsics.d(this.f40466a, keyInputElement.f40466a) && Intrinsics.d(this.f40467b, keyInputElement.f40467b);
    }

    public final int hashCode() {
        Function1<C10177b, Boolean> function1 = this.f40466a;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        AbstractC7737t abstractC7737t = this.f40467b;
        return hashCode + (abstractC7737t != null ? abstractC7737t.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f40466a + ", onPreKeyEvent=" + this.f40467b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    public final void update(b bVar) {
        b bVar2 = bVar;
        bVar2.I1(this.f40466a);
        bVar2.J1(this.f40467b);
    }
}
