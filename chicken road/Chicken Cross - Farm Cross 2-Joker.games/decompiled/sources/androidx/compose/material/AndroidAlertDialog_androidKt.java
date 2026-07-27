package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6  */
    /* renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m879AlertDialog6oU6zVQ(final Function0<Unit> onDismissRequest, final Function2<? super Composer, ? super Integer, Unit> confirmButton, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        long j3;
        CornerBasedShape cornerBasedShape;
        long j4;
        DialogProperties dialogProperties2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        long j5;
        Shape shape3;
        long j6;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Shape shape4;
        final long j7;
        final long j8;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer startRestartGroup = composer.startRestartGroup(-606536823);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(5,1,4,3,9,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color)70@3471L6,71@3529L6,72@3571L32,75@3667L735:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(confirmButton) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(function2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(function22) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        function24 = function23;
                        i3 |= startRestartGroup.changed(function24) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            shape2 = shape;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 29360128) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(j)) {
                                i8 = 8388608;
                                i3 |= i8;
                            }
                            i8 = 4194304;
                            i3 |= i8;
                        }
                        if ((i & 234881024) == 0) {
                            j3 = j2;
                            i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        } else {
                            j3 = j2;
                        }
                        if ((1879048192 & i) == 0) {
                            if ((i2 & 512) == 0 && startRestartGroup.changed(dialogProperties)) {
                                i7 = 536870912;
                                i3 |= i7;
                            }
                            i7 = 268435456;
                            i3 |= i7;
                        }
                        if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                                Function2<? super Composer, ? super Integer, Unit> function211 = i4 != 0 ? null : function2;
                                Function2<? super Composer, ? super Integer, Unit> function212 = i5 != 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function213 = i6 == 0 ? function24 : null;
                                if ((i2 & 64) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                    i3 &= -3670017;
                                } else {
                                    cornerBasedShape = shape2;
                                }
                                if ((i2 & 128) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                    i3 &= -29360129;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 256) != 0) {
                                    j3 = ColorsKt.m994contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 21) & 14);
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                    modifier2 = companion;
                                    function25 = function213;
                                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                } else {
                                    dialogProperties2 = dialogProperties;
                                    modifier2 = companion;
                                    function25 = function213;
                                }
                                function26 = function212;
                                j5 = j3;
                                shape3 = cornerBasedShape;
                                j6 = j4;
                                function27 = function211;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                }
                                modifier2 = modifier;
                                function26 = function22;
                                j6 = j;
                                dialogProperties2 = dialogProperties;
                                j5 = j3;
                                shape3 = shape2;
                                function25 = function24;
                                function27 = function2;
                            }
                            startRestartGroup.endDefaults();
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i10) {
                                    ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                                    if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                        float f = 8;
                                        Modifier m421paddingVpY3zN4 = PaddingKt.m421paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(2));
                                        final Function2<Composer, Integer, Unit> function214 = function27;
                                        final int i11 = i3;
                                        final Function2<Composer, Integer, Unit> function215 = confirmButton;
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m421paddingVpY3zN4);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-434861445);
                                        ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                                        AlertDialogKt.m878AlertDialogFlowRowixp7dh8(Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i12) {
                                                ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                                if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                                    Function2<Composer, Integer, Unit> function216 = function214;
                                                    composer4.startReplaceableGroup(-1046483318);
                                                    ComposerKt.sourceInformation(composer4, "84@4101L8");
                                                    if (function216 != null) {
                                                        function216.invoke(composer4, Integer.valueOf((i11 >> 9) & 14));
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    function215.invoke(composer4, Integer.valueOf((i11 >> 3) & 14));
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 438);
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            int i10 = (i3 & 14) | 48 | (i3 & 896);
                            int i11 = i3 >> 3;
                            composer2 = startRestartGroup;
                            m880AlertDialogwqdebIU(onDismissRequest, composableLambda, modifier2, function26, function25, shape3, j6, j5, dialogProperties2, startRestartGroup, i10 | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024), 0);
                            function28 = function27;
                            modifier3 = modifier2;
                            function29 = function26;
                            function210 = function25;
                            shape4 = shape3;
                            j7 = j6;
                            j8 = j5;
                            dialogProperties3 = dialogProperties2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function28 = function2;
                            function29 = function22;
                            dialogProperties3 = dialogProperties;
                            composer2 = startRestartGroup;
                            long j9 = j3;
                            shape4 = shape2;
                            j7 = j;
                            function210 = function24;
                            j8 = j9;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                AndroidAlertDialog_androidKt.m879AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function28, function29, function210, shape4, j7, j8, dialogProperties3, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    function24 = function23;
                    if ((i & 3670016) == 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((1879048192 & i) == 0) {
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    function26 = function212;
                    j5 = j3;
                    shape3 = cornerBasedShape;
                    j6 = j4;
                    function27 = function211;
                    startRestartGroup.endDefaults();
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i102) {
                            ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                            if ((i102 & 11) != 2 || !composer3.getSkipping()) {
                                float f = 8;
                                Modifier m421paddingVpY3zN4 = PaddingKt.m421paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(2));
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function27;
                                final int i112 = i3;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = confirmButton;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m421paddingVpY3zN4);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                                Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-434861445);
                                ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                                AlertDialogKt.m878AlertDialogFlowRowixp7dh8(Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i12) {
                                        ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                        if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                            Function2<Composer, Integer, Unit> function216 = function214;
                                            composer4.startReplaceableGroup(-1046483318);
                                            ComposerKt.sourceInformation(composer4, "84@4101L8");
                                            if (function216 != null) {
                                                function216.invoke(composer4, Integer.valueOf((i112 >> 9) & 14));
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            composer4.endReplaceableGroup();
                                            function215.invoke(composer4, Integer.valueOf((i112 >> 3) & 14));
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 438);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    int i102 = (i3 & 14) | 48 | (i3 & 896);
                    int i112 = i3 >> 3;
                    composer2 = startRestartGroup;
                    m880AlertDialogwqdebIU(onDismissRequest, composableLambda2, modifier2, function26, function25, shape3, j6, j5, dialogProperties2, startRestartGroup, i102 | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016) | (i112 & 29360128) | (i112 & 234881024), 0);
                    function28 = function27;
                    modifier3 = modifier2;
                    function29 = function26;
                    function210 = function25;
                    shape4 = shape3;
                    j7 = j6;
                    j8 = j5;
                    dialogProperties3 = dialogProperties2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function24 = function23;
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((1879048192 & i) == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                function26 = function212;
                j5 = j3;
                shape3 = cornerBasedShape;
                j6 = j4;
                function27 = function211;
                startRestartGroup.endDefaults();
                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i1022) {
                        ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                        if ((i1022 & 11) != 2 || !composer3.getSkipping()) {
                            float f = 8;
                            Modifier m421paddingVpY3zN4 = PaddingKt.m421paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function214 = function27;
                            final int i1122 = i3;
                            final Function2<? super Composer, ? super Integer, Unit> function215 = confirmButton;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m421paddingVpY3zN4);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-434861445);
                            ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                            AlertDialogKt.m878AlertDialogFlowRowixp7dh8(Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i12) {
                                    ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                    if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                        Function2<Composer, Integer, Unit> function216 = function214;
                                        composer4.startReplaceableGroup(-1046483318);
                                        ComposerKt.sourceInformation(composer4, "84@4101L8");
                                        if (function216 != null) {
                                            function216.invoke(composer4, Integer.valueOf((i1122 >> 9) & 14));
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer4.endReplaceableGroup();
                                        function215.invoke(composer4, Integer.valueOf((i1122 >> 3) & 14));
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 438);
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                int i1022 = (i3 & 14) | 48 | (i3 & 896);
                int i1122 = i3 >> 3;
                composer2 = startRestartGroup;
                m880AlertDialogwqdebIU(onDismissRequest, composableLambda22, modifier2, function26, function25, shape3, j6, j5, dialogProperties2, startRestartGroup, i1022 | (i1122 & 7168) | (57344 & i1122) | (458752 & i1122) | (i1122 & 3670016) | (i1122 & 29360128) | (i1122 & 234881024), 0);
                function28 = function27;
                modifier3 = modifier2;
                function29 = function26;
                function210 = function25;
                shape4 = shape3;
                j7 = j6;
                j8 = j5;
                dialogProperties3 = dialogProperties2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function24 = function23;
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((1879048192 & i) == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            function26 = function212;
            j5 = j3;
            shape3 = cornerBasedShape;
            j6 = j4;
            function27 = function211;
            startRestartGroup.endDefaults();
            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10222) {
                    ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                    if ((i10222 & 11) != 2 || !composer3.getSkipping()) {
                        float f = 8;
                        Modifier m421paddingVpY3zN4 = PaddingKt.m421paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function214 = function27;
                        final int i11222 = i3;
                        final Function2<? super Composer, ? super Integer, Unit> function215 = confirmButton;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m421paddingVpY3zN4);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-434861445);
                        ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                        AlertDialogKt.m878AlertDialogFlowRowixp7dh8(Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i12) {
                                ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                    Function2<Composer, Integer, Unit> function216 = function214;
                                    composer4.startReplaceableGroup(-1046483318);
                                    ComposerKt.sourceInformation(composer4, "84@4101L8");
                                    if (function216 != null) {
                                        function216.invoke(composer4, Integer.valueOf((i11222 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer4.endReplaceableGroup();
                                    function215.invoke(composer4, Integer.valueOf((i11222 >> 3) & 14));
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 438);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            int i10222 = (i3 & 14) | 48 | (i3 & 896);
            int i11222 = i3 >> 3;
            composer2 = startRestartGroup;
            m880AlertDialogwqdebIU(onDismissRequest, composableLambda222, modifier2, function26, function25, shape3, j6, j5, dialogProperties2, startRestartGroup, i10222 | (i11222 & 7168) | (57344 & i11222) | (458752 & i11222) | (i11222 & 3670016) | (i11222 & 29360128) | (i11222 & 234881024), 0);
            function28 = function27;
            modifier3 = modifier2;
            function29 = function26;
            function210 = function25;
            shape4 = shape3;
            j7 = j6;
            j8 = j5;
            dialogProperties3 = dialogProperties2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function24 = function23;
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((1879048192 & i) == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        function26 = function212;
        j5 = j3;
        shape3 = cornerBasedShape;
        j6 = j4;
        function27 = function211;
        startRestartGroup.endDefaults();
        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i102222) {
                ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                if ((i102222 & 11) != 2 || !composer3.getSkipping()) {
                    float f = 8;
                    Modifier m421paddingVpY3zN4 = PaddingKt.m421paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(2));
                    final Function2<? super Composer, ? super Integer, Unit> function214 = function27;
                    final int i112222 = i3;
                    final Function2<? super Composer, ? super Integer, Unit> function215 = confirmButton;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m421paddingVpY3zN4);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                    Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-434861445);
                    ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                    AlertDialogKt.m878AlertDialogFlowRowixp7dh8(Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i12) {
                            ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                            if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                Function2<Composer, Integer, Unit> function216 = function214;
                                composer4.startReplaceableGroup(-1046483318);
                                ComposerKt.sourceInformation(composer4, "84@4101L8");
                                if (function216 != null) {
                                    function216.invoke(composer4, Integer.valueOf((i112222 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer4.endReplaceableGroup();
                                function215.invoke(composer4, Integer.valueOf((i112222 >> 3) & 14));
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 438);
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        int i102222 = (i3 & 14) | 48 | (i3 & 896);
        int i112222 = i3 >> 3;
        composer2 = startRestartGroup;
        m880AlertDialogwqdebIU(onDismissRequest, composableLambda2222, modifier2, function26, function25, shape3, j6, j5, dialogProperties2, startRestartGroup, i102222 | (i112222 & 7168) | (57344 & i112222) | (458752 & i112222) | (i112222 & 3670016) | (i112222 & 29360128) | (i112222 & 234881024), 0);
        function28 = function27;
        modifier3 = modifier2;
        function29 = function26;
        function210 = function25;
        shape4 = shape3;
        j7 = j6;
        j8 = j5;
        dialogProperties3 = dialogProperties2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c8  */
    /* renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m880AlertDialogwqdebIU(final Function0<Unit> onDismissRequest, final Function2<? super Composer, ? super Integer, Unit> buttons, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        long j3;
        long j4;
        DialogProperties dialogProperties2;
        Modifier.Companion companion;
        CornerBasedShape cornerBasedShape;
        long j5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        long j6;
        DialogProperties dialogProperties3;
        long j7;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape3;
        final long j8;
        final long j9;
        final DialogProperties dialogProperties4;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer startRestartGroup = composer.startRestartGroup(1035523925);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(4,1,3,8,7,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color)131@6133L6,132@6191L6,133@6233L32,136@6329L366:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(buttons) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changed(function23) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(function22) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(shape)) {
                            i9 = 131072;
                            i3 |= i9;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            j3 = j;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        j3 = j;
                    }
                    if ((29360128 & i) != 0) {
                        j4 = j2;
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j4)) ? 8388608 : 4194304;
                    } else {
                        j4 = j2;
                    }
                    if ((234881024 & i) != 0) {
                        if ((i2 & 256) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (startRestartGroup.changed(dialogProperties2)) {
                                i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i7;
                            }
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i7 = 33554432;
                        i3 |= i7;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i10 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                function23 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function28 = i5 == 0 ? function22 : null;
                            if ((i2 & 32) == 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                cornerBasedShape = shape;
                            }
                            if ((i2 & 64) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) == 0) {
                                j5 = ColorsKt.m994contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                j5 = j4;
                            }
                            if ((i2 & 256) == 0) {
                                i6 = i3 & (-234881025);
                                function24 = function28;
                                shape2 = cornerBasedShape;
                                function25 = function23;
                                j6 = j5;
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                j7 = j3;
                                startRestartGroup.endDefaults();
                                final Modifier modifier3 = companion;
                                final Function2<? super Composer, ? super Integer, Unit> function29 = function25;
                                final Function2<? super Composer, ? super Integer, Unit> function210 = function24;
                                final Shape shape4 = shape2;
                                final long j10 = j7;
                                final long j11 = j6;
                                final int i11 = i6;
                                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i12) {
                                        ComposerKt.sourceInformation(composer2, "C140@6430L259:AndroidAlertDialog.android.kt#jmzs0o");
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            Function2<Composer, Integer, Unit> function211 = buttons;
                                            Modifier modifier4 = modifier3;
                                            Function2<Composer, Integer, Unit> function212 = function29;
                                            Function2<Composer, Integer, Unit> function213 = function210;
                                            Shape shape5 = shape4;
                                            long j12 = j10;
                                            long j13 = j11;
                                            int i13 = i11;
                                            AlertDialogKt.m877AlertDialogContentWMdw5o4(function211, modifier4, function212, function213, shape5, j12, j13, composer2, ((i13 >> 3) & 14) | ((i13 >> 3) & 112) | ((i13 >> 3) & 896) | ((i13 >> 3) & 7168) | ((i13 >> 3) & 57344) | ((i13 >> 3) & 458752) | ((i13 >> 3) & 3670016), 0);
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, (i6 & 14) | 384 | ((i6 >> 21) & 112), 0);
                                modifier2 = companion;
                                function26 = function25;
                                function27 = function24;
                                shape3 = shape2;
                                j8 = j7;
                                j9 = j6;
                                dialogProperties4 = dialogProperties3;
                            } else {
                                i6 = i3;
                                function24 = function28;
                                shape2 = cornerBasedShape;
                                function25 = function23;
                                j6 = j5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            companion = modifier;
                            function24 = function22;
                            shape2 = shape;
                            i6 = i3;
                            function25 = function23;
                            j6 = j4;
                        }
                        j7 = j3;
                        dialogProperties3 = dialogProperties2;
                        startRestartGroup.endDefaults();
                        final Modifier modifier32 = companion;
                        final Function2<? super Composer, ? super Integer, Unit> function292 = function25;
                        final Function2<? super Composer, ? super Integer, Unit> function2102 = function24;
                        final Shape shape42 = shape2;
                        final long j102 = j7;
                        final long j112 = j6;
                        final int i112 = i6;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i12) {
                                ComposerKt.sourceInformation(composer2, "C140@6430L259:AndroidAlertDialog.android.kt#jmzs0o");
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    Function2<Composer, Integer, Unit> function211 = buttons;
                                    Modifier modifier4 = modifier32;
                                    Function2<Composer, Integer, Unit> function212 = function292;
                                    Function2<Composer, Integer, Unit> function213 = function2102;
                                    Shape shape5 = shape42;
                                    long j12 = j102;
                                    long j13 = j112;
                                    int i13 = i112;
                                    AlertDialogKt.m877AlertDialogContentWMdw5o4(function211, modifier4, function212, function213, shape5, j12, j13, composer2, ((i13 >> 3) & 14) | ((i13 >> 3) & 112) | ((i13 >> 3) & 896) | ((i13 >> 3) & 7168) | ((i13 >> 3) & 57344) | ((i13 >> 3) & 458752) | ((i13 >> 3) & 3670016), 0);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i6 & 14) | 384 | ((i6 >> 21) & 112), 0);
                        modifier2 = companion;
                        function26 = function25;
                        function27 = function24;
                        shape3 = shape2;
                        j8 = j7;
                        j9 = j6;
                        dialogProperties4 = dialogProperties3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function27 = function22;
                        function26 = function23;
                        shape3 = shape;
                        dialogProperties4 = dialogProperties2;
                        j9 = j4;
                        j8 = j3;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            AndroidAlertDialog_androidKt.m880AlertDialogwqdebIU(onDismissRequest, buttons, modifier2, function26, function27, shape3, j8, j9, dialogProperties4, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                if ((458752 & i) == 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((29360128 & i) != 0) {
                }
                if ((234881024 & i) != 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
            }
            function23 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((29360128 & i) != 0) {
            }
            if ((234881024 & i) != 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
    }
}
