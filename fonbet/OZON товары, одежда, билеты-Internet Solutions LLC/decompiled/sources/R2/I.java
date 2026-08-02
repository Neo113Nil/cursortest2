package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
/* loaded from: classes.dex */
final class I<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f24284d;

    /* renamed from: e, reason: collision with root package name */
    FileInputStream f24285e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24286f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ J<T> f24287g;

    /* renamed from: h, reason: collision with root package name */
    int f24288h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(J j11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24287g = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24286f = obj;
        this.f24288h |= LinearLayoutManager.INVALID_OFFSET;
        return J.i(this.f24287g, this);
    }
}
