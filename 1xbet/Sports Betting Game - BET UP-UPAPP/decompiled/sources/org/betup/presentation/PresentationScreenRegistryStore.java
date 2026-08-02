package org.betup.presentation;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.presentation.PresentationScreenMappingDto;
import org.betup.model.remote.entity.presentation.PresentationScreenRegistryDto;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationScreenRegistryStore.kt */
@Singleton
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/presentation/PresentationScreenRegistryStore;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "configRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lorg/betup/model/remote/entity/presentation/PresentationScreenRegistryDto;", "apply", "", "config", "hasRemoteConfig", "", "resolveClassName", "", "className", "isIgnoredClassName", "matchesCampaignScreen", "campaignScreenKey", "activeScreenKey", "matchesLocalLegacyGroup", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationScreenRegistryStore {
    private final AtomicReference<PresentationScreenRegistryDto> configRef = new AtomicReference<>(null);
    public static final int $stable = 8;
    private static final Set<String> DEFAULT_IGNORED_CLASS_NAMES = SetsKt.setOf((Object[]) new String[]{"PresentationWebViewDialogFragment", "TourBetSelectionDialogFragment", "TourCompletedDialogFragment"});
    private static final Map<String, Set<String>> LOCAL_LEGACY_GROUPS = MapsKt.mapOf(TuplesKt.to("home", SetsKt.setOf("home")), TuplesKt.to("matches", SetsKt.setOf((Object[]) new String[]{"matches_by_date", "matches_tabs", "leagues", "leagues_by_date", "sports_by_date", "top_matches", "top_matches_tab", "specific_championship"})), TuplesKt.to("flash_bet", SetsKt.setOf((Object[]) new String[]{"flash_bet", "flash_bet_game", "flash_bet_categories", "flash_bet_match_start"})), TuplesKt.to("bets", SetsKt.setOf((Object[]) new String[]{"bets", "bets_list"})), TuplesKt.to("shop", SetsKt.setOf("shop_betcoins")));

    @Inject
    public PresentationScreenRegistryStore() {
    }

    public final void apply(PresentationScreenRegistryDto config) {
        this.configRef.set(config);
    }

    public final boolean hasRemoteConfig() {
        return this.configRef.get() != null;
    }

    public final String resolveClassName(String className) {
        Object obj;
        Intrinsics.checkNotNullParameter(className, "className");
        PresentationScreenRegistryDto presentationScreenRegistryDto = this.configRef.get();
        if (presentationScreenRegistryDto == null) {
            return null;
        }
        Iterator<T> it = presentationScreenRegistryDto.getScreens().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((PresentationScreenMappingDto) obj).getClassName(), className)) {
                break;
            }
        }
        PresentationScreenMappingDto presentationScreenMappingDto = (PresentationScreenMappingDto) obj;
        if (presentationScreenMappingDto != null) {
            return presentationScreenMappingDto.getScreenKey();
        }
        return null;
    }

    public final boolean isIgnoredClassName(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        PresentationScreenRegistryDto presentationScreenRegistryDto = this.configRef.get();
        if (presentationScreenRegistryDto != null) {
            return presentationScreenRegistryDto.getIgnoredClassNames().contains(className);
        }
        return DEFAULT_IGNORED_CLASS_NAMES.contains(className);
    }

    public final boolean matchesCampaignScreen(String campaignScreenKey, String activeScreenKey) {
        Intrinsics.checkNotNullParameter(campaignScreenKey, "campaignScreenKey");
        Intrinsics.checkNotNullParameter(activeScreenKey, "activeScreenKey");
        if (StringsKt.equals(campaignScreenKey, activeScreenKey, true)) {
            return true;
        }
        PresentationScreenRegistryDto presentationScreenRegistryDto = this.configRef.get();
        if (presentationScreenRegistryDto == null) {
            return matchesLocalLegacyGroup(campaignScreenKey, activeScreenKey);
        }
        Map<String, List<String>> groups = presentationScreenRegistryDto.getGroups();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = campaignScreenKey.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List<String> list = groups.get(lowerCase);
        if (list == null) {
            return false;
        }
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (StringsKt.equals((String) it.next(), activeScreenKey, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean matchesLocalLegacyGroup(String campaignScreenKey, String activeScreenKey) {
        Map<String, Set<String>> map = LOCAL_LEGACY_GROUPS;
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = campaignScreenKey.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Set<String> set = map.get(lowerCase);
        if (set == null) {
            return false;
        }
        Set<String> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (StringsKt.equals((String) it.next(), activeScreenKey, true)) {
                return true;
            }
        }
        return false;
    }
}
