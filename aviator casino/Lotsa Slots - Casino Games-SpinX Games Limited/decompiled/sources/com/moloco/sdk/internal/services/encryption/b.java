package com.moloco.sdk.internal.services.encryption;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.services.encryption.a {
    public static final int h = 8;
    public final kotlin.Lazy b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.encryption.b$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.services.encryption.b.f();
        }
    });
    public final kotlin.Lazy c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.encryption.b$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.services.encryption.b.e();
        }
    });
    public final kotlin.Lazy d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.encryption.b$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.services.encryption.b.d();
        }
    });
    public final kotlin.Lazy e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.encryption.b$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.services.encryption.b.c();
        }
    });
    public final javax.crypto.spec.SecretKeySpec f = h();
    public final kotlin.Lazy g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.encryption.b$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.services.encryption.b.g();
        }
    });

    public static final java.lang.String c() {
        byte[] decode = android.util.Base64.decode(new byte[]{81, 85, 86, 84, 76, 48, 100, 68, 84, 83, 57, 79, 98, 49, 66, 104, 90, 71, 82, 112, 98, 109, 99, kotlin.io.encoding.Base64.padSymbol}, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return kotlin.text.StringsKt.decodeToString(decode);
    }

    public static final java.lang.String d() {
        return kotlin.text.StringsKt.decodeToString(new byte[]{65, 69, 83});
    }

    public static final java.lang.String e() {
        return kotlin.text.StringsKt.decodeToString(new byte[]{82, 83, 65, 47, 69, 67, 66, 47, 79, 65, 69, 80, 87, 105, 116, 104, 83, 72, 65, 45, 50, 53, 54, 65, 110, 100, 77, 71, 70, 49, 80, 97, 100, 100, 105, 110, 103});
    }

    public static final java.lang.String f() {
        byte[] decode = android.util.Base64.decode(new byte[]{85, 108, 78, 66}, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return kotlin.text.StringsKt.decodeToString(decode);
    }

    public static final javax.crypto.spec.IvParameterSpec g() {
        return new javax.crypto.spec.IvParameterSpec(android.util.Base64.decode(com.moloco.sdk.BuildConfig.MOLOCO_SDK_BIDTOKEN_SALT, 0));
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public javax.crypto.spec.IvParameterSpec a() {
        return (javax.crypto.spec.IvParameterSpec) this.g.getValue();
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public javax.crypto.spec.SecretKeySpec b() {
        return this.f;
    }

    public final javax.crypto.spec.SecretKeySpec h() {
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(i());
        keyGenerator.init(256);
        return new javax.crypto.spec.SecretKeySpec(keyGenerator.generateKey().getEncoded(), i());
    }

    public final java.lang.String i() {
        return (java.lang.String) this.d.getValue();
    }

    public final java.lang.String j() {
        return (java.lang.String) this.e.getValue();
    }

    public final java.lang.String k() {
        return (java.lang.String) this.b.getValue();
    }

    public final java.lang.String l() {
        return (java.lang.String) this.c.getValue();
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public byte[] a(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(j());
        cipher.init(1, b(), a());
        byte[] doFinal = cipher.doFinal(data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return doFinal;
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public java.lang.String b(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(j());
        cipher.init(2, b(), a());
        byte[] doFinal = cipher.doFinal(data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return kotlin.text.StringsKt.decodeToString(doFinal);
    }

    public final java.security.PublicKey c(java.lang.String str) {
        java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance(k()).generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(str, 0)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatePublic, "generatePublic(...)");
        return generatePublic;
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public java.lang.String a(byte[] data, byte[] secret) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secret, "secret");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(j());
        cipher.init(2, new javax.crypto.spec.SecretKeySpec(secret, i()), a());
        byte[] doFinal = cipher.doFinal(data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return kotlin.text.StringsKt.decodeToString(doFinal);
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public byte[] b(byte[] input, java.lang.String publicKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(l());
        cipher.init(1, c(publicKey));
        byte[] doFinal = cipher.doFinal(b().getEncoded());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return doFinal;
    }

    public final java.security.PrivateKey b(java.lang.String str) {
        java.security.PrivateKey generatePrivate = java.security.KeyFactory.getInstance(k()).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(android.util.Base64.decode(str, 0)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatePrivate, "generatePrivate(...)");
        return generatePrivate;
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public byte[] a(java.lang.String rsaPublicKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
        byte[] encoded = b().getEncoded();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        return b(encoded, rsaPublicKey);
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public byte[] a(byte[] input, java.lang.String privateKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(l());
        cipher.init(2, b(privateKey));
        byte[] doFinal = cipher.doFinal(input);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return doFinal;
    }
}
