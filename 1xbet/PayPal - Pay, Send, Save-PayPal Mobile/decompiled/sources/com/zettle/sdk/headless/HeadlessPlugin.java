package com.zettle.sdk.headless;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessPlugin;", "", "T", "Lcom/zettle/sdk/headless/HeadlessAction;", "action", "Lcom/zettle/sdk/headless/HeadlessResult;", "execute", "(Lcom/zettle/sdk/headless/HeadlessAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/reflect/KClass;", "getCapabilities", "()Ljava/util/Set;", "capabilities"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface HeadlessPlugin {
    <T> java.lang.Object execute(com.zettle.sdk.headless.HeadlessAction<? extends T> headlessAction, kotlin.coroutines.Continuation<? super com.zettle.sdk.headless.HeadlessResult<? extends T>> continuation);

    java.util.Set<kotlin.reflect.KClass<? extends com.zettle.sdk.headless.HeadlessAction<?>>> getCapabilities();
}
