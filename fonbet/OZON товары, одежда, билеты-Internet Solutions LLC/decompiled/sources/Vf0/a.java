package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersDataSource", f = "ExtraHeadersDataSource.kt", l = {38, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "deleteExtraHeader")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f32687d;

    /* renamed from: e, reason: collision with root package name */
    String f32688e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f32689f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f32690g;

    /* renamed from: h, reason: collision with root package name */
    int f32691h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32690g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f32689f = obj;
        this.f32691h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32690g.c(null, this);
    }
}
