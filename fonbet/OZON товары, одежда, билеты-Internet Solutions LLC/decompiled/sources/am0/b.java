package am0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController", f = "NotificationController.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "downloadImage")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public e f36846d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f36847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f36848f;

    /* renamed from: g, reason: collision with root package name */
    public int f36849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36848f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36847e = obj;
        this.f36849g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36848f.b(null, this);
    }
}
