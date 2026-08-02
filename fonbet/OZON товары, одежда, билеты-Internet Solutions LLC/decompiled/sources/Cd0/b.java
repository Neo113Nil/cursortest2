package Cd0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.data.InAppPushRepository", f = "InAppPushRepository.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "callPixelUrl-gIAlu-s")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f4794d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f4795e;

    /* renamed from: f, reason: collision with root package name */
    int f4796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f4795e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f4794d = obj;
        this.f4796f |= LinearLayoutManager.INVALID_OFFSET;
        Object c11 = this.f4795e.c(null, this);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : r.a(c11);
    }
}
