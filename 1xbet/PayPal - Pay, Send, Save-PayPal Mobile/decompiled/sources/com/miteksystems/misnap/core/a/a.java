package com.miteksystems.misnap.core.a;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/miteksystems/misnap/core/a/a;", "", "a"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class a {
    private static final com.miteksystems.misnap.core.internal.ValidatorNativeWrapper Camera2StreamConfigurationMap;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final com.miteksystems.misnap.core.a.a.Companion INSTANCE = new com.miteksystems.misnap.core.a.a.Companion(null);
    private static final /* synthetic */ boolean getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/a/a$a;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "a", "(Ljava/lang/String;)Ljava/util/List;", "", "libraryLoaded", "Z", "()Z", "LOG_TAG", "Ljava/lang/String;", "", "RAW_DATA_MAX_CHUNK_SIZE", com.visa.cbp.getEncExpo.warmup, "Lcom/miteksystems/misnap/core/internal/ValidatorNativeWrapper;", "loader", "Lcom/miteksystems/misnap/core/internal/ValidatorNativeWrapper;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.miteksystems.misnap.core.a.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return com.miteksystems.misnap.core.a.a.getHighSpeedVideoFpsRanges;
        }

        @kotlin.jvm.JvmStatic
        public final /* synthetic */ java.util.List a(java.lang.String data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            if (a()) {
                if (kotlin.text.StringsKt.isBlank(data)) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                try {
                    java.security.spec.X509EncodedKeySpec x509EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(new java.lang.String(com.miteksystems.misnap.core.a.a.Camera2StreamConfigurationMap.loadKeySpec(), kotlin.text.Charsets.US_ASCII), 0));
                    java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keyFactory, "");
                    java.security.PublicKey generatePublic = keyFactory.generatePublic(x509EncodedKeySpec);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatePublic, "");
                    javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cipher, "");
                    cipher.init(1, generatePublic);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    byte[] bytes = data.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                    java.util.List chunked = kotlin.collections.CollectionsKt.chunked(kotlin.collections.ArraysKt.toList(bytes), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(chunked, 10));
                    java.util.Iterator it = chunked.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(kotlin.collections.CollectionsKt.toByteArray((java.util.List) it.next()));
                    }
                    java.util.Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        java.lang.String encodeToString = android.util.Base64.encodeToString(cipher.doFinal((byte[]) it2.next()), 2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
                        arrayList.add(encodeToString);
                    }
                    return arrayList;
                } catch (java.lang.Exception unused) {
                }
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        private Companion() {
        }
    }

    static {
        com.miteksystems.misnap.core.internal.ValidatorNativeWrapper validatorNativeWrapper = new com.miteksystems.misnap.core.internal.ValidatorNativeWrapper();
        getHighSpeedVideoFpsRanges = validatorNativeWrapper.a();
        Camera2StreamConfigurationMap = validatorNativeWrapper;
    }
}
