package org.betup.utils;

import android.content.Context;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.remote.entity.matches.VarietyBetRestrictionInfoModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionRuleModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionsConfigModel;
import org.betup.model.remote.entity.user.VarietyVersionGateModel;
import org.betup.model.remote.entity.user.VarietyVersionGatesConfigModel;
import org.modelmapper.internal.asm.signature.SignatureVisitor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* compiled from: VarietyBetRestrictions.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001OB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\tJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0014J!\u0010!\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u0015\u0010\"\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010#J\u001f\u0010\"\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00072\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070'J\u001d\u0010(\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020*¢\u0006\u0002\u0010+J+\u0010,\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010/J3\u00100\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020\u001a2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070'J\u0016\u00103\u001a\u00020\u00072\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070'J\u001e\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u0007J\u0010\u00108\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J \u00109\u001a\u00020:2\u0006\u0010)\u001a\u00020;2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010<\u001a\u00020\u0005J \u0010=\u001a\u00020:2\u0006\u0010)\u001a\u00020;2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010<\u001a\u00020\u0005J\u001b\u0010>\u001a\u00020\u001a*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010?J\u0010\u0010@\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010A\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0014\u0010B\u001a\u00020\u001a*\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0002J\u0017\u0010C\u001a\u0004\u0018\u00010\u00072\u0006\u0010D\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001eJ \u0010E\u001a\u00020\u001a*\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u00052\b\u0010H\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u0005H\u0002J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020J0'2\u0006\u0010N\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lorg/betup/utils/VarietyBetRestrictions;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "RULE_ID_PLAYER_STATS", "", "PLAYER_STATS_PARAM_T_ID", "", "cachedConfig", "Lorg/betup/model/remote/entity/user/VarietyBetRestrictionsConfigModel;", "cachedVersionGates", "Lorg/betup/model/remote/entity/user/VarietyVersionGatesConfigModel;", "setConfig", "", "config", "setVersionGatesConfig", "getConfig", "findMatchingRule", "Lorg/betup/model/remote/entity/user/VarietyBetRestrictionRuleModel;", "paramTId", "(Ljava/lang/Long;)Lorg/betup/model/remote/entity/user/VarietyBetRestrictionRuleModel;", "findMatchingRuleFromVarietyInfo", "varietyInfo", "Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;", "(Ljava/lang/Long;Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;)Lorg/betup/model/remote/entity/user/VarietyBetRestrictionRuleModel;", "isMinStakeEnforcementActiveForVariety", "", "(Ljava/lang/Long;)Z", "minStakeForRule", "ruleId", "(Ljava/lang/String;)Ljava/lang/Long;", "ruleIdForVariety", "(Ljava/lang/Long;)Ljava/lang/String;", "findEnforcedRuleForVariety", "enforcedMinStakeForVariety", "(Ljava/lang/Long;)J", "(Ljava/lang/Long;Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;)J", "maxEnforcedMinStakeForVarieties", "paramTIds", "", "isVarietyVisible", "context", "Lorg/betup/utils/VarietyBetRestrictions$VisibilityContext;", "(Ljava/lang/Long;Lorg/betup/utils/VarietyBetRestrictions$VisibilityContext;)Z", "isVarietyAllowedForApp", "appBuildNumber", "appVersionName", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Z", "isVarietyVisibleForUser", "(Ljava/lang/Long;Lorg/betup/utils/VarietyBetRestrictions$VisibilityContext;Ljava/lang/String;Ljava/lang/String;)Z", "slipHasRestrictedBet", "maxMinStakeForSlip", "effectiveMinStake", "globalMin", "hasRestrictedInSlip", "ruleMin", "isPlayerStatsRule", "minStakeRequiredMessage", "", "Landroid/content/Context;", "minFormatted", "minStakeNotEnoughBalanceMessage", "matchesParamTId", "(Lorg/betup/model/remote/entity/user/VarietyBetRestrictionRuleModel;Ljava/lang/Long;)Z", "normalizeRestrictionsConfig", "normalizeVersionGatesConfig", "isVisibleIn", "resolveBuildNumber", "userVersion", "satisfies", "Lorg/betup/model/remote/entity/user/VarietyVersionGateModel;", "userBuildNumber", "userVersionName", "compareVersions", "", "left", TtmlNode.RIGHT, "parseVersionParts", "version", "VisibilityContext", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VarietyBetRestrictions {
    public static final long PLAYER_STATS_PARAM_T_ID = 11;
    public static final String RULE_ID_PLAYER_STATS = "player_stats";
    private static volatile VarietyBetRestrictionsConfigModel cachedConfig;
    private static volatile VarietyVersionGatesConfigModel cachedVersionGates;
    public static final VarietyBetRestrictions INSTANCE = new VarietyBetRestrictions();
    public static final int $stable = 8;

    /* compiled from: VarietyBetRestrictions.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisibilityContext.values().length];
            try {
                iArr[VisibilityContext.STANDARD_BETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisibilityContext.CHALLENGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisibilityContext.COMPETITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private VarietyBetRestrictions() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VarietyBetRestrictions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/utils/VarietyBetRestrictions$VisibilityContext;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "STANDARD_BETS", "CHALLENGE", "COMPETITION", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VisibilityContext {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VisibilityContext[] $VALUES;
        public static final VisibilityContext STANDARD_BETS = new VisibilityContext("STANDARD_BETS", 0);
        public static final VisibilityContext CHALLENGE = new VisibilityContext("CHALLENGE", 1);
        public static final VisibilityContext COMPETITION = new VisibilityContext("COMPETITION", 2);

        private static final /* synthetic */ VisibilityContext[] $values() {
            return new VisibilityContext[]{STANDARD_BETS, CHALLENGE, COMPETITION};
        }

        public static EnumEntries<VisibilityContext> getEntries() {
            return $ENTRIES;
        }

        private VisibilityContext(String str, int i) {
        }

        static {
            VisibilityContext[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static VisibilityContext valueOf(String str) {
            return (VisibilityContext) Enum.valueOf(VisibilityContext.class, str);
        }

        public static VisibilityContext[] values() {
            return (VisibilityContext[]) $VALUES.clone();
        }
    }

    public final void setConfig(VarietyBetRestrictionsConfigModel config) {
        cachedConfig = config != null ? normalizeRestrictionsConfig(config) : null;
    }

    public final void setVersionGatesConfig(VarietyVersionGatesConfigModel config) {
        cachedVersionGates = config != null ? normalizeVersionGatesConfig(config) : null;
    }

    public final VarietyBetRestrictionsConfigModel getConfig() {
        return cachedConfig;
    }

    public final VarietyBetRestrictionRuleModel findMatchingRule(Long paramTId) {
        VarietyBetRestrictionsConfigModel varietyBetRestrictionsConfigModel = cachedConfig;
        Object obj = null;
        if (varietyBetRestrictionsConfigModel == null || !varietyBetRestrictionsConfigModel.getGlobalEnabled()) {
            return null;
        }
        List<VarietyBetRestrictionRuleModel> rules = varietyBetRestrictionsConfigModel.getRules();
        if (rules == null) {
            rules = CollectionsKt.emptyList();
        }
        Iterator<T> it = rules.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel = (VarietyBetRestrictionRuleModel) next;
            if (varietyBetRestrictionRuleModel.getEnabled() && !StringsKt.isBlank(varietyBetRestrictionRuleModel.getId()) && INSTANCE.matchesParamTId(varietyBetRestrictionRuleModel, paramTId)) {
                obj = next;
                break;
            }
        }
        return (VarietyBetRestrictionRuleModel) obj;
    }

    public final VarietyBetRestrictionRuleModel findMatchingRuleFromVarietyInfo(Long paramTId, VarietyBetRestrictionInfoModel varietyInfo) {
        if (varietyInfo != null) {
            if (!varietyInfo.getEnforcementEnabled() || varietyInfo.getMinStakeBetcoins() <= 0) {
                varietyInfo = null;
            }
            if (varietyInfo != null) {
                String ruleId = varietyInfo.getRuleId();
                if (ruleId == null) {
                    ruleId = "";
                }
                String str = ruleId;
                if (StringsKt.isBlank(str)) {
                    str = RULE_ID_PLAYER_STATS;
                }
                return new VarietyBetRestrictionRuleModel(str, true, paramTId != null ? CollectionsKt.listOf(Long.valueOf(paramTId.longValue())) : null, varietyInfo.getMinStakeBetcoins(), true, null, 32, null);
            }
        }
        return findMatchingRule(paramTId);
    }

    public final boolean isMinStakeEnforcementActiveForVariety(Long paramTId) {
        VarietyBetRestrictionRuleModel findMatchingRule = findMatchingRule(paramTId);
        if (findMatchingRule == null) {
            return false;
        }
        return findMatchingRule.getEnforcementEnabled();
    }

    public final Long minStakeForRule(String ruleId) {
        Object obj;
        Intrinsics.checkNotNullParameter(ruleId, "ruleId");
        VarietyBetRestrictionsConfigModel varietyBetRestrictionsConfigModel = cachedConfig;
        if (varietyBetRestrictionsConfigModel == null || !varietyBetRestrictionsConfigModel.getGlobalEnabled()) {
            return null;
        }
        List<VarietyBetRestrictionRuleModel> rules = varietyBetRestrictionsConfigModel.getRules();
        if (rules == null) {
            rules = CollectionsKt.emptyList();
        }
        Iterator<T> it = rules.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel = (VarietyBetRestrictionRuleModel) obj;
            if (varietyBetRestrictionRuleModel.getEnabled() && Intrinsics.areEqual(varietyBetRestrictionRuleModel.getId(), ruleId)) {
                break;
            }
        }
        VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel2 = (VarietyBetRestrictionRuleModel) obj;
        if (varietyBetRestrictionRuleModel2 == null || !varietyBetRestrictionRuleModel2.getEnforcementEnabled()) {
            return null;
        }
        Long valueOf = Long.valueOf(varietyBetRestrictionRuleModel2.getMinStakeBetcoins());
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }

    public final String ruleIdForVariety(Long paramTId) {
        VarietyBetRestrictionRuleModel findMatchingRule = findMatchingRule(paramTId);
        if (findMatchingRule != null) {
            return findMatchingRule.getId();
        }
        return null;
    }

    public final VarietyBetRestrictionRuleModel findEnforcedRuleForVariety(Long paramTId) {
        VarietyBetRestrictionRuleModel findMatchingRule = findMatchingRule(paramTId);
        if (findMatchingRule == null || !findMatchingRule.getEnforcementEnabled()) {
            return null;
        }
        return findMatchingRule;
    }

    public final VarietyBetRestrictionRuleModel findEnforcedRuleForVariety(Long paramTId, VarietyBetRestrictionInfoModel varietyInfo) {
        VarietyBetRestrictionRuleModel findMatchingRuleFromVarietyInfo = findMatchingRuleFromVarietyInfo(paramTId, varietyInfo);
        if (findMatchingRuleFromVarietyInfo == null || !findMatchingRuleFromVarietyInfo.getEnforcementEnabled()) {
            return null;
        }
        return findMatchingRuleFromVarietyInfo;
    }

    public final long enforcedMinStakeForVariety(Long paramTId) {
        VarietyBetRestrictionRuleModel findEnforcedRuleForVariety = findEnforcedRuleForVariety(paramTId);
        if (findEnforcedRuleForVariety == null) {
            return 0L;
        }
        Long valueOf = Long.valueOf(findEnforcedRuleForVariety.getMinStakeBetcoins());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    public final long enforcedMinStakeForVariety(Long paramTId, VarietyBetRestrictionInfoModel varietyInfo) {
        VarietyBetRestrictionRuleModel findEnforcedRuleForVariety = findEnforcedRuleForVariety(paramTId, varietyInfo);
        if (findEnforcedRuleForVariety == null) {
            return 0L;
        }
        Long valueOf = Long.valueOf(findEnforcedRuleForVariety.getMinStakeBetcoins());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    public final long maxEnforcedMinStakeForVarieties(List<Long> paramTIds) {
        Intrinsics.checkNotNullParameter(paramTIds, "paramTIds");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paramTIds.iterator();
        while (it.hasNext()) {
            VarietyBetRestrictionRuleModel findEnforcedRuleForVariety = INSTANCE.findEnforcedRuleForVariety((Long) it.next());
            Long valueOf = findEnforcedRuleForVariety != null ? Long.valueOf(findEnforcedRuleForVariety.getMinStakeBetcoins()) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        Long l = (Long) CollectionsKt.maxOrNull((Iterable) arrayList);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean isVarietyVisible(Long paramTId, VisibilityContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        VarietyBetRestrictionsConfigModel varietyBetRestrictionsConfigModel = cachedConfig;
        if (varietyBetRestrictionsConfigModel == null || !varietyBetRestrictionsConfigModel.getGlobalEnabled()) {
            return true;
        }
        List<VarietyBetRestrictionRuleModel> rules = varietyBetRestrictionsConfigModel.getRules();
        if (rules == null) {
            rules = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : rules) {
            VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel = (VarietyBetRestrictionRuleModel) obj;
            if (varietyBetRestrictionRuleModel.getEnabled() && INSTANCE.matchesParamTId(varietyBetRestrictionRuleModel, paramTId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        ArrayList arrayList3 = arrayList2;
        if ((arrayList3 instanceof Collection) && arrayList3.isEmpty()) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!INSTANCE.isVisibleIn((VarietyBetRestrictionRuleModel) it.next(), context)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isVarietyAllowedForApp$default(VarietyBetRestrictions varietyBetRestrictions, Long l, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return varietyBetRestrictions.isVarietyAllowedForApp(l, str, str2);
    }

    public final boolean isVarietyAllowedForApp(Long paramTId, String appBuildNumber, String appVersionName) {
        VarietyVersionGatesConfigModel varietyVersionGatesConfigModel = cachedVersionGates;
        if (varietyVersionGatesConfigModel == null || !varietyVersionGatesConfigModel.getGlobalEnabled() || paramTId == null) {
            return true;
        }
        List<VarietyVersionGateModel> gates = varietyVersionGatesConfigModel.getGates();
        if (gates == null) {
            gates = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : gates) {
            VarietyVersionGateModel varietyVersionGateModel = (VarietyVersionGateModel) obj;
            List<Long> paramTIds = varietyVersionGateModel.getParamTIds();
            if (paramTIds == null) {
                paramTIds = CollectionsKt.emptyList();
            }
            if (varietyVersionGateModel.getEnabled() && !paramTIds.isEmpty() && paramTIds.contains(paramTId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        ArrayList arrayList3 = arrayList2;
        if ((arrayList3 instanceof Collection) && arrayList3.isEmpty()) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!INSTANCE.satisfies((VarietyVersionGateModel) it.next(), appBuildNumber, appVersionName)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isVarietyVisibleForUser$default(VarietyBetRestrictions varietyBetRestrictions, Long l, VisibilityContext visibilityContext, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return varietyBetRestrictions.isVarietyVisibleForUser(l, visibilityContext, str, str2);
    }

    public final boolean isVarietyVisibleForUser(Long paramTId, VisibilityContext context, String appBuildNumber, String appVersionName) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isVarietyAllowedForApp(paramTId, appBuildNumber, appVersionName) && isVarietyVisible(paramTId, context);
    }

    public final boolean slipHasRestrictedBet(List<Long> paramTIds) {
        Intrinsics.checkNotNullParameter(paramTIds, "paramTIds");
        List<Long> list = paramTIds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (INSTANCE.isMinStakeEnforcementActiveForVariety((Long) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final long maxMinStakeForSlip(List<Long> paramTIds) {
        Intrinsics.checkNotNullParameter(paramTIds, "paramTIds");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paramTIds.iterator();
        while (it.hasNext()) {
            VarietyBetRestrictionRuleModel findMatchingRule = INSTANCE.findMatchingRule((Long) it.next());
            Long l = null;
            if (findMatchingRule != null) {
                if (!findMatchingRule.getEnforcementEnabled()) {
                    findMatchingRule = null;
                }
                if (findMatchingRule != null) {
                    l = Long.valueOf(findMatchingRule.getMinStakeBetcoins());
                }
            }
            if (l != null) {
                arrayList.add(l);
            }
        }
        Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) arrayList);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public final long effectiveMinStake(long globalMin, boolean hasRestrictedInSlip, long ruleMin) {
        return hasRestrictedInSlip ? Math.max(globalMin, ruleMin) : globalMin;
    }

    public final boolean isPlayerStatsRule(String ruleId) {
        return Intrinsics.areEqual(ruleId, RULE_ID_PLAYER_STATS);
    }

    public final CharSequence minStakeRequiredMessage(Context context, String ruleId, String minFormatted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(minFormatted, "minFormatted");
        if (isPlayerStatsRule(ruleId)) {
            String string = context.getString(R.string.player_stats_min_stake_required, minFormatted);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = context.getString(R.string.variety_min_stake_required, minFormatted);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final CharSequence minStakeNotEnoughBalanceMessage(Context context, String ruleId, String minFormatted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(minFormatted, "minFormatted");
        if (isPlayerStatsRule(ruleId)) {
            String string = context.getString(R.string.player_stats_min_stake_not_enough_balance, minFormatted);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = context.getString(R.string.variety_min_stake_not_enough_balance, minFormatted);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    private final boolean matchesParamTId(VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel, Long l) {
        if (l == null) {
            return false;
        }
        List<Long> paramTIds = varietyBetRestrictionRuleModel.getParamTIds();
        if (paramTIds == null) {
            paramTIds = CollectionsKt.emptyList();
        }
        List<Long> list = paramTIds;
        if (list.isEmpty()) {
            list = Intrinsics.areEqual(varietyBetRestrictionRuleModel.getId(), RULE_ID_PLAYER_STATS) ? CollectionsKt.listOf(11L) : CollectionsKt.emptyList();
        }
        List<Long> list2 = list;
        if (list2.isEmpty()) {
            return false;
        }
        return list2.contains(l);
    }

    private final VarietyBetRestrictionsConfigModel normalizeRestrictionsConfig(VarietyBetRestrictionsConfigModel config) {
        List<VarietyBetRestrictionRuleModel> rules = config.getRules();
        if (rules == null) {
            rules = CollectionsKt.emptyList();
        }
        List<VarietyBetRestrictionRuleModel> list = rules;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel : list) {
            List<Long> paramTIds = varietyBetRestrictionRuleModel.getParamTIds();
            if (paramTIds == null) {
                paramTIds = CollectionsKt.emptyList();
            }
            arrayList.add(VarietyBetRestrictionRuleModel.copy$default(varietyBetRestrictionRuleModel, null, false, paramTIds, 0L, false, null, 59, null));
        }
        return VarietyBetRestrictionsConfigModel.copy$default(config, 0, false, arrayList, 3, null);
    }

    private final VarietyVersionGatesConfigModel normalizeVersionGatesConfig(VarietyVersionGatesConfigModel config) {
        List<VarietyVersionGateModel> gates = config.getGates();
        if (gates == null) {
            gates = CollectionsKt.emptyList();
        }
        List<VarietyVersionGateModel> list = gates;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (VarietyVersionGateModel varietyVersionGateModel : list) {
            List<Long> paramTIds = varietyVersionGateModel.getParamTIds();
            if (paramTIds == null) {
                paramTIds = CollectionsKt.emptyList();
            }
            arrayList.add(VarietyVersionGateModel.copy$default(varietyVersionGateModel, null, false, paramTIds, null, null, null, null, 123, null));
        }
        return VarietyVersionGatesConfigModel.copy$default(config, 0, false, arrayList, 3, null);
    }

    private final boolean isVisibleIn(VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel, VisibilityContext visibilityContext) {
        int i = WhenMappings.$EnumSwitchMapping$0[visibilityContext.ordinal()];
        if (i == 1) {
            return varietyBetRestrictionRuleModel.getVisibility().getStandardBets();
        }
        if (i == 2) {
            return varietyBetRestrictionRuleModel.getVisibility().getChallenge();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return varietyBetRestrictionRuleModel.getVisibility().getCompetition();
    }

    private final Long resolveBuildNumber(String userVersion) {
        List<String> groupValues;
        String str;
        Long longOrNull;
        List<String> groupValues2;
        String str2;
        Long longOrNull2;
        String obj = StringsKt.trim((CharSequence) userVersion).toString();
        Long longOrNull3 = StringsKt.toLongOrNull(obj);
        if (longOrNull3 != null) {
            return Long.valueOf(longOrNull3.longValue());
        }
        String str3 = obj;
        MatchResult find$default = Regex.find$default(new Regex("/(\\d+)\\)"), str3, 0, 2, null);
        if (find$default != null && (groupValues2 = find$default.getGroupValues()) != null && (str2 = (String) CollectionsKt.getOrNull(groupValues2, 1)) != null && (longOrNull2 = StringsKt.toLongOrNull(str2)) != null) {
            return Long.valueOf(longOrNull2.longValue());
        }
        MatchResult find$default2 = Regex.find$default(new Regex("/(\\d+)$"), str3, 0, 2, null);
        if (find$default2 == null || (groupValues = find$default2.getGroupValues()) == null || (str = (String) CollectionsKt.getOrNull(groupValues, 1)) == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) {
            return null;
        }
        return Long.valueOf(longOrNull.longValue());
    }

    private final boolean satisfies(VarietyVersionGateModel varietyVersionGateModel, String str, String str2) {
        boolean z = varietyVersionGateModel.getMinBuildNumber() != null;
        boolean z2 = varietyVersionGateModel.getMaxBuildNumber() != null;
        String minAppVersion = varietyVersionGateModel.getMinAppVersion();
        boolean z3 = minAppVersion == null || StringsKt.isBlank(minAppVersion);
        String maxAppVersion = varietyVersionGateModel.getMaxAppVersion();
        boolean z4 = maxAppVersion == null || StringsKt.isBlank(maxAppVersion);
        if (z || z2) {
            Long resolveBuildNumber = str != null ? INSTANCE.resolveBuildNumber(str) : null;
            if (resolveBuildNumber != null) {
                if (z) {
                    long longValue = resolveBuildNumber.longValue();
                    Long minBuildNumber = varietyVersionGateModel.getMinBuildNumber();
                    Intrinsics.checkNotNull(minBuildNumber);
                    if (longValue < minBuildNumber.longValue()) {
                        return false;
                    }
                }
                if (z2) {
                    long longValue2 = resolveBuildNumber.longValue();
                    Long maxBuildNumber = varietyVersionGateModel.getMaxBuildNumber();
                    Intrinsics.checkNotNull(maxBuildNumber);
                    if (longValue2 > maxBuildNumber.longValue()) {
                        return false;
                    }
                }
            }
        }
        if (!z3 || !z4) {
            String obj = str2 != null ? StringsKt.trim((CharSequence) str2).toString() : null;
            String str3 = obj;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                if (!z3) {
                    String minAppVersion2 = varietyVersionGateModel.getMinAppVersion();
                    Intrinsics.checkNotNull(minAppVersion2);
                    if (compareVersions(obj, minAppVersion2) < 0) {
                        return false;
                    }
                }
                if (!z4) {
                    String maxAppVersion2 = varietyVersionGateModel.getMaxAppVersion();
                    Intrinsics.checkNotNull(maxAppVersion2);
                    if (compareVersions(obj, maxAppVersion2) > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final int compareVersions(String left, String right) {
        String obj = StringsKt.trim((CharSequence) left).toString();
        String obj2 = StringsKt.trim((CharSequence) right).toString();
        Long longOrNull = StringsKt.toLongOrNull(obj);
        Long longOrNull2 = StringsKt.toLongOrNull(obj2);
        if (longOrNull != null && longOrNull2 != null) {
            return Intrinsics.compare(longOrNull.longValue(), longOrNull2.longValue());
        }
        List<Integer> parseVersionParts = parseVersionParts(obj);
        List<Integer> parseVersionParts2 = parseVersionParts(obj2);
        int max = Math.max(parseVersionParts.size(), parseVersionParts2.size());
        int i = 0;
        while (i < max) {
            int intValue = ((i < 0 || i >= parseVersionParts.size()) ? 0 : parseVersionParts.get(i)).intValue();
            int intValue2 = ((i < 0 || i >= parseVersionParts2.size()) ? 0 : parseVersionParts2.get(i)).intValue();
            if (intValue != intValue2) {
                return Intrinsics.compare(intValue, intValue2);
            }
            i++;
        }
        return 0;
    }

    private final List<Integer> parseVersionParts(String version) {
        List split$default = StringsKt.split$default((CharSequence) version, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, SignatureVisitor.SUPER, '_'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            while (r3 < length) {
                char charAt = str.charAt(r3);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
                r3++;
            }
            Integer intOrNull = StringsKt.toIntOrNull(sb.toString());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            Integer intOrNull2 = StringsKt.toIntOrNull(version);
            arrayList2 = CollectionsKt.listOf(Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0));
        }
        return arrayList2;
    }
}
