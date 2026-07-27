package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010'\u001a/\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0085  */
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1172SurfaceFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        float f2;
        Modifier modifier2;
        long j5;
        long j6;
        BorderStroke borderStroke3;
        final int i6;
        final long j7;
        final BorderStroke borderStroke4;
        final float f3;
        final Modifier modifier3;
        final Shape shape3;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1412203386);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(5,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)106@5259L6,107@5301L22,*112@5476L7,113@5500L793:Surface.kt#jmzs0o");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                borderStroke2 = borderStroke;
                i3 |= startRestartGroup.changed(borderStroke2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i10 == 0 ? Modifier.INSTANCE : modifier;
                            if (i11 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorsKt.m994contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                borderStroke2 = null;
                            }
                            if (i5 == 0) {
                                modifier2 = companion;
                                f2 = Dp.m3840constructorimpl(0);
                            } else {
                                f2 = f;
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                modifier2 = modifier;
                                f2 = f;
                                j5 = j3;
                                j6 = j4;
                                borderStroke3 = borderStroke2;
                                i6 = i3 & (-7169);
                                final Shape shape4 = shape2;
                                startRestartGroup.endDefaults();
                                ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final float m3840constructorimpl = Dp.m3840constructorimpl(((Dp) consume).m3854unboximpl() + f2);
                                final Modifier modifier4 = modifier2;
                                j7 = j5;
                                borderStroke4 = borderStroke3;
                                f3 = f2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                                        long m1179surfaceColorAtElevationcq6XJ1M;
                                        Modifier m1178surface8ww4TTg;
                                        ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            Modifier modifier5 = Modifier.this;
                                            Shape shape5 = shape4;
                                            long j9 = j7;
                                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer2.consume(localElevationOverlay);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) consume2, m3840constructorimpl, composer2, (i6 >> 6) & 14);
                                            m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(modifier5, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                                            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1178surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), Unit.INSTANCE, new AnonymousClass2(null));
                                            Function2<Composer, Integer, Unit> function2 = content;
                                            int i13 = i6;
                                            composer2.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer2.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Density density = (Density) consume3;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer2.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer2.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            composer2.disableReusing();
                                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(1539610176);
                                            ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                                            function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* compiled from: Surface.kt */
                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                                        int label;

                                        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                                            super(2, continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass2(continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            if (this.label != 0) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }), startRestartGroup, 56);
                                modifier3 = modifier2;
                                shape3 = shape4;
                                j8 = j6;
                            } else {
                                modifier2 = modifier;
                                f2 = f;
                            }
                        }
                        j5 = j3;
                        j6 = j4;
                        borderStroke3 = borderStroke2;
                        i6 = i3;
                        final Shape shape42 = shape2;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m3840constructorimpl2 = Dp.m3840constructorimpl(((Dp) consume2).m3854unboximpl() + f2);
                        final Modifier modifier42 = modifier2;
                        j7 = j5;
                        borderStroke4 = borderStroke3;
                        f3 = f2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                                long m1179surfaceColorAtElevationcq6XJ1M;
                                Modifier m1178surface8ww4TTg;
                                ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier modifier5 = Modifier.this;
                                    Shape shape5 = shape42;
                                    long j9 = j7;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume22 = composer2.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) consume22, m3840constructorimpl2, composer2, (i6 >> 6) & 14);
                                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(modifier5, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1178surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }
                                    }), Unit.INSTANCE, new AnonymousClass2(null));
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    int i13 = i6;
                                    composer2.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume3;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                                    Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1539610176);
                                    ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                                    function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* compiled from: Surface.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                                int label;

                                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                            }
                        }), startRestartGroup, 56);
                        modifier3 = modifier2;
                        shape3 = shape42;
                        j8 = j6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        shape3 = shape2;
                        j7 = j3;
                        j8 = j4;
                        borderStroke4 = borderStroke2;
                        f3 = f;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
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
                            SurfaceKt.m1172SurfaceFjzlyU(Modifier.this, shape3, j7, j8, borderStroke4, f3, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i7;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                j5 = j3;
                j6 = j4;
                borderStroke3 = borderStroke2;
                i6 = i3;
                final Shape shape422 = shape2;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m3840constructorimpl22 = Dp.m3840constructorimpl(((Dp) consume22).m3854unboximpl() + f2);
                final Modifier modifier422 = modifier2;
                j7 = j5;
                borderStroke4 = borderStroke3;
                f3 = f2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                        long m1179surfaceColorAtElevationcq6XJ1M;
                        Modifier m1178surface8ww4TTg;
                        ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier modifier5 = Modifier.this;
                            Shape shape5 = shape422;
                            long j9 = j7;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume222 = composer2.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) consume222, m3840constructorimpl22, composer2, (i6 >> 6) & 14);
                            m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(modifier5, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1178surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }
                            }), Unit.INSTANCE, new AnonymousClass2(null));
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i13 = i6;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1539610176);
                            ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                            function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* compiled from: Surface.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                        int label;

                        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                    }
                }), startRestartGroup, 56);
                modifier3 = modifier2;
                shape3 = shape422;
                j8 = j6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            borderStroke2 = borderStroke;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            j5 = j3;
            j6 = j4;
            borderStroke3 = borderStroke2;
            i6 = i3;
            final Shape shape4222 = shape2;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m3840constructorimpl222 = Dp.m3840constructorimpl(((Dp) consume222).m3854unboximpl() + f2);
            final Modifier modifier4222 = modifier2;
            j7 = j5;
            borderStroke4 = borderStroke3;
            f3 = f2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl222))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                    long m1179surfaceColorAtElevationcq6XJ1M;
                    Modifier m1178surface8ww4TTg;
                    ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier modifier5 = Modifier.this;
                        Shape shape5 = shape4222;
                        long j9 = j7;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2222 = composer2.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) consume2222, m3840constructorimpl222, composer2, (i6 >> 6) & 14);
                        m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(modifier5, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1178surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        }), Unit.INSTANCE, new AnonymousClass2(null));
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i13 = i6;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1539610176);
                        ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                        function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* compiled from: Surface.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                    int label;

                    AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                }
            }), startRestartGroup, 56);
            modifier3 = modifier2;
            shape3 = shape4222;
            j8 = j6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        borderStroke2 = borderStroke;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        j5 = j3;
        j6 = j4;
        borderStroke3 = borderStroke2;
        i6 = i3;
        final Shape shape42222 = shape2;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation2222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m3840constructorimpl2222 = Dp.m3840constructorimpl(((Dp) consume2222).m3854unboximpl() + f2);
        final Modifier modifier42222 = modifier2;
        j7 = j5;
        borderStroke4 = borderStroke3;
        f3 = f2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2222))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                long m1179surfaceColorAtElevationcq6XJ1M;
                Modifier m1178surface8ww4TTg;
                ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier modifier5 = Modifier.this;
                    Shape shape5 = shape42222;
                    long j9 = j7;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22222 = composer2.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) consume22222, m3840constructorimpl2222, composer2, (i6 >> 6) & 14);
                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(modifier5, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1178surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), Unit.INSTANCE, new AnonymousClass2(null));
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i13 = i6;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                    Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1539610176);
                    ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                    function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }

            /* compiled from: Surface.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }
        }), startRestartGroup, 56);
        modifier3 = modifier2;
        shape3 = shape42222;
        j8 = j6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    @ExperimentalMaterialApi
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1173SurfaceLPr_se0(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Shape shape2;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j4;
        long j5;
        MutableInteractionSource mutableInteractionSource2;
        float f2;
        boolean z2;
        Shape shape3;
        long j6;
        long j7;
        BorderStroke borderStroke2;
        final int i11;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape4;
        final long j8;
        final long j9;
        final BorderStroke borderStroke3;
        final float f3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1560876237);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(8,7,5,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)213@10696L6,214@10738L22,217@10872L39,*220@11004L7,221@11028L1013:Surface.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    shape2 = shape;
                    i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i13 = 16384;
                                i3 |= i13;
                            }
                        } else {
                            j3 = j;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            i6 = i14;
                            if (startRestartGroup.changed(j2)) {
                                i12 = 131072;
                                i3 |= i12;
                            }
                        } else {
                            i6 = i14;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        i6 = i14;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i10 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 != 0 ? true : z;
                                Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                if ((i2 & 16) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                    i3 &= -57345;
                                } else {
                                    j4 = j3;
                                }
                                if ((i2 & 32) != 0) {
                                    j5 = ColorsKt.m994contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 12) & 14);
                                    i3 &= -458753;
                                } else {
                                    j5 = j2;
                                }
                                BorderStroke borderStroke4 = i7 != 0 ? null : borderStroke;
                                float m3840constructorimpl = i8 != 0 ? Dp.m3840constructorimpl(0) : f;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                f2 = m3840constructorimpl;
                                z2 = z4;
                                shape3 = rectangleShape;
                                j6 = j4;
                                j7 = j5;
                                borderStroke2 = borderStroke4;
                                i11 = i3;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier2 = modifier;
                                z2 = z;
                                j7 = j2;
                                borderStroke2 = borderStroke;
                                f2 = f;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i11 = i3;
                                shape3 = shape2;
                                j6 = j3;
                            }
                            startRestartGroup.endDefaults();
                            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localAbsoluteElevation);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final float m3840constructorimpl2 = Dp.m3840constructorimpl(((Dp) consume).m3854unboximpl() + f2);
                            final Modifier modifier4 = modifier2;
                            final Shape shape5 = shape3;
                            final long j10 = j6;
                            final BorderStroke borderStroke5 = borderStroke2;
                            final float f4 = f2;
                            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            final boolean z5 = z2;
                            composer2 = startRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                                public final void invoke(Composer composer3, int i15) {
                                    long m1179surfaceColorAtElevationcq6XJ1M;
                                    Modifier m1178surface8ww4TTg;
                                    ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                        Shape shape6 = shape5;
                                        long j11 = j10;
                                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localElevationOverlay);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume2, m3840constructorimpl2, composer3, (i11 >> 12) & 14);
                                        m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape6, m1179surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                        Modifier m190clickableO2vRcR0$default = ClickableKt.m190clickableO2vRcR0$default(m1178surface8ww4TTg, mutableInteractionSource4, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, null, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick, 8, null);
                                        Function2<Composer, Integer, Unit> function2 = content;
                                        int i16 = i11;
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume3;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m190clickableO2vRcR0$default);
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
                                        composer3.startReplaceableGroup(-390905273);
                                        ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                                        function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
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
                            }), composer2, 56);
                            modifier3 = modifier2;
                            z3 = z2;
                            shape4 = shape3;
                            j8 = j6;
                            j9 = j7;
                            borderStroke3 = borderStroke2;
                            f3 = f2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            f3 = f;
                            shape4 = shape2;
                            j8 = j3;
                            composer2 = startRestartGroup;
                            j9 = j2;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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

                            public final void invoke(Composer composer3, int i15) {
                                SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier3, z3, shape4, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i10 = C.ENCODING_PCM_32BIT;
                    i3 |= i10;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    f2 = m3840constructorimpl;
                    z2 = z4;
                    shape3 = rectangleShape;
                    j6 = j4;
                    j7 = j5;
                    borderStroke2 = borderStroke4;
                    i11 = i3;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m3840constructorimpl22 = Dp.m3840constructorimpl(((Dp) consume2).m3854unboximpl() + f2);
                    final Modifier modifier42 = modifier2;
                    final Shape shape52 = shape3;
                    final long j102 = j6;
                    final BorderStroke borderStroke52 = borderStroke2;
                    final float f42 = f2;
                    final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    final boolean z52 = z2;
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                        public final void invoke(Composer composer3, int i15) {
                            long m1179surfaceColorAtElevationcq6XJ1M;
                            Modifier m1178surface8ww4TTg;
                            ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape6 = shape52;
                                long j11 = j102;
                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume22 = composer3.consume(localElevationOverlay);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume22, m3840constructorimpl22, composer3, (i11 >> 12) & 14);
                                m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape6, m1179surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                Modifier m190clickableO2vRcR0$default = ClickableKt.m190clickableO2vRcR0$default(m1178surface8ww4TTg, mutableInteractionSource42, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z52, null, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick, 8, null);
                                Function2<Composer, Integer, Unit> function2 = content;
                                int i16 = i11;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume3;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m190clickableO2vRcR0$default);
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
                                composer3.startReplaceableGroup(-390905273);
                                ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                                function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
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
                    }), composer2, 56);
                    modifier3 = modifier2;
                    z3 = z2;
                    shape4 = shape3;
                    j8 = j6;
                    j9 = j7;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                shape2 = shape;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                f2 = m3840constructorimpl;
                z2 = z4;
                shape3 = rectangleShape;
                j6 = j4;
                j7 = j5;
                borderStroke2 = borderStroke4;
                i11 = i3;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m3840constructorimpl222 = Dp.m3840constructorimpl(((Dp) consume22).m3854unboximpl() + f2);
                final Modifier modifier422 = modifier2;
                final Shape shape522 = shape3;
                final long j1022 = j6;
                final BorderStroke borderStroke522 = borderStroke2;
                final float f422 = f2;
                final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                final boolean z522 = z2;
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                    public final void invoke(Composer composer3, int i15) {
                        long m1179surfaceColorAtElevationcq6XJ1M;
                        Modifier m1178surface8ww4TTg;
                        ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape6 = shape522;
                            long j11 = j1022;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume222 = composer3.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume222, m3840constructorimpl222, composer3, (i11 >> 12) & 14);
                            m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape6, m1179surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                            Modifier m190clickableO2vRcR0$default = ClickableKt.m190clickableO2vRcR0$default(m1178surface8ww4TTg, mutableInteractionSource422, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z522, null, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick, 8, null);
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i16 = i11;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m190clickableO2vRcR0$default);
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
                            composer3.startReplaceableGroup(-390905273);
                            ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                            function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
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
                }), composer2, 56);
                modifier3 = modifier2;
                z3 = z2;
                shape4 = shape3;
                j8 = j6;
                j9 = j7;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            shape2 = shape;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            f2 = m3840constructorimpl;
            z2 = z4;
            shape3 = rectangleShape;
            j6 = j4;
            j7 = j5;
            borderStroke2 = borderStroke4;
            i11 = i3;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m3840constructorimpl2222 = Dp.m3840constructorimpl(((Dp) consume222).m3854unboximpl() + f2);
            final Modifier modifier4222 = modifier2;
            final Shape shape5222 = shape3;
            final long j10222 = j6;
            final BorderStroke borderStroke5222 = borderStroke2;
            final float f4222 = f2;
            final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            final boolean z5222 = z2;
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                public final void invoke(Composer composer3, int i15) {
                    long m1179surfaceColorAtElevationcq6XJ1M;
                    Modifier m1178surface8ww4TTg;
                    ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape6 = shape5222;
                        long j11 = j10222;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2222 = composer3.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume2222, m3840constructorimpl2222, composer3, (i11 >> 12) & 14);
                        m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape6, m1179surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                        Modifier m190clickableO2vRcR0$default = ClickableKt.m190clickableO2vRcR0$default(m1178surface8ww4TTg, mutableInteractionSource4222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5222, null, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick, 8, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i16 = i11;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m190clickableO2vRcR0$default);
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
                        composer3.startReplaceableGroup(-390905273);
                        ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                        function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
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
            }), composer2, 56);
            modifier3 = modifier2;
            z3 = z2;
            shape4 = shape3;
            j8 = j6;
            j9 = j7;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        shape2 = shape;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        f2 = m3840constructorimpl;
        z2 = z4;
        shape3 = rectangleShape;
        j6 = j4;
        j7 = j5;
        borderStroke2 = borderStroke4;
        i11 = i3;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation2222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m3840constructorimpl22222 = Dp.m3840constructorimpl(((Dp) consume2222).m3854unboximpl() + f2);
        final Modifier modifier42222 = modifier2;
        final Shape shape52222 = shape3;
        final long j102222 = j6;
        final BorderStroke borderStroke52222 = borderStroke2;
        final float f42222 = f2;
        final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        final boolean z52222 = z2;
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

            public final void invoke(Composer composer3, int i15) {
                long m1179surfaceColorAtElevationcq6XJ1M;
                Modifier m1178surface8ww4TTg;
                ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape6 = shape52222;
                    long j11 = j102222;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22222 = composer3.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume22222, m3840constructorimpl22222, composer3, (i11 >> 12) & 14);
                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape6, m1179surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                    Modifier m190clickableO2vRcR0$default = ClickableKt.m190clickableO2vRcR0$default(m1178surface8ww4TTg, mutableInteractionSource42222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z52222, null, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick, 8, null);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i16 = i11;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m190clickableO2vRcR0$default);
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
                    composer3.startReplaceableGroup(-390905273);
                    ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                    function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
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
        }), composer2, 56);
        modifier3 = modifier2;
        z3 = z2;
        shape4 = shape3;
        j8 = j6;
        j9 = j7;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    @ExperimentalMaterialApi
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1174SurfaceNy5ogXk(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        long j4;
        long j5;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        float f2;
        Modifier modifier2;
        long j6;
        Shape shape2;
        long j7;
        final int i12;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape3;
        final long j8;
        final long j9;
        final BorderStroke borderStroke3;
        final float f3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(262027249);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,7,5,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)329@16529L6,330@16571L22,333@16705L39,*336@16837L7,337@16861L1052:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    i4 |= startRestartGroup.changed(shape) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j2;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j2;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i8 = i3 & 256;
                        if (i8 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            i4 |= C.ENCODING_PCM_32BIT;
                        } else if ((i & 1879048192) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else {
                            if ((i2 & 14) != 0) {
                                i10 = i2;
                                if ((1533916891 & i4) == 306783378 || (i10 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i13 == 0 ? Modifier.INSTANCE : modifier;
                                        boolean z6 = i5 == 0 ? true : z2;
                                        Shape rectangleShape = i6 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                        if ((i3 & 32) == 0) {
                                            i4 &= -458753;
                                            z3 = z6;
                                            j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                        } else {
                                            z3 = z6;
                                            j4 = j;
                                        }
                                        if ((i3 & 64) == 0) {
                                            j5 = ColorsKt.m994contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        } else {
                                            j5 = j3;
                                        }
                                        BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                        float m3840constructorimpl = i8 == 0 ? Dp.m3840constructorimpl(0) : f;
                                        if (i9 == 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            z4 = z3;
                                            borderStroke2 = borderStroke4;
                                            f2 = m3840constructorimpl;
                                            modifier2 = companion;
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            z4 = z3;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            borderStroke2 = borderStroke4;
                                            f2 = m3840constructorimpl;
                                            modifier2 = companion;
                                        }
                                        j6 = j4;
                                        shape2 = rectangleShape;
                                        j7 = j5;
                                        i12 = i4;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        z4 = z2;
                                        shape2 = shape;
                                        j6 = j;
                                        borderStroke2 = borderStroke;
                                        f2 = f;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        i12 = i4;
                                        j7 = j3;
                                    }
                                    startRestartGroup.endDefaults();
                                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m3840constructorimpl2 = Dp.m3840constructorimpl(((Dp) consume).m3854unboximpl() + f2);
                                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2))};
                                    final Modifier modifier4 = modifier2;
                                    final Shape shape4 = shape2;
                                    final long j10 = j6;
                                    final BorderStroke borderStroke5 = borderStroke2;
                                    final float f4 = f2;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final boolean z7 = z4;
                                    final int i14 = i10;
                                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

                                        public final void invoke(Composer composer3, int i15) {
                                            long m1179surfaceColorAtElevationcq6XJ1M;
                                            Modifier m1178surface8ww4TTg;
                                            ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                                Shape shape5 = shape4;
                                                long j11 = j10;
                                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer3.consume(localElevationOverlay);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume2, m3840constructorimpl2, composer3, (i12 >> 15) & 14);
                                                m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                                Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource4, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                                                Function2<Composer, Integer, Unit> function22 = content;
                                                int i16 = i14;
                                                composer3.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer3.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) consume3;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m636selectableO2vRcR0);
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
                                                composer3.startReplaceableGroup(23612267);
                                                ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                                function22.invoke(composer3, Integer.valueOf(i16 & 14));
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
                                    };
                                    composer2 = startRestartGroup;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function2), composer2, 56);
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    shape3 = shape2;
                                    j8 = j6;
                                    j9 = j7;
                                    borderStroke3 = borderStroke2;
                                    f3 = f2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    z5 = z2;
                                    shape3 = shape;
                                    j8 = j;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    j9 = j3;
                                    composer2 = startRestartGroup;
                                    borderStroke3 = borderStroke;
                                    f3 = f;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$8
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

                                    public final void invoke(Composer composer3, int i15) {
                                        SurfaceKt.m1174SurfaceNy5ogXk(z, onClick, modifier3, z5, shape3, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
                                    }
                                });
                                return;
                            }
                            i11 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                        }
                        i10 = i11;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        j6 = j4;
                        shape2 = rectangleShape;
                        j7 = j5;
                        i12 = i4;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m3840constructorimpl22 = Dp.m3840constructorimpl(((Dp) consume2).m3854unboximpl() + f2);
                        ProvidedValue[] providedValueArr2 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22))};
                        final Modifier modifier42 = modifier2;
                        final Shape shape42 = shape2;
                        final long j102 = j6;
                        final BorderStroke borderStroke52 = borderStroke2;
                        final float f42 = f2;
                        final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        final boolean z72 = z4;
                        final int i142 = i10;
                        Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

                            public final void invoke(Composer composer3, int i15) {
                                long m1179surfaceColorAtElevationcq6XJ1M;
                                Modifier m1178surface8ww4TTg;
                                ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape5 = shape42;
                                    long j11 = j102;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume22 = composer3.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume22, m3840constructorimpl22, composer3, (i12 >> 15) & 14);
                                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                    Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource42, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                                    Function2<Composer, Integer, Unit> function222 = content;
                                    int i16 = i142;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) consume3;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m636selectableO2vRcR0);
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
                                    composer3.startReplaceableGroup(23612267);
                                    ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                    function222.invoke(composer3, Integer.valueOf(i16 & 14));
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
                        };
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function22), composer2, 56);
                        modifier3 = modifier2;
                        z5 = z4;
                        shape3 = shape2;
                        j8 = j6;
                        j9 = j7;
                        borderStroke3 = borderStroke2;
                        f3 = f2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    i10 = i11;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    j6 = j4;
                    shape2 = rectangleShape;
                    j7 = j5;
                    i12 = i4;
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m3840constructorimpl222 = Dp.m3840constructorimpl(((Dp) consume22).m3854unboximpl() + f2);
                    ProvidedValue[] providedValueArr22 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl222))};
                    final Modifier modifier422 = modifier2;
                    final Shape shape422 = shape2;
                    final long j1022 = j6;
                    final BorderStroke borderStroke522 = borderStroke2;
                    final float f422 = f2;
                    final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    final boolean z722 = z4;
                    final int i1422 = i10;
                    Function2<Composer, Integer, Unit> function222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

                        public final void invoke(Composer composer3, int i15) {
                            long m1179surfaceColorAtElevationcq6XJ1M;
                            Modifier m1178surface8ww4TTg;
                            ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape422;
                                long j11 = j1022;
                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume222 = composer3.consume(localElevationOverlay);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume222, m3840constructorimpl222, composer3, (i12 >> 15) & 14);
                                m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                                Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource422, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                                Function2<Composer, Integer, Unit> function2222 = content;
                                int i16 = i1422;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume3;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m636selectableO2vRcR0);
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
                                composer3.startReplaceableGroup(23612267);
                                ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                function2222.invoke(composer3, Integer.valueOf(i16 & 14));
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
                    };
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function222), composer2, 56);
                    modifier3 = modifier2;
                    z5 = z4;
                    shape3 = shape2;
                    j8 = j6;
                    j9 = j7;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((458752 & i) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                i10 = i11;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                j6 = j4;
                shape2 = rectangleShape;
                j7 = j5;
                i12 = i4;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m3840constructorimpl2222 = Dp.m3840constructorimpl(((Dp) consume222).m3854unboximpl() + f2);
                ProvidedValue[] providedValueArr222 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2222))};
                final Modifier modifier4222 = modifier2;
                final Shape shape4222 = shape2;
                final long j10222 = j6;
                final BorderStroke borderStroke5222 = borderStroke2;
                final float f4222 = f2;
                final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                final boolean z7222 = z4;
                final int i14222 = i10;
                Function2<Composer, Integer, Unit> function2222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

                    public final void invoke(Composer composer3, int i15) {
                        long m1179surfaceColorAtElevationcq6XJ1M;
                        Modifier m1178surface8ww4TTg;
                        ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape4222;
                            long j11 = j10222;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2222 = composer3.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume2222, m3840constructorimpl2222, composer3, (i12 >> 15) & 14);
                            m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                            Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource4222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7222, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                            Function2<Composer, Integer, Unit> function22222 = content;
                            int i16 = i14222;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m636selectableO2vRcR0);
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
                            composer3.startReplaceableGroup(23612267);
                            ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                            function22222.invoke(composer3, Integer.valueOf(i16 & 14));
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
                };
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function2222), composer2, 56);
                modifier3 = modifier2;
                z5 = z4;
                shape3 = shape2;
                j8 = j6;
                j9 = j7;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            i10 = i11;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            j6 = j4;
            shape2 = rectangleShape;
            j7 = j5;
            i12 = i4;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation2222 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m3840constructorimpl22222 = Dp.m3840constructorimpl(((Dp) consume2222).m3854unboximpl() + f2);
            ProvidedValue[] providedValueArr2222 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22222))};
            final Modifier modifier42222 = modifier2;
            final Shape shape42222 = shape2;
            final long j102222 = j6;
            final BorderStroke borderStroke52222 = borderStroke2;
            final float f42222 = f2;
            final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            final boolean z72222 = z4;
            final int i142222 = i10;
            Function2<Composer, Integer, Unit> function22222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

                public final void invoke(Composer composer3, int i15) {
                    long m1179surfaceColorAtElevationcq6XJ1M;
                    Modifier m1178surface8ww4TTg;
                    ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape42222;
                        long j11 = j102222;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22222 = composer3.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume22222, m3840constructorimpl22222, composer3, (i12 >> 15) & 14);
                        m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                        Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource42222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72222, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                        Function2<Composer, Integer, Unit> function222222 = content;
                        int i16 = i142222;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m636selectableO2vRcR0);
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
                        composer3.startReplaceableGroup(23612267);
                        ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                        function222222.invoke(composer3, Integer.valueOf(i16 & 14));
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
            };
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function22222), composer2, 56);
            modifier3 = modifier2;
            z5 = z4;
            shape3 = shape2;
            j8 = j6;
            j9 = j7;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        i10 = i11;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        j6 = j4;
        shape2 = rectangleShape;
        j7 = j5;
        i12 = i4;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation22222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localAbsoluteElevation22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m3840constructorimpl222222 = Dp.m3840constructorimpl(((Dp) consume22222).m3854unboximpl() + f2);
        ProvidedValue[] providedValueArr22222 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl222222))};
        final Modifier modifier422222 = modifier2;
        final Shape shape422222 = shape2;
        final long j1022222 = j6;
        final BorderStroke borderStroke522222 = borderStroke2;
        final float f422222 = f2;
        final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        final boolean z722222 = z4;
        final int i1422222 = i10;
        Function2<Composer, Integer, Unit> function222222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

            public final void invoke(Composer composer3, int i15) {
                long m1179surfaceColorAtElevationcq6XJ1M;
                Modifier m1178surface8ww4TTg;
                ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape422222;
                    long j11 = j1022222;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222222 = composer3.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume222222, m3840constructorimpl222222, composer3, (i12 >> 15) & 14);
                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke522222, f422222);
                    Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource422222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722222, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                    Function2<Composer, Integer, Unit> function2222222 = content;
                    int i16 = i1422222;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m636selectableO2vRcR0);
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
                    composer3.startReplaceableGroup(23612267);
                    ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                    function2222222.invoke(composer3, Integer.valueOf(i16 & 14));
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
        };
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function222222), composer2, 56);
        modifier3 = modifier2;
        z5 = z4;
        shape3 = shape2;
        j8 = j6;
        j9 = j7;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    @ExperimentalMaterialApi
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1175SurfaceNy5ogXk(final boolean z, final Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        long j4;
        long j5;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        float f2;
        Modifier modifier2;
        long j6;
        Shape shape2;
        long j7;
        final int i12;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape3;
        final long j8;
        final long j9;
        final BorderStroke borderStroke3;
        final float f3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1341569296);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(1,9,8,6,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color!1,5:c#ui.unit.Dp,7)446@22479L6,447@22521L22,450@22655L39,*453@22787L7,454@22811L1065:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onCheckedChange) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    i4 |= startRestartGroup.changed(shape) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j2;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j2;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i8 = i3 & 256;
                        if (i8 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            i4 |= C.ENCODING_PCM_32BIT;
                        } else if ((i & 1879048192) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else {
                            if ((i2 & 14) != 0) {
                                i10 = i2;
                                if ((1533916891 & i4) == 306783378 || (i10 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i13 == 0 ? Modifier.INSTANCE : modifier;
                                        boolean z6 = i5 == 0 ? true : z2;
                                        Shape rectangleShape = i6 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                        if ((i3 & 32) == 0) {
                                            i4 &= -458753;
                                            z3 = z6;
                                            j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                        } else {
                                            z3 = z6;
                                            j4 = j;
                                        }
                                        if ((i3 & 64) == 0) {
                                            j5 = ColorsKt.m994contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        } else {
                                            j5 = j3;
                                        }
                                        BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                        float m3840constructorimpl = i8 == 0 ? Dp.m3840constructorimpl(0) : f;
                                        if (i9 == 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            z4 = z3;
                                            borderStroke2 = borderStroke4;
                                            f2 = m3840constructorimpl;
                                            modifier2 = companion;
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            z4 = z3;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            borderStroke2 = borderStroke4;
                                            f2 = m3840constructorimpl;
                                            modifier2 = companion;
                                        }
                                        j6 = j4;
                                        shape2 = rectangleShape;
                                        j7 = j5;
                                        i12 = i4;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        z4 = z2;
                                        shape2 = shape;
                                        j6 = j;
                                        borderStroke2 = borderStroke;
                                        f2 = f;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        i12 = i4;
                                        j7 = j3;
                                    }
                                    startRestartGroup.endDefaults();
                                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m3840constructorimpl2 = Dp.m3840constructorimpl(((Dp) consume).m3854unboximpl() + f2);
                                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2))};
                                    final Modifier modifier4 = modifier2;
                                    final Shape shape4 = shape2;
                                    final long j10 = j6;
                                    final BorderStroke borderStroke5 = borderStroke2;
                                    final float f4 = f2;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final boolean z7 = z4;
                                    final int i14 = i10;
                                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

                                        public final void invoke(Composer composer3, int i15) {
                                            long m1179surfaceColorAtElevationcq6XJ1M;
                                            Modifier m1178surface8ww4TTg;
                                            ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                                Shape shape5 = shape4;
                                                long j11 = j10;
                                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer3.consume(localElevationOverlay);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume2, m3840constructorimpl2, composer3, (i12 >> 15) & 14);
                                                m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                                Modifier m641toggleableO2vRcR0 = ToggleableKt.m641toggleableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource4, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7, Role.m3377boximpl(Role.INSTANCE.m3388getSwitcho7Vup1c()), onCheckedChange);
                                                Function2<Composer, Integer, Unit> function22 = content;
                                                int i16 = i14;
                                                composer3.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer3.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) consume3;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m641toggleableO2vRcR0);
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
                                                composer3.startReplaceableGroup(1103154314);
                                                ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                                function22.invoke(composer3, Integer.valueOf(i16 & 14));
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
                                    };
                                    composer2 = startRestartGroup;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function2), composer2, 56);
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    shape3 = shape2;
                                    j8 = j6;
                                    j9 = j7;
                                    borderStroke3 = borderStroke2;
                                    f3 = f2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    z5 = z2;
                                    shape3 = shape;
                                    j8 = j;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    j9 = j3;
                                    composer2 = startRestartGroup;
                                    borderStroke3 = borderStroke;
                                    f3 = f;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$11
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

                                    public final void invoke(Composer composer3, int i15) {
                                        SurfaceKt.m1175SurfaceNy5ogXk(z, onCheckedChange, modifier3, z5, shape3, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
                                    }
                                });
                                return;
                            }
                            i11 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                        }
                        i10 = i11;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        j6 = j4;
                        shape2 = rectangleShape;
                        j7 = j5;
                        i12 = i4;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m3840constructorimpl22 = Dp.m3840constructorimpl(((Dp) consume2).m3854unboximpl() + f2);
                        ProvidedValue[] providedValueArr2 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22))};
                        final Modifier modifier42 = modifier2;
                        final Shape shape42 = shape2;
                        final long j102 = j6;
                        final BorderStroke borderStroke52 = borderStroke2;
                        final float f42 = f2;
                        final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        final boolean z72 = z4;
                        final int i142 = i10;
                        Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

                            public final void invoke(Composer composer3, int i15) {
                                long m1179surfaceColorAtElevationcq6XJ1M;
                                Modifier m1178surface8ww4TTg;
                                ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape5 = shape42;
                                    long j11 = j102;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume22 = composer3.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume22, m3840constructorimpl22, composer3, (i12 >> 15) & 14);
                                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                    Modifier m641toggleableO2vRcR0 = ToggleableKt.m641toggleableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource42, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72, Role.m3377boximpl(Role.INSTANCE.m3388getSwitcho7Vup1c()), onCheckedChange);
                                    Function2<Composer, Integer, Unit> function222 = content;
                                    int i16 = i142;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) consume3;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m641toggleableO2vRcR0);
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
                                    composer3.startReplaceableGroup(1103154314);
                                    ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                    function222.invoke(composer3, Integer.valueOf(i16 & 14));
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
                        };
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function22), composer2, 56);
                        modifier3 = modifier2;
                        z5 = z4;
                        shape3 = shape2;
                        j8 = j6;
                        j9 = j7;
                        borderStroke3 = borderStroke2;
                        f3 = f2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    i10 = i11;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    j6 = j4;
                    shape2 = rectangleShape;
                    j7 = j5;
                    i12 = i4;
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m3840constructorimpl222 = Dp.m3840constructorimpl(((Dp) consume22).m3854unboximpl() + f2);
                    ProvidedValue[] providedValueArr22 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl222))};
                    final Modifier modifier422 = modifier2;
                    final Shape shape422 = shape2;
                    final long j1022 = j6;
                    final BorderStroke borderStroke522 = borderStroke2;
                    final float f422 = f2;
                    final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    final boolean z722 = z4;
                    final int i1422 = i10;
                    Function2<Composer, Integer, Unit> function222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

                        public final void invoke(Composer composer3, int i15) {
                            long m1179surfaceColorAtElevationcq6XJ1M;
                            Modifier m1178surface8ww4TTg;
                            ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape422;
                                long j11 = j1022;
                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume222 = composer3.consume(localElevationOverlay);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume222, m3840constructorimpl222, composer3, (i12 >> 15) & 14);
                                m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                                Modifier m641toggleableO2vRcR0 = ToggleableKt.m641toggleableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource422, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722, Role.m3377boximpl(Role.INSTANCE.m3388getSwitcho7Vup1c()), onCheckedChange);
                                Function2<Composer, Integer, Unit> function2222 = content;
                                int i16 = i1422;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume3;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m641toggleableO2vRcR0);
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
                                composer3.startReplaceableGroup(1103154314);
                                ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                function2222.invoke(composer3, Integer.valueOf(i16 & 14));
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
                    };
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function222), composer2, 56);
                    modifier3 = modifier2;
                    z5 = z4;
                    shape3 = shape2;
                    j8 = j6;
                    j9 = j7;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((458752 & i) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                i10 = i11;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                j6 = j4;
                shape2 = rectangleShape;
                j7 = j5;
                i12 = i4;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m3840constructorimpl2222 = Dp.m3840constructorimpl(((Dp) consume222).m3854unboximpl() + f2);
                ProvidedValue[] providedValueArr222 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2222))};
                final Modifier modifier4222 = modifier2;
                final Shape shape4222 = shape2;
                final long j10222 = j6;
                final BorderStroke borderStroke5222 = borderStroke2;
                final float f4222 = f2;
                final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                final boolean z7222 = z4;
                final int i14222 = i10;
                Function2<Composer, Integer, Unit> function2222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

                    public final void invoke(Composer composer3, int i15) {
                        long m1179surfaceColorAtElevationcq6XJ1M;
                        Modifier m1178surface8ww4TTg;
                        ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape4222;
                            long j11 = j10222;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2222 = composer3.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume2222, m3840constructorimpl2222, composer3, (i12 >> 15) & 14);
                            m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                            Modifier m641toggleableO2vRcR0 = ToggleableKt.m641toggleableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource4222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7222, Role.m3377boximpl(Role.INSTANCE.m3388getSwitcho7Vup1c()), onCheckedChange);
                            Function2<Composer, Integer, Unit> function22222 = content;
                            int i16 = i14222;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m641toggleableO2vRcR0);
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
                            composer3.startReplaceableGroup(1103154314);
                            ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                            function22222.invoke(composer3, Integer.valueOf(i16 & 14));
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
                };
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function2222), composer2, 56);
                modifier3 = modifier2;
                z5 = z4;
                shape3 = shape2;
                j8 = j6;
                j9 = j7;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            i10 = i11;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            j6 = j4;
            shape2 = rectangleShape;
            j7 = j5;
            i12 = i4;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation2222 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m3840constructorimpl22222 = Dp.m3840constructorimpl(((Dp) consume2222).m3854unboximpl() + f2);
            ProvidedValue[] providedValueArr2222 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22222))};
            final Modifier modifier42222 = modifier2;
            final Shape shape42222 = shape2;
            final long j102222 = j6;
            final BorderStroke borderStroke52222 = borderStroke2;
            final float f42222 = f2;
            final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            final boolean z72222 = z4;
            final int i142222 = i10;
            Function2<Composer, Integer, Unit> function22222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

                public final void invoke(Composer composer3, int i15) {
                    long m1179surfaceColorAtElevationcq6XJ1M;
                    Modifier m1178surface8ww4TTg;
                    ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape42222;
                        long j11 = j102222;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22222 = composer3.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume22222, m3840constructorimpl22222, composer3, (i12 >> 15) & 14);
                        m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                        Modifier m641toggleableO2vRcR0 = ToggleableKt.m641toggleableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource42222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72222, Role.m3377boximpl(Role.INSTANCE.m3388getSwitcho7Vup1c()), onCheckedChange);
                        Function2<Composer, Integer, Unit> function222222 = content;
                        int i16 = i142222;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m641toggleableO2vRcR0);
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
                        composer3.startReplaceableGroup(1103154314);
                        ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                        function222222.invoke(composer3, Integer.valueOf(i16 & 14));
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
            };
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function22222), composer2, 56);
            modifier3 = modifier2;
            z5 = z4;
            shape3 = shape2;
            j8 = j6;
            j9 = j7;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        i10 = i11;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        j6 = j4;
        shape2 = rectangleShape;
        j7 = j5;
        i12 = i4;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation22222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localAbsoluteElevation22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m3840constructorimpl222222 = Dp.m3840constructorimpl(((Dp) consume22222).m3854unboximpl() + f2);
        ProvidedValue[] providedValueArr22222 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl222222))};
        final Modifier modifier422222 = modifier2;
        final Shape shape422222 = shape2;
        final long j1022222 = j6;
        final BorderStroke borderStroke522222 = borderStroke2;
        final float f422222 = f2;
        final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        final boolean z722222 = z4;
        final int i1422222 = i10;
        Function2<Composer, Integer, Unit> function222222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

            public final void invoke(Composer composer3, int i15) {
                long m1179surfaceColorAtElevationcq6XJ1M;
                Modifier m1178surface8ww4TTg;
                ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape422222;
                    long j11 = j1022222;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222222 = composer3.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j11, (ElevationOverlay) consume222222, m3840constructorimpl222222, composer3, (i12 >> 15) & 14);
                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke522222, f422222);
                    Modifier m641toggleableO2vRcR0 = ToggleableKt.m641toggleableO2vRcR0(m1178surface8ww4TTg, z, mutableInteractionSource422222, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722222, Role.m3377boximpl(Role.INSTANCE.m3388getSwitcho7Vup1c()), onCheckedChange);
                    Function2<Composer, Integer, Unit> function2222222 = content;
                    int i16 = i1422222;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m641toggleableO2vRcR0);
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
                    composer3.startReplaceableGroup(1103154314);
                    ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                    function2222222.invoke(composer3, Integer.valueOf(i16 & 14));
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
        };
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function222222), composer2, 56);
        modifier3 = modifier2;
        z5 = z4;
        shape3 = shape2;
        j8 = j6;
        j9 = j7;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0255  */
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @ReplaceWith(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @ExperimentalMaterialApi
    /* renamed from: Surface-9VG74zQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1171Surface9VG74zQ(final Function0<Unit> onClick, Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final int i13;
        long j3;
        Modifier modifier2;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Indication indication2;
        Modifier modifier3;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource4;
        Role role2;
        final int i14;
        boolean z2;
        Indication indication3;
        float f2;
        String str2;
        Shape shape2;
        long j5;
        long j6;
        Composer composer2;
        final Modifier modifier4;
        final Shape shape3;
        final long j7;
        final long j8;
        final BorderStroke borderStroke3;
        final float f3;
        final MutableInteractionSource mutableInteractionSource5;
        final Indication indication4;
        final boolean z3;
        final String str3;
        final Role role3;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1585925488);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,12,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,7,6,5,10,11:c#ui.semantics.Role)575@29078L6,576@29120L22,579@29254L39,580@29341L7,*586@29528L7,587@29552L1119:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(shape) ? 256 : 128;
                if ((i & 7168) == 0) {
                    i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j)) ? 2048 : 1024;
                }
                if ((i & 57344) == 0) {
                    i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(indication)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i4 |= i15;
                    }
                    i15 = 33554432;
                    i4 |= i15;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 112) == 0) {
                    i11 |= startRestartGroup.changed(role) ? 32 : 16;
                }
                int i17 = i11;
                if ((i3 & 4096) != 0) {
                    i17 |= 384;
                } else if ((i2 & 896) == 0) {
                    i17 |= startRestartGroup.changed(content) ? 256 : 128;
                }
                i13 = i17;
                if ((1533916891 & i4) == 306783378 || (i13 & 731) != 146 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier;
                        Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : shape;
                        if ((i3 & 8) != 0) {
                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                            i4 &= -7169;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & 16) != 0) {
                            modifier2 = companion;
                            j4 = ColorsKt.m994contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 9) & 14);
                            i4 &= -57345;
                        } else {
                            modifier2 = companion;
                            j4 = j2;
                        }
                        BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                        float m3840constructorimpl = i7 != 0 ? Dp.m3840constructorimpl(0) : f;
                        if (i8 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                            mutableInteractionSource3 = mutableInteractionSource2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localIndication);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            indication2 = (Indication) consume;
                            i4 &= -234881025;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            indication2 = indication;
                        }
                        boolean z4 = i9 != 0 ? true : z;
                        String str4 = i10 != 0 ? null : str;
                        modifier3 = modifier2;
                        borderStroke2 = borderStroke4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        if (i12 != 0) {
                            i14 = i4;
                            z2 = z4;
                            indication3 = indication2;
                            f2 = m3840constructorimpl;
                            str2 = str4;
                            shape2 = rectangleShape;
                            j5 = j4;
                            role2 = null;
                        } else {
                            role2 = role;
                            i14 = i4;
                            z2 = z4;
                            indication3 = indication2;
                            f2 = m3840constructorimpl;
                            str2 = str4;
                            shape2 = rectangleShape;
                            j5 = j4;
                        }
                        j6 = j3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        modifier3 = modifier;
                        shape2 = shape;
                        j6 = j;
                        j5 = j2;
                        borderStroke2 = borderStroke;
                        f2 = f;
                        mutableInteractionSource4 = mutableInteractionSource;
                        indication3 = indication;
                        z2 = z;
                        str2 = str;
                        role2 = role;
                        i14 = i4;
                    }
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localAbsoluteElevation);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m3840constructorimpl2 = Dp.m3840constructorimpl(((Dp) consume2).m3854unboximpl() + f2);
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl2))};
                    final Modifier modifier5 = modifier3;
                    final Shape shape4 = shape2;
                    final long j9 = j6;
                    final BorderStroke borderStroke5 = borderStroke2;
                    final float f4 = f2;
                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final Indication indication5 = indication3;
                    final boolean z5 = z2;
                    final String str5 = str2;
                    final Role role4 = role2;
                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

                        public final void invoke(Composer composer3, int i18) {
                            long m1179surfaceColorAtElevationcq6XJ1M;
                            Modifier m1178surface8ww4TTg;
                            ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                            if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape4;
                                long j10 = j9;
                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localElevationOverlay);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume3, m3840constructorimpl2, composer3, (i14 >> 9) & 14);
                                m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                Modifier then = m1178surface8ww4TTg.then(ClickableKt.m189clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource6, indication5, z5, str5, role4, onClick));
                                Function2<Composer, Integer, Unit> function22 = content;
                                int i19 = i13;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume4;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume5;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume6 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume6;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
                                composer3.startReplaceableGroup(-1300719946);
                                ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                                function22.invoke(composer3, Integer.valueOf((i19 >> 6) & 14));
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
                    };
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 149594672, true, function2), composer2, 56);
                    modifier4 = modifier3;
                    shape3 = shape2;
                    j7 = j6;
                    j8 = j5;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    indication4 = indication3;
                    z3 = z2;
                    str3 = str2;
                    role3 = role2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    shape3 = shape;
                    j7 = j;
                    j8 = j2;
                    borderStroke3 = borderStroke;
                    f3 = f;
                    indication4 = indication;
                    z3 = z;
                    str3 = str;
                    role3 = role;
                    composer2 = startRestartGroup;
                    mutableInteractionSource5 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$14
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

                    public final void invoke(Composer composer3, int i18) {
                        SurfaceKt.m1171Surface9VG74zQ(onClick, modifier4, shape3, j7, j8, borderStroke3, f3, mutableInteractionSource5, indication4, z3, str3, role3, content, composer3, i | 1, i2, i3);
                    }
                });
                return;
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            int i172 = i11;
            if ((i3 & 4096) != 0) {
            }
            i13 = i172;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            BorderStroke borderStroke42 = i6 != 0 ? null : borderStroke;
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            modifier3 = modifier2;
            borderStroke2 = borderStroke42;
            mutableInteractionSource4 = mutableInteractionSource3;
            if (i12 != 0) {
            }
            j6 = j3;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localAbsoluteElevation2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m3840constructorimpl22 = Dp.m3840constructorimpl(((Dp) consume22).m3854unboximpl() + f2);
            ProvidedValue[] providedValueArr2 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl22))};
            final Modifier modifier52 = modifier3;
            final Shape shape42 = shape2;
            final long j92 = j6;
            final BorderStroke borderStroke52 = borderStroke2;
            final float f42 = f2;
            final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final Indication indication52 = indication3;
            final boolean z52 = z2;
            final String str52 = str2;
            final Role role42 = role2;
            Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

                public final void invoke(Composer composer3, int i18) {
                    long m1179surfaceColorAtElevationcq6XJ1M;
                    Modifier m1178surface8ww4TTg;
                    ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                    if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape42;
                        long j10 = j92;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume3, m3840constructorimpl22, composer3, (i14 >> 9) & 14);
                        m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                        Modifier then = m1178surface8ww4TTg.then(ClickableKt.m189clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource62, indication52, z52, str52, role42, onClick));
                        Function2<Composer, Integer, Unit> function222 = content;
                        int i19 = i13;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume4;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume5;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume6 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume6;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
                        composer3.startReplaceableGroup(-1300719946);
                        ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                        function222.invoke(composer3, Integer.valueOf((i19 >> 6) & 14));
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
            };
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer2, 149594672, true, function22), composer2, 56);
            modifier4 = modifier3;
            shape3 = shape2;
            j7 = j6;
            j8 = j5;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource5 = mutableInteractionSource4;
            indication4 = indication3;
            z3 = z2;
            str3 = str2;
            role3 = role2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        int i1722 = i11;
        if ((i3 & 4096) != 0) {
        }
        i13 = i1722;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        BorderStroke borderStroke422 = i6 != 0 ? null : borderStroke;
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        modifier3 = modifier2;
        borderStroke2 = borderStroke422;
        mutableInteractionSource4 = mutableInteractionSource3;
        if (i12 != 0) {
        }
        j6 = j3;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localAbsoluteElevation22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m3840constructorimpl222 = Dp.m3840constructorimpl(((Dp) consume222).m3854unboximpl() + f2);
        ProvidedValue[] providedValueArr22 = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m3838boximpl(m3840constructorimpl222))};
        final Modifier modifier522 = modifier3;
        final Shape shape422 = shape2;
        final long j922 = j6;
        final BorderStroke borderStroke522 = borderStroke2;
        final float f422 = f2;
        final MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final Indication indication522 = indication3;
        final boolean z522 = z2;
        final String str522 = str2;
        final Role role422 = role2;
        Function2<Composer, Integer, Unit> function222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

            public final void invoke(Composer composer3, int i18) {
                long m1179surfaceColorAtElevationcq6XJ1M;
                Modifier m1178surface8ww4TTg;
                ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape422;
                    long j10 = j922;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1179surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1179surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume3, m3840constructorimpl222, composer3, (i14 >> 9) & 14);
                    m1178surface8ww4TTg = SurfaceKt.m1178surface8ww4TTg(minimumTouchTargetSize, shape5, m1179surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                    Modifier then = m1178surface8ww4TTg.then(ClickableKt.m189clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource622, indication522, z522, str522, role422, onClick));
                    Function2<Composer, Integer, Unit> function2222 = content;
                    int i19 = i13;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume4;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume5;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume6 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume6;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
                    composer3.startReplaceableGroup(-1300719946);
                    ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                    function2222.invoke(composer3, Integer.valueOf((i19 >> 6) & 14));
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
        };
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22, ComposableLambdaKt.composableLambda(composer2, 149594672, true, function222), composer2, 56);
        modifier4 = modifier3;
        shape3 = shape2;
        j7 = j6;
        j8 = j5;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource5 = mutableInteractionSource4;
        indication4 = indication3;
        z3 = z2;
        str3 = str2;
        role3 = role2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1178surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m172backgroundbw27NRU(ShadowKt.m1321shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1179surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        ComposerKt.sourceInformation(composer, "C(surfaceColorAtElevation)P(1:c#ui.graphics.Color,2,0:c#ui.unit.Dp)637@31177L6,638@31248L31:Surface.kt#jmzs0o");
        if (Color.m1629equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m980getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.mo1010apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        composer.endReplaceableGroup();
        return j;
    }
}
