package org.betup.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.matches.championship.specific.NewBetGroupModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetGroupsSortingUtils.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0002J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rJ\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00180\rJ\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0002J\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J.\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0\r0\r\"\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\r2\u0006\u0010\"\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lorg/betup/utils/BetGroupsSortingUtils;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "PARAM_IN_PARENS", "Lkotlin/text/Regex;", "HANDICAP_NUMBER_AND_VALUE", "OVER_UNDER_VALUE", "groupIdOrder", "", "groupId", "", "sortBetGroups", "", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "groups", "extractSortParameter", "", "groupName", "", "bets", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyBetOptionModel;", "sortBetsInGroup", "sortNewBetGroups", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetGroupModel;", "sortTotalBets", "extractOverUnderParam", "betName", "sortHandicapBets", "parseHandicapBet", "Lkotlin/Pair;", "toColumnMajorRows", "T", "items", "columns", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetGroupsSortingUtils {
    public static final BetGroupsSortingUtils INSTANCE = new BetGroupsSortingUtils();
    private static final Regex PARAM_IN_PARENS = new Regex("\\(([-+]?\\d+\\.?\\d*)\\)");
    private static final Regex HANDICAP_NUMBER_AND_VALUE = new Regex("Handicap\\s*(\\d)\\s*\\(([-+]?\\d+\\.?\\d*)\\)", RegexOption.IGNORE_CASE);
    private static final Regex OVER_UNDER_VALUE = new Regex("(?:Over|Under)\\s*\\(([-+]?\\d+\\.?\\d*)\\)", RegexOption.IGNORE_CASE);
    public static final int $stable = 8;

    private final int groupIdOrder(long groupId) {
        int i = (int) groupId;
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return i != 16 ? 999 : 1;
                }
            }
        }
        return i2;
    }

    private BetGroupsSortingUtils() {
    }

    public final List<MatchVarietyGroupBetsModel> sortBetGroups(List<MatchVarietyGroupBetsModel> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        List<MatchVarietyGroupBetsModel> list = groups;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (MatchVarietyGroupBetsModel matchVarietyGroupBetsModel : list) {
            arrayList.add(MatchVarietyGroupBetsModel.copy$default(matchVarietyGroupBetsModel, null, INSTANCE.sortBetsInGroup(matchVarietyGroupBetsModel.getGroup().getName(), matchVarietyGroupBetsModel.getBets()), 1, null));
        }
        return CollectionsKt.sortedWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: org.betup.utils.BetGroupsSortingUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Comparable sortBetGroups$lambda$1;
                sortBetGroups$lambda$1 = BetGroupsSortingUtils.sortBetGroups$lambda$1((MatchVarietyGroupBetsModel) obj);
                return sortBetGroups$lambda$1;
            }
        }, new Function1() { // from class: org.betup.utils.BetGroupsSortingUtils$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Comparable sortBetGroups$lambda$2;
                sortBetGroups$lambda$2 = BetGroupsSortingUtils.sortBetGroups$lambda$2((MatchVarietyGroupBetsModel) obj);
                return sortBetGroups$lambda$2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable sortBetGroups$lambda$1(MatchVarietyGroupBetsModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(INSTANCE.groupIdOrder(it.getGroup().getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable sortBetGroups$lambda$2(MatchVarietyGroupBetsModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(INSTANCE.extractSortParameter(it.getGroup().getName(), it.getBets()));
    }

    private final double extractSortParameter(String groupName, List<MatchVarietyBetOptionModel> bets) {
        List<String> groupValues;
        String str;
        Double doubleOrNull;
        List<String> groupValues2;
        String str2;
        Double doubleOrNull2;
        List<String> groupValues3;
        String str3;
        Double doubleOrNull3;
        MatchResult find$default = Regex.find$default(PARAM_IN_PARENS, groupName, 0, 2, null);
        if (find$default != null && (groupValues3 = find$default.getGroupValues()) != null && (str3 = (String) CollectionsKt.getOrNull(groupValues3, 1)) != null && (doubleOrNull3 = StringsKt.toDoubleOrNull(str3)) != null) {
            return doubleOrNull3.doubleValue();
        }
        MatchVarietyBetOptionModel matchVarietyBetOptionModel = (MatchVarietyBetOptionModel) CollectionsKt.firstOrNull((List) bets);
        if (matchVarietyBetOptionModel == null) {
            return 0.0d;
        }
        MatchResult find$default2 = Regex.find$default(OVER_UNDER_VALUE, matchVarietyBetOptionModel.getBetName(), 0, 2, null);
        if (find$default2 != null && (groupValues2 = find$default2.getGroupValues()) != null && (str2 = (String) CollectionsKt.getOrNull(groupValues2, 1)) != null && (doubleOrNull2 = StringsKt.toDoubleOrNull(str2)) != null) {
            return doubleOrNull2.doubleValue();
        }
        MatchResult find$default3 = Regex.find$default(HANDICAP_NUMBER_AND_VALUE, matchVarietyBetOptionModel.getBetName(), 0, 2, null);
        if (find$default3 == null || (groupValues = find$default3.getGroupValues()) == null || (str = (String) CollectionsKt.getOrNull(groupValues, 2)) == null || (doubleOrNull = StringsKt.toDoubleOrNull(str)) == null) {
            return 0.0d;
        }
        return Math.abs(doubleOrNull.doubleValue());
    }

    public final List<MatchVarietyBetOptionModel> sortBetsInGroup(String groupName, List<MatchVarietyBetOptionModel> bets) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(bets, "bets");
        String str = groupName;
        return StringsKt.contains((CharSequence) str, (CharSequence) "Handicap", true) ? sortHandicapBets(bets) : StringsKt.contains((CharSequence) str, (CharSequence) "Total", true) ? sortTotalBets(bets) : bets;
    }

    public final List<NewBetGroupModel> sortNewBetGroups(List<NewBetGroupModel> groups) {
        Object obj;
        Intrinsics.checkNotNullParameter(groups, "groups");
        if (groups.isEmpty()) {
            return groups;
        }
        List<NewBetGroupModel> list = groups;
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (NewBetGroupModel newBetGroupModel : list) {
            MatchVarietyBetModel matchVarietyBetModel = new MatchVarietyBetModel(newBetGroupModel.getGroup().getId(), 0, newBetGroupModel.getGroup().getName(), false, 0, 0, 0, 122, null);
            List<NewBetModel> bets = newBetGroupModel.getBets();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, i));
            for (NewBetModel newBetModel : bets) {
                arrayList2.add(new MatchVarietyBetOptionModel(newBetModel.getGrabbedBetId(), newBetModel.getGrabbedCoeficient(), newBetModel.getBetTypeId(), newBetModel.isAvailable(), newBetModel.getBetName()));
            }
            arrayList.add(new MatchVarietyGroupBetsModel(matchVarietyBetModel, arrayList2));
            i = 10;
        }
        List<MatchVarietyGroupBetsModel> sortBetGroups = sortBetGroups(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList3, ((NewBetGroupModel) it.next()).getBets());
        }
        ArrayList arrayList4 = arrayList3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList4, 10)), 16));
        for (Object obj2 : arrayList4) {
            linkedHashMap.put(Long.valueOf(((NewBetModel) obj2).getGrabbedBetId()), obj2);
        }
        List<MatchVarietyGroupBetsModel> list2 = sortBetGroups;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (MatchVarietyGroupBetsModel matchVarietyGroupBetsModel : list2) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((NewBetGroupModel) obj).getGroup().getId() == ((int) matchVarietyGroupBetsModel.getGroup().getId())) {
                    break;
                }
            }
            NewBetGroupModel newBetGroupModel2 = (NewBetGroupModel) obj;
            if (newBetGroupModel2 == null) {
                newBetGroupModel2 = (NewBetGroupModel) CollectionsKt.first((List) groups);
            }
            List<MatchVarietyBetOptionModel> bets2 = matchVarietyGroupBetsModel.getBets();
            ArrayList arrayList6 = new ArrayList();
            Iterator<T> it3 = bets2.iterator();
            while (it3.hasNext()) {
                NewBetModel newBetModel2 = (NewBetModel) linkedHashMap.get(Long.valueOf(((MatchVarietyBetOptionModel) it3.next()).getGrabbedBetId()));
                if (newBetModel2 != null) {
                    arrayList6.add(newBetModel2);
                }
            }
            arrayList5.add(new NewBetGroupModel(newBetGroupModel2.getGroup(), arrayList6));
        }
        return arrayList5;
    }

    private final List<MatchVarietyBetOptionModel> sortTotalBets(List<MatchVarietyBetOptionModel> bets) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (MatchVarietyBetOptionModel matchVarietyBetOptionModel : bets) {
            if (StringsKt.contains((CharSequence) matchVarietyBetOptionModel.getBetName(), (CharSequence) "Under", true)) {
                arrayList.add(matchVarietyBetOptionModel);
            } else if (StringsKt.contains((CharSequence) matchVarietyBetOptionModel.getBetName(), (CharSequence) "Over", true)) {
                arrayList2.add(matchVarietyBetOptionModel);
            } else {
                arrayList3.add(matchVarietyBetOptionModel);
            }
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: org.betup.utils.BetGroupsSortingUtils$sortTotalBets$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                double extractOverUnderParam;
                double extractOverUnderParam2;
                extractOverUnderParam = BetGroupsSortingUtils.INSTANCE.extractOverUnderParam(((MatchVarietyBetOptionModel) t).getBetName());
                Double valueOf = Double.valueOf(extractOverUnderParam);
                extractOverUnderParam2 = BetGroupsSortingUtils.INSTANCE.extractOverUnderParam(((MatchVarietyBetOptionModel) t2).getBetName());
                return ComparisonsKt.compareValues(valueOf, Double.valueOf(extractOverUnderParam2));
            }
        }), (Iterable) CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: org.betup.utils.BetGroupsSortingUtils$sortTotalBets$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                double extractOverUnderParam;
                double extractOverUnderParam2;
                extractOverUnderParam = BetGroupsSortingUtils.INSTANCE.extractOverUnderParam(((MatchVarietyBetOptionModel) t).getBetName());
                Double valueOf = Double.valueOf(extractOverUnderParam);
                extractOverUnderParam2 = BetGroupsSortingUtils.INSTANCE.extractOverUnderParam(((MatchVarietyBetOptionModel) t2).getBetName());
                return ComparisonsKt.compareValues(valueOf, Double.valueOf(extractOverUnderParam2));
            }
        })), (Iterable) arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double extractOverUnderParam(String betName) {
        List<String> groupValues;
        String str;
        Double doubleOrNull;
        MatchResult find$default = Regex.find$default(OVER_UNDER_VALUE, betName, 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str = (String) CollectionsKt.getOrNull(groupValues, 1)) == null || (doubleOrNull = StringsKt.toDoubleOrNull(str)) == null) {
            return 0.0d;
        }
        return doubleOrNull.doubleValue();
    }

    private final List<MatchVarietyBetOptionModel> sortHandicapBets(List<MatchVarietyBetOptionModel> bets) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (MatchVarietyBetOptionModel matchVarietyBetOptionModel : bets) {
            Pair<Integer, Double> parseHandicapBet = parseHandicapBet(matchVarietyBetOptionModel.getBetName());
            Integer first = parseHandicapBet != null ? parseHandicapBet.getFirst() : null;
            if (first != null && first.intValue() == 1) {
                arrayList.add(matchVarietyBetOptionModel);
            } else if (first != null && first.intValue() == 2) {
                arrayList2.add(matchVarietyBetOptionModel);
            } else {
                arrayList3.add(matchVarietyBetOptionModel);
            }
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: org.betup.utils.BetGroupsSortingUtils$sortHandicapBets$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Pair parseHandicapBet2;
                Pair parseHandicapBet3;
                parseHandicapBet2 = BetGroupsSortingUtils.INSTANCE.parseHandicapBet(((MatchVarietyBetOptionModel) t).getBetName());
                Double valueOf = Double.valueOf(Math.abs(parseHandicapBet2 != null ? ((Number) parseHandicapBet2.getSecond()).doubleValue() : 0.0d));
                parseHandicapBet3 = BetGroupsSortingUtils.INSTANCE.parseHandicapBet(((MatchVarietyBetOptionModel) t2).getBetName());
                return ComparisonsKt.compareValues(valueOf, Double.valueOf(Math.abs(parseHandicapBet3 != null ? ((Number) parseHandicapBet3.getSecond()).doubleValue() : 0.0d)));
            }
        }), (Iterable) CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: org.betup.utils.BetGroupsSortingUtils$sortHandicapBets$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Pair parseHandicapBet2;
                Pair parseHandicapBet3;
                parseHandicapBet2 = BetGroupsSortingUtils.INSTANCE.parseHandicapBet(((MatchVarietyBetOptionModel) t).getBetName());
                Double valueOf = Double.valueOf(Math.abs(parseHandicapBet2 != null ? ((Number) parseHandicapBet2.getSecond()).doubleValue() : 0.0d));
                parseHandicapBet3 = BetGroupsSortingUtils.INSTANCE.parseHandicapBet(((MatchVarietyBetOptionModel) t2).getBetName());
                return ComparisonsKt.compareValues(valueOf, Double.valueOf(Math.abs(parseHandicapBet3 != null ? ((Number) parseHandicapBet3.getSecond()).doubleValue() : 0.0d)));
            }
        })), (Iterable) arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, Double> parseHandicapBet(String betName) {
        String str;
        Integer intOrNull;
        Double doubleOrNull;
        MatchResult find$default = Regex.find$default(HANDICAP_NUMBER_AND_VALUE, betName, 0, 2, null);
        if (find$default == null || (str = (String) CollectionsKt.getOrNull(find$default.getGroupValues(), 1)) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
            return null;
        }
        int intValue = intOrNull.intValue();
        String str2 = (String) CollectionsKt.getOrNull(find$default.getGroupValues(), 2);
        if (str2 == null || (doubleOrNull = StringsKt.toDoubleOrNull(str2)) == null) {
            return null;
        }
        double doubleValue = doubleOrNull.doubleValue();
        if (1 > intValue || intValue >= 3) {
            return null;
        }
        return new Pair<>(Integer.valueOf(intValue), Double.valueOf(doubleValue));
    }

    public final <T> List<List<T>> toColumnMajorRows(List<? extends T> items, int columns) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (columns <= 1 || items.isEmpty()) {
            return CollectionsKt.chunked(items, 1);
        }
        int size = ((items.size() + columns) - 1) / columns;
        IntRange until = RangesKt.until(0, size);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            IntRange until2 = RangesKt.until(0, columns);
            ArrayList arrayList2 = new ArrayList();
            Iterator<Integer> it2 = until2.iterator();
            while (it2.hasNext()) {
                Object orNull = CollectionsKt.getOrNull(items, (((IntIterator) it2).nextInt() * size) + nextInt);
                if (orNull != null) {
                    arrayList2.add(orNull);
                }
            }
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t : arrayList) {
            if (!((List) t).isEmpty()) {
                arrayList3.add(t);
            }
        }
        return arrayList3;
    }
}
