package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/SourceContextKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/protobuf/SourceContext;", "-initializesourceContext", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/SourceContext;", "copy", "(Lcom/google/protobuf/SourceContext;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/SourceContext;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SourceContextKtKt {
    /* renamed from: -initializesourceContext, reason: not valid java name */
    public static final com.google.protobuf.SourceContext m10591initializesourceContext(kotlin.jvm.functions.Function1<? super com.google.protobuf.SourceContextKt.Dsl, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.protobuf.SourceContextKt.Dsl.Companion companion = com.google.protobuf.SourceContextKt.Dsl.INSTANCE;
        com.google.protobuf.SourceContext.Builder newBuilder = com.google.protobuf.SourceContext.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "");
        com.google.protobuf.SourceContextKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    public static final com.google.protobuf.SourceContext copy(com.google.protobuf.SourceContext sourceContext, kotlin.jvm.functions.Function1<? super com.google.protobuf.SourceContextKt.Dsl, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.protobuf.SourceContextKt.Dsl.Companion companion = com.google.protobuf.SourceContextKt.Dsl.INSTANCE;
        com.google.protobuf.SourceContext.Builder builder = sourceContext.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "");
        com.google.protobuf.SourceContextKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }
}
