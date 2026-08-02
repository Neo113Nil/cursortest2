package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\f\u0010\u000e"}, d2 = {"", "id", "", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "", "", "formatArgs", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "stringArrayResource", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "pluralStringResource", "(IILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringResources_androidKt {
    public static final java.lang.String stringResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        java.lang.String string = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getString(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return string;
    }

    public static final java.lang.String stringResource(int i, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        java.lang.String string = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return string;
    }

    public static final java.lang.String[] stringArrayResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1562162650, i2, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:58)");
        }
        java.lang.String[] stringArray = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getStringArray(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringArray;
    }

    public static final java.lang.String pluralStringResource(int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1784741530, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:71)");
        }
        java.lang.String quantityString = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getQuantityString(i, i2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    public static final java.lang.String pluralStringResource(int i, int i2, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i3) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:85)");
        }
        java.lang.String quantityString = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getQuantityString(i, i2, java.util.Arrays.copyOf(objArr, objArr.length));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return quantityString;
    }
}
