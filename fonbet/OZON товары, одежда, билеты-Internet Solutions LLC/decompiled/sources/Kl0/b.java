package Kl0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.auth.AuthIPCClientImpl", f = "AuthIPCClientImpl.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "getIntermediateToken-IoAF18A")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f16009e;

    /* renamed from: f, reason: collision with root package name */
    public int f16010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f16009e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f16008d = obj;
        this.f16010f |= LinearLayoutManager.INVALID_OFFSET;
        Object b11 = this.f16009e.b(this);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : r.a(b11);
    }
}
