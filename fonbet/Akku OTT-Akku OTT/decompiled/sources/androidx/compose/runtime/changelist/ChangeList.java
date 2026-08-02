package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000eJ,\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010 \u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0007J \u0010#\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u0007J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\b\u0010\u0019\u001a\u0004\u0018\u00010!J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0007J\u0006\u0010)\u001a\u00020\u000eJ\u0006\u0010*\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010!J\u0006\u0010-\u001a\u00020\u000eJ\u000e\u0010.\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%J\u0006\u0010/\u001a\u00020\u000eJ\u0006\u00100\u001a\u00020\u000eJ\u0006\u00101\u001a\u00020\u000eJ\u0016\u00102\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u00103\u001a\u000204J\u001e\u00102\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u0007J\"\u00109\u001a\u00020\u000e2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000e0;2\u0006\u0010=\u001a\u00020<J\u0010\u0010>\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010!J>\u0010@\u001a\u00020\u000e\"\u0004\b\u0000\u0010A\"\u0004\b\u0001\u0010B2\u0006\u0010\u0019\u001a\u0002HB2\u001d\u0010C\u001a\u0019\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u00020\u000e0D¢\u0006\u0002\bE¢\u0006\u0002\u0010FJ\u0016\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u0007J\u001e\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007J\u000e\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u0007J\u000e\u0010N\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0007J\u001b\u0010O\u001a\u00020\u000e2\u000e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0Q¢\u0006\u0002\u0010RJ\u0014\u0010S\u001a\u00020\u000e2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0UJ\u0016\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020X2\u0006\u0010$\u001a\u00020%J\u001e\u0010Y\u001a\u00020\u000e2\u000e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0Z2\u0006\u0010[\u001a\u00020XJ(\u0010\\\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010^2\u0006\u0010_\u001a\u00020`2\u0006\u00103\u001a\u00020a2\u0006\u0010K\u001a\u00020aJ\u001e\u0010b\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020c2\u0006\u0010_\u001a\u00020`2\u0006\u0010d\u001a\u00020aJ\u0006\u0010e\u001a\u00020\u000eJ\u001a\u0010f\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020\u00002\n\b\u0002\u0010[\u001a\u0004\u0018\u00010XJ\u0010\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020iH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006k"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "size", "", "getSize", "()I", "isEmpty", "", "isNotEmpty", "clear", "", "executeAndFlushAllPendingChanges", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "errorContext", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "pushRemember", "value", "Landroidx/compose/runtime/RememberObserverHolder;", "pushRememberPausingScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "pushStartResumingScope", "pushEndResumingScope", "pushUpdateValue", "", "groupSlotIndex", "pushUpdateAnchoredValue", "anchor", "Landroidx/compose/runtime/Anchor;", "pushAppendValue", "pushTrimValues", "count", "pushResetSlots", "pushDeactivateCurrentGroup", "pushUpdateAuxData", "data", "pushEnsureRootStarted", "pushEnsureGroupStarted", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "pushInsertSlots", Constants.MessagePayloadKeys.FROM, "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "pushMoveCurrentGroup", "offset", "pushEndCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "pushUseNode", "node", "pushUpdateNode", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pushRemoveNode", "removeFrom", "moveCount", "pushMoveNode", "to", "pushAdvanceSlotsBy", "distance", "pushUps", "pushDowns", "nodes", "", "([Ljava/lang/Object;)V", "pushSideEffect", "effect", "Lkotlin/Function0;", "pushDetermineMovableContentNodeIndex", "effectiveNodeIndexOut", "Landroidx/compose/runtime/internal/IntRef;", "pushCopyNodesToNewAnchorLocation", "", "effectiveNodeIndex", "pushCopySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/MovableContentStateReference;", "pushReleaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushEndMovableContentPlacement", "pushExecuteOperationsIn", "changeList", "toDebugString", "", "linePrefix", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 8 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 27 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 28 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 29 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,338:1\n204#2,2:339\n207#2,2:342\n204#2,2:344\n207#2,2:347\n204#2,2:349\n207#2,2:352\n204#2,2:354\n207#2,2:357\n204#2,2:359\n360#2:372\n357#2:373\n207#2,2:375\n204#2,2:377\n360#2:393\n357#2:394\n207#2,2:396\n204#2,2:398\n207#2,2:404\n204#2,2:406\n360#2:418\n357#2:419\n207#2,2:421\n204#2,2:423\n207#2,2:426\n204#2,2:428\n207#2,2:431\n204#2,2:433\n207#2,2:439\n204#2,2:441\n207#2,2:446\n204#2,2:448\n360#2:460\n357#2:461\n207#2,2:463\n204#2,2:465\n207#2,2:469\n204#2,2:471\n207#2,2:477\n204#2,2:479\n357#2:495\n207#2,2:500\n204#2,2:502\n357#2:523\n207#2,2:529\n204#2,2:531\n360#2:543\n357#2:544\n207#2,2:546\n204#2,2:548\n360#2:560\n357#2:561\n207#2,2:563\n204#2,2:565\n207#2,2:568\n204#2,2:570\n207#2,2:573\n204#2,2:575\n207#2,2:579\n204#2,2:581\n207#2,2:585\n204#2,2:587\n207#2,2:593\n204#2,2:595\n207#2,2:600\n204#2,2:602\n207#2,2:606\n174#3:341\n194#4:346\n215#5:351\n236#6:356\n315#7:361\n318#7:362\n371#8,9:363\n380#8:374\n371#8,9:384\n380#8:395\n371#8,9:409\n380#8:420\n371#8,9:451\n380#8:462\n388#8,10:485\n398#8,4:496\n411#8,11:512\n422#8,5:524\n371#8,9:534\n380#8:545\n371#8,9:551\n380#8:562\n354#9,4:379\n360#9:383\n257#10,4:400\n286#11:408\n402#12:425\n433#13:430\n622#14,4:435\n655#15:443\n658#15:444\n661#15:445\n464#16:450\n506#17:467\n509#17:468\n544#18,4:473\n570#19,4:481\n597#20:504\n594#20,7:505\n131#21:533\n87#22:550\n107#23:567\n154#24:572\n807#25:577\n810#25:578\n843#26:583\n840#26:584\n872#27:589\n875#27:590\n881#27:591\n878#27:592\n943#28:597\n946#28:598\n949#28:599\n981#29:604\n984#29:605\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n98#1:339,2\n98#1:342,2\n102#1:344,2\n102#1:347,2\n106#1:349,2\n106#1:352,2\n110#1:354,2\n110#1:357,2\n114#1:359,2\n116#1:372\n116#1:373\n114#1:375,2\n121#1:377,2\n123#1:393\n123#1:394\n121#1:396,2\n128#1:398,2\n128#1:404,2\n134#1:406,2\n134#1:418\n134#1:419\n134#1:421,2\n146#1:423,2\n146#1:426,2\n154#1:428,2\n154#1:431,2\n170#1:433,2\n170#1:439,2\n176#1:441,2\n176#1:446,2\n189#1:448,2\n189#1:460\n189#1:461\n189#1:463,2\n193#1:465,2\n193#1:469,2\n210#1:471,2\n210#1:477,2\n217#1:479,2\n218#1:495\n217#1:500,2\n223#1:502,2\n224#1:523\n223#1:529,2\n229#1:531,2\n229#1:543\n229#1:544\n229#1:546,2\n233#1:548,2\n233#1:560\n233#1:561\n233#1:563,2\n238#1:565,2\n238#1:568,2\n243#1:570,2\n243#1:573,2\n247#1:575,2\n247#1:579,2\n259#1:581,2\n259#1:585,2\n277#1:587,2\n277#1:593,2\n297#1:595,2\n297#1:600,2\n315#1:602,2\n315#1:606,2\n98#1:341\n102#1:346\n106#1:351\n110#1:356\n115#1:361\n116#1:362\n116#1:363,9\n116#1:374\n123#1:384,9\n123#1:395\n134#1:409,9\n134#1:420\n189#1:451,9\n189#1:462\n218#1:485,10\n218#1:496,4\n224#1:512,11\n224#1:524,5\n229#1:534,9\n229#1:545\n233#1:551,9\n233#1:562\n122#1:379,4\n123#1:383\n129#1:400,4\n134#1:408\n146#1:425\n154#1:430\n171#1:435,4\n178#1:443\n180#1:444\n182#1:445\n189#1:450\n195#1:467\n197#1:468\n212#1:473,4\n218#1:481,4\n224#1:504\n224#1:505,7\n229#1:533\n233#1:550\n238#1:567\n243#1:572\n249#1:577\n251#1:578\n261#1:583\n263#1:584\n279#1:589\n281#1:590\n283#1:591\n285#1:592\n299#1:597\n301#1:598\n303#1:599\n317#1:604\n319#1:605\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i, Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slots, RememberManager rememberManager, OperationErrorContext errorContext) {
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager, errorContext);
    }

    public final int getSize() {
        return this.operations.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        m169constructorimpl.intArgs[m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts()] = distance;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushAppendValue(Anchor anchor, Object value) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations.WriteScope.m178setObjects4uCC6AY(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), anchor, Operation.ObjectParameter.m146constructorimpl(1), value);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m178setObjects4uCC6AY(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(1), nodes, Operation.ObjectParameter.m146constructorimpl(0), effectiveNodeIndex);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations.WriteScope.m179setObjectsOGa0p1M(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), resolvedState, Operation.ObjectParameter.m146constructorimpl(1), parentContext, Operation.ObjectParameter.m146constructorimpl(3), to, Operation.ObjectParameter.m146constructorimpl(2), from);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef effectiveNodeIndexOut, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m178setObjects4uCC6AY(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), effectiveNodeIndexOut, Operation.ObjectParameter.m146constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushDowns(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), nodes);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushEndCompositionScope(Function1<? super Composition, Unit> action, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m178setObjects4uCC6AY(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), action, Operation.ObjectParameter.m146constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), anchor);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations.WriteScope.m178setObjects4uCC6AY(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), changeList, Operation.ObjectParameter.m146constructorimpl(1), effectiveNodeIndex);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations.WriteScope.m178setObjects4uCC6AY(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), anchor, Operation.ObjectParameter.m146constructorimpl(1), from);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        m169constructorimpl.intArgs[m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts()] = offset;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        int ints = m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m169constructorimpl.intArgs;
        iArr[ints + 1] = to;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations.WriteScope.m180setObjectst7hvbck(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), composition, Operation.ObjectParameter.m146constructorimpl(1), parentContext, Operation.ObjectParameter.m146constructorimpl(2), reference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushRemember(RememberObserverHolder value) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), value);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        int ints = m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m169constructorimpl.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(Function0<Unit> effect) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), effect);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushTrimValues(int count) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        m169constructorimpl.intArgs[m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushUpdateAnchoredValue(Object value, Anchor anchor, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        Operations.WriteScope.m178setObjects4uCC6AY(m169constructorimpl, Operation.ObjectParameter.m146constructorimpl(0), value, Operation.ObjectParameter.m146constructorimpl(1), anchor);
        m169constructorimpl.intArgs[m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushUpdateAuxData(Object data) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m177setObjectDKhxnng(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), data);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final <T, V> void pushUpdateNode(V value, Function2<? super T, ? super V, Unit> block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        int m146constructorimpl = Operation.ObjectParameter.m146constructorimpl(0);
        int m146constructorimpl2 = Operation.ObjectParameter.m146constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m178setObjects4uCC6AY(m169constructorimpl, m146constructorimpl, value, m146constructorimpl2, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushUpdateValue(Object value, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        Operations.WriteScope.m177setObjectDKhxnng(m169constructorimpl, Operation.ObjectParameter.m146constructorimpl(0), value);
        m169constructorimpl.intArgs[m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUps(int count) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations m169constructorimpl = Operations.WriteScope.m169constructorimpl(operations);
        m169constructorimpl.intArgs[m169constructorimpl.intArgsSize - m169constructorimpl.opCodes[m169constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushUseNode(Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder c = androidx.browser.browseractions.a.c("ChangeList instance containing ");
        c.append(getSize());
        c.append(" operations");
        if (c.length() > 0) {
            c.append(":\n");
            c.append(this.operations.toDebugString(linePrefix));
        }
        String sb = c.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from, FixupList fixups) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m180setObjectst7hvbck(Operations.WriteScope.m169constructorimpl(operations), Operation.ObjectParameter.m146constructorimpl(0), anchor, Operation.ObjectParameter.m146constructorimpl(1), from, Operation.ObjectParameter.m146constructorimpl(2), fixups);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }
}
