package E0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {59}, m = "platformSpecificTextInputSession")
/* renamed from: E0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2916d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f7178d;

    /* renamed from: e, reason: collision with root package name */
    int f7179e;

    C2916d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f7178d = obj;
        this.f7179e |= LinearLayoutManager.INVALID_OFFSET;
        return C2926i.b(null, null, null, null, null, null, null, null, this);
    }
}
