package Hc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.io.File;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.nativeauth.fintech.repository.FintechRecoveryCameraRepository", f = "FintechRecoveryCameraRepository.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "uploadPassportPhoto")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f10819d;

    /* renamed from: e, reason: collision with root package name */
    File f10820e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f10821f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f10822g;

    /* renamed from: h, reason: collision with root package name */
    int f10823h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f10822g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f10821f = obj;
        this.f10823h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f10822g.c(null, null, this);
    }
}
