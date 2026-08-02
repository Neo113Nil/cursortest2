package Fd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.inapp.push.sdk.internal.domain.InAppPushInteractor", f = "InAppPushInteractor.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "receiveInAppPush")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f9412d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f9413e;

    /* renamed from: f, reason: collision with root package name */
    int f9414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f9413e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f9412d = obj;
        this.f9414f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9413e.b(null, this);
    }
}
