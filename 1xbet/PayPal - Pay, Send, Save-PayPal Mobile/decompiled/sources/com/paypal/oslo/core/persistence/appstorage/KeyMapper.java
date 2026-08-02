package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\tJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\tJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\tJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\tJ)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\tJ#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\tJ'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/KeyMapper;", "", "<init>", "()V", "", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "name", "Landroidx/datastore/preferences/core/Preferences$Key;", "stringKey", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;", "", "intKey", "", "booleanKey", "", "longKey", "", "floatKey", "", "doubleKey", "", "stringSetKey", "", "byteArrayKey", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "isModuleKey", "(Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KeyMapper {
    public static final com.paypal.oslo.core.persistence.appstorage.KeyMapper INSTANCE = new com.paypal.oslo.core.persistence.appstorage.KeyMapper();

    private KeyMapper() {
    }

    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.stringKey(getHighSpeedVideoFpsRanges(module, name2, "string"));
    }

    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> intKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.intKey(getHighSpeedVideoFpsRanges(module, name2, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT));
    }

    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> booleanKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.booleanKey(getHighSpeedVideoFpsRanges(module, name2, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN));
    }

    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> longKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.longKey(getHighSpeedVideoFpsRanges(module, name2, com.adjust.sdk.Constants.LONG));
    }

    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> floatKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.floatKey(getHighSpeedVideoFpsRanges(module, name2, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT));
    }

    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> doubleKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.doubleKey(getHighSpeedVideoFpsRanges(module, name2, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE));
    }

    public final androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.stringSetKey(getHighSpeedVideoFpsRanges(module, name2, "stringset"));
    }

    public final androidx.datastore.preferences.core.Preferences.Key<byte[]> byteArrayKey(java.lang.String module, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return androidx.content.preferences.core.PreferencesKeys.byteArrayKey(getHighSpeedVideoFpsRanges(module, name2, "bytearray"));
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        sb.append("_");
        sb.append(p2);
        sb.append("_");
        sb.append(p1);
        return sb.toString();
    }

    public final boolean isModuleKey(java.lang.String key, java.lang.String module) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(module);
        sb.append("_");
        return kotlin.text.StringsKt.startsWith$default(key, sb.toString(), false, 2, (java.lang.Object) null);
    }
}
