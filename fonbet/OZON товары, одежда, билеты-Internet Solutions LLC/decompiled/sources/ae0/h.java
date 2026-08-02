package ae0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.MapInitializer", f = "MapInitializer.kt", l = {103, 114, UserVerificationMethods.USER_VERIFY_PATTERN}, m = "setAllApiKeysFromBack")
/* loaded from: classes7.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f36644d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f36645e;

    /* renamed from: f, reason: collision with root package name */
    AbstractC5006b f36646f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f36647g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ i f36648h;

    /* renamed from: i, reason: collision with root package name */
    int f36649i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36648h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36647g = obj;
        this.f36649i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36648h.e(null, this);
    }
}
