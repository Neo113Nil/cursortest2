package io.ktor.util.debug;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a4\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a<\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\b\u001a\u00020\u00072\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0011\u001a\u00020\u000f\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0001H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "initContextInDebugMode", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "pluginName", "addToContextInDebugMode", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$Element;", "Element", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "", "action", "useContextElementInDebugMode", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContextUtilsKt {
    public static final <T> java.lang.Object initContextInDebugMode(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        return !io.ktor.util.debug.IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected() ? function1.invoke(continuation) : kotlinx.coroutines.BuildersKt.withContext(continuation.getGetInputFormats().plus(new io.ktor.util.debug.plugins.PluginsTrace(null, 1, null)), new io.ktor.util.debug.ContextUtilsKt$initContextInDebugMode$2(function1, null), continuation);
    }

    public static final <T> java.lang.Object addToContextInDebugMode(java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        return !io.ktor.util.debug.IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected() ? function1.invoke(continuation) : kotlinx.coroutines.BuildersKt.withContext(continuation.getGetInputFormats().plus(new io.ktor.util.debug.plugins.PluginName(str)), new io.ktor.util.debug.ContextUtilsKt$addToContextInDebugMode$2(function1, null), continuation);
    }

    public static final <Element extends kotlin.coroutines.CoroutineContext.Element> java.lang.Object useContextElementInDebugMode(kotlin.coroutines.CoroutineContext.Key<Element> key, kotlin.jvm.functions.Function1<? super Element, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!io.ktor.util.debug.IntellijIdeaDebugDetector.INSTANCE.isDebuggerConnected()) {
            return kotlin.Unit.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext.Element element = continuation.getGetInputFormats().get(key);
        if (element != null) {
            function1.invoke(element);
        }
        return kotlin.Unit.INSTANCE;
    }
}
