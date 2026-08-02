package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00022\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/material3/internal/Strings;", "string", "", "getString-2EP1pXo", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getString", "", "", "formatArgs", "getString-qBjtwXw", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Strings_androidKt {
    /* renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final java.lang.String m4383getString2EP1pXo(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-907677715, i2, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
        java.lang.String string = ((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return string;
    }

    /* renamed from: getString-qBjtwXw, reason: not valid java name */
    public static final java.lang.String m4384getStringqBjtwXw(int i, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1427268608, i2, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        java.lang.String m4383getString2EP1pXo = m4383getString2EP1pXo(i, composer, i2 & 14);
        java.util.Locale locale = androidx.core.os.ConfigurationCompat.getLocales((android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = java.util.Locale.getDefault();
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        java.lang.String format = java.lang.String.format(locale, m4383getString2EP1pXo, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return format;
    }

    public static final java.lang.String formatString(java.lang.String str, java.lang.Object... objArr) {
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
