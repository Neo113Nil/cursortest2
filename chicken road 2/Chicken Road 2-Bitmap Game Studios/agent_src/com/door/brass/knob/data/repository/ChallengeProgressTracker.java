package com.door.brass.knob.data.repository;

import com.door.brass.knob.data.db.dao.ChallengeDao;
import com.door.brass.knob.data.db.dao.ChallengeProgressDao;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.ChallengeProgressEventEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.repository.ChallengeProgressTracker;
import defpackage.MCcLy95b8Awzmw;
import defpackage.OcGJUxcOVecQiKb;
import defpackage.e;
import defpackage.h1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/door/brass/knob/data/repository/ChallengeProgressTracker;", "", "CountMode", "ChallengeRule", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChallengeProgressTracker {
    public static final Map ra306ClFT3HT;
    public final ChallengeProgressDao hRNgd2zGCE5kj;
    public final ChallengeDao yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/repository/ChallengeProgressTracker$ChallengeRule;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRule {
        public final Function1 hRNgd2zGCE5kj;
        public final CountMode ra306ClFT3HT;
        public final Function1 yzPsTade5rL7D3;

        public ChallengeRule(Function1 function1, Function1 function12, CountMode countMode) {
            this.yzPsTade5rL7D3 = function1;
            this.hRNgd2zGCE5kj = function12;
            this.ra306ClFT3HT = countMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChallengeRule)) {
                return false;
            }
            ChallengeRule challengeRule = (ChallengeRule) obj;
            return this.yzPsTade5rL7D3.equals(challengeRule.yzPsTade5rL7D3) && this.hRNgd2zGCE5kj.equals(challengeRule.hRNgd2zGCE5kj) && this.ra306ClFT3HT == challengeRule.ra306ClFT3HT;
        }

        public final int hashCode() {
            return this.ra306ClFT3HT.hashCode() + ((this.hRNgd2zGCE5kj.hashCode() + (this.yzPsTade5rL7D3.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ChallengeRule(matches=" + this.yzPsTade5rL7D3 + ", eventKey=" + this.hRNgd2zGCE5kj + ", countMode=" + this.ra306ClFT3HT + ")";
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/door/brass/knob/data/repository/ChallengeProgressTracker$Companion;", "", "", "", "Lcom/door/brass/knob/data/repository/ChallengeProgressTracker$ChallengeRule;", "rulesByTitle", "Ljava/util/Map;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final String hRNgd2zGCE5kj(Companion companion, MenuItemEntity menuItemEntity) {
            companion.getClass();
            return OcGJUxcOVecQiKb.FsuUJlzzWhYnMlD("item:", menuItemEntity.yzPsTade5rL7D3);
        }

        public static final boolean yzPsTade5rL7D3(MenuItemEntity menuItemEntity, String str) {
            Map map = ChallengeProgressTracker.ra306ClFT3HT;
            List uY26rxeEAFnDq = StringsKt.uY26rxeEAFnDq(menuItemEntity.Uo5pffGf8LUU, new String[]{","});
            if (uY26rxeEAFnDq.isEmpty()) {
                return false;
            }
            Iterator it = uY26rxeEAFnDq.iterator();
            while (it.hasNext()) {
                if (StringsKt.uypNJrpDByoB(StringsKt.vAthhQhzH5WQr3((String) it.next()).toString(), str, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/repository/ChallengeProgressTracker$CountMode;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CountMode {
        public static final CountMode b41X89IqSbKt;
        public static final /* synthetic */ CountMode[] gmXBnHsR2YSm;
        public static final /* synthetic */ EnumEntries i7xAcZoXXiIt;
        public static final CountMode oyjLVtGms9eZwJ0;

        static {
            CountMode countMode = new CountMode("UNIQUE_ITEM", 0);
            oyjLVtGms9eZwJ0 = countMode;
            CountMode countMode2 = new CountMode("EACH_VIEW", 1);
            b41X89IqSbKt = countMode2;
            CountMode[] countModeArr = {countMode, countMode2};
            gmXBnHsR2YSm = countModeArr;
            i7xAcZoXXiIt = EnumEntriesKt.yzPsTade5rL7D3(countModeArr);
        }

        public static CountMode valueOf(String str) {
            return (CountMode) Enum.valueOf(CountMode.class, str);
        }

        public static CountMode[] values() {
            return (CountMode[]) gmXBnHsR2YSm.clone();
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CountMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CountMode countMode = CountMode.oyjLVtGms9eZwJ0;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        Companion companion = new Companion();
        MCcLy95b8Awzmw mCcLy95b8Awzmw = new MCcLy95b8Awzmw(22);
        ChallengeProgressTracker$Companion$rulesByTitle$2 challengeProgressTracker$Companion$rulesByTitle$2 = new ChallengeProgressTracker$Companion$rulesByTitle$2(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0);
        CountMode countMode = CountMode.oyjLVtGms9eZwJ0;
        Pair pair = new Pair("Tart Explorer", new ChallengeRule(mCcLy95b8Awzmw, challengeProgressTracker$Companion$rulesByTitle$2, countMode));
        Pair pair2 = new Pair("Pastry Case Tour", new ChallengeRule(new MCcLy95b8Awzmw(24), new ChallengeProgressTracker$Companion$rulesByTitle$4(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode));
        Pair pair3 = new Pair("Cookie Flight", new ChallengeRule(new MCcLy95b8Awzmw(25), new ChallengeProgressTracker$Companion$rulesByTitle$6(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode));
        MCcLy95b8Awzmw mCcLy95b8Awzmw2 = new MCcLy95b8Awzmw(26);
        ChallengeProgressTracker$Companion$rulesByTitle$8 challengeProgressTracker$Companion$rulesByTitle$8 = new ChallengeProgressTracker$Companion$rulesByTitle$8(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0);
        CountMode countMode2 = CountMode.b41X89IqSbKt;
        Pair pair4 = new Pair("Classic Lemon Meringue Devotee", new ChallengeRule(mCcLy95b8Awzmw2, challengeProgressTracker$Companion$rulesByTitle$8, countMode2));
        Pair pair5 = new Pair("Opera Slice Milestone", new ChallengeRule(new MCcLy95b8Awzmw(27), new ChallengeProgressTracker$Companion$rulesByTitle$10(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode2));
        Pair pair6 = new Pair("Mille-Feuille Master", new ChallengeRule(new MCcLy95b8Awzmw(28), new ChallengeProgressTracker$Companion$rulesByTitle$12(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode2));
        Pair pair7 = new Pair("Morning Regular", new ChallengeRule(new MCcLy95b8Awzmw(29), new ChallengeProgressTracker$Companion$rulesByTitle$14(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode2));
        Pair pair8 = new Pair("Afternoon Return", new ChallengeRule(new e(0), new ChallengeProgressTracker$Companion$rulesByTitle$16(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode));
        Pair pair9 = new Pair("Weekend Ritual", new ChallengeRule(new MCcLy95b8Awzmw(23), new ChallengeProgressTracker$Companion$rulesByTitle$18(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode));
        final int i = 0;
        Function1 function1 = new Function1() { // from class: com.door.brass.knob.data.repository.yzPsTade5rL7D3
            @Override // kotlin.jvm.functions.Function1
            public final Object uypNJrpDByoB(Object obj) {
                boolean z = false;
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
                switch (i) {
                    case 0:
                        Map map = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map2 = ChallengeProgressTracker.ra306ClFT3HT;
                        if (ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Seasonal") && Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Tarts")) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Map map3 = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map4 = ChallengeProgressTracker.ra306ClFT3HT;
                        if (ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Seasonal") && Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Beverages")) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        Map map5 = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map6 = ChallengeProgressTracker.ra306ClFT3HT;
                        return Boolean.valueOf(ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Popular"));
                }
            }
        };
        final int i2 = 1;
        Pair pair10 = new Pair("Winter Citrus Hunt", new ChallengeRule(function1, new ChallengeProgressTracker$Companion$rulesByTitle$20(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode));
        Pair pair11 = new Pair("Spring Blossom Pairing", new ChallengeRule(new Function1() { // from class: com.door.brass.knob.data.repository.yzPsTade5rL7D3
            @Override // kotlin.jvm.functions.Function1
            public final Object uypNJrpDByoB(Object obj) {
                boolean z = false;
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
                switch (i2) {
                    case 0:
                        Map map = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map2 = ChallengeProgressTracker.ra306ClFT3HT;
                        if (ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Seasonal") && Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Tarts")) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Map map3 = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map4 = ChallengeProgressTracker.ra306ClFT3HT;
                        if (ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Seasonal") && Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Beverages")) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        Map map5 = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map6 = ChallengeProgressTracker.ra306ClFT3HT;
                        return Boolean.valueOf(ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Popular"));
                }
            }
        }, new ChallengeProgressTracker$Companion$rulesByTitle$22(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode));
        final int i3 = 2;
        ra306ClFT3HT = MapsKt.gmXBnHsR2YSm(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, new Pair("Limited Batch Tracker", new ChallengeRule(new Function1() { // from class: com.door.brass.knob.data.repository.yzPsTade5rL7D3
            @Override // kotlin.jvm.functions.Function1
            public final Object uypNJrpDByoB(Object obj) {
                boolean z = false;
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
                switch (i3) {
                    case 0:
                        Map map = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map2 = ChallengeProgressTracker.ra306ClFT3HT;
                        if (ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Seasonal") && Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Tarts")) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Map map3 = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map4 = ChallengeProgressTracker.ra306ClFT3HT;
                        if (ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Seasonal") && Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Beverages")) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        Map map5 = ChallengeProgressTracker.ra306ClFT3HT;
                        menuItemEntity.getClass();
                        Map map6 = ChallengeProgressTracker.ra306ClFT3HT;
                        return Boolean.valueOf(ChallengeProgressTracker.Companion.yzPsTade5rL7D3(menuItemEntity, "Popular"));
                }
            }
        }, new ChallengeProgressTracker$Companion$rulesByTitle$24(1, companion, Companion.class, "itemKey", "itemKey(Lcom/door/brass/knob/data/db/entity/MenuItemEntity;)Ljava/lang/String;", 0), countMode)));
    }

    public ChallengeProgressTracker(ChallengeDao challengeDao, ChallengeProgressDao challengeProgressDao) {
        this.yzPsTade5rL7D3 = challengeDao;
        this.hRNgd2zGCE5kj = challengeProgressDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hRNgd2zGCE5kj(long j, String str, ContinuationImpl continuationImpl) {
        ChallengeProgressTracker$recordRepeatEvent$1 challengeProgressTracker$recordRepeatEvent$1;
        int i;
        if (continuationImpl instanceof ChallengeProgressTracker$recordRepeatEvent$1) {
            challengeProgressTracker$recordRepeatEvent$1 = (ChallengeProgressTracker$recordRepeatEvent$1) continuationImpl;
            int i2 = challengeProgressTracker$recordRepeatEvent$1.FsuUJlzzWhYnMlD;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeProgressTracker$recordRepeatEvent$1.FsuUJlzzWhYnMlD = i2 - Integer.MIN_VALUE;
                Object obj = challengeProgressTracker$recordRepeatEvent$1.i7xAcZoXXiIt;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
                i = challengeProgressTracker$recordRepeatEvent$1.FsuUJlzzWhYnMlD;
                if (i != 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    ChallengeProgressEventEntity challengeProgressEventEntity = new ChallengeProgressEventEntity(j, str, System.currentTimeMillis());
                    challengeProgressTracker$recordRepeatEvent$1.FsuUJlzzWhYnMlD = 1;
                    if (this.hRNgd2zGCE5kj.yzPsTade5rL7D3(challengeProgressEventEntity, challengeProgressTracker$recordRepeatEvent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.hRNgd2zGCE5kj(obj);
                }
                return Boolean.TRUE;
            }
        }
        challengeProgressTracker$recordRepeatEvent$1 = new ChallengeProgressTracker$recordRepeatEvent$1(this, continuationImpl);
        Object obj2 = challengeProgressTracker$recordRepeatEvent$1.i7xAcZoXXiIt;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = challengeProgressTracker$recordRepeatEvent$1.FsuUJlzzWhYnMlD;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r9.yzPsTade5rL7D3.b41X89IqSbKt(r10, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object oyjLVtGms9eZwJ0(ChallengeEntity challengeEntity, CountMode countMode, ContinuationImpl continuationImpl) {
        ChallengeProgressTracker$syncChallengeProgress$1 challengeProgressTracker$syncChallengeProgress$1;
        int i;
        int intValue;
        int i2;
        boolean z;
        if (continuationImpl instanceof ChallengeProgressTracker$syncChallengeProgress$1) {
            challengeProgressTracker$syncChallengeProgress$1 = (ChallengeProgressTracker$syncChallengeProgress$1) continuationImpl;
            int i3 = challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI = i3 - Integer.MIN_VALUE;
                Object obj = challengeProgressTracker$syncChallengeProgress$1.Uo5pffGf8LUU;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
                i = challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI;
                if (i != 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    int ordinal = countMode.ordinal();
                    ChallengeProgressDao challengeProgressDao = this.hRNgd2zGCE5kj;
                    if (ordinal == 0) {
                        long j = challengeEntity.yzPsTade5rL7D3;
                        challengeProgressTracker$syncChallengeProgress$1.i7xAcZoXXiIt = challengeEntity;
                        challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI = 1;
                        obj = challengeProgressDao.ra306ClFT3HT(j, challengeProgressTracker$syncChallengeProgress$1);
                    } else {
                        if (ordinal != 1) {
                            h1.hRNgd2zGCE5kj();
                            return null;
                        }
                        long j2 = challengeEntity.yzPsTade5rL7D3;
                        challengeProgressTracker$syncChallengeProgress$1.i7xAcZoXXiIt = challengeEntity;
                        challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI = 2;
                        obj = challengeProgressDao.oyjLVtGms9eZwJ0(j2, challengeProgressTracker$syncChallengeProgress$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    challengeEntity = challengeProgressTracker$syncChallengeProgress$1.i7xAcZoXXiIt;
                    ResultKt.hRNgd2zGCE5kj(obj);
                    intValue = ((Number) obj).intValue();
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.hRNgd2zGCE5kj(obj);
                            return Unit.yzPsTade5rL7D3;
                        }
                        defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    challengeEntity = challengeProgressTracker$syncChallengeProgress$1.i7xAcZoXXiIt;
                    ResultKt.hRNgd2zGCE5kj(obj);
                    intValue = ((Number) obj).intValue();
                }
                i2 = challengeEntity.b41X89IqSbKt;
                if (intValue > i2) {
                    intValue = i2;
                }
                z = intValue >= i2;
                Long l = challengeEntity.Uo5pffGf8LUU;
                if (z) {
                    l = new Long(l != null ? l.longValue() : System.currentTimeMillis());
                }
                ChallengeEntity yzPsTade5rL7D3 = ChallengeEntity.yzPsTade5rL7D3(challengeEntity, intValue, z, l);
                challengeProgressTracker$syncChallengeProgress$1.i7xAcZoXXiIt = null;
                challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI = 3;
            }
        }
        challengeProgressTracker$syncChallengeProgress$1 = new ChallengeProgressTracker$syncChallengeProgress$1(this, continuationImpl);
        Object obj2 = challengeProgressTracker$syncChallengeProgress$1.Uo5pffGf8LUU;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI;
        if (i != 0) {
        }
        i2 = challengeEntity.b41X89IqSbKt;
        if (intValue > i2) {
        }
        if (intValue >= i2) {
        }
        Long l2 = challengeEntity.Uo5pffGf8LUU;
        if (z) {
        }
        ChallengeEntity yzPsTade5rL7D32 = ChallengeEntity.yzPsTade5rL7D3(challengeEntity, intValue, z, l2);
        challengeProgressTracker$syncChallengeProgress$1.i7xAcZoXXiIt = null;
        challengeProgressTracker$syncChallengeProgress$1.UEutaskTsxaI = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r11.yzPsTade5rL7D3(r5, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ra306ClFT3HT(long j, String str, ContinuationImpl continuationImpl) {
        ChallengeProgressTracker$recordUniqueEvent$1 challengeProgressTracker$recordUniqueEvent$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ChallengeProgressTracker$recordUniqueEvent$1) {
            challengeProgressTracker$recordUniqueEvent$1 = (ChallengeProgressTracker$recordUniqueEvent$1) continuationImpl;
            int i2 = challengeProgressTracker$recordUniqueEvent$1.MRfxZSx8l5UG62U;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeProgressTracker$recordUniqueEvent$1.MRfxZSx8l5UG62U = i2 - Integer.MIN_VALUE;
                obj = challengeProgressTracker$recordUniqueEvent$1.FsuUJlzzWhYnMlD;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
                i = challengeProgressTracker$recordUniqueEvent$1.MRfxZSx8l5UG62U;
                ChallengeProgressDao challengeProgressDao = this.hRNgd2zGCE5kj;
                if (i != 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    challengeProgressTracker$recordUniqueEvent$1.Uo5pffGf8LUU = str;
                    challengeProgressTracker$recordUniqueEvent$1.i7xAcZoXXiIt = j;
                    challengeProgressTracker$recordUniqueEvent$1.MRfxZSx8l5UG62U = 1;
                    obj = challengeProgressDao.hRNgd2zGCE5kj(j, str, challengeProgressTracker$recordUniqueEvent$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.hRNgd2zGCE5kj(obj);
                            return Boolean.TRUE;
                        }
                        defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = challengeProgressTracker$recordUniqueEvent$1.i7xAcZoXXiIt;
                    str = challengeProgressTracker$recordUniqueEvent$1.Uo5pffGf8LUU;
                    ResultKt.hRNgd2zGCE5kj(obj);
                }
                long j2 = j;
                String str2 = str;
                if (!((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                ChallengeProgressEventEntity challengeProgressEventEntity = new ChallengeProgressEventEntity(j2, str2, System.currentTimeMillis());
                challengeProgressTracker$recordUniqueEvent$1.Uo5pffGf8LUU = null;
                challengeProgressTracker$recordUniqueEvent$1.i7xAcZoXXiIt = j2;
                challengeProgressTracker$recordUniqueEvent$1.MRfxZSx8l5UG62U = 2;
            }
        }
        challengeProgressTracker$recordUniqueEvent$1 = new ChallengeProgressTracker$recordUniqueEvent$1(this, continuationImpl);
        obj = challengeProgressTracker$recordUniqueEvent$1.FsuUJlzzWhYnMlD;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = challengeProgressTracker$recordUniqueEvent$1.MRfxZSx8l5UG62U;
        ChallengeProgressDao challengeProgressDao2 = this.hRNgd2zGCE5kj;
        if (i != 0) {
        }
        long j22 = j;
        String str22 = str;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        if (r4 == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x012f -> B:13:0x0130). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object yzPsTade5rL7D3(MenuItemEntity menuItemEntity, ContinuationImpl continuationImpl) {
        ChallengeProgressTracker$onMenuItemViewed$1 challengeProgressTracker$onMenuItemViewed$1;
        int i;
        MenuItemEntity menuItemEntity2;
        Object oyjLVtGms9eZwJ0;
        MenuItemEntity menuItemEntity3;
        Iterator it;
        int i2;
        ChallengeEntity challengeEntity;
        ChallengeRule challengeRule;
        int i3;
        char c;
        boolean booleanValue;
        if (continuationImpl instanceof ChallengeProgressTracker$onMenuItemViewed$1) {
            challengeProgressTracker$onMenuItemViewed$1 = (ChallengeProgressTracker$onMenuItemViewed$1) continuationImpl;
            int i4 = challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq = i4 - Integer.MIN_VALUE;
                Object obj = challengeProgressTracker$onMenuItemViewed$1.uypNJrpDByoB;
                Object obj2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
                i = challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq;
                if (i != 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    menuItemEntity2 = menuItemEntity;
                    challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt = menuItemEntity2;
                    challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq = 1;
                    oyjLVtGms9eZwJ0 = this.yzPsTade5rL7D3.oyjLVtGms9eZwJ0(challengeProgressTracker$onMenuItemViewed$1);
                } else if (i == 1) {
                    MenuItemEntity menuItemEntity4 = challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt;
                    ResultKt.hRNgd2zGCE5kj(obj);
                    oyjLVtGms9eZwJ0 = obj;
                    menuItemEntity2 = menuItemEntity4;
                } else if (i == 2) {
                    int i5 = challengeProgressTracker$onMenuItemViewed$1.kSPEzfraxudm4i;
                    i2 = challengeProgressTracker$onMenuItemViewed$1.MRfxZSx8l5UG62U;
                    challengeRule = (ChallengeRule) challengeProgressTracker$onMenuItemViewed$1.UEutaskTsxaI;
                    challengeEntity = challengeProgressTracker$onMenuItemViewed$1.FsuUJlzzWhYnMlD;
                    it = challengeProgressTracker$onMenuItemViewed$1.Uo5pffGf8LUU;
                    menuItemEntity3 = challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt;
                    ResultKt.hRNgd2zGCE5kj(obj);
                    i3 = i5;
                    c = 3;
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                    }
                    if (it.hasNext()) {
                    }
                } else if (i == 3) {
                    int i6 = challengeProgressTracker$onMenuItemViewed$1.kSPEzfraxudm4i;
                    i2 = challengeProgressTracker$onMenuItemViewed$1.MRfxZSx8l5UG62U;
                    challengeRule = (ChallengeRule) challengeProgressTracker$onMenuItemViewed$1.UEutaskTsxaI;
                    challengeEntity = challengeProgressTracker$onMenuItemViewed$1.FsuUJlzzWhYnMlD;
                    it = challengeProgressTracker$onMenuItemViewed$1.Uo5pffGf8LUU;
                    menuItemEntity3 = challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt;
                    ResultKt.hRNgd2zGCE5kj(obj);
                    i3 = i6;
                    c = 3;
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                    }
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 4) {
                        defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = challengeProgressTracker$onMenuItemViewed$1.MRfxZSx8l5UG62U;
                    Iterator it2 = challengeProgressTracker$onMenuItemViewed$1.Uo5pffGf8LUU;
                    MenuItemEntity menuItemEntity5 = challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt;
                    ResultKt.hRNgd2zGCE5kj(obj);
                    it = it2;
                    i2 = i7;
                    c = 3;
                    menuItemEntity3 = menuItemEntity5;
                    if (it.hasNext()) {
                        challengeEntity = (ChallengeEntity) it.next();
                        String str = challengeEntity.hRNgd2zGCE5kj;
                        long j = challengeEntity.yzPsTade5rL7D3;
                        challengeRule = (ChallengeRule) ra306ClFT3HT.get(str);
                        if (challengeRule != null && ((Boolean) challengeRule.yzPsTade5rL7D3.uypNJrpDByoB(menuItemEntity3)).booleanValue()) {
                            String str2 = (String) challengeRule.hRNgd2zGCE5kj.uypNJrpDByoB(menuItemEntity3);
                            int ordinal = challengeRule.ra306ClFT3HT.ordinal();
                            if (ordinal == 0) {
                                c = 3;
                                challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt = menuItemEntity3;
                                challengeProgressTracker$onMenuItemViewed$1.Uo5pffGf8LUU = it;
                                challengeProgressTracker$onMenuItemViewed$1.FsuUJlzzWhYnMlD = challengeEntity;
                                challengeProgressTracker$onMenuItemViewed$1.UEutaskTsxaI = challengeRule;
                                challengeProgressTracker$onMenuItemViewed$1.MRfxZSx8l5UG62U = i2;
                                challengeProgressTracker$onMenuItemViewed$1.kSPEzfraxudm4i = 0;
                                challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq = 2;
                                obj = ra306ClFT3HT(j, str2, challengeProgressTracker$onMenuItemViewed$1);
                                if (obj != obj2) {
                                    i3 = 0;
                                    booleanValue = ((Boolean) obj).booleanValue();
                                    if (booleanValue) {
                                        CountMode countMode = challengeRule.ra306ClFT3HT;
                                        challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt = menuItemEntity3;
                                        challengeProgressTracker$onMenuItemViewed$1.Uo5pffGf8LUU = it;
                                        challengeProgressTracker$onMenuItemViewed$1.FsuUJlzzWhYnMlD = null;
                                        challengeProgressTracker$onMenuItemViewed$1.UEutaskTsxaI = null;
                                        challengeProgressTracker$onMenuItemViewed$1.MRfxZSx8l5UG62U = i2;
                                        challengeProgressTracker$onMenuItemViewed$1.kSPEzfraxudm4i = i3;
                                        challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq = 4;
                                        if (oyjLVtGms9eZwJ0(challengeEntity, countMode, challengeProgressTracker$onMenuItemViewed$1) != obj2) {
                                            menuItemEntity5 = menuItemEntity3;
                                            menuItemEntity3 = menuItemEntity5;
                                            if (it.hasNext()) {
                                                return Unit.yzPsTade5rL7D3;
                                            }
                                        }
                                    }
                                    if (it.hasNext()) {
                                    }
                                }
                            } else {
                                if (ordinal != 1) {
                                    h1.hRNgd2zGCE5kj();
                                    return null;
                                }
                                challengeProgressTracker$onMenuItemViewed$1.i7xAcZoXXiIt = menuItemEntity3;
                                challengeProgressTracker$onMenuItemViewed$1.Uo5pffGf8LUU = it;
                                challengeProgressTracker$onMenuItemViewed$1.FsuUJlzzWhYnMlD = challengeEntity;
                                challengeProgressTracker$onMenuItemViewed$1.UEutaskTsxaI = challengeRule;
                                challengeProgressTracker$onMenuItemViewed$1.MRfxZSx8l5UG62U = i2;
                                challengeProgressTracker$onMenuItemViewed$1.kSPEzfraxudm4i = 0;
                                c = 3;
                                challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq = 3;
                                obj = hRNgd2zGCE5kj(j, str2, challengeProgressTracker$onMenuItemViewed$1);
                                if (obj != obj2) {
                                    i3 = 0;
                                    booleanValue = ((Boolean) obj).booleanValue();
                                    if (booleanValue) {
                                    }
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                            return obj2;
                        }
                        c = 3;
                        if (it.hasNext()) {
                        }
                    }
                }
                menuItemEntity3 = menuItemEntity2;
                it = ((List) oyjLVtGms9eZwJ0).iterator();
                i2 = 0;
                if (it.hasNext()) {
                }
            }
        }
        challengeProgressTracker$onMenuItemViewed$1 = new ChallengeProgressTracker$onMenuItemViewed$1(this, continuationImpl);
        Object obj3 = challengeProgressTracker$onMenuItemViewed$1.uypNJrpDByoB;
        Object obj22 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = challengeProgressTracker$onMenuItemViewed$1.NIabVTHf6LMJyXq;
        if (i != 0) {
        }
        menuItemEntity3 = menuItemEntity2;
        it = ((List) oyjLVtGms9eZwJ0).iterator();
        i2 = 0;
        if (it.hasNext()) {
        }
    }
}
