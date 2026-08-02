package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", l = {42}, m = "sendNewPushMessageToService")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public f f36021d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f36022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f36023f;

    /* renamed from: g, reason: collision with root package name */
    public int f36024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36023f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36022e = obj;
        this.f36024g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36023f.a(null, this);
    }
}
