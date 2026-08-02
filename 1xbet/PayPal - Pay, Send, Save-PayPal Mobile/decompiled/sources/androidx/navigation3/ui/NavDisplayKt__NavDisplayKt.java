package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009f\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\r0\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172+\b\u0002\u0010\u0019\u001a%\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b\u00172'\u0010\u001c\u001a#\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020 0\u0013H\u0007¢\u0006\u0002\u0010!\u001aÇ\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\r0\u00052\u0014\b\u0002\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f0\u00052\u0014\b\u0002\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$0\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172+\b\u0002\u0010\u0019\u001a%\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b\u00172'\u0010\u001c\u001a#\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020 0\u0013H\u0007¢\u0006\u0002\u0010'\u001aä\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020 0\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172+\b\u0002\u0010\u0019\u001a%\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010)\u001a\u008c\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020 0\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f0\u00052\u0014\b\u0002\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$0\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172+\b\u0002\u0010\u0019\u001a%\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010*\u001aÔ\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00020,2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020/0.2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u00172+\b\u0002\u0010\u0019\u001a%\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u00100\u001a3\u00101\u001a\u000202\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002¢\u0006\u0002\b5\u001ai\u00106\u001a!\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013¢\u0006\u0002\b\u0017\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00152'\u0010\u001f\u001a#\u0012\u001f\u0012\u001d\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0002\b\u001707H\u0002¢\u0006\u0002\b8\u001aF\u00109\u001a'\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001a¢\u0006\u0002\b\u0017\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0015H\u0002¢\u0006\u0002\b:¨\u0006;"}, d2 = {"NavDisplay", "", "T", "", "backStack", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "onBack", "Lkotlin/Function0;", "entryDecorators", "Landroidx/navigation3/runtime/NavEntryDecorator;", "sceneStrategy", "Landroidx/navigation3/scene/SceneStrategy;", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation3/scene/Scene;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "popTransitionSpec", "predictivePopTransitionSpec", "Lkotlin/Function2;", "", "entryProvider", "Lkotlin/ParameterName;", "name", "key", "Landroidx/navigation3/runtime/NavEntry;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/navigation3/scene/SceneStrategy;Landroidx/compose/animation/SizeTransform;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "sceneStrategies", "sceneDecoratorStrategies", "Landroidx/navigation3/scene/SceneDecoratorStrategy;", "sharedTransitionScope", "Landroidx/compose/animation/SharedTransitionScope;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/SizeTransform;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "entries", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/navigation3/scene/SceneStrategy;Landroidx/compose/animation/SizeTransform;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/util/List;Ljava/util/List;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/SizeTransform;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "sceneState", "Landroidx/navigation3/scene/SceneState;", "navigationEventState", "Landroidx/navigationevent/compose/NavigationEventState;", "Landroidx/navigation3/scene/SceneInfo;", "(Landroidx/navigation3/scene/SceneState;Landroidx/navigationevent/compose/NavigationEventState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/animation/SizeTransform;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isPop", "", "oldBackStack", "newBackStack", "isPop$NavDisplayKt__NavDisplayKt", "contentTransform", "Landroidx/navigation3/runtime/NavMetadataKey;", "contentTransform$NavDisplayKt__NavDisplayKt", "predictivePopSpec", "predictivePopSpec$NavDisplayKt__NavDisplayKt", "navigation3-ui"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/navigation3/ui/NavDisplayKt")
/* loaded from: classes.dex */
final /* synthetic */ class NavDisplayKt__NavDisplayKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavDisplay that supports sharedTransitionScope and takes a List<SceneStrategy>")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavDisplay(final java.util.List list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function0 function0, java.util.List list2, androidx.navigation3.scene.SceneStrategy sceneStrategy, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function1 function13, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        kotlin.jvm.functions.Function0 function02;
        java.util.List list3;
        androidx.navigation3.scene.SceneStrategy sceneStrategy2;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Alignment alignment2;
        final androidx.compose.animation.SizeTransform sizeTransform2;
        final kotlin.jvm.functions.Function2 function22;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0 function03;
        final java.util.List list4;
        final androidx.navigation3.scene.SceneStrategy sceneStrategy3;
        final kotlin.jvm.functions.Function1 function14;
        final kotlin.jvm.functions.Function1 function15;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Alignment topStart;
        kotlin.jvm.functions.Function0 function04;
        java.util.List list5;
        androidx.navigation3.scene.SinglePaneSceneStrategy singlePaneSceneStrategy;
        androidx.compose.animation.SizeTransform sizeTransform3;
        kotlin.jvm.functions.Function1 function16;
        kotlin.jvm.functions.Function1 function17;
        androidx.compose.ui.Alignment alignment3;
        kotlin.jvm.functions.Function2 defaultPredictivePopTransitionSpec;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(807086421);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(alignment) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        function02 = function0;
                        if (startRestartGroup.changedInstance(function02)) {
                            i13 = 2048;
                            i4 |= i13;
                        }
                    } else {
                        function02 = function0;
                    }
                    i13 = 1024;
                    i4 |= i13;
                } else {
                    function02 = function0;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        list3 = list2;
                        if (startRestartGroup.changedInstance(list3)) {
                            i12 = 16384;
                            i4 |= i12;
                        }
                    } else {
                        list3 = list2;
                    }
                    i12 = 8192;
                    i4 |= i12;
                } else {
                    list3 = list2;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        sceneStrategy2 = sceneStrategy;
                        if (startRestartGroup.changed(sceneStrategy2)) {
                            i11 = 131072;
                            i4 |= i11;
                        }
                    } else {
                        sceneStrategy2 = sceneStrategy;
                    }
                    i11 = 65536;
                    i4 |= i11;
                } else {
                    sceneStrategy2 = sceneStrategy;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(sizeTransform) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changedInstance(function1)) {
                        i10 = 8388608;
                        i4 |= i10;
                    }
                    i10 = 4194304;
                    i4 |= i10;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changedInstance(function12)) {
                        i9 = 67108864;
                        i4 |= i9;
                    }
                    i9 = 33554432;
                    i4 |= i9;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changedInstance(function2)) {
                        i8 = 536870912;
                        i4 |= i8;
                    }
                    i8 = 268435456;
                    i4 |= i8;
                }
                if ((i2 & 6) == 0) {
                    i7 = i2 | (startRestartGroup.changedInstance(function13) ? 4 : 2);
                } else {
                    i7 = i2;
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 3) != 2, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        topStart = alignment;
                        function04 = function02;
                        list5 = list3;
                        singlePaneSceneStrategy = sceneStrategy2;
                        sizeTransform3 = sizeTransform;
                        function16 = function1;
                        function17 = function12;
                    } else {
                        if (i14 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        topStart = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopStart() : alignment;
                        if ((i3 & 8) != 0) {
                            boolean changedInstance = startRestartGroup.changedInstance(list);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighResolutionOutputSizeshNQ4ISI(list);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                            i4 &= -7169;
                        } else {
                            function04 = function02;
                        }
                        if ((i3 & 16) != 0) {
                            list5 = kotlin.collections.CollectionsKt.listOf(androidx.navigation3.runtime.SaveableStateHolderNavEntryDecoratorKt.rememberSaveableStateHolderNavEntryDecorator(null, startRestartGroup, 0, 1));
                            i4 &= -57345;
                        } else {
                            list5 = list3;
                        }
                        if ((i3 & 32) != 0) {
                            singlePaneSceneStrategy = new androidx.navigation3.scene.SinglePaneSceneStrategy();
                            i4 &= -458753;
                        } else {
                            singlePaneSceneStrategy = sceneStrategy2;
                        }
                        sizeTransform3 = i6 == 0 ? sizeTransform : null;
                        if ((i3 & 128) != 0) {
                            function16 = androidx.navigation3.ui.NavDisplayKt.defaultTransitionSpec();
                            i4 &= -29360129;
                        } else {
                            function16 = function1;
                        }
                        if ((i3 & 256) != 0) {
                            function17 = androidx.navigation3.ui.NavDisplayKt.defaultPopTransitionSpec();
                            i4 &= -234881025;
                        } else {
                            function17 = function12;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            alignment3 = topStart;
                            defaultPredictivePopTransitionSpec = androidx.navigation3.ui.NavDisplayKt.defaultPredictivePopTransitionSpec();
                            java.util.List list6 = list5;
                            kotlin.jvm.functions.Function0 function05 = function04;
                            androidx.compose.ui.Modifier modifier4 = modifier2;
                            androidx.navigation3.scene.SceneStrategy sceneStrategy4 = singlePaneSceneStrategy;
                            androidx.compose.animation.SizeTransform sizeTransform4 = sizeTransform3;
                            kotlin.jvm.functions.Function1 function18 = function16;
                            kotlin.jvm.functions.Function1 function19 = function17;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(807086421, i4, i7, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:271)");
                            }
                            int i15 = i4 << 6;
                            composer2 = startRestartGroup;
                            androidx.navigation3.ui.NavDisplayKt.NavDisplay(list, modifier4, alignment3, function05, list6, kotlin.collections.CollectionsKt.listOf(sceneStrategy4), null, null, sizeTransform4, function18, function19, defaultPredictivePopTransitionSpec, function13, composer2, (1879048192 & i15) | (i15 & 234881024) | (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4), ((i4 >> 24) & 126) | ((i7 << 6) & 896), 64);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            alignment2 = alignment3;
                            function03 = function05;
                            list4 = list6;
                            sceneStrategy3 = sceneStrategy4;
                            sizeTransform2 = sizeTransform4;
                            function14 = function18;
                            function15 = function19;
                            function22 = defaultPredictivePopTransitionSpec;
                        }
                    }
                    defaultPredictivePopTransitionSpec = function2;
                    alignment3 = topStart;
                    java.util.List list62 = list5;
                    kotlin.jvm.functions.Function0 function052 = function04;
                    androidx.compose.ui.Modifier modifier42 = modifier2;
                    androidx.navigation3.scene.SceneStrategy sceneStrategy42 = singlePaneSceneStrategy;
                    androidx.compose.animation.SizeTransform sizeTransform42 = sizeTransform3;
                    kotlin.jvm.functions.Function1 function182 = function16;
                    kotlin.jvm.functions.Function1 function192 = function17;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i152 = i4 << 6;
                    composer2 = startRestartGroup;
                    androidx.navigation3.ui.NavDisplayKt.NavDisplay(list, modifier42, alignment3, function052, list62, kotlin.collections.CollectionsKt.listOf(sceneStrategy42), null, null, sizeTransform42, function182, function192, defaultPredictivePopTransitionSpec, function13, composer2, (1879048192 & i152) | (i152 & 234881024) | (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4), ((i4 >> 24) & 126) | ((i7 << 6) & 896), 64);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    alignment2 = alignment3;
                    function03 = function052;
                    list4 = list62;
                    sceneStrategy3 = sceneStrategy42;
                    sizeTransform2 = sizeTransform42;
                    function14 = function182;
                    function15 = function192;
                    function22 = defaultPredictivePopTransitionSpec;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    alignment2 = alignment;
                    sizeTransform2 = sizeTransform;
                    function22 = function2;
                    modifier3 = modifier2;
                    function03 = function02;
                    list4 = list3;
                    sceneStrategy3 = sceneStrategy2;
                    function14 = function1;
                    function15 = function12;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(list, modifier3, alignment2, function03, list4, sceneStrategy3, sizeTransform2, function14, function15, function22, function13, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void NavDisplay(final java.util.List<? extends T> list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.util.List<? extends androidx.navigation3.runtime.NavEntryDecorator<T>> list2, java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list3, java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list4, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function12, kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2, final kotlin.jvm.functions.Function1<? super T, androidx.navigation3.runtime.NavEntry<T>> function13, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list5;
        int i7;
        int i8;
        int i9;
        int i10;
        final androidx.compose.ui.Alignment alignment2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        java.util.List<? extends androidx.navigation3.runtime.NavEntryDecorator<T>> list6;
        final java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list7;
        androidx.compose.animation.SharedTransitionScope sharedTransitionScope2;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function14;
        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function22;
        androidx.compose.ui.Modifier.Companion companion;
        final java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list8;
        final androidx.compose.animation.SizeTransform sizeTransform2;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function15;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Alignment topStart;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list9;
        androidx.compose.animation.SizeTransform sizeTransform3;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function16;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function17;
        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function23;
        int i11;
        int i12;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function18;
        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function24;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function19;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1398581072);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(alignment) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0 && startRestartGroup.changedInstance(function0)) {
                        i17 = 2048;
                        i4 |= i17;
                    }
                    i17 = 1024;
                    i4 |= i17;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changedInstance(list2)) {
                        i16 = 16384;
                        i4 |= i16;
                    }
                    i16 = 8192;
                    i4 |= i16;
                }
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changedInstance(list3)) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    list5 = list4;
                } else {
                    list5 = list4;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(list5) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(sharedTransitionScope) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(sizeTransform) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changedInstance(function1)) {
                        i15 = 536870912;
                        i4 |= i15;
                    }
                    i15 = 268435456;
                    i4 |= i15;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changedInstance(function12)) {
                        i14 = 4;
                        i9 = i2 | i14;
                    }
                    i14 = 2;
                    i9 = i2 | i14;
                } else {
                    i9 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changedInstance(function2)) {
                        i13 = 32;
                        i9 |= i13;
                    }
                    i13 = 16;
                    i9 |= i13;
                }
                if ((i2 & 384) == 0) {
                    i9 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i10 = i9;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 147) != 146, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i10 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i10 &= -113;
                        }
                        topStart = alignment;
                        list6 = list2;
                        list9 = list3;
                        sharedTransitionScope2 = sharedTransitionScope;
                        sizeTransform3 = sizeTransform;
                        function19 = function1;
                        i11 = i4;
                        i12 = i10;
                        companion = modifier2;
                        function03 = function0;
                        function18 = function12;
                        function24 = function2;
                    } else {
                        companion = i18 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        topStart = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopStart() : alignment;
                        if ((i3 & 8) != 0) {
                            boolean changedInstance = startRestartGroup.changedInstance(list);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(list);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                            i4 &= -7169;
                        } else {
                            function03 = function0;
                        }
                        if ((i3 & 16) != 0) {
                            list6 = kotlin.collections.CollectionsKt.listOf(androidx.navigation3.runtime.SaveableStateHolderNavEntryDecoratorKt.rememberSaveableStateHolderNavEntryDecorator(null, startRestartGroup, 0, 1));
                            i4 &= -57345;
                        } else {
                            list6 = list2;
                        }
                        if ((i3 & 32) != 0) {
                            list9 = kotlin.collections.CollectionsKt.listOf(new androidx.navigation3.scene.SinglePaneSceneStrategy());
                            i4 &= -458753;
                        } else {
                            list9 = list3;
                        }
                        if (i6 != 0) {
                            list5 = kotlin.collections.CollectionsKt.emptyList();
                        }
                        sharedTransitionScope2 = i7 != 0 ? null : sharedTransitionScope;
                        sizeTransform3 = i8 == 0 ? sizeTransform : null;
                        if ((i3 & 512) != 0) {
                            function16 = androidx.navigation3.ui.NavDisplayKt.defaultTransitionSpec();
                            i4 &= -1879048193;
                        } else {
                            function16 = function1;
                        }
                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function110 = function16;
                        if ((i3 & 1024) != 0) {
                            function17 = androidx.navigation3.ui.NavDisplayKt.defaultPopTransitionSpec();
                            i10 &= -15;
                        } else {
                            function17 = function12;
                        }
                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function111 = function17;
                        if ((i3 & 2048) != 0) {
                            function23 = androidx.navigation3.ui.NavDisplayKt.defaultPredictivePopTransitionSpec();
                            i10 &= -113;
                        } else {
                            function23 = function2;
                        }
                        i11 = i4;
                        i12 = i10;
                        function18 = function111;
                        function24 = function23;
                        function19 = function110;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        function04 = function03;
                        androidx.compose.runtime.ComposerKt.traceEventStart(1398581072, i11, i12, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:357)");
                    } else {
                        function04 = function03;
                    }
                    if (list.isEmpty()) {
                        throw new java.lang.IllegalArgumentException("NavDisplay backstack cannot be empty".toString());
                    }
                    int i19 = i11 >> 9;
                    java.util.List rememberDecoratedNavEntries = androidx.navigation3.runtime.DecoratedNavEntriesKt.rememberDecoratedNavEntries(list, list6, function13, startRestartGroup, (i12 & 896) | (i11 & 14) | (i19 & 112), 0);
                    int i20 = i11 >> 6;
                    int i21 = i12 << 24;
                    androidx.navigation3.ui.NavDisplayKt.NavDisplay(rememberDecoratedNavEntries, companion, topStart, list9, list5, sharedTransitionScope2, sizeTransform3, function19, function18, function24, function04, startRestartGroup, (i20 & 29360128) | (i11 & 1008) | (i20 & 7168) | (57344 & i20) | (458752 & i20) | (3670016 & i20) | (234881024 & i21) | (1879048192 & i21), i19 & 14, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function22 = function24;
                    sizeTransform2 = sizeTransform3;
                    list8 = list5;
                    function02 = function04;
                    function15 = function18;
                    alignment2 = topStart;
                    list7 = list9;
                    function14 = function19;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    alignment2 = alignment;
                    function02 = function0;
                    list6 = list2;
                    list7 = list3;
                    sharedTransitionScope2 = sharedTransitionScope;
                    function14 = function1;
                    function22 = function2;
                    companion = modifier2;
                    list8 = list5;
                    sizeTransform2 = sizeTransform;
                    function15 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final java.util.List<? extends androidx.navigation3.runtime.NavEntryDecorator<T>> list10 = list6;
                    final androidx.compose.animation.SharedTransitionScope sharedTransitionScope3 = sharedTransitionScope2;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function25 = function22;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighResolutionOutputSizeshNQ4ISI(list, modifier3, alignment2, function02, list10, list7, list8, sharedTransitionScope3, sizeTransform2, function14, function15, function25, function13, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            i10 = i9;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        i10 = i9;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavDisplay that supports sharedTransitionScope and takes a List<SceneStrategy>")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavDisplay(final java.util.List list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, androidx.navigation3.scene.SceneStrategy sceneStrategy, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Alignment alignment2;
        androidx.navigation3.scene.SceneStrategy sceneStrategy2;
        int i5;
        androidx.compose.animation.SizeTransform sizeTransform2;
        kotlin.jvm.functions.Function1 function13;
        kotlin.jvm.functions.Function1 function14;
        kotlin.jvm.functions.Function2 function22;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.ui.Alignment alignment3;
        final androidx.navigation3.scene.SceneStrategy sceneStrategy3;
        final androidx.compose.animation.SizeTransform sizeTransform3;
        final kotlin.jvm.functions.Function2 function23;
        final kotlin.jvm.functions.Function1 function15;
        final kotlin.jvm.functions.Function1 function16;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2 defaultPredictivePopTransitionSpec;
        int i6;
        androidx.compose.animation.SizeTransform sizeTransform4;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1483975592);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sceneStrategy2 = sceneStrategy;
                        if (startRestartGroup.changed(sceneStrategy2)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        sceneStrategy2 = sceneStrategy;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    sceneStrategy2 = sceneStrategy;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    sizeTransform2 = sizeTransform;
                    i3 |= startRestartGroup.changedInstance(sizeTransform2) ? 16384 : 8192;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i2 & 32) == 0) {
                            function13 = function1;
                            if (startRestartGroup.changedInstance(function13)) {
                                i9 = 131072;
                                i3 |= i9;
                            }
                        } else {
                            function13 = function1;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        function13 = function1;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            function14 = function12;
                            if (startRestartGroup.changedInstance(function14)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            function14 = function12;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        function14 = function12;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0) {
                            function22 = function2;
                            if (startRestartGroup.changedInstance(function22)) {
                                i7 = 8388608;
                                i3 |= i7;
                            }
                        } else {
                            function22 = function2;
                        }
                        i7 = 4194304;
                        i3 |= i7;
                    } else {
                        function22 = function2;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                alignment2 = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                sceneStrategy2 = new androidx.navigation3.scene.SinglePaneSceneStrategy();
                            }
                            if (i5 != 0) {
                                sizeTransform2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                function13 = androidx.navigation3.ui.NavDisplayKt.defaultTransitionSpec();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                function14 = androidx.navigation3.ui.NavDisplayKt.defaultPopTransitionSpec();
                            }
                            if ((i2 & 128) != 0) {
                                defaultPredictivePopTransitionSpec = androidx.navigation3.ui.NavDisplayKt.defaultPredictivePopTransitionSpec();
                                i6 = (-29360129) & i3;
                                sizeTransform4 = sizeTransform2;
                                kotlin.jvm.functions.Function1 function17 = function13;
                                kotlin.jvm.functions.Function1 function18 = function14;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1483975592, i6, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:451)");
                                }
                                int i12 = i6 << 6;
                                androidx.navigation3.ui.NavDisplayKt.NavDisplay(list, modifier2, alignment2, kotlin.collections.CollectionsKt.listOf(sceneStrategy2), (java.util.List) null, (androidx.compose.animation.SharedTransitionScope) null, sizeTransform4, function17, function18, defaultPredictivePopTransitionSpec, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, startRestartGroup, (i6 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i6 & 112) | (i6 & 896) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), (i6 >> 24) & 14, 16);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function15 = function17;
                                modifier3 = modifier2;
                                sizeTransform3 = sizeTransform4;
                                androidx.compose.ui.Alignment alignment4 = alignment2;
                                function16 = function18;
                                alignment3 = alignment4;
                                androidx.navigation3.scene.SceneStrategy sceneStrategy4 = sceneStrategy2;
                                function23 = defaultPredictivePopTransitionSpec;
                                sceneStrategy3 = sceneStrategy4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                        }
                        i6 = i3;
                        sizeTransform4 = sizeTransform2;
                        defaultPredictivePopTransitionSpec = function22;
                        kotlin.jvm.functions.Function1 function172 = function13;
                        kotlin.jvm.functions.Function1 function182 = function14;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i122 = i6 << 6;
                        androidx.navigation3.ui.NavDisplayKt.NavDisplay(list, modifier2, alignment2, kotlin.collections.CollectionsKt.listOf(sceneStrategy2), (java.util.List) null, (androidx.compose.animation.SharedTransitionScope) null, sizeTransform4, function172, function182, defaultPredictivePopTransitionSpec, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, startRestartGroup, (i6 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i6 & 112) | (i6 & 896) | (3670016 & i122) | (29360128 & i122) | (234881024 & i122) | (i122 & 1879048192), (i6 >> 24) & 14, 16);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        function15 = function172;
                        modifier3 = modifier2;
                        sizeTransform3 = sizeTransform4;
                        androidx.compose.ui.Alignment alignment42 = alignment2;
                        function16 = function182;
                        alignment3 = alignment42;
                        androidx.navigation3.scene.SceneStrategy sceneStrategy42 = sceneStrategy2;
                        function23 = defaultPredictivePopTransitionSpec;
                        sceneStrategy3 = sceneStrategy42;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        alignment3 = alignment2;
                        sceneStrategy3 = sceneStrategy2;
                        sizeTransform3 = sizeTransform2;
                        function23 = function22;
                        function15 = function13;
                        function16 = function14;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.Camera2StreamConfigurationMap(list, modifier3, alignment3, sceneStrategy3, sizeTransform3, function15, function16, function23, function0, i, i2, (androidx.compose.runtime.Composer) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
                sizeTransform2 = sizeTransform;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            sizeTransform2 = sizeTransform;
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        sizeTransform2 = sizeTransform;
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void NavDisplay(final java.util.List<androidx.navigation3.runtime.NavEntry<T>> list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list2, java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list3, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function12, kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Alignment alignment2;
        java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list4;
        int i5;
        java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list5;
        int i6;
        int i7;
        int i8;
        final androidx.compose.animation.SharedTransitionScope sharedTransitionScope2;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function13;
        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function22;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.ui.Alignment alignment3;
        final java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list6;
        final androidx.compose.animation.SizeTransform sizeTransform2;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function14;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Alignment topStart;
        java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list7;
        java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> emptyList;
        androidx.compose.animation.SharedTransitionScope sharedTransitionScope3;
        androidx.compose.animation.SizeTransform sizeTransform3;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function15;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function16;
        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> defaultPredictivePopTransitionSpec;
        int i9;
        int i10;
        int i11;
        int i12;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1914095277);
        int i13 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i14 = i3 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i13 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3 & 4;
            if (i4 == 0) {
                i13 |= 384;
            } else if ((i & 384) == 0) {
                alignment2 = alignment;
                i13 |= startRestartGroup.changed(alignment2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        list4 = list2;
                        if (startRestartGroup.changedInstance(list4)) {
                            i12 = 2048;
                            i13 |= i12;
                        }
                    } else {
                        list4 = list2;
                    }
                    i12 = 1024;
                    i13 |= i12;
                } else {
                    list4 = list2;
                }
                i5 = i3 & 16;
                if (i5 != 0) {
                    i13 |= 24576;
                } else if ((i & 24576) == 0) {
                    list5 = list3;
                    i13 |= startRestartGroup.changedInstance(list5) ? 16384 : 8192;
                    i6 = i3 & 32;
                    if (i6 == 0) {
                        i13 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i13 |= startRestartGroup.changed(sharedTransitionScope) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i13 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i13 |= startRestartGroup.changedInstance(sizeTransform) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changedInstance(function1)) {
                            i11 = 8388608;
                            i13 |= i11;
                        }
                        i11 = 4194304;
                        i13 |= i11;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changedInstance(function12)) {
                            i10 = 67108864;
                            i13 |= i10;
                        }
                        i10 = 33554432;
                        i13 |= i10;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changedInstance(function2)) {
                            i9 = 536870912;
                            i13 |= i9;
                        }
                        i9 = 268435456;
                        i13 |= i9;
                    }
                    i8 = (i2 & 6) != 0 ? i2 | (startRestartGroup.changedInstance(function0) ? 4 : 2) : i2;
                    if (!startRestartGroup.shouldExecute((i13 & 306783379) == 306783378 || (i8 & 3) != 2, i13 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i13 &= -7169;
                            }
                            if ((i3 & 128) != 0) {
                                i13 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i13 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i13 &= -1879048193;
                            }
                            function15 = function1;
                            companion = modifier2;
                            topStart = alignment2;
                            list7 = list4;
                            emptyList = list5;
                            sharedTransitionScope3 = sharedTransitionScope;
                            sizeTransform3 = sizeTransform;
                            function16 = function12;
                        } else {
                            companion = i14 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            topStart = i4 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopStart() : alignment2;
                            if ((i3 & 8) != 0) {
                                list7 = kotlin.collections.CollectionsKt.listOf(new androidx.navigation3.scene.SinglePaneSceneStrategy());
                                i13 &= -7169;
                            } else {
                                list7 = list4;
                            }
                            emptyList = i5 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list5;
                            sharedTransitionScope3 = i6 != 0 ? null : sharedTransitionScope;
                            sizeTransform3 = i7 != 0 ? null : sizeTransform;
                            if ((i3 & 128) != 0) {
                                function15 = androidx.navigation3.ui.NavDisplayKt.defaultTransitionSpec();
                                i13 &= -29360129;
                            } else {
                                function15 = function1;
                            }
                            if ((i3 & 256) != 0) {
                                function16 = androidx.navigation3.ui.NavDisplayKt.defaultPopTransitionSpec();
                                i13 &= -234881025;
                            } else {
                                function16 = function12;
                            }
                            if ((i3 & 512) != 0) {
                                defaultPredictivePopTransitionSpec = androidx.navigation3.ui.NavDisplayKt.defaultPredictivePopTransitionSpec();
                                i13 &= -1879048193;
                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function17 = function16;
                                int i15 = i13;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1914095277, i15, i8, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:534)");
                                }
                                if (!list.isEmpty()) {
                                    throw new java.lang.IllegalArgumentException("NavDisplay entries cannot be empty".toString());
                                }
                                int i16 = i15 >> 6;
                                kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function23 = defaultPredictivePopTransitionSpec;
                                androidx.navigation3.scene.SceneState rememberSceneState = androidx.navigation3.scene.SceneStateKt.rememberSceneState(list, list7, emptyList, sharedTransitionScope3, function0, startRestartGroup, (i16 & 7168) | (i16 & 896) | (i15 & 14) | (i16 & 112) | ((i8 << 12) & 57344), 0);
                                final androidx.navigation3.scene.Scene<T> currentScene = rememberSceneState.getCurrentScene();
                                java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list8 = list7;
                                androidx.navigation3.scene.SceneInfo sceneInfo = new androidx.navigation3.scene.SceneInfo(currentScene);
                                java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list9 = emptyList;
                                androidx.compose.animation.SharedTransitionScope sharedTransitionScope4 = sharedTransitionScope3;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(rememberSceneState.getPreviousScenes(), 10));
                                for (java.util.Iterator<T> it = r8.iterator(); it.hasNext(); it = it) {
                                    arrayList.add(new androidx.navigation3.scene.SceneInfo((androidx.navigation3.scene.Scene) it.next()));
                                }
                                androidx.view.compose.NavigationEventState rememberNavigationEventState = androidx.view.compose.RememberNavigationEventStateKt.rememberNavigationEventState(sceneInfo, arrayList, null, startRestartGroup, 0, 4);
                                boolean isEmpty = currentScene.getPreviousEntries().isEmpty();
                                boolean changedInstance = startRestartGroup.changedInstance(list);
                                boolean changed = startRestartGroup.changed(currentScene);
                                boolean z = (i8 & 14) == 4;
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if ((changedInstance | changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoFpsRangesFor(list, currentScene, function0);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                androidx.view.compose.NavigationEventHandlerKt.NavigationBackHandler(rememberNavigationEventState, !isEmpty, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 4);
                                androidx.navigation3.ui.NavDisplayKt.NavDisplay(rememberSceneState, rememberNavigationEventState, companion, topStart, sizeTransform3, function15, function17, function23, startRestartGroup, ((i15 << 3) & 8064) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function22 = function23;
                                alignment3 = topStart;
                                sizeTransform2 = sizeTransform3;
                                function13 = function15;
                                list6 = list9;
                                sharedTransitionScope2 = sharedTransitionScope4;
                                function14 = function17;
                                list4 = list8;
                            }
                        }
                        defaultPredictivePopTransitionSpec = function2;
                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function172 = function16;
                        int i152 = i13;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        if (!list.isEmpty()) {
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        sharedTransitionScope2 = sharedTransitionScope;
                        function13 = function1;
                        function22 = function2;
                        companion = modifier2;
                        alignment3 = alignment2;
                        list6 = list5;
                        sizeTransform2 = sizeTransform;
                        function14 = function12;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list10 = list4;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function24 = function22;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.Camera2StreamConfigurationMap(list, modifier3, alignment3, list10, list6, sharedTransitionScope2, sizeTransform2, function13, function14, function24, function0, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
                list5 = list3;
                i6 = i3 & 32;
                if (i6 == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i13 & 306783379) == 306783378 || (i8 & 3) != 2, i13 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            if ((i & 3072) == 0) {
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            list5 = list3;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i13 & 306783379) == 306783378 || (i8 & 3) != 2, i13 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i3 & 4;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        if ((i & 3072) == 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        list5 = list3;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i13 & 306783379) == 306783378 || (i8 & 3) != 2, i13 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0637, code lost:
    
        if (r1.changed(r9) == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x065d, code lost:
    
        if (r1.changed(r14) == false) goto L280;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0772 A[LOOP:3: B:185:0x0772->B:200:0x0850, LOOP_START, PHI: r0 r34
      0x0772: PHI (r0v58 int) = (r0v56 int), (r0v62 int) binds: [B:184:0x0770, B:200:0x0850] A[DONT_GENERATE, DONT_INLINE]
      0x0772: PHI (r34v1 java.util.List<androidx.navigation3.scene.OverlayScene<T>>) = 
      (r34v0 java.util.List<androidx.navigation3.scene.OverlayScene<T>>)
      (r34v2 java.util.List<androidx.navigation3.scene.OverlayScene<T>>)
     binds: [B:184:0x0770, B:200:0x0850] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x040b A[LOOP:4: B:240:0x0405->B:242:0x040b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224 A[LOOP:0: B:88:0x021e->B:90:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251 A[LOOP:1: B:93:0x024b->B:95:0x0251, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void NavDisplay(final androidx.navigation3.scene.SceneState<T> sceneState, final androidx.view.compose.NavigationEventState<androidx.navigation3.scene.SceneInfo<T>> navigationEventState, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function12, kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Alignment alignment2;
        int i4;
        androidx.compose.animation.SizeTransform sizeTransform2;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function13;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function14;
        final kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function22;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.ui.Alignment alignment3;
        final androidx.compose.animation.SizeTransform sizeTransform3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function15;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function16;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function17;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function18;
        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> defaultPredictivePopTransitionSpec;
        androidx.compose.ui.Alignment alignment4;
        int i5;
        java.lang.Object rememberedValue;
        boolean changed;
        java.lang.Object rememberedValue2;
        boolean z;
        androidx.compose.ui.Alignment alignment5;
        boolean z2;
        boolean z3;
        float progress;
        int swipeEdge;
        java.util.Iterator<T> it;
        java.util.ArrayList arrayList;
        java.util.Iterator<T> it2;
        java.util.ArrayList arrayList2;
        boolean z4;
        java.lang.Object rememberedValue3;
        androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap;
        java.lang.Object rememberedValue4;
        final androidx.collection.MutableObjectFloatMap mutableObjectFloatMap;
        androidx.navigation3.ui.AnimatedSceneKey animatedSceneKey;
        androidx.navigation3.ui.AnimatedSceneKey animatedSceneKey2;
        int findKeyIndex;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function19;
        float f;
        float f2;
        java.lang.Object rememberedValue5;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList;
        boolean changedInstance;
        java.lang.Object rememberedValue6;
        boolean changed2;
        boolean changed3;
        boolean changed4;
        java.lang.Object rememberedValue7;
        androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap2;
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap2;
        java.util.Iterator<T> it3;
        boolean areEqual;
        int size;
        int i6;
        int i7;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2;
        androidx.navigation3.scene.Scene<T> scene;
        androidx.compose.animation.core.SeekableTransitionState seekableTransitionState;
        androidx.compose.animation.core.SeekableTransitionState seekableTransitionState2;
        java.lang.Object put;
        androidx.navigation3.scene.Scene scene2;
        boolean changed5;
        boolean changed6;
        boolean changed7;
        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function23;
        boolean z5;
        boolean z6;
        boolean changed8;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function110;
        java.util.Map map;
        boolean z7;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function111;
        float f3;
        boolean z8;
        java.lang.Object rememberedValue8;
        boolean changed9;
        boolean changed10;
        boolean changedInstance2;
        java.lang.Object rememberedValue9;
        java.lang.Object rememberedValue10;
        boolean changed11;
        boolean changedInstance3;
        java.lang.Object rememberedValue11;
        int size2;
        java.lang.Object obj;
        java.util.Iterator<java.lang.Integer> it4;
        java.lang.Integer num;
        java.util.Iterator<java.lang.Integer> it5;
        int i8;
        int i9;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-303833701);
        int i10 = (i & 6) == 0 ? (startRestartGroup.changed(sceneState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i10 |= startRestartGroup.changed(navigationEventState) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i10 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i10 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i10 |= 3072;
            } else if ((i & 3072) == 0) {
                alignment2 = alignment;
                i10 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i10 |= 24576;
                } else if ((i & 24576) == 0) {
                    sizeTransform2 = sizeTransform;
                    i10 |= startRestartGroup.changedInstance(sizeTransform2) ? 16384 : 8192;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i2 & 32) == 0) {
                            function13 = function1;
                            if (startRestartGroup.changedInstance(function13)) {
                                i9 = 131072;
                                i10 |= i9;
                            }
                        } else {
                            function13 = function1;
                        }
                        i9 = 65536;
                        i10 |= i9;
                    } else {
                        function13 = function1;
                    }
                    if ((i & 1572864) != 0) {
                        function14 = function12;
                        i10 |= ((i2 & 64) == 0 && startRestartGroup.changedInstance(function14)) ? 1048576 : 524288;
                    } else {
                        function14 = function12;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changedInstance(function2)) {
                            i8 = 8388608;
                            i10 |= i8;
                        }
                        i8 = 4194304;
                        i10 |= i8;
                    }
                    if (!startRestartGroup.shouldExecute((i10 & 4793491) == 4793490, i10 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if (i3 != 0) {
                                alignment2 = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
                            }
                            if (i4 != 0) {
                                sizeTransform2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                function13 = androidx.navigation3.ui.NavDisplayKt.defaultTransitionSpec();
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                function14 = androidx.navigation3.ui.NavDisplayKt.defaultPopTransitionSpec();
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                function17 = function14;
                                function18 = function13;
                                defaultPredictivePopTransitionSpec = androidx.navigation3.ui.NavDisplayKt.defaultPredictivePopTransitionSpec();
                                alignment4 = alignment2;
                                i5 = i10;
                                final androidx.compose.animation.SizeTransform sizeTransform4 = sizeTransform2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-303833701, i5, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:617)");
                                }
                                androidx.navigation3.scene.Scene<T> currentScene = sceneState.getCurrentScene();
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new androidx.compose.animation.core.SeekableTransitionState(currentScene);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                androidx.compose.animation.core.SeekableTransitionState seekableTransitionState3 = (androidx.compose.animation.core.SeekableTransitionState) rememberedValue;
                                final androidx.compose.animation.core.Transition rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(seekableTransitionState3, "scene", startRestartGroup, androidx.compose.animation.core.SeekableTransitionState.$stable | 48, 0);
                                changed = startRestartGroup.changed((androidx.navigation3.scene.Scene) rememberTransition.getCurrentState());
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = kotlin.collections.CollectionsKt.toList(sceneState.getEntries());
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                java.util.List list = (java.util.List) rememberedValue2;
                                androidx.navigation3.scene.Scene scene3 = (androidx.navigation3.scene.Scene) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) sceneState.getPreviousScenes());
                                androidx.view.NavigationEventTransitionState transitionState = navigationEventState.getTransitionState();
                                z = transitionState instanceof androidx.navigationevent.NavigationEventTransitionState.InProgress;
                                if (z || scene3 == null) {
                                    alignment5 = alignment4;
                                    z2 = false;
                                } else {
                                    alignment5 = alignment4;
                                    z2 = true;
                                }
                                z3 = transitionState instanceof androidx.navigationevent.NavigationEventTransitionState.Idle;
                                androidx.compose.ui.Modifier modifier4 = modifier2;
                                if (!z3) {
                                    progress = 0.0f;
                                } else {
                                    if (!z) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    progress = ((androidx.navigationevent.NavigationEventTransitionState.InProgress) transitionState).getLatestEvent().getProgress();
                                }
                                if (!z3) {
                                    swipeEdge = 2;
                                } else {
                                    if (!z) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    swipeEdge = ((androidx.navigationevent.NavigationEventTransitionState.InProgress) transitionState).getLatestEvent().getSwipeEdge();
                                }
                                java.util.List list2 = list;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(((androidx.navigation3.runtime.NavEntry) it.next()).getContentKey());
                                }
                                arrayList = arrayList3;
                                java.util.List<androidx.navigation3.runtime.NavEntry<T>> entries = sceneState.getEntries();
                                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10));
                                it2 = entries.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(((androidx.navigation3.runtime.NavEntry) it2.next()).getContentKey());
                                }
                                arrayList2 = arrayList4;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.first((java.util.List) arrayList), kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)) && arrayList2.size() <= arrayList.size()) {
                                    it4 = kotlin.collections.CollectionsKt.getIndices(arrayList2).iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            num = null;
                                            break;
                                        }
                                        num = it4.next();
                                        int intValue = num.intValue();
                                        it5 = it4;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(arrayList2.get(intValue), arrayList.get(intValue))) {
                                            break;
                                        } else {
                                            it4 = it5;
                                        }
                                    }
                                    if (num == null && arrayList2.size() != arrayList.size()) {
                                        z4 = true;
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        snapshotStateMap = (androidx.compose.runtime.snapshots.SnapshotStateMap) rememberedValue3;
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue4 = androidx.collection.ObjectFloatMapKt.mutableObjectFloatMapOf();
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        mutableObjectFloatMap = (androidx.collection.MutableObjectFloatMap) rememberedValue4;
                                        animatedSceneKey = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition.getCurrentState());
                                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function112 = function18;
                                        animatedSceneKey2 = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition.getTargetState());
                                        findKeyIndex = mutableObjectFloatMap.findKeyIndex(animatedSceneKey);
                                        if (findKeyIndex < 0) {
                                            function19 = function17;
                                            f = mutableObjectFloatMap.values[findKeyIndex];
                                        } else {
                                            function19 = function17;
                                            f = 0.0f;
                                            mutableObjectFloatMap.set(animatedSceneKey, 0.0f);
                                        }
                                        if (z2 && !kotlin.jvm.internal.Intrinsics.areEqual(rememberTransition.getTargetState(), currentScene) && mutableObjectFloatMap.contains(animatedSceneKey2)) {
                                            f2 = mutableObjectFloatMap.get(animatedSceneKey2);
                                        } else {
                                            f2 = !kotlin.jvm.internal.Intrinsics.areEqual(animatedSceneKey, animatedSceneKey2) ? f : (z4 || z2) ? f - 1.0f : 1.0f + f;
                                        }
                                        boolean z9 = z4;
                                        snapshotStateMap.put(animatedSceneKey2, rememberTransition.getTargetState());
                                        mutableObjectFloatMap.set(animatedSceneKey2, f2);
                                        java.util.List<androidx.navigation3.scene.OverlayScene<T>> overlayScenes = sceneState.getOverlayScenes();
                                        rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue5 = new androidx.compose.runtime.snapshots.SnapshotStateList();
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue5;
                                        changedInstance = startRestartGroup.changedInstance(overlayScenes);
                                        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function24 = defaultPredictivePopTransitionSpec;
                                        rememberedValue6 = startRestartGroup.rememberedValue();
                                        if (!changedInstance || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue6 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1(overlayScenes, snapshotStateList, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue6);
                                        }
                                        androidx.compose.runtime.EffectsKt.LaunchedEffect(overlayScenes, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                                        java.lang.Object list3 = kotlin.collections.CollectionsKt.toList(snapshotStateMap.entrySet());
                                        java.lang.Object list4 = snapshotStateList.toList();
                                        java.util.List<androidx.navigation3.scene.OverlayScene<T>> list5 = overlayScenes;
                                        java.lang.Object obj2 = mutableObjectFloatMap.toString();
                                        changed2 = startRestartGroup.changed(list3);
                                        changed3 = startRestartGroup.changed(list4);
                                        changed4 = startRestartGroup.changed(obj2);
                                        rememberedValue7 = startRestartGroup.rememberedValue();
                                        if ((!changed4 && (!changed2 && !changed3)) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                            java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(snapshotStateMap.entrySet(), new java.util.Comparator() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$lambda$19$0$$inlined$sortedByDescending$1
                                                @Override // java.util.Comparator
                                                public final int compare(T t, T t2) {
                                                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t2).getKey())), java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t).getKey())));
                                                }
                                            });
                                            snapshotStateMap2 = snapshotStateMap;
                                            mutableObjectFloatMap2 = mutableObjectFloatMap;
                                            java.util.ArrayList<androidx.navigation3.scene.Scene> arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
                                            it3 = sortedWith.iterator();
                                            while (it3.hasNext()) {
                                                arrayList6.add((androidx.navigation3.scene.Scene) ((java.util.Map.Entry) it3.next()).getValue());
                                            }
                                            for (androidx.navigation3.scene.Scene scene4 : arrayList6) {
                                                if (!arrayList5.contains(scene4)) {
                                                    arrayList5.add(scene4);
                                                }
                                            }
                                            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) snapshotStateList, (java.lang.Iterable) arrayList5);
                                            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                                            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(rememberTransition.getTargetState(), kotlin.collections.CollectionsKt.first((java.util.List) arrayList5));
                                            size = plus.size();
                                            i6 = 0;
                                            while (i6 < size) {
                                                java.util.List list6 = plus;
                                                androidx.navigation3.scene.Scene scene5 = (androidx.navigation3.scene.Scene) plus.get(i6);
                                                int i12 = size;
                                                java.util.List<androidx.navigation3.runtime.NavEntry<T>> entries2 = scene5.getEntries();
                                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = snapshotStateList;
                                                int i13 = swipeEdge;
                                                androidx.navigation3.scene.Scene<T> scene6 = currentScene;
                                                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries2, 10));
                                                java.util.Iterator<T> it6 = entries2.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList7.add(((androidx.navigation3.runtime.NavEntry) it6.next()).getContentKey());
                                                }
                                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                                for (T t : arrayList7) {
                                                    if (!linkedHashSet.contains(t)) {
                                                        arrayList8.add(t);
                                                    }
                                                }
                                                java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList8);
                                                if (!areEqual && !kotlin.jvm.internal.Intrinsics.areEqual(rememberTransition.getTargetState(), scene5)) {
                                                    androidx.navigation3.ui.AnimatedSceneKey animatedSceneKey3 = new androidx.navigation3.ui.AnimatedSceneKey(scene5);
                                                    java.util.List<androidx.navigation3.runtime.NavEntry<T>> entries3 = ((androidx.navigation3.scene.Scene) rememberTransition.getTargetState()).getEntries();
                                                    seekableTransitionState2 = seekableTransitionState3;
                                                    java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries3, 10));
                                                    java.util.Iterator<T> it7 = entries3.iterator();
                                                    while (it7.hasNext()) {
                                                        arrayList9.add(((androidx.navigation3.runtime.NavEntry) it7.next()).getContentKey());
                                                    }
                                                    put = createMapBuilder.put(animatedSceneKey3, kotlin.collections.CollectionsKt.toSet(arrayList9));
                                                } else {
                                                    seekableTransitionState2 = seekableTransitionState3;
                                                    put = createMapBuilder.put(new androidx.navigation3.ui.AnimatedSceneKey(scene5), kotlin.collections.CollectionsKt.toMutableSet(linkedHashSet));
                                                }
                                                linkedHashSet.addAll(set);
                                                i6++;
                                                seekableTransitionState3 = seekableTransitionState2;
                                                currentScene = scene6;
                                                plus = list6;
                                                size = i12;
                                                swipeEdge = i13;
                                                snapshotStateList = snapshotStateList3;
                                            }
                                            i7 = swipeEdge;
                                            snapshotStateList2 = snapshotStateList;
                                            scene = currentScene;
                                            seekableTransitionState = seekableTransitionState3;
                                            if (!areEqual) {
                                                createMapBuilder.put(new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition.getTargetState()), kotlin.collections.SetsKt.emptySet());
                                            }
                                            rememberedValue7 = kotlin.collections.MapsKt.build(createMapBuilder);
                                            startRestartGroup.updateRememberedValue(rememberedValue7);
                                        } else {
                                            i7 = swipeEdge;
                                            snapshotStateMap2 = snapshotStateMap;
                                            mutableObjectFloatMap2 = mutableObjectFloatMap;
                                            snapshotStateList2 = snapshotStateList;
                                            scene = currentScene;
                                            seekableTransitionState = seekableTransitionState3;
                                        }
                                        java.util.Map map2 = (java.util.Map) rememberedValue7;
                                        if (f < f2) {
                                            scene2 = (androidx.navigation3.scene.Scene) rememberTransition.getCurrentState();
                                        } else {
                                            scene2 = (androidx.navigation3.scene.Scene) rememberTransition.getTargetState();
                                        }
                                        if (!z2) {
                                            startRestartGroup.startReplaceGroup(-2006245323);
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(rememberTransition.getCurrentState(), scene3)) {
                                                startRestartGroup.startReplaceGroup(-2006191693);
                                                androidx.compose.animation.core.SeekableTransitionState seekableTransitionState4 = seekableTransitionState;
                                                boolean changedInstance4 = startRestartGroup.changedInstance(seekableTransitionState4);
                                                float f4 = progress;
                                                boolean changed12 = startRestartGroup.changed(f4);
                                                boolean changed13 = startRestartGroup.changed(scene3);
                                                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                                                if ((changedInstance4 | changed12 | changed13) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue12 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$11$1(seekableTransitionState4, f4, scene3, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                                }
                                                androidx.compose.runtime.EffectsKt.LaunchedEffect(scene3, java.lang.Float.valueOf(f4), (kotlin.jvm.functions.Function2) rememberedValue12, startRestartGroup, 0);
                                                startRestartGroup.endReplaceGroup();
                                            } else {
                                                startRestartGroup.startReplaceGroup(-2005987961);
                                                startRestartGroup.endReplaceGroup();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                        } else {
                                            androidx.compose.animation.core.SeekableTransitionState seekableTransitionState5 = seekableTransitionState;
                                            startRestartGroup.startReplaceGroup(-2005910120);
                                            boolean changedInstance5 = startRestartGroup.changedInstance(seekableTransitionState5);
                                            androidx.navigation3.scene.Scene<T> scene7 = scene;
                                            boolean changed14 = startRestartGroup.changed(scene7);
                                            boolean changed15 = startRestartGroup.changed(rememberTransition);
                                            java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                                            if ((changedInstance5 | changed14 | changed15) || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue13 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1(seekableTransitionState5, scene7, rememberTransition, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue13);
                                            }
                                            androidx.compose.runtime.EffectsKt.LaunchedEffect(scene7, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue13, startRestartGroup, 0);
                                            startRestartGroup.endReplaceGroup();
                                        }
                                        changed5 = startRestartGroup.changed(z2);
                                        changed6 = startRestartGroup.changed(scene2);
                                        final int i14 = i7;
                                        changed7 = startRestartGroup.changed(i14);
                                        if (((i5 & 29360128) ^ 12582912) <= 8388608) {
                                            function23 = function24;
                                        } else {
                                            function23 = function24;
                                        }
                                        if ((i5 & 12582912) != 8388608) {
                                            z5 = z9;
                                            z6 = false;
                                            changed8 = startRestartGroup.changed(z5);
                                            if (((i5 & 3670016) ^ 1572864) > 1048576) {
                                                function110 = function19;
                                                map = map2;
                                            } else {
                                                function110 = function19;
                                                map = map2;
                                            }
                                            if ((i5 & 1572864) != 1048576) {
                                                z7 = false;
                                                if (((i5 & 458752) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                                                    function111 = function112;
                                                    if (startRestartGroup.changed(function111)) {
                                                        f3 = f2;
                                                        z8 = true;
                                                        rememberedValue8 = startRestartGroup.rememberedValue();
                                                        if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            final boolean z10 = z2;
                                                            final androidx.navigation3.scene.Scene scene8 = scene2;
                                                            final kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function25 = function23;
                                                            final boolean z11 = z5;
                                                            final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function113 = function110;
                                                            final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function114 = function111;
                                                            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                                                    return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z10, scene8, i14, function25, z11, function113, function114, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue8);
                                                        }
                                                        final kotlin.jvm.functions.Function1 function115 = (kotlin.jvm.functions.Function1) rememberedValue8;
                                                        changed9 = startRestartGroup.changed(function115);
                                                        final float f5 = f3;
                                                        changed10 = startRestartGroup.changed(f5);
                                                        changedInstance2 = startRestartGroup.changedInstance(sizeTransform4);
                                                        rememberedValue9 = startRestartGroup.rememberedValue();
                                                        if (!(changed9 | changed10 | changedInstance2) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                                                    return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f5, sizeTransform4, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue9);
                                                        }
                                                        kotlin.jvm.functions.Function1 function116 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                                        rememberedValue10 = startRestartGroup.rememberedValue();
                                                        if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda11
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                                                    return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighResolutionOutputSizeshNQ4ISI((androidx.navigation3.scene.Scene) obj3);
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue10);
                                                        }
                                                        final java.util.Map map3 = map;
                                                        final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4 = snapshotStateList2;
                                                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function117 = function110;
                                                        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function26 = function23;
                                                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function118 = function111;
                                                        androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition, modifier4, function116, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                                                            @Override // kotlin.jvm.functions.Function4
                                                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList4, map3, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                                            }
                                                        }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                                                        changed11 = startRestartGroup.changed(rememberTransition);
                                                        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap3 = mutableObjectFloatMap2;
                                                        changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap3);
                                                        rememberedValue11 = startRestartGroup.rememberedValue();
                                                        if (!(changed11 | changedInstance3) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition, snapshotStateMap2, mutableObjectFloatMap3, null);
                                                            startRestartGroup.updateRememberedValue(rememberedValue11);
                                                        }
                                                        androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                                                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                                        size2 = snapshotStateList5.size() - 1;
                                                        if (size2 >= 0) {
                                                            while (true) {
                                                                int i15 = size2 - 1;
                                                                final androidx.navigation3.scene.OverlayScene overlayScene = (androidx.navigation3.scene.OverlayScene) snapshotStateList5.get(size2);
                                                                java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                                                                if (rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue14 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                                                }
                                                                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue14;
                                                                startRestartGroup.startMovableGroup(43488003, overlayScene);
                                                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(androidx.view.compose.RememberLifecycleOwnerKt.rememberLifecycleOwner(kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list5), overlayScene) ? androidx.lifecycle.Lifecycle.State.RESUMED : androidx.lifecycle.Lifecycle.State.STARTED, null, startRestartGroup, 0, 2)), androidx.navigation3.scene.SceneSetupNavEntryDecoratorKt.getLocalEntriesToExcludeFromCurrentScene().provides(kotlin.collections.MapsKt.getValue(map3, new androidx.navigation3.ui.AnimatedSceneKey(overlayScene))), androidx.navigation3.scene.SharedEntryInSceneNavEntryDecoratorKt.getLocalCurrentScene().provides(overlayScene)}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1656080439, true, new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda13
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.Camera2StreamConfigurationMap(androidx.navigation3.scene.OverlayScene.this, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                                                                    }
                                                                }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                                                                startRestartGroup.endMovableGroup();
                                                                java.util.List<androidx.navigation3.scene.OverlayScene<T>> list7 = list5;
                                                                if (!list7.contains(overlayScene)) {
                                                                    startRestartGroup.startReplaceGroup(1349001520);
                                                                    boolean changed16 = startRestartGroup.changed(overlayScene);
                                                                    java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                                                                    if (changed16 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                                        obj = null;
                                                                        rememberedValue15 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$17$2$1(overlayScene, snapshotStateList4, null);
                                                                        startRestartGroup.updateRememberedValue(rememberedValue15);
                                                                    } else {
                                                                        obj = null;
                                                                    }
                                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, (kotlin.jvm.functions.Function2) rememberedValue15, 3, null);
                                                                    startRestartGroup.endReplaceGroup();
                                                                } else {
                                                                    startRestartGroup.startReplaceGroup(1349145670);
                                                                    startRestartGroup.endReplaceGroup();
                                                                }
                                                                if (i15 < 0) {
                                                                    break;
                                                                }
                                                                size2 = i15;
                                                                list5 = list7;
                                                            }
                                                        }
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        }
                                                        alignment3 = alignment5;
                                                        sizeTransform3 = sizeTransform4;
                                                        function16 = function118;
                                                        modifier3 = modifier4;
                                                        function22 = function26;
                                                        function15 = function117;
                                                    }
                                                } else {
                                                    function111 = function112;
                                                }
                                                f3 = f2;
                                                if ((i5 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                                    z8 = false;
                                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                                    if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8)) {
                                                    }
                                                    final boolean z102 = z2;
                                                    final androidx.navigation3.scene.Scene scene82 = scene2;
                                                    final kotlin.jvm.functions.Function2 function252 = function23;
                                                    final boolean z112 = z5;
                                                    final kotlin.jvm.functions.Function1 function1132 = function110;
                                                    final kotlin.jvm.functions.Function1 function1142 = function111;
                                                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj3) {
                                                            return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z102, scene82, i14, function252, z112, function1132, function1142, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                                    final kotlin.jvm.functions.Function1 function1152 = (kotlin.jvm.functions.Function1) rememberedValue8;
                                                    changed9 = startRestartGroup.changed(function1152);
                                                    final float f52 = f3;
                                                    changed10 = startRestartGroup.changed(f52);
                                                    changedInstance2 = startRestartGroup.changedInstance(sizeTransform4);
                                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                                    if (!(changed9 | changed10 | changedInstance2)) {
                                                    }
                                                    rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj3) {
                                                            return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f52, sizeTransform4, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                                    kotlin.jvm.functions.Function1 function1162 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                                    rememberedValue10 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    }
                                                    final java.util.Map map32 = map;
                                                    final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList42 = snapshotStateList2;
                                                    kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1172 = function110;
                                                    kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function262 = function23;
                                                    kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1182 = function111;
                                                    androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition, modifier4, function1162, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                                                        @Override // kotlin.jvm.functions.Function4
                                                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                                            return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList42, map32, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                                        }
                                                    }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                                                    changed11 = startRestartGroup.changed(rememberTransition);
                                                    androidx.collection.MutableObjectFloatMap mutableObjectFloatMap32 = mutableObjectFloatMap2;
                                                    changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap32);
                                                    rememberedValue11 = startRestartGroup.rememberedValue();
                                                    if (!(changed11 | changedInstance3)) {
                                                    }
                                                    rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition, snapshotStateMap2, mutableObjectFloatMap32, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                                                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList52 = snapshotStateList42;
                                                    size2 = snapshotStateList52.size() - 1;
                                                    if (size2 >= 0) {
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    }
                                                    alignment3 = alignment5;
                                                    sizeTransform3 = sizeTransform4;
                                                    function16 = function1182;
                                                    modifier3 = modifier4;
                                                    function22 = function262;
                                                    function15 = function1172;
                                                }
                                                z8 = true;
                                                rememberedValue8 = startRestartGroup.rememberedValue();
                                                if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8)) {
                                                }
                                                final boolean z1022 = z2;
                                                final androidx.navigation3.scene.Scene scene822 = scene2;
                                                final kotlin.jvm.functions.Function2 function2522 = function23;
                                                final boolean z1122 = z5;
                                                final kotlin.jvm.functions.Function1 function11322 = function110;
                                                final kotlin.jvm.functions.Function1 function11422 = function111;
                                                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z1022, scene822, i14, function2522, z1122, function11322, function11422, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                                final kotlin.jvm.functions.Function1 function11522 = (kotlin.jvm.functions.Function1) rememberedValue8;
                                                changed9 = startRestartGroup.changed(function11522);
                                                final float f522 = f3;
                                                changed10 = startRestartGroup.changed(f522);
                                                changedInstance2 = startRestartGroup.changedInstance(sizeTransform4);
                                                rememberedValue9 = startRestartGroup.rememberedValue();
                                                if (!(changed9 | changed10 | changedInstance2)) {
                                                }
                                                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f522, sizeTransform4, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                                kotlin.jvm.functions.Function1 function11622 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                                rememberedValue10 = startRestartGroup.rememberedValue();
                                                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                }
                                                final java.util.Map map322 = map;
                                                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList422 = snapshotStateList2;
                                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function11722 = function110;
                                                kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2622 = function23;
                                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function11822 = function111;
                                                androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition, modifier4, function11622, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                                                    @Override // kotlin.jvm.functions.Function4
                                                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList422, map322, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                                    }
                                                }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                                                changed11 = startRestartGroup.changed(rememberTransition);
                                                androidx.collection.MutableObjectFloatMap mutableObjectFloatMap322 = mutableObjectFloatMap2;
                                                changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap322);
                                                rememberedValue11 = startRestartGroup.rememberedValue();
                                                if (!(changed11 | changedInstance3)) {
                                                }
                                                rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition, snapshotStateMap2, mutableObjectFloatMap322, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue11);
                                                androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList522 = snapshotStateList422;
                                                size2 = snapshotStateList522.size() - 1;
                                                if (size2 >= 0) {
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                }
                                                alignment3 = alignment5;
                                                sizeTransform3 = sizeTransform4;
                                                function16 = function11822;
                                                modifier3 = modifier4;
                                                function22 = function2622;
                                                function15 = function11722;
                                            }
                                            z7 = true;
                                            if (((i5 & 458752) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                                            }
                                            f3 = f2;
                                            if ((i5 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                            }
                                            z8 = true;
                                            rememberedValue8 = startRestartGroup.rememberedValue();
                                            if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8)) {
                                            }
                                            final boolean z10222 = z2;
                                            final androidx.navigation3.scene.Scene scene8222 = scene2;
                                            final kotlin.jvm.functions.Function2 function25222 = function23;
                                            final boolean z11222 = z5;
                                            final kotlin.jvm.functions.Function1 function113222 = function110;
                                            final kotlin.jvm.functions.Function1 function114222 = function111;
                                            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                                    return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z10222, scene8222, i14, function25222, z11222, function113222, function114222, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue8);
                                            final kotlin.jvm.functions.Function1 function115222 = (kotlin.jvm.functions.Function1) rememberedValue8;
                                            changed9 = startRestartGroup.changed(function115222);
                                            final float f5222 = f3;
                                            changed10 = startRestartGroup.changed(f5222);
                                            changedInstance2 = startRestartGroup.changedInstance(sizeTransform4);
                                            rememberedValue9 = startRestartGroup.rememberedValue();
                                            if (!(changed9 | changed10 | changedInstance2)) {
                                            }
                                            rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                                    return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f5222, sizeTransform4, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue9);
                                            kotlin.jvm.functions.Function1 function116222 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                            rememberedValue10 = startRestartGroup.rememberedValue();
                                            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            }
                                            final java.util.Map map3222 = map;
                                            final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4222 = snapshotStateList2;
                                            kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function117222 = function110;
                                            kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function26222 = function23;
                                            kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function118222 = function111;
                                            androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition, modifier4, function116222, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                                                @Override // kotlin.jvm.functions.Function4
                                                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                                    return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList4222, map3222, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                                }
                                            }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                                            changed11 = startRestartGroup.changed(rememberTransition);
                                            androidx.collection.MutableObjectFloatMap mutableObjectFloatMap3222 = mutableObjectFloatMap2;
                                            changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap3222);
                                            rememberedValue11 = startRestartGroup.rememberedValue();
                                            if (!(changed11 | changedInstance3)) {
                                            }
                                            rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition, snapshotStateMap2, mutableObjectFloatMap3222, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue11);
                                            androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                                            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList5222 = snapshotStateList4222;
                                            size2 = snapshotStateList5222.size() - 1;
                                            if (size2 >= 0) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            alignment3 = alignment5;
                                            sizeTransform3 = sizeTransform4;
                                            function16 = function118222;
                                            modifier3 = modifier4;
                                            function22 = function26222;
                                            function15 = function117222;
                                        }
                                        z5 = z9;
                                        z6 = true;
                                        changed8 = startRestartGroup.changed(z5);
                                        if (((i5 & 3670016) ^ 1572864) > 1048576) {
                                        }
                                        if ((i5 & 1572864) != 1048576) {
                                        }
                                        z7 = true;
                                        if (((i5 & 458752) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                                        }
                                        f3 = f2;
                                        if ((i5 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                        }
                                        z8 = true;
                                        rememberedValue8 = startRestartGroup.rememberedValue();
                                        if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8)) {
                                        }
                                        final boolean z102222 = z2;
                                        final androidx.navigation3.scene.Scene scene82222 = scene2;
                                        final kotlin.jvm.functions.Function2 function252222 = function23;
                                        final boolean z112222 = z5;
                                        final kotlin.jvm.functions.Function1 function1132222 = function110;
                                        final kotlin.jvm.functions.Function1 function1142222 = function111;
                                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z102222, scene82222, i14, function252222, z112222, function1132222, function1142222, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                        final kotlin.jvm.functions.Function1 function1152222 = (kotlin.jvm.functions.Function1) rememberedValue8;
                                        changed9 = startRestartGroup.changed(function1152222);
                                        final float f52222 = f3;
                                        changed10 = startRestartGroup.changed(f52222);
                                        changedInstance2 = startRestartGroup.changedInstance(sizeTransform4);
                                        rememberedValue9 = startRestartGroup.rememberedValue();
                                        if (!(changed9 | changed10 | changedInstance2)) {
                                        }
                                        rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f52222, sizeTransform4, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                        kotlin.jvm.functions.Function1 function1162222 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                        rememberedValue10 = startRestartGroup.rememberedValue();
                                        if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        }
                                        final java.util.Map map32222 = map;
                                        final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList42222 = snapshotStateList2;
                                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1172222 = function110;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function262222 = function23;
                                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1182222 = function111;
                                        androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition, modifier4, function1162222, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                                            @Override // kotlin.jvm.functions.Function4
                                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList42222, map32222, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                                        changed11 = startRestartGroup.changed(rememberTransition);
                                        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap32222 = mutableObjectFloatMap2;
                                        changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap32222);
                                        rememberedValue11 = startRestartGroup.rememberedValue();
                                        if (!(changed11 | changedInstance3)) {
                                        }
                                        rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition, snapshotStateMap2, mutableObjectFloatMap32222, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                        androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList52222 = snapshotStateList42222;
                                        size2 = snapshotStateList52222.size() - 1;
                                        if (size2 >= 0) {
                                        }
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        }
                                        alignment3 = alignment5;
                                        sizeTransform3 = sizeTransform4;
                                        function16 = function1182222;
                                        modifier3 = modifier4;
                                        function22 = function262222;
                                        function15 = function1172222;
                                    }
                                }
                                z4 = false;
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                snapshotStateMap = (androidx.compose.runtime.snapshots.SnapshotStateMap) rememberedValue3;
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                mutableObjectFloatMap = (androidx.collection.MutableObjectFloatMap) rememberedValue4;
                                animatedSceneKey = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition.getCurrentState());
                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1122 = function18;
                                animatedSceneKey2 = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition.getTargetState());
                                findKeyIndex = mutableObjectFloatMap.findKeyIndex(animatedSceneKey);
                                if (findKeyIndex < 0) {
                                }
                                if (z2) {
                                }
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(animatedSceneKey, animatedSceneKey2)) {
                                }
                                boolean z92 = z4;
                                snapshotStateMap.put(animatedSceneKey2, rememberTransition.getTargetState());
                                mutableObjectFloatMap.set(animatedSceneKey2, f2);
                                java.util.List<androidx.navigation3.scene.OverlayScene<T>> overlayScenes2 = sceneState.getOverlayScenes();
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue5;
                                changedInstance = startRestartGroup.changedInstance(overlayScenes2);
                                kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function242 = defaultPredictivePopTransitionSpec;
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (!changedInstance) {
                                }
                                rememberedValue6 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1(overlayScenes2, snapshotStateList, null);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(overlayScenes2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                                java.lang.Object list32 = kotlin.collections.CollectionsKt.toList(snapshotStateMap.entrySet());
                                java.lang.Object list42 = snapshotStateList.toList();
                                java.util.List<androidx.navigation3.scene.OverlayScene<T>> list52 = overlayScenes2;
                                java.lang.Object obj22 = mutableObjectFloatMap.toString();
                                changed2 = startRestartGroup.changed(list32);
                                changed3 = startRestartGroup.changed(list42);
                                changed4 = startRestartGroup.changed(obj22);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (!(changed4 | changed2 | changed3)) {
                                }
                                java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
                                java.util.ArrayList arrayList52 = new java.util.ArrayList();
                                java.util.List sortedWith2 = kotlin.collections.CollectionsKt.sortedWith(snapshotStateMap.entrySet(), new java.util.Comparator() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$lambda$19$0$$inlined$sortedByDescending$1
                                    @Override // java.util.Comparator
                                    public final int compare(T t2, T t22) {
                                        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t22).getKey())), java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t2).getKey())));
                                    }
                                });
                                snapshotStateMap2 = snapshotStateMap;
                                mutableObjectFloatMap2 = mutableObjectFloatMap;
                                java.util.ArrayList<androidx.navigation3.scene.Scene> arrayList62 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith2, 10));
                                it3 = sortedWith2.iterator();
                                while (it3.hasNext()) {
                                }
                                while (r4.hasNext()) {
                                }
                                java.util.List plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection) snapshotStateList, (java.lang.Iterable) arrayList52);
                                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(rememberTransition.getTargetState(), kotlin.collections.CollectionsKt.first((java.util.List) arrayList52));
                                size = plus2.size();
                                i6 = 0;
                                while (i6 < size) {
                                }
                                i7 = swipeEdge;
                                snapshotStateList2 = snapshotStateList;
                                scene = currentScene;
                                seekableTransitionState = seekableTransitionState3;
                                if (!areEqual) {
                                }
                                rememberedValue7 = kotlin.collections.MapsKt.build(createMapBuilder2);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                                java.util.Map map22 = (java.util.Map) rememberedValue7;
                                if (f < f2) {
                                }
                                if (!z2) {
                                }
                                changed5 = startRestartGroup.changed(z2);
                                changed6 = startRestartGroup.changed(scene2);
                                final int i142 = i7;
                                changed7 = startRestartGroup.changed(i142);
                                if (((i5 & 29360128) ^ 12582912) <= 8388608) {
                                }
                                if ((i5 & 12582912) != 8388608) {
                                }
                                z5 = z92;
                                z6 = true;
                                changed8 = startRestartGroup.changed(z5);
                                if (((i5 & 3670016) ^ 1572864) > 1048576) {
                                }
                                if ((i5 & 1572864) != 1048576) {
                                }
                                z7 = true;
                                if (((i5 & 458752) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                                }
                                f3 = f2;
                                if ((i5 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                }
                                z8 = true;
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8)) {
                                }
                                final boolean z1022222 = z2;
                                final androidx.navigation3.scene.Scene scene822222 = scene2;
                                final kotlin.jvm.functions.Function2 function2522222 = function23;
                                final boolean z1122222 = z5;
                                final kotlin.jvm.functions.Function1 function11322222 = function110;
                                final kotlin.jvm.functions.Function1 function11422222 = function111;
                                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z1022222, scene822222, i142, function2522222, z1122222, function11322222, function11422222, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                final kotlin.jvm.functions.Function1 function11522222 = (kotlin.jvm.functions.Function1) rememberedValue8;
                                changed9 = startRestartGroup.changed(function11522222);
                                final float f522222 = f3;
                                changed10 = startRestartGroup.changed(f522222);
                                changedInstance2 = startRestartGroup.changedInstance(sizeTransform4);
                                rememberedValue9 = startRestartGroup.rememberedValue();
                                if (!(changed9 | changed10 | changedInstance2)) {
                                }
                                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f522222, sizeTransform4, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                kotlin.jvm.functions.Function1 function11622222 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                rememberedValue10 = startRestartGroup.rememberedValue();
                                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                final java.util.Map map322222 = map;
                                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList422222 = snapshotStateList2;
                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function11722222 = function110;
                                kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2622222 = function23;
                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function11822222 = function111;
                                androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition, modifier4, function11622222, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function4
                                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList422222, map322222, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                                changed11 = startRestartGroup.changed(rememberTransition);
                                androidx.collection.MutableObjectFloatMap mutableObjectFloatMap322222 = mutableObjectFloatMap2;
                                changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap322222);
                                rememberedValue11 = startRestartGroup.rememberedValue();
                                if (!(changed11 | changedInstance3)) {
                                }
                                rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition, snapshotStateMap2, mutableObjectFloatMap322222, null);
                                startRestartGroup.updateRememberedValue(rememberedValue11);
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList522222 = snapshotStateList422222;
                                size2 = snapshotStateList522222.size() - 1;
                                if (size2 >= 0) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                alignment3 = alignment5;
                                sizeTransform3 = sizeTransform4;
                                function16 = function11822222;
                                modifier3 = modifier4;
                                function22 = function2622222;
                                function15 = function11722222;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                            }
                        }
                        alignment4 = alignment2;
                        function17 = function14;
                        function18 = function13;
                        defaultPredictivePopTransitionSpec = function2;
                        i5 = i10;
                        final androidx.compose.animation.SizeTransform sizeTransform42 = sizeTransform2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        androidx.navigation3.scene.Scene<T> currentScene2 = sceneState.getCurrentScene();
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        androidx.compose.animation.core.SeekableTransitionState seekableTransitionState32 = (androidx.compose.animation.core.SeekableTransitionState) rememberedValue;
                        final androidx.compose.animation.core.Transition rememberTransition2 = androidx.compose.animation.core.TransitionKt.rememberTransition(seekableTransitionState32, "scene", startRestartGroup, androidx.compose.animation.core.SeekableTransitionState.$stable | 48, 0);
                        changed = startRestartGroup.changed((androidx.navigation3.scene.Scene) rememberTransition2.getCurrentState());
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = kotlin.collections.CollectionsKt.toList(sceneState.getEntries());
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        java.util.List list8 = (java.util.List) rememberedValue2;
                        androidx.navigation3.scene.Scene scene32 = (androidx.navigation3.scene.Scene) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) sceneState.getPreviousScenes());
                        androidx.view.NavigationEventTransitionState transitionState2 = navigationEventState.getTransitionState();
                        z = transitionState2 instanceof androidx.navigationevent.NavigationEventTransitionState.InProgress;
                        if (z) {
                        }
                        alignment5 = alignment4;
                        z2 = false;
                        z3 = transitionState2 instanceof androidx.navigationevent.NavigationEventTransitionState.Idle;
                        androidx.compose.ui.Modifier modifier42 = modifier2;
                        if (!z3) {
                        }
                        if (!z3) {
                        }
                        java.util.List list22 = list8;
                        java.util.ArrayList arrayList32 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list22, 10));
                        it = list22.iterator();
                        while (it.hasNext()) {
                        }
                        arrayList = arrayList32;
                        java.util.List<androidx.navigation3.runtime.NavEntry<T>> entries4 = sceneState.getEntries();
                        java.util.ArrayList arrayList42 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries4, 10));
                        it2 = entries4.iterator();
                        while (it2.hasNext()) {
                        }
                        arrayList2 = arrayList42;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.first((java.util.List) arrayList), kotlin.collections.CollectionsKt.first((java.util.List) arrayList2))) {
                            it4 = kotlin.collections.CollectionsKt.getIndices(arrayList2).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                }
                                it4 = it5;
                            }
                            if (num == null) {
                                z4 = true;
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                snapshotStateMap = (androidx.compose.runtime.snapshots.SnapshotStateMap) rememberedValue3;
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                mutableObjectFloatMap = (androidx.collection.MutableObjectFloatMap) rememberedValue4;
                                animatedSceneKey = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition2.getCurrentState());
                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function11222 = function18;
                                animatedSceneKey2 = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition2.getTargetState());
                                findKeyIndex = mutableObjectFloatMap.findKeyIndex(animatedSceneKey);
                                if (findKeyIndex < 0) {
                                }
                                if (z2) {
                                }
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(animatedSceneKey, animatedSceneKey2)) {
                                }
                                boolean z922 = z4;
                                snapshotStateMap.put(animatedSceneKey2, rememberTransition2.getTargetState());
                                mutableObjectFloatMap.set(animatedSceneKey2, f2);
                                java.util.List<androidx.navigation3.scene.OverlayScene<T>> overlayScenes22 = sceneState.getOverlayScenes();
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue5;
                                changedInstance = startRestartGroup.changedInstance(overlayScenes22);
                                kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2422 = defaultPredictivePopTransitionSpec;
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (!changedInstance) {
                                }
                                rememberedValue6 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1(overlayScenes22, snapshotStateList, null);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(overlayScenes22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                                java.lang.Object list322 = kotlin.collections.CollectionsKt.toList(snapshotStateMap.entrySet());
                                java.lang.Object list422 = snapshotStateList.toList();
                                java.util.List<androidx.navigation3.scene.OverlayScene<T>> list522 = overlayScenes22;
                                java.lang.Object obj222 = mutableObjectFloatMap.toString();
                                changed2 = startRestartGroup.changed(list322);
                                changed3 = startRestartGroup.changed(list422);
                                changed4 = startRestartGroup.changed(obj222);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (!(changed4 | changed2 | changed3)) {
                                }
                                java.util.Map createMapBuilder22 = kotlin.collections.MapsKt.createMapBuilder();
                                java.util.ArrayList arrayList522 = new java.util.ArrayList();
                                java.util.List sortedWith22 = kotlin.collections.CollectionsKt.sortedWith(snapshotStateMap.entrySet(), new java.util.Comparator() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$lambda$19$0$$inlined$sortedByDescending$1
                                    @Override // java.util.Comparator
                                    public final int compare(T t2, T t22) {
                                        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t22).getKey())), java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t2).getKey())));
                                    }
                                });
                                snapshotStateMap2 = snapshotStateMap;
                                mutableObjectFloatMap2 = mutableObjectFloatMap;
                                java.util.ArrayList<androidx.navigation3.scene.Scene> arrayList622 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith22, 10));
                                it3 = sortedWith22.iterator();
                                while (it3.hasNext()) {
                                }
                                while (r4.hasNext()) {
                                }
                                java.util.List plus22 = kotlin.collections.CollectionsKt.plus((java.util.Collection) snapshotStateList, (java.lang.Iterable) arrayList522);
                                java.util.LinkedHashSet linkedHashSet22 = new java.util.LinkedHashSet();
                                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(rememberTransition2.getTargetState(), kotlin.collections.CollectionsKt.first((java.util.List) arrayList522));
                                size = plus22.size();
                                i6 = 0;
                                while (i6 < size) {
                                }
                                i7 = swipeEdge;
                                snapshotStateList2 = snapshotStateList;
                                scene = currentScene2;
                                seekableTransitionState = seekableTransitionState32;
                                if (!areEqual) {
                                }
                                rememberedValue7 = kotlin.collections.MapsKt.build(createMapBuilder22);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                                java.util.Map map222 = (java.util.Map) rememberedValue7;
                                if (f < f2) {
                                }
                                if (!z2) {
                                }
                                changed5 = startRestartGroup.changed(z2);
                                changed6 = startRestartGroup.changed(scene2);
                                final int i1422 = i7;
                                changed7 = startRestartGroup.changed(i1422);
                                if (((i5 & 29360128) ^ 12582912) <= 8388608) {
                                }
                                if ((i5 & 12582912) != 8388608) {
                                }
                                z5 = z922;
                                z6 = true;
                                changed8 = startRestartGroup.changed(z5);
                                if (((i5 & 3670016) ^ 1572864) > 1048576) {
                                }
                                if ((i5 & 1572864) != 1048576) {
                                }
                                z7 = true;
                                if (((i5 & 458752) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                                }
                                f3 = f2;
                                if ((i5 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                }
                                z8 = true;
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8)) {
                                }
                                final boolean z10222222 = z2;
                                final androidx.navigation3.scene.Scene scene8222222 = scene2;
                                final kotlin.jvm.functions.Function2 function25222222 = function23;
                                final boolean z11222222 = z5;
                                final kotlin.jvm.functions.Function1 function113222222 = function110;
                                final kotlin.jvm.functions.Function1 function114222222 = function111;
                                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z10222222, scene8222222, i1422, function25222222, z11222222, function113222222, function114222222, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                final kotlin.jvm.functions.Function1 function115222222 = (kotlin.jvm.functions.Function1) rememberedValue8;
                                changed9 = startRestartGroup.changed(function115222222);
                                final float f5222222 = f3;
                                changed10 = startRestartGroup.changed(f5222222);
                                changedInstance2 = startRestartGroup.changedInstance(sizeTransform42);
                                rememberedValue9 = startRestartGroup.rememberedValue();
                                if (!(changed9 | changed10 | changedInstance2)) {
                                }
                                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f5222222, sizeTransform42, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                kotlin.jvm.functions.Function1 function116222222 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                rememberedValue10 = startRestartGroup.rememberedValue();
                                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                final java.util.Map map3222222 = map;
                                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4222222 = snapshotStateList2;
                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function117222222 = function110;
                                kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function26222222 = function23;
                                kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function118222222 = function111;
                                androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition2, modifier42, function116222222, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function4
                                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                        return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList4222222, map3222222, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                                changed11 = startRestartGroup.changed(rememberTransition2);
                                androidx.collection.MutableObjectFloatMap mutableObjectFloatMap3222222 = mutableObjectFloatMap2;
                                changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap3222222);
                                rememberedValue11 = startRestartGroup.rememberedValue();
                                if (!(changed11 | changedInstance3)) {
                                }
                                rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition2, snapshotStateMap2, mutableObjectFloatMap3222222, null);
                                startRestartGroup.updateRememberedValue(rememberedValue11);
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList5222222 = snapshotStateList4222222;
                                size2 = snapshotStateList5222222.size() - 1;
                                if (size2 >= 0) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                alignment3 = alignment5;
                                sizeTransform3 = sizeTransform42;
                                function16 = function118222222;
                                modifier3 = modifier42;
                                function22 = function26222222;
                                function15 = function117222222;
                            }
                        }
                        z4 = false;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        snapshotStateMap = (androidx.compose.runtime.snapshots.SnapshotStateMap) rememberedValue3;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        mutableObjectFloatMap = (androidx.collection.MutableObjectFloatMap) rememberedValue4;
                        animatedSceneKey = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition2.getCurrentState());
                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function112222 = function18;
                        animatedSceneKey2 = new androidx.navigation3.ui.AnimatedSceneKey((androidx.navigation3.scene.Scene) rememberTransition2.getTargetState());
                        findKeyIndex = mutableObjectFloatMap.findKeyIndex(animatedSceneKey);
                        if (findKeyIndex < 0) {
                        }
                        if (z2) {
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(animatedSceneKey, animatedSceneKey2)) {
                        }
                        boolean z9222 = z4;
                        snapshotStateMap.put(animatedSceneKey2, rememberTransition2.getTargetState());
                        mutableObjectFloatMap.set(animatedSceneKey2, f2);
                        java.util.List<androidx.navigation3.scene.OverlayScene<T>> overlayScenes222 = sceneState.getOverlayScenes();
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue5;
                        changedInstance = startRestartGroup.changedInstance(overlayScenes222);
                        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function24222 = defaultPredictivePopTransitionSpec;
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue6 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1(overlayScenes222, snapshotStateList, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(overlayScenes222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                        java.lang.Object list3222 = kotlin.collections.CollectionsKt.toList(snapshotStateMap.entrySet());
                        java.lang.Object list4222 = snapshotStateList.toList();
                        java.util.List<androidx.navigation3.scene.OverlayScene<T>> list5222 = overlayScenes222;
                        java.lang.Object obj2222 = mutableObjectFloatMap.toString();
                        changed2 = startRestartGroup.changed(list3222);
                        changed3 = startRestartGroup.changed(list4222);
                        changed4 = startRestartGroup.changed(obj2222);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!(changed4 | changed2 | changed3)) {
                        }
                        java.util.Map createMapBuilder222 = kotlin.collections.MapsKt.createMapBuilder();
                        java.util.ArrayList arrayList5222 = new java.util.ArrayList();
                        java.util.List sortedWith222 = kotlin.collections.CollectionsKt.sortedWith(snapshotStateMap.entrySet(), new java.util.Comparator() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$lambda$19$0$$inlined$sortedByDescending$1
                            @Override // java.util.Comparator
                            public final int compare(T t2, T t22) {
                                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t22).getKey())), java.lang.Float.valueOf(androidx.collection.MutableObjectFloatMap.this.get(((java.util.Map.Entry) t2).getKey())));
                            }
                        });
                        snapshotStateMap2 = snapshotStateMap;
                        mutableObjectFloatMap2 = mutableObjectFloatMap;
                        java.util.ArrayList<androidx.navigation3.scene.Scene> arrayList6222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith222, 10));
                        it3 = sortedWith222.iterator();
                        while (it3.hasNext()) {
                        }
                        while (r4.hasNext()) {
                        }
                        java.util.List plus222 = kotlin.collections.CollectionsKt.plus((java.util.Collection) snapshotStateList, (java.lang.Iterable) arrayList5222);
                        java.util.LinkedHashSet linkedHashSet222 = new java.util.LinkedHashSet();
                        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(rememberTransition2.getTargetState(), kotlin.collections.CollectionsKt.first((java.util.List) arrayList5222));
                        size = plus222.size();
                        i6 = 0;
                        while (i6 < size) {
                        }
                        i7 = swipeEdge;
                        snapshotStateList2 = snapshotStateList;
                        scene = currentScene2;
                        seekableTransitionState = seekableTransitionState32;
                        if (!areEqual) {
                        }
                        rememberedValue7 = kotlin.collections.MapsKt.build(createMapBuilder222);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                        java.util.Map map2222 = (java.util.Map) rememberedValue7;
                        if (f < f2) {
                        }
                        if (!z2) {
                        }
                        changed5 = startRestartGroup.changed(z2);
                        changed6 = startRestartGroup.changed(scene2);
                        final int i14222 = i7;
                        changed7 = startRestartGroup.changed(i14222);
                        if (((i5 & 29360128) ^ 12582912) <= 8388608) {
                        }
                        if ((i5 & 12582912) != 8388608) {
                        }
                        z5 = z9222;
                        z6 = true;
                        changed8 = startRestartGroup.changed(z5);
                        if (((i5 & 3670016) ^ 1572864) > 1048576) {
                        }
                        if ((i5 & 1572864) != 1048576) {
                        }
                        z7 = true;
                        if (((i5 & 458752) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                        }
                        f3 = f2;
                        if ((i5 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                        }
                        z8 = true;
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!(z7 | changed5 | changed6 | changed7 | z6 | changed8 | z8)) {
                        }
                        final boolean z102222222 = z2;
                        final androidx.navigation3.scene.Scene scene82222222 = scene2;
                        final kotlin.jvm.functions.Function2 function252222222 = function23;
                        final boolean z112222222 = z5;
                        final kotlin.jvm.functions.Function1 function1132222222 = function110;
                        final kotlin.jvm.functions.Function1 function1142222222 = function111;
                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(z102222222, scene82222222, i14222, function252222222, z112222222, function1132222222, function1142222222, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                        final kotlin.jvm.functions.Function1 function1152222222 = (kotlin.jvm.functions.Function1) rememberedValue8;
                        changed9 = startRestartGroup.changed(function1152222222);
                        final float f52222222 = f3;
                        changed10 = startRestartGroup.changed(f52222222);
                        changedInstance2 = startRestartGroup.changedInstance(sizeTransform42);
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (!(changed9 | changed10 | changedInstance2)) {
                        }
                        rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, f52222222, sizeTransform42, (androidx.compose.animation.AnimatedContentTransitionScope) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                        kotlin.jvm.functions.Function1 function1162222222 = (kotlin.jvm.functions.Function1) rememberedValue9;
                        rememberedValue10 = startRestartGroup.rememberedValue();
                        if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        final java.util.Map map32222222 = map;
                        final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList42222222 = snapshotStateList2;
                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1172222222 = function110;
                        kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function262222222 = function23;
                        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1182222222 = function111;
                        androidx.compose.animation.AnimatedContentKt.AnimatedContent(rememberTransition2, modifier42, function1162222222, alignment5, (kotlin.jvm.functions.Function1) rememberedValue10, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1167420988, true, new kotlin.jvm.functions.Function4() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function4
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.this, snapshotStateList42222222, map32222222, (androidx.compose.animation.AnimatedContentScope) obj3, (androidx.navigation3.scene.Scene) obj4, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i5 >> 3) & 112) | 221184 | (i5 & 7168), 0);
                        changed11 = startRestartGroup.changed(rememberTransition2);
                        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap32222222 = mutableObjectFloatMap2;
                        changedInstance3 = startRestartGroup.changedInstance(mutableObjectFloatMap32222222);
                        rememberedValue11 = startRestartGroup.rememberedValue();
                        if (!(changed11 | changedInstance3)) {
                        }
                        rememberedValue11 = (kotlin.jvm.functions.Function2) new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(rememberTransition2, snapshotStateMap2, mutableObjectFloatMap32222222, null);
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberTransition2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 0);
                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList52222222 = snapshotStateList42222222;
                        size2 = snapshotStateList52222222.size() - 1;
                        if (size2 >= 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        alignment3 = alignment5;
                        sizeTransform3 = sizeTransform42;
                        function16 = function1182222222;
                        modifier3 = modifier42;
                        function22 = function262222222;
                        function15 = function1172222222;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function22 = function2;
                        modifier3 = modifier2;
                        alignment3 = alignment2;
                        sizeTransform3 = sizeTransform2;
                        function15 = function14;
                        function16 = function13;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.Camera2StreamConfigurationMap(androidx.navigation3.scene.SceneState.this, navigationEventState, modifier3, alignment3, sizeTransform3, function16, function15, function22, i, i2, (androidx.compose.runtime.Composer) obj3);
                            }
                        });
                        return;
                    }
                    return;
                }
                sizeTransform2 = sizeTransform;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i10 & 4793491) == 4793490, i10 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            sizeTransform2 = sizeTransform;
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i10 & 4793491) == 4793490, i10 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        alignment2 = alignment;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        sizeTransform2 = sizeTransform;
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i10 & 4793491) == 4793490, i10 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, java.util.List list2, java.util.List list3, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        androidx.navigation3.ui.NavDisplayKt.NavDisplay(list, modifier, alignment, list2, list3, sharedTransitionScope, sizeTransform, function1, function12, function2, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.util.List list, androidx.navigation3.scene.Scene scene, kotlin.jvm.functions.Function0 function0) {
        int size = list.size();
        int size2 = scene.getPreviousEntries().size();
        for (int i = 0; i < size - size2; i++) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.navigation3.scene.Scene scene) {
        return new androidx.navigation3.ui.AnimatedSceneKey(scene);
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.navigation3.scene.OverlayScene overlayScene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1656080439, i, -1, "androidx.navigation3.ui.NavDisplay.<anonymous>.<anonymous>.<anonymous> (NavDisplay.kt:899)");
            }
            overlayScene.getContent().invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.navigation3.scene.Scene scene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1734941436, i, -1, "androidx.navigation3.ui.NavDisplay.<anonymous>.<anonymous> (NavDisplay.kt:860)");
            }
            scene.getContent().invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.animation.ContentTransform getHighSpeedVideoSizes(boolean z, androidx.navigation3.scene.Scene scene, int i, kotlin.jvm.functions.Function2 function2, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope) {
        androidx.compose.animation.ContentTransform contentTransform;
        androidx.compose.animation.ContentTransform contentTransform2;
        androidx.compose.animation.ContentTransform contentTransform3;
        if (z) {
            java.lang.Object obj = androidx.navigation3.runtime.NavMetadataKt.get(scene.getMetadata(), androidx.navigation3.ui.NavDisplay.PredictivePopTransitionKey.INSTANCE);
            kotlin.jvm.functions.Function2 function22 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(obj, 2) ? (kotlin.jvm.functions.Function2) obj : null;
            return (function22 == null || (contentTransform3 = (androidx.compose.animation.ContentTransform) function22.invoke(animatedContentTransitionScope, java.lang.Integer.valueOf(i))) == null) ? (androidx.compose.animation.ContentTransform) function2.invoke(animatedContentTransitionScope, java.lang.Integer.valueOf(i)) : contentTransform3;
        }
        if (z2) {
            java.lang.Object obj2 = androidx.navigation3.runtime.NavMetadataKt.get(scene.getMetadata(), androidx.navigation3.ui.NavDisplay.PopTransitionKey.INSTANCE);
            kotlin.jvm.functions.Function1 function13 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(obj2, 1) ? (kotlin.jvm.functions.Function1) obj2 : null;
            return (function13 == null || (contentTransform2 = (androidx.compose.animation.ContentTransform) function13.invoke(animatedContentTransitionScope)) == null) ? (androidx.compose.animation.ContentTransform) function1.invoke(animatedContentTransitionScope) : contentTransform2;
        }
        java.lang.Object obj3 = androidx.navigation3.runtime.NavMetadataKt.get(scene.getMetadata(), androidx.navigation3.ui.NavDisplay.TransitionKey.INSTANCE);
        kotlin.jvm.functions.Function1 function14 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(obj3, 1) ? (kotlin.jvm.functions.Function1) obj3 : null;
        return (function14 == null || (contentTransform = (androidx.compose.animation.ContentTransform) function14.invoke(animatedContentTransitionScope)) == null) ? (androidx.compose.animation.ContentTransform) function12.invoke(animatedContentTransitionScope) : contentTransform;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.navigation3.scene.SceneState sceneState, androidx.view.compose.NavigationEventState navigationEventState, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer) {
        androidx.navigation3.ui.NavDisplayKt.NavDisplay(sceneState, navigationEventState, modifier, alignment, sizeTransform, function1, function12, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.util.List list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function0 function0, java.util.List list2, androidx.navigation3.scene.SceneStrategy sceneStrategy, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function13, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        NavDisplay(list, modifier, alignment, function0, list2, sceneStrategy, sizeTransform, function1, function12, function2, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.animation.ContentTransform getHighSpeedVideoSizes(kotlin.jvm.functions.Function1 function1, float f, androidx.compose.animation.SizeTransform sizeTransform, androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope) {
        return new androidx.compose.animation.ContentTransform(((androidx.compose.animation.ContentTransform) function1.invoke(animatedContentTransitionScope)).getTargetContentEnter(), ((androidx.compose.animation.ContentTransform) function1.invoke(animatedContentTransitionScope)).getInitialContentExit(), f, sizeTransform);
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function0 function0, java.util.List list2, java.util.List list3, java.util.List list4, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function13, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        androidx.navigation3.ui.NavDisplayKt.NavDisplay(list, modifier, alignment, function0, list2, list3, list4, sharedTransitionScope, sizeTransform, function1, function12, function2, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list) {
        if (kotlin.jvm.internal.TypeIntrinsics.isMutableList(list)) {
            kotlin.collections.CollectionsKt.removeLastOrNull(list);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.animation.core.Transition transition, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, java.util.Map map, androidx.compose.animation.AnimatedContentScope animatedContentScope, final androidx.navigation3.scene.Scene scene, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1167420988, i, -1, "androidx.navigation3.ui.NavDisplay.<anonymous> (NavDisplay.kt:846)");
        }
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(androidx.view.compose.RememberLifecycleOwnerKt.rememberLifecycleOwner((kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && snapshotStateList.isEmpty()) ? androidx.lifecycle.Lifecycle.State.RESUMED : androidx.lifecycle.Lifecycle.State.STARTED, null, composer, 0, 2)), androidx.navigation3.ui.LocalNavAnimatedContentScopeKt.getLocalNavAnimatedContentScope().provides(animatedContentScope), androidx.navigation3.scene.SharedEntryInSceneNavEntryDecoratorKt.getLocalCurrentScene().provides(scene), androidx.navigation3.scene.SceneSetupNavEntryDecoratorKt.getLocalEntriesToExcludeFromCurrentScene().provides(kotlin.collections.MapsKt.getValue(map, new androidx.navigation3.ui.AnimatedSceneKey(scene)))}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1734941436, true, new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.Camera2StreamConfigurationMap(androidx.navigation3.scene.Scene.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, androidx.navigation3.scene.SceneStrategy sceneStrategy, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer) {
        NavDisplay(list, modifier, alignment, sceneStrategy, sizeTransform, function1, function12, function2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.util.List list) {
        if (kotlin.jvm.internal.TypeIntrinsics.isMutableList(list)) {
            kotlin.collections.CollectionsKt.removeLastOrNull(list);
        }
        return kotlin.Unit.INSTANCE;
    }
}
