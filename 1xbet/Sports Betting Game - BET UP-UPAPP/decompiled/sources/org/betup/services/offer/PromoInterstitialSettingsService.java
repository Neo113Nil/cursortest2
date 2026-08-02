package org.betup.services.offer;

import android.util.Log;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.promo.GetPromoInterstitialSettingsInteractor;
import org.betup.model.remote.entity.promo.PromoInterstitialSettingsDto;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PromoInterstitialSettingsService.kt */
@Singleton
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/services/offer/PromoInterstitialSettingsService;", "", "getPromoInterstitialSettingsInteractor", "Lorg/betup/model/remote/api/rest/promo/GetPromoInterstitialSettingsInteractor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/promo/GetPromoInterstitialSettingsInteractor;)V", "refresh", "", "clear", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoInterstitialSettingsService {
    private static final String TAG = "InterstitialRules";
    private final GetPromoInterstitialSettingsInteractor getPromoInterstitialSettingsInteractor;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public PromoInterstitialSettingsService(GetPromoInterstitialSettingsInteractor getPromoInterstitialSettingsInteractor) {
        Intrinsics.checkNotNullParameter(getPromoInterstitialSettingsInteractor, "getPromoInterstitialSettingsInteractor");
        this.getPromoInterstitialSettingsInteractor = getPromoInterstitialSettingsInteractor;
    }

    public final void refresh() {
        this.getPromoInterstitialSettingsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.services.offer.PromoInterstitialSettingsService$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                PromoInterstitialSettingsService.refresh$lambda$0(fetchedResponseMessage);
            }
        }, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refresh$lambda$0(FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            PromoInterstitialSettingsDto promoInterstitialSettingsDto = (PromoInterstitialSettingsDto) fetchedResponseMessage.getModel();
            PromoInterstitialSettings.apply(promoInterstitialSettingsDto.getBetWonCloseCooldownMinutes(), promoInterstitialSettingsDto.getMiniGamesInterstitialInterval(), promoInterstitialSettingsDto.getExcludedUserTags());
            Log.d(TAG, "settings loaded: betWonCloseCooldownMinutes=" + promoInterstitialSettingsDto.getBetWonCloseCooldownMinutes() + ", miniGamesInterstitialInterval=" + promoInterstitialSettingsDto.getMiniGamesInterstitialInterval() + ", excludedUserTags=" + promoInterstitialSettingsDto.getExcludedUserTags());
            return;
        }
        Log.w(TAG, "settings load failed: stat=" + fetchedResponseMessage.getStat());
    }

    public final void clear() {
        PromoInterstitialSettings.clear();
        Log.d(TAG, "settings cleared");
    }

    /* compiled from: PromoInterstitialSettingsService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lorg/betup/services/offer/PromoInterstitialSettingsService$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
