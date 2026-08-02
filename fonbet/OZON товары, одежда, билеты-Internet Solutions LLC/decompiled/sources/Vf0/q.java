package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.OzonNetworkExtraHeadersDeeplinkHandler", f = "OzonNetworkExtraHeadersDeeplinkHandler.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "onAdd")
/* loaded from: classes3.dex */
final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f32751d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p f32752e;

    /* renamed from: f, reason: collision with root package name */
    int f32753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32752e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f32751d = obj;
        this.f32753f |= LinearLayoutManager.INVALID_OFFSET;
        return p.a(this.f32752e, null, null, this);
    }
}
