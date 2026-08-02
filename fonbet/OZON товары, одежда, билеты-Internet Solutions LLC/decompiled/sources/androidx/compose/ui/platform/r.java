package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class r extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j1.c f41005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(j1.c cVar) {
        super(1);
        this.f41005b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        Boolean i11 = j1.y.i(focusTargetNode, this.f41005b.d());
        return Boolean.valueOf(i11 != null ? i11.booleanValue() : true);
    }
}
