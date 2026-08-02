package Yf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.OzonNetworkMockPathListDeeplinkHandler", f = "OzonNetworkMockPathListDeeplinkHandler.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "onDelete")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f35026d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f35027e;

    /* renamed from: f, reason: collision with root package name */
    int f35028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f35027e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35026d = obj;
        this.f35028f |= LinearLayoutManager.INVALID_OFFSET;
        return i.b(this.f35027e, this);
    }
}
