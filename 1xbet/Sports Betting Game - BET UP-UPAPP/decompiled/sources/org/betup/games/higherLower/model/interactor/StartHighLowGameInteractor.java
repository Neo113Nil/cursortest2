package org.betup.games.higherLower.model.interactor;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.Gson;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.betup.games.common.remote.HigherLowerGameStartRequest;
import org.betup.games.higherLower.model.rest.StartHigherLowerGameModel;
import org.betup.model.remote.api.infrastructure.MiniGameApi;
import org.betup.model.remote.api.rest.base.BaseGamesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: StartHighLowGameInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0015"}, d2 = {"Lorg/betup/games/higherLower/model/interactor/StartHighLowGameInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseGamesInteractor;", "Lorg/betup/games/higherLower/model/rest/StartHigherLowerGameModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLifetime", "", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/MiniGameApi;", "token", "", "transformErrorBody", "body", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StartHighLowGameInteractor extends BaseGamesInteractor<StartHigherLowerGameModel, Object> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Object id, Bundle parameters) {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public StartHighLowGameInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<StartHigherLowerGameModel> makeCall(MiniGameApi api, Object id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(token, "token");
        return api.startHighLowGame(token, new HigherLowerGameStartRequest(parameters.getInt("betAmount")));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public StartHigherLowerGameModel transformErrorBody(String body) {
        try {
            GamesErrorCodeModel gamesErrorCodeModel = (GamesErrorCodeModel) new Gson().fromJson(body, GamesErrorCodeModel.class);
            StartHigherLowerGameModel startHigherLowerGameModel = (StartHigherLowerGameModel) new Gson().fromJson(body, StartHigherLowerGameModel.class);
            startHigherLowerGameModel.setGamesErrorCodeModel(gamesErrorCodeModel);
            return startHigherLowerGameModel;
        } catch (Exception e) {
            Log.d("GAMEERRORCODES", "ERROR!");
            e.printStackTrace();
            return null;
        }
    }
}
