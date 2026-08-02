package androidx.compose.ui.draganddrop;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "", "Landroid/content/ClipData;", "clipData", "localState", "", "flags", "<init>", "(Landroid/content/ClipData;Ljava/lang/Object;I)V", "Landroid/content/ClipData;", "getClipData", "()Landroid/content/ClipData;", "Ljava/lang/Object;", "getLocalState", "()Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getFlags", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;
    private final android.content.ClipData clipData;
    private final int flags;
    private final java.lang.Object localState;

    public DragAndDropTransferData(android.content.ClipData clipData, java.lang.Object obj, int i) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i;
    }

    public /* synthetic */ DragAndDropTransferData(android.content.ClipData clipData, java.lang.Object obj, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(clipData, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? 0 : i);
    }

    public final android.content.ClipData getClipData() {
        return this.clipData;
    }

    public final java.lang.Object getLocalState() {
        return this.localState;
    }

    public final int getFlags() {
        return this.flags;
    }
}
