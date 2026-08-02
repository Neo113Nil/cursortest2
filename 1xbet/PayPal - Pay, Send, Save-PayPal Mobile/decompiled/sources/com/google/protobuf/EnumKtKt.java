package com.google.protobuf;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/EnumKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/protobuf/Enum;", "-initializeenum", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Enum;", "copy", "(Lcom/google/protobuf/Enum;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Enum;", "Lcom/google/protobuf/EnumOrBuilder;", "Lcom/google/protobuf/SourceContext;", "getSourceContextOrNull", "(Lcom/google/protobuf/EnumOrBuilder;)Lcom/google/protobuf/SourceContext;", "sourceContextOrNull"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EnumKtKt {
    /* renamed from: -initializeenum, reason: not valid java name */
    public static final com.google.protobuf.Enum m10579initializeenum(kotlin.jvm.functions.Function1<? super com.google.protobuf.EnumKt.Dsl, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.protobuf.EnumKt.Dsl.Companion companion = com.google.protobuf.EnumKt.Dsl.INSTANCE;
        com.google.protobuf.Enum.Builder newBuilder = com.google.protobuf.Enum.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "");
        com.google.protobuf.EnumKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    public static final com.google.protobuf.Enum copy(com.google.protobuf.Enum r2, kotlin.jvm.functions.Function1<? super com.google.protobuf.EnumKt.Dsl, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.protobuf.EnumKt.Dsl.Companion companion = com.google.protobuf.EnumKt.Dsl.INSTANCE;
        com.google.protobuf.Enum.Builder builder = r2.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "");
        com.google.protobuf.EnumKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    public static final com.google.protobuf.SourceContext getSourceContextOrNull(com.google.protobuf.EnumOrBuilder enumOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumOrBuilder, "");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
