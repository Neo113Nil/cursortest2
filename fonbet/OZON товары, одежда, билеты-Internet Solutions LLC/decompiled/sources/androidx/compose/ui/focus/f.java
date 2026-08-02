package androidx.compose.ui.focus;

import j1.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f40400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(int i11) {
        super(1);
        this.f40400b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        Boolean i11 = y.i(focusTargetNode, this.f40400b);
        return Boolean.valueOf(i11 != null ? i11.booleanValue() : false);
    }
}
