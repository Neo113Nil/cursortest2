package io.ktor.network.selector;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a]\u0010\u000e\u001a\u00028\u0001\"\f\b\u0000\u0010\u0007*\u00060\u0005j\u0002`\u0006\"\u0004\b\u0001\u0010\b*\u00020\u00022\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "dispatcher", "Lio/ktor/network/selector/SelectorManager;", "SelectorManager", "(Lkotlin/coroutines/CoroutineContext;)Lio/ktor/network/selector/SelectorManager;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/getHighResolutionOutputSizeshNQ4ISI;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Ljava/nio/channels/spi/SelectorProvider;", "Lkotlin/ExtensionFunctionType;", "create", "setup", "buildOrClose", "(Lio/ktor/network/selector/SelectorManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectorManagerKt {
    public static final io.ktor.network.selector.SelectorManager SelectorManager(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return new io.ktor.network.selector.ActorSelectorManager(coroutineContext);
    }

    public static /* synthetic */ io.ktor.network.selector.SelectorManager SelectorManager$default(kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return SelectorManager(coroutineContext);
    }

    public static final <C extends java.io.Closeable, R> R buildOrClose(io.ktor.network.selector.SelectorManager selectorManager, kotlin.jvm.functions.Function1<? super java.nio.channels.spi.SelectorProvider, ? extends C> function1, kotlin.jvm.functions.Function1<? super C, ? extends R> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        C invoke = function1.invoke(selectorManager.getProvider());
        try {
            return function12.invoke(invoke);
        } catch (java.lang.Throwable th) {
            invoke.close();
            throw th;
        }
    }
}
