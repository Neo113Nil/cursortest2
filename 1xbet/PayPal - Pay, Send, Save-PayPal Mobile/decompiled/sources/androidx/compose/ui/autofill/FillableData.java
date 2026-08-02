package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/FillableData;", "", "", "defaultValue", "getListIndexOrDefault", "(I)I", "", "getDateMillisOrDefault", "(J)J", "", "getTextValue", "()Ljava/lang/CharSequence;", "textValue", "", "getBooleanValue", "()Ljava/lang/Boolean;", "booleanValue", "getListIndexValue", "()Ljava/lang/Integer;", "listIndexValue", "getDateMillisValue", "()Ljava/lang/Long;", "dateMillisValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FillableData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.autofill.FillableData.Companion INSTANCE = androidx.compose.ui.autofill.FillableData.Companion.Camera2StreamConfigurationMap;

    default java.lang.Boolean getBooleanValue() {
        return null;
    }

    default java.lang.Long getDateMillisValue() {
        return null;
    }

    default java.lang.Integer getListIndexValue() {
        return null;
    }

    default java.lang.CharSequence getTextValue() {
        return null;
    }

    default int getListIndexOrDefault(int defaultValue) {
        java.lang.Integer listIndexValue = getListIndexValue();
        return listIndexValue != null ? listIndexValue.intValue() : defaultValue;
    }

    default long getDateMillisOrDefault(long defaultValue) {
        java.lang.Long dateMillisValue = getDateMillisValue();
        return dateMillisValue != null ? dateMillisValue.longValue() : defaultValue;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/autofill/FillableData$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.autofill.FillableData.Companion Camera2StreamConfigurationMap = new androidx.compose.ui.autofill.FillableData.Companion();

        private Companion() {
        }
    }
}
