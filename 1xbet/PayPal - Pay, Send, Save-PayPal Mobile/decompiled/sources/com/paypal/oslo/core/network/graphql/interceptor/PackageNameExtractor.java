package com.paypal.oslo.core.network.graphql.interceptor;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/interceptor/PackageNameExtractor;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "", "getPackageName$graphql_release", "(Lcom/apollographql/apollo/api/Operation;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PackageNameExtractor {
    public final java.lang.String getPackageName$graphql_release(com.apollographql.apollo.api.Operation<?> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        java.lang.Package r2 = operation.getClass().getPackage();
        if (r2 != null) {
            return r2.getName();
        }
        return null;
    }
}
