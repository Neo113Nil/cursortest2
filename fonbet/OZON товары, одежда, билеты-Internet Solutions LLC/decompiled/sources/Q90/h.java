package Q90;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.domain.FeatureToggles", f = "FeatureToggles.kt", l = {233, 243, 251, 257}, m = "loadFeatureToggles")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f23090d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f23091e;

    /* renamed from: f, reason: collision with root package name */
    c f23092f;

    /* renamed from: g, reason: collision with root package name */
    int f23093g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f23094h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ c f23095i;

    /* renamed from: j, reason: collision with root package name */
    int f23096j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f23095i = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23094h = obj;
        this.f23096j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23095i.v(null, this);
    }
}
