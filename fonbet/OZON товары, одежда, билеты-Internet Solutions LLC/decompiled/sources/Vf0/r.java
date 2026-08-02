package Vf0;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.OzonNetworkExtraHeadersDeeplinkHandler", f = "OzonNetworkExtraHeadersDeeplinkHandler.kt", l = {42, 50}, m = "saveExtraHeaders")
/* loaded from: classes3.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    p f32754d;

    /* renamed from: e, reason: collision with root package name */
    Uri f32755e;

    /* renamed from: f, reason: collision with root package name */
    Set f32756f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f32757g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ p f32758h;

    /* renamed from: i, reason: collision with root package name */
    int f32759i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32758h = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object e11;
        this.f32757g = obj;
        this.f32759i |= LinearLayoutManager.INVALID_OFFSET;
        e11 = this.f32758h.e(null, null, this);
        return e11;
    }
}
