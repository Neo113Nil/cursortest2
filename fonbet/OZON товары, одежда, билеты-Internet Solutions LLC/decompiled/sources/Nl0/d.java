package Nl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {119, AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 50, 57, 68, 96}, m = "getMasterHost")
/* loaded from: classes8.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f19618d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19619e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19620f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f19621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f19622h;

    /* renamed from: i, reason: collision with root package name */
    public int f19623i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f19622h = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f19621g = obj;
        this.f19623i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19622h.c(this);
    }
}
