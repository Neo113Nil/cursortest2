package androidx.core.content;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroid/content/ContentValues;", "contentValuesOf", "([Lkotlin/Pair;)Landroid/content/ContentValues;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentValuesKt {
    public static final android.content.ContentValues contentValuesOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        android.content.ContentValues contentValues = new android.content.ContentValues(pairArr.length);
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair : pairArr) {
            java.lang.String component1 = pair.component1();
            java.lang.Object component2 = pair.component2();
            if (component2 == null) {
                contentValues.putNull(component1);
            } else if (component2 instanceof java.lang.String) {
                contentValues.put(component1, (java.lang.String) component2);
            } else if (component2 instanceof java.lang.Integer) {
                contentValues.put(component1, (java.lang.Integer) component2);
            } else if (component2 instanceof java.lang.Long) {
                contentValues.put(component1, (java.lang.Long) component2);
            } else if (component2 instanceof java.lang.Boolean) {
                contentValues.put(component1, (java.lang.Boolean) component2);
            } else if (component2 instanceof java.lang.Float) {
                contentValues.put(component1, (java.lang.Float) component2);
            } else if (component2 instanceof java.lang.Double) {
                contentValues.put(component1, (java.lang.Double) component2);
            } else if (component2 instanceof byte[]) {
                contentValues.put(component1, (byte[]) component2);
            } else if (component2 instanceof java.lang.Byte) {
                contentValues.put(component1, (java.lang.Byte) component2);
            } else {
                if (!(component2 instanceof java.lang.Short)) {
                    java.lang.String canonicalName = component2.getClass().getCanonicalName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal value type ");
                    sb.append(canonicalName);
                    sb.append(" for key \"");
                    sb.append(component1);
                    sb.append('\"');
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                contentValues.put(component1, (java.lang.Short) component2);
            }
        }
        return contentValues;
    }
}
