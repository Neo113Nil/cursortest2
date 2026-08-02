package am0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import eb.C6338b;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController", f = "NotificationController.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "showNotification")
/* loaded from: classes4.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public e f36853d;

    /* renamed from: e, reason: collision with root package name */
    public C6338b f36854e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f36855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f36856g;

    /* renamed from: h, reason: collision with root package name */
    public int f36857h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36856g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36855f = obj;
        this.f36857h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36856g.a(null, this);
    }
}
