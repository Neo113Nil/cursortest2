package org.betup.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ToastHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lorg/betup/utils/ToastHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "showShortIfForeground", "", "context", "Landroid/content/Context;", "message", "", "stringResId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToastHelper {
    public static final int $stable = 0;
    public static final ToastHelper INSTANCE = new ToastHelper();

    private ToastHelper() {
    }

    @JvmStatic
    public static final void showShortIfForeground(Context context, CharSequence message) {
        SnackbarHelper.showShortIfForeground(context, message);
    }

    @JvmStatic
    public static final void showShortIfForeground(Context context, int stringResId) {
        SnackbarHelper.showShortIfForeground(context, stringResId);
    }
}
