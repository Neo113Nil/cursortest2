package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1", f = "CommonContextMenuArea.kt", i = {}, l = {105, 106, 107}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.TextContextMenuItems getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r5.Camera2StreamConfigurationMap.paste(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r5.Camera2StreamConfigurationMap.copy(false, r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r5.Camera2StreamConfigurationMap.cut(r5) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i2 = androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.ordinal()];
            if (i2 == 1) {
                this.getHighSpeedVideoFpsRanges = 1;
            } else if (i2 == 2) {
                this.getHighSpeedVideoFpsRanges = 2;
            } else if (i2 == 3) {
                this.getHighSpeedVideoFpsRanges = 3;
            } else if (i2 == 4) {
                this.Camera2StreamConfigurationMap.selectAll();
            } else {
                if (i2 != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.autofill();
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.TextContextMenuItems.values().length];
            try {
                iArr[androidx.compose.foundation.text.TextContextMenuItems.Cut.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.TextContextMenuItems.Copy.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.TextContextMenuItems.Paste.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.foundation.text.TextContextMenuItems.SelectAll.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.foundation.text.TextContextMenuItems.Autofill.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = textContextMenuItems;
        this.Camera2StreamConfigurationMap = textFieldSelectionState;
    }
}
