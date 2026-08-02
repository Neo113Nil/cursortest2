package androidx.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/LongNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LongNavType extends androidx.view.NavType<java.lang.Long> {
    public LongNavType() {
        super(false);
    }

    @Override // androidx.view.NavType
    public final /* synthetic */ void put(android.os.Bundle bundle, java.lang.String str, java.lang.Long l) {
        put(bundle, str, l.longValue());
    }

    @Override // androidx.view.NavType
    public final java.lang.String getName() {
        return com.adjust.sdk.Constants.LONG;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.NavType
    public final java.lang.Long parseValue(java.lang.String value) {
        java.lang.String str;
        long parseLong;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (kotlin.text.StringsKt.endsWith$default(value, "L", false, 2, (java.lang.Object) null)) {
            str = value.substring(0, value.length() - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = value;
        }
        if (kotlin.text.StringsKt.startsWith$default(value, "0x", false, 2, (java.lang.Object) null)) {
            java.lang.String substring = str.substring(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            parseLong = java.lang.Long.parseLong(substring, kotlin.text.CharsKt.checkRadix(16));
        } else {
            parseLong = java.lang.Long.parseLong(str);
        }
        return java.lang.Long.valueOf(parseLong);
    }

    public final void put(android.os.Bundle bundle, java.lang.String key, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        androidx.view.SavedStateWriter.m9403putLongimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key, value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.NavType
    public final java.lang.Long get(android.os.Bundle bundle, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return java.lang.Long.valueOf(androidx.view.SavedStateReader.m9337getLongimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), key));
    }
}
