package com.adjust.sdk.sig;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3459a;

    public c(int i) {
        this.f3459a = i;
    }

    public final byte[] a(android.content.Context context, byte[] bArr) {
        java.security.Key secretKeySpec;
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
        int i = this.f3459a;
        if (i >= 23) {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            secretKeySpec = keyStore.getKey("key2", null);
        } else {
            if (i < 18) {
                throw new java.lang.RuntimeException("Unsupported version");
            }
            java.lang.String string = context.getSharedPreferences("adjust_keys", 0).getString("encrypted_key", null);
            if (string == null) {
                throw new java.lang.RuntimeException("Failed to find encrypted key in SharedPreferences");
            }
            byte[] decode = android.util.Base64.decode(string, 0);
            java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore2.load(null);
            java.security.KeyStore.PrivateKeyEntry privateKeyEntry = (java.security.KeyStore.PrivateKeyEntry) keyStore2.getEntry("key2", null);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(com.ironsource.Z9.b);
            cipher.init(2, privateKeyEntry.getPrivateKey());
            secretKeySpec = new javax.crypto.spec.SecretKeySpec(cipher.doFinal(decode), "AES");
        }
        mac.init(secretKeySpec);
        mac.update(bArr);
        return mac.doFinal();
    }

    public final void a(android.content.Context context) {
        int i = this.f3459a;
        if (i >= 23) {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias("key2")) {
                return;
            }
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("HmacSHA256", "AndroidKeyStore");
            keyGenerator.init(new android.security.keystore.KeyGenParameterSpec.Builder("key2", 4).build());
            keyGenerator.generateKey();
            return;
        }
        if (i >= 18) {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("adjust_keys", 0);
            if (sharedPreferences.contains("encrypted_key")) {
                return;
            }
            java.util.Date time = java.util.Calendar.getInstance().getTime();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(1, 1);
            android.security.KeyPairGeneratorSpec.Builder endDate = new android.security.KeyPairGeneratorSpec.Builder(context).setAlias("key2").setSubject(new javax.security.auth.x500.X500Principal("CN=key2")).setSerialNumber(java.math.BigInteger.TEN).setStartDate(time).setEndDate(calendar.getTime());
            if (this.f3459a >= 19) {
                endDate.setKeySize(1024);
            }
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(endDate.build());
            keyPairGenerator.genKeyPair();
            byte[] bArr = new byte[16];
            new java.security.SecureRandom().nextBytes(bArr);
            java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore2.load(null);
            java.security.KeyStore.PrivateKeyEntry privateKeyEntry = (java.security.KeyStore.PrivateKeyEntry) keyStore2.getEntry("key2", null);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(com.ironsource.Z9.b);
            cipher.init(1, privateKeyEntry.getCertificate().getPublicKey());
            java.lang.String encodeToString = android.util.Base64.encodeToString(cipher.doFinal(bArr), 0);
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("encrypted_key", encodeToString);
            edit.apply();
            return;
        }
        throw new com.adjust.sdk.sig.b();
    }
}
