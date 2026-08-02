package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b \u0018\u0000 ,2\u00020\u0001:\u0001,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b\u001a\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H&¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/graphics/path/PathIteratorImpl;", "", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "", "p0", "Landroidx/graphics/path/PathSegment$Type;", "p1", "", "Landroid/graphics/PointF;", "getHighSpeedVideoSizes", "([FLandroidx/graphics/path/PathSegment$Type;)[Landroid/graphics/PointF;", "hasNext", "()Z", "Landroidx/graphics/path/PathSegment;", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/graphics/path/PathSegment;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "offset", "([FI)Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "Camera2StreamConfigurationMap", "[F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTolerance", "()F", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PathIteratorImpl {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static final androidx.graphics.path.PathIteratorImpl.Companion Companion;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float[] getHighSpeedVideoSizes;
    private final androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation;
    private final android.graphics.Path path;
    private final float tolerance;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 108 - s;
        int i5 = 105 - i;
        int i6 = b + 5;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i5++;
            i4 = (i4 + i7) - 5;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 = (i4 + i7) - 5;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = 103 - (b2 * 2);
        int i3 = b + 4;
        int i4 = s * 2;
        byte[] bArr2 = new byte[35 - i4];
        int i5 = 34 - i4;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i2 = (i2 + i6) - 3;
            i = i7;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            i3++;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i2 = (i2 + i6) - 3;
            i = i7;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            i3++;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            i3++;
            if (i == i5) {
            }
        }
    }

    public abstract int calculateSize(boolean includeConvertedConics);

    public abstract boolean hasNext();

    public abstract androidx.graphics.path.PathSegment.Type next(float[] points, int offset);

    public abstract androidx.graphics.path.PathSegment.Type peek();

    public PathIteratorImpl(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conicEvaluation, "");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f;
        this.getHighSpeedVideoSizes = new float[8];
    }

    public final android.graphics.Path getPath() {
        return this.path;
    }

    public /* synthetic */ PathIteratorImpl(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    public final androidx.graphics.path.PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/graphics/path/PathIteratorImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        byte[] bArr = {82, com.visa.cbp.getEncExpo.IResultReceiver, 68, 102, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 41;
        byte[] bArr2 = {109, -102, 126, -3, -45, 9, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 152;
        Companion = new androidx.graphics.path.PathIteratorImpl.Companion(null);
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr2[42], (byte) 101, b, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = androidx.graphics.path.PathIteratorImpl.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.text.TextUtils.getCapsMode("", 0, 0), 349 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 11 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -1409805860, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -1409805860};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char normalizeMetaState = (char) (android.view.KeyEvent.normalizeMetaState(0) + 45285);
                int i = 159 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int i2 = 4 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b2 = bArr[13];
                byte b3 = bArr[14];
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(normalizeMetaState, i, i2, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.view.View.resolveSizeAndState(0, 0, 0)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 104, 32 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r3, new int[]{r12}, new int[]{r11}, new int[1]};
                int i3 = ((int[]) objArr5[3])[0];
                int i4 = ((int[]) objArr5[2])[0];
                int i5 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int i6 = ~new java.util.Random().nextInt();
                int i7 = i3 + 963487722 + (((~((-282337412) | i6)) | (-738566686)) * (-983)) + (((~(i6 | (-738566686))) | 738296348) * 983);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr6[3])[0] = i9 ^ (i9 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(bArr2[6], (byte) 97, bArr2[104], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(bArr2[6], (byte) 81, (byte) (-bArr2[10]), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(bArr2[6], (byte) 61, bArr2[20], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    byte b4 = bArr2[37];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(b4, bArr2[34], b4, objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(bArr2[6], (byte) (bArr2[54] - 1), bArr2[57], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(bArr2[37], bArr2[36], bArr2[5], objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(androidx.graphics.path.PathIteratorImpl.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b, bArr2[57], bArr2[42], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                        return;
                    }
                    byte b5 = b;
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a(b, b5, (byte) (b5 | 7), objArr14);
                    java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(invoke, invoke2, str);
                    return;
                } catch (java.lang.reflect.InvocationTargetException e) {
                    java.lang.Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
            if (strArr2 != null) {
                for (java.lang.String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ androidx.graphics.path.PathSegment.Type next$default(androidx.graphics.path.PathIteratorImpl pathIteratorImpl, float[] fArr, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return pathIteratorImpl.next(fArr, i);
    }

    public final androidx.graphics.path.PathSegment next() {
        androidx.graphics.path.PathSegment.Type next = next(this.getHighSpeedVideoSizes, 0);
        if (next == androidx.graphics.path.PathSegment.Type.Done) {
            return androidx.graphics.path.PathSegmentUtilities.getDoneSegment();
        }
        if (next == androidx.graphics.path.PathSegment.Type.Close) {
            return androidx.graphics.path.PathSegmentUtilities.getCloseSegment();
        }
        return new androidx.graphics.path.PathSegment(next, getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, next), next == androidx.graphics.path.PathSegment.Type.Conic ? this.getHighSpeedVideoSizes[6] : 0.0f);
    }

    private final android.graphics.PointF[] getHighSpeedVideoSizes(float[] p0, androidx.graphics.path.PathSegment.Type p1) {
        int i = androidx.graphics.path.PathIteratorImpl.WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
        if (i == 1) {
            return new android.graphics.PointF[]{new android.graphics.PointF(p0[0], p0[1])};
        }
        if (i == 2) {
            return new android.graphics.PointF[]{new android.graphics.PointF(p0[0], p0[1]), new android.graphics.PointF(p0[2], p0[3])};
        }
        if (i == 3 || i == 4) {
            return new android.graphics.PointF[]{new android.graphics.PointF(p0[0], p0[1]), new android.graphics.PointF(p0[2], p0[3]), new android.graphics.PointF(p0[4], p0[5])};
        }
        if (i == 5) {
            return new android.graphics.PointF[]{new android.graphics.PointF(p0[0], p0[1]), new android.graphics.PointF(p0[2], p0[3]), new android.graphics.PointF(p0[4], p0[5]), new android.graphics.PointF(p0[6], p0[7])};
        }
        return new android.graphics.PointF[0];
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.graphics.path.PathSegment.Type.values().length];
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Move.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Line.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Conic.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
