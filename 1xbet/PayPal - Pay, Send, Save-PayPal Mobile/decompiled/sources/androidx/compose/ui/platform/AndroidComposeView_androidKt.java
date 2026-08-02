package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\b\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\b\u0010\u0010\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0011*\u00020\u000eH\u0002¢\u0006\u0004\b\b\u0010\u0012\u001a\u001b\u0010\b\u001a\u00020\u000f*\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\b\u0010\u0014\".\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00158\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "p0", "", "getHighSpeedVideoFpsRanges", "([F[F)V", "", "p1", "p2", "getHighSpeedVideoSizes", "([FFF[F)V", "", "p3", "getHighResolutionOutputSizeshNQ4ISI", "([FI[FI)F", "Landroid/view/View;", "", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "Landroid/content/res/Configuration;", "(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Z", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputServiceInterceptor", "Lkotlin/jvm/functions/Function1;", "getPlatformTextInputServiceInterceptor", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    private static kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.PlatformTextInputService, ? extends androidx.compose.ui.text.input.PlatformTextInputService> platformTextInputServiceInterceptor = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.PlatformTextInputService, androidx.compose.ui.text.input.PlatformTextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.input.PlatformTextInputService invoke(androidx.compose.ui.text.input.PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    public static final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.PlatformTextInputService, androidx.compose.ui.text.input.PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final void setPlatformTextInputServiceInterceptor(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.PlatformTextInputService, ? extends androidx.compose.ui.text.input.PlatformTextInputService> function1) {
        platformTextInputServiceInterceptor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(float[] fArr, float[] fArr2) {
        float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(fArr2, 0, fArr, 0);
        float highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 0, fArr, 1);
        float highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 0, fArr, 2);
        float highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 0, fArr, 3);
        float highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 1, fArr, 0);
        float highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 1, fArr, 1);
        float highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 1, fArr, 2);
        float highResolutionOutputSizeshNQ4ISI8 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 1, fArr, 3);
        float highResolutionOutputSizeshNQ4ISI9 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 2, fArr, 0);
        float highResolutionOutputSizeshNQ4ISI10 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 2, fArr, 1);
        float highResolutionOutputSizeshNQ4ISI11 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 2, fArr, 2);
        float highResolutionOutputSizeshNQ4ISI12 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 2, fArr, 3);
        float highResolutionOutputSizeshNQ4ISI13 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 3, fArr, 0);
        float highResolutionOutputSizeshNQ4ISI14 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 3, fArr, 1);
        float highResolutionOutputSizeshNQ4ISI15 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 3, fArr, 2);
        float highResolutionOutputSizeshNQ4ISI16 = getHighResolutionOutputSizeshNQ4ISI(fArr2, 3, fArr, 3);
        fArr[0] = highResolutionOutputSizeshNQ4ISI;
        fArr[1] = highResolutionOutputSizeshNQ4ISI2;
        fArr[2] = highResolutionOutputSizeshNQ4ISI3;
        fArr[3] = highResolutionOutputSizeshNQ4ISI4;
        fArr[4] = highResolutionOutputSizeshNQ4ISI5;
        fArr[5] = highResolutionOutputSizeshNQ4ISI6;
        fArr[6] = highResolutionOutputSizeshNQ4ISI7;
        fArr[7] = highResolutionOutputSizeshNQ4ISI8;
        fArr[8] = highResolutionOutputSizeshNQ4ISI9;
        fArr[9] = highResolutionOutputSizeshNQ4ISI10;
        fArr[10] = highResolutionOutputSizeshNQ4ISI11;
        fArr[11] = highResolutionOutputSizeshNQ4ISI12;
        fArr[12] = highResolutionOutputSizeshNQ4ISI13;
        fArr[13] = highResolutionOutputSizeshNQ4ISI14;
        fArr[14] = highResolutionOutputSizeshNQ4ISI15;
        fArr[15] = highResolutionOutputSizeshNQ4ISI16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(float[] fArr, float f, float f2, float[] fArr2) {
        androidx.compose.ui.graphics.Matrix.m6232resetimpl(fArr2);
        androidx.compose.ui.graphics.Matrix.m6245translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        getHighSpeedVideoFpsRanges(fArr, fArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(android.view.View view, android.view.View view2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper getHighSpeedVideoSizes(android.view.View view) {
        androidx.compose.ui.platform.coreshims.ViewCompatShims.setImportantForContentCapture(view, 1);
        return androidx.compose.ui.platform.coreshims.ViewCompatShims.getContentCaptureSession(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(android.content.res.Configuration configuration, android.content.res.Configuration configuration2) {
        return (configuration.diff(configuration2) & (-1342235264)) != 0;
    }

    private static final float getHighResolutionOutputSizeshNQ4ISI(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[i2 + 4]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }
}
