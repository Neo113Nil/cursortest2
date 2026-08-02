package org.betup.ui.dialogs.presentation;

import android.content.Context;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.services.LocaleService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationHtmlLocale.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/dialogs/presentation/PresentationHtmlLocale;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "SUPPORTED", "", "", "resolve", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationHtmlLocale {
    public static final PresentationHtmlLocale INSTANCE = new PresentationHtmlLocale();
    private static final Set<String> SUPPORTED = SetsKt.setOf((Object[]) new String[]{"en", "ro", "de", "es", "fr", "it", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "ru", "tr", "uk", "hi", "ar"});
    public static final int $stable = 8;

    private PresentationHtmlLocale() {
    }

    public final String resolve(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String language = LocaleService.getLanguage(context);
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = language.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return SUPPORTED.contains(lowerCase) ? lowerCase : "en";
    }
}
