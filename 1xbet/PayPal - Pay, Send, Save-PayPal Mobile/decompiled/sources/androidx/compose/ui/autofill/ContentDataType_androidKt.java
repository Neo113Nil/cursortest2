package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0001\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "dataType", "Landroidx/compose/ui/autofill/ContentDataType;", "ContentDataType", "(I)Landroidx/compose/ui/autofill/ContentDataType;", "getDataType", "(Landroidx/compose/ui/autofill/ContentDataType;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentDataType_androidKt {
    public static final androidx.compose.ui.autofill.ContentDataType ContentDataType(int i) {
        return androidx.compose.ui.autofill.AndroidContentDataType.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.autofill.AndroidContentDataType.Camera2StreamConfigurationMap(i));
    }

    public static final int getDataType(androidx.compose.ui.autofill.ContentDataType contentDataType) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(contentDataType, "");
        return ((androidx.compose.ui.autofill.AndroidContentDataType) contentDataType).getHighResolutionOutputSizeshNQ4ISI;
    }
}
