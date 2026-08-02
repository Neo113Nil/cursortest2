package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.CredentialManagerRepository", f = "CredentialManagerRepository.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "clearCredential")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f15785d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f15786e;

    /* renamed from: f, reason: collision with root package name */
    int f15787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15786e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15785d = obj;
        this.f15787f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15786e.a(this);
    }
}
