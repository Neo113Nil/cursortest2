package io.ktor.client.utils;

/* compiled from: headers.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/http/Headers;", "buildHeaders", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/http/Headers;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeadersKt {
    public static /* synthetic */ io.ktor.http.Headers buildHeaders$default(kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.utils.HeadersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit buildHeaders$lambda$0;
                    buildHeaders$lambda$0 = io.ktor.client.utils.HeadersKt.buildHeaders$lambda$0((io.ktor.http.HeadersBuilder) obj2);
                    return buildHeaders$lambda$0;
                }
            };
        }
        return buildHeaders(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit buildHeaders$lambda$0(io.ktor.http.HeadersBuilder headersBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final io.ktor.http.Headers buildHeaders(kotlin.jvm.functions.Function1<? super io.ktor.http.HeadersBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        block.invoke(headersBuilder);
        return headersBuilder.build();
    }
}
