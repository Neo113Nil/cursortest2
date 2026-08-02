package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler;", "", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "deepLinkResolver", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$RelativeUrlMapper;", "relativeUrlMapper", "<init>", "(Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$RelativeUrlMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/navigation/CreditMobileDeeplink;", "creditMobileDeeplink", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error;", "Landroidx/navigation3/runtime/NavKey;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/navigation/CreditMobileDeeplink;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$RelativeUrlMapper;", "Error", "RelativeUrlMapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditMobileDeeplinkHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.deeplink.DeeplinkResolver Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CreditMobileDeeplinkHandler(com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver, com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper relativeUrlMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeUrlMapper, "");
        this.Camera2StreamConfigurationMap = deeplinkResolver;
        this.getHighSpeedVideoSizes = relativeUrlMapper;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error;", "", "InvalidPathWithQuery", "DeeplinkResolutionError", "UnexpectedException", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error$DeeplinkResolutionError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error$InvalidPathWithQuery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error$UnexpectedException;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Error {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error$InvalidPathWithQuery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidPathWithQuery implements com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.InvalidPathWithQuery INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.InvalidPathWithQuery();

            public final int hashCode() {
                return 663047422;
            }

            private InvalidPathWithQuery() {
            }

            public final java.lang.String toString() {
                return "InvalidPathWithQuery";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.InvalidPathWithQuery)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error$DeeplinkResolutionError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DeeplinkResolutionError implements com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.DeeplinkResolutionError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.DeeplinkResolutionError();

            public final int hashCode() {
                return 1010419006;
            }

            private DeeplinkResolutionError() {
            }

            public final java.lang.String toString() {
                return "DeeplinkResolutionError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.DeeplinkResolutionError)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error$UnexpectedException;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$Error$UnexpectedException;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnexpectedException implements com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error {
            public static final int $stable = 8;
            private final java.lang.Throwable throwable;

            public UnexpectedException(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.throwable = th;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public final java.lang.String toString() {
                java.lang.Throwable th = this.throwable;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnexpectedException(throwable=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.throwable.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.UnexpectedException) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.UnexpectedException) other).throwable);
            }

            public final com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.UnexpectedException copy(java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
                return new com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.UnexpectedException(throwable);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.UnexpectedException copy$default(com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.UnexpectedException unexpectedException, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = unexpectedException.throwable;
                }
                return unexpectedException.copy(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error, androidx.navigation3.runtime.NavKey> invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.navigation.CreditMobileDeeplink creditMobileDeeplink) {
        java.lang.Object m23436constructorimpl;
        java.lang.Throwable m23439exceptionOrNullimpl;
        java.lang.String invoke;
        java.lang.String str;
        arrow.core.Either.Right left;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler creditMobileDeeplinkHandler = this;
            invoke = this.getHighSpeedVideoSizes.invoke(creditMobileDeeplink);
            str = invoke;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            arrow.core.Either<com.paypal.oslo.core.deeplink.DeeplinkResolver.Error, androidx.navigation3.runtime.NavKey> resolve = this.Camera2StreamConfigurationMap.resolve(invoke);
            if (resolve instanceof arrow.core.Either.Left) {
                left = new arrow.core.Either.Left(com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.DeeplinkResolutionError.INSTANCE);
            } else {
                if (!(resolve instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                left = new arrow.core.Either.Right(((arrow.core.Either.Right) resolve).getValue());
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(left);
            m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
                m23436constructorimpl = arrow.core.EitherKt.left(new com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.UnexpectedException(m23439exceptionOrNullimpl));
            }
            return (arrow.core.Either) m23436constructorimpl;
        }
        left = arrow.core.EitherKt.left(com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.Error.InvalidPathWithQuery.INSTANCE);
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(left);
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
        }
        return (arrow.core.Either) m23436constructorimpl;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$RelativeUrlMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/navigation/CreditMobileDeeplink;", "mobileDeeplink", "", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/navigation/CreditMobileDeeplink;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RelativeUrlMapper {
        public static final int $stable = 0;

        @java.lang.Deprecated
        public static final java.lang.String APP_LINK_SCHEME = "paypal";
        private static final com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper.Companion(null);

        @javax.inject.Inject
        public RelativeUrlMapper() {
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x00df, TryCatch #0 {all -> 0x00df, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0010, B:9:0x0018, B:12:0x0022, B:15:0x003b, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:23:0x0057, B:25:0x0061, B:27:0x0067, B:29:0x0076, B:34:0x0096, B:35:0x009c, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:43:0x00cc, B:45:0x00d4, B:46:0x00da, B:56:0x007f, B:58:0x0088, B:62:0x002c, B:64:0x0034, B:66:0x006e), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.navigation.CreditMobileDeeplink mobileDeeplink) {
            java.lang.Object m23436constructorimpl;
            java.lang.String url;
            android.net.Uri parse;
            java.lang.String scheme;
            java.lang.String substringAfter;
            java.lang.String str;
            android.net.Uri uri;
            android.net.Uri parse2;
            android.net.Uri.Builder buildUpon;
            android.net.Uri.Builder query;
            android.net.Uri.Builder fragment;
            android.net.Uri build;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper relativeUrlMapper = this;
                url = mobileDeeplink != null ? mobileDeeplink.getUrl() : null;
                parse = url != null ? android.net.Uri.parse(url) : null;
                scheme = parse != null ? parse.getScheme() : null;
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (scheme == null) {
                if (url != null) {
                    substringAfter = kotlin.text.StringsKt.substringAfter(url, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, url);
                    if (substringAfter != null) {
                    }
                    str = null;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
                    return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
                }
                substringAfter = null;
                if (substringAfter != null) {
                }
                str = null;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
                return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
            }
            if (scheme.hashCode() == -995205389 && scheme.equals("paypal")) {
                substringAfter = kotlin.text.StringsKt.substringAfter(url, "://", url);
                if (substringAfter != null) {
                    if (!kotlin.text.StringsKt.startsWith$default(substringAfter, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
                        substringAfter = !kotlin.text.StringsKt.isBlank(substringAfter) ? androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR.concat(java.lang.String.valueOf(substringAfter)) : null;
                    }
                    if (substringAfter != null) {
                        java.util.Map<java.lang.String, java.lang.String> params = mobileDeeplink != null ? mobileDeeplink.getParams() : null;
                        android.net.Uri.Builder buildUpon2 = android.net.Uri.parse(substringAfter).buildUpon();
                        if (buildUpon2 != null) {
                            if (params != null) {
                                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : params.entrySet()) {
                                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                                }
                            }
                            uri = buildUpon2.build();
                        } else {
                            uri = null;
                        }
                        if (uri != null) {
                            str = uri.toString();
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
                            return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
                        }
                    }
                }
                str = null;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
                return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
            }
            java.lang.String path = parse.getPath();
            if (path != null && (parse2 = android.net.Uri.parse(path)) != null && (buildUpon = parse2.buildUpon()) != null && (query = buildUpon.query(parse.getQuery())) != null && (fragment = query.fragment(parse.getFragment())) != null && (build = fragment.build()) != null) {
                substringAfter = build.toString();
                if (substringAfter != null) {
                }
                str = null;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
                return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
            }
            substringAfter = null;
            if (substringAfter != null) {
            }
            str = null;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
            return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler$RelativeUrlMapper$Companion;", "", "<init>", "()V", "", "APP_LINK_SCHEME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
