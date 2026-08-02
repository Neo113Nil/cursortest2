package E0;

import D0.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", l = {679}, m = "collectImeNotifications")
/* loaded from: classes8.dex */
final class e1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e.a f7188d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f7189e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c1 f7190f;

    /* renamed from: g, reason: collision with root package name */
    int f7191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e1(c1 c1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f7190f = c1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f7189e = obj;
        this.f7191g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f7190f.e(null, this);
    }
}
