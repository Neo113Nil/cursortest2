package androidx.compose.ui.input.indirect;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\t\u0082\u0001\u0001\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "", "", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "getChanges", "()Ljava/util/List;", "changes", "Landroidx/compose/ui/input/indirect/IndirectPointerEventType;", "getType-4ZHQPSE", "()I", "type", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "getPrimaryDirectionalMotionAxis-nZO2Niw", "primaryDirectionalMotionAxis", "Landroidx/compose/ui/input/indirect/PlatformIndirectPointerEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IndirectPointerEvent {
    java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> getChanges();

    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw */
    int mo6750getPrimaryDirectionalMotionAxisnZO2Niw();

    /* renamed from: getType-4ZHQPSE */
    int mo6751getType4ZHQPSE();
}
