package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b*\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"T", "Lorg/json/JSONArray;", "Lkotlin/Function1;", "", "transform", "", "map", "(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "toList", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "", "", "toMap", "(Lorg/json/JSONObject;)Ljava/util/Map;"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class JSONExtensionsKt {
    public static final /* synthetic */ java.util.List map(final org.json.JSONArray jSONArray, final kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONArray, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(kotlin.ranges.RangesKt.until(0, jSONArray.length())), new kotlin.jvm.functions.Function1<java.lang.Integer, T>() { // from class: com.adobe.marketing.mobile.internal.util.JSONExtensionsKt$map$1
            public final T getHighSpeedVideoFpsRanges(int i) {
                kotlin.jvm.functions.Function1<java.lang.Object, T> function12 = function1;
                java.lang.Object obj = jSONArray.get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return function12.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return getHighSpeedVideoFpsRanges(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }));
    }

    public static final /* synthetic */ java.util.Map toMap(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "");
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
        kotlin.sequences.Sequence asSequence = kotlin.sequences.SequencesKt.asSequence(keys);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : asSequence) {
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            java.lang.Object obj2 = jSONObject.get((java.lang.String) obj);
            if (obj2 instanceof org.json.JSONObject) {
                obj2 = toMap((org.json.JSONObject) obj2);
            } else if (obj2 instanceof org.json.JSONArray) {
                obj2 = toList((org.json.JSONArray) obj2);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, org.json.JSONObject.NULL)) {
                obj2 = null;
            }
            linkedHashMap2.put(obj, obj2);
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ java.util.List toList(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONArray, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            java.lang.Object obj = jSONArray.get(((kotlin.collections.IntIterator) it).nextInt());
            if (obj instanceof org.json.JSONObject) {
                arrayList.add(toMap((org.json.JSONObject) obj));
            } else if (obj instanceof org.json.JSONArray) {
                arrayList.add(toList((org.json.JSONArray) obj));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(obj, org.json.JSONObject.NULL)) {
                arrayList.add(null);
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
