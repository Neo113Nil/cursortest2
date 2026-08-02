package Db;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@e(c = "com.vk.push.core.retry.RequestRetryComponent", f = "RequestRetryComponent.kt", l = {17, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 41}, m = "invoke-gIAlu-s")
/* loaded from: classes9.dex */
final class b<T> extends c {

    /* renamed from: d, reason: collision with root package name */
    a f6291d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f6292e;

    /* renamed from: f, reason: collision with root package name */
    int f6293f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f6294g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ a f6295h;

    /* renamed from: i, reason: collision with root package name */
    int f6296i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar, c cVar) {
        super(cVar);
        this.f6295h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f6294g = obj;
        this.f6296i |= LinearLayoutManager.INVALID_OFFSET;
        Object d11 = this.f6295h.d(null, this);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : r.a(d11);
    }
}
