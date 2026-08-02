package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource", f = "ArbiterStoreDataSource.kt", l = {32, DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "isDefaultHostChanged")
/* loaded from: classes8.dex */
public final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public i f20475d;

    /* renamed from: e, reason: collision with root package name */
    public Za.a f20476e;

    /* renamed from: f, reason: collision with root package name */
    public int f20477f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f20478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f20479h;

    /* renamed from: i, reason: collision with root package name */
    public int f20480i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20479h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20478g = obj;
        this.f20480i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f20479h.a(null, this);
    }
}
