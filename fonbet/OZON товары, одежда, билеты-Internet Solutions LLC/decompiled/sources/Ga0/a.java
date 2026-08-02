package Ga0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.data.source.impl.EnvironmentsDataSourceImpl", f = "EnvironmentsDataSourceImpl.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "getSelectedEnv")
/* loaded from: classes7.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f9880d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f9881e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f9882f;

    /* renamed from: g, reason: collision with root package name */
    int f9883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f9882f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f9881e = obj;
        this.f9883g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9882f.c(this);
    }
}
