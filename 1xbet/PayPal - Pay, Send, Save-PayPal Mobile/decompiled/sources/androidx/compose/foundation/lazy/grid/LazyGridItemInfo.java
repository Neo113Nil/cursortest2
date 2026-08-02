package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\bv\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004\u0082\u0001\u0001\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "", "", "getIndex", "()I", "index", "getKey", "()Ljava/lang/Object;", "key", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-nOcc-ac", "()J", "offset", "getRow", "row", "getColumn", "column", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", io.ktor.http.ContentDisposition.Parameters.Size, "getContentType", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "getSpan", "span", "Companion", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LazyGridItemInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.grid.LazyGridItemInfo.Companion INSTANCE = androidx.compose.foundation.lazy.grid.LazyGridItemInfo.Companion.getHighSpeedVideoSizes;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    int getColumn();

    java.lang.Object getContentType();

    int getIndex();

    java.lang.Object getKey();

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo1820getOffsetnOccac();

    int getRow();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo1821getSizeYbymL2g();

    int getSpan();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo$Companion;", "", "<init>", "()V", "", "UnknownRow", com.visa.cbp.getEncExpo.warmup, "UnknownColumn"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;
        static final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridItemInfo.Companion getHighSpeedVideoSizes = new androidx.compose.foundation.lazy.grid.LazyGridItemInfo.Companion();

        private Companion() {
        }
    }
}
