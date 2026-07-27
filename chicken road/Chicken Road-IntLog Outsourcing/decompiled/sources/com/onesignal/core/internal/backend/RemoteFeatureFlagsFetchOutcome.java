package com.onesignal.core.internal.backend;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class RemoteFeatureFlagsFetchOutcome {

    public static final class Success extends RemoteFeatureFlagsFetchOutcome {
        private final RemoteFeatureFlagsResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(RemoteFeatureFlagsResult result) {
            super(null);
            i.e(result, "result");
            this.result = result;
        }

        public static /* synthetic */ Success copy$default(Success success, RemoteFeatureFlagsResult remoteFeatureFlagsResult, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                remoteFeatureFlagsResult = success.result;
            }
            return success.copy(remoteFeatureFlagsResult);
        }

        public final RemoteFeatureFlagsResult component1() {
            return this.result;
        }

        public final Success copy(RemoteFeatureFlagsResult result) {
            i.e(result, "result");
            return new Success(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && i.a(this.result, ((Success) obj).result);
        }

        public final RemoteFeatureFlagsResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ')';
        }
    }

    public static final class Unavailable extends RemoteFeatureFlagsFetchOutcome {
        public static final Unavailable INSTANCE = new Unavailable();

        private Unavailable() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public int hashCode() {
            return 259983066;
        }

        public String toString() {
            return "Unavailable";
        }
    }

    public /* synthetic */ RemoteFeatureFlagsFetchOutcome(e eVar) {
        this();
    }

    private RemoteFeatureFlagsFetchOutcome() {
    }
}
