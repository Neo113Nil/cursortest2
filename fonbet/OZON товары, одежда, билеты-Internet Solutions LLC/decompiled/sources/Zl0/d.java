package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", l = {50}, m = "sendOnDeleteMessageToService")
/* loaded from: classes4.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public f f36029d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f36030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f36031f;

    /* renamed from: g, reason: collision with root package name */
    public int f36032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36031f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36030e = obj;
        this.f36032g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36031f.e(this);
    }
}
