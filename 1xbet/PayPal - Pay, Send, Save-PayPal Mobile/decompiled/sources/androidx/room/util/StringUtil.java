package androidx.room.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010\"\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "newStringBuilder", "()Ljava/lang/StringBuilder;", "builder", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "appendPlaceholders", "(Ljava/lang/StringBuilder;I)V", "", "input", "", "splitToIntList", "(Ljava/lang/String;)Ljava/util/List;", "joinIntoString", "(Ljava/util/List;)Ljava/lang/String;", "", "EMPTY_STRING_ARRAY", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringUtil {
    public static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];

    @kotlin.Deprecated(message = "No longer used by generated code")
    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    @kotlin.Deprecated(message = "No longer used by generated code")
    public static final java.lang.StringBuilder newStringBuilder() {
        return new java.lang.StringBuilder();
    }

    public static final void appendPlaceholders(java.lang.StringBuilder sb, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final java.util.List<java.lang.Integer> splitToIntList(java.lang.String str) {
        java.util.List split$default;
        java.lang.Integer num;
        if (str == null || (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA}, false, 0, 6, (java.lang.Object) null)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = split$default.iterator();
        while (it.hasNext()) {
            try {
                num = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next()));
            } catch (java.lang.NumberFormatException unused) {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    public static final java.lang.String joinIntoString(java.util.List<java.lang.Integer> list) {
        if (list != null) {
            return kotlin.collections.CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }
}
