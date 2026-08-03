package androidx.compose.runtime;

/* compiled from: Composition.kt */
@kotlin.Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002£\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010X\u001a\u00020\u0019H\u0002J\u001e\u0010Y\u001a\u00020\u00192\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010[\u001a\u00020\u0012H\u0002J\b\u0010\\\u001a\u00020\u0019H\u0016J\u0010\u0010]\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010^\u001a\u00020\u0019H\u0016J\b\u0010_\u001a\u00020\u0019H\u0016J\b\u0010`\u001a\u00020\u0019H\u0002J \u0010a\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001eJ \u0010c\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0002\u0010\u001eJ\b\u0010d\u001a\u00020\u0019H\u0016J3\u0010e\u001a\u0002Hf\"\u0004\b\u0000\u0010f2\b\u0010g\u001a\u0004\u0018\u00010\u00012\u0006\u0010h\u001a\u0002072\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hf0\u0018H\u0016¢\u0006\u0002\u0010jJ\b\u0010k\u001a\u00020\u0019H\u0016J\u0010\u0010l\u001a\u00020\u00192\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u00020\u0019H\u0002J\b\u0010p\u001a\u00020\u0019H\u0002J#\u0010q\u001a\u0004\u0018\u0001Hr\"\u0004\b\u0000\u0010r2\f\u0010s\u001a\b\u0012\u0004\u0012\u0002Hr0tH\u0016¢\u0006\u0002\u0010uJ\"\u0010v\u001a\u0002Hr\"\u0004\b\u0000\u0010r2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hr0\u0018H\u0082\b¢\u0006\u0002\u0010wJK\u0010x\u001a\u0002Hr\"\u0004\b\u0000\u0010r25\u0010i\u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010:09¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002Hr0yH\u0082\b¢\u0006\u0002\u0010|J&\u0010}\u001a\u00020\u00192\u001c\u0010~\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u007f0#H\u0016J\u001e\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020$2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\u0016J\t\u0010\u0085\u0001\u001a\u00020\u0019H\u0016J(\u0010\u0086\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020$2\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\u0002J\u000f\u0010\u0089\u0001\u001a\u00020\u00192\u0006\u0010s\u001a\u000207J\u0012\u0010\u008a\u0001\u001a\u00020\u00192\u0007\u0010\u008b\u0001\u001a\u00020*H\u0002J\u001a\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0000¢\u0006\u0003\b\u0090\u0001J\f\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0002J\u0017\u0010\u0091\u0001\u001a\u00020\u00122\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\u0017\u0010\u0092\u0001\u001a\u00020\u00192\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\t\u0010\u0093\u0001\u001a\u00020\u0012H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020\u00192\u0007\u0010\u0083\u0001\u001a\u00020$H\u0016J\u0017\u0010\u0095\u0001\u001a\u00020\u00192\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\u0012\u0010\u0096\u0001\u001a\u00020\u00192\u0007\u0010\u008b\u0001\u001a\u00020*H\u0016J\u0012\u0010\u0097\u0001\u001a\u00020\u00192\u0007\u0010\u008b\u0001\u001a\u00020*H\u0016J\u001b\u0010\u0098\u0001\u001a\u00020\u00192\n\u0010m\u001a\u0006\u0012\u0002\b\u00030/H\u0000¢\u0006\u0003\b\u0099\u0001J!\u0010\u009a\u0001\u001a\u00020\u00192\u0007\u0010\u0084\u0001\u001a\u00020*2\u0007\u0010\u0083\u0001\u001a\u00020$H\u0000¢\u0006\u0003\b\u009b\u0001J!\u0010\u009c\u0001\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001eJ!\u0010\u009d\u0001\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001eJ\u001d\u0010\u009e\u0001\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010:09H\u0002J#\u0010\u009f\u0001\u001a\u0002Hr\"\u0004\b\u0000\u0010r2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hr0\u0018H\u0082\b¢\u0006\u0002\u0010wJ\u001d\u0010 \u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020$2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\u0002J\u0011\u0010¡\u0001\u001a\u00020\u00192\u0006\u0010S\u001a\u00020TH\u0002J\t\u0010¢\u0001\u001a\u00020\u0019H\u0016JE\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020$\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020$\u0018\u0001`\u0010*\u0016\u0012\u0004\u0012\u00020$\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020$\u0018\u0001`\u00102\u0007\u0010\u008b\u0001\u001a\u00020*2\u0006\u0010[\u001a\u00020\u0012H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001e\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$0\u000ej\b\u0012\u0004\u0012\u00020$`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0018\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0014R\u0014\u00103\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0014R\u0010\u00105\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00108\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010:09X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0014R\u0014\u0010<\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0014R\u0011\u0010=\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0014R\u000e\u0010>\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020$0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020$0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020*0)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010,R\u0014\u0010D\u001a\u00020EX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010H\u001a\u00020\u0012X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0014\"\u0004\bL\u0010MR\"\u0010N\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010*0Oj\n\u0012\u0006\u0012\u0004\u0018\u00010*`PX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010J\u001a\u0004\bV\u0010W¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "derivedStateDependencies", "", "", "getDerivedStateDependencies$runtime_release", "()Ljava/util/Set;", "derivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime_release", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release$annotations", "()V", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", "values", "forgetConditionalScopes", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "composeInitial", "deactivate", "delegateInvalidations", "R", "to", "groupIndex", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "getCompositionService", "T", com.ironsource.X3.i.W, "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", "references", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", com.ironsource.C3232q2.p, "invalidateAll", "invalidateChecked", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "invalidateScopeOfLocked", "value", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observe$runtime_release", "observesAnyOf", "prepareCompose", "recompose", "recomposeScopeReleased", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime_release", "removeObservation", "removeObservation$runtime_release", "setContent", "setContentWithReuse", "takeInvalidations", "trackAbandonedValues", "tryImminentInvalidation", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionImpl implements androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ReusableComposition, androidx.compose.runtime.RecomposeScopeOwner, androidx.compose.runtime.CompositionServices {
    public static final int $stable = 8;
    private final kotlin.coroutines.CoroutineContext _recomposeContext;
    private final java.util.HashSet<androidx.compose.runtime.RememberObserver> abandonSet;
    private final androidx.compose.runtime.Applier<?> applier;
    private final androidx.compose.runtime.changelist.ChangeList changes;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composable;
    private final androidx.compose.runtime.ComposerImpl composer;
    private final java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> derivedStates;
    private boolean disposed;
    private androidx.compose.runtime.CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> invalidations;
    private final boolean isRoot;
    private final androidx.compose.runtime.changelist.ChangeList lateChanges;
    private final java.lang.Object lock;
    private final androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.RecomposeScopeImpl> observations;
    private final androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.RecomposeScopeImpl> observationsProcessed;
    private final androidx.compose.runtime.CompositionObserverHolder observerHolder;
    private final androidx.compose.runtime.CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> pendingModifications;
    private final androidx.compose.runtime.SlotTable slotTable;

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    public CompositionImpl(androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.Applier<?> applier, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.lock = new java.lang.Object();
        java.util.HashSet<androidx.compose.runtime.RememberObserver> hashSet = new java.util.HashSet<>();
        this.abandonSet = hashSet;
        androidx.compose.runtime.SlotTable slotTable = new androidx.compose.runtime.SlotTable();
        this.slotTable = slotTable;
        this.observations = new androidx.compose.runtime.collection.ScopeMap<>();
        this.conditionallyInvalidatedScopes = new java.util.HashSet<>();
        this.derivedStates = new androidx.compose.runtime.collection.ScopeMap<>();
        androidx.compose.runtime.changelist.ChangeList changeList = new androidx.compose.runtime.changelist.ChangeList();
        this.changes = changeList;
        androidx.compose.runtime.changelist.ChangeList changeList2 = new androidx.compose.runtime.changelist.ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = new androidx.compose.runtime.collection.ScopeMap<>();
        this.invalidations = new androidx.compose.runtime.collection.IdentityArrayMap<>(0, 1, null);
        this.observerHolder = new androidx.compose.runtime.CompositionObserverHolder(null, false, 3, null);
        androidx.compose.runtime.ComposerImpl composerImpl = new androidx.compose.runtime.ComposerImpl(applier, compositionContext, slotTable, hashSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof androidx.compose.runtime.Recomposer;
        this.composable = androidx.compose.runtime.ComposableSingletons$CompositionKt.INSTANCE.m1608getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.Applier applier, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }

    /* renamed from: getSlotTable$runtime_release, reason: from getter */
    public final androidx.compose.runtime.SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final java.util.Set<java.lang.Object> getObservedObjects$runtime_release() {
        return this.observations.getMap().asMap().keySet();
    }

    public final java.util.Set<java.lang.Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.getMap().asMap().keySet();
    }

    public final java.util.List<androidx.compose.runtime.RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return kotlin.collections.CollectionsKt.toList(this.conditionallyInvalidatedScopes);
    }

    /* renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    /* renamed from: getObserverHolder$runtime_release, reason: from getter */
    public final androidx.compose.runtime.CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    public final kotlin.coroutines.CoroutineContext getRecomposeContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getComposable() {
        return this.composable;
    }

    public final void setComposable(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        composeInitial(content);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    private final void composeInitial(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        if (!(!this.disposed)) {
            throw new java.lang.IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final androidx.compose.runtime.tooling.CompositionObserverHandle observe$runtime_release(final androidx.compose.runtime.tooling.CompositionObserver observer) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(observer);
            this.observerHolder.setRoot(true);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return new androidx.compose.runtime.tooling.CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                java.lang.Object obj;
                obj = androidx.compose.runtime.CompositionImpl.this.lock;
                androidx.compose.runtime.CompositionImpl compositionImpl = androidx.compose.runtime.CompositionImpl.this;
                androidx.compose.runtime.tooling.CompositionObserver compositionObserver = observer;
                synchronized (obj) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                        compositionImpl.getObserverHolder().setObserver(null);
                        compositionImpl.getObserverHolder().setRoot(false);
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
        };
    }

    public final void invalidateGroupsWithKey(int key) {
        java.util.List<androidx.compose.runtime.RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            for (int i = 0; i < size; i++) {
                if (invalidateGroupsWithKey$runtime_release.get(i).invalidateForResult(null) != androidx.compose.runtime.InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.pendingModifications;
        obj = androidx.compose.runtime.CompositionKt.PendingApplyNoModifications;
        java.lang.Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = androidx.compose.runtime.CompositionKt.PendingApplyNoModifications;
            if (kotlin.jvm.internal.Intrinsics.areEqual(andSet, obj2)) {
                androidx.compose.runtime.ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new kotlin.KotlinNothingValueException();
            }
            if (andSet instanceof java.util.Set) {
                addPendingInvalidationsLocked((java.util.Set) andSet, true);
                return;
            }
            if (!(andSet instanceof java.lang.Object[])) {
                androidx.compose.runtime.ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new kotlin.KotlinNothingValueException();
            }
            for (java.util.Set<? extends java.lang.Object> set : (java.util.Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        java.lang.Object obj;
        java.lang.Object andSet = this.pendingModifications.getAndSet(null);
        obj = androidx.compose.runtime.CompositionKt.PendingApplyNoModifications;
        if (kotlin.jvm.internal.Intrinsics.areEqual(andSet, obj)) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            addPendingInvalidationsLocked((java.util.Set) andSet, false);
            return;
        }
        if (andSet instanceof java.lang.Object[]) {
            for (java.util.Set<? extends java.lang.Object> set : (java.util.Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new kotlin.KotlinNothingValueException();
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> takeInvalidations = takeInvalidations();
                try {
                    androidx.compose.runtime.tooling.CompositionObserver observer = observer();
                    if (observer != null) {
                        java.util.Map<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> asMap = takeInvalidations.asMap();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        observer.onBeginComposition(this, asMap);
                    }
                    this.composer.composeContent$runtime_release(takeInvalidations, content);
                    if (observer != null) {
                        observer.onEndComposition(this);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                } catch (java.lang.Exception e) {
                    this.invalidations = takeInvalidations;
                    throw e;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!(!this.composer.getIsComposing())) {
                throw new java.lang.IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
            }
            if (!this.disposed) {
                this.disposed = true;
                this.composable = androidx.compose.runtime.ComposableSingletons$CompositionKt.INSTANCE.m1609getLambda2$runtime_release();
                androidx.compose.runtime.changelist.ChangeList deferredChanges = this.composer.getDeferredChanges();
                if (deferredChanges != null) {
                    applyChangesInLocked(deferredChanges);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    androidx.compose.runtime.CompositionImpl.RememberEventDispatcher rememberEventDispatcher = new androidx.compose.runtime.CompositionImpl.RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        this.applier.onBeginChanges();
                        androidx.compose.runtime.SlotWriter openWriter = this.slotTable.openWriter();
                        try {
                            androidx.compose.runtime.ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            openWriter.close();
                            this.applier.clear();
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (java.lang.Throwable th) {
                            openWriter.close();
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize() > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(java.util.Set<? extends java.lang.Object> values) {
        java.lang.Object obj;
        java.util.Set<? extends java.lang.Object> set;
        java.lang.Object obj2;
        do {
            obj = this.pendingModifications.get();
            if (obj != null) {
                obj2 = androidx.compose.runtime.CompositionKt.PendingApplyNoModifications;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                    if (obj instanceof java.util.Set) {
                        set = new java.util.Set[]{obj, values};
                    } else {
                        if (!(obj instanceof java.lang.Object[])) {
                            throw new java.lang.IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                        set = kotlin.collections.ArraysKt.plus((java.util.Set<? extends java.lang.Object>[]) obj, values);
                    }
                }
            }
            set = values;
        } while (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.pendingModifications, obj, set));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> values) {
        if (values instanceof androidx.compose.runtime.collection.IdentityArraySet) {
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet = (androidx.compose.runtime.collection.IdentityArraySet) values;
            java.lang.Object[] values2 = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = values2[i];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                    return true;
                }
            }
            return false;
        }
        for (java.lang.Object obj2 : values) {
            if (this.observations.contains(obj2) || this.derivedStates.contains(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        this.composer.prepareCompose$runtime_release(block);
    }

    private final java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> addPendingInvalidationsLocked(java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> hashSet, java.lang.Object obj, boolean z) {
        java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> hashSet2;
        java.lang.Object obj2 = this.observations.getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof androidx.collection.MutableScatterSet) {
                androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj2;
                java.lang.Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    hashSet2 = hashSet;
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) objArr[(i << 3) + i3];
                                    if (!this.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != androidx.compose.runtime.InvalidationResult.IGNORED) {
                                        if (recomposeScopeImpl.isConditional() && !z) {
                                            this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                        } else {
                                            if (hashSet2 == null) {
                                                hashSet2 = new java.util.HashSet<>();
                                            }
                                            hashSet2.add(recomposeScopeImpl);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                } else {
                    hashSet2 = hashSet;
                }
                return hashSet2;
            }
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj2;
            if (!this.observationsProcessed.remove(obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != androidx.compose.runtime.InvalidationResult.IGNORED) {
                if (recomposeScopeImpl2.isConditional() && !z) {
                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                } else {
                    java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> hashSet3 = hashSet == null ? new java.util.HashSet<>() : hashSet;
                    hashSet3.add(recomposeScopeImpl2);
                    return hashSet3;
                }
            }
        }
        return hashSet;
    }

    private final void cleanUpDerivedStateObservations() {
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> map = this.derivedStates.getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                char c = 7;
                long j3 = -9187201950435737472L;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            java.lang.Object obj = map.keys[i6];
                            java.lang.Object obj2 = map.values[i6];
                            if (obj2 instanceof androidx.collection.MutableScatterSet) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj2;
                                java.lang.Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i = length;
                                if (length2 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j4 = jArr4[i7];
                                        i2 = i4;
                                        long[] jArr5 = jArr4;
                                        j = -9187201950435737472L;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j4 & 255) < 128) {
                                                    int i10 = (i7 << 3) + i9;
                                                    objArr2 = objArr3;
                                                    if (!this.observations.contains((androidx.compose.runtime.DerivedState) objArr3[i10])) {
                                                        mutableScatterSet.removeElementAt(i10);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j4 >>= 8;
                                                i9++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i8 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i7 == length2) {
                                            break;
                                        }
                                        i7++;
                                        c = 7;
                                        i4 = i2;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i2 = i4;
                                    j = -9187201950435737472L;
                                }
                                if (!mutableScatterSet.isEmpty()) {
                                }
                                map.removeValueAt(i6);
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i4;
                                j = j3;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (this.observations.contains((androidx.compose.runtime.DerivedState) obj2)) {
                                }
                                map.removeValueAt(i6);
                            }
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i4;
                            j = j3;
                        }
                        j2 >>= 8;
                        i5++;
                        j3 = j;
                        jArr3 = jArr2;
                        length = i;
                        i4 = i2;
                        c = 7;
                    }
                    jArr = jArr3;
                    int i11 = length;
                    if (i4 != 8) {
                        break;
                    } else {
                        length = i11;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr3 = jArr;
            }
        }
        if (!this.conditionallyInvalidatedScopes.isEmpty()) {
            java.util.Iterator<androidx.compose.runtime.RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
            while (it.hasNext()) {
                if (!it.next().isConditional()) {
                    it.remove();
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(java.lang.Object value) {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(value)) {
            return;
        }
        if (value instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
            androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
            ((androidx.compose.runtime.snapshots.StateObjectImpl) value).m1747recordReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(1));
        }
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (!(value instanceof androidx.compose.runtime.DerivedState)) {
            return;
        }
        this.derivedStates.removeScope(value);
        androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies = ((androidx.compose.runtime.DerivedState) value).getCurrentRecord().getDependencies();
        java.lang.Object[] objArr = dependencies.keys;
        long[] jArr = dependencies.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.compose.runtime.snapshots.StateObject stateObject = (androidx.compose.runtime.snapshots.StateObject) objArr[(i << 3) + i3];
                        if (stateObject instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                            androidx.compose.runtime.snapshots.ReaderKind.Companion companion2 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                            ((androidx.compose.runtime.snapshots.StateObjectImpl) stateObject).m1747recordReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(1));
                        }
                        this.derivedStates.add(stateObject, value);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void invalidateScopeOfLocked(java.lang.Object value) {
        java.lang.Object obj = this.observations.getMap().get(value);
        if (obj == null) {
            return;
        }
        if (obj instanceof androidx.collection.MutableScatterSet) {
            androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj;
            java.lang.Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (recomposeScopeImpl.invalidateForResult(value) == androidx.compose.runtime.InvalidationResult.IMMINENT) {
                                this.observationsProcessed.add(value, recomposeScopeImpl);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj;
            if (recomposeScopeImpl2.invalidateForResult(value) == androidx.compose.runtime.InvalidationResult.IMMINENT) {
                this.observationsProcessed.add(value, recomposeScopeImpl2);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(java.lang.Object value) {
        synchronized (this.lock) {
            invalidateScopeOfLocked(value);
            java.lang.Object obj = this.derivedStates.getMap().get(value);
            if (obj != null) {
                if (!(obj instanceof androidx.collection.MutableScatterSet)) {
                    invalidateScopeOfLocked((androidx.compose.runtime.DerivedState) obj);
                } else {
                    androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj;
                    java.lang.Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        invalidateScopeOfLocked((androidx.compose.runtime.DerivedState) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> takeInvalidations = takeInvalidations();
                try {
                    androidx.compose.runtime.tooling.CompositionObserver observer = observer();
                    if (observer != null) {
                        java.util.Map<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> asMap = takeInvalidations.asMap();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        observer.onBeginComposition(this, asMap);
                    }
                    recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations);
                    if (!recompose$runtime_release) {
                        drainPendingModificationsLocked();
                    }
                    if (observer != null) {
                        observer.onEndComposition(this);
                    }
                } catch (java.lang.Exception e) {
                    this.invalidations = takeInvalidations;
                    throw e;
                }
            } finally {
            }
        }
        return recompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(androidx.compose.runtime.MovableContentState state) {
        androidx.compose.runtime.CompositionImpl.RememberEventDispatcher rememberEventDispatcher = new androidx.compose.runtime.CompositionImpl.RememberEventDispatcher(this.abandonSet);
        androidx.compose.runtime.SlotWriter openWriter = state.getSlotTable().openWriter();
        try {
            androidx.compose.runtime.ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            openWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (java.lang.Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList changes) {
        androidx.compose.runtime.CompositionImpl.RememberEventDispatcher rememberEventDispatcher;
        androidx.compose.runtime.CompositionImpl.RememberEventDispatcher rememberEventDispatcher2;
        long[] jArr;
        int i;
        androidx.compose.runtime.CompositionImpl.RememberEventDispatcher rememberEventDispatcher3;
        long[] jArr2;
        int i2;
        int i3;
        long j;
        long[] jArr3;
        long[] jArr4;
        androidx.compose.runtime.CompositionImpl compositionImpl = this;
        androidx.compose.runtime.CompositionImpl.RememberEventDispatcher rememberEventDispatcher4 = new androidx.compose.runtime.CompositionImpl.RememberEventDispatcher(compositionImpl.abandonSet);
        try {
            if (!changes.isEmpty()) {
                java.lang.Object beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:applyChanges");
                try {
                    compositionImpl.applier.onBeginChanges();
                    androidx.compose.runtime.SlotWriter openWriter = compositionImpl.slotTable.openWriter();
                    try {
                        changes.executeAndFlushAllPendingChanges(compositionImpl.applier, openWriter, rememberEventDispatcher4);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        openWriter.close();
                        compositionImpl.applier.onEndChanges();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection);
                        rememberEventDispatcher4.dispatchRememberObservers();
                        rememberEventDispatcher4.dispatchSideEffects();
                        if (compositionImpl.pendingInvalidScopes) {
                            try {
                                java.lang.Object beginSection2 = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:unobserve");
                                try {
                                    try {
                                        compositionImpl.pendingInvalidScopes = false;
                                        androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> map = compositionImpl.observations.getMap();
                                        long[] jArr5 = map.metadata;
                                        int length = jArr5.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j2 = jArr5[i4];
                                                long j3 = -9187201950435737472L;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i6 = 0;
                                                    while (i6 < i5) {
                                                        if ((j2 & 255) < 128) {
                                                            int i7 = (i4 << 3) + i6;
                                                            java.lang.Object obj = map.keys[i7];
                                                            java.lang.Object obj2 = map.values[i7];
                                                            if (obj2 instanceof androidx.collection.MutableScatterSet) {
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                                                androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj2;
                                                                java.lang.Object[] objArr = mutableScatterSet.elements;
                                                                long[] jArr6 = mutableScatterSet.metadata;
                                                                int length2 = jArr6.length - 2;
                                                                rememberEventDispatcher3 = rememberEventDispatcher4;
                                                                jArr2 = jArr5;
                                                                if (length2 >= 0) {
                                                                    int i8 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j4 = jArr6[i8];
                                                                            i2 = length;
                                                                            i3 = i4;
                                                                            j = -9187201950435737472L;
                                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                                                int i10 = 0;
                                                                                while (i10 < i9) {
                                                                                    if ((j4 & 255) < 128) {
                                                                                        jArr4 = jArr6;
                                                                                        int i11 = (i8 << 3) + i10;
                                                                                        if (!((androidx.compose.runtime.RecomposeScopeImpl) objArr[i11]).getValid()) {
                                                                                            mutableScatterSet.removeElementAt(i11);
                                                                                        }
                                                                                    } else {
                                                                                        jArr4 = jArr6;
                                                                                    }
                                                                                    j4 >>= 8;
                                                                                    i10++;
                                                                                    jArr6 = jArr4;
                                                                                }
                                                                                jArr3 = jArr6;
                                                                                if (i9 != 8) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr6;
                                                                            }
                                                                            if (i8 == length2) {
                                                                                break;
                                                                            }
                                                                            i8++;
                                                                            length = i2;
                                                                            i4 = i3;
                                                                            jArr6 = jArr3;
                                                                        } catch (java.lang.Throwable th) {
                                                                            th = th;
                                                                            androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection2);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i2 = length;
                                                                    i3 = i4;
                                                                    j = -9187201950435737472L;
                                                                }
                                                                if (mutableScatterSet.isEmpty()) {
                                                                    map.removeValueAt(i7);
                                                                }
                                                            } else {
                                                                rememberEventDispatcher3 = rememberEventDispatcher4;
                                                                jArr2 = jArr5;
                                                                i2 = length;
                                                                i3 = i4;
                                                                j = -9187201950435737472L;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                                                if (((androidx.compose.runtime.RecomposeScopeImpl) obj2).getValid()) {
                                                                }
                                                                map.removeValueAt(i7);
                                                            }
                                                        } else {
                                                            rememberEventDispatcher3 = rememberEventDispatcher4;
                                                            jArr2 = jArr5;
                                                            i2 = length;
                                                            i3 = i4;
                                                            j = j3;
                                                        }
                                                        j2 >>= 8;
                                                        i6++;
                                                        j3 = j;
                                                        jArr5 = jArr2;
                                                        rememberEventDispatcher4 = rememberEventDispatcher3;
                                                        length = i2;
                                                        i4 = i3;
                                                    }
                                                    rememberEventDispatcher2 = rememberEventDispatcher4;
                                                    jArr = jArr5;
                                                    int i12 = length;
                                                    int i13 = i4;
                                                    if (i5 != 8) {
                                                        break;
                                                    }
                                                    length = i12;
                                                    i = i13;
                                                } else {
                                                    rememberEventDispatcher2 = rememberEventDispatcher4;
                                                    jArr = jArr5;
                                                    i = i4;
                                                }
                                                if (i == length) {
                                                    break;
                                                }
                                                i4 = i + 1;
                                                jArr5 = jArr;
                                                rememberEventDispatcher4 = rememberEventDispatcher2;
                                            }
                                        } else {
                                            rememberEventDispatcher2 = rememberEventDispatcher4;
                                        }
                                        cleanUpDerivedStateObservations();
                                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                        androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection2);
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    compositionImpl = this;
                                    if (compositionImpl.lateChanges.isEmpty()) {
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                rememberEventDispatcher = rememberEventDispatcher4;
                            }
                        } else {
                            rememberEventDispatcher2 = rememberEventDispatcher4;
                        }
                        if (this.lateChanges.isEmpty()) {
                            rememberEventDispatcher2.dispatchAbandons();
                        }
                    } catch (java.lang.Throwable th5) {
                        rememberEventDispatcher = rememberEventDispatcher4;
                        try {
                            openWriter.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            try {
                                androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection);
                                throw th;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                if (compositionImpl.lateChanges.isEmpty()) {
                                    rememberEventDispatcher.dispatchAbandons();
                                }
                                throw th;
                            }
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    rememberEventDispatcher = rememberEventDispatcher4;
                }
            } else if (compositionImpl.lateChanges.isEmpty()) {
                rememberEventDispatcher4.dispatchAbandons();
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            rememberEventDispatcher = rememberEventDispatcher4;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new androidx.compose.runtime.CompositionImpl.RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
            }
        }
    }

    private final <T> T guardInvalidationsLocked(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>>, ? extends T> block) {
        androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> takeInvalidations = takeInvalidations();
        try {
            return block.invoke(takeInvalidations);
        } catch (java.lang.Exception e) {
            this.invalidations = takeInvalidations;
            throw e;
        }
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (java.lang.Object obj : this.slotTable.getSlots()) {
                androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = obj instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(androidx.compose.runtime.ControlledComposition to, int groupIndex, kotlin.jvm.functions.Function0<? extends R> block) {
        if (to != null && !kotlin.jvm.internal.Intrinsics.areEqual(to, this) && groupIndex >= 0) {
            this.invalidationDelegate = (androidx.compose.runtime.CompositionImpl) to;
            this.invalidationDelegateGroup = groupIndex;
            try {
                return block.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return block.invoke();
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public androidx.compose.runtime.InvalidationResult invalidate(androidx.compose.runtime.RecomposeScopeImpl scope, java.lang.Object instance) {
        androidx.compose.runtime.CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        androidx.compose.runtime.Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return androidx.compose.runtime.InvalidationResult.IGNORED;
        }
        if (!this.slotTable.ownsAnchor(anchor)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            if (compositionImpl != null && compositionImpl.tryImminentInvalidation(scope, instance)) {
                return androidx.compose.runtime.InvalidationResult.IMMINENT;
            }
            return androidx.compose.runtime.InvalidationResult.IGNORED;
        }
        if (!scope.getCanRecompose()) {
            return androidx.compose.runtime.InvalidationResult.IGNORED;
        }
        return invalidateChecked(scope, anchor, instance);
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(androidx.compose.runtime.RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(androidx.compose.runtime.CompositionServiceKey<T> key) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.runtime.CompositionKt.getCompositionImplServiceKey())) {
            return (T) this;
        }
        return null;
    }

    private final boolean tryImminentInvalidation(androidx.compose.runtime.RecomposeScopeImpl scope, java.lang.Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance);
    }

    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl scope, androidx.compose.runtime.Anchor anchor, java.lang.Object instance) {
        synchronized (this.lock) {
            androidx.compose.runtime.CompositionImpl compositionImpl = this.invalidationDelegate;
            if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                compositionImpl = null;
            }
            if (compositionImpl == null) {
                if (tryImminentInvalidation(scope, instance)) {
                    return androidx.compose.runtime.InvalidationResult.IMMINENT;
                }
                if (instance != null) {
                    androidx.compose.runtime.CompositionKt.addValue(this.invalidations, scope, instance);
                } else {
                    this.invalidations.set(scope, null);
                }
            }
            if (compositionImpl != null) {
                return compositionImpl.invalidateChecked(scope, anchor, instance);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? androidx.compose.runtime.InvalidationResult.DEFERRED : androidx.compose.runtime.InvalidationResult.SCHEDULED;
        }
    }

    public final void removeObservation$runtime_release(java.lang.Object instance, androidx.compose.runtime.RecomposeScopeImpl scope) {
        this.observations.remove(instance, scope);
    }

    public final void removeDerivedStateObservation$runtime_release(androidx.compose.runtime.DerivedState<?> state) {
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    private final androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> takeInvalidations() {
        androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> identityArrayMap = this.invalidations;
        this.invalidations = new androidx.compose.runtime.collection.IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final void validateRecomposeScopeAnchors(androidx.compose.runtime.SlotTable slotTable) {
        java.lang.Object[] slots = slotTable.getSlots();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : slots) {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = obj instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) arrayList2.get(i);
            androidx.compose.runtime.Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new java.lang.IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + kotlin.collections.ArraysKt.indexOf((androidx.compose.runtime.RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    private final <T> T trackAbandonedValues(kotlin.jvm.functions.Function0<? extends T> block) {
        try {
            T invoke = block.invoke();
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new androidx.compose.runtime.CompositionImpl.RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final androidx.compose.runtime.tooling.CompositionObserver observer() {
        androidx.compose.runtime.CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        androidx.compose.runtime.CompositionObserverHolder observerHolder = this.parent.getObserverHolder();
        androidx.compose.runtime.tooling.CompositionObserver observer = observerHolder != null ? observerHolder.getObserver() : null;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    /* compiled from: Composition.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "forgetting", "", "", "releasing", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "remembering", "sideEffects", "Lkotlin/Function0;", "", "deactivating", com.ironsource.C3232q2.p, "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RememberEventDispatcher implements androidx.compose.runtime.RememberManager {
        private final java.util.Set<androidx.compose.runtime.RememberObserver> abandoning;
        private androidx.collection.MutableScatterSet<androidx.compose.runtime.ComposeNodeLifecycleCallback> releasing;
        private final java.util.List<androidx.compose.runtime.RememberObserver> remembering = new java.util.ArrayList();
        private final java.util.List<java.lang.Object> forgetting = new java.util.ArrayList();
        private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> sideEffects = new java.util.ArrayList();

        public RememberEventDispatcher(java.util.Set<androidx.compose.runtime.RememberObserver> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(androidx.compose.runtime.RememberObserver instance) {
            this.remembering.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(androidx.compose.runtime.RememberObserver instance) {
            this.forgetting.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
            this.sideEffects.add(effect);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(androidx.compose.runtime.ComposeNodeLifecycleCallback instance) {
            this.forgetting.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(androidx.compose.runtime.ComposeNodeLifecycleCallback instance) {
            androidx.collection.MutableScatterSet<androidx.compose.runtime.ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
            if (mutableScatterSet == null) {
                mutableScatterSet = androidx.collection.ScatterSetKt.mutableScatterSetOf();
                this.releasing = mutableScatterSet;
            }
            mutableScatterSet.plusAssign((androidx.collection.MutableScatterSet<androidx.compose.runtime.ComposeNodeLifecycleCallback>) instance);
            this.forgetting.add(instance);
        }

        public final void dispatchRememberObservers() {
            java.lang.Object beginSection;
            if (!this.forgetting.isEmpty()) {
                beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    androidx.collection.ScatterSet scatterSet = this.releasing;
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        java.lang.Object obj = this.forgetting.get(size);
                        kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.abandoning).remove(obj);
                        if (obj instanceof androidx.compose.runtime.RememberObserver) {
                            ((androidx.compose.runtime.RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
                            if (scatterSet != null && scatterSet.contains(obj)) {
                                ((androidx.compose.runtime.ComposeNodeLifecycleCallback) obj).onRelease();
                            } else {
                                ((androidx.compose.runtime.ComposeNodeLifecycleCallback) obj).onDeactivate();
                            }
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    java.util.List<androidx.compose.runtime.RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        androidx.compose.runtime.RememberObserver rememberObserver = list.get(i);
                        this.abandoning.remove(rememberObserver);
                        rememberObserver.onRemembered();
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } finally {
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                java.lang.Object beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> list = this.sideEffects;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.sideEffects.clear();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                java.lang.Object beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    java.util.Iterator<androidx.compose.runtime.RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        androidx.compose.runtime.RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        boolean z = this.slotTable.getGroupsSize() > 0;
        if (z || (true ^ this.abandonSet.isEmpty())) {
            java.lang.Object beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:deactivate");
            try {
                androidx.compose.runtime.CompositionImpl.RememberEventDispatcher rememberEventDispatcher = new androidx.compose.runtime.CompositionImpl.RememberEventDispatcher(this.abandonSet);
                if (z) {
                    this.applier.onBeginChanges();
                    androidx.compose.runtime.SlotWriter openWriter = this.slotTable.openWriter();
                    try {
                        androidx.compose.runtime.ComposerKt.deactivateCurrentGroup(openWriter, rememberEventDispatcher);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        openWriter.close();
                        this.applier.onEndChanges();
                        rememberEventDispatcher.dispatchRememberObservers();
                    } catch (java.lang.Throwable th) {
                        openWriter.close();
                        throw th;
                    }
                }
                rememberEventDispatcher.dispatchAbandons();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
                androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection);
            }
        }
        this.observations.clear();
        this.derivedStates.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.composer.deactivate$runtime_release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        if (r14.isEmpty() != false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> values, boolean forgetConditionalScopes) {
        java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> hashSet;
        long[] jArr;
        java.lang.String str;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        java.lang.String str2;
        int i4;
        boolean contains;
        java.lang.Object[] objArr;
        long[] jArr3;
        java.lang.Object[] objArr2;
        long[] jArr4;
        java.lang.String str3;
        long[] jArr5;
        int i5;
        java.lang.String str4;
        long[] jArr6;
        int i6;
        int i7;
        int i8;
        int i9;
        java.lang.Object[] objArr3;
        long[] jArr7;
        java.lang.Object[] objArr4;
        long[] jArr8;
        char c = 7;
        long j = -9187201950435737472L;
        java.lang.Object obj = null;
        if (values instanceof androidx.compose.runtime.collection.IdentityArraySet) {
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet = (androidx.compose.runtime.collection.IdentityArraySet) values;
            java.lang.Object[] values2 = identityArraySet.getValues();
            int size = identityArraySet.size();
            hashSet = null;
            int i10 = 0;
            while (i10 < size) {
                java.lang.Object obj2 = values2[i10];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj2 instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                    ((androidx.compose.runtime.RecomposeScopeImpl) obj2).invalidateForResult(obj);
                } else {
                    java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> addPendingInvalidationsLocked = addPendingInvalidationsLocked(hashSet, obj2, forgetConditionalScopes);
                    java.lang.Object obj3 = this.derivedStates.getMap().get(obj2);
                    if (obj3 != null) {
                        if (obj3 instanceof androidx.collection.MutableScatterSet) {
                            androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj3;
                            java.lang.Object[] objArr5 = mutableScatterSet.elements;
                            long[] jArr9 = mutableScatterSet.metadata;
                            int length = jArr9.length - 2;
                            if (length >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j2 = jArr9[i11];
                                    int i12 = i11;
                                    if ((((~j2) << 7) & j2 & j) != j) {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j2 & 255) < 128) {
                                                addPendingInvalidationsLocked = addPendingInvalidationsLocked(addPendingInvalidationsLocked, (androidx.compose.runtime.DerivedState) objArr5[(i12 << 3) + i14], forgetConditionalScopes);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 == length) {
                                        break;
                                    }
                                    i11 = i12 + 1;
                                    j = -9187201950435737472L;
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked = addPendingInvalidationsLocked(addPendingInvalidationsLocked, (androidx.compose.runtime.DerivedState) obj3, forgetConditionalScopes);
                        }
                    }
                    hashSet = addPendingInvalidationsLocked;
                }
                i10++;
                j = -9187201950435737472L;
                obj = null;
            }
        } else {
            hashSet = null;
            for (java.lang.Object obj4 : values) {
                if (obj4 instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                    ((androidx.compose.runtime.RecomposeScopeImpl) obj4).invalidateForResult(null);
                } else {
                    java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> addPendingInvalidationsLocked2 = addPendingInvalidationsLocked(hashSet, obj4, forgetConditionalScopes);
                    java.lang.Object obj5 = this.derivedStates.getMap().get(obj4);
                    if (obj5 != null) {
                        if (obj5 instanceof androidx.collection.MutableScatterSet) {
                            androidx.collection.MutableScatterSet mutableScatterSet2 = (androidx.collection.MutableScatterSet) obj5;
                            java.lang.Object[] objArr6 = mutableScatterSet2.elements;
                            long[] jArr10 = mutableScatterSet2.metadata;
                            int length2 = jArr10.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j3 = jArr10[i15];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j3 & 255) < 128) {
                                                addPendingInvalidationsLocked2 = addPendingInvalidationsLocked(addPendingInvalidationsLocked2, (androidx.compose.runtime.DerivedState) objArr6[(i15 << 3) + i17], forgetConditionalScopes);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                    }
                                    if (i15 == length2) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        } else {
                            hashSet = addPendingInvalidationsLocked(addPendingInvalidationsLocked2, (androidx.compose.runtime.DerivedState) obj5, forgetConditionalScopes);
                        }
                    }
                    hashSet = addPendingInvalidationsLocked2;
                }
            }
        }
        java.lang.String str5 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
        if (!forgetConditionalScopes || !(!this.conditionallyInvalidatedScopes.isEmpty())) {
            java.lang.String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
            if (hashSet != null) {
                androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> map = this.observations.getMap();
                long[] jArr11 = map.metadata;
                int length3 = jArr11.length - 2;
                if (length3 >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j4 = jArr11[i18];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                            int i20 = 0;
                            while (i20 < i19) {
                                if ((j4 & 255) < 128) {
                                    int i21 = (i18 << 3) + i20;
                                    java.lang.Object obj6 = map.keys[i21];
                                    java.lang.Object obj7 = map.values[i21];
                                    if (obj7 instanceof androidx.collection.MutableScatterSet) {
                                        java.lang.String str7 = str6;
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj7, str7);
                                        androidx.collection.MutableScatterSet mutableScatterSet3 = (androidx.collection.MutableScatterSet) obj7;
                                        java.lang.Object[] objArr7 = mutableScatterSet3.elements;
                                        long[] jArr12 = mutableScatterSet3.metadata;
                                        int length4 = jArr12.length - 2;
                                        jArr2 = jArr11;
                                        i2 = length3;
                                        i3 = i18;
                                        if (length4 >= 0) {
                                            int i22 = 0;
                                            while (true) {
                                                long j5 = jArr12[i22];
                                                str2 = str7;
                                                i4 = i19;
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i23 = 8 - ((~(i22 - length4)) >>> 31);
                                                    int i24 = 0;
                                                    while (i24 < i23) {
                                                        if ((j5 & 255) < 128) {
                                                            jArr4 = jArr12;
                                                            int i25 = (i22 << 3) + i24;
                                                            objArr2 = objArr7;
                                                            if (hashSet.contains((androidx.compose.runtime.RecomposeScopeImpl) objArr7[i25])) {
                                                                mutableScatterSet3.removeElementAt(i25);
                                                            }
                                                        } else {
                                                            objArr2 = objArr7;
                                                            jArr4 = jArr12;
                                                        }
                                                        j5 >>= 8;
                                                        i24++;
                                                        jArr12 = jArr4;
                                                        objArr7 = objArr2;
                                                    }
                                                    objArr = objArr7;
                                                    jArr3 = jArr12;
                                                    if (i23 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr = objArr7;
                                                    jArr3 = jArr12;
                                                }
                                                if (i22 == length4) {
                                                    break;
                                                }
                                                i22++;
                                                i19 = i4;
                                                str7 = str2;
                                                jArr12 = jArr3;
                                                objArr7 = objArr;
                                            }
                                        } else {
                                            str2 = str7;
                                            i4 = i19;
                                        }
                                        contains = mutableScatterSet3.isEmpty();
                                    } else {
                                        jArr2 = jArr11;
                                        i2 = length3;
                                        i3 = i18;
                                        str2 = str6;
                                        i4 = i19;
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                        contains = hashSet.contains((androidx.compose.runtime.RecomposeScopeImpl) obj7);
                                    }
                                    if (contains) {
                                        map.removeValueAt(i21);
                                    }
                                } else {
                                    jArr2 = jArr11;
                                    i2 = length3;
                                    i3 = i18;
                                    str2 = str6;
                                    i4 = i19;
                                }
                                j4 >>= 8;
                                i20++;
                                length3 = i2;
                                i18 = i3;
                                jArr11 = jArr2;
                                i19 = i4;
                                str6 = str2;
                            }
                            jArr = jArr11;
                            int i26 = length3;
                            int i27 = i18;
                            str = str6;
                            if (i19 != 8) {
                                break;
                            }
                            length3 = i26;
                            i = i27;
                        } else {
                            jArr = jArr11;
                            str = str6;
                            i = i18;
                        }
                        if (i == length3) {
                            break;
                        }
                        i18 = i + 1;
                        jArr11 = jArr;
                        str6 = str;
                    }
                }
                cleanUpDerivedStateObservations();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                return;
            }
            return;
        }
        androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> map2 = this.observations.getMap();
        long[] jArr13 = map2.metadata;
        int length5 = jArr13.length - 2;
        if (length5 >= 0) {
            int i28 = 0;
            while (true) {
                long j6 = jArr13[i28];
                if ((((~j6) << c) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i29 = 8 - ((~(i28 - length5)) >>> 31);
                    int i30 = 0;
                    while (i30 < i29) {
                        if ((j6 & 255) < 128) {
                            int i31 = (i28 << 3) + i30;
                            java.lang.Object obj8 = map2.keys[i31];
                            java.lang.Object obj9 = map2.values[i31];
                            if (obj9 instanceof androidx.collection.MutableScatterSet) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj9, str5);
                                androidx.collection.MutableScatterSet mutableScatterSet4 = (androidx.collection.MutableScatterSet) obj9;
                                java.lang.Object[] objArr8 = mutableScatterSet4.elements;
                                long[] jArr14 = mutableScatterSet4.metadata;
                                jArr6 = jArr13;
                                int length6 = jArr14.length - 2;
                                str4 = str5;
                                i6 = length5;
                                i7 = i28;
                                if (length6 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j7 = jArr14[i32];
                                        i8 = i29;
                                        i9 = i30;
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length6)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j7 & 255) < 128) {
                                                    jArr8 = jArr14;
                                                    int i35 = (i32 << 3) + i34;
                                                    objArr4 = objArr8;
                                                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) objArr8[i35];
                                                    if (this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl) || (hashSet != null && hashSet.contains(recomposeScopeImpl))) {
                                                        mutableScatterSet4.removeElementAt(i35);
                                                    }
                                                } else {
                                                    objArr4 = objArr8;
                                                    jArr8 = jArr14;
                                                }
                                                j7 >>= 8;
                                                i34++;
                                                jArr14 = jArr8;
                                                objArr8 = objArr4;
                                            }
                                            objArr3 = objArr8;
                                            jArr7 = jArr14;
                                            if (i33 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr3 = objArr8;
                                            jArr7 = jArr14;
                                        }
                                        if (i32 == length6) {
                                            break;
                                        }
                                        i32++;
                                        i29 = i8;
                                        i30 = i9;
                                        jArr14 = jArr7;
                                        objArr8 = objArr3;
                                    }
                                } else {
                                    i8 = i29;
                                    i9 = i30;
                                }
                            } else {
                                str4 = str5;
                                jArr6 = jArr13;
                                i6 = length5;
                                i7 = i28;
                                i8 = i29;
                                i9 = i30;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj9;
                                if (!this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl2)) {
                                    if (hashSet != null) {
                                        if (!hashSet.contains(recomposeScopeImpl2)) {
                                            j6 >>= 8;
                                            i30 = i9 + 1;
                                            length5 = i6;
                                            jArr13 = jArr6;
                                            str5 = str4;
                                            i28 = i7;
                                            i29 = i8;
                                        }
                                        map2.removeValueAt(i31);
                                        j6 >>= 8;
                                        i30 = i9 + 1;
                                        length5 = i6;
                                        jArr13 = jArr6;
                                        str5 = str4;
                                        i28 = i7;
                                        i29 = i8;
                                    }
                                }
                                map2.removeValueAt(i31);
                                j6 >>= 8;
                                i30 = i9 + 1;
                                length5 = i6;
                                jArr13 = jArr6;
                                str5 = str4;
                                i28 = i7;
                                i29 = i8;
                            }
                        } else {
                            str4 = str5;
                            jArr6 = jArr13;
                            i6 = length5;
                            i7 = i28;
                            i8 = i29;
                            i9 = i30;
                        }
                        j6 >>= 8;
                        i30 = i9 + 1;
                        length5 = i6;
                        jArr13 = jArr6;
                        str5 = str4;
                        i28 = i7;
                        i29 = i8;
                    }
                    str3 = str5;
                    jArr5 = jArr13;
                    int i36 = length5;
                    int i37 = i28;
                    if (i29 != 8) {
                        break;
                    }
                    length5 = i36;
                    i5 = i37;
                } else {
                    str3 = str5;
                    jArr5 = jArr13;
                    i5 = i28;
                }
                if (i5 == length5) {
                    break;
                }
                i28 = i5 + 1;
                jArr13 = jArr5;
                str5 = str3;
                c = 7;
            }
        }
        this.conditionallyInvalidatedScopes.clear();
        cleanUpDerivedStateObservations();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> references) {
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(references.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        androidx.compose.runtime.ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(references);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
        }
    }

    private final <T> T guardChanges(kotlin.jvm.functions.Function0<? extends T> block) {
        try {
            try {
                T invoke = block.invoke();
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                return invoke;
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (!this.abandonSet.isEmpty()) {
                    new androidx.compose.runtime.CompositionImpl.RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        } catch (java.lang.Exception e) {
            abandonChanges();
            throw e;
        }
    }
}
