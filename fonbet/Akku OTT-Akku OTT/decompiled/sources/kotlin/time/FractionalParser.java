package kotlin.time;

import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0086\u0088\u0004ø\u0001\u0000JA\u0010\u0010\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0082\u0088\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlin/time/FractionalParser;", "", "<init>", "()V", "parse", "", "value", "", SpellCheckPlugin.START_INDEX_KEY, "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", SpellCheckPlugin.END_INDEX_KEY, "", "parseDigits", "maxDigits", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/FractionalParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1613:1\n1351#1,14:1614\n1351#1,14:1628\n1656#2,3:1642\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/FractionalParser\n*L\n1343#1:1614,14\n1344#1:1628,14\n1345#1:1642,3\n*E\n"})
/* loaded from: classes5.dex */
public final class FractionalParser {
    public static final FractionalParser INSTANCE = new FractionalParser();

    private FractionalParser() {
    }

    private final int parseDigits(String str, int i, int i2, Function1<? super Integer, Unit> function1) {
        int min = Math.min(i + i2, str.length());
        int i3 = i;
        int i4 = 0;
        while (i3 < min) {
            char charAt = str.charAt(i3);
            if ('0' > charAt || charAt >= ':') {
                break;
            }
            i4 = (charAt - '0') + (i4 << 3) + (i4 << 1);
            i3++;
        }
        for (int i5 = 0; i5 < i2 - (i3 - i); i5++) {
            i4 = (i4 << 3) + (i4 << 1);
        }
        function1.invoke(Integer.valueOf(i3));
        return i4;
    }

    public final long parse(String value, int startIndex, Function1<? super Integer, Unit> callback) {
        char charAt;
        char charAt2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int min = Math.min(startIndex + 6, value.length());
        int i = startIndex;
        int i2 = 0;
        while (i < min && '0' <= (charAt2 = value.charAt(i)) && charAt2 < ':') {
            i2 = (charAt2 - '0') + (i2 << 3) + (i2 << 1);
            i++;
        }
        for (int i3 = 0; i3 < 6 - (i - startIndex); i3++) {
            i2 = (i2 << 1) + (i2 << 3);
        }
        int min2 = Math.min(i + 9, value.length());
        int i4 = 0;
        int i5 = i;
        while (i5 < min2) {
            char charAt3 = value.charAt(i5);
            if ('0' > charAt3 || charAt3 >= ':') {
                break;
            }
            i4 = (charAt3 - '0') + (i4 << 3) + (i4 << 1);
            i5++;
        }
        for (int i6 = 0; i6 < 9 - (i5 - i); i6++) {
            i4 = (i4 << 1) + (i4 << 3);
        }
        while (i5 < value.length() && '0' <= (charAt = value.charAt(i5)) && charAt < ':') {
            i5++;
        }
        callback.invoke(Integer.valueOf(i5));
        return (i2 * 1000000000) + i4;
    }
}
