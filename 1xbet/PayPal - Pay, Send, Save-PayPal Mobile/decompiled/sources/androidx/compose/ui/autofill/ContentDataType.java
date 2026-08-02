package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", "Companion", "Landroidx/compose/ui/autofill/AndroidContentDataType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDataType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.autofill.ContentDataType.Companion INSTANCE = androidx.compose.ui.autofill.ContentDataType.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/ContentDataType;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/ui/autofill/ContentDataType;", "getNone", "()Landroidx/compose/ui/autofill/ContentDataType;", "Text", "getText", "List", "getList", com.google.common.net.HttpHeaders.DATE, "getDate", "Toggle", "getToggle"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.autofill.ContentDataType.Companion getHighSpeedVideoSizes = new androidx.compose.ui.autofill.ContentDataType.Companion();
        private static final androidx.compose.ui.autofill.ContentDataType None = androidx.compose.ui.autofill.ContentDataType_androidKt.ContentDataType(0);
        private static final androidx.compose.ui.autofill.ContentDataType Text = androidx.compose.ui.autofill.ContentDataType_androidKt.ContentDataType(1);
        private static final androidx.compose.ui.autofill.ContentDataType List = androidx.compose.ui.autofill.ContentDataType_androidKt.ContentDataType(3);
        private static final androidx.compose.ui.autofill.ContentDataType Date = androidx.compose.ui.autofill.ContentDataType_androidKt.ContentDataType(4);
        private static final androidx.compose.ui.autofill.ContentDataType Toggle = androidx.compose.ui.autofill.ContentDataType_androidKt.ContentDataType(2);

        private Companion() {
        }

        public final androidx.compose.ui.autofill.ContentDataType getNone() {
            return None;
        }

        public final androidx.compose.ui.autofill.ContentDataType getText() {
            return Text;
        }

        public final androidx.compose.ui.autofill.ContentDataType getList() {
            return List;
        }

        public final androidx.compose.ui.autofill.ContentDataType getDate() {
            return Date;
        }

        public final androidx.compose.ui.autofill.ContentDataType getToggle() {
            return Toggle;
        }
    }
}
