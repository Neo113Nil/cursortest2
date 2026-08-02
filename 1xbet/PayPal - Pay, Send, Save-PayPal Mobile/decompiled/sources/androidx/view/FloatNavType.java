package androidx.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/FloatNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Float;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FloatNavType extends androidx.view.NavType<java.lang.Float> {
    public FloatNavType() {
        super(false);
    }

    @Override // androidx.view.NavType
    public final /* synthetic */ void put(android.os.Bundle bundle, java.lang.String str, java.lang.Float f) {
        put(bundle, str, f.floatValue());
    }

    @Override // androidx.view.NavType
    public final java.lang.String getName() {
        return androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.NavType
    public final java.lang.Float parseValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return java.lang.Float.valueOf(java.lang.Float.parseFloat(value));
    }

    public final void put(android.os.Bundle bundle, java.lang.String key, float value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        androidx.view.SavedStateWriter.m9397putFloatimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key, value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.NavType
    public final java.lang.Float get(android.os.Bundle bundle, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return java.lang.Float.valueOf(androidx.view.SavedStateReader.m9323getFloatimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), key));
    }
}
