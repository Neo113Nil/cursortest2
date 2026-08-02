package Kc0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.instantAuth.data.api.InstantLoginApi;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.InstantLoginRepository", f = "InstantLoginRepository.kt", l = {38, DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "disableInstantAuth-0E7RQCE")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InstantLoginApi f15829d;

    /* renamed from: e, reason: collision with root package name */
    LinkedHashMap f15830e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f15831f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ p f15832g;

    /* renamed from: h, reason: collision with root package name */
    int f15833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15832g = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15831f = obj;
        this.f15833h |= LinearLayoutManager.INVALID_OFFSET;
        Object b11 = this.f15832g.b(false, null, this);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : r.a(b11);
    }
}
