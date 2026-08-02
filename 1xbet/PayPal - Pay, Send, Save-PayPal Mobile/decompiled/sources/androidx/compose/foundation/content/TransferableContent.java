package androidx.compose.foundation.content;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0018B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent;", "", "Landroidx/compose/ui/platform/ClipEntry;", "clipEntry", "Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "Landroidx/compose/foundation/content/TransferableContent$Source;", "source", "Landroidx/compose/foundation/content/PlatformTransferableContent;", "platformTransferableContent", "<init>", "(Landroidx/compose/ui/platform/ClipEntry;Landroidx/compose/ui/platform/ClipMetadata;ILandroidx/compose/foundation/content/PlatformTransferableContent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/platform/ClipEntry;", "getClipEntry", "()Landroidx/compose/ui/platform/ClipEntry;", "Landroidx/compose/ui/platform/ClipMetadata;", "getClipMetadata", "()Landroidx/compose/ui/platform/ClipMetadata;", com.visa.cbp.getEncExpo.warmup, "getSource-kB6V9T0", "()I", "Landroidx/compose/foundation/content/PlatformTransferableContent;", "getPlatformTransferableContent", "()Landroidx/compose/foundation/content/PlatformTransferableContent;", "Source"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransferableContent {
    public static final int $stable = 8;
    private final androidx.compose.ui.platform.ClipEntry clipEntry;
    private final androidx.compose.ui.platform.ClipMetadata clipMetadata;
    private final androidx.compose.foundation.content.PlatformTransferableContent platformTransferableContent;
    private final int source;

    private TransferableContent(androidx.compose.ui.platform.ClipEntry clipEntry, androidx.compose.ui.platform.ClipMetadata clipMetadata, int i, androidx.compose.foundation.content.PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i;
        this.platformTransferableContent = platformTransferableContent;
    }

    public /* synthetic */ TransferableContent(androidx.compose.ui.platform.ClipEntry clipEntry, androidx.compose.ui.platform.ClipMetadata clipMetadata, int i, androidx.compose.foundation.content.PlatformTransferableContent platformTransferableContent, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i, (i2 & 8) != 0 ? null : platformTransferableContent, null);
    }

    public final androidx.compose.ui.platform.ClipEntry getClipEntry() {
        return this.clipEntry;
    }

    public final androidx.compose.ui.platform.ClipMetadata getClipMetadata() {
        return this.clipMetadata;
    }

    /* renamed from: getSource-kB6V9T0, reason: not valid java name and from getter */
    public final int getSource() {
        return this.source;
    }

    public final androidx.compose.foundation.content.PlatformTransferableContent getPlatformTransferableContent() {
        return this.platformTransferableContent;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent$Source;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class Source {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.foundation.content.TransferableContent.Source.Companion INSTANCE = new androidx.compose.foundation.content.TransferableContent.Source.Companion(null);
        private static final int Keyboard = m1369constructorimpl(0);
        private static final int DragAndDrop = m1369constructorimpl(1);
        private static final int Clipboard = m1369constructorimpl(2);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m1369constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1371equalsimpl0(int i, int i2) {
            return i == i2;
        }

        private /* synthetic */ Source(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent$Source$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/content/TransferableContent$Source;", "Keyboard", com.visa.cbp.getEncExpo.warmup, "getKeyboard-kB6V9T0", "()I", "DragAndDrop", "getDragAndDrop-kB6V9T0", "Clipboard", "getClipboard-kB6V9T0"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m1377getKeyboardkB6V9T0() {
                return androidx.compose.foundation.content.TransferableContent.Source.Keyboard;
            }

            /* renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m1376getDragAndDropkB6V9T0() {
                return androidx.compose.foundation.content.TransferableContent.Source.DragAndDrop;
            }

            /* renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m1375getClipboardkB6V9T0() {
                return androidx.compose.foundation.content.TransferableContent.Source.Clipboard;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            return m1373toStringimpl(this.getHighSpeedVideoFpsRanges);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m1373toStringimpl(int i) {
            if (m1371equalsimpl0(i, Keyboard)) {
                return "Source.Keyboard";
            }
            if (m1371equalsimpl0(i, DragAndDrop)) {
                return "Source.DragAndDrop";
            }
            if (m1371equalsimpl0(i, Clipboard)) {
                return "Source.Clipboard";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid (");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int hashCode() {
            return m1372hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object other) {
            return m1370equalsimpl(this.getHighSpeedVideoFpsRanges, other);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1372hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1370equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.foundation.content.TransferableContent.Source) && i == ((androidx.compose.foundation.content.TransferableContent.Source) obj).getGetHighSpeedVideoFpsRanges();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.foundation.content.TransferableContent.Source m1368boximpl(int i) {
            return new androidx.compose.foundation.content.TransferableContent.Source(i);
        }
    }

    public /* synthetic */ TransferableContent(androidx.compose.ui.platform.ClipEntry clipEntry, androidx.compose.ui.platform.ClipMetadata clipMetadata, int i, androidx.compose.foundation.content.PlatformTransferableContent platformTransferableContent, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i, platformTransferableContent);
    }
}
