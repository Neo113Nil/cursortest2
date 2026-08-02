package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.ClientSdkModeDataStore", f = "ClientSdkModeDataStore.kt", l = {15, 20}, m = "isDefaultHostChanged")
/* loaded from: classes8.dex */
public final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public m f20489d;

    /* renamed from: e, reason: collision with root package name */
    public int f20490e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f20491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f20492g;

    /* renamed from: h, reason: collision with root package name */
    public int f20493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20492g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20491f = obj;
        this.f20493h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f20492g.a(this);
    }
}
