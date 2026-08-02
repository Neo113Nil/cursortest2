package Ml0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.ipc.ArbiterIPCClient", f = "ArbiterIPCClient.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "getMaster-IoAF18A")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18160e;

    /* renamed from: f, reason: collision with root package name */
    public int f18161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f18160e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f18159d = obj;
        this.f18161f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f18160e.a(this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}
