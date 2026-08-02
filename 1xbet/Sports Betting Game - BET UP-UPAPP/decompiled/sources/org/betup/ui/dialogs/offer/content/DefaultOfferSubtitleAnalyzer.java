package org.betup.ui.dialogs.offer.content;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferSubtitleAnalyzer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/offer/content/DefaultOfferSubtitleAnalyzer;", "Lorg/betup/ui/dialogs/offer/content/OfferSubtitleAnalyzer;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "bom", "", "analyze", "Lorg/betup/ui/dialogs/offer/content/OfferSubtitleContentType;", "subtitle", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultOfferSubtitleAnalyzer implements OfferSubtitleAnalyzer {
    public static final int $stable = 0;
    private final String bom = "\ufeff";

    @Override // org.betup.ui.dialogs.offer.content.OfferSubtitleAnalyzer
    public OfferSubtitleContentType analyze(String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        String obj = StringsKt.trimStart((CharSequence) StringsKt.removePrefix(StringsKt.trimStart((CharSequence) subtitle).toString(), (CharSequence) this.bom)).toString();
        if (!StringsKt.startsWith(obj, "<!DOCTYPE html", true) && !StringsKt.startsWith(obj, "<html", true) && !StringsKt.contains((CharSequence) StringsKt.take(obj, 150), (CharSequence) "<!DOCTYPE", true)) {
            return OfferSubtitleContentType.PLAIN_TEXT;
        }
        return OfferSubtitleContentType.HTML;
    }
}
