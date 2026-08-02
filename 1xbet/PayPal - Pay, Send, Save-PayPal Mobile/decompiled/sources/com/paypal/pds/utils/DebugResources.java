package com.paypal.pds.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/pds/utils/DebugResources;", "", "", "image128x128", "()I", "flagUSA", "corePdsCardFooter", "avatarImage", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DebugResources {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.utils.DebugResources.Companion INSTANCE = com.paypal.pds.utils.DebugResources.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static int image128x128(com.paypal.pds.utils.DebugResources debugResources) {
            return com.paypal.pds.utils.DebugResources.super.image128x128();
        }

        @java.lang.Deprecated
        public static int flagUSA(com.paypal.pds.utils.DebugResources debugResources) {
            return com.paypal.pds.utils.DebugResources.super.flagUSA();
        }

        @java.lang.Deprecated
        public static int corePdsCardFooter(com.paypal.pds.utils.DebugResources debugResources) {
            return com.paypal.pds.utils.DebugResources.super.corePdsCardFooter();
        }

        @java.lang.Deprecated
        public static int avatarImage(com.paypal.pds.utils.DebugResources debugResources) {
            return com.paypal.pds.utils.DebugResources.super.avatarImage();
        }
    }

    default int image128x128() {
        throw new kotlin.NotImplementedError(null, 1, null);
    }

    default int flagUSA() {
        throw new kotlin.NotImplementedError(null, 1, null);
    }

    default int corePdsCardFooter() {
        throw new kotlin.NotImplementedError(null, 1, null);
    }

    default int avatarImage() {
        throw new kotlin.NotImplementedError(null, 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/utils/DebugResources$Companion;", "", "<init>", "()V", "Lcom/paypal/pds/utils/DebugResources;", "instance", "Lcom/paypal/pds/utils/DebugResources;", "getInstance", "()Lcom/paypal/pds/utils/DebugResources;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.pds.utils.DebugResources.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.pds.utils.DebugResources.Companion();
        private static final com.paypal.pds.utils.DebugResources instance = new com.paypal.pds.utils.DebugResourcesImpl();

        private Companion() {
        }

        public final com.paypal.pds.utils.DebugResources getInstance() {
            return instance;
        }
    }
}
