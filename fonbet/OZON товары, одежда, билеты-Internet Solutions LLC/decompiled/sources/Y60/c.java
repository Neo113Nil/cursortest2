package Y60;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomSheet;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.common.transformer.CbottomDataCachedTransformer", f = "CbottomDataCachedTransformer.kt", l = {21}, m = "prepareForCache")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f34704d;

    /* renamed from: e, reason: collision with root package name */
    CbottomData f34705e;

    /* renamed from: f, reason: collision with root package name */
    Collection f34706f;

    /* renamed from: g, reason: collision with root package name */
    Iterator f34707g;

    /* renamed from: h, reason: collision with root package name */
    CbottomSheet f34708h;

    /* renamed from: i, reason: collision with root package name */
    Collection f34709i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f34710j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ d f34711k;

    /* renamed from: l, reason: collision with root package name */
    int f34712l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f34711k = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34710j = obj;
        this.f34712l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34711k.b(null, this);
    }
}
