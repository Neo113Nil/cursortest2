package com.paypal.oslo.core.deeplink;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "", "", "pathWithQuery", "Larrow/core/Either;", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error;", "Landroidx/navigation3/runtime/NavKey;", "resolve", "(Ljava/lang/String;)Larrow/core/Either;", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeeplinkResolver {
    arrow.core.Either<com.paypal.oslo.core.deeplink.DeeplinkResolver.Error, androidx.navigation3.runtime.NavKey> resolve(java.lang.String pathWithQuery);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error;", "", "<init>", "()V", "MalformedPath", "UnrecognizedPath", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error$MalformedPath;", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error$UnrecognizedPath;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static abstract class Error {
        private Error() {
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error$MalformedPath;", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error;", "", "path", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error$MalformedPath;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPath"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MalformedPath extends com.paypal.oslo.core.deeplink.DeeplinkResolver.Error {
            private final java.lang.String path;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MalformedPath(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.path = str;
            }

            public final java.lang.String getPath() {
                return this.path;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.path;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MalformedPath(path=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.path.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) other).path);
            }

            public final com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath copy(java.lang.String path) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
                return new com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath(path);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getPath() {
                return this.path;
            }

            public static /* synthetic */ com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath copy$default(com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath malformedPath, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = malformedPath.path;
                }
                return malformedPath.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error$UnrecognizedPath;", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error;", "", "path", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/deeplink/DeeplinkResolver$Error$UnrecognizedPath;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPath"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnrecognizedPath extends com.paypal.oslo.core.deeplink.DeeplinkResolver.Error {
            private final java.lang.String path;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnrecognizedPath(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.path = str;
            }

            public final java.lang.String getPath() {
                return this.path;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.path;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnrecognizedPath(path=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.path.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath) other).path);
            }

            public final com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath copy(java.lang.String path) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
                return new com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath(path);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getPath() {
                return this.path;
            }

            public static /* synthetic */ com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath copy$default(com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath unrecognizedPath, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unrecognizedPath.path;
                }
                return unrecognizedPath.copy(str);
            }
        }

        public /* synthetic */ Error(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
