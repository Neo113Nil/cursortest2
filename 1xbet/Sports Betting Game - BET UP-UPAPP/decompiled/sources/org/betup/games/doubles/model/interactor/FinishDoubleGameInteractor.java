package org.betup.games.doubles.model.interactor;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.doubles.model.rest.DoubleGameFinishRequest;
import org.betup.games.doubles.model.rest.SessionDoubleGame;
import org.betup.model.remote.api.infrastructure.MiniGameApi;
import org.betup.model.remote.api.rest.base.BaseGamesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: FinishDoubleGameInteractor.kt */
@Singleton
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0014¨\u0006\u0013"}, d2 = {"Lorg/betup/games/doubles/model/interactor/FinishDoubleGameInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseGamesInteractor;", "Lorg/betup/games/doubles/model/rest/SessionDoubleGame;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLifetime", "", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/MiniGameApi;", "token", "FinishGameInteractorBundle", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinishDoubleGameInteractor extends BaseGamesInteractor<SessionDoubleGame, String> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public FinishDoubleGameInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<SessionDoubleGame> makeCall(MiniGameApi api, String id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(token, "token");
        return api.finishDoubleGame(token, new DoubleGameFinishRequest(parameters.getLong("returnAmount"), id));
    }

    /* compiled from: FinishDoubleGameInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/betup/games/doubles/model/interactor/FinishDoubleGameInteractor$FinishGameInteractorBundle;", "", "returnAmount", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "getReturnAmount", "()I", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FinishGameInteractorBundle {
        public static final int $stable = 0;
        private final int returnAmount;

        public FinishGameInteractorBundle(int i) {
            this.returnAmount = i;
        }

        public final int getReturnAmount() {
            return this.returnAmount;
        }
    }
}
