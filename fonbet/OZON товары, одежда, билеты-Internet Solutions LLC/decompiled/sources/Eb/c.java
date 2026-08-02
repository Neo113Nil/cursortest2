package Eb;

import R2.InterfaceC3917k;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.utils.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "compareAndSet")
/* loaded from: classes9.dex */
final class c<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3917k f7778d;

    /* renamed from: e, reason: collision with root package name */
    f.a f7779e;

    /* renamed from: f, reason: collision with root package name */
    Integer f7780f;

    /* renamed from: g, reason: collision with root package name */
    int f7781g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f7782h;

    /* renamed from: i, reason: collision with root package name */
    int f7783i;

    c(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f7782h = obj;
        this.f7783i |= LinearLayoutManager.INVALID_OFFSET;
        return g.a(null, null, null, null, this);
    }
}
