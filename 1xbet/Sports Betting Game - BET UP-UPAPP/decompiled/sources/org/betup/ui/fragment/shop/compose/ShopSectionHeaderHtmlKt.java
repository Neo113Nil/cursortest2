package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ironsource.X3;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler;

/* compiled from: ShopSectionHeaderHtml.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u000e"}, d2 = {"SECTION_TIMER_TEMPLATE_ASSET", "", "SectionHeaderTimerWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ShopSectionHeaderTimerHtml", "", "resetAtMillis", "", "modifier", "Landroidx/compose/ui/Modifier;", "(JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "escapeShopHeaderHtml", "value", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopSectionHeaderHtmlKt {
    private static final String SECTION_TIMER_TEMPLATE_ASSET = "shop/shop_section_header_timer.html";
    private static final float SectionHeaderTimerWidth = Dp.m7774constructorimpl(136);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionHeaderTimerHtml$lambda$4(long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShopSectionHeaderTimerHtml(j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopSectionHeaderTimerHtml(final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Context context;
        Object rememberedValue;
        String str;
        boolean z;
        Object rememberedValue2;
        BufferedReader bufferedReader;
        Object rememberedValue3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1669197504);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(j) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        try {
            if (i4 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
                if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1669197504, i3, -1, "org.betup.ui.fragment.shop.compose.ShopSectionHeaderTimerHtml (ShopSectionHeaderHtml.kt:19)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    context = (Context) consume;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        String string = context.getString(R.string.shop_reset_in, "");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        rememberedValue = StringsKt.trimEnd((CharSequence) StringsKt.replace$default(string, "%1$s", "", false, 4, (Object) null)).toString();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    str = (String) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    z = (i3 & 14) != 4;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        InputStream open = context.getAssets().open(SECTION_TIMER_TEMPLATE_ASSET);
                        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
                        bufferedReader = !(inputStreamReader instanceof BufferedReader) ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        String readText = TextStreamsKt.readText(bufferedReader);
                        CloseableKt.closeFinally(bufferedReader, null);
                        rememberedValue2 = ShopResponsiveHtml.INSTANCE.inject(StringsKt.replace$default(StringsKt.replace$default(readText, "{{resetLabel}}", escapeShopHeaderHtml(str), false, 4, (Object) null), "{{resetAtMillis}}", String.valueOf(j), false, 4, (Object) null));
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    String str2 = (String) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new OfferWebViewBridgeHandler() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionHeaderHtmlKt$ShopSectionHeaderTimerHtml$bridgeHandler$1$1
                            @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
                            public void onClose() {
                            }

                            @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
                            public void onPurchaseRequest() {
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    ShopWebViewScreenKt.ShopWebViewScreen(str2, (ShopSectionHeaderHtmlKt$ShopSectionHeaderTimerHtml$bridgeHandler$1$1) rememberedValue3, SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(modifier3, SectionHeaderTimerWidth), ShopSectionHeaderKt.getShopSectionHeaderHeight()), startRestartGroup, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionHeaderHtmlKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ShopSectionHeaderTimerHtml$lambda$4;
                            ShopSectionHeaderTimerHtml$lambda$4 = ShopSectionHeaderHtmlKt.ShopSectionHeaderTimerHtml$lambda$4(j, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ShopSectionHeaderTimerHtml$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            String readText2 = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            rememberedValue2 = ShopResponsiveHtml.INSTANCE.inject(StringsKt.replace$default(StringsKt.replace$default(readText2, "{{resetLabel}}", escapeShopHeaderHtml(str), false, 4, (Object) null), "{{resetAtMillis}}", String.valueOf(j), false, 4, (Object) null));
            startRestartGroup.updateRememberedValue(rememberedValue2);
            String str22 = (String) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            ShopWebViewScreenKt.ShopWebViewScreen(str22, (ShopSectionHeaderHtmlKt$ShopSectionHeaderTimerHtml$bridgeHandler$1$1) rememberedValue3, SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(modifier3, SectionHeaderTimerWidth), ShopSectionHeaderKt.getShopSectionHeaderHeight()), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedReader, th);
                throw th2;
            }
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        context = (Context) consume2;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        str = (String) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((i3 & 14) != 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        InputStream open2 = context.getAssets().open(SECTION_TIMER_TEMPLATE_ASSET);
        Intrinsics.checkNotNullExpressionValue(open2, "open(...)");
        Reader inputStreamReader2 = new InputStreamReader(open2, Charsets.UTF_8);
        bufferedReader = !(inputStreamReader2 instanceof BufferedReader) ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
    }

    private static final String escapeShopHeaderHtml(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, X3.j.c, "&amp;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "'", "&#39;", false, 4, (Object) null);
    }
}
