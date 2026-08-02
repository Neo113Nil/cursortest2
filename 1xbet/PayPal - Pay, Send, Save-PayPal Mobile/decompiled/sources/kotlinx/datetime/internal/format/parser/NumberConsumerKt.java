package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NumberConsumerKt {
    public static final /* synthetic */ int access$parseAsciiInt(java.lang.CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            i3 = (i3 * 10) + kotlinx.datetime.internal.UtilKt.asciiDigitToInt(charSequence.charAt(i));
            i++;
        }
        return i3;
    }

    public static final /* synthetic */ java.lang.Integer access$parseAsciiIntOrNull(java.lang.CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            i3 = (i3 * 10) + kotlinx.datetime.internal.UtilKt.asciiDigitToInt(charSequence.charAt(i));
            if (i3 < 0) {
                return null;
            }
            i++;
        }
        return java.lang.Integer.valueOf(i3);
    }

    public static final /* synthetic */ kotlinx.datetime.internal.format.parser.NumberConsumptionError access$setWithoutReassigning(kotlinx.datetime.internal.format.parser.AssignableField assignableField, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object trySetWithoutReassigning = assignableField.trySetWithoutReassigning(obj, obj2);
        if (trySetWithoutReassigning == null) {
            return null;
        }
        return new kotlinx.datetime.internal.format.parser.NumberConsumptionError.Conflicting(trySetWithoutReassigning);
    }
}
