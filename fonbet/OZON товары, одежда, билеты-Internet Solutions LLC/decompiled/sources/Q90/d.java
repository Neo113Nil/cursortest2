package Q90;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.AppConfig;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.domain.FeatureToggles", f = "FeatureToggles.kt", l = {UserVerificationMethods.USER_VERIFY_NONE}, m = "hasNewAppConfig")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f23073d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f23074e;

    /* renamed from: f, reason: collision with root package name */
    AppConfig f23075f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f23076g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f23077h;

    /* renamed from: i, reason: collision with root package name */
    int f23078i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f23077h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23076g = obj;
        this.f23078i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23077h.t(null, false, this);
    }
}
