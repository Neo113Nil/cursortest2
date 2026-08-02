package kotlin.time;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/time/FractionalParser;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "startIndex", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "endIndex", "", com.sun.jna.Callback.METHOD_NAME, "", "parse", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FractionalParser {
    public static final kotlin.time.FractionalParser INSTANCE = new kotlin.time.FractionalParser();

    private FractionalParser() {
    }

    public final long parse(java.lang.String value, int startIndex, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
        char charAt;
        char charAt2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        int min = java.lang.Math.min(startIndex + 6, value.length());
        int i = startIndex;
        int i2 = 0;
        while (i < min && '0' <= (charAt2 = value.charAt(i)) && charAt2 < ':') {
            i2 = (i2 << 3) + (i2 << 1) + (charAt2 - '0');
            i++;
        }
        for (int i3 = 0; i3 < 6 - (i - startIndex); i3++) {
            i2 = (i2 << 3) + (i2 << 1);
        }
        int min2 = java.lang.Math.min(i + 9, value.length());
        int i4 = 0;
        int i5 = i;
        while (i5 < min2) {
            char charAt3 = value.charAt(i5);
            if ('0' > charAt3 || charAt3 >= ':') {
                break;
            }
            i4 = (i4 << 3) + (i4 << 1) + (charAt3 - '0');
            i5++;
        }
        for (int i6 = 0; i6 < 9 - (i5 - i); i6++) {
            i4 = (i4 << 3) + (i4 << 1);
        }
        while (i5 < value.length() && '0' <= (charAt = value.charAt(i5)) && charAt < ':') {
            i5++;
        }
        callback.invoke(java.lang.Integer.valueOf(i5));
        return (i2 * 1000000000) + i4;
    }
}
