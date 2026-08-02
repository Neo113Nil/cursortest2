package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl", f = "MessagesIPCInteractorImpl.kt", l = {150, 77, 84}, m = "receiveSendPushesResult")
/* loaded from: classes4.dex */
public final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public m f36091d;

    /* renamed from: e, reason: collision with root package name */
    public Object f36092e;

    /* renamed from: f, reason: collision with root package name */
    public Object f36093f;

    /* renamed from: g, reason: collision with root package name */
    public List f36094g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f36095h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f36096i;

    /* renamed from: j, reason: collision with root package name */
    public int f36097j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36096i = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36095h = obj;
        this.f36097j |= LinearLayoutManager.INVALID_OFFSET;
        return m.e(this.f36096i, null, this);
    }
}
