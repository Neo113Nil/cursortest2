package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0002\u001a\r\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0002\u001a\r\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u0002\u001a\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0002\u001a\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0002\u001a\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0002"}, d2 = {"Landroidx/compose/animation/core/Easing;", "easingBounceSoftIn", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Easing;", "easingBounceSoftInOut", "easingBounceSoftOut", "easingBounceStrongIn", "easingBounceStrongInOut", "easingBounceStrongOut", "easingExpressiveIn", "easingExpressiveInOut", "easingExpressiveLoop", "easingExpressiveOut", "easingLinear", "easingStandardIn", "easingStandardInOut", "easingStandardOut"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MotionEasingKt {
    public static final androidx.compose.animation.core.Easing easingBounceSoftIn(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(395434860, i, -1, "com.paypal.pds.core.easingBounceSoftIn (MotionEasing.kt:18)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseBounceSoftIn = localTokens.getBaseMotionEaseBounceSoftIn();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseBounceSoftIn[0], baseMotionEaseBounceSoftIn[1], baseMotionEaseBounceSoftIn[2], baseMotionEaseBounceSoftIn[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingBounceSoftInOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1874945502, i, -1, "com.paypal.pds.core.easingBounceSoftInOut (MotionEasing.kt:23)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseBounceSoftInOut = localTokens.getBaseMotionEaseBounceSoftInOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseBounceSoftInOut[0], baseMotionEaseBounceSoftInOut[1], baseMotionEaseBounceSoftInOut[2], baseMotionEaseBounceSoftInOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingBounceSoftOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2079637927, i, -1, "com.paypal.pds.core.easingBounceSoftOut (MotionEasing.kt:28)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseBounceSoftOut = localTokens.getBaseMotionEaseBounceSoftOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseBounceSoftOut[0], baseMotionEaseBounceSoftOut[1], baseMotionEaseBounceSoftOut[2], baseMotionEaseBounceSoftOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingBounceStrongIn(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1840884065, i, -1, "com.paypal.pds.core.easingBounceStrongIn (MotionEasing.kt:33)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseBounceStrongIn = localTokens.getBaseMotionEaseBounceStrongIn();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseBounceStrongIn[0], baseMotionEaseBounceStrongIn[1], baseMotionEaseBounceStrongIn[2], baseMotionEaseBounceStrongIn[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingBounceStrongInOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1064420917, i, -1, "com.paypal.pds.core.easingBounceStrongInOut (MotionEasing.kt:38)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseBounceStrongInOut = localTokens.getBaseMotionEaseBounceStrongInOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseBounceStrongInOut[0], baseMotionEaseBounceStrongInOut[1], baseMotionEaseBounceStrongInOut[2], baseMotionEaseBounceStrongInOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingBounceStrongOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1608919430, i, -1, "com.paypal.pds.core.easingBounceStrongOut (MotionEasing.kt:43)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseBounceStrongOut = localTokens.getBaseMotionEaseBounceStrongOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseBounceStrongOut[0], baseMotionEaseBounceStrongOut[1], baseMotionEaseBounceStrongOut[2], baseMotionEaseBounceStrongOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingExpressiveIn(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-624774634, i, -1, "com.paypal.pds.core.easingExpressiveIn (MotionEasing.kt:48)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseExpressiveIn = localTokens.getBaseMotionEaseExpressiveIn();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseExpressiveIn[0], baseMotionEaseExpressiveIn[1], baseMotionEaseExpressiveIn[2], baseMotionEaseExpressiveIn[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingExpressiveInOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2496244, i, -1, "com.paypal.pds.core.easingExpressiveInOut (MotionEasing.kt:53)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseExpressiveInOut = localTokens.getBaseMotionEaseExpressiveInOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseExpressiveInOut[0], baseMotionEaseExpressiveInOut[1], baseMotionEaseExpressiveInOut[2], baseMotionEaseExpressiveInOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingExpressiveLoop(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1989536201, i, -1, "com.paypal.pds.core.easingExpressiveLoop (MotionEasing.kt:58)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseExpressiveLoop = localTokens.getBaseMotionEaseExpressiveLoop();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseExpressiveLoop[0], baseMotionEaseExpressiveLoop[1], baseMotionEaseExpressiveLoop[2], baseMotionEaseExpressiveLoop[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingExpressiveOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(653606127, i, -1, "com.paypal.pds.core.easingExpressiveOut (MotionEasing.kt:63)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseExpressiveOut = localTokens.getBaseMotionEaseExpressiveOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseExpressiveOut[0], baseMotionEaseExpressiveOut[1], baseMotionEaseExpressiveOut[2], baseMotionEaseExpressiveOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingLinear(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1864761822, i, -1, "com.paypal.pds.core.easingLinear (MotionEasing.kt:68)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseLinear = localTokens.getBaseMotionEaseLinear();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseLinear[0], baseMotionEaseLinear[1], baseMotionEaseLinear[2], baseMotionEaseLinear[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingStandardIn(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1316351775, i, -1, "com.paypal.pds.core.easingStandardIn (MotionEasing.kt:73)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseStandardIn = localTokens.getBaseMotionEaseStandardIn();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseStandardIn[0], baseMotionEaseStandardIn[1], baseMotionEaseStandardIn[2], baseMotionEaseStandardIn[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingStandardInOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(186007625, i, -1, "com.paypal.pds.core.easingStandardInOut (MotionEasing.kt:78)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseStandardInOut = localTokens.getBaseMotionEaseStandardInOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseStandardInOut[0], baseMotionEaseStandardInOut[1], baseMotionEaseStandardInOut[2], baseMotionEaseStandardInOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }

    public static final androidx.compose.animation.core.Easing easingStandardOut(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(689551236, i, -1, "com.paypal.pds.core.easingStandardOut (MotionEasing.kt:83)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            float[] baseMotionEaseStandardOut = localTokens.getBaseMotionEaseStandardOut();
            androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(baseMotionEaseStandardOut[0], baseMotionEaseStandardOut[1], baseMotionEaseStandardOut[2], baseMotionEaseStandardOut[3]);
            composer.updateRememberedValue(cubicBezierEasing);
            rememberedValue = cubicBezierEasing;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing2 = (androidx.compose.animation.core.CubicBezierEasing) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cubicBezierEasing2;
    }
}
