package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$7$2$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ boolean getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.SheetState getOutputMinFrameDuration;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v15 ??, still in use, count: 1, list:
          (r3v15 ?? I:java.lang.Object) from 0x00cb: INVOKE (r1v1 ?? I:androidx.compose.runtime.Composer), (r3v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:6567)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v15 ??, still in use, count: 1, list:
          (r3v15 ?? I:java.lang.Object) from 0x00cb: INVOKE (r1v1 ?? I:androidx.compose.runtime.Composer), (r3v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:6567)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.material3.SheetState sheetState, kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.CoroutineScope coroutineScope) {
        int i = androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i == 1) {
            function0.invoke();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } else if (i != 2) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2(sheetState, null), 3, null);
        } else {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1(sheetState, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return true;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRanges(androidx.compose.material3.SheetState sheetState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(androidx.compose.material3.SheetValue.PartiallyExpanded).booleanValue()) {
            return true;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$3$1(sheetState, null), 3, null);
        return true;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(boolean z, final androidx.compose.material3.SheetState sheetState, java.lang.String str, java.lang.String str2, java.lang.String str3, final kotlin.jvm.functions.Function0 function0, final kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0.this));
                }
            });
            if (sheetState.getCurrentValue() == androidx.compose.material3.SheetValue.PartiallyExpanded) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.SheetState.this, coroutineScope, sheetState));
                    }
                });
            } else if (sheetState.getHasPartiallyExpandedState()) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.getHighSpeedVideoFpsRanges(androidx.compose.material3.SheetState.this, coroutineScope));
                    }
                });
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(androidx.compose.material3.SheetState sheetState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.SheetState sheetState2) {
        if (!sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(androidx.compose.material3.SheetValue.Expanded).booleanValue()) {
            return true;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$2$1(sheetState2, null), 3, null);
        return true;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.SheetValue.values().length];
            try {
                iArr[androidx.compose.material3.SheetValue.Expanded.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    ModalBottomSheetKt$ModalBottomSheetContent$7$2$1(androidx.compose.material3.SheetState sheetState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlinx.coroutines.CoroutineScope coroutineScope, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.getOutputMinFrameDuration = sheetState;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getInputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
