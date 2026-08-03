package com.ironsource;

/* renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3275sa {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6588a = 100;

    public static final boolean a(org.json.JSONObject lhs, org.json.JSONObject rhs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    public static final boolean a(org.json.JSONArray lhs, org.json.JSONArray rhs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i > 100) {
            return false;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "lhs.keys()");
        for (java.lang.String str : kotlin.sequences.SequencesKt.asSequence(keys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i > 100) {
            return false;
        }
        java.lang.Iterable until = kotlin.ranges.RangesKt.until(0, jSONArray.length());
        if ((until instanceof java.util.Collection) && ((java.util.Collection) until).isEmpty()) {
            return true;
        }
        java.util.Iterator it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            if (!a(jSONArray.get(nextInt), jSONArray2.get(nextInt), i)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(java.lang.Object obj, java.lang.Object obj2, int i) {
        if ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) {
            return a((org.json.JSONObject) obj, (org.json.JSONObject) obj2, i + 1);
        }
        if ((obj instanceof org.json.JSONArray) && (obj2 instanceof org.json.JSONArray)) {
            return a((org.json.JSONArray) obj, (org.json.JSONArray) obj2, i + 1);
        }
        if ((obj instanceof java.lang.Number) && (obj2 instanceof java.lang.Number)) {
            return ((java.lang.Number) obj).doubleValue() == ((java.lang.Number) obj2).doubleValue();
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }
}
