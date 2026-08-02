package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0088\u0001\t\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/autofill/AndroidContentDataType;", "Landroidx/compose/ui/autofill/ContentDataType;", "", "p0", "Camera2StreamConfigurationMap", "(I)I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "androidAutofillType"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class AndroidContentDataType implements androidx.compose.ui.autofill.ContentDataType {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final int getHighResolutionOutputSizeshNQ4ISI;

    public static int Camera2StreamConfigurationMap(int i) {
        return i;
    }

    private /* synthetic */ AndroidContentDataType(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.autofill.AndroidContentDataType) && this.getHighResolutionOutputSizeshNQ4ISI == ((androidx.compose.ui.autofill.AndroidContentDataType) obj).getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AndroidContentDataType(androidAutofillType=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public static final /* synthetic */ androidx.compose.ui.autofill.AndroidContentDataType getHighResolutionOutputSizeshNQ4ISI(int i) {
        return new androidx.compose.ui.autofill.AndroidContentDataType(i);
    }
}
