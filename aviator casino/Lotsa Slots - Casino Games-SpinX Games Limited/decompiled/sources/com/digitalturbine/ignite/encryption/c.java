package com.digitalturbine.ignite.encryption;

/* loaded from: classes2.dex */
public final class c {
    public com.digitalturbine.ignite.encryption.d b;
    public com.digitalturbine.ignite.encryption.b c;

    /* renamed from: a, reason: collision with root package name */
    public javax.crypto.SecretKey f3514a = null;
    public final java.security.spec.AlgorithmParameterSpec d = new com.digitalturbine.ignite.encryption.generator.a().a();

    public final void a() {
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : init", "EncryptionManager");
        if (android.os.Build.VERSION.SDK_INT < 23) {
            com.digitalturbine.ignite.authenticator.logger.a.a("%s : init failed low android version", "EncryptionManager");
            return;
        }
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.d);
            keyGenerator.generateKey();
        }
        java.security.Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof javax.crypto.SecretKey) {
            this.f3514a = (javax.crypto.SecretKey) key;
            this.b = new com.digitalturbine.ignite.encryption.d();
            this.c = new com.digitalturbine.ignite.encryption.b();
        }
    }

    public final android.util.Pair a(java.lang.String str) {
        if (this.b != null) {
            return com.digitalturbine.ignite.encryption.d.a(this.f3514a, str);
        }
        return null;
    }

    public final java.lang.String a(java.lang.String str, byte[] bArr) {
        com.digitalturbine.ignite.encryption.b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        javax.crypto.SecretKey secretKey = this.f3514a;
        bVar.getClass();
        return com.digitalturbine.ignite.encryption.a.a(com.digitalturbine.ignite.encryption.a.a(2, bArr, secretKey), str);
    }
}
