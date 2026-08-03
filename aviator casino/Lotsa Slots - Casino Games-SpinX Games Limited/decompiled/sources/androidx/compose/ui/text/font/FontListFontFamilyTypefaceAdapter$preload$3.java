package androidx.compose.ui.text.font;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class FontListFontFamilyTypefaceAdapter$preload$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<androidx.compose.ui.text.font.Font> $asyncLoads;
    final /* synthetic */ androidx.compose.ui.text.font.PlatformFontLoader $resourceLoader;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$preload$3(java.util.List<androidx.compose.ui.text.font.Font> list, androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3> continuation) {
        super(2, continuation);
        this.$asyncLoads = list;
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3(this.$asyncLoads, this.this$0, this.$resourceLoader, continuation);
        fontListFontFamilyTypefaceAdapter$preload$3.L$0 = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            java.util.List<androidx.compose.ui.text.font.Font> list = this.$asyncLoads;
            java.util.HashSet hashSet = new java.util.HashSet(list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.compose.ui.text.font.Font font = list.get(i2);
                if (hashSet.add(font)) {
                    arrayList.add(font);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
            androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader = this.$resourceLoader;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (androidx.compose.ui.text.font.Font) arrayList2.get(i3), platformFontLoader, null), 3, null);
                arrayList3.add(async$default);
            }
            this.label = 1;
            if (kotlinx.coroutines.AwaitKt.joinAll(arrayList3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
