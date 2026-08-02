package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", l = {58}, m = "sendPushClientError")
/* loaded from: classes8.dex */
public final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public f f36033d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f36034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f36035f;

    /* renamed from: g, reason: collision with root package name */
    public int f36036g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36035f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36034e = obj;
        this.f36036g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36035f.c(null, this);
    }
}
