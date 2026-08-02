package U2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
/* loaded from: classes.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f27282d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f27283e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b<Object> f27284f;

    /* renamed from: g, reason: collision with root package name */
    int f27285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f27284f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f27283e = obj;
        this.f27285g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f27284f.j(null, this);
    }
}
