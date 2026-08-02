package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.InstantLoginRepository", f = "InstantLoginRepository.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER, DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "enableInstantAuth")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    p f15834d;

    /* renamed from: e, reason: collision with root package name */
    String f15835e;

    /* renamed from: f, reason: collision with root package name */
    Map f15836f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f15837g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ p f15838h;

    /* renamed from: i, reason: collision with root package name */
    int f15839i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15838h = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15837g = obj;
        this.f15839i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15838h.c(null, null, this);
    }
}
