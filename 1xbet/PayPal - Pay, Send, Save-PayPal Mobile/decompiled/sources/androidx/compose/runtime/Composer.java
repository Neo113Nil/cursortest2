package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\bv\u0018\u0000 ¬\u00012\u00020\u0001:\u0002¬\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u00042\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010\bJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0004H'¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0004H'¢\u0006\u0004\b.\u0010\bJ#\u00102\u001a\u00020\u0004\"\u0004\b\u0000\u0010/2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H'¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H'¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u0004H'¢\u0006\u0004\b5\u0010\bJ!\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b6\u0010\rJ\u000f\u00107\u001a\u00020\u0004H'¢\u0006\u0004\b7\u0010\bJ\u000f\u00108\u001a\u00020\u0004H'¢\u0006\u0004\b8\u0010\bJ\u000f\u00109\u001a\u00020\u0004H'¢\u0006\u0004\b9\u0010\bJ\u0017\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0002H'¢\u0006\u0004\b;\u0010\u0006JB\u0010@\u001a\u00020\u0004\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010/2\u0006\u0010\u0017\u001a\u00028\u00002\u001d\u0010?\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040=¢\u0006\u0002\b>H'¢\u0006\u0004\b@\u0010AJ#\u0010D\u001a\u00020\u00012\b\u0010B\u001a\u0004\u0018\u00010\u00012\b\u0010C\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bH\u0010IJ\u0019\u0010)\u001a\u00020(2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b)\u0010JJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020(H'¢\u0006\u0004\b)\u0010KJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020LH'¢\u0006\u0004\b)\u0010MJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020NH'¢\u0006\u0004\b)\u0010OJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020PH'¢\u0006\u0004\b)\u0010QJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010RJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020SH'¢\u0006\u0004\b)\u0010TJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020UH'¢\u0006\u0004\b)\u0010VJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020WH'¢\u0006\u0004\b)\u0010XJ\u0019\u0010Y\u001a\u00020(2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bY\u0010JJ\u0017\u0010\\\u001a\u00020\u00042\u0006\u0010[\u001a\u00020ZH&¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020(2\u0006\u0010^\u001a\u00020(2\u0006\u0010_\u001a\u00020\u0002H&¢\u0006\u0004\b`\u0010aJ\u001d\u0010c\u001a\u00020\u00042\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000400H&¢\u0006\u0004\bc\u00103J#\u0010e\u001a\u00028\u0000\"\u0004\b\u0000\u0010/2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000dH&¢\u0006\u0004\be\u0010fJ#\u0010j\u001a\u00020\u00042\u0012\u0010i\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030h0gH&¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0004H&¢\u0006\u0004\bl\u0010\bJ\u001b\u0010m\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030hH&¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0004H&¢\u0006\u0004\bo\u0010\bJ\u000f\u0010p\u001a\u00020\u0004H&¢\u0006\u0004\bp\u0010\bJ\u001d\u0010s\u001a\u00020r2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000400H&¢\u0006\u0004\bs\u0010tJ\u000f\u0010v\u001a\u00020uH&¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u0004H&¢\u0006\u0004\bx\u0010\bR\u001e\u0010}\u001a\u0006\u0012\u0002\b\u00030y8'X§\u0004¢\u0006\f\u0012\u0004\b|\u0010\b\u001a\u0004\bz\u0010{R\u001c\u0010\u0081\u0001\u001a\u00020(8'X§\u0004¢\u0006\r\u0012\u0005\b\u0080\u0001\u0010\b\u001a\u0004\b~\u0010\u007fR\u001d\u0010\u0084\u0001\u001a\u00020(8'X§\u0004¢\u0006\u000e\u0012\u0005\b\u0083\u0001\u0010\b\u001a\u0005\b\u0082\u0001\u0010\u007fR\u001d\u0010\u0087\u0001\u001a\u00020(8'X§\u0004¢\u0006\u000e\u0012\u0005\b\u0086\u0001\u0010\b\u001a\u0005\b\u0085\u0001\u0010\u007fR \u0010\u008b\u0001\u001a\u0004\u0018\u00010Z8'X¦\u0004¢\u0006\u000f\u0012\u0005\b\u008a\u0001\u0010\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00018'X§\u0004¢\u0006\u000e\u0012\u0005\b\u008d\u0001\u0010\b\u001a\u0005\b\u008c\u0001\u0010GR\u001e\u0010\u0092\u0001\u001a\u00020\u00028WX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0091\u0001\u0010\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R#\u0010\u0097\u0001\u001a\u00070Uj\u0003`\u0093\u00018'X¦\u0004¢\u0006\u000f\u0012\u0005\b\u0096\u0001\u0010\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001e\u0010\u009a\u0001\u001a\u00020\u00028'X§\u0004¢\u0006\u000f\u0012\u0005\b\u0099\u0001\u0010\b\u001a\u0006\b\u0098\u0001\u0010\u0090\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u0010§\u0001\u001a\u00030£\u00018'X¦\u0004¢\u0006\u000f\u0012\u0005\b¦\u0001\u0010\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001\u0082\u0001\u0002\u00ad\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "parameter", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "(Ljava/util/List;)V", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "skipToGroupEnd", "", "changed", "deactivateToEndGroup", "(Z)V", "skipCurrentGroup", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "marker", "endToMarker", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rememberedValue", "()Ljava/lang/Object;", "updateRememberedValue", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "(Z)Z", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(I)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "collectParameterInformation", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "disableSourceInformation", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getRecomposeScopeIdentity", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "getCurrentMarker", "getCurrentMarker$annotations", "currentMarker", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "Companion", "Landroidx/compose/runtime/ComposerImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Composer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.Composer.Companion INSTANCE = androidx.compose.runtime.Composer.Companion.getHighSpeedVideoSizes;

    @androidx.compose.runtime.ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @kotlin.Deprecated(message = "Prefer the higher-precision compositeKeyHashCode instead", replaceWith = @kotlin.ReplaceWith(expression = "compositeKeyHashCode", imports = {}))
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    <V, T> void apply(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block);

    androidx.compose.runtime.CompositionContext buildContext();

    @androidx.compose.runtime.ComposeCompilerApi
    boolean changed(java.lang.Object value);

    void collectParameterInformation();

    <T> T consume(androidx.compose.runtime.CompositionLocal<T> key);

    @androidx.compose.runtime.ComposeCompilerApi
    <T> void createNode(kotlin.jvm.functions.Function0<? extends T> factory);

    @androidx.compose.runtime.ComposeCompilerApi
    void deactivateToEndGroup(boolean changed);

    @androidx.compose.runtime.ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @androidx.compose.runtime.ComposeCompilerApi
    void enableReusing();

    @androidx.compose.runtime.ComposeCompilerApi
    void endDefaults();

    @androidx.compose.runtime.ComposeCompilerApi
    void endMovableGroup();

    @androidx.compose.runtime.ComposeCompilerApi
    void endNode();

    void endProvider();

    void endProviders();

    @androidx.compose.runtime.ComposeCompilerApi
    void endReplaceGroup();

    @androidx.compose.runtime.ComposeCompilerApi
    void endReplaceableGroup();

    @androidx.compose.runtime.ComposeCompilerApi
    androidx.compose.runtime.ScopeUpdateScope endRestartGroup();

    @androidx.compose.runtime.ComposeCompilerApi
    void endReusableGroup();

    @androidx.compose.runtime.ComposeCompilerApi
    void endToMarker(int marker);

    androidx.compose.runtime.Applier<?> getApplier();

    kotlin.coroutines.CoroutineContext getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    androidx.compose.runtime.ControlledComposition getComposition();

    androidx.compose.runtime.tooling.CompositionData getCompositionData();

    androidx.compose.runtime.CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    androidx.compose.runtime.RecomposeScope getRecomposeScope();

    java.lang.Object getRecomposeScopeIdentity();

    boolean getSkipping();

    void insertMovableContent(androidx.compose.runtime.MovableContent<?> value, java.lang.Object parameter);

    void insertMovableContentReferences(java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> references);

    @androidx.compose.runtime.ComposeCompilerApi
    java.lang.Object joinKey(java.lang.Object left, java.lang.Object right);

    void recordSideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect);

    void recordUsed(androidx.compose.runtime.RecomposeScope scope);

    @androidx.compose.runtime.ComposeCompilerApi
    java.lang.Object rememberedValue();

    androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback(kotlin.jvm.functions.Function0<kotlin.Unit> action);

    boolean shouldExecute(boolean parametersChanged, int flags);

    @androidx.compose.runtime.ComposeCompilerApi
    void skipCurrentGroup();

    @androidx.compose.runtime.ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(java.lang.String sourceInformation);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int key, java.lang.String sourceInformation);

    @androidx.compose.runtime.ComposeCompilerApi
    void startDefaults();

    @androidx.compose.runtime.ComposeCompilerApi
    void startMovableGroup(int key, java.lang.Object dataKey);

    @androidx.compose.runtime.ComposeCompilerApi
    void startNode();

    void startProvider(androidx.compose.runtime.ProvidedValue<?> value);

    void startProviders(androidx.compose.runtime.ProvidedValue<?>[] values);

    @androidx.compose.runtime.ComposeCompilerApi
    void startReplaceGroup(int key);

    @androidx.compose.runtime.ComposeCompilerApi
    void startReplaceableGroup(int key);

    @androidx.compose.runtime.ComposeCompilerApi
    androidx.compose.runtime.Composer startRestartGroup(int key);

    @androidx.compose.runtime.ComposeCompilerApi
    void startReusableGroup(int key, java.lang.Object dataKey);

    @androidx.compose.runtime.ComposeCompilerApi
    void startReusableNode();

    @androidx.compose.runtime.ComposeCompilerApi
    void updateRememberedValue(java.lang.Object value);

    @androidx.compose.runtime.ComposeCompilerApi
    void useNode();

    default int getCompoundKeyHash() {
        return java.lang.Long.hashCode(getCompositeKeyHashCode());
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(boolean value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(char value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(byte value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(short value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(int value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(float value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(long value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changed(double value) {
        return changed(value);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    default boolean changedInstance(java.lang.Object value) {
        return changed(value);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/CompositionTracer;", "tracer", "", "setTracer", "(Landroidx/compose/runtime/CompositionTracer;)V", "Landroidx/compose/runtime/tooling/ComposeStackTraceMode;", "mode", "setDiagnosticStackTraceMode-76WK1J0", "(I)V", "setDiagnosticStackTraceMode", "", "enabled", "setDiagnosticStackTraceEnabled", "(Z)V", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.runtime.Composer.Companion getHighSpeedVideoSizes = new androidx.compose.runtime.Composer.Companion();
        private static final java.lang.Object Empty = new java.lang.Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public final java.lang.String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final java.lang.Object getEmpty() {
            return Empty;
        }

        public final void setTracer(androidx.compose.runtime.CompositionTracer tracer) {
            androidx.compose.runtime.ComposerKt.getHighSpeedVideoFpsRangesFor = tracer;
        }

        /* renamed from: setDiagnosticStackTraceMode-76WK1J0, reason: not valid java name */
        public final void m5235setDiagnosticStackTraceMode76WK1J0(int mode) {
            androidx.compose.runtime.ComposerKt.m5241setComposeStackTraceMode76WK1J0(mode);
        }

        @kotlin.Deprecated(message = "Use setDiagnosticStackTraceMode instead")
        public final void setDiagnosticStackTraceEnabled(boolean enabled) {
            androidx.compose.runtime.ComposerKt.m5241setComposeStackTraceMode76WK1J0(enabled ? androidx.compose.runtime.tooling.ComposeStackTraceMode.INSTANCE.m5503getSourceInformationMD5MrJc() : androidx.compose.runtime.tooling.ComposeStackTraceMode.INSTANCE.m5502getNoneMD5MrJc());
        }
    }
}
