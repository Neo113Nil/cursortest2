package coil.compose;

/* compiled from: utils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0001\u001aX\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nH\u0001\u001a\u0016\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u001aH\u0001\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u0007H\u0001\u001a\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\u001fH\u0001¢\u0006\u0004\b \u0010!\u001a\u001b\u0010\"\u001a\u00020#*\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020#*\u00020\u001f2\u0006\u0010(\u001a\u00020#H\u0000¢\u0006\u0004\b)\u0010&\u001a\u001b\u0010*\u001a\u00020#*\u00020#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020#0,H\u0080\b\u001a\u0013\u0010-\u001a\u00020.*\u00020/H\u0000¢\u0006\u0004\b0\u00101\"\u0018\u00102\u001a\u000203*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0016\u00106\u001a\u00020\u001fX\u0080\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020;X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"requestOf", "Lcoil/request/ImageRequest;", "model", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "requestOfWithSizeResolver", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Ljava/lang/Object;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "transformOf", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onStateOf", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "contentDescription", "Landroidx/compose/ui/Modifier;", "", "toScale", "Lcoil/size/Scale;", "toSizeOrNull", "Lcoil/size/Size;", "Landroidx/compose/ui/unit/Constraints;", "toSizeOrNull-BRTryo0", "(J)Lcoil/size/Size;", "constrainWidth", "", "width", "constrainWidth-K40F9xA", "(JF)F", "constrainHeight", "height", "constrainHeight-K40F9xA", "takeOrElse", "block", "Lkotlin/Function0;", "toIntSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "toIntSize-uvyYCjk", "(J)J", "isPositive", "", "isPositive-uvyYCjk", "(J)Z", "ZeroConstraints", "getZeroConstraints", "()J", "J", "OriginalSizeResolver", "Lcoil/size/SizeResolver;", "getOriginalSizeResolver", "()Lcoil/size/SizeResolver;", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UtilsKt {
    private static final long ZeroConstraints = androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(0, 0);
    private static final coil.size.SizeResolver OriginalSizeResolver = coil.size.SizeResolvers.create(coil.size.Size.ORIGINAL);

    public static final coil.request.ImageRequest requestOf(java.lang.Object obj, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1087186730);
        if (obj instanceof coil.request.ImageRequest) {
            coil.request.ImageRequest imageRequest = (coil.request.ImageRequest) obj;
            composer.endReplaceableGroup();
            return imageRequest;
        }
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        android.content.Context context = (android.content.Context) consume;
        composer.startReplaceableGroup(-1245195153);
        boolean changed = composer.changed(context) | composer.changed(obj);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new coil.request.ImageRequest.Builder(context).data(obj).build();
            composer.updateRememberedValue(rememberedValue);
        }
        coil.request.ImageRequest imageRequest2 = (coil.request.ImageRequest) rememberedValue;
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return imageRequest2;
    }

    public static final coil.request.ImageRequest requestOfWithSizeResolver(java.lang.Object obj, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.runtime.Composer composer, int i) {
        coil.compose.ConstraintsSizeResolver constraintsSizeResolver;
        composer.startReplaceableGroup(1677680258);
        boolean z = obj instanceof coil.request.ImageRequest;
        if (z) {
            coil.request.ImageRequest imageRequest = (coil.request.ImageRequest) obj;
            if (imageRequest.getDefined().getSizeResolver() != null) {
                composer.endReplaceableGroup();
                return imageRequest;
            }
        }
        composer.startReplaceableGroup(408306591);
        if (kotlin.jvm.internal.Intrinsics.areEqual(contentScale, androidx.compose.ui.layout.ContentScale.INSTANCE.getNone())) {
            constraintsSizeResolver = OriginalSizeResolver;
        } else {
            composer.startReplaceableGroup(408309406);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new coil.compose.ConstraintsSizeResolver();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            constraintsSizeResolver = (coil.compose.ConstraintsSizeResolver) rememberedValue;
        }
        composer.endReplaceableGroup();
        if (z) {
            composer.startReplaceableGroup(-227230258);
            coil.request.ImageRequest imageRequest2 = (coil.request.ImageRequest) obj;
            composer.startReplaceableGroup(408312509);
            boolean changed = composer.changed(imageRequest2) | composer.changed(constraintsSizeResolver);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = coil.request.ImageRequest.newBuilder$default(imageRequest2, null, 1, null).size(constraintsSizeResolver).build();
                composer.updateRememberedValue(rememberedValue2);
            }
            coil.request.ImageRequest imageRequest3 = (coil.request.ImageRequest) rememberedValue2;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            return imageRequest3;
        }
        composer.startReplaceableGroup(-227066702);
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        android.content.Context context = (android.content.Context) consume;
        composer.startReplaceableGroup(408319118);
        boolean changed2 = composer.changed(context) | composer.changed(obj) | composer.changed(constraintsSizeResolver);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new coil.request.ImageRequest.Builder(context).data(obj).size(constraintsSizeResolver).build();
            composer.updateRememberedValue(rememberedValue3);
        }
        coil.request.ImageRequest imageRequest4 = (coil.request.ImageRequest) rememberedValue3;
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return imageRequest4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil.compose.AsyncImagePainter.State transformOf$lambda$4(androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.graphics.painter.Painter painter2, androidx.compose.ui.graphics.painter.Painter painter3, coil.compose.AsyncImagePainter.State state) {
        if (state instanceof coil.compose.AsyncImagePainter.State.Loading) {
            return painter != null ? ((coil.compose.AsyncImagePainter.State.Loading) state).copy(painter) : (coil.compose.AsyncImagePainter.State.Loading) state;
        }
        if (!(state instanceof coil.compose.AsyncImagePainter.State.Error)) {
            return state;
        }
        coil.compose.AsyncImagePainter.State.Error error = (coil.compose.AsyncImagePainter.State.Error) state;
        if (error.getResult().getThrowable() instanceof coil.request.NullRequestDataException) {
            if (painter2 != null) {
                error = coil.compose.AsyncImagePainter.State.Error.copy$default(error, painter2, null, 2, null);
            }
        } else if (painter3 != null) {
            error = coil.compose.AsyncImagePainter.State.Error.copy$default(error, painter3, null, 2, null);
        }
        return error;
    }

    public static final kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, coil.compose.AsyncImagePainter.State> transformOf(final androidx.compose.ui.graphics.painter.Painter painter, final androidx.compose.ui.graphics.painter.Painter painter2, final androidx.compose.ui.graphics.painter.Painter painter3) {
        if (painter != null || painter2 != null || painter3 != null) {
            return new kotlin.jvm.functions.Function1() { // from class: coil.compose.UtilsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    coil.compose.AsyncImagePainter.State transformOf$lambda$4;
                    transformOf$lambda$4 = coil.compose.UtilsKt.transformOf$lambda$4(androidx.compose.ui.graphics.painter.Painter.this, painter3, painter2, (coil.compose.AsyncImagePainter.State) obj);
                    return transformOf$lambda$4;
                }
            };
        }
        return coil.compose.AsyncImagePainter.INSTANCE.getDefaultTransform();
    }

    public static final kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, kotlin.Unit> onStateOf(final kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Loading, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Success, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Error, kotlin.Unit> function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new kotlin.jvm.functions.Function1() { // from class: coil.compose.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit onStateOf$lambda$5;
                onStateOf$lambda$5 = coil.compose.UtilsKt.onStateOf$lambda$5(kotlin.jvm.functions.Function1.this, function12, function13, (coil.compose.AsyncImagePainter.State) obj);
                return onStateOf$lambda$5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onStateOf$lambda$5(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, coil.compose.AsyncImagePainter.State state) {
        if (state instanceof coil.compose.AsyncImagePainter.State.Loading) {
            if (function1 != null) {
                function1.invoke(state);
            }
        } else if (state instanceof coil.compose.AsyncImagePainter.State.Success) {
            if (function12 != null) {
                function12.invoke(state);
            }
        } else if (state instanceof coil.compose.AsyncImagePainter.State.Error) {
            if (function13 != null) {
                function13.invoke(state);
            }
        } else if (!(state instanceof coil.compose.AsyncImagePainter.State.Empty)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier contentDescription(androidx.compose.ui.Modifier modifier, final java.lang.String str) {
        return str != null ? androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new kotlin.jvm.functions.Function1() { // from class: coil.compose.UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit contentDescription$lambda$6;
                contentDescription$lambda$6 = coil.compose.UtilsKt.contentDescription$lambda$6(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                return contentDescription$lambda$6;
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit contentDescription$lambda$6(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m3808setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m3795getImageo7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    public static final coil.size.Scale toScale(androidx.compose.ui.layout.ContentScale contentScale) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(contentScale, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit()) || kotlin.jvm.internal.Intrinsics.areEqual(contentScale, androidx.compose.ui.layout.ContentScale.INSTANCE.getInside())) {
            return coil.size.Scale.FIT;
        }
        return coil.size.Scale.FILL;
    }

    /* renamed from: toSizeOrNull-BRTryo0, reason: not valid java name */
    public static final coil.size.Size m4998toSizeOrNullBRTryo0(long j) {
        if (androidx.compose.ui.unit.Constraints.m4428isZeroimpl(j)) {
            return null;
        }
        return new coil.size.Size(androidx.compose.ui.unit.Constraints.m4420getHasBoundedWidthimpl(j) ? coil.size.Dimensions.Dimension(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j)) : coil.size.Dimension.Undefined.INSTANCE, androidx.compose.ui.unit.Constraints.m4419getHasBoundedHeightimpl(j) ? coil.size.Dimensions.Dimension(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j)) : coil.size.Dimension.Undefined.INSTANCE);
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final float m4995constrainWidthK40F9xA(long j, float f) {
        return kotlin.ranges.RangesKt.coerceIn(f, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final float m4994constrainHeightK40F9xA(long j, float f) {
        return kotlin.ranges.RangesKt.coerceIn(f, androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j));
    }

    public static final float takeOrElse(float f, kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        return (java.lang.Float.isInfinite(f) || java.lang.Float.isNaN(f)) ? function0.invoke().floatValue() : f;
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m4997toIntSizeuvyYCjk(long j) {
        return androidx.compose.ui.unit.IntSizeKt.IntSize(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j)), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j)));
    }

    /* renamed from: isPositive-uvyYCjk, reason: not valid java name */
    public static final boolean m4996isPositiveuvyYCjk(long j) {
        return ((double) androidx.compose.ui.geometry.Size.m1940getWidthimpl(j)) >= 0.5d && ((double) androidx.compose.ui.geometry.Size.m1937getHeightimpl(j)) >= 0.5d;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final coil.size.SizeResolver getOriginalSizeResolver() {
        return OriginalSizeResolver;
    }
}
