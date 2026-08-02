package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a[\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0013\u001aY\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0016"}, d2 = {"", "text", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ParagraphIntrinsics", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;)Landroidx/compose/ui/text/ParagraphIntrinsics;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphIntrinsicsKt {
    public static /* synthetic */ androidx.compose.ui.text.ParagraphIntrinsics ParagraphIntrinsics$default(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List list, java.util.List list2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return ParagraphIntrinsics(str, textStyle, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>>) list3, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list2, density, resourceLoader);
    }

    @kotlin.Deprecated(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @kotlin.ReplaceWith(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    public static final androidx.compose.ui.text.ParagraphIntrinsics ParagraphIntrinsics(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    public static /* synthetic */ androidx.compose.ui.text.ParagraphIntrinsics ParagraphIntrinsics$default(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List list, java.util.List list2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return ParagraphIntrinsics(str, textStyle, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>>) list3, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list2, density, resolver);
    }

    @kotlin.Deprecated(message = "Use an overload that takes `annotations` instead", replaceWith = @kotlin.ReplaceWith(expression = "ParagraphIntrinsics(text, style, spanStyles, density, fontFamilyResolver, placeholders)", imports = {}))
    public static final androidx.compose.ui.text.ParagraphIntrinsics ParagraphIntrinsics(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        return androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static /* synthetic */ androidx.compose.ui.text.ParagraphIntrinsics ParagraphIntrinsics$default(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List list, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return ParagraphIntrinsics(str, textStyle, (java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>>) list, density, resolver, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list2);
    }

    public static final androidx.compose.ui.text.ParagraphIntrinsics ParagraphIntrinsics(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> list, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2) {
        return androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }
}
