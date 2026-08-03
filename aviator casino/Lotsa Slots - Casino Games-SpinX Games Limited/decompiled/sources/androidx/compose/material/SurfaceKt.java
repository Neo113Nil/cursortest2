package androidx.compose.material;

/* compiled from: Surface.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010'\u001a/\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
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
    public static final void m1511SurfaceFjzlyU(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.foundation.BorderStroke borderStroke, float f, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.graphics.Shape shape2;
        long j3;
        long j4;
        int i4;
        androidx.compose.foundation.BorderStroke borderStroke2;
        int i5;
        float f2;
        androidx.compose.ui.Modifier modifier2;
        long j5;
        long j6;
        androidx.compose.foundation.BorderStroke borderStroke3;
        final int i6;
        final long j7;
        final androidx.compose.foundation.BorderStroke borderStroke4;
        final float f3;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.ui.graphics.Shape shape3;
        final long j8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1412203386);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(5,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)106@5259L6,107@5301L22,*112@5476L7,113@5500L793:Surface.kt#jmzs0o");
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
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i10 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i11 != 0) {
                                shape2 = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                borderStroke2 = null;
                            }
                            if (i5 == 0) {
                                modifier2 = companion;
                                f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
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
                                final androidx.compose.ui.graphics.Shape shape4 = shape2;
                                startRestartGroup.endDefaults();
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume).m4492unboximpl() + f2);
                                final androidx.compose.ui.Modifier modifier4 = modifier2;
                                j7 = j5;
                                borderStroke4 = borderStroke3;
                                f3 = f2;
                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j6)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        invoke(composer2, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                        long m1518surfaceColorAtElevationcq6XJ1M;
                                        androidx.compose.ui.Modifier m1517surface8ww4TTg;
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.this;
                                            androidx.compose.ui.graphics.Shape shape5 = shape4;
                                            long j9 = j7;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume2 = composer2.consume(localElevationOverlay);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j9, (androidx.compose.material.ElevationOverlay) consume2, m4478constructorimpl, composer2, (i6 >> 6) & 14);
                                            m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(modifier5, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                                            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m1517surface8ww4TTg, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return kotlin.Unit.INSTANCE;
                                                }
                                            }), kotlin.Unit.INSTANCE, new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(null));
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                                            int i13 = i6;
                                            composer2.startReplaceableGroup(733328855);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume3 = composer2.consume(localDensity);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume4 = composer2.consume(localLayoutDirection);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume5 = composer2.consume(localViewConfiguration);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(pointerInput);
                                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            composer2.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-2137368960);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(1539610176);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                                            function2.invoke(composer2, java.lang.Integer.valueOf((i13 >> 18) & 14));
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
                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                        int label;

                                        AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2> continuation) {
                                            super(2, continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                            return new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                            return ((androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            if (this.label != 0) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            return kotlin.Unit.INSTANCE;
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
                        final androidx.compose.ui.graphics.Shape shape42 = shape2;
                        startRestartGroup.endDefaults();
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2).m4492unboximpl() + f2);
                        final androidx.compose.ui.Modifier modifier42 = modifier2;
                        j7 = j5;
                        borderStroke4 = borderStroke3;
                        f3 = f2;
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j6)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                long m1518surfaceColorAtElevationcq6XJ1M;
                                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.this;
                                    androidx.compose.ui.graphics.Shape shape5 = shape42;
                                    long j9 = j7;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume22 = composer2.consume(localElevationOverlay);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j9, (androidx.compose.material.ElevationOverlay) consume22, m4478constructorimpl2, composer2, (i6 >> 6) & 14);
                                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(modifier5, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                                    androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m1517surface8ww4TTg, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }), kotlin.Unit.INSTANCE, new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(null));
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                                    int i13 = i6;
                                    composer2.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = composer2.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = composer2.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume5 = composer2.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(pointerInput);
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-2137368960);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1539610176);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                                    function2.invoke(composer2, java.lang.Integer.valueOf((i13 >> 18) & 14));
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
                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                int label;

                                AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2> continuation) {
                                    super(2, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                    return new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                    return ((androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    return kotlin.Unit.INSTANCE;
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
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.ui.Modifier.this, shape3, j7, j8, borderStroke4, f3, content, composer2, i | 1, i2);
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
                final androidx.compose.ui.graphics.Shape shape422 = shape2;
                startRestartGroup.endDefaults();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation22 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4478constructorimpl22 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume22).m4492unboximpl() + f2);
                final androidx.compose.ui.Modifier modifier422 = modifier2;
                j7 = j5;
                borderStroke4 = borderStroke3;
                f3 = f2;
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j6)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                        long m1518surfaceColorAtElevationcq6XJ1M;
                        androidx.compose.ui.Modifier m1517surface8ww4TTg;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.this;
                            androidx.compose.ui.graphics.Shape shape5 = shape422;
                            long j9 = j7;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume222 = composer2.consume(localElevationOverlay);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j9, (androidx.compose.material.ElevationOverlay) consume222, m4478constructorimpl22, composer2, (i6 >> 6) & 14);
                            m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(modifier5, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m1517surface8ww4TTg, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return kotlin.Unit.INSTANCE;
                                }
                            }), kotlin.Unit.INSTANCE, new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(null));
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                            int i13 = i6;
                            composer2.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = composer2.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = composer2.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = composer2.consume(localViewConfiguration);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(pointerInput);
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1539610176);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                            function2.invoke(composer2, java.lang.Integer.valueOf((i13 >> 18) & 14));
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
                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        int label;

                        AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
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
            final androidx.compose.ui.graphics.Shape shape4222 = shape2;
            startRestartGroup.endDefaults();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4478constructorimpl222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume222).m4492unboximpl() + f2);
            final androidx.compose.ui.Modifier modifier4222 = modifier2;
            j7 = j5;
            borderStroke4 = borderStroke3;
            f3 = f2;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j6)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl222))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                    long m1518surfaceColorAtElevationcq6XJ1M;
                    androidx.compose.ui.Modifier m1517surface8ww4TTg;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                        androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.this;
                        androidx.compose.ui.graphics.Shape shape5 = shape4222;
                        long j9 = j7;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2222 = composer2.consume(localElevationOverlay);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j9, (androidx.compose.material.ElevationOverlay) consume2222, m4478constructorimpl222, composer2, (i6 >> 6) & 14);
                        m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(modifier5, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                        androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m1517surface8ww4TTg, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return kotlin.Unit.INSTANCE;
                            }
                        }), kotlin.Unit.INSTANCE, new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(null));
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                        int i13 = i6;
                        composer2.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = composer2.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume4 = composer2.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume5 = composer2.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(pointerInput);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1539610176);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                        function2.invoke(composer2, java.lang.Integer.valueOf((i13 >> 18) & 14));
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
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    int label;

                    AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
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
        final androidx.compose.ui.graphics.Shape shape42222 = shape2;
        startRestartGroup.endDefaults();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4478constructorimpl2222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2222).m4492unboximpl() + f2);
        final androidx.compose.ui.Modifier modifier42222 = modifier2;
        j7 = j5;
        borderStroke4 = borderStroke3;
        f3 = f2;
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j6)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2222))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                long m1518surfaceColorAtElevationcq6XJ1M;
                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                    androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.this;
                    androidx.compose.ui.graphics.Shape shape5 = shape42222;
                    long j9 = j7;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume22222 = composer2.consume(localElevationOverlay);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j9, (androidx.compose.material.ElevationOverlay) consume22222, m4478constructorimpl2222, composer2, (i6 >> 6) & 14);
                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(modifier5, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                    androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m1517surface8ww4TTg, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return kotlin.Unit.INSTANCE;
                        }
                    }), kotlin.Unit.INSTANCE, new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(null));
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                    int i13 = i6;
                    composer2.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume3 = composer2.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume4 = composer2.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = composer2.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(pointerInput);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-2137368960);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1539610176);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                    function2.invoke(composer2, java.lang.Integer.valueOf((i13 >> 18) & 14));
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
            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;

                AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.material.SurfaceKt$Surface$1.AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
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
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1512SurfaceLPr_se0(final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.foundation.BorderStroke borderStroke, float f, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        androidx.compose.ui.graphics.Shape shape2;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        long j4;
        long j5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        float f2;
        boolean z2;
        androidx.compose.ui.graphics.Shape shape3;
        long j6;
        long j7;
        androidx.compose.foundation.BorderStroke borderStroke2;
        final int i10;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final androidx.compose.ui.graphics.Shape shape4;
        final long j8;
        final long j9;
        final androidx.compose.foundation.BorderStroke borderStroke3;
        final float f3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        int i13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1560876237);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(8,7,5,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)213@10696L6,214@10738L22,217@10872L39,*220@11004L7,221@11028L1013:Surface.kt#jmzs0o");
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
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        i11 = (1879048192 & i) == 0 ? startRestartGroup.changed(content) ? 536870912 : 268435456 : 805306368;
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                boolean z4 = i4 != 0 ? true : z;
                                androidx.compose.ui.graphics.Shape rectangleShape = i5 != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : shape2;
                                if ((i2 & 16) != 0) {
                                    j4 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                    i3 &= -57345;
                                } else {
                                    j4 = j3;
                                }
                                if ((i2 & 32) != 0) {
                                    j5 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 12) & 14);
                                    i3 &= -458753;
                                } else {
                                    j5 = j2;
                                }
                                androidx.compose.foundation.BorderStroke borderStroke4 = i7 != 0 ? null : borderStroke;
                                float m4478constructorimpl = i8 != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                f2 = m4478constructorimpl;
                                z2 = z4;
                                shape3 = rectangleShape;
                                j6 = j4;
                                j7 = j5;
                                borderStroke2 = borderStroke4;
                                i10 = i3;
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
                                i10 = i3;
                                shape3 = shape2;
                                j6 = j3;
                            }
                            startRestartGroup.endDefaults();
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localAbsoluteElevation);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume).m4492unboximpl() + f2);
                            final androidx.compose.ui.Modifier modifier4 = modifier2;
                            final androidx.compose.ui.graphics.Shape shape5 = shape3;
                            final long j10 = j6;
                            final androidx.compose.foundation.BorderStroke borderStroke5 = borderStroke2;
                            final float f4 = f2;
                            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            final boolean z5 = z2;
                            composer2 = startRestartGroup;
                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                    invoke(composer3, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                    long m1518surfaceColorAtElevationcq6XJ1M;
                                    androidx.compose.ui.Modifier m1517surface8ww4TTg;
                                    androidx.compose.ui.Modifier m243clickableO2vRcR0;
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                        androidx.compose.ui.graphics.Shape shape6 = shape5;
                                        long j11 = j10;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume2 = composer3.consume(localElevationOverlay);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume2, m4478constructorimpl2, composer3, (i10 >> 12) & 14);
                                        m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape6, m1518surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                        m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m1517surface8ww4TTg, mutableInteractionSource4, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), (r14 & 4) != 0 ? true : z5, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                                        int i16 = i10;
                                        composer3.startReplaceableGroup(733328855);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                        composer3.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume3 = composer3.consume(localDensity);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m243clickableO2vRcR0);
                                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-390905273);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                                        function2.invoke(composer3, java.lang.Integer.valueOf((i16 >> 27) & 14));
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
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                invoke(composer3, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                androidx.compose.material.SurfaceKt.m1512SurfaceLPr_se0(onClick, modifier3, z3, shape4, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i11;
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
                    f2 = m4478constructorimpl;
                    z2 = z4;
                    shape3 = rectangleShape;
                    j6 = j4;
                    j7 = j5;
                    borderStroke2 = borderStroke4;
                    i10 = i3;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m4478constructorimpl22 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2).m4492unboximpl() + f2);
                    final androidx.compose.ui.Modifier modifier42 = modifier2;
                    final androidx.compose.ui.graphics.Shape shape52 = shape3;
                    final long j102 = j6;
                    final androidx.compose.foundation.BorderStroke borderStroke52 = borderStroke2;
                    final float f42 = f2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    final boolean z52 = z2;
                    composer2 = startRestartGroup;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                            long m1518surfaceColorAtElevationcq6XJ1M;
                            androidx.compose.ui.Modifier m1517surface8ww4TTg;
                            androidx.compose.ui.Modifier m243clickableO2vRcR0;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                androidx.compose.ui.graphics.Shape shape6 = shape52;
                                long j11 = j102;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume22 = composer3.consume(localElevationOverlay);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume22, m4478constructorimpl22, composer3, (i10 >> 12) & 14);
                                m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape6, m1518surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m1517surface8ww4TTg, mutableInteractionSource42, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), (r14 & 4) != 0 ? true : z52, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                                int i16 = i10;
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = composer3.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m243clickableO2vRcR0);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-390905273);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                                function2.invoke(composer3, java.lang.Integer.valueOf((i16 >> 27) & 14));
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
                i3 |= i11;
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
                f2 = m4478constructorimpl;
                z2 = z4;
                shape3 = rectangleShape;
                j6 = j4;
                j7 = j5;
                borderStroke2 = borderStroke4;
                i10 = i3;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation22 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4478constructorimpl222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume22).m4492unboximpl() + f2);
                final androidx.compose.ui.Modifier modifier422 = modifier2;
                final androidx.compose.ui.graphics.Shape shape522 = shape3;
                final long j1022 = j6;
                final androidx.compose.foundation.BorderStroke borderStroke522 = borderStroke2;
                final float f422 = f2;
                final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                final boolean z522 = z2;
                composer2 = startRestartGroup;
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl222))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        invoke(composer3, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                        long m1518surfaceColorAtElevationcq6XJ1M;
                        androidx.compose.ui.Modifier m1517surface8ww4TTg;
                        androidx.compose.ui.Modifier m243clickableO2vRcR0;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                            androidx.compose.ui.graphics.Shape shape6 = shape522;
                            long j11 = j1022;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume222 = composer3.consume(localElevationOverlay);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume222, m4478constructorimpl222, composer3, (i10 >> 12) & 14);
                            m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape6, m1518surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                            m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m1517surface8ww4TTg, mutableInteractionSource422, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), (r14 & 4) != 0 ? true : z522, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                            int i16 = i10;
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = composer3.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m243clickableO2vRcR0);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-390905273);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                            function2.invoke(composer3, java.lang.Integer.valueOf((i16 >> 27) & 14));
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
            i3 |= i11;
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
            f2 = m4478constructorimpl;
            z2 = z4;
            shape3 = rectangleShape;
            j6 = j4;
            j7 = j5;
            borderStroke2 = borderStroke4;
            i10 = i3;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4478constructorimpl2222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume222).m4492unboximpl() + f2);
            final androidx.compose.ui.Modifier modifier4222 = modifier2;
            final androidx.compose.ui.graphics.Shape shape5222 = shape3;
            final long j10222 = j6;
            final androidx.compose.foundation.BorderStroke borderStroke5222 = borderStroke2;
            final float f4222 = f2;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            final boolean z5222 = z2;
            composer2 = startRestartGroup;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2222))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                    long m1518surfaceColorAtElevationcq6XJ1M;
                    androidx.compose.ui.Modifier m1517surface8ww4TTg;
                    androidx.compose.ui.Modifier m243clickableO2vRcR0;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                        androidx.compose.ui.graphics.Shape shape6 = shape5222;
                        long j11 = j10222;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2222 = composer3.consume(localElevationOverlay);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume2222, m4478constructorimpl2222, composer3, (i10 >> 12) & 14);
                        m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape6, m1518surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                        m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m1517surface8ww4TTg, mutableInteractionSource4222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), (r14 & 4) != 0 ? true : z5222, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                        int i16 = i10;
                        composer3.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = composer3.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m243clickableO2vRcR0);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-390905273);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                        function2.invoke(composer3, java.lang.Integer.valueOf((i16 >> 27) & 14));
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
        i3 |= i11;
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
        f2 = m4478constructorimpl;
        z2 = z4;
        shape3 = rectangleShape;
        j6 = j4;
        j7 = j5;
        borderStroke2 = borderStroke4;
        i10 = i3;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4478constructorimpl22222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2222).m4492unboximpl() + f2);
        final androidx.compose.ui.Modifier modifier42222 = modifier2;
        final androidx.compose.ui.graphics.Shape shape52222 = shape3;
        final long j102222 = j6;
        final androidx.compose.foundation.BorderStroke borderStroke52222 = borderStroke2;
        final float f42222 = f2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        final boolean z52222 = z2;
        composer2 = startRestartGroup;
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22222))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                invoke(composer3, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                long m1518surfaceColorAtElevationcq6XJ1M;
                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                androidx.compose.ui.Modifier m243clickableO2vRcR0;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                    androidx.compose.ui.graphics.Shape shape6 = shape52222;
                    long j11 = j102222;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume22222 = composer3.consume(localElevationOverlay);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume22222, m4478constructorimpl22222, composer3, (i10 >> 12) & 14);
                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape6, m1518surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                    m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m1517surface8ww4TTg, mutableInteractionSource42222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), (r14 & 4) != 0 ? true : z52222, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                    int i16 = i10;
                    composer3.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume3 = composer3.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m243clickableO2vRcR0);
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-390905273);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C247@12016L9:Surface.kt#jmzs0o");
                    function2.invoke(composer3, java.lang.Integer.valueOf((i16 >> 27) & 14));
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
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1513SurfaceNy5ogXk(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.foundation.BorderStroke borderStroke, float f, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
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
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.BorderStroke borderStroke2;
        float f2;
        androidx.compose.ui.Modifier modifier2;
        long j6;
        androidx.compose.ui.graphics.Shape shape2;
        long j7;
        final int i12;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z5;
        final androidx.compose.ui.graphics.Shape shape3;
        final long j8;
        final long j9;
        final androidx.compose.foundation.BorderStroke borderStroke3;
        final float f3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(262027249);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,7,5,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)329@16529L6,330@16571L22,333@16705L39,*336@16837L7,337@16861L1052:Surface.kt#jmzs0o");
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
                            i4 |= startRestartGroup.changed(f) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            i4 |= 805306368;
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
                                        androidx.compose.ui.Modifier.Companion companion = i13 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                        boolean z6 = i5 == 0 ? true : z2;
                                        androidx.compose.ui.graphics.Shape rectangleShape = i6 == 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : shape;
                                        if ((i3 & 32) == 0) {
                                            i4 &= -458753;
                                            z3 = z6;
                                            j4 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                        } else {
                                            z3 = z6;
                                            j4 = j;
                                        }
                                        if ((i3 & 64) == 0) {
                                            j5 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        } else {
                                            j5 = j3;
                                        }
                                        androidx.compose.foundation.BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                        float m4478constructorimpl = i8 == 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f;
                                        if (i9 == 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            z4 = z3;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4478constructorimpl;
                                            modifier2 = companion;
                                            mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                        } else {
                                            z4 = z3;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4478constructorimpl;
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
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume).m4492unboximpl() + f2);
                                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2))};
                                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                                    final androidx.compose.ui.graphics.Shape shape4 = shape2;
                                    final long j10 = j6;
                                    final androidx.compose.foundation.BorderStroke borderStroke5 = borderStroke2;
                                    final float f4 = f2;
                                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final boolean z7 = z4;
                                    final int i14 = i10;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                            invoke(composer3, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                            long m1518surfaceColorAtElevationcq6XJ1M;
                                            androidx.compose.ui.Modifier m1517surface8ww4TTg;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                                androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                                androidx.compose.ui.graphics.Shape shape5 = shape4;
                                                long j11 = j10;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume2 = composer3.consume(localElevationOverlay);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume2, m4478constructorimpl2, composer3, (i12 >> 15) & 14);
                                                m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                                androidx.compose.ui.Modifier m817selectableO2vRcR0 = androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource4, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick);
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = content;
                                                int i16 = i14;
                                                composer3.startReplaceableGroup(733328855);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume3 = composer3.consume(localDensity);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m817selectableO2vRcR0);
                                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-2137368960);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(23612267);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                                function22.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function2), composer2, 56);
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
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$8
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                        invoke(composer3, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                        androidx.compose.material.SurfaceKt.m1513SurfaceNy5ogXk(z, onClick, modifier3, z5, shape3, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
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
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4478constructorimpl22 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2).m4492unboximpl() + f2);
                        androidx.compose.runtime.ProvidedValue[] providedValueArr2 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22))};
                        final androidx.compose.ui.Modifier modifier42 = modifier2;
                        final androidx.compose.ui.graphics.Shape shape42 = shape2;
                        final long j102 = j6;
                        final androidx.compose.foundation.BorderStroke borderStroke52 = borderStroke2;
                        final float f42 = f2;
                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        final boolean z72 = z4;
                        final int i142 = i10;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                invoke(composer3, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                long m1518surfaceColorAtElevationcq6XJ1M;
                                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                    androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                    androidx.compose.ui.graphics.Shape shape5 = shape42;
                                    long j11 = j102;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume22 = composer3.consume(localElevationOverlay);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume22, m4478constructorimpl22, composer3, (i12 >> 15) & 14);
                                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                    androidx.compose.ui.Modifier m817selectableO2vRcR0 = androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource42, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick);
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = content;
                                    int i16 = i142;
                                    composer3.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = composer3.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m817selectableO2vRcR0);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(23612267);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                    function222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function22), composer2, 56);
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
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation22 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m4478constructorimpl222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume22).m4492unboximpl() + f2);
                    androidx.compose.runtime.ProvidedValue[] providedValueArr22 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl222))};
                    final androidx.compose.ui.Modifier modifier422 = modifier2;
                    final androidx.compose.ui.graphics.Shape shape422 = shape2;
                    final long j1022 = j6;
                    final androidx.compose.foundation.BorderStroke borderStroke522 = borderStroke2;
                    final float f422 = f2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    final boolean z722 = z4;
                    final int i1422 = i10;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                            long m1518surfaceColorAtElevationcq6XJ1M;
                            androidx.compose.ui.Modifier m1517surface8ww4TTg;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                androidx.compose.ui.graphics.Shape shape5 = shape422;
                                long j11 = j1022;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume222 = composer3.consume(localElevationOverlay);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume222, m4478constructorimpl222, composer3, (i12 >> 15) & 14);
                                m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                                androidx.compose.ui.Modifier m817selectableO2vRcR0 = androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource422, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick);
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222 = content;
                                int i16 = i1422;
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = composer3.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m817selectableO2vRcR0);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(23612267);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                function2222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr22, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function222), composer2, 56);
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
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4478constructorimpl2222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume222).m4492unboximpl() + f2);
                androidx.compose.runtime.ProvidedValue[] providedValueArr222 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2222))};
                final androidx.compose.ui.Modifier modifier4222 = modifier2;
                final androidx.compose.ui.graphics.Shape shape4222 = shape2;
                final long j10222 = j6;
                final androidx.compose.foundation.BorderStroke borderStroke5222 = borderStroke2;
                final float f4222 = f2;
                final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                final boolean z7222 = z4;
                final int i14222 = i10;
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        invoke(composer3, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                        long m1518surfaceColorAtElevationcq6XJ1M;
                        androidx.compose.ui.Modifier m1517surface8ww4TTg;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                            androidx.compose.ui.graphics.Shape shape5 = shape4222;
                            long j11 = j10222;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume2222 = composer3.consume(localElevationOverlay);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume2222, m4478constructorimpl2222, composer3, (i12 >> 15) & 14);
                            m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                            androidx.compose.ui.Modifier m817selectableO2vRcR0 = androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource4222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7222, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22222 = content;
                            int i16 = i14222;
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = composer3.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m817selectableO2vRcR0);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(23612267);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                            function22222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function2222), composer2, 56);
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
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4478constructorimpl22222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2222).m4492unboximpl() + f2);
            androidx.compose.runtime.ProvidedValue[] providedValueArr2222 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22222))};
            final androidx.compose.ui.Modifier modifier42222 = modifier2;
            final androidx.compose.ui.graphics.Shape shape42222 = shape2;
            final long j102222 = j6;
            final androidx.compose.foundation.BorderStroke borderStroke52222 = borderStroke2;
            final float f42222 = f2;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            final boolean z72222 = z4;
            final int i142222 = i10;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                    long m1518surfaceColorAtElevationcq6XJ1M;
                    androidx.compose.ui.Modifier m1517surface8ww4TTg;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                        androidx.compose.ui.graphics.Shape shape5 = shape42222;
                        long j11 = j102222;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume22222 = composer3.consume(localElevationOverlay);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume22222, m4478constructorimpl22222, composer3, (i12 >> 15) & 14);
                        m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                        androidx.compose.ui.Modifier m817selectableO2vRcR0 = androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource42222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72222, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222222 = content;
                        int i16 = i142222;
                        composer3.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = composer3.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m817selectableO2vRcR0);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(23612267);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                        function222222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr2222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function22222), composer2, 56);
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
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation22222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22222 = startRestartGroup.consume(localAbsoluteElevation22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4478constructorimpl222222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume22222).m4492unboximpl() + f2);
        androidx.compose.runtime.ProvidedValue[] providedValueArr22222 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl222222))};
        final androidx.compose.ui.Modifier modifier422222 = modifier2;
        final androidx.compose.ui.graphics.Shape shape422222 = shape2;
        final long j1022222 = j6;
        final androidx.compose.foundation.BorderStroke borderStroke522222 = borderStroke2;
        final float f422222 = f2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        final boolean z722222 = z4;
        final int i1422222 = i10;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                invoke(composer3, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                long m1518surfaceColorAtElevationcq6XJ1M;
                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                    androidx.compose.ui.graphics.Shape shape5 = shape422222;
                    long j11 = j1022222;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume222222 = composer3.consume(localElevationOverlay);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume222222, m4478constructorimpl222222, composer3, (i12 >> 15) & 14);
                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke522222, f422222);
                    androidx.compose.ui.Modifier m817selectableO2vRcR0 = androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource422222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722222, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick);
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222222 = content;
                    int i16 = i1422222;
                    composer3.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume3 = composer3.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m817selectableO2vRcR0);
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(23612267);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                    function2222222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr22222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function222222), composer2, 56);
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
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1514SurfaceNy5ogXk(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.foundation.BorderStroke borderStroke, float f, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
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
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.BorderStroke borderStroke2;
        float f2;
        androidx.compose.ui.Modifier modifier2;
        long j6;
        androidx.compose.ui.graphics.Shape shape2;
        long j7;
        final int i12;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z5;
        final androidx.compose.ui.graphics.Shape shape3;
        final long j8;
        final long j9;
        final androidx.compose.foundation.BorderStroke borderStroke3;
        final float f3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1341569296);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(1,9,8,6,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color!1,5:c#ui.unit.Dp,7)446@22479L6,447@22521L22,450@22655L39,*453@22787L7,454@22811L1065:Surface.kt#jmzs0o");
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
                            i4 |= startRestartGroup.changed(f) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            i4 |= 805306368;
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
                                        androidx.compose.ui.Modifier.Companion companion = i13 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                        boolean z6 = i5 == 0 ? true : z2;
                                        androidx.compose.ui.graphics.Shape rectangleShape = i6 == 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : shape;
                                        if ((i3 & 32) == 0) {
                                            i4 &= -458753;
                                            z3 = z6;
                                            j4 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                        } else {
                                            z3 = z6;
                                            j4 = j;
                                        }
                                        if ((i3 & 64) == 0) {
                                            j5 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        } else {
                                            j5 = j3;
                                        }
                                        androidx.compose.foundation.BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                        float m4478constructorimpl = i8 == 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f;
                                        if (i9 == 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            z4 = z3;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4478constructorimpl;
                                            modifier2 = companion;
                                            mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                        } else {
                                            z4 = z3;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4478constructorimpl;
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
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume).m4492unboximpl() + f2);
                                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2))};
                                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                                    final androidx.compose.ui.graphics.Shape shape4 = shape2;
                                    final long j10 = j6;
                                    final androidx.compose.foundation.BorderStroke borderStroke5 = borderStroke2;
                                    final float f4 = f2;
                                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final boolean z7 = z4;
                                    final int i14 = i10;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                            invoke(composer3, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                            long m1518surfaceColorAtElevationcq6XJ1M;
                                            androidx.compose.ui.Modifier m1517surface8ww4TTg;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                                androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                                androidx.compose.ui.graphics.Shape shape5 = shape4;
                                                long j11 = j10;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume2 = composer3.consume(localElevationOverlay);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume2, m4478constructorimpl2, composer3, (i12 >> 15) & 14);
                                                m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                                androidx.compose.ui.Modifier m821toggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource4, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c()), onCheckedChange);
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = content;
                                                int i16 = i14;
                                                composer3.startReplaceableGroup(733328855);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume3 = composer3.consume(localDensity);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m821toggleableO2vRcR0);
                                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-2137368960);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(1103154314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                                function22.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -311657392, true, function2), composer2, 56);
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
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$11
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                        invoke(composer3, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                        androidx.compose.material.SurfaceKt.m1514SurfaceNy5ogXk(z, onCheckedChange, modifier3, z5, shape3, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
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
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4478constructorimpl22 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2).m4492unboximpl() + f2);
                        androidx.compose.runtime.ProvidedValue[] providedValueArr2 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22))};
                        final androidx.compose.ui.Modifier modifier42 = modifier2;
                        final androidx.compose.ui.graphics.Shape shape42 = shape2;
                        final long j102 = j6;
                        final androidx.compose.foundation.BorderStroke borderStroke52 = borderStroke2;
                        final float f42 = f2;
                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        final boolean z72 = z4;
                        final int i142 = i10;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                invoke(composer3, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                long m1518surfaceColorAtElevationcq6XJ1M;
                                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                    androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                    androidx.compose.ui.graphics.Shape shape5 = shape42;
                                    long j11 = j102;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume22 = composer3.consume(localElevationOverlay);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume22, m4478constructorimpl22, composer3, (i12 >> 15) & 14);
                                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                    androidx.compose.ui.Modifier m821toggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource42, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c()), onCheckedChange);
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = content;
                                    int i16 = i142;
                                    composer3.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = composer3.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m821toggleableO2vRcR0);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(1103154314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                    function222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -311657392, true, function22), composer2, 56);
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
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation22 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m4478constructorimpl222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume22).m4492unboximpl() + f2);
                    androidx.compose.runtime.ProvidedValue[] providedValueArr22 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl222))};
                    final androidx.compose.ui.Modifier modifier422 = modifier2;
                    final androidx.compose.ui.graphics.Shape shape422 = shape2;
                    final long j1022 = j6;
                    final androidx.compose.foundation.BorderStroke borderStroke522 = borderStroke2;
                    final float f422 = f2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    final boolean z722 = z4;
                    final int i1422 = i10;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                            long m1518surfaceColorAtElevationcq6XJ1M;
                            androidx.compose.ui.Modifier m1517surface8ww4TTg;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                androidx.compose.ui.graphics.Shape shape5 = shape422;
                                long j11 = j1022;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume222 = composer3.consume(localElevationOverlay);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume222, m4478constructorimpl222, composer3, (i12 >> 15) & 14);
                                m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                                androidx.compose.ui.Modifier m821toggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource422, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c()), onCheckedChange);
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222 = content;
                                int i16 = i1422;
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = composer3.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m821toggleableO2vRcR0);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(1103154314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                function2222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr22, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -311657392, true, function222), composer2, 56);
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
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4478constructorimpl2222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume222).m4492unboximpl() + f2);
                androidx.compose.runtime.ProvidedValue[] providedValueArr222 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2222))};
                final androidx.compose.ui.Modifier modifier4222 = modifier2;
                final androidx.compose.ui.graphics.Shape shape4222 = shape2;
                final long j10222 = j6;
                final androidx.compose.foundation.BorderStroke borderStroke5222 = borderStroke2;
                final float f4222 = f2;
                final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                final boolean z7222 = z4;
                final int i14222 = i10;
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        invoke(composer3, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                        long m1518surfaceColorAtElevationcq6XJ1M;
                        androidx.compose.ui.Modifier m1517surface8ww4TTg;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                            androidx.compose.ui.graphics.Shape shape5 = shape4222;
                            long j11 = j10222;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume2222 = composer3.consume(localElevationOverlay);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume2222, m4478constructorimpl2222, composer3, (i12 >> 15) & 14);
                            m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                            androidx.compose.ui.Modifier m821toggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource4222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z7222, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c()), onCheckedChange);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22222 = content;
                            int i16 = i14222;
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = composer3.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m821toggleableO2vRcR0);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(1103154314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                            function22222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -311657392, true, function2222), composer2, 56);
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
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4478constructorimpl22222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2222).m4492unboximpl() + f2);
            androidx.compose.runtime.ProvidedValue[] providedValueArr2222 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22222))};
            final androidx.compose.ui.Modifier modifier42222 = modifier2;
            final androidx.compose.ui.graphics.Shape shape42222 = shape2;
            final long j102222 = j6;
            final androidx.compose.foundation.BorderStroke borderStroke52222 = borderStroke2;
            final float f42222 = f2;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            final boolean z72222 = z4;
            final int i142222 = i10;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                    long m1518surfaceColorAtElevationcq6XJ1M;
                    androidx.compose.ui.Modifier m1517surface8ww4TTg;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                        androidx.compose.ui.graphics.Shape shape5 = shape42222;
                        long j11 = j102222;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume22222 = composer3.consume(localElevationOverlay);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume22222, m4478constructorimpl22222, composer3, (i12 >> 15) & 14);
                        m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                        androidx.compose.ui.Modifier m821toggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource42222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z72222, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c()), onCheckedChange);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222222 = content;
                        int i16 = i142222;
                        composer3.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = composer3.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m821toggleableO2vRcR0);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(1103154314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                        function222222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr2222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -311657392, true, function22222), composer2, 56);
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
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation22222 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22222 = startRestartGroup.consume(localAbsoluteElevation22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4478constructorimpl222222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume22222).m4492unboximpl() + f2);
        androidx.compose.runtime.ProvidedValue[] providedValueArr22222 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j7)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl222222))};
        final androidx.compose.ui.Modifier modifier422222 = modifier2;
        final androidx.compose.ui.graphics.Shape shape422222 = shape2;
        final long j1022222 = j6;
        final androidx.compose.foundation.BorderStroke borderStroke522222 = borderStroke2;
        final float f422222 = f2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        final boolean z722222 = z4;
        final int i1422222 = i10;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                invoke(composer3, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                long m1518surfaceColorAtElevationcq6XJ1M;
                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                    androidx.compose.ui.graphics.Shape shape5 = shape422222;
                    long j11 = j1022222;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume222222 = composer3.consume(localElevationOverlay);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j11, (androidx.compose.material.ElevationOverlay) consume222222, m4478constructorimpl222222, composer3, (i12 >> 15) & 14);
                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke522222, f422222);
                    androidx.compose.ui.Modifier m821toggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(m1517surface8ww4TTg, z, mutableInteractionSource422222, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z722222, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c()), onCheckedChange);
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222222 = content;
                    int i16 = i1422222;
                    composer3.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume3 = composer3.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m821toggleableO2vRcR0);
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(1103154314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                    function2222222.invoke(composer3, java.lang.Integer.valueOf(i16 & 14));
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
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr22222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -311657392, true, function222222), composer2, 56);
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
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @kotlin.ReplaceWith(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: Surface-9VG74zQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1510Surface9VG74zQ(final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.foundation.BorderStroke borderStroke, float f, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
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
        androidx.compose.ui.Modifier modifier2;
        long j4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.foundation.Indication indication2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.BorderStroke borderStroke2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.ui.semantics.Role role2;
        final int i14;
        boolean z2;
        androidx.compose.foundation.Indication indication3;
        float f2;
        java.lang.String str2;
        androidx.compose.ui.graphics.Shape shape2;
        long j5;
        long j6;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
        final androidx.compose.ui.graphics.Shape shape3;
        final long j7;
        final long j8;
        final androidx.compose.foundation.BorderStroke borderStroke3;
        final float f3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final androidx.compose.foundation.Indication indication4;
        final boolean z3;
        final java.lang.String str3;
        final androidx.compose.ui.semantics.Role role3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i15;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1585925488);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,12,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,7,6,5,10,11:c#ui.semantics.Role)575@29078L6,576@29120L22,579@29254L39,580@29341L7,*586@29528L7,587@29552L1119:Surface.kt#jmzs0o");
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
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                        i15 = androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i4 |= i15;
                    }
                    i15 = 33554432;
                    i4 |= i15;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
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
                        androidx.compose.ui.Modifier.Companion companion = i16 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        androidx.compose.ui.graphics.Shape rectangleShape = i5 != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : shape;
                        if ((i3 & 8) != 0) {
                            j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                            i4 &= -7169;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & 16) != 0) {
                            modifier2 = companion;
                            j4 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 9) & 14);
                            i4 &= -57345;
                        } else {
                            modifier2 = companion;
                            j4 = j2;
                        }
                        androidx.compose.foundation.BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                        float m4478constructorimpl = i7 != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f;
                        if (i8 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.Indication> localIndication = androidx.compose.foundation.IndicationKt.getLocalIndication();
                            mutableInteractionSource3 = mutableInteractionSource2;
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localIndication);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            indication2 = (androidx.compose.foundation.Indication) consume;
                            i4 &= -234881025;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            indication2 = indication;
                        }
                        boolean z4 = i9 != 0 ? true : z;
                        java.lang.String str4 = i10 != 0 ? null : str;
                        modifier3 = modifier2;
                        borderStroke2 = borderStroke4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        if (i12 != 0) {
                            i14 = i4;
                            z2 = z4;
                            indication3 = indication2;
                            f2 = m4478constructorimpl;
                            str2 = str4;
                            shape2 = rectangleShape;
                            j5 = j4;
                            role2 = null;
                        } else {
                            role2 = role;
                            i14 = i4;
                            z2 = z4;
                            indication3 = indication2;
                            f2 = m4478constructorimpl;
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
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume2 = startRestartGroup.consume(localAbsoluteElevation);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume2).m4492unboximpl() + f2);
                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j5)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl2))};
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    final androidx.compose.ui.graphics.Shape shape4 = shape2;
                    final long j9 = j6;
                    final androidx.compose.foundation.BorderStroke borderStroke5 = borderStroke2;
                    final float f4 = f2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final androidx.compose.foundation.Indication indication5 = indication3;
                    final boolean z5 = z2;
                    final java.lang.String str5 = str2;
                    final androidx.compose.ui.semantics.Role role4 = role2;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i18) {
                            long m1518surfaceColorAtElevationcq6XJ1M;
                            androidx.compose.ui.Modifier m1517surface8ww4TTg;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                            if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                                androidx.compose.ui.graphics.Shape shape5 = shape4;
                                long j10 = j9;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = composer3.consume(localElevationOverlay);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j10, (androidx.compose.material.ElevationOverlay) consume3, m4478constructorimpl2, composer3, (i14 >> 9) & 14);
                                m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                androidx.compose.ui.Modifier then = m1517surface8ww4TTg.then(androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource6, indication5, z5, str5, role4, onClick));
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = content;
                                int i19 = i13;
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer3.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer3.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume5;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume6 = composer3.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(then);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-1300719946);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                                function22.invoke(composer3, java.lang.Integer.valueOf((i19 >> 6) & 14));
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
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 149594672, true, function2), composer2, 56);
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
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        invoke(composer3, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i18) {
                        androidx.compose.material.SurfaceKt.m1510Surface9VG74zQ(onClick, modifier4, shape3, j7, j8, borderStroke3, f3, mutableInteractionSource5, indication4, z3, str3, role3, content, composer3, i | 1, i2, i3);
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
            androidx.compose.foundation.BorderStroke borderStroke42 = i6 != 0 ? null : borderStroke;
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
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation2 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22 = startRestartGroup.consume(localAbsoluteElevation2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4478constructorimpl22 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume22).m4492unboximpl() + f2);
            androidx.compose.runtime.ProvidedValue[] providedValueArr2 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j5)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl22))};
            final androidx.compose.ui.Modifier modifier52 = modifier3;
            final androidx.compose.ui.graphics.Shape shape42 = shape2;
            final long j92 = j6;
            final androidx.compose.foundation.BorderStroke borderStroke52 = borderStroke2;
            final float f42 = f2;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final androidx.compose.foundation.Indication indication52 = indication3;
            final boolean z52 = z2;
            final java.lang.String str52 = str2;
            final androidx.compose.ui.semantics.Role role42 = role2;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i18) {
                    long m1518surfaceColorAtElevationcq6XJ1M;
                    androidx.compose.ui.Modifier m1517surface8ww4TTg;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                    if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                        androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                        androidx.compose.ui.graphics.Shape shape5 = shape42;
                        long j10 = j92;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = composer3.consume(localElevationOverlay);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j10, (androidx.compose.material.ElevationOverlay) consume3, m4478constructorimpl22, composer3, (i14 >> 9) & 14);
                        m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                        androidx.compose.ui.Modifier then = m1517surface8ww4TTg.then(androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource62, indication52, z52, str52, role42, onClick));
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = content;
                        int i19 = i13;
                        composer3.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume4 = composer3.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume5 = composer3.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume5;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume6 = composer3.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(then);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-1300719946);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                        function222.invoke(composer3, java.lang.Integer.valueOf((i19 >> 6) & 14));
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
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 149594672, true, function22), composer2, 56);
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
        androidx.compose.foundation.BorderStroke borderStroke422 = i6 != 0 ? null : borderStroke;
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
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> localAbsoluteElevation22 = androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222 = startRestartGroup.consume(localAbsoluteElevation22);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4478constructorimpl222 = androidx.compose.ui.unit.Dp.m4478constructorimpl(((androidx.compose.ui.unit.Dp) consume222).m4492unboximpl() + f2);
        androidx.compose.runtime.ProvidedValue[] providedValueArr22 = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j5)), androidx.compose.material.ElevationOverlayKt.getLocalAbsoluteElevation().provides(androidx.compose.ui.unit.Dp.m4476boximpl(m4478constructorimpl222))};
        final androidx.compose.ui.Modifier modifier522 = modifier3;
        final androidx.compose.ui.graphics.Shape shape422 = shape2;
        final long j922 = j6;
        final androidx.compose.foundation.BorderStroke borderStroke522 = borderStroke2;
        final float f422 = f2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final androidx.compose.foundation.Indication indication522 = indication3;
        final boolean z522 = z2;
        final java.lang.String str522 = str2;
        final androidx.compose.ui.semantics.Role role422 = role2;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                invoke(composer3, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer3, int i18) {
                long m1518surfaceColorAtElevationcq6XJ1M;
                androidx.compose.ui.Modifier m1517surface8ww4TTg;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                    androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(androidx.compose.ui.Modifier.this);
                    androidx.compose.ui.graphics.Shape shape5 = shape422;
                    long j10 = j922;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> localElevationOverlay = androidx.compose.material.ElevationOverlayKt.getLocalElevationOverlay();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume3 = composer3.consume(localElevationOverlay);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1518surfaceColorAtElevationcq6XJ1M = androidx.compose.material.SurfaceKt.m1518surfaceColorAtElevationcq6XJ1M(j10, (androidx.compose.material.ElevationOverlay) consume3, m4478constructorimpl222, composer3, (i14 >> 9) & 14);
                    m1517surface8ww4TTg = androidx.compose.material.SurfaceKt.m1517surface8ww4TTg(minimumTouchTargetSize, shape5, m1518surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                    androidx.compose.ui.Modifier then = m1517surface8ww4TTg.then(androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource622, indication522, z522, str522, role422, onClick));
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222 = content;
                    int i19 = i13;
                    composer3.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume4 = composer3.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume4;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = composer3.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume5;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume6 = composer3.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(then);
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1300719946);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                    function2222.invoke(composer3, java.lang.Integer.valueOf((i19 >> 6) & 14));
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
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr22, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 149594672, true, function222), composer2, 56);
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
    public static final androidx.compose.ui.Modifier m1517surface8ww4TTg(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, long j, androidx.compose.foundation.BorderStroke borderStroke, float f) {
        return androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ShadowKt.m1784shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? androidx.compose.foundation.BorderKt.border(androidx.compose.ui.Modifier.INSTANCE, borderStroke, shape) : androidx.compose.ui.Modifier.INSTANCE), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1518surfaceColorAtElevationcq6XJ1M(long j, androidx.compose.material.ElevationOverlay elevationOverlay, float f, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(surfaceColorAtElevation)P(1:c#ui.graphics.Color,2,0:c#ui.unit.Dp)637@31177L6,638@31248L31:Surface.kt#jmzs0o");
        if (androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.mo1349apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        composer.endReplaceableGroup();
        return j;
    }
}
