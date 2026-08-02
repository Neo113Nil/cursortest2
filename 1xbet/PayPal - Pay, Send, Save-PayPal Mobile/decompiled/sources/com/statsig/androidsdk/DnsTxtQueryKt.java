package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00008\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0016\u0010\t\"\u001b\u0010\u001c\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"", "", "fetchTxtRecords", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "input", "parseDnsResponse", "([B)Ljava/util/List;", "DNS_QUERY_ENDPOINT", "Ljava/lang/String;", "", "DOMAIN_CHARS", "Ljava/util/List;", "getDOMAIN_CHARS", "()Ljava/util/List;", "FEATURE_ASSETS_DNS_QUERY", "[B", "getFEATURE_ASSETS_DNS_QUERY", "()[B", "", "MAX_START_LOOKUP", com.visa.cbp.getEncExpo.warmup, "TAG", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "coroutineDispatcherProvider$delegate", "Lkotlin/Lazy;", "getCoroutineDispatcherProvider", "()Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "coroutineDispatcherProvider"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DnsTxtQueryKt {
    public static final java.lang.String DNS_QUERY_ENDPOINT = "https://cloudflare-dns.com/dns-query";
    public static final int MAX_START_LOOKUP = 200;
    private static final java.lang.String TAG = "statsig::DnsTxtQuery";
    private static final byte[] FEATURE_ASSETS_DNS_QUERY = {0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 13, 102, 101, 97, 116, 117, 114, 101, 97, 115, 115, 101, 116, 115, 3, 111, 114, 103, 0, 0, 16, 0, 1};
    private static final java.util.List<java.lang.Character> DOMAIN_CHARS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Character[]{'i', 'e', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH)});
    private static final kotlin.Lazy coroutineDispatcherProvider$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.statsig.androidsdk.CoroutineDispatcherProvider>() { // from class: com.statsig.androidsdk.DnsTxtQueryKt$coroutineDispatcherProvider$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.statsig.androidsdk.CoroutineDispatcherProvider invoke() {
            return new com.statsig.androidsdk.CoroutineDispatcherProvider(null, null, null, 7, null);
        }
    });

    public static final byte[] getFEATURE_ASSETS_DNS_QUERY() {
        return FEATURE_ASSETS_DNS_QUERY;
    }

    public static final java.util.List<java.lang.Character> getDOMAIN_CHARS() {
        return DOMAIN_CHARS;
    }

    private static final com.statsig.androidsdk.CoroutineDispatcherProvider getCoroutineDispatcherProvider() {
        return (com.statsig.androidsdk.CoroutineDispatcherProvider) coroutineDispatcherProvider$delegate.getValue();
    }

    public static final java.lang.Object fetchTxtRecords(kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(getCoroutineDispatcherProvider().getIo(), new com.statsig.androidsdk.DnsTxtQueryKt$fetchTxtRecords$2(null), continuation);
    }

    public static final java.util.List<java.lang.String> parseDnsResponse(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.util.Iterator<kotlin.collections.IndexedValue<java.lang.Byte>> it = kotlin.collections.ArraysKt.withIndex(bArr).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            kotlin.collections.IndexedValue<java.lang.Byte> next = it.next();
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.collections.IndexedValue<java.lang.Byte> indexedValue = next;
            int index = indexedValue.getIndex();
            byte byteValue = indexedValue.component2().byteValue();
            if (index < 200 && ((char) byteValue) == '=' && index > 0 && DOMAIN_CHARS.contains(java.lang.Character.valueOf((char) bArr[index - 1]))) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new com.statsig.androidsdk.DnsTxtParseError("Failed to parse TXT records from DNS");
        }
        byte[] copyOfRange = kotlin.collections.ArraysKt.copyOfRange(bArr, i - 1, bArr.length);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
        return kotlin.text.StringsKt.split$default((java.lang.CharSequence) new java.lang.String(copyOfRange, charset), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
    }
}
