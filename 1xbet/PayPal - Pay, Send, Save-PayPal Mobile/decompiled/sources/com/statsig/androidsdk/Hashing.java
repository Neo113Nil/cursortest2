package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0007R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/statsig/androidsdk/Hashing;", "", "<init>", "()V", "", "input", "getDJB2HashString", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/statsig/androidsdk/HashAlgorithm;", "algorithm", "getHashedString", "(Ljava/lang/String;Lcom/statsig/androidsdk/HashAlgorithm;)Ljava/lang/String;", "getSHA256HashString", "Lcom/statsig/androidsdk/BoundedMemo;", "djb2Cache", "Lcom/statsig/androidsdk/BoundedMemo;", "sha256Cache"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Hashing {
    public static final com.statsig.androidsdk.Hashing INSTANCE = new com.statsig.androidsdk.Hashing();
    private static final com.statsig.androidsdk.BoundedMemo<java.lang.String, java.lang.String> sha256Cache = new com.statsig.androidsdk.BoundedMemo<>();
    private static final com.statsig.androidsdk.BoundedMemo<java.lang.String, java.lang.String> djb2Cache = new com.statsig.androidsdk.BoundedMemo<>();

    private Hashing() {
    }

    public final java.lang.String getHashedString(java.lang.String input, com.statsig.androidsdk.HashAlgorithm algorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = algorithm == null ? -1 : com.statsig.androidsdk.Hashing.WhenMappings.$EnumSwitchMapping$0[algorithm.ordinal()];
        if (i == 1) {
            return djb2Cache.computeIfAbsent(input, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.statsig.androidsdk.Hashing$getHashedString$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    return com.statsig.androidsdk.Hashing.INSTANCE.getDJB2HashString(str);
                }
            });
        }
        if (i != 2) {
            return i != 3 ? sha256Cache.computeIfAbsent(input, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.statsig.androidsdk.Hashing$getHashedString$3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(java.lang.String str) {
                    java.lang.String sHA256HashString;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    sHA256HashString = com.statsig.androidsdk.Hashing.INSTANCE.getSHA256HashString(str);
                    return sHA256HashString;
                }
            }) : input;
        }
        return sha256Cache.computeIfAbsent(input, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.statsig.androidsdk.Hashing$getHashedString$2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(java.lang.String str) {
                java.lang.String sHA256HashString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                sHA256HashString = com.statsig.androidsdk.Hashing.INSTANCE.getSHA256HashString(str);
                return sHA256HashString;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getSHA256HashString(java.lang.String input) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = input.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(messageDigest.digest(bytes), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }

    public final java.lang.String getDJB2HashString(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        char[] charArray = input.toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "");
        int i = 0;
        for (char c : charArray) {
            i = c + ((i << 5) - i);
        }
        return java.lang.Integer.toUnsignedString(kotlin.UInt.m23470constructorimpl(i));
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.statsig.androidsdk.HashAlgorithm.values().length];
            try {
                iArr[com.statsig.androidsdk.HashAlgorithm.DJB2.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.statsig.androidsdk.HashAlgorithm.SHA256.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.statsig.androidsdk.HashAlgorithm.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
