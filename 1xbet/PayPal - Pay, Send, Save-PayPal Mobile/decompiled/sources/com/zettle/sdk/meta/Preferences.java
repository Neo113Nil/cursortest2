package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/meta/Preferences;", "Lcom/zettle/sdk/meta/Prefs;", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "key", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "Lkotlin/Function0;", "generator", "getOrPut", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/SharedPreferences;", "getHighSpeedVideoFpsRanges", "Landroid/content/SharedPreferences;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Preferences implements com.zettle.sdk.meta.Prefs {
    private final android.content.SharedPreferences getHighSpeedVideoFpsRanges;

    public Preferences(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.getHighSpeedVideoFpsRanges = sharedPreferences;
    }

    @Override // com.zettle.sdk.meta.Prefs
    public final java.lang.String getString(java.lang.String key, java.lang.String r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRanges.getString(key, r3);
    }

    @Override // com.zettle.sdk.meta.Prefs
    public final java.lang.String getOrPut(java.lang.String key, java.lang.String r3, kotlin.jvm.functions.Function0<java.lang.String> generator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generator, "");
        java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(key, r3);
        if (string != null) {
            return string;
        }
        java.lang.String invoke = generator.invoke();
        this.getHighSpeedVideoFpsRanges.edit().putString(key, invoke).apply();
        return invoke;
    }
}
