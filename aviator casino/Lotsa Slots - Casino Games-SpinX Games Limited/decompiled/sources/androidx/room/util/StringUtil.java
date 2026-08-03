package androidx.room.util;

/* compiled from: StringUtil.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0018\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e\u001a\u0006\u0010\u000f\u001a\u00020\t\u001a\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002\" \u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0005\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0011"}, d2 = {"EMPTY_STRING_ARRAY", "", "", "getEMPTY_STRING_ARRAY$annotations", "()V", "[Ljava/lang/String;", "appendPlaceholders", "", "builder", "Ljava/lang/StringBuilder;", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "", "joinIntoString", "input", "", "newStringBuilder", "splitToIntList", "room-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class StringUtil {
    public static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    public static final java.lang.StringBuilder newStringBuilder() {
        return new java.lang.StringBuilder();
    }

    public static final void appendPlaceholders(java.lang.StringBuilder builder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            builder.append("?");
            if (i2 < i - 1) {
                builder.append(",");
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
            } catch (java.lang.NumberFormatException e) {
                android.util.Log.e(androidx.room.Room.LOG_TAG, "Malformed integer list", e);
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
