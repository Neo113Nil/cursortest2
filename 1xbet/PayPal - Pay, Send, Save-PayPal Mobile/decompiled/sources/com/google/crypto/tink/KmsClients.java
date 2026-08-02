package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class KmsClients {
    private static java.util.List<com.google.crypto.tink.KmsClient> autoClients;
    private static final java.util.concurrent.CopyOnWriteArrayList<com.google.crypto.tink.KmsClient> clients = new java.util.concurrent.CopyOnWriteArrayList<>();

    public static void add(com.google.crypto.tink.KmsClient kmsClient) {
        clients.add(kmsClient);
    }

    public static com.google.crypto.tink.KmsClient get(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator<com.google.crypto.tink.KmsClient> it = clients.iterator();
        while (it.hasNext()) {
            com.google.crypto.tink.KmsClient next = it.next();
            if (next.doesSupport(str)) {
                return next;
            }
        }
        throw new java.security.GeneralSecurityException("No KMS client does support: ".concat(java.lang.String.valueOf(str)));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KmsClient getAutoLoaded(java.lang.String str) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KmsClient next;
        synchronized (com.google.crypto.tink.KmsClients.class) {
            if (autoClients == null) {
                autoClients = loadAutoKmsClients();
            }
            java.util.Iterator<com.google.crypto.tink.KmsClient> it = autoClients.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.doesSupport(str)) {
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("No KMS client does support: ");
            sb.append(str);
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return next;
    }

    static void reset() {
        clients.clear();
    }

    private static java.util.List<com.google.crypto.tink.KmsClient> loadAutoKmsClients() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = java.util.ServiceLoader.load(com.google.crypto.tink.KmsClient.class).iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.crypto.tink.KmsClient) it.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private KmsClients() {
    }
}
