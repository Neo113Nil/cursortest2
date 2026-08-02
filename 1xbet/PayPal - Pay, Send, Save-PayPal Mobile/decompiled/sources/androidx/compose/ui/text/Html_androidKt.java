package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "htmlString", "Landroidx/compose/ui/text/TextLinkStyles;", "linkStyles", "Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "Landroidx/compose/ui/text/AnnotatedString;", "fromHtml", "(Landroidx/compose/ui/text/AnnotatedString$Companion;Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/Spanned;", "toAnnotatedString", "(Landroid/text/Spanned;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/Html_androidKt$TagHandler$1;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/Html_androidKt$TagHandler$1;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Html_androidKt {
    private static final androidx.compose.ui.text.Html_androidKt$TagHandler$1 getHighSpeedVideoFpsRanges = new android.text.Html.TagHandler() { // from class: androidx.compose.ui.text.Html_androidKt$TagHandler$1
        @Override // android.text.Html.TagHandler
        public final void handleTag(boolean opening, java.lang.String tag, android.text.Editable output, org.xml.sax.XMLReader xmlReader) {
            if (xmlReader == null || output == null || !opening || !kotlin.jvm.internal.Intrinsics.areEqual(tag, "ContentHandlerReplacementTag")) {
                return;
            }
            xmlReader.setContentHandler(new androidx.compose.ui.text.AnnotationContentHandler(xmlReader.getContentHandler(), output));
        }
    };

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString fromHtml$default(androidx.compose.ui.text.AnnotatedString.Companion companion, java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            textLinkStyles = null;
        }
        if ((i & 4) != 0) {
            linkInteractionListener = null;
        }
        return fromHtml(companion, str, textLinkStyles, linkInteractionListener);
    }

    public static final androidx.compose.ui.text.AnnotatedString fromHtml(androidx.compose.ui.text.AnnotatedString.Companion companion, java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
        return toAnnotatedString(androidx.core.text.HtmlCompat.fromHtml("<ContentHandlerReplacementTag />".concat(java.lang.String.valueOf(str)), 63, null, getHighSpeedVideoFpsRanges), textLinkStyles, linkInteractionListener);
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString toAnnotatedString$default(android.text.Spanned spanned, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textLinkStyles = null;
        }
        if ((i & 2) != 0) {
            linkInteractionListener = null;
        }
        return toAnnotatedString(spanned, textLinkStyles, linkInteractionListener);
    }

    public static final androidx.compose.ui.text.AnnotatedString toAnnotatedString(android.text.Spanned spanned, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
        java.lang.String url;
        int m8448getStarte0LSkKk;
        androidx.compose.ui.text.AnnotatedString.Builder append = new androidx.compose.ui.text.AnnotatedString.Builder(spanned.length()).append((java.lang.CharSequence) spanned);
        for (java.lang.Object obj : spanned.getSpans(0, append.getLength(), java.lang.Object.class)) {
            long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            int m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(TextRange);
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(TextRange);
            if (!(obj instanceof android.text.style.AbsoluteSizeSpan)) {
                if (!(obj instanceof android.text.style.AlignmentSpan)) {
                    if (obj instanceof androidx.compose.ui.text.AnnotationSpan) {
                        androidx.compose.ui.text.AnnotationSpan annotationSpan = (androidx.compose.ui.text.AnnotationSpan) obj;
                        append.addStringAnnotation(annotationSpan.getGetHighSpeedVideoSizes(), annotationSpan.getCamera2StreamConfigurationMap(), m8039getStartimpl, m8034getEndimpl);
                    } else if (obj instanceof android.text.style.BackgroundColorSpan) {
                        append.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, androidx.compose.ui.graphics.ColorKt.Color(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()), (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 63487, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                    } else if (obj instanceof androidx.compose.ui.text.BulletSpanWithLevel) {
                        long m7861getDefaultIndentationXSAIIZE = androidx.compose.ui.text.Bullet.INSTANCE.m7861getDefaultIndentationXSAIIZE();
                        androidx.compose.ui.text.BulletSpanWithLevel bulletSpanWithLevel = (androidx.compose.ui.text.BulletSpanWithLevel) obj;
                        int indentationLevel = bulletSpanWithLevel.getIndentationLevel();
                        androidx.compose.ui.unit.TextUnitKt.m8808checkArithmeticR2X_6o(m7861getDefaultIndentationXSAIIZE);
                        append.m7851addBulletr9BaKPg(bulletSpanWithLevel.getBullet(), androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(m7861getDefaultIndentationXSAIIZE), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(m7861getDefaultIndentationXSAIIZE) * indentationLevel), m8039getStartimpl, m8034getEndimpl);
                    } else if (obj instanceof android.text.style.ForegroundColorSpan) {
                        append.addStyle(new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()), 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                    } else if (obj instanceof android.text.style.RelativeSizeSpan) {
                        append.addStyle(new androidx.compose.ui.text.SpanStyle(0L, androidx.compose.ui.unit.TextUnitKt.getEm(((android.text.style.RelativeSizeSpan) obj).getSizeChange()), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65533, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                    } else if (obj instanceof android.text.style.StrikethroughSpan) {
                        append.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61439, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                    } else {
                        androidx.compose.ui.text.font.GenericFontFamily genericFontFamily = null;
                        androidx.compose.ui.text.SpanStyle spanStyle = null;
                        genericFontFamily = null;
                        genericFontFamily = null;
                        if (!(obj instanceof android.text.style.StyleSpan)) {
                            if (obj instanceof android.text.style.SubscriptSpan) {
                                append.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, androidx.compose.ui.text.style.BaselineShift.m8309boximpl(androidx.compose.ui.text.style.BaselineShift.INSTANCE.m8321getSubscripty9eOQZs()), (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65279, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                            } else if (obj instanceof android.text.style.SuperscriptSpan) {
                                append.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, androidx.compose.ui.text.style.BaselineShift.m8309boximpl(androidx.compose.ui.text.style.BaselineShift.INSTANCE.m8322getSuperscripty9eOQZs()), (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65279, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                            } else if (obj instanceof android.text.style.TypefaceSpan) {
                                android.text.style.TypefaceSpan typefaceSpan = (android.text.style.TypefaceSpan) obj;
                                java.lang.String family = typefaceSpan.getFamily();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive().getName())) {
                                    genericFontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive();
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace().getName())) {
                                    genericFontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace();
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif().getName())) {
                                    genericFontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif();
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif().getName())) {
                                    genericFontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif();
                                } else {
                                    java.lang.String family2 = typefaceSpan.getFamily();
                                    java.lang.String str = family2;
                                    if (str != null && str.length() != 0) {
                                        android.graphics.Typeface create = android.graphics.Typeface.create(family2, 0);
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(create, android.graphics.Typeface.DEFAULT) || kotlin.jvm.internal.Intrinsics.areEqual(create, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0))) {
                                            create = null;
                                        }
                                        if (create != null) {
                                            genericFontFamily = androidx.compose.ui.text.font.AndroidTypeface_androidKt.FontFamily(create);
                                        }
                                    }
                                }
                                append.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, genericFontFamily, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65503, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                            } else if (obj instanceof android.text.style.UnderlineSpan) {
                                append.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61439, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                            } else if ((obj instanceof android.text.style.URLSpan) && (url = ((android.text.style.URLSpan) obj).getURL()) != null) {
                                append.addLink(new androidx.compose.ui.text.LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), m8039getStartimpl, m8034getEndimpl);
                            }
                        } else {
                            int style = ((android.text.style.StyleSpan) obj).getStyle();
                            if (style == 1) {
                                spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65531, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            } else if (style == 2) {
                                spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, androidx.compose.ui.text.font.FontStyle.m8149boximpl(androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()), (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65527, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            } else if (style == 3) {
                                spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), androidx.compose.ui.text.font.FontStyle.m8149boximpl(androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()), (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65523, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            }
                            if (spanStyle != null) {
                                append.addStyle(spanStyle, m8039getStartimpl, m8034getEndimpl);
                            }
                        }
                    }
                } else {
                    android.text.Layout.Alignment alignment = ((android.text.style.AlignmentSpan) obj).getAlignment();
                    int i = alignment == null ? -1 : androidx.compose.ui.text.Html_androidKt.WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                    if (i == 1) {
                        m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
                    } else if (i == 2) {
                        m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
                    } else if (i == 3) {
                        m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk();
                    } else {
                        m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk();
                    }
                    append.addStyle(new androidx.compose.ui.text.ParagraphStyle(m8448getStarte0LSkKk, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformParagraphStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 510, (kotlin.jvm.internal.DefaultConstructorMarker) null), m8039getStartimpl, m8034getEndimpl);
                }
            }
        }
        return append.toAnnotatedString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.text.Layout.Alignment.values().length];
            try {
                iArr[android.text.Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[android.text.Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[android.text.Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
