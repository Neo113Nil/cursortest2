package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource", f = "ArbiterStoreDataSource.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER, TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "getMaster")
/* loaded from: classes8.dex */
public final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f20471d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f20473f;

    /* renamed from: g, reason: collision with root package name */
    public int f20474g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20473f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20472e = obj;
        this.f20474g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f20473f.b(this);
    }
}
