package com.paypal.android.threeds.security;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0080\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB7\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019j\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#"}, d2 = {"Lcom/paypal/android/threeds/security/DirectoryServer;", "", "", "", "p0", "Lcom/paypal/android/threeds/security/EncryptionAlgorithm;", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/paypal/android/threeds/security/EncryptionAlgorithm;Ljava/util/List;I)V", "ids", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "algorithm", "Lcom/paypal/android/threeds/security/EncryptionAlgorithm;", "getAlgorithm", "()Lcom/paypal/android/threeds/security/EncryptionAlgorithm;", "publicKeyFile", "getPublicKeyFile", "logo", com.visa.cbp.getEncExpo.warmup, "getLogo", "()I", "Companion", "AMEX", "CB", "DISCOVER", "JCB", "MASTERCARD", "VISA", "PaypalStage", "TestCaEc", "TestCaRsa"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectoryServer {
    public static final com.paypal.android.threeds.security.DirectoryServer AMEX;
    public static final com.paypal.android.threeds.security.DirectoryServer CB;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.android.threeds.security.DirectoryServer.Companion INSTANCE;
    public static final com.paypal.android.threeds.security.DirectoryServer DISCOVER;
    public static final com.paypal.android.threeds.security.DirectoryServer JCB;
    public static final com.paypal.android.threeds.security.DirectoryServer MASTERCARD;
    public static final com.paypal.android.threeds.security.DirectoryServer PaypalStage;
    public static final com.paypal.android.threeds.security.DirectoryServer TestCaEc;
    public static final com.paypal.android.threeds.security.DirectoryServer TestCaRsa;
    public static final com.paypal.android.threeds.security.DirectoryServer VISA;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.android.threeds.security.DirectoryServer[] getHighSpeedVideoSizes;
    private final com.paypal.android.threeds.security.EncryptionAlgorithm algorithm;
    private final java.util.List<java.lang.String> ids;
    private final int logo;
    private final java.util.List<java.lang.String> publicKeyFile;

    private DirectoryServer(java.lang.String str, int i, java.util.List list, com.paypal.android.threeds.security.EncryptionAlgorithm encryptionAlgorithm, java.util.List list2, int i2) {
        this.ids = list;
        this.algorithm = encryptionAlgorithm;
        this.publicKeyFile = list2;
        this.logo = i2;
    }

    public final java.util.List<java.lang.String> getIds() {
        return this.ids;
    }

    public final com.paypal.android.threeds.security.EncryptionAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public final java.util.List<java.lang.String> getPublicKeyFile() {
        return this.publicKeyFile;
    }

    /* synthetic */ DirectoryServer(java.lang.String str, int i, java.util.List list, com.paypal.android.threeds.security.EncryptionAlgorithm encryptionAlgorithm, java.util.List list2, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, encryptionAlgorithm, list2, (i3 & 8) != 0 ? com.paypal.android.threeds.R.drawable.ic_visa : i2);
    }

    public final int getLogo() {
        return this.logo;
    }

    static {
        com.paypal.android.threeds.security.DirectoryServer directoryServer = new com.paypal.android.threeds.security.DirectoryServer("AMEX", 0, kotlin.collections.CollectionsKt.listOf("A000000025"), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ds-amex-rsa.pem", "ds-amex-root.pem"}), com.paypal.android.threeds.R.drawable.ic_amex_safekey);
        AMEX = directoryServer;
        com.paypal.android.threeds.security.DirectoryServer directoryServer2 = new com.paypal.android.threeds.security.DirectoryServer("CB", 1, kotlin.collections.CollectionsKt.listOf("A000000042"), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ds-cb-rsa.pem", "ds-cb-root.pem"}), com.paypal.android.threeds.R.drawable.ic_cb);
        CB = directoryServer2;
        com.paypal.android.threeds.security.DirectoryServer directoryServer3 = new com.paypal.android.threeds.security.DirectoryServer("DISCOVER", 2, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"A000000152", "A000000188", "A000000324"}), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ds-discover-rsa.pem", "ds-discover-root.pem"}), com.paypal.android.threeds.R.drawable.ic_discover);
        DISCOVER = directoryServer3;
        com.paypal.android.threeds.security.DirectoryServer directoryServer4 = new com.paypal.android.threeds.security.DirectoryServer("JCB", 3, kotlin.collections.CollectionsKt.listOf("A000000065"), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ds-jcb-rsa.pem", "ds-jcb-root.pem"}), com.paypal.android.threeds.R.drawable.ic_jcb);
        JCB = directoryServer4;
        com.paypal.android.threeds.security.DirectoryServer directoryServer5 = new com.paypal.android.threeds.security.DirectoryServer("MASTERCARD", 4, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"A000000004", "B012345678"}), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ds-mastercard-rsa.pem", "ds-mastercard-root.pem"}), com.paypal.android.threeds.R.drawable.ic_mastercard);
        MASTERCARD = directoryServer5;
        com.paypal.android.threeds.security.DirectoryServer directoryServer6 = new com.paypal.android.threeds.security.DirectoryServer("VISA", 5, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"A000000003", "A000000098", "A000000241", "315041592E", "325041592E"}), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ds-visa-rsa.pem", "ds-visa-root.pem"}), com.paypal.android.threeds.R.drawable.ic_visa);
        VISA = directoryServer6;
        com.paypal.android.threeds.security.DirectoryServer directoryServer7 = new com.paypal.android.threeds.security.DirectoryServer("PaypalStage", 6, kotlin.collections.CollectionsKt.listOf("PaypalStage"), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf("ds-paypal-root.pem"), com.paypal.android.threeds.R.drawable.ic_visa);
        PaypalStage = directoryServer7;
        int i = 0;
        int i2 = 8;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        com.paypal.android.threeds.security.DirectoryServer directoryServer8 = new com.paypal.android.threeds.security.DirectoryServer("TestCaEc", 7, kotlin.collections.CollectionsKt.listOf("9087"), com.paypal.android.threeds.security.EncryptionAlgorithm.EC, kotlin.collections.CollectionsKt.listOf("test-ca-ec-cert.pem"), i, i2, defaultConstructorMarker);
        TestCaEc = directoryServer8;
        com.paypal.android.threeds.security.DirectoryServer directoryServer9 = new com.paypal.android.threeds.security.DirectoryServer("TestCaRsa", 8, kotlin.collections.CollectionsKt.listOf("90876"), com.paypal.android.threeds.security.EncryptionAlgorithm.RSA, kotlin.collections.CollectionsKt.listOf("test-ca-rsa-cert.pem"), i, i2, defaultConstructorMarker);
        TestCaRsa = directoryServer9;
        com.paypal.android.threeds.security.DirectoryServer[] directoryServerArr = {directoryServer, directoryServer2, directoryServer3, directoryServer4, directoryServer5, directoryServer6, directoryServer7, directoryServer8, directoryServer9};
        getHighSpeedVideoSizes = directoryServerArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(directoryServerArr);
        INSTANCE = new com.paypal.android.threeds.security.DirectoryServer.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/threeds/security/DirectoryServer$Companion;", "", "<init>", "()V", "", "directoryServerId", "Lcom/paypal/android/threeds/security/DirectoryServer;", "lookup", "(Ljava/lang/String;)Lcom/paypal/android/threeds/security/DirectoryServer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.android.threeds.security.DirectoryServer lookup(java.lang.String directoryServerId) {
            com.paypal.android.threeds.security.DirectoryServer directoryServer;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryServerId, "");
            com.paypal.android.threeds.security.DirectoryServer[] values = com.paypal.android.threeds.security.DirectoryServer.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    directoryServer = null;
                    break;
                }
                directoryServer = values[i];
                if (directoryServer.getIds().contains(directoryServerId)) {
                    break;
                }
                i++;
            }
            if (directoryServer != null) {
                return directoryServer;
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Unknown directory server id: ".concat(java.lang.String.valueOf(directoryServerId)), null, null, null, 14, null);
            throw new com.paypal.android.threeds.exceptions.InvalidInputException("Unknown directory server id: ".concat(java.lang.String.valueOf(directoryServerId)), null, 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.android.threeds.security.DirectoryServer[] values() {
        return (com.paypal.android.threeds.security.DirectoryServer[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.android.threeds.security.DirectoryServer valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.security.DirectoryServer) java.lang.Enum.valueOf(com.paypal.android.threeds.security.DirectoryServer.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.security.DirectoryServer> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
