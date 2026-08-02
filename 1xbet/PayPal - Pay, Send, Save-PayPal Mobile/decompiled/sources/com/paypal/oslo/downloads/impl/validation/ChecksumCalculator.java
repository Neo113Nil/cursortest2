package com.paypal.oslo.downloads.impl.validation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/ChecksumCalculator;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "algorithm", "", "calculate", "(Ljava/io/File;Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;)Ljava/lang/String;", "p0", "p1", "Camera2StreamConfigurationMap", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChecksumCalculator {

    @java.lang.Deprecated
    public static final int BUFFER_SIZE = 8192;
    private static final com.paypal.oslo.downloads.impl.validation.ChecksumCalculator.Companion Companion = new com.paypal.oslo.downloads.impl.validation.ChecksumCalculator.Companion(null);

    @javax.inject.Inject
    public ChecksumCalculator() {
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.io.File p0, java.lang.String p1) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(p1);
        byte[] bArr = new byte[8192];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(p0);
        try {
            java.io.FileInputStream fileInputStream2 = fileInputStream;
            for (int read = fileInputStream2.read(bArr); read != -1; read = fileInputStream2.read(bArr)) {
                messageDigest.update(bArr, 0, read);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
            byte[] digest = messageDigest.digest();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
            return kotlin.collections.ArraysKt.joinToString$default(digest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.downloads.impl.validation.ChecksumCalculator$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.downloads.impl.validation.ChecksumCalculator.$r8$lambda$SjPYZkoXkCIHb4s7zUtlncXClMo(((java.lang.Byte) obj).byteValue());
                }
            }, 30, (java.lang.Object) null);
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/ChecksumCalculator$Companion;", "", "<init>", "()V", "", "BUFFER_SIZE", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$SjPYZkoXkCIHb4s7zUtlncXClMo(byte b) {
        java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String calculate(java.io.File file, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm algorithm) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "");
        int i = com.paypal.oslo.downloads.impl.validation.ChecksumCalculator.WhenMappings.$EnumSwitchMapping$0[algorithm.ordinal()];
        if (i == 1) {
            str = "MD5";
        } else if (i == 2) {
            str = "SHA-1";
        } else if (i == 3) {
            str = "SHA-256";
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "SHA-512";
        }
        try {
            return Camera2StreamConfigurationMap(file, str);
        } catch (java.io.IOException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Failed to read file for checksum", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("file", file.getName()), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            return null;
        } catch (java.security.NoSuchAlgorithmException e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Checksum algorithm not available", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("algorithm", str), kotlin.TuplesKt.to("error", e2.getMessage())), null, null, 12, null);
            return null;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.downloads.api.model.ChecksumAlgorithm.values().length];
            try {
                iArr[com.paypal.oslo.downloads.api.model.ChecksumAlgorithm.MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.downloads.api.model.ChecksumAlgorithm.SHA1.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.downloads.api.model.ChecksumAlgorithm.SHA256.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.downloads.api.model.ChecksumAlgorithm.SHA512.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
