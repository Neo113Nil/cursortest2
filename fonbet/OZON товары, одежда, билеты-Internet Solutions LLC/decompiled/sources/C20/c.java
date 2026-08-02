package C20;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.data.localization.LocalizationRepository", f = "LocalizationRepository.kt", l = {62, DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "getLocalizationReport")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f4367d;

    /* renamed from: e, reason: collision with root package name */
    Je.d f4368e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f4369f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f f4370g;

    /* renamed from: h, reason: collision with root package name */
    int f4371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f4370g = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f4369f = obj;
        this.f4371h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4370g.c(this);
    }
}
