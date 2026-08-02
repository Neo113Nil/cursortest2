package org.betup.ui.fragment.login.compose.components;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;

/* compiled from: AuthTextField.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"AuthTextField", "", "label", "", "value", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "isPassword", "", "isError", "errorMessage", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "contentDescriptionForAccessibility", "AuthTextField-jEMA23E", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;ILjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthTextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthTextField_jEMA23E$lambda$3(String str, String str2, Function1 function1, Modifier modifier, boolean z, boolean z2, String str3, int i, String str4, int i2, int i3, Composer composer, int i4) {
        m13890AuthTextFieldjEMA23E(str, str2, function1, modifier, z, z2, str3, i, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03fc  */
    /* renamed from: AuthTextField-jEMA23E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13890AuthTextFieldjEMA23E(final String label, final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, String str, int i, String str2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        String str3;
        boolean z5;
        String str4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        float f;
        int i10;
        final String str5;
        char c;
        Modifier.Companion companion;
        Modifier m1036borderxT4_qwU;
        Composer composer2;
        final String str6;
        final boolean z6;
        final boolean z7;
        final String str7;
        final int i11;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(422944408);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(label) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onValueChange) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(str) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                        str3 = str2;
                    } else {
                        str3 = str2;
                        if ((i2 & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(str3) ? 67108864 : 33554432;
                        }
                    }
                    if ((i4 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        Modifier modifier3 = i12 == 0 ? Modifier.INSTANCE : modifier;
                        boolean z8 = i5 == 0 ? false : z3;
                        z5 = i6 == 0 ? false : z4;
                        str4 = i7 == 0 ? null : str;
                        int m7478getTextPjHm6EE = i8 == 0 ? KeyboardType.INSTANCE.m7478getTextPjHm6EE() : i;
                        String str8 = i9 == 0 ? null : str3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(422944408, i4, -1, "org.betup.ui.fragment.login.compose.components.AuthTextField (AuthTextField.kt:38)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                        f = 4;
                        i10 = i4;
                        Modifier modifier4 = modifier3;
                        str5 = str8;
                        TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, (i4 & 14) | 48, 0, 65532);
                        Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(50));
                        startRestartGroup.startReplaceGroup(-1773527478);
                        if (str5 == null) {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean z9 = (i10 & 234881024) == 67108864;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z9 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.login.compose.components.AuthTextFieldKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit AuthTextField_jEMA23E$lambda$2$lambda$1$lambda$0;
                                        AuthTextField_jEMA23E$lambda$2$lambda$1$lambda$0 = AuthTextFieldKt.AuthTextField_jEMA23E$lambda$2$lambda$1$lambda$0(str5, (SemanticsPropertyReceiver) obj);
                                        return AuthTextField_jEMA23E$lambda$2$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            c = 0;
                            companion = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, null);
                        } else {
                            c = 0;
                            companion = Modifier.INSTANCE;
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier then = m1549height3ABfNKs.then(companion);
                        if (!z5) {
                            m1036borderxT4_qwU = BorderKt.m1036borderxT4_qwU(Modifier.INSTANCE, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)));
                        } else {
                            m1036borderxT4_qwU = BorderKt.m1036borderxT4_qwU(Modifier.INSTANCE, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)));
                        }
                        TextFieldKt.TextField(value, onValueChange, then.then(m1036borderxT4_qwU), false, false, new TextStyle(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, !z8 ? new PasswordVisualTransformation(c, 1, null) : VisualTransformation.INSTANCE.getNone(), new KeyboardOptions(0, (Boolean) null, m7478getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, TextFieldDefaults.INSTANCE.m2627textFieldColorsdx8h9Zs(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 14352768, 0, 48, 2096914), startRestartGroup, (i10 >> 3) & 126, 24576, 501720);
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1773470392);
                        if (z5 && str4 != null) {
                            TextKt.m2642Text4IGK_g(str4, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), 0.0f, 0.0f, 12, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer2, (i10 >> 18) & 14, 0, 65532);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str5;
                        z6 = z8;
                        z7 = z5;
                        str7 = str4;
                        i11 = m7478getTextPjHm6EE;
                        modifier2 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        i11 = i;
                        z6 = z3;
                        z7 = z4;
                        composer2 = startRestartGroup;
                        str6 = str3;
                        str7 = str;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.login.compose.components.AuthTextFieldKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AuthTextField_jEMA23E$lambda$3;
                                AuthTextField_jEMA23E$lambda$3 = AuthTextFieldKt.AuthTextField_jEMA23E$lambda$3(label, value, onValueChange, modifier2, z6, z7, str7, i11, str6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return AuthTextField_jEMA23E$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                if (i12 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                f = 4;
                i10 = i4;
                Modifier modifier42 = modifier3;
                str5 = str8;
                TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, (i4 & 14) | 48, 0, 65532);
                Modifier m1549height3ABfNKs2 = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(50));
                startRestartGroup.startReplaceGroup(-1773527478);
                if (str5 == null) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier then2 = m1549height3ABfNKs2.then(companion);
                if (!z5) {
                }
                TextFieldKt.TextField(value, onValueChange, then2.then(m1036borderxT4_qwU), false, false, new TextStyle(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, !z8 ? new PasswordVisualTransformation(c, 1, null) : VisualTransformation.INSTANCE.getNone(), new KeyboardOptions(0, (Boolean) null, m7478getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, TextFieldDefaults.INSTANCE.m2627textFieldColorsdx8h9Zs(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 14352768, 0, 48, 2096914), startRestartGroup, (i10 >> 3) & 126, 24576, 501720);
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1773470392);
                if (z5) {
                    TextKt.m2642Text4IGK_g(str4, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), 0.0f, 0.0f, 12, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer2, (i10 >> 18) & 14, 0, 65532);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                str6 = str5;
                z6 = z8;
                z7 = z5;
                str7 = str4;
                i11 = m7478getTextPjHm6EE;
                modifier2 = modifier42;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            z4 = z2;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            if (i12 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            f = 4;
            i10 = i4;
            Modifier modifier422 = modifier3;
            str5 = str8;
            TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, (i4 & 14) | 48, 0, 65532);
            Modifier m1549height3ABfNKs22 = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(50));
            startRestartGroup.startReplaceGroup(-1773527478);
            if (str5 == null) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier then22 = m1549height3ABfNKs22.then(companion);
            if (!z5) {
            }
            TextFieldKt.TextField(value, onValueChange, then22.then(m1036borderxT4_qwU), false, false, new TextStyle(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, !z8 ? new PasswordVisualTransformation(c, 1, null) : VisualTransformation.INSTANCE.getNone(), new KeyboardOptions(0, (Boolean) null, m7478getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, TextFieldDefaults.INSTANCE.m2627textFieldColorsdx8h9Zs(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 14352768, 0, 48, 2096914), startRestartGroup, (i10 >> 3) & 126, 24576, 501720);
            composer2 = startRestartGroup;
            composer2.startReplaceGroup(-1773470392);
            if (z5) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            str6 = str5;
            z6 = z8;
            z7 = z5;
            str7 = str4;
            i11 = m7478getTextPjHm6EE;
            modifier2 = modifier422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        z4 = z2;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        if (i12 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        f = 4;
        i10 = i4;
        Modifier modifier4222 = modifier3;
        str5 = str8;
        TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, (i4 & 14) | 48, 0, 65532);
        Modifier m1549height3ABfNKs222 = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(50));
        startRestartGroup.startReplaceGroup(-1773527478);
        if (str5 == null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then222 = m1549height3ABfNKs222.then(companion);
        if (!z5) {
        }
        TextFieldKt.TextField(value, onValueChange, then222.then(m1036borderxT4_qwU), false, false, new TextStyle(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, !z8 ? new PasswordVisualTransformation(c, 1, null) : VisualTransformation.INSTANCE.getNone(), new KeyboardOptions(0, (Boolean) null, m7478getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, TextFieldDefaults.INSTANCE.m2627textFieldColorsdx8h9Zs(!z5 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), Color.INSTANCE.m5203getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 14352768, 0, 48, 2096914), startRestartGroup, (i10 >> 3) & 126, 24576, 501720);
        composer2 = startRestartGroup;
        composer2.startReplaceGroup(-1773470392);
        if (z5) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        str6 = str5;
        z6 = z8;
        z7 = z5;
        str7 = str4;
        i11 = m7478getTextPjHm6EE;
        modifier2 = modifier4222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthTextField_jEMA23E$lambda$2$lambda$1$lambda$0(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }
}
