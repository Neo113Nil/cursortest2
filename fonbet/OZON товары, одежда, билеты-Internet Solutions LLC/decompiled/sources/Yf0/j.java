package Yf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.OzonNetworkMockPathListDeeplinkHandler", f = "OzonNetworkMockPathListDeeplinkHandler.kt", l = {46}, m = "onAdd")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f35023d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f35024e;

    /* renamed from: f, reason: collision with root package name */
    int f35025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f35024e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35023d = obj;
        this.f35025f |= LinearLayoutManager.INVALID_OFFSET;
        return i.a(this.f35024e, null, this);
    }
}
