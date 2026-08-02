package org.betup.utils;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.betup.model.local.entity.RacingResult;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RacingResultsParser.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lorg/betup/utils/RacingResultsParser;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "parseRacingResults", "", "Lorg/betup/model/local/entity/RacingResult;", "resultRaw", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RacingResultsParser {
    public static final int $stable = 0;
    public static final RacingResultsParser INSTANCE = new RacingResultsParser();

    private RacingResultsParser() {
    }

    public final List<RacingResult> parseRacingResults(String resultRaw) {
        String str = resultRaw;
        if (str == null || StringsKt.isBlank(str)) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            List split$default = StringsKt.split$default((CharSequence) resultRaw, new String[]{"\n"}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            Regex regex = new Regex("(\\d+)\\s*-\\s*Nr(\\d+)\\s+(.+?)(?:,\\s*|$)");
            for (String str2 : arrayList3) {
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) " - Nr", false, 2, (Object) null)) {
                    List split$default2 = StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default2, 10));
                    Iterator it2 = split$default2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(StringsKt.trim((CharSequence) it2.next()).toString());
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        if (!StringsKt.isBlank((String) obj2)) {
                            arrayList5.add(obj2);
                        }
                    }
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        MatchResult find$default = Regex.find$default(regex, (String) it3.next(), 0, 2, null);
                        if (find$default != null) {
                            Integer intOrNull = StringsKt.toIntOrNull(find$default.getGroupValues().get(1));
                            Integer intOrNull2 = StringsKt.toIntOrNull(find$default.getGroupValues().get(2));
                            String obj3 = StringsKt.trim((CharSequence) StringsKt.removeSuffix(StringsKt.trim((CharSequence) find$default.getGroupValues().get(3)).toString(), (CharSequence) ",")).toString();
                            if (intOrNull != null && intOrNull2 != null && !StringsKt.isBlank(obj3)) {
                                RacingResult racingResult = new RacingResult();
                                racingResult.setPosition(intOrNull.intValue());
                                racingResult.setNumber(intOrNull2.intValue());
                                racingResult.setName(obj3);
                                arrayList.add(racingResult);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e("RacingResultsParser", "Error parsing racing results", e);
        }
        return arrayList;
    }
}
