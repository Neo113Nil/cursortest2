package M50;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.features.demo.domain.DemoInteractor", f = "DemoInteractor.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "getMessages")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f17462d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f17463e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f17464f;

    /* renamed from: g, reason: collision with root package name */
    int f17465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f17464f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17463e = obj;
        this.f17465g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17464f.e(false, this);
    }
}
