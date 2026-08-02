package androidx.core.text;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "parseAsHtml", "(Ljava/lang/String;ILandroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "toHtml", "(Landroid/text/Spanned;I)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt {
    public static final android.text.Spanned parseAsHtml(java.lang.String str, int i, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) {
        return androidx.core.text.HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
    }

    public static /* synthetic */ android.text.Spanned parseAsHtml$default(java.lang.String str, int i, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        return androidx.core.text.HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
    }

    public static final java.lang.String toHtml(android.text.Spanned spanned, int i) {
        return androidx.core.text.HtmlCompat.toHtml(spanned, i);
    }

    public static /* synthetic */ java.lang.String toHtml$default(android.text.Spanned spanned, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return androidx.core.text.HtmlCompat.toHtml(spanned, i);
    }
}
