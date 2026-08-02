package org.betup.model.remote.entity.promo;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.domain.RemoteConfigConstants;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PromoInterstitialSettingsDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/promo/PromoInterstitialSettingsDto;", "", "betWonCloseCooldownMinutes", "", RemoteConfigConstants.MINI_GAMES_INTERSTITIAL_INTERVAL, "excludedUserTags", "", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJLjava/util/List;)V", "getBetWonCloseCooldownMinutes", "()J", "getMiniGamesInterstitialInterval", "getExcludedUserTags", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoInterstitialSettingsDto {
    public static final int $stable = 8;

    @SerializedName("betWonCloseCooldownMinutes")
    private final long betWonCloseCooldownMinutes;

    @SerializedName("excludedUserTags")
    private final List<String> excludedUserTags;

    @SerializedName(RemoteConfigConstants.MINI_GAMES_INTERSTITIAL_INTERVAL)
    private final long miniGamesInterstitialInterval;

    public PromoInterstitialSettingsDto() {
        this(0L, 0L, null, 7, null);
    }

    public static /* synthetic */ PromoInterstitialSettingsDto copy$default(PromoInterstitialSettingsDto promoInterstitialSettingsDto, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = promoInterstitialSettingsDto.betWonCloseCooldownMinutes;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = promoInterstitialSettingsDto.miniGamesInterstitialInterval;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = promoInterstitialSettingsDto.excludedUserTags;
        }
        return promoInterstitialSettingsDto.copy(j3, j4, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBetWonCloseCooldownMinutes() {
        return this.betWonCloseCooldownMinutes;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMiniGamesInterstitialInterval() {
        return this.miniGamesInterstitialInterval;
    }

    public final List<String> component3() {
        return this.excludedUserTags;
    }

    public final PromoInterstitialSettingsDto copy(long betWonCloseCooldownMinutes, long miniGamesInterstitialInterval, List<String> excludedUserTags) {
        Intrinsics.checkNotNullParameter(excludedUserTags, "excludedUserTags");
        return new PromoInterstitialSettingsDto(betWonCloseCooldownMinutes, miniGamesInterstitialInterval, excludedUserTags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoInterstitialSettingsDto)) {
            return false;
        }
        PromoInterstitialSettingsDto promoInterstitialSettingsDto = (PromoInterstitialSettingsDto) other;
        return this.betWonCloseCooldownMinutes == promoInterstitialSettingsDto.betWonCloseCooldownMinutes && this.miniGamesInterstitialInterval == promoInterstitialSettingsDto.miniGamesInterstitialInterval && Intrinsics.areEqual(this.excludedUserTags, promoInterstitialSettingsDto.excludedUserTags);
    }

    public int hashCode() {
        return (((Long.hashCode(this.betWonCloseCooldownMinutes) * 31) + Long.hashCode(this.miniGamesInterstitialInterval)) * 31) + this.excludedUserTags.hashCode();
    }

    public String toString() {
        return "PromoInterstitialSettingsDto(betWonCloseCooldownMinutes=" + this.betWonCloseCooldownMinutes + ", miniGamesInterstitialInterval=" + this.miniGamesInterstitialInterval + ", excludedUserTags=" + this.excludedUserTags + ")";
    }

    public PromoInterstitialSettingsDto(long j, long j2, List<String> excludedUserTags) {
        Intrinsics.checkNotNullParameter(excludedUserTags, "excludedUserTags");
        this.betWonCloseCooldownMinutes = j;
        this.miniGamesInterstitialInterval = j2;
        this.excludedUserTags = excludedUserTags;
    }

    public final long getBetWonCloseCooldownMinutes() {
        return this.betWonCloseCooldownMinutes;
    }

    public final long getMiniGamesInterstitialInterval() {
        return this.miniGamesInterstitialInterval;
    }

    public /* synthetic */ PromoInterstitialSettingsDto(long j, long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5L : j, (i & 2) == 0 ? j2 : 5L, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<String> getExcludedUserTags() {
        return this.excludedUserTags;
    }
}
