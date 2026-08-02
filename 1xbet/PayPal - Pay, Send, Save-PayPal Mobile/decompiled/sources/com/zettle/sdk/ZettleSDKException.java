package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u001d\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e"}, d2 = {"Lcom/zettle/sdk/ZettleSDKException;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "GenericError", "PluginError", "PrerequisitesNotFulfilled", "Unsupported", "Lcom/zettle/sdk/ZettleSDKException$GenericError;", "Lcom/zettle/sdk/ZettleSDKException$PluginError;", "Lcom/zettle/sdk/ZettleSDKException$PrerequisitesNotFulfilled;", "Lcom/zettle/sdk/ZettleSDKException$Unsupported;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ZettleSDKException extends java.lang.Throwable {
    private ZettleSDKException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/ZettleSDKException$GenericError;", "Lcom/zettle/sdk/ZettleSDKException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GenericError extends com.zettle.sdk.ZettleSDKException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(java.lang.Throwable th) {
            super("Generic error", th, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/ZettleSDKException$Unsupported;", "Lcom/zettle/sdk/ZettleSDKException;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unsupported extends com.zettle.sdk.ZettleSDKException {
        /* JADX WARN: Multi-variable type inference failed */
        public Unsupported() {
            super("Action is not supported", null, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/ZettleSDKException$PluginError;", "Lcom/zettle/sdk/ZettleSDKException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PluginError extends com.zettle.sdk.ZettleSDKException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PluginError(java.lang.String str, java.lang.Throwable th) {
            super(str, th, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/ZettleSDKException$PrerequisitesNotFulfilled;", "Lcom/zettle/sdk/ZettleSDKException;", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "missing", "<init>", "(Ljava/util/Set;)V", "Ljava/util/Set;", "getMissing", "()Ljava/util/Set;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PrerequisitesNotFulfilled extends com.zettle.sdk.ZettleSDKException {
        private final java.util.Set<com.zettle.sdk.core.permission.Prerequisite> missing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PrerequisitesNotFulfilled(java.util.Set<? extends com.zettle.sdk.core.permission.Prerequisite> set) {
            super("Prerequisites not fulfilled: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(set, ", ", null, null, 0, null, null, 62, null))), null, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.missing = set;
        }

        public final java.util.Set<com.zettle.sdk.core.permission.Prerequisite> getMissing() {
            return this.missing;
        }
    }

    public /* synthetic */ ZettleSDKException(java.lang.String str, java.lang.Throwable th, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }
}
