package com.discover.mpos.sdk.core.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r"}, d2 = {"Lcom/discover/mpos/sdk/core/data/ExtentionProp;", "E", "K", "", "Lkotlin/Function1;", "getter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ExtentionProp<E, K> {
    private final kotlin.jvm.functions.Function1<E, K> getter;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtentionProp(kotlin.jvm.functions.Function1<? super E, ? extends K> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getter = function1;
    }

    public final K getValue(E thisRef, kotlin.reflect.KProperty<?> property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return this.getter.invoke(thisRef);
    }
}
