package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.push.common.messaging.RemoteMessage;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl", f = "MessagesIPCInteractorImpl.kt", l = {117, 120}, m = "handleRemoteMessage")
/* loaded from: classes4.dex */
public final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public m f36080d;

    /* renamed from: e, reason: collision with root package name */
    public RemoteMessage f36081e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f36082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f36083g;

    /* renamed from: h, reason: collision with root package name */
    public int f36084h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36083g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36082f = obj;
        this.f36084h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36083g.f(null, this);
    }
}
