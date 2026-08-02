package org.betup.utils;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: LogUtil.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011R.\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t0\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/utils/LogUtil;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "startTimeMap", "", "", "", "Lkotlin/Pair;", "", "addStartTime", "", "logKey", "additionalStepKey", "logTime", "key", "showAllTimes", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LogUtil {
    public static final LogUtil INSTANCE = new LogUtil();
    private static final Map<String, List<Pair<String, Long>>> startTimeMap = new LinkedHashMap();
    public static final int $stable = 8;

    private LogUtil() {
    }

    public static /* synthetic */ void addStartTime$default(LogUtil logUtil, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logUtil.addStartTime(str, str2);
    }

    public final void addStartTime(String logKey, String additionalStepKey) {
        Intrinsics.checkNotNullParameter(logKey, "logKey");
        Map<String, List<Pair<String, Long>>> map = startTimeMap;
        if (!map.containsKey(logKey)) {
            map.put(logKey, new ArrayList());
        }
        List<Pair<String, Long>> list = map.get(logKey);
        if (list != null) {
            list.add(TuplesKt.to(additionalStepKey, Long.valueOf(System.currentTimeMillis())));
        }
    }

    public static /* synthetic */ void logTime$default(LogUtil logUtil, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        logUtil.logTime(str, z);
    }

    public final void logTime(String key, boolean showAllTimes) {
        Intrinsics.checkNotNullParameter(key, "key");
        List<Pair<String, Long>> remove = startTimeMap.remove(key);
        if (remove == null || remove.size() < 2) {
            Log.d("LogUtil", "Not enough time data for " + key);
            return;
        }
        String str = " Total Time Diff: " + (((Number) ((Pair) CollectionsKt.last((List) remove)).getSecond()).longValue() - ((Number) ((Pair) CollectionsKt.first((List) remove)).getSecond()).longValue());
        if (showAllTimes) {
            Iterator<T> it = remove.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                Object next = it.next();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    Pair pair = (Pair) next2;
                    str = ((Object) str) + "\n->" + pair.getFirst() + " Time Diff: " + (((Number) pair.getSecond()).longValue() - ((Number) ((Pair) next).getSecond()).longValue());
                    arrayList.add(Unit.INSTANCE);
                    next = next2;
                }
            } else {
                CollectionsKt.emptyList();
            }
        }
        Log.d("LogUtil at " + key, str);
    }
}
