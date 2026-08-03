package androidx.compose.ui.res;

/* compiled from: StringResources.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"pluralStringResource", "", "id", "", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "(IILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "stringArrayResource", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringResources_androidKt {
    public static final java.lang.String stringResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 1223887937, "C(stringResource)33@1088L11:StringResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        java.lang.String string = androidx.compose.ui.res.Resources_androidKt.resources(composer, 0).getString(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return string;
    }

    public static final java.lang.String stringResource(int i, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2071230100, "C(stringResource)P(1)47@1452L11:StringResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        java.lang.String string = androidx.compose.ui.res.Resources_androidKt.resources(composer, 0).getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return string;
    }

    public static final java.lang.String[] stringArrayResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 1562162650, "C(stringArrayResource)60@1758L11:StringResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1562162650, i2, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        java.lang.String[] stringArray = androidx.compose.ui.res.Resources_androidKt.resources(composer, 0).getStringArray(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return stringArray;
    }

    public static final java.lang.String pluralStringResource(int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 1784741530, "C(pluralStringResource)P(1)74@2102L11:StringResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1784741530, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        java.lang.String quantityString = androidx.compose.ui.res.Resources_androidKt.resources(composer, 0).getQuantityString(i, i2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return quantityString;
    }

    public static final java.lang.String pluralStringResource(int i, int i2, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i3) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 523207213, "C(pluralStringResource)P(2)89@2568L11:StringResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        java.lang.String quantityString = androidx.compose.ui.res.Resources_androidKt.resources(composer, 0).getQuantityString(i, i2, java.util.Arrays.copyOf(objArr, objArr.length));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return quantityString;
    }
}
