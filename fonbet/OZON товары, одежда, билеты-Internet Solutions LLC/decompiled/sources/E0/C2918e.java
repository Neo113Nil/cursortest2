package E0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {82}, m = "platformSpecificTextInputSession")
/* renamed from: E0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2918e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f7186d;

    /* renamed from: e, reason: collision with root package name */
    int f7187e;

    C2918e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f7186d = obj;
        this.f7187e |= LinearLayoutManager.INVALID_OFFSET;
        return C2926i.c(null, null, null, null, null, null, null, null, null, this);
    }
}
