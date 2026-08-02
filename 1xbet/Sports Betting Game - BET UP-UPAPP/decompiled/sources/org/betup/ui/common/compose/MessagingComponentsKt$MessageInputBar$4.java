package org.betup.ui.common.compose;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.vanniktech.emoji.EmojiEditText;
import com.vanniktech.emoji.EmojiPopup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: MessagingComponents.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MessagingComponentsKt$MessageInputBar$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<Function1<Boolean, Unit>> $currentOnFocusChanged$delegate;
    final /* synthetic */ State<Function1<String, Unit>> $currentOnSend$delegate;
    final /* synthetic */ MutableState<EmojiEditText> $emojiEditText$delegate;
    final /* synthetic */ MutableState<EmojiPopup> $emojiPopup$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ View $rootView;
    final /* synthetic */ MutableState<String> $text$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MessagingComponentsKt$MessageInputBar$4(boolean z, State<? extends Function1<? super String, Unit>> state, Context context, MutableState<EmojiEditText> mutableState, MutableState<EmojiPopup> mutableState2, View view, State<? extends Function1<? super Boolean, Unit>> state2, MutableState<String> mutableState3) {
        this.$enabled = z;
        this.$currentOnSend$delegate = state;
        this.$context = context;
        this.$emojiEditText$delegate = mutableState;
        this.$emojiPopup$delegate = mutableState2;
        this.$rootView = view;
        this.$currentOnFocusChanged$delegate = state2;
        this.$text$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$1$lambda$0(boolean z, MutableState mutableState, MutableState mutableState2) {
        EmojiEditText MessageInputBar$lambda$11;
        EmojiPopup MessageInputBar$lambda$14;
        if (z) {
            MessageInputBar$lambda$11 = MessagingComponentsKt.MessageInputBar$lambda$11(mutableState);
            if (MessageInputBar$lambda$11 != null) {
                MessageInputBar$lambda$11.requestFocus();
            }
            MessageInputBar$lambda$14 = MessagingComponentsKt.MessageInputBar$lambda$14(mutableState2);
            if (MessageInputBar$lambda$14 != null) {
                MessageInputBar$lambda$14.toggle();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiEditText invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6(final MutableState mutableState, final View view, final MutableState mutableState2, final State state, MutableState mutableState3, Context viewContext) {
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        EmojiEditText emojiEditText = new EmojiEditText(viewContext);
        emojiEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        emojiEditText.setTextColor(ColorKt.m5222toArgb8_81llA(Color.INSTANCE.m5205getWhite0d7_KjU()));
        emojiEditText.setHintTextColor(ColorKt.m5222toArgb8_81llA(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor()));
        emojiEditText.setBackground(null);
        emojiEditText.setSingleLine(false);
        emojiEditText.setMaxLines(3);
        emojiEditText.setMinLines(1);
        emojiEditText.setGravity(8388659);
        emojiEditText.setHint(viewContext.getString(R.string.type_a_message));
        emojiEditText.setTextSize(16.0f);
        emojiEditText.setInputType(147457);
        emojiEditText.setImeOptions(1);
        emojiEditText.addTextChangedListener(new TextWatcher() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6$lambda$5$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String str;
                String MessageInputBar$lambda$8;
                if (s == null || (str = s.toString()) == null) {
                    str = "";
                }
                MessageInputBar$lambda$8 = MessagingComponentsKt.MessageInputBar$lambda$8(MutableState.this);
                if (Intrinsics.areEqual(str, MessageInputBar$lambda$8)) {
                    return;
                }
                MutableState.this.setValue(str);
            }
        });
        emojiEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6$lambda$5$lambda$4(view, mutableState2, state, view2, z);
            }
        });
        mutableState3.setValue(emojiEditText);
        return emojiEditText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6$lambda$5$lambda$4(View view, MutableState mutableState, final State state, View view2, final boolean z) {
        EmojiPopup MessageInputBar$lambda$14;
        MessageInputBar$lambda$14 = MessagingComponentsKt.MessageInputBar$lambda$14(mutableState);
        if (MessageInputBar$lambda$14 != null) {
            MessageInputBar$lambda$14.dismiss();
        }
        view.post(new Runnable() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(z, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(boolean z, State state) {
        Function1 MessageInputBar$lambda$17;
        MessageInputBar$lambda$17 = MessagingComponentsKt.MessageInputBar$lambda$17(state);
        MessageInputBar$lambda$17.invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10(boolean z, MutableState mutableState, final View view, final State state, EmojiEditText editText) {
        String MessageInputBar$lambda$8;
        String MessageInputBar$lambda$82;
        String MessageInputBar$lambda$83;
        Intrinsics.checkNotNullParameter(editText, "editText");
        String valueOf = String.valueOf(editText.getText());
        MessageInputBar$lambda$8 = MessagingComponentsKt.MessageInputBar$lambda$8(mutableState);
        if (!Intrinsics.areEqual(valueOf, MessageInputBar$lambda$8)) {
            int selectionStart = editText.getSelectionStart();
            MessageInputBar$lambda$82 = MessagingComponentsKt.MessageInputBar$lambda$8(mutableState);
            editText.setText(MessageInputBar$lambda$82);
            MessageInputBar$lambda$83 = MessagingComponentsKt.MessageInputBar$lambda$8(mutableState);
            editText.setSelection(RangesKt.coerceIn(selectionStart, 0, MessageInputBar$lambda$83.length()));
        }
        editText.setEnabled(z);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z2) {
                MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9(view, state, view2, z2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9(View view, final State state, View view2, final boolean z) {
        view.post(new Runnable() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(z, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(boolean z, State state) {
        Function1 MessageInputBar$lambda$17;
        MessageInputBar$lambda$17 = MessagingComponentsKt.MessageInputBar$lambda$17(state);
        MessageInputBar$lambda$17.invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$16$lambda$15(boolean z, Context context, MutableState mutableState, State state, MutableState mutableState2, MutableState mutableState3) {
        String MessageInputBar$lambda$8;
        Function1 MessageInputBar$lambda$16;
        EmojiEditText MessageInputBar$lambda$11;
        EmojiPopup MessageInputBar$lambda$14;
        EmojiEditText MessageInputBar$lambda$112;
        IBinder windowToken;
        MessageInputBar$lambda$8 = MessagingComponentsKt.MessageInputBar$lambda$8(mutableState);
        String obj = StringsKt.trim((CharSequence) MessageInputBar$lambda$8).toString();
        if (obj.length() > 0 && z) {
            MessageInputBar$lambda$16 = MessagingComponentsKt.MessageInputBar$lambda$16(state);
            MessageInputBar$lambda$16.invoke(obj);
            mutableState.setValue("");
            MessageInputBar$lambda$11 = MessagingComponentsKt.MessageInputBar$lambda$11(mutableState2);
            if (MessageInputBar$lambda$11 != null) {
                MessageInputBar$lambda$11.setText("");
            }
            MessageInputBar$lambda$14 = MessagingComponentsKt.MessageInputBar$lambda$14(mutableState3);
            if (MessageInputBar$lambda$14 != null) {
                MessageInputBar$lambda$14.dismiss();
            }
            Object systemService = context.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            MessageInputBar$lambda$112 = MessagingComponentsKt.MessageInputBar$lambda$11(mutableState2);
            if (MessageInputBar$lambda$112 != null && (windowToken = MessageInputBar$lambda$112.getWindowToken()) != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        final MutableState<String> mutableState;
        boolean z;
        boolean changed;
        Object rememberedValue;
        String MessageInputBar$lambda$8;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(504796417, i, -1, "org.betup.ui.common.compose.MessageInputBar.<anonymous> (MessagingComponents.kt:175)");
        }
        final boolean z2 = this.$enabled;
        final State<Function1<String, Unit>> state = this.$currentOnSend$delegate;
        final Context context = this.$context;
        final MutableState<EmojiEditText> mutableState2 = this.$emojiEditText$delegate;
        final MutableState<EmojiPopup> mutableState3 = this.$emojiPopup$delegate;
        final View view = this.$rootView;
        final State<Function1<Boolean, Unit>> state2 = this.$currentOnFocusChanged$delegate;
        final MutableState<String> mutableState4 = this.$text$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f = 4;
        float f2 = 20;
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2)), composer, 6);
        float f3 = 12;
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(6));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.emoji_img, composer, 6);
        float f4 = 32;
        Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4));
        composer.startReplaceGroup(-1746271574);
        boolean changed2 = composer.changed(z2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$18$lambda$17$lambda$1$lambda$0;
                    invoke$lambda$18$lambda$17$lambda$1$lambda$0 = MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$1$lambda$0(z2, mutableState2, mutableState3);
                    return invoke$lambda$18$lambda$17$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        ImageKt.Image(painterResource, (String) null, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, z2, null, null, (Function0) rememberedValue2, 6, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        float f5 = 8;
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, weight$default);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(BorderKt.m1036borderxT4_qwU(Modifier.INSTANCE, Dp.m7774constructorimpl(1), ColorKt.Color(4290032820L), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(50))), Dp.m7774constructorimpl(f3), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f5), 0.0f, 2, null);
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(view) | composer.changed(state2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function1() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    EmojiEditText invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6;
                    invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6 = MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6(MutableState.this, view, mutableState3, state2, mutableState2, (Context) obj2);
                    return invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue3 = obj;
        }
        Function1 function1 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean changed3 = composer.changed(z2) | composer.changedInstance(view) | composer.changed(state2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState4;
            rememberedValue4 = new Function1() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10;
                    invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10 = MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10(z2, mutableState, view, state2, (EmojiEditText) obj2);
                    return invoke$lambda$18$lambda$17$lambda$13$lambda$12$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        } else {
            mutableState = mutableState4;
        }
        composer.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function1, m1518paddingVpY3zN4$default2, (Function1) rememberedValue4, composer, 48, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.send_img, composer, 6);
        Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4));
        if (z2) {
            MessageInputBar$lambda$8 = MessagingComponentsKt.MessageInputBar$lambda$8(mutableState);
            if (!StringsKt.isBlank(MessageInputBar$lambda$8)) {
                z = true;
                composer.startReplaceGroup(-1224400529);
                changed = composer.changed(z2) | composer.changed(state) | composer.changedInstance(context);
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState<String> mutableState5 = mutableState;
                    rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$18$lambda$17$lambda$16$lambda$15;
                            invoke$lambda$18$lambda$17$lambda$16$lambda$15 = MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$16$lambda$15(z2, context, mutableState5, state, mutableState2, mutableState3);
                            return invoke$lambda$18$lambda$17$lambda$16$lambda$15;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                ImageKt.Image(painterResource2, (String) null, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs2, z, null, null, (Function0) rememberedValue, 6, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2)), composer, 6);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        }
        z = false;
        composer.startReplaceGroup(-1224400529);
        changed = composer.changed(z2) | composer.changed(state) | composer.changedInstance(context);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        final MutableState mutableState52 = mutableState;
        rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$4$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$18$lambda$17$lambda$16$lambda$15;
                invoke$lambda$18$lambda$17$lambda$16$lambda$15 = MessagingComponentsKt$MessageInputBar$4.invoke$lambda$18$lambda$17$lambda$16$lambda$15(z2, context, mutableState52, state, mutableState2, mutableState3);
                return invoke$lambda$18$lambda$17$lambda$16$lambda$15;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        composer.endReplaceGroup();
        ImageKt.Image(painterResource2, (String) null, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs2, z, null, null, (Function0) rememberedValue, 6, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2)), composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
