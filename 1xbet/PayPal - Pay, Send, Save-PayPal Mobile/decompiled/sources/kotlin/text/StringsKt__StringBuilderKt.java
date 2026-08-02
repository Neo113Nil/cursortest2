package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a3\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0002\"\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\b"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "append", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes5.dex */
public class StringsKt__StringBuilderKt extends kotlin.text.StringsKt__StringBuilderJVMKt {
    @kotlin.IgnorableReturnValue
    public static final java.lang.StringBuilder append(java.lang.StringBuilder sb, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        for (java.lang.String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @kotlin.IgnorableReturnValue
    public static final java.lang.StringBuilder append(java.lang.StringBuilder sb, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        for (java.lang.Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }
}
