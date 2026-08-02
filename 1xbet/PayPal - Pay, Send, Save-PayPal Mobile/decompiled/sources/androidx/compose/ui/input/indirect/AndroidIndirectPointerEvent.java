package androidx.compose.ui.input.indirect;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/input/indirect/AndroidIndirectPointerEvent;", "Landroidx/compose/ui/input/indirect/PlatformIndirectPointerEvent;", "", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "changes", "Landroidx/compose/ui/input/indirect/IndirectPointerEventType;", "type", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "primaryDirectionalMotionAxis", "Landroid/view/MotionEvent;", "nativeEvent", "<init>", "(Ljava/util/List;IILandroid/view/MotionEvent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/util/List;", "getChanges", "()Ljava/util/List;", com.visa.cbp.getEncExpo.warmup, "getType-4ZHQPSE", "()I", "getPrimaryDirectionalMotionAxis-nZO2Niw", "Landroid/view/MotionEvent;", "getNativeEvent$ui", "()Landroid/view/MotionEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidIndirectPointerEvent implements androidx.compose.ui.input.indirect.PlatformIndirectPointerEvent {
    public static final int $stable = 8;
    private final java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes;
    private final android.view.MotionEvent nativeEvent;
    private final int primaryDirectionalMotionAxis;
    private final int type;

    private AndroidIndirectPointerEvent(java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> list, int i, int i2, android.view.MotionEvent motionEvent) {
        this.changes = list;
        this.type = i;
        this.primaryDirectionalMotionAxis = i2;
        this.nativeEvent = motionEvent;
        if (getChanges().isEmpty()) {
            throw new java.lang.IllegalArgumentException("changes cannot be empty".toString());
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    public final java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> getChanges() {
        return this.changes;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getType-4ZHQPSE, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name and from getter */
    public final int getPrimaryDirectionalMotionAxis() {
        return this.primaryDirectionalMotionAxis;
    }

    /* renamed from: getNativeEvent$ui, reason: from getter */
    public final android.view.MotionEvent getNativeEvent() {
        return this.nativeEvent;
    }

    public /* synthetic */ AndroidIndirectPointerEvent(java.util.List list, int i, int i2, android.view.MotionEvent motionEvent, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, motionEvent);
    }
}
