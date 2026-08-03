package com.google.protobuf;

/* compiled from: UInt64ValueKt.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"uInt64Value", "Lcom/google/protobuf/UInt64Value;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/UInt64ValueKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuInt64Value", "copy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final com.google.protobuf.UInt64Value m5621initializeuInt64Value(kotlin.jvm.functions.Function1<? super com.google.protobuf.UInt64ValueKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.UInt64ValueKt.Dsl.Companion companion = com.google.protobuf.UInt64ValueKt.Dsl.INSTANCE;
        com.google.protobuf.UInt64Value.Builder newBuilder = com.google.protobuf.UInt64Value.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        com.google.protobuf.UInt64ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final com.google.protobuf.UInt64Value copy(com.google.protobuf.UInt64Value uInt64Value, kotlin.jvm.functions.Function1<? super com.google.protobuf.UInt64ValueKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uInt64Value, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.UInt64ValueKt.Dsl.Companion companion = com.google.protobuf.UInt64ValueKt.Dsl.INSTANCE;
        com.google.protobuf.UInt64Value.Builder builder = uInt64Value.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        com.google.protobuf.UInt64ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
