package Y50;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.InstalledBanksAppsBridgeInterface", f = "InstalledBanksAppsBridgeInterface.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "getInstalledBankApps")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f34625d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f34626e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f34627f;

    /* renamed from: g, reason: collision with root package name */
    int f34628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f34627f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34626e = obj;
        this.f34628g |= LinearLayoutManager.INVALID_OFFSET;
        return e.a(this.f34627f, this);
    }
}
