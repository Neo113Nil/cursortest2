package org.betup.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PlayerStatsBetRules.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J'\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\u0010\u0014J#\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lorg/betup/utils/PlayerStatsBetRules;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "PLAYER_STATS_PARAM_T_ID", "", "PLAYER_STATS_BET_TYPE_IDS", "", "getPLAYER_STATS_BET_TYPE_IDS", "()Ljava/util/Set;", "isPlayerStatsVariety", "", "paramTId", "(Ljava/lang/Long;)Z", "isPlayerStatsBetType", "betTypeId", "tabContainsPlayerStatsBetTypes", "betTypeIdsInTab", "", "isPlayerStatsVarietyTab", "(Ljava/lang/Long;Ljava/lang/Iterable;)Z", "isPlayerStatsBet", "(Ljava/lang/Long;Ljava/lang/Long;)Z", "effectiveMinStake", "globalMin", "playerStatsMin", "hasPlayerStatsInSlip", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlayerStatsBetRules {
    public static final long PLAYER_STATS_PARAM_T_ID = 11;
    public static final PlayerStatsBetRules INSTANCE = new PlayerStatsBetRules();
    private static final Set<Long> PLAYER_STATS_BET_TYPE_IDS = SetsKt.setOf((Object[]) new Long[]{97L, 98L});
    public static final int $stable = 8;

    private PlayerStatsBetRules() {
    }

    public final Set<Long> getPLAYER_STATS_BET_TYPE_IDS() {
        return PLAYER_STATS_BET_TYPE_IDS;
    }

    public final boolean isPlayerStatsVariety(Long paramTId) {
        return paramTId != null && paramTId.longValue() == 11;
    }

    public final boolean isPlayerStatsBetType(Long betTypeId) {
        return betTypeId != null && PLAYER_STATS_BET_TYPE_IDS.contains(betTypeId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isPlayerStatsVarietyTab$default(PlayerStatsBetRules playerStatsBetRules, Long l, Iterable iterable, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            iterable = CollectionsKt.emptyList();
        }
        return playerStatsBetRules.isPlayerStatsVarietyTab(l, iterable);
    }

    public final boolean isPlayerStatsVarietyTab(Long paramTId, Iterable<Long> betTypeIdsInTab) {
        Intrinsics.checkNotNullParameter(betTypeIdsInTab, "betTypeIdsInTab");
        return isPlayerStatsVariety(paramTId) || tabContainsPlayerStatsBetTypes(betTypeIdsInTab);
    }

    public static /* synthetic */ boolean isPlayerStatsBet$default(PlayerStatsBetRules playerStatsBetRules, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        return playerStatsBetRules.isPlayerStatsBet(l, l2);
    }

    public final boolean isPlayerStatsBet(Long paramTId, Long betTypeId) {
        return isPlayerStatsVariety(paramTId) || isPlayerStatsBetType(betTypeId);
    }

    public final long effectiveMinStake(long globalMin, long playerStatsMin, boolean hasPlayerStatsInSlip) {
        return hasPlayerStatsInSlip ? Math.max(globalMin, playerStatsMin) : globalMin;
    }

    public final boolean tabContainsPlayerStatsBetTypes(Iterable<Long> betTypeIdsInTab) {
        Intrinsics.checkNotNullParameter(betTypeIdsInTab, "betTypeIdsInTab");
        if ((betTypeIdsInTab instanceof Collection) && ((Collection) betTypeIdsInTab).isEmpty()) {
            return false;
        }
        Iterator<Long> it = betTypeIdsInTab.iterator();
        while (it.hasNext()) {
            if (INSTANCE.isPlayerStatsBetType(Long.valueOf(it.next().longValue()))) {
                return true;
            }
        }
        return false;
    }
}
