package Eb;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.utils.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", l = {14}, m = "getValue")
/* loaded from: classes9.dex */
final class e<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Integer f7791d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f7792e;

    /* renamed from: f, reason: collision with root package name */
    int f7793f;

    e(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f7792e = obj;
        this.f7793f |= LinearLayoutManager.INVALID_OFFSET;
        return g.b(null, null, null, this);
    }
}
