package Nl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.repository.VkpnsTopicRepository", f = "VkpnsTopicRepository.kt", l = {32}, m = "unsubscribeFromTopic-gIAlu-s")
/* loaded from: classes4.dex */
public final class p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f19649e;

    /* renamed from: f, reason: collision with root package name */
    public int f19650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f19649e = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f19648d = obj;
        this.f19650f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f19649e.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
