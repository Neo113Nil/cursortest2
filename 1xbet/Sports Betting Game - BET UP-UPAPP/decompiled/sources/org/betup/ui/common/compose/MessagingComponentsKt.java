package org.betup.ui.common.compose;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.ironsource.X2;
import com.vanniktech.emoji.EmojiEditText;
import com.vanniktech.emoji.EmojiPopup;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.ui.fragment.user.compose.messages.MessageBubbleUi;
import org.betup.ui.views.ComposeUtils;

/* compiled from: MessagingComponents.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aI\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\fX\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\u0016\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bX\u008a\u0084\u0002²\u0006\u0016\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bX\u008a\u0084\u0002"}, d2 = {"MessageBubble", "", "bubble", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "showAuthorAvatar", "", "(Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;ZLandroidx/compose/runtime/Composer;II)V", "MessageInputBar", "modifier", "Landroidx/compose/ui/Modifier;", "onSend", "Lkotlin/Function1;", "", "enabled", "onFocusChanged", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LoadMoreMessagesButton", "isLoading", "onClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "text", "emojiEditText", "Lcom/vanniktech/emoji/EmojiEditText;", "emojiPopup", "Lcom/vanniktech/emoji/EmojiPopup;", "currentOnSend", "currentOnFocusChanged"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessagingComponentsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadMoreMessagesButton$lambda$24(boolean z, Function0 function0, int i, Composer composer, int i2) {
        LoadMoreMessagesButton(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBubble$lambda$4(MessageBubbleUi messageBubbleUi, boolean z, int i, int i2, Composer composer, int i3) {
        MessageBubble(messageBubbleUi, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputBar$lambda$22(Modifier modifier, Function1 function1, boolean z, Function1 function12, int i, int i2, Composer composer, int i3) {
        MessageInputBar(modifier, function1, z, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MessageBubble(final MessageBubbleUi bubble, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        boolean changed;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        float f;
        String str;
        String str2;
        String str3;
        String str4;
        Alignment.Horizontal horizontal;
        long j;
        int i4;
        Modifier modifier;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(bubble, "bubble");
        Composer startRestartGroup = composer.startRestartGroup(-173213703);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bubble) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                boolean z3 = i5 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-173213703, i3, -1, "org.betup.ui.common.compose.MessageBubble (MessagingComponents.kt:65)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Configuration configuration = (Configuration) consume2;
                Alignment.Horizontal end = !bubble.isMine() ? Alignment.INSTANCE.getEnd() : Alignment.INSTANCE.getStart();
                Arrangement.Horizontal end2 = !bubble.isMine() ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart();
                long j2 = !bubble.isMine() ? ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor() : Color.INSTANCE.m5205getWhite0d7_KjU();
                long m5194getBlack0d7_KjU = Color.INSTANCE.m5194getBlack0d7_KjU();
                int i6 = configuration.screenWidthDp;
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(i6);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = Dp.m7772boximpl(((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(configuration.screenWidthDp) * 0.72f)), Dp.m7772boximpl(Dp.m7774constructorimpl(160)))).m7788unboximpl());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                float m7788unboximpl = ((Dp) rememberedValue).m7788unboximpl();
                startRestartGroup.endReplaceGroup();
                Modifier clip = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), RoundedCornerShapeKt.getCircleShape());
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end2, bottom, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-2133907482);
                if (bubble.isMine()) {
                    if (z3) {
                        startRestartGroup.startReplaceGroup(-1726569490);
                        f = m7788unboximpl;
                        str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        j = m5194getBlack0d7_KjU;
                        str2 = "C89@4556L9:Column.kt#2w3rfo";
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        horizontal = end;
                        str4 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(ImageRequests_androidKt.allowHardware(new ImageRequest.Builder(context).data(bubble.getAuthorAvatar()), false).build(), null, clip, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1572912, 0, 1976);
                        startRestartGroup.endReplaceGroup();
                        modifier = clip;
                        i4 = 0;
                    } else {
                        f = m7788unboximpl;
                        str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        str2 = "C89@4556L9:Column.kt#2w3rfo";
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        str4 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                        horizontal = end;
                        j = m5194getBlack0d7_KjU;
                        startRestartGroup.startReplaceGroup(-1726141318);
                        modifier = clip;
                        i4 = 0;
                        SpacerKt.Spacer(modifier, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
                } else {
                    f = m7788unboximpl;
                    str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    str2 = "C89@4556L9:Column.kt#2w3rfo";
                    str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str4 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                    horizontal = end;
                    j = m5194getBlack0d7_KjU;
                    i4 = 0;
                    modifier = clip;
                }
                startRestartGroup.endReplaceGroup();
                Modifier m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, str4);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, startRestartGroup, i4);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1570widthInVpY3zN4$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, str2);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                final long j3 = j;
                Modifier modifier2 = modifier;
                SurfaceKt.m3471SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(18)), j2, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(559963310, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageBubble$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(559963310, i7, -1, "org.betup.ui.common.compose.MessageBubble.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagingComponents.kt:112)");
                        }
                        MessageLinkTextKt.m12948MessageTextWithLinks6BXD4ec(MessageBubbleUi.this.getText(), j3, TextUnitKt.getSp(15), PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12)), composer3, X2.b.f, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 12582912, 121);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-2133866747);
                if (bubble.isMine()) {
                    composer2 = startRestartGroup;
                } else {
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
                    if (z3) {
                        startRestartGroup.startReplaceGroup(-1725251122);
                        composer2 = startRestartGroup;
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(ImageRequests_androidKt.allowHardware(new ImageRequest.Builder(context).data(bubble.getAuthorAvatar()), false).build(), null, modifier2, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1572912, 0, 1976);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1724822950);
                        SpacerKt.Spacer(modifier2, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MessageBubble$lambda$4;
                        MessageBubble$lambda$4 = MessagingComponentsKt.MessageBubble$lambda$4(MessageBubbleUi.this, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return MessageBubble$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume3;
        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Configuration configuration2 = (Configuration) consume22;
        Alignment.Horizontal end3 = !bubble.isMine() ? Alignment.INSTANCE.getEnd() : Alignment.INSTANCE.getStart();
        if (!bubble.isMine()) {
        }
        long j22 = !bubble.isMine() ? ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor() : Color.INSTANCE.m5205getWhite0d7_KjU();
        long m5194getBlack0d7_KjU2 = Color.INSTANCE.m5194getBlack0d7_KjU();
        int i62 = configuration2.screenWidthDp;
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(i62);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = Dp.m7772boximpl(((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(configuration2.screenWidthDp) * 0.72f)), Dp.m7772boximpl(Dp.m7774constructorimpl(160)))).m7788unboximpl());
        startRestartGroup.updateRememberedValue(rememberedValue);
        float m7788unboximpl2 = ((Dp) rememberedValue).m7788unboximpl();
        startRestartGroup.endReplaceGroup();
        Modifier clip2 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), RoundedCornerShapeKt.getCircleShape());
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end3, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical bottom2 = Alignment.INSTANCE.getBottom();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(end2, bottom2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-2133907482);
        if (bubble.isMine()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m1570widthInVpY3zN4$default2 = SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, str4);
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, startRestartGroup, i4);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i4);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1570widthInVpY3zN4$default2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, str2);
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        final long j32 = j;
        Modifier modifier22 = modifier;
        SurfaceKt.m3471SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(18)), j22, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(559963310, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageBubble$1$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i7) {
                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(559963310, i7, -1, "org.betup.ui.common.compose.MessageBubble.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagingComponents.kt:112)");
                }
                MessageLinkTextKt.m12948MessageTextWithLinks6BXD4ec(MessageBubbleUi.this.getText(), j32, TextUnitKt.getSp(15), PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12)), composer3, X2.b.f, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 12582912, 121);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-2133866747);
        if (bubble.isMine()) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputBar$lambda$6$lambda$5(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MessageInputBar(Modifier modifier, final Function1<? super String, Unit> onSend, final boolean z, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        Function1<? super Boolean, Unit> function12;
        Function1<? super Boolean, Unit> function13;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        final MutableState mutableState;
        boolean changedInstance;
        MessagingComponentsKt$MessageInputBar$2$1 rememberedValue4;
        Object rememberedValue5;
        final Function1<? super Boolean, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onSend, "onSend");
        Composer startRestartGroup = composer.startRestartGroup(-694028314);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onSend) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new Function1() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit MessageInputBar$lambda$6$lambda$5;
                                    MessageInputBar$lambda$6$lambda$5 = MessagingComponentsKt.MessageInputBar$lambda$6$lambda$5(((Boolean) obj).booleanValue());
                                    return MessageInputBar$lambda$6$lambda$5;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        startRestartGroup.endReplaceGroup();
                        function13 = (Function1) rememberedValue6;
                    } else {
                        function13 = function12;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-694028314, i3, -1, "org.betup.ui.common.compose.MessageInputBar (MessagingComponents.kt:147)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Context context = (Context) consume;
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    View view = (View) consume2;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    mutableState = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onSend, startRestartGroup, (i3 >> 3) & 14);
                    State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function13, startRestartGroup, (i3 >> 9) & 14);
                    EmojiEditText MessageInputBar$lambda$11 = MessageInputBar$lambda$11(mutableState3);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changedInstance = startRestartGroup.changedInstance(view);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new MessagingComponentsKt$MessageInputBar$2$1(mutableState, mutableState3, view, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(MessageInputBar$lambda$11, view, (Function2) rememberedValue4, startRestartGroup, 0);
                    Unit unit = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                DisposableEffectResult MessageInputBar$lambda$21$lambda$20;
                                MessageInputBar$lambda$21$lambda$20 = MessagingComponentsKt.MessageInputBar$lambda$21$lambda$20(MutableState.this, (DisposableEffectScope) obj);
                                return MessageInputBar$lambda$21$lambda$20;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 54);
                    Modifier modifier3 = companion;
                    Function1<? super Boolean, Unit> function15 = function13;
                    SurfaceKt.m3471SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, ComposeUtils.AppColorPalette.BackgroundMessageInputBar.INSTANCE.getColor(), 0L, Dp.m7774constructorimpl(2), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(504796417, true, new MessagingComponentsKt$MessageInputBar$4(z, rememberUpdatedState, context, mutableState3, mutableState, view, rememberUpdatedState2, mutableState2), startRestartGroup, 54), startRestartGroup, 12607488, 106);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    function14 = function15;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function14 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit MessageInputBar$lambda$22;
                            MessageInputBar$lambda$22 = MessagingComponentsKt.MessageInputBar$lambda$22(Modifier.this, onSend, z, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return MessageInputBar$lambda$22;
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i3 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context2 = (Context) consume3;
            ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localView2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view2 = (View) consume22;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState22 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState32 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onSend, startRestartGroup, (i3 >> 3) & 14);
            State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(function13, startRestartGroup, (i3 >> 9) & 14);
            EmojiEditText MessageInputBar$lambda$112 = MessageInputBar$lambda$11(mutableState32);
            startRestartGroup.startReplaceGroup(-1746271574);
            changedInstance = startRestartGroup.changedInstance(view2);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue4 = new MessagingComponentsKt$MessageInputBar$2$1(mutableState, mutableState32, view2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(MessageInputBar$lambda$112, view2, (Function2) rememberedValue4, startRestartGroup, 0);
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 54);
            Modifier modifier32 = companion;
            Function1<? super Boolean, Unit> function152 = function13;
            SurfaceKt.m3471SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, ComposeUtils.AppColorPalette.BackgroundMessageInputBar.INSTANCE.getColor(), 0L, Dp.m7774constructorimpl(2), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(504796417, true, new MessagingComponentsKt$MessageInputBar$4(z, rememberUpdatedState3, context2, mutableState32, mutableState, view2, rememberUpdatedState22, mutableState22), startRestartGroup, 54), startRestartGroup, 12607488, 106);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier32;
            function14 = function152;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context22 = (Context) consume32;
        ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localView22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view22 = (View) consume222;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState322 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        State rememberUpdatedState32 = SnapshotStateKt.rememberUpdatedState(onSend, startRestartGroup, (i3 >> 3) & 14);
        State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(function13, startRestartGroup, (i3 >> 9) & 14);
        EmojiEditText MessageInputBar$lambda$1122 = MessageInputBar$lambda$11(mutableState322);
        startRestartGroup.startReplaceGroup(-1746271574);
        changedInstance = startRestartGroup.changedInstance(view22);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue4 = new MessagingComponentsKt$MessageInputBar$2$1(mutableState, mutableState322, view22, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(MessageInputBar$lambda$1122, view22, (Function2) rememberedValue4, startRestartGroup, 0);
        Unit unit22 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(unit22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 54);
        Modifier modifier322 = companion;
        Function1<? super Boolean, Unit> function1522 = function13;
        SurfaceKt.m3471SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, ComposeUtils.AppColorPalette.BackgroundMessageInputBar.INSTANCE.getColor(), 0L, Dp.m7774constructorimpl(2), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(504796417, true, new MessagingComponentsKt$MessageInputBar$4(z, rememberUpdatedState32, context22, mutableState322, mutableState, view22, rememberUpdatedState222, mutableState222), startRestartGroup, 54), startRestartGroup, 12607488, 106);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier322;
        function14 = function1522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MessageInputBar$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiEditText MessageInputBar$lambda$11(MutableState<EmojiEditText> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiPopup MessageInputBar$lambda$14(MutableState<EmojiPopup> mutableState) {
        return mutableState.getValue();
    }

    public static final void LoadMoreMessagesButton(final boolean z, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-2115723098);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2115723098, i2, -1, "org.betup.ui.common.compose.LoadMoreMessagesButton (MessagingComponents.kt:304)");
            }
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 7, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                startRestartGroup.startReplaceGroup(-615413723);
                ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 6, 28);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-615226886);
                composer2 = startRestartGroup;
                ButtonKt.TextButton(onClick, null, false, null, null, null, null, null, null, ComposableSingletons$MessagingComponentsKt.INSTANCE.m12920getLambda$1614369075$app_release(), startRestartGroup, ((i2 >> 3) & 14) | 805306368, 510);
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LoadMoreMessagesButton$lambda$24;
                    LoadMoreMessagesButton$lambda$24 = MessagingComponentsKt.LoadMoreMessagesButton$lambda$24(z, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LoadMoreMessagesButton$lambda$24;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<String, Unit> MessageInputBar$lambda$16(State<? extends Function1<? super String, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> MessageInputBar$lambda$17(State<? extends Function1<? super Boolean, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MessageInputBar$lambda$21$lambda$20(final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$lambda$21$lambda$20$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                EmojiPopup MessageInputBar$lambda$14;
                MessageInputBar$lambda$14 = MessagingComponentsKt.MessageInputBar$lambda$14(MutableState.this);
                if (MessageInputBar$lambda$14 != null) {
                    MessageInputBar$lambda$14.dismiss();
                }
            }
        };
    }
}
