package org.betup.model.remote.api.rest.quiz;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.matches.details.QuizParticipationListResponseModel;
import org.betup.model.remote.entity.quiz.QuizShortParticipationModel;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: QuizParticipationsInteractor.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014J?\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0014¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u001d2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u001e¨\u0006 "}, d2 = {"Lorg/betup/model/remote/api/rest/quiz/QuizParticipationsInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationListResponseModel;", "Lorg/betup/model/remote/entity/quiz/QuizShortParticipationModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "", "state", "(Ljava/lang/Integer;)V", "load", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "(Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;Ljava/lang/Integer;)V", "getHash", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "(Ljava/lang/Integer;Landroid/os/Bundle;)I", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "(Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;Ljava/lang/Integer;Landroid/os/Bundle;Ljava/lang/String;)Lretrofit2/Call;", "getLifetime", "", "(Ljava/lang/Integer;Landroid/os/Bundle;)J", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
/* loaded from: classes2.dex */
public final class QuizParticipationsInteractor extends BaseNewVersionBettingInteractor<QuizParticipationListResponseModel<QuizShortParticipationModel>, Integer> {
    private static final long LIFETIME = 10000;
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Integer state, Bundle parameters) {
        return 10000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor, org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ void load(BaseCachedSharedInteractor.OnFetchedListener onFetchedListener, Object obj) {
        load((BaseCachedSharedInteractor.OnFetchedListener<QuizParticipationListResponseModel<QuizShortParticipationModel>, Integer>) onFetchedListener, (Integer) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public QuizParticipationsInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Integer state) {
        removeFromCache(getHash(state, (Bundle) null));
    }

    public void load(BaseCachedSharedInteractor.OnFetchedListener<QuizParticipationListResponseModel<QuizShortParticipationModel>, Integer> listener, Integer state) {
        throw new IllegalArgumentException("you should obligatory provide bundle with offset and limit");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(Integer state, Bundle parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameters bundle is required".toString());
        }
        return HashCoder.hashCode(state, Integer.valueOf(parameters.getInt("offset")), Integer.valueOf(parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT)), SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<QuizParticipationListResponseModel<QuizShortParticipationModel>> makeCall(NewVersionBettingApi api, Integer state, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (parameters == null) {
            throw new IllegalArgumentException("Parameters bundle is required".toString());
        }
        int i = parameters.getInt("offset");
        int i2 = parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT);
        Intrinsics.checkNotNull(api);
        Call<QuizParticipationListResponseModel<QuizShortParticipationModel>> quizParticipationList = api.getQuizParticipationList(token, Integer.valueOf(state != null ? state.intValue() : 0), Integer.valueOf(i), Integer.valueOf(i2), SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9));
        Intrinsics.checkNotNullExpressionValue(quizParticipationList, "getQuizParticipationList(...)");
        return quizParticipationList;
    }
}
