package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/meta/Prefs;", "", "", "key", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "Lkotlin/Function0;", "generator", "getOrPut", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Prefs {
    java.lang.String getOrPut(java.lang.String key, java.lang.String r2, kotlin.jvm.functions.Function0<java.lang.String> generator);

    java.lang.String getString(java.lang.String key, java.lang.String r2);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.String getString$default(com.zettle.sdk.meta.Prefs prefs, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return prefs.getString(str, str2);
        }

        public static /* synthetic */ java.lang.String getOrPut$default(com.zettle.sdk.meta.Prefs prefs, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrPut");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return prefs.getOrPut(str, str2, function0);
        }
    }
}
