package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", l = {34}, m = "sendNewPushTokenToService")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public f f36025d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f36026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f36027f;

    /* renamed from: g, reason: collision with root package name */
    public int f36028g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36027f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36026e = obj;
        this.f36028g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36027f.b(null, this);
    }
}
