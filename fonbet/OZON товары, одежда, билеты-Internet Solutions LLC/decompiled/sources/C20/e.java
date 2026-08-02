package C20;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.data.localization.LocalizationRepository", f = "LocalizationRepository.kt", l = {34}, m = "getLocalizationSource")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f4373d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f4374e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f4375f;

    /* renamed from: g, reason: collision with root package name */
    int f4376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f4375f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f4374e = obj;
        this.f4376g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4375f.d(null, this);
    }
}
