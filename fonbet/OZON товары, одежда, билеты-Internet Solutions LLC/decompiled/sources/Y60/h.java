package Y60;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.common.transformer.TransferDataCachedTransformer", f = "TransferDataCachedTransformer.kt", l = {38, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 53}, m = "prepareForCache")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f34728d;

    /* renamed from: e, reason: collision with root package name */
    TransferData f34729e;

    /* renamed from: f, reason: collision with root package name */
    Map f34730f;

    /* renamed from: g, reason: collision with root package name */
    List f34731g;

    /* renamed from: h, reason: collision with root package name */
    Iterator f34732h;

    /* renamed from: i, reason: collision with root package name */
    BankInfo f34733i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f34734j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g f34735k;

    /* renamed from: l, reason: collision with root package name */
    int f34736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f34735k = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34734j = obj;
        this.f34736l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34735k.b(null, this);
    }
}
