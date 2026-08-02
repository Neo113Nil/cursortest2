package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi", f = "VkpnsTopicSourceApi.kt", l = {43}, m = "unsubscribeFromTopic-0E7RQCE")
/* loaded from: classes4.dex */
public final class y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f20534e;

    /* renamed from: f, reason: collision with root package name */
    public int f20535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20534e = a11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20533d = obj;
        this.f20535f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f20534e.a(null, null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
