package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/StringNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "parseValue", "(Ljava/lang/String;)Ljava/lang/String;", "serializeAsValue", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringNavType extends androidx.view.NavType<java.lang.String> {
    public StringNavType() {
        super(true);
    }

    @Override // androidx.view.NavType
    public final java.lang.String getName() {
        return "string";
    }

    @Override // androidx.view.NavType
    public final java.lang.String parseValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // androidx.view.NavType
    public final java.lang.String serializeAsValue(java.lang.String value) {
        java.lang.String encode$default;
        return (value == null || (encode$default = androidx.view.NavUriUtils.encode$default(androidx.view.NavUriUtils.INSTANCE, value, null, 2, null)) == null) ? "null" : encode$default;
    }

    @Override // androidx.view.NavType
    public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
        if (value != null) {
            androidx.view.SavedStateWriter.m9415putStringimpl(m9382constructorimpl, key, value);
        } else {
            androidx.view.SavedStateWriter.m9405putNullimpl(m9382constructorimpl, key);
        }
    }

    @Override // androidx.view.NavType
    public final java.lang.String get(android.os.Bundle bundle, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
        if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
            return null;
        }
        return androidx.view.SavedStateReader.m9367getStringimpl(m9296constructorimpl, key);
    }
}
