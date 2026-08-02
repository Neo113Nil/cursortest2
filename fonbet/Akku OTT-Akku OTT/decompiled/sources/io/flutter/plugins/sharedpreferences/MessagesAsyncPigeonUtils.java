package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¨\u0006\u000e"}, d2 = {"Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;", "", "<init>", "()V", "wrapResult", "", "result", "wrapError", Constants.EXCEPTION, "", "deepEquals", "", "a", "b", "shared_preferences_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessagesAsync.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesAsync.g.kt\nio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,629:1\n1786#2,3:630\n1786#2,3:633\n173#3,3:636\n*S KotlinDebug\n*F\n+ 1 MessagesAsync.g.kt\nio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils\n*L\n49#1:630,3\n52#1:633,3\n56#1:636,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MessagesAsyncPigeonUtils {
    public static final MessagesAsyncPigeonUtils INSTANCE = new MessagesAsyncPigeonUtils();

    private MessagesAsyncPigeonUtils() {
    }

    public final boolean deepEquals(Object a, Object b) {
        if ((a instanceof byte[]) && (b instanceof byte[])) {
            return Arrays.equals((byte[]) a, (byte[]) b);
        }
        if ((a instanceof int[]) && (b instanceof int[])) {
            return Arrays.equals((int[]) a, (int[]) b);
        }
        if ((a instanceof long[]) && (b instanceof long[])) {
            return Arrays.equals((long[]) a, (long[]) b);
        }
        if ((a instanceof double[]) && (b instanceof double[])) {
            return Arrays.equals((double[]) a, (double[]) b);
        }
        if ((a instanceof Object[]) && (b instanceof Object[])) {
            Object[] objArr = (Object[]) a;
            Object[] objArr2 = (Object[]) b;
            if (objArr.length == objArr2.length) {
                Iterable indices = ArraysKt.getIndices(objArr);
                if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
                    Iterator it = indices.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((IntIterator) it).nextInt();
                        if (!INSTANCE.deepEquals(objArr[nextInt], objArr2[nextInt])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((a instanceof List) && (b instanceof List)) {
            List list = (List) a;
            List list2 = (List) b;
            if (list.size() == list2.size()) {
                Iterable indices2 = CollectionsKt.getIndices((Collection) a);
                if (!(indices2 instanceof Collection) || !((Collection) indices2).isEmpty()) {
                    Iterator it2 = indices2.iterator();
                    while (it2.hasNext()) {
                        int nextInt2 = ((IntIterator) it2).nextInt();
                        if (!INSTANCE.deepEquals(list.get(nextInt2), list2.get(nextInt2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(a instanceof Map) || !(b instanceof Map)) {
            return Intrinsics.areEqual(a, b);
        }
        Map map = (Map) a;
        Map map2 = (Map) b;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (map2.containsKey(entry.getKey()) && INSTANCE.deepEquals(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final List<Object> wrapError(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof SharedPreferencesError) {
            SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) exception;
            return CollectionsKt.listOf(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
        }
        return CollectionsKt.listOf((Object[]) new String[]{exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception)});
    }

    public final List<Object> wrapResult(Object result) {
        return CollectionsKt.listOf(result);
    }
}
