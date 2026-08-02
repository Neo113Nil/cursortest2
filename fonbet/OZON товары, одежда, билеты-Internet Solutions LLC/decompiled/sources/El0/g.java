package El0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.ValidationComponent", f = "ValidationComponent.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER, AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 49, 54}, m = "validate")
/* loaded from: classes8.dex */
public final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f8064d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8065e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8066f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f8068h;

    /* renamed from: i, reason: collision with root package name */
    public int f8069i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8068h = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8067g = obj;
        this.f8069i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8068h.a(null, null, this);
    }
}
