package androidx.compose.ui.platform;

/* compiled from: PlatformTextInputModifierNode.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0007\u001a\u00020\b*\u00020\t2'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0002\u0010\u0010\"$\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"LocalPlatformTextInputMethodOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;", "getLocalPlatformTextInputMethodOverride$annotations", "()V", "getLocalPlatformTextInputMethodOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "establishTextInputSession", "", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.PlatformTextInputSessionHandler> LocalPlatformTextInputMethodOverride = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.PlatformTextInputSessionHandler>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalPlatformTextInputMethodOverride$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.PlatformTextInputSessionHandler invoke() {
            return null;
        }
    });

    public static /* synthetic */ void getLocalPlatformTextInputMethodOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode platformTextInputModifierNode, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) continuation;
            if ((platformTextInputModifierNodeKt$establishTextInputSession$1.label & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!platformTextInputModifierNode.getNode().getIsAttached()) {
                        throw new java.lang.IllegalArgumentException("establishTextInputSession called from an unattached node".toString());
                    }
                    androidx.compose.ui.platform.PlatformTextInputModifierNode platformTextInputModifierNode2 = platformTextInputModifierNode;
                    androidx.compose.ui.node.Owner owner = (androidx.compose.ui.platform.PlatformTextInputSessionHandler) androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(platformTextInputModifierNode2).getCompositionLocalMap().get(LocalPlatformTextInputMethodOverride);
                    if (owner == null) {
                        owner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(platformTextInputModifierNode2);
                    }
                    platformTextInputModifierNodeKt$establishTextInputSession$1.label = 1;
                    if (owner.textInputSession(function2, platformTextInputModifierNodeKt$establishTextInputSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        platformTextInputModifierNodeKt$establishTextInputSession$1 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuation);
        java.lang.Object obj2 = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.PlatformTextInputSessionHandler> getLocalPlatformTextInputMethodOverride() {
        return LocalPlatformTextInputMethodOverride;
    }
}
