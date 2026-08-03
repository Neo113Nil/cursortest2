package androidx.compose.runtime.changelist;

/* compiled from: FixupList.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\"\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J>\u0010!\u001a\u00020\u000b\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u0002H\"2\u001d\u0010%\u001a\u0019\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020\u000b0&¢\u0006\u0002\b'¢\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006)"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "size", "", "getSize", "()I", "clear", "", "createAndInsertNode", "factory", "Lkotlin/Function0;", "", "insertIndex", "groupAnchor", "Landroidx/compose/runtime/Anchor;", "endNodeInsert", "executeAndFlushAllPendingFixups", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "toDebugString", "", "linePrefix", "updateNode", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FixupList implements androidx.compose.runtime.changelist.OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final androidx.compose.runtime.changelist.Operations operations = new androidx.compose.runtime.changelist.Operations();
    private final androidx.compose.runtime.changelist.Operations pendingOperations = new androidx.compose.runtime.changelist.Operations();

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
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingFixups(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slots, androidx.compose.runtime.RememberManager rememberManager) {
        if (this.pendingOperations.isEmpty()) {
            this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final void createAndInsertNode(kotlin.jvm.functions.Function0<? extends java.lang.Object> factory, int insertIndex, androidx.compose.runtime.Anchor groupAnchor) {
        int i;
        androidx.compose.runtime.changelist.Operations operations;
        androidx.compose.runtime.changelist.Operations operations2 = this.operations;
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        operations2.pushOp(insertNodeFixup);
        androidx.compose.runtime.changelist.Operations m1718constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations2);
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup2 = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), factory);
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup3 = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), insertIndex);
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup4 = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1), groupAnchor);
        if (operations2.pushedIntMask == operations2.createExpectedArgMask(insertNodeFixup.getInts()) && operations2.pushedObjectMask == operations2.createExpectedArgMask(insertNodeFixup.getObjects())) {
            androidx.compose.runtime.changelist.Operations operations3 = this.pendingOperations;
            androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup postInsertNodeFixup = androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.INSTANCE;
            operations3.pushOp(postInsertNodeFixup);
            androidx.compose.runtime.changelist.Operations m1718constructorimpl2 = androidx.compose.runtime.changelist.Operations.WriteScope.m1718constructorimpl(operations3);
            androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup postInsertNodeFixup2 = androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m1723setIntA6tL2VI(m1718constructorimpl2, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0), insertIndex);
            androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup postInsertNodeFixup3 = androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m1724setObjectDKhxnng(m1718constructorimpl2, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0), groupAnchor);
            if (operations3.pushedIntMask == operations3.createExpectedArgMask(postInsertNodeFixup.getInts()) && operations3.pushedObjectMask == operations3.createExpectedArgMask(postInsertNodeFixup.getObjects())) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int ints = postInsertNodeFixup.getInts();
            int i2 = 0;
            for (int i3 = 0; i3 < ints; i3++) {
                if (((1 << i3) & operations3.pushedIntMask) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(postInsertNodeFixup.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i3)));
                    i2++;
                }
            }
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            int objects = postInsertNodeFixup.getObjects();
            int i4 = 0;
            int i5 = 0;
            while (i5 < objects) {
                if (((1 << i5) & operations3.pushedObjectMask) != 0) {
                    if (i2 > 0) {
                        sb3.append(", ");
                    }
                    operations = operations3;
                    sb3.append(postInsertNodeFixup.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i5)));
                    i4++;
                } else {
                    operations = operations3;
                }
                i5++;
                operations3 = operations;
            }
            java.lang.String sb4 = sb3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new java.lang.IllegalStateException(("Error while pushing " + postInsertNodeFixup + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + sb2 + ") and " + i4 + " object arguments (" + sb4 + ").").toString());
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        int ints2 = insertNodeFixup.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints2; i7++) {
            if ((operations2.pushedIntMask & (1 << i7)) != 0) {
                if (i6 > 0) {
                    sb5.append(", ");
                }
                sb5.append(insertNodeFixup.mo1653intParamNamew8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i7)));
                i6++;
            }
        }
        java.lang.String sb6 = sb5.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb6, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int objects2 = insertNodeFixup.getObjects();
        int i8 = 0;
        int i9 = 0;
        while (i8 < objects2) {
            if (((1 << i8) & operations2.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    sb7.append(", ");
                }
                i = objects2;
                sb7.append(insertNodeFixup.mo1654objectParamName31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i8)));
                i9++;
            } else {
                i = objects2;
            }
            i8++;
            objects2 = i;
        }
        java.lang.String sb8 = sb7.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb8, "StringBuilder().apply(builderAction).toString()");
        throw new java.lang.IllegalStateException(("Error while pushing " + insertNodeFixup + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + sb6 + ") and " + i9 + " object arguments (" + sb8 + ").").toString());
    }

    public final void endNodeInsert() {
        if (this.pendingOperations.isNotEmpty()) {
            this.pendingOperations.popInto(this.operations);
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final <V, T> void updateNode(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
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

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public java.lang.String toDebugString(java.lang.String linePrefix) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.toDebugString(linePrefix));
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
