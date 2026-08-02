package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.utils.SupportedLanguagesManager;

/* compiled from: FlashBetApiLanguage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"flashBetApiLanguage", "", "context", "Landroid/content/Context;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlashBetApiLanguageKt {
    public static final String flashBetApiLanguage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        Intrinsics.checkNotNullExpressionValue(supportedLanguage, "getSupportedLanguage(...)");
        return supportedLanguage;
    }
}
