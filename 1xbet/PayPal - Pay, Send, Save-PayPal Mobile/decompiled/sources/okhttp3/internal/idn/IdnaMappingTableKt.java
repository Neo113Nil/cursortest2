package okhttp3.internal.idn;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "", "index", "read14BitInt", "(Ljava/lang/String;I)I", com.daon.sdk.face.license.License.FEATURE_POSITION, "limit", "Lkotlin/Function1;", "compare", "binarySearch", "(IILkotlin/jvm/functions/Function1;)I"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdnaMappingTableKt {
    public static final int read14BitInt(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return (str.charAt(i) << 7) + str.charAt(i + 1);
    }

    public static final int binarySearch(int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) / 2;
            int intValue = function1.invoke(java.lang.Integer.valueOf(i4)).intValue();
            if (intValue < 0) {
                i3 = i4 - 1;
            } else {
                if (intValue <= 0) {
                    return i4;
                }
                i = i4 + 1;
            }
        }
        return (-i) - 1;
    }
}
