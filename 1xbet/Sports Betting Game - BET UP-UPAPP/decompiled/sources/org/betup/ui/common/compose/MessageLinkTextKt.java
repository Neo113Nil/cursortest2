package org.betup.ui.common.compose;

import android.content.Context;
import android.util.Patterns;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.tiktok.util.UrlConst;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.utils.ExternalBrowserOpener;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* compiled from: MessageLinkText.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006\u001a3\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"TRAILING_URL_PUNCTUATION", "", "findWebUrlRanges", "", "Lorg/betup/ui/common/compose/WebUrlRange;", "text", "", "trimTrailingUrlPunctuation", "url", "normalizeUrlForOpen", "openMessageLink", "", "context", "Landroid/content/Context;", "buildMessageAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "linkColor", "Landroidx/compose/ui/graphics/Color;", "onLinkClick", "Lkotlin/Function1;", "buildMessageAnnotatedString-bw27NRU", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/AnnotatedString;", "MessageTextWithLinks", "color", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", "modifier", "Landroidx/compose/ui/Modifier;", "MessageTextWithLinks-6BXD4ec", "(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessageLinkTextKt {
    private static final char[] TRAILING_URL_PUNCTUATION = {AbstractJsonLexerKt.COMMA, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, AbstractJsonLexerKt.COLON, '!', '?', ')', AbstractJsonLexerKt.END_LIST, '\"', '\''};

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageTextWithLinks_6BXD4ec$lambda$5(String str, long j, long j2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m12948MessageTextWithLinks6BXD4ec(str, j, j2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final List<WebUrlRange> findWebUrlRanges(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String str = text;
        if (StringsKt.isBlank(str)) {
            return CollectionsKt.emptyList();
        }
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(new WebUrlRange(matcher.start(), matcher.end()));
        }
        return arrayList;
    }

    public static final String trimTrailingUrlPunctuation(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        int length = url.length();
        while (length > 0 && ArraysKt.contains(TRAILING_URL_PUNCTUATION, url.charAt(length - 1))) {
            length--;
        }
        if (length == url.length()) {
            return url;
        }
        String substring = url.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final String normalizeUrlForOpen(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String obj = StringsKt.trim((CharSequence) url).toString();
        return (StringsKt.startsWith(obj, "http://", true) || StringsKt.startsWith(obj, UrlConst.HTTPS, true)) ? obj : UrlConst.HTTPS + obj;
    }

    public static final void openMessageLink(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        ExternalBrowserOpener.open(context, normalizeUrlForOpen(url));
    }

    /* renamed from: buildMessageAnnotatedString-bw27NRU, reason: not valid java name */
    public static final AnnotatedString m12949buildMessageAnnotatedStringbw27NRU(String text, long j, final Function1<? super String, Unit> onLinkClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
        List<WebUrlRange> findWebUrlRanges = findWebUrlRanges(text);
        if (findWebUrlRanges.isEmpty()) {
            return new AnnotatedString(text, null, 2, null);
        }
        LinkInteractionListener linkInteractionListener = new LinkInteractionListener() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.text.LinkInteractionListener
            public final void onClick(LinkAnnotation linkAnnotation) {
                MessageLinkTextKt.buildMessageAnnotatedString_bw27NRU$lambda$0(Function1.this, linkAnnotation);
            }
        };
        int i = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        for (WebUrlRange webUrlRange : findWebUrlRanges) {
            if (webUrlRange.getStart() > i) {
                String substring = text.substring(i, webUrlRange.getStart());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                builder.append(substring);
            }
            String substring2 = text.substring(webUrlRange.getStart(), webUrlRange.getEnd());
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String trimTrailingUrlPunctuation = trimTrailingUrlPunctuation(substring2);
            if (trimTrailingUrlPunctuation.length() <= 0) {
                builder.append(substring2);
            } else {
                int pushLink = builder.pushLink(new LinkAnnotation.Url(normalizeUrlForOpen(trimTrailingUrlPunctuation), new TextLinkStyles(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), null, null, null, 14, null), linkInteractionListener));
                try {
                    builder.append(trimTrailingUrlPunctuation);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    builder.pop(pushLink);
                }
            }
            i = webUrlRange.getEnd();
        }
        if (i < text.length()) {
            String substring3 = text.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            builder.append(substring3);
        }
        return builder.toAnnotatedString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildMessageAnnotatedString_bw27NRU$lambda$0(Function1 function1, LinkAnnotation link) {
        String url;
        Intrinsics.checkNotNullParameter(link, "link");
        LinkAnnotation.Url url2 = link instanceof LinkAnnotation.Url ? (LinkAnnotation.Url) link : null;
        if (url2 == null || (url = url2.getUrl()) == null) {
            return;
        }
        function1.invoke(url);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
    /* renamed from: MessageTextWithLinks-6BXD4ec, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12948MessageTextWithLinks6BXD4ec(final String text, final long j, long j2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        long j3;
        int i5;
        Modifier modifier2;
        boolean z;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1462007556);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                j3 = j2;
                i3 |= startRestartGroup.changed(j3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                        long sp = i4 == 0 ? TextUnitKt.getSp(15) : j3;
                        Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1462007556, i3, -1, "org.betup.ui.common.compose.MessageTextWithLinks (MessageLinkText.kt:114)");
                        }
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context context = (Context) consume;
                        long Color = ColorKt.Color(4279592384L);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        z = (i3 & 14) != 4;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = m12949buildMessageAnnotatedStringbw27NRU(text, Color, new Function1() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
                                    MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3 = MessageLinkTextKt.MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3(context, (String) obj);
                                    return MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final AnnotatedString annotatedString = (AnnotatedString) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        final long j4 = sp;
                        final Modifier modifier4 = modifier3;
                        SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(-361915655, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$MessageTextWithLinks$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-361915655, i6, -1, "org.betup.ui.common.compose.MessageTextWithLinks.<anonymous> (MessageLinkText.kt:124)");
                                }
                                BasicTextKt.m1824BasicTextCL7eQgs(annotatedString, modifier4, new TextStyle(j, j4, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), null, 0, false, 0, 0, null, null, null, composer2, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, 48, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = sp;
                        modifier2 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final long j5 = j3;
                        final Modifier modifier5 = modifier2;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit MessageTextWithLinks_6BXD4ec$lambda$5;
                                MessageTextWithLinks_6BXD4ec$lambda$5 = MessageLinkTextKt.MessageTextWithLinks_6BXD4ec$lambda$5(text, j, j5, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return MessageTextWithLinks_6BXD4ec$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i3 & 1171) == 1170) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context2 = (Context) consume2;
                long Color2 = ColorKt.Color(4279592384L);
                startRestartGroup.startReplaceGroup(-1633490746);
                if ((i3 & 14) != 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = m12949buildMessageAnnotatedStringbw27NRU(text, Color2, new Function1() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
                        MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3 = MessageLinkTextKt.MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3(context2, (String) obj);
                        return MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
                final AnnotatedString annotatedString2 = (AnnotatedString) rememberedValue;
                startRestartGroup.endReplaceGroup();
                final long j42 = sp;
                final Modifier modifier42 = modifier3;
                SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(-361915655, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$MessageTextWithLinks$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-361915655, i6, -1, "org.betup.ui.common.compose.MessageTextWithLinks.<anonymous> (MessageLinkText.kt:124)");
                        }
                        BasicTextKt.m1824BasicTextCL7eQgs(annotatedString2, modifier42, new TextStyle(j, j42, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), null, 0, false, 0, 0, null, null, null, composer2, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 48, 1);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = sp;
                modifier2 = modifier3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j3 = j2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localContext22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context22 = (Context) consume22;
            long Color22 = ColorKt.Color(4279592384L);
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 14) != 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = m12949buildMessageAnnotatedStringbw27NRU(text, Color22, new Function1() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
                    MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3 = MessageLinkTextKt.MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3(context22, (String) obj);
                    return MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue);
            final AnnotatedString annotatedString22 = (AnnotatedString) rememberedValue;
            startRestartGroup.endReplaceGroup();
            final long j422 = sp;
            final Modifier modifier422 = modifier3;
            SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(-361915655, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$MessageTextWithLinks$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-361915655, i6, -1, "org.betup.ui.common.compose.MessageTextWithLinks.<anonymous> (MessageLinkText.kt:124)");
                    }
                    BasicTextKt.m1824BasicTextCL7eQgs(annotatedString22, modifier422, new TextStyle(j, j422, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), null, 0, false, 0, 0, null, null, null, composer2, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
            }
            j3 = sp;
            modifier2 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j3 = j2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localContext222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context222 = (Context) consume222;
        long Color222 = ColorKt.Color(4279592384L);
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((i3 & 14) != 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = m12949buildMessageAnnotatedStringbw27NRU(text, Color222, new Function1() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
                MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3 = MessageLinkTextKt.MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3(context222, (String) obj);
                return MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3;
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue);
        final AnnotatedString annotatedString222 = (AnnotatedString) rememberedValue;
        startRestartGroup.endReplaceGroup();
        final long j4222 = sp;
        final Modifier modifier4222 = modifier3;
        SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(-361915655, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.MessageLinkTextKt$MessageTextWithLinks$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-361915655, i6, -1, "org.betup.ui.common.compose.MessageTextWithLinks.<anonymous> (MessageLinkText.kt:124)");
                }
                BasicTextKt.m1824BasicTextCL7eQgs(annotatedString222, modifier4222, new TextStyle(j, j4222, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), null, 0, false, 0, 0, null, null, null, composer2, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
        }
        j3 = sp;
        modifier2 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageTextWithLinks_6BXD4ec$lambda$4$lambda$3(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        openMessageLink(context, url);
        return Unit.INSTANCE;
    }
}
