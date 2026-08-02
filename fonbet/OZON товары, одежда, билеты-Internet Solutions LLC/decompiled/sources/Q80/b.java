package Q80;

import android.content.Intent;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, a> f23035a = new HashMap<>();

    @Override // ru.ozon.fintech.nav.domain.activityresult.FintechActivityResultHandler
    public final void handle(int i11, int i12, Intent intent) {
        a aVar = this.f23035a.get(Integer.valueOf(i11));
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // ru.ozon.fintech.nav.domain.activityresult.FintechActivityResultHandler
    public final boolean isCanHandleRequest(int i11) {
        return this.f23035a.get(Integer.valueOf(i11)) != null;
    }
}
