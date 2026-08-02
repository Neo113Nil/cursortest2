package M50;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.features.demo.domain.DemoInteractor", f = "DemoInteractor.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "getAccounts")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f17458d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f17459e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f17460f;

    /* renamed from: g, reason: collision with root package name */
    int f17461g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f17460f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17459e = obj;
        this.f17461g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17460f.d(false, this);
    }
}
