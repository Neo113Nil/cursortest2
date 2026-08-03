package androidx.compose.runtime.changelist;

/* compiled from: ChangeList.kt */
@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006J\u001e\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ(\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020\nJ\u0016\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)J\u001b\u0010*\u001a\u00020\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0+¢\u0006\u0002\u0010,J\"\u0010-\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\n0/2\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u00020\nJ\u0006\u00103\u001a\u00020\nJ\u000e\u00104\u001a\u00020\n2\u0006\u0010(\u001a\u00020)J\u0006\u00105\u001a\u00020\nJ\u001a\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0016\u00108\u001a\u00020\n2\u0006\u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u000209J\u001e\u00108\u001a\u00020\n2\u0006\u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0006J\u001e\u0010>\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006J\u001e\u0010@\u001a\u00020\n2\u0006\u00101\u001a\u00020A2\u0006\u0010 \u001a\u00020!2\u0006\u0010B\u001a\u00020#J\u000e\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u00020\nJ\u0016\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0006J\u0006\u0010J\u001a\u00020\nJ\u0014\u0010K\u001a\u00020\n2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0MJ\u0006\u0010N\u001a\u00020\nJ\u0010\u0010O\u001a\u00020\n2\b\u0010P\u001a\u0004\u0018\u00010\u001aJ>\u0010Q\u001a\u00020\n\"\u0004\b\u0000\u0010R\"\u0004\b\u0001\u0010S2\u0006\u0010D\u001a\u0002HS2\u001d\u0010T\u001a\u0019\u0012\u0004\u0012\u0002HR\u0012\u0004\u0012\u0002HS\u0012\u0004\u0012\u00020\n0U¢\u0006\u0002\bV¢\u0006\u0002\u0010WJ\u0018\u0010X\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010\u001a2\u0006\u0010Y\u001a\u00020\u0006J\u000e\u0010Z\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0006J\u0010\u0010[\u001a\u00020\n2\b\u0010\\\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020^H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006`"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "size", "", "getSize", "()I", "clear", "", "executeAndFlushAllPendingChanges", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "pushAdvanceSlotsBy", "distance", "pushCopyNodesToNewAnchorLocation", "nodes", "", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "pushCopySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "Landroidx/compose/runtime/MovableContentStateReference;", "to", "pushDeactivateCurrentGroup", "pushDetermineMovableContentNodeIndex", "effectiveNodeIndexOut", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "pushDowns", "", "([Ljava/lang/Object;)V", "pushEndCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "pushEndCurrentGroup", "pushEndMovableContentPlacement", "pushEnsureGroupStarted", "pushEnsureRootStarted", "pushExecuteOperationsIn", "changeList", "pushInsertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "pushMoveCurrentGroup", "offset", "pushMoveNode", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "pushReleaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushRemember", "value", "Landroidx/compose/runtime/RememberObserver;", "pushRemoveCurrentGroup", "pushRemoveNode", "removeFrom", "moveCount", "pushResetSlots", "pushSideEffect", "effect", "Lkotlin/Function0;", "pushSkipToEndOfCurrentGroup", "pushUpdateAuxData", "data", "pushUpdateNode", "T", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pushUpdateValue", "groupSlotIndex", "pushUps", "pushUseNode", "node", "toDebugString", "", "linePrefix", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChangeList implements androidx.compose.runtime.changelist.OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final androidx.compose.runtime.changelist.Operations operations = new androidx.compose.runtime.changelist.Operations();

    public final int getSize() {
        return this.operations.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slots, androidx.compose.runtime.RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
    }

    public final void pushRemember(androidx.compose.runtime.RememberObserver value) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.Remember remember = androidx.compose.runtime.changelist.Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.Remember remember2 = androidx.compose.runtime.changelist.Operation.Remember.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), value);
        if (operations.pushedIntMask == operations.createExpectedArgMask(remember.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(remember.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = remember.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(remember.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = remember.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(remember.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + remember + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUpdateValue(java.lang.Object value, int groupSlotIndex) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.UpdateValue updateValue = androidx.compose.runtime.changelist.Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateValue updateValue2 = androidx.compose.runtime.changelist.Operation.UpdateValue.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), value);
        androidx.compose.runtime.changelist.Operation.UpdateValue updateValue3 = androidx.compose.runtime.changelist.Operation.UpdateValue.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), groupSlotIndex);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateValue.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = updateValue.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateValue.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = updateValue.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateValue.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + updateValue + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushResetSlots() {
        this.operations.push(androidx.compose.runtime.changelist.Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(androidx.compose.runtime.changelist.Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(java.lang.Object data) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.UpdateAuxData updateAuxData = androidx.compose.runtime.changelist.Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateAuxData updateAuxData2 = androidx.compose.runtime.changelist.Operation.UpdateAuxData.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), data);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateAuxData.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateAuxData.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = updateAuxData.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateAuxData.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = updateAuxData.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateAuxData.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + updateAuxData + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(androidx.compose.runtime.changelist.Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(androidx.compose.runtime.Anchor anchor) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.EnsureGroupStarted ensureGroupStarted = androidx.compose.runtime.changelist.Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.EnsureGroupStarted ensureGroupStarted2 = androidx.compose.runtime.changelist.Operation.EnsureGroupStarted.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ensureGroupStarted.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ensureGroupStarted.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = ensureGroupStarted.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(ensureGroupStarted.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = ensureGroupStarted.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(ensureGroupStarted.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + ensureGroupStarted + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(androidx.compose.runtime.changelist.Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(androidx.compose.runtime.changelist.Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(androidx.compose.runtime.changelist.Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.InsertSlots insertSlots = androidx.compose.runtime.changelist.Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.InsertSlots insertSlots2 = androidx.compose.runtime.changelist.Operation.InsertSlots.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), anchor);
        androidx.compose.runtime.changelist.Operation.InsertSlots insertSlots3 = androidx.compose.runtime.changelist.Operation.InsertSlots.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), from);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlots.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlots.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = insertSlots.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlots.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = insertSlots.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlots.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + insertSlots + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushInsertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from, androidx.compose.runtime.changelist.FixupList fixups) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups2 = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), anchor);
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups3 = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), from);
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups4 = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2), fixups);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlotsWithFixups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlotsWithFixups.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlotsWithFixups.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = insertSlotsWithFixups.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlotsWithFixups.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + insertSlotsWithFixups + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushMoveCurrentGroup(int offset) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.MoveCurrentGroup moveCurrentGroup = androidx.compose.runtime.changelist.Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.MoveCurrentGroup moveCurrentGroup2 = androidx.compose.runtime.changelist.Operation.MoveCurrentGroup.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), offset);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveCurrentGroup.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveCurrentGroup.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = moveCurrentGroup.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(moveCurrentGroup.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = moveCurrentGroup.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveCurrentGroup.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + moveCurrentGroup + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEndCompositionScope(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Composition, kotlin.Unit> action, androidx.compose.runtime.Composition composition) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.EndCompositionScope endCompositionScope = androidx.compose.runtime.changelist.Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.EndCompositionScope endCompositionScope2 = androidx.compose.runtime.changelist.Operation.EndCompositionScope.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), action);
        androidx.compose.runtime.changelist.Operation.EndCompositionScope endCompositionScope3 = androidx.compose.runtime.changelist.Operation.EndCompositionScope.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), composition);
        if (operations.pushedIntMask == operations.createExpectedArgMask(endCompositionScope.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(endCompositionScope.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = endCompositionScope.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(endCompositionScope.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = endCompositionScope.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(endCompositionScope.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + endCompositionScope + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUseNode(java.lang.Object node) {
        if (node instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
            this.operations.push(androidx.compose.runtime.changelist.Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final <T, V> void pushUpdateNode(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode2 = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), value);
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode3 = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        int m1690constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, m1690constructorimpl, (kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateNode.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = updateNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = updateNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateNode.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.RemoveNode removeNode = androidx.compose.runtime.changelist.Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.RemoveNode removeNode2 = androidx.compose.runtime.changelist.Operation.RemoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), removeFrom);
        androidx.compose.runtime.changelist.Operation.RemoveNode removeNode3 = androidx.compose.runtime.changelist.Operation.RemoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1), moveCount);
        if (operations.pushedIntMask == operations.createExpectedArgMask(removeNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(removeNode.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = removeNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(removeNode.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = removeNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(removeNode.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + removeNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushMoveNode(int to, int from, int count) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode2 = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1), to);
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode3 = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), from);
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode4 = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(2), count);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveNode.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = moveNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(moveNode.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = moveNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveNode.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + moveNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushAdvanceSlotsBy(int distance) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy advanceSlotsBy = androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy advanceSlotsBy2 = androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), distance);
        if (operations.pushedIntMask == operations.createExpectedArgMask(advanceSlotsBy.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(advanceSlotsBy.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = advanceSlotsBy.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(advanceSlotsBy.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = advanceSlotsBy.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(advanceSlotsBy.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + advanceSlotsBy + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUps(int count) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.Ups ups = androidx.compose.runtime.changelist.Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.Ups ups2 = androidx.compose.runtime.changelist.Operation.Ups.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), count);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ups.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = ups.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(ups.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = ups.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(ups.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + ups + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushDowns(java.lang.Object[] nodes) {
        if (!(nodes.length == 0)) {
            androidx.compose.runtime.changelist.Operations operations = this.operations;
            androidx.compose.runtime.changelist.Operation.Downs downs = androidx.compose.runtime.changelist.Operation.Downs.INSTANCE;
            operations.pushOp(downs);
            androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
            androidx.compose.runtime.changelist.Operation.Downs downs2 = androidx.compose.runtime.changelist.Operation.Downs.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), nodes);
            if (operations.pushedIntMask == operations.createExpectedArgMask(downs.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(downs.getObjects())) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int ints = downs.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & operations.pushedIntMask) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(downs.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                    i++;
                }
            }
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            int objects = downs.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & operations.pushedObjectMask) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(downs.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                    i3++;
                }
            }
            java.lang.String sb4 = sb3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new java.lang.IllegalStateException(("Error while pushing " + downs + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushSideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.SideEffect sideEffect = androidx.compose.runtime.changelist.Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.SideEffect sideEffect2 = androidx.compose.runtime.changelist.Operation.SideEffect.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), effect);
        if (operations.pushedIntMask == operations.createExpectedArgMask(sideEffect.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(sideEffect.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = sideEffect.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(sideEffect.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = sideEffect.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(sideEffect.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + sideEffect + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushDetermineMovableContentNodeIndex(androidx.compose.runtime.internal.IntRef effectiveNodeIndexOut, androidx.compose.runtime.Anchor anchor) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex2 = androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), effectiveNodeIndexOut);
        androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex3 = androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = determineMovableContentNodeIndex.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(determineMovableContentNodeIndex.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = determineMovableContentNodeIndex.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(determineMovableContentNodeIndex.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + determineMovableContentNodeIndex + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushCopyNodesToNewAnchorLocation(java.util.List<? extends java.lang.Object> nodes, androidx.compose.runtime.internal.IntRef effectiveNodeIndex) {
        if (!nodes.isEmpty()) {
            androidx.compose.runtime.changelist.Operations operations = this.operations;
            androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            operations.pushOp(copyNodesToNewAnchorLocation);
            androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
            androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation2 = androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), nodes);
            androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation3 = androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), effectiveNodeIndex);
            if (operations.pushedIntMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getObjects())) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int ints = copyNodesToNewAnchorLocation.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & operations.pushedIntMask) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(copyNodesToNewAnchorLocation.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                    i++;
                }
            }
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            int objects = copyNodesToNewAnchorLocation.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & operations.pushedObjectMask) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(copyNodesToNewAnchorLocation.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                    i3++;
                }
            }
            java.lang.String sb4 = sb3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new java.lang.IllegalStateException(("Error while pushing " + copyNodesToNewAnchorLocation + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushCopySlotTableToAnchorLocation(androidx.compose.runtime.MovableContentState resolvedState, androidx.compose.runtime.CompositionContext parentContext, androidx.compose.runtime.MovableContentStateReference from, androidx.compose.runtime.MovableContentStateReference to) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation2 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), resolvedState);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation3 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), parentContext);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation4 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(3), to);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation5 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2), from);
        if (operations.pushedIntMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = copySlotTableToAnchorLocation.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(copySlotTableToAnchorLocation.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = copySlotTableToAnchorLocation.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(copySlotTableToAnchorLocation.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + copySlotTableToAnchorLocation + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushReleaseMovableGroupAtCurrent(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.CompositionContext parentContext, androidx.compose.runtime.MovableContentStateReference reference) {
        androidx.compose.runtime.changelist.Operations operations = this.operations;
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent2 = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), composition);
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent3 = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), parentContext);
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent4 = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2), reference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getObjects())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int ints = releaseMovableGroupAtCurrent.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(releaseMovableGroupAtCurrent.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                i++;
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int objects = releaseMovableGroupAtCurrent.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(releaseMovableGroupAtCurrent.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                i3++;
            }
        }
        java.lang.String sb4 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + releaseMovableGroupAtCurrent + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(androidx.compose.runtime.changelist.Operation.EndMovableContentPlacement.INSTANCE);
    }

    public static /* synthetic */ void pushExecuteOperationsIn$default(androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.changelist.ChangeList changeList2, androidx.compose.runtime.internal.IntRef intRef, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void pushExecuteOperationsIn(androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.internal.IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            androidx.compose.runtime.changelist.Operations operations = this.operations;
            androidx.compose.runtime.changelist.Operation.ApplyChangeList applyChangeList = androidx.compose.runtime.changelist.Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations);
            androidx.compose.runtime.changelist.Operation.ApplyChangeList applyChangeList2 = androidx.compose.runtime.changelist.Operation.ApplyChangeList.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), changeList);
            androidx.compose.runtime.changelist.Operation.ApplyChangeList applyChangeList3 = androidx.compose.runtime.changelist.Operation.ApplyChangeList.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), effectiveNodeIndex);
            if (operations.pushedIntMask == operations.createExpectedArgMask(applyChangeList.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(applyChangeList.getObjects())) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int ints = applyChangeList.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & operations.pushedIntMask) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(applyChangeList.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i2)));
                    i++;
                }
            }
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            int objects = applyChangeList.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & operations.pushedObjectMask) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(applyChangeList.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
                    i3++;
                }
            }
            java.lang.String sb4 = sb3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new java.lang.IllegalStateException(("Error while pushing " + applyChangeList + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public java.lang.String toDebugString(java.lang.String linePrefix) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeList instance containing");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(linePrefix));
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
