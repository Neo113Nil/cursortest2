package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/RemoteStatusCodes;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "code", com.visa.cbp.getEncExpo.warmup, "getCode", "()I", "Companion", "RST_POG_TIME_NOT_SYNC", "RST_POG_OUTDATED_SECURITY_PATCH", "RST_POG_UNKNOWN_INSTALLATION_SOURCE", "RST_POG_PLAY_INTEGRITY_FAIL", "RST_POG_IS_DEVELOPER_OPTION_ENABLED", "RST_POG_IS_ADB_ENABLED", "RST_POG_IS_ROOTED_ERROR", "RST_POG_IS_DEBUGGING_ERROR", "RST_POG_IS_EMULATOR_ERROR", "RST_POG_IS_HOOKED_ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum RemoteStatusCodes {
    RST_POG_TIME_NOT_SYNC(520001),
    RST_POG_OUTDATED_SECURITY_PATCH(520002),
    RST_POG_UNKNOWN_INSTALLATION_SOURCE(520003),
    RST_POG_PLAY_INTEGRITY_FAIL(520004),
    RST_POG_IS_DEVELOPER_OPTION_ENABLED(520101),
    RST_POG_IS_ADB_ENABLED(520102),
    RST_POG_IS_ROOTED_ERROR(520103),
    RST_POG_IS_DEBUGGING_ERROR(520104),
    RST_POG_IS_EMULATOR_ERROR(520105),
    RST_POG_IS_HOOKED_ERROR(520106);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.Companion(null);
    private final int code;

    RemoteStatusCodes(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/RemoteStatusCodes$Companion;", "", "<init>", "()V", "", "findValue", "Lkotlin/Result;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RemoteStatusCodes;", "from-IoAF18A", "(I)Ljava/lang/Object;", "from"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: from-IoAF18A, reason: not valid java name */
        public final java.lang.Object m23168fromIoAF18A(int findValue) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.Companion companion2 = this;
                for (com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes remoteStatusCodes : com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.values()) {
                    if (remoteStatusCodes.getCode() == findValue) {
                        return kotlin.Result.m23436constructorimpl(remoteStatusCodes);
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
