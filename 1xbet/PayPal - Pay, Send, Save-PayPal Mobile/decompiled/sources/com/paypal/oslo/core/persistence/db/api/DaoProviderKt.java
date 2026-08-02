package com.paypal.oslo.core.persistence.db.api;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a \u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/api/DatabaseDao;", "T", "Lcom/paypal/oslo/core/persistence/db/api/DaoProvider;", "getDao", "(Lcom/paypal/oslo/core/persistence/db/api/DaoProvider;)Lcom/paypal/oslo/core/persistence/db/api/DatabaseDao;", "provider", "", "simpleName", "classDescription", "getDaoByClass", "(Lcom/paypal/oslo/core/persistence/db/api/DaoProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/persistence/db/api/DatabaseDao;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DaoProviderKt {
    public static final /* synthetic */ <T extends com.paypal.oslo.core.persistence.db.api.DatabaseDao> T getDao(com.paypal.oslo.core.persistence.db.api.DaoProvider daoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daoProvider, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.persistence.db.api.DatabaseDao.class).getSimpleName();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        T t = (T) getDaoByClass(daoProvider, simpleName, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.persistence.db.api.DatabaseDao.class).toString());
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }

    public static final com.paypal.oslo.core.persistence.db.api.DatabaseDao getDaoByClass(com.paypal.oslo.core.persistence.db.api.DaoProvider daoProvider, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (str != null) {
            if (str.length() > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String valueOf = java.lang.String.valueOf(str.charAt(0));
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                java.lang.String lowerCase = valueOf.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                sb.append((java.lang.Object) lowerCase);
                java.lang.String substring = str.substring(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                sb.append(substring);
                str = sb.toString();
            }
            if (str != null) {
                return daoProvider.getDao(str);
            }
        }
        throw new java.lang.IllegalArgumentException("Cannot determine DAO name from type ".concat(java.lang.String.valueOf(str2)));
    }
}
