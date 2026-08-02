package El0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 46, 55, 56, 66}, m = "requestFullReSubscription")
/* loaded from: classes4.dex */
public final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public a f8059d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8060e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f8062g;

    /* renamed from: h, reason: collision with root package name */
    public int f8063h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8062g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8061f = obj;
        this.f8063h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8062g.f(null, this);
    }
}
