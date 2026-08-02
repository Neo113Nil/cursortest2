package Q90;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.domain.FeatureToggles", f = "FeatureToggles.kt", l = {393}, m = "loadByName")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f23087d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f23088e;

    /* renamed from: f, reason: collision with root package name */
    int f23089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f23088e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23087d = obj;
        this.f23089f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23088e.u(null, this);
    }
}
