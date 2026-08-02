package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/MixinKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/protobuf/Mixin;", "-initializemixin", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Mixin;", "copy", "(Lcom/google/protobuf/Mixin;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Mixin;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MixinKtKt {
    /* renamed from: -initializemixin, reason: not valid java name */
    public static final com.google.protobuf.Mixin m10589initializemixin(kotlin.jvm.functions.Function1<? super com.google.protobuf.MixinKt.Dsl, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.protobuf.MixinKt.Dsl.Companion companion = com.google.protobuf.MixinKt.Dsl.INSTANCE;
        com.google.protobuf.Mixin.Builder newBuilder = com.google.protobuf.Mixin.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "");
        com.google.protobuf.MixinKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    public static final com.google.protobuf.Mixin copy(com.google.protobuf.Mixin mixin, kotlin.jvm.functions.Function1<? super com.google.protobuf.MixinKt.Dsl, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mixin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.protobuf.MixinKt.Dsl.Companion companion = com.google.protobuf.MixinKt.Dsl.INSTANCE;
        com.google.protobuf.Mixin.Builder builder = mixin.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "");
        com.google.protobuf.MixinKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }
}
