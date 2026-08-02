package B60;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.TokenId;

/* loaded from: classes3.dex */
public abstract class a extends V50.a<TokenId> {
    @Override // V50.a
    @NotNull
    public final Class<TokenId> b() {
        return TokenId.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, U50.j callback) {
        TokenId value = (TokenId) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e(weakReference, value, callback);
    }

    public abstract void e(WeakReference weakReference, @NotNull TokenId tokenId, @NotNull U50.j jVar);
}
