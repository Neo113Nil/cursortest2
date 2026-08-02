package Y50;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.InstalledAppsBridgeInterface", f = "InstalledAppsBridgeInterface.kt", l = {72}, m = "getInstalledApps")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f34609d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f34610e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f34611f;

    /* renamed from: g, reason: collision with root package name */
    int f34612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f34611f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34610e = obj;
        this.f34612g |= LinearLayoutManager.INVALID_OFFSET;
        return c.a(this.f34611f, this);
    }
}
