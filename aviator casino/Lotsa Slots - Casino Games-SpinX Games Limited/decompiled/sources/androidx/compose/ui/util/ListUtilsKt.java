package androidx.compose.ui.util;

/* compiled from: ListUtils.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u000e\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\t\u001a8\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0014*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\f\u001a=\u0010\u0015\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u0016\u001a?\u0010\u0017\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u0016\u001aJ\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001a0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a`\u0010\u001b\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\u001c\u001a\u0002H\u00192'\u0010\u001d\u001a#\u0012\u0013\u0012\u0011H\u0019¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\"\u001a8\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010'\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a}\u0010(\u001a\u0002H)\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010)*\u00060\u0003j\u0002`\u0004*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010*\u001a\u0002H)2\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020&2\b\b\u0002\u0010/\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u00100\u001a`\u00101\u001a\u000202\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020&2\b\b\u0002\u0010/\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a?\u00103\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u0016\u001aD\u00104\u001a\b\u0012\u0004\u0012\u0002H\u00190\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aY\u00105\u001a\b\u0012\u0004\u0012\u0002H\u00190\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\f2'\u0010\u0006\u001a#\u0012\u0013\u0012\u00110&¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(6\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a[\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00190\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\f2)\u0010\u0006\u001a%\u0012\u0013\u0012\u00110&¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(6\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00190\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aF\u00108\u001a\b\u0012\u0004\u0012\u0002H\u00190\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00190\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a]\u00109\u001a\u0002H:\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019\"\u0010\b\u0002\u0010:*\n\u0012\u0006\b\u0000\u0012\u0002H\u00190;*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010<\u001a\u0002H:2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010=\u001aO\u0010>\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190?*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u0016\u001aO\u0010@\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190?*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010A\u001aO\u0010B\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190?*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u0016\u001a\\\u0010C\u001a\u0002HD\"\u0004\b\u0000\u0010D\"\b\b\u0001\u0010\u0002*\u0002HD*\b\u0012\u0004\u0012\u0002H\u00020\f2'\u0010\u001d\u001a#\u0012\u0013\u0012\u0011HD¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002HD0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010E\u001a8\u0010F\u001a\u00020&\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020&0\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a|\u0010G\u001a\b\u0012\u0004\u0012\u0002HH0\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019\"\u0004\b\u0002\u0010H*\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00190\f26\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(J\u0012\u0013\u0012\u0011H\u0019¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(K\u0012\u0004\u0012\u0002HH0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aJ\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u00190\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006M"}, d2 = {"appendElement", "", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAll", "", "", "predicate", "fastAny", "fastDistinctBy", "K", "selector", "fastFilter", "fastFilterNotNull", "", "fastFirst", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastFirstOrNull", "fastFlatMap", "R", "", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastForEach", "action", "fastForEachIndexed", "", "fastForEachReversed", "fastJoinTo", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "buffer", "separator", "prefix", "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastLastOrNull", "fastMap", "fastMapIndexed", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "fastMapIndexedNotNull", "fastMapNotNull", "fastMapTo", "C", "", "destination", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastMaxBy", "", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastMinByOrNull", "fastReduce", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastSumBy", "fastZip", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "other", "a", "b", "fastZipWithNext", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListUtilsKt {
    public static final <T> void fastForEach(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachReversed(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            function1.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static final <T> void fastForEachIndexed(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> function2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(java.lang.Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T, R> java.util.List<R> fastMap(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(function1.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R extends java.lang.Comparable<? super R>> T fastMaxBy(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R invoke = function1.invoke(t);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = list.get(i);
                R invoke2 = function1.invoke(t2);
                if (invoke.compareTo(invoke2) < 0) {
                    t = t2;
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (T) t;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T fastLastOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            T t = list.get(size);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final <T> java.util.List<T> fastFilter(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> java.util.List<R> fastMapIndexed(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> function2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(function2.invoke(java.lang.Integer.valueOf(i), list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> java.util.List<R> fastMapIndexedNotNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> function2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            R invoke = function2.invoke(java.lang.Integer.valueOf(i), list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R extends java.lang.Comparable<? super R>> R fastMaxOfOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        R invoke = function1.invoke(list.get(0));
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R invoke2 = function1.invoke(list.get(i));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return invoke;
    }

    public static final <T, R> java.util.List<R> fastZipWithNext(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() == 0 || list.size() == 1) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        android.R.anim animVar = list.get(0);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        while (i < lastIndex) {
            i++;
            T t = list.get(i);
            arrayList.add(function2.invoke(animVar, t));
            animVar = t;
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> function2) {
        if (list.isEmpty()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s = (java.lang.Object) kotlin.collections.CollectionsKt.first((java.util.List) list);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                s = function2.invoke(s, list.get(i));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return s;
    }

    public static final <T, R, V> java.util.List<V> fastZip(java.util.List<? extends T> list, java.util.List<? extends R> list2, kotlin.jvm.functions.Function2<? super T, ? super R, ? extends V> function2) {
        int min = java.lang.Math.min(list.size(), list2.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(function2.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> java.util.List<R> fastMapNotNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            R invoke = function1.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.String fastJoinToString$default(java.util.List list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        java.lang.CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
        }
        java.lang.CharSequence charSequence6 = charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final <T> java.lang.String fastJoinToString(java.util.List<? extends T> list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> function1) {
        return ((java.lang.StringBuilder) fastJoinTo(list, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static final <T, K> java.util.List<T> fastDistinctBy(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        java.util.HashSet hashSet = new java.util.HashSet(list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (hashSet.add(function1.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R extends java.lang.Comparable<? super R>> T fastMinByOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R invoke = function1.invoke(t);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = list.get(i);
                R invoke2 = function1.invoke(t2);
                if (invoke.compareTo(invoke2) > 0) {
                    t = t2;
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (T) t;
    }

    public static final <T, R> java.util.List<R> fastFlatMap(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kotlin.collections.CollectionsKt.addAll(arrayList, function1.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T> java.util.List<T> fastFilterNotNull(java.util.List<? extends T> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends java.lang.Appendable> A fastJoinTo(java.util.List<? extends T> list, A a2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> function1) {
        a2.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a2, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(java.lang.Appendable appendable, T t, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> function1) {
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof java.lang.CharSequence)) {
            appendable.append((java.lang.CharSequence) t);
        } else if (t instanceof java.lang.Character) {
            appendable.append(((java.lang.Character) t).charValue());
        } else {
            appendable.append(java.lang.String.valueOf(t));
        }
    }

    public static final <T> boolean fastAll(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!function1.invoke(list.get(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (function1.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirstOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T> int fastSumBy(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function1) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += function1.invoke(list.get(i2)).intValue();
        }
        return i;
    }

    public static final <T, R, C extends java.util.Collection<? super R>> C fastMapTo(java.util.List<? extends T> list, C c, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(function1.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, R> R fastFold(java.util.List<? extends T> list, R r, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> function2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = function2.invoke(r, list.get(i));
        }
        return r;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
