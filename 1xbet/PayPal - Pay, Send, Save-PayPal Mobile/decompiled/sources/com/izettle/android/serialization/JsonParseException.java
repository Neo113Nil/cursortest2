package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bB\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\r"}, d2 = {"Lcom/izettle/android/serialization/JsonParseException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "", "char", "", "index", "", "inputString", "allowedChars", "<init>", "(CILjava/lang/String;[C)V", "message", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonParseException extends java.lang.RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonParseException(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonParseException(char c, int i, java.lang.String str, char... cArr) {
        this(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        java.lang.String concat = cArr.length == 0 ? "" : ", expected one of ".concat(java.lang.String.valueOf(kotlin.collections.ArraysKt.joinToString$default(cArr, (java.lang.CharSequence) ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null)));
        java.lang.String substring = str.substring(0, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String takeLast = kotlin.text.StringsKt.takeLast(substring, 50);
        java.lang.String substring2 = str.substring(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.String take = kotlin.text.StringsKt.take(kotlin.text.StringsKt.drop(substring2, 1), 50);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected character (");
        sb.append(c);
        sb.append(") at index ");
        sb.append(i);
        sb.append(concat);
        sb.append(". ");
        sb.append(takeLast);
        sb.append("__");
        sb.append(c);
        sb.append("__");
        sb.append(take);
    }
}
