package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
/* loaded from: classes.dex */
final class P extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    FileOutputStream f24318d;

    /* renamed from: e, reason: collision with root package name */
    FileOutputStream f24319e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24320f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q<Object> f24321g;

    /* renamed from: h, reason: collision with root package name */
    int f24322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(Q q11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24321g = q11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24320f = obj;
        this.f24322h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24321g.c(null, this);
    }
}
