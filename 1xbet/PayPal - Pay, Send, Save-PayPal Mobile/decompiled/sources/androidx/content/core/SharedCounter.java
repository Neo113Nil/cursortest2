package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/datastore/core/SharedCounter;", "", "", "getValue", "()I", "incrementAndGetValue", "Factory", "RealSharedCounter", "ShadowSharedCounter"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SharedCounter {

    /* renamed from: Factory, reason: from kotlin metadata */
    public static final androidx.content.core.SharedCounter.Companion INSTANCE = androidx.content.core.SharedCounter.Companion.getHighSpeedVideoSizes;

    int getValue();

    int incrementAndGetValue();

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/datastore/core/SharedCounter$RealSharedCounter;", "Landroidx/datastore/core/SharedCounter;", "Landroidx/datastore/core/NativeSharedCounter;", "p0", "", "p1", "<init>", "(Landroidx/datastore/core/NativeSharedCounter;J)V", "", "getValue", "()I", "incrementAndGetValue", "getHighSpeedVideoFpsRanges", "Landroidx/datastore/core/NativeSharedCounter;", "getHighSpeedVideoSizes", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RealSharedCounter implements androidx.content.core.SharedCounter {
        private final androidx.content.core.NativeSharedCounter getHighSpeedVideoFpsRanges;
        private final long getHighSpeedVideoSizes;

        public RealSharedCounter(androidx.content.core.NativeSharedCounter nativeSharedCounter, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeSharedCounter, "");
            this.getHighSpeedVideoFpsRanges = nativeSharedCounter;
            this.getHighSpeedVideoSizes = j;
        }

        @Override // androidx.content.core.SharedCounter
        public final int getValue() {
            return this.getHighSpeedVideoFpsRanges.nativeGetCounterValue(this.getHighSpeedVideoSizes);
        }

        @Override // androidx.content.core.SharedCounter
        public final int incrementAndGetValue() {
            return this.getHighSpeedVideoFpsRanges.nativeIncrementAndGetCounterValue(this.getHighSpeedVideoSizes);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/datastore/core/SharedCounter$ShadowSharedCounter;", "Landroidx/datastore/core/SharedCounter;", "<init>", "()V", "", "getValue", "()I", "incrementAndGetValue", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ShadowSharedCounter implements androidx.content.core.SharedCounter {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // androidx.content.core.SharedCounter
        public final int getValue() {
            return this.getHighSpeedVideoFpsRangesFor.get();
        }

        @Override // androidx.content.core.SharedCounter
        public final int incrementAndGetValue() {
            return this.getHighSpeedVideoFpsRangesFor.incrementAndGet();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/datastore/core/SharedCounter$Factory;", "", "<init>", "()V", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/SharedCounter;", "create$datastore_core", "(Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/SharedCounter;", "Landroidx/datastore/core/NativeSharedCounter;", "Camera2StreamConfigurationMap", "Landroidx/datastore/core/NativeSharedCounter;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.datastore.core.SharedCounter$Factory, reason: from kotlin metadata */
    public static final class Companion {
        private static final byte[] $$a;
        private static final int $$b;
        private static final byte[] $$d;
        private static final int $$e;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private static final androidx.content.core.NativeSharedCounter getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ androidx.content.core.SharedCounter.Companion getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, byte b, short s, java.lang.Object[] objArr) {
            int i2;
            int i3 = i + 99;
            byte[] bArr = $$a;
            int i4 = 105 - b;
            byte[] bArr2 = new byte[s + 6];
            int i5 = s + 5;
            if (bArr == null) {
                int i6 = i4;
                int i7 = i5;
                int i8 = 0;
                int i9 = (i4 + (-i7)) - 5;
                i2 = i8;
                i4 = i6;
                i3 = i9;
                int i10 = i4 + 1;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i10];
                i4 = i3;
                i6 = i10;
                int i92 = (i4 + (-i7)) - 5;
                i2 = i8;
                i4 = i6;
                i3 = i92;
                int i102 = i4 + 1;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                int i1022 = i4 + 1;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i5) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5 = 103 - (i * 2);
            int i6 = (s * 2) + 4;
            byte[] bArr = $$d;
            int i7 = (i2 * 3) + 35;
            byte[] bArr2 = new byte[i7];
            if (bArr == null) {
                int i8 = i6;
                i4 = 0;
                i5 = (i5 + i6) - 3;
                i6 = i8 + 1;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i7) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i8 = i6;
                i6 = bArr[i6];
                i5 = (i5 + i6) - 3;
                i6 = i8 + 1;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i7) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i7) {
                }
            }
        }

        private Companion() {
        }

        static {
            androidx.content.core.NativeSharedCounter nativeSharedCounter;
            java.lang.String str;
            java.lang.Object[] objArr;
            byte[] bArr = {41, -125, -85, 4, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
            $$d = bArr;
            $$e = 94;
            byte[] bArr2 = {106, 124, -118, -18, -6, 43, -51, -5, 41, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
            $$a = bArr2;
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
            getHighSpeedVideoSizes = new androidx.content.core.SharedCounter.Companion();
            byte b = (byte) 0;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(b, (byte) (b | 102), b, objArr2);
                str = (java.lang.String) objArr2[0];
                java.lang.ClassLoader classLoader = androidx.content.core.SharedCounter.Companion.class.getClassLoader();
                try {
                    java.lang.Object[] objArr3 = {-1395598504};
                    java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                    if (Camera2StreamConfigurationMap == null) {
                        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 349 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    try {
                        java.lang.Object[] objArr4 = {str, classLoader, false, -539554394, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr3), -539554394};
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                        if (Camera2StreamConfigurationMap2 == null) {
                            char trimmedLength = (char) (android.text.TextUtils.getTrimmedLength("") + 45285);
                            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                            int i = 4 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            byte b2 = bArr[14];
                            byte b3 = b2;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(b2, b3, b3, objArr5);
                            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(trimmedLength, packedPositionGroup, i, 1475857042, false, (java.lang.String) objArr5[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15770 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 103, 32 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), java.lang.Integer.TYPE});
                        }
                        objArr = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr4);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (java.lang.Throwable th3) {
                if (kotlin.text.StringsKt.equals("dalvik", java.lang.System.getProperty("java.vm.name"), true)) {
                    throw th3;
                }
                nativeSharedCounter = null;
            }
            if (((int[]) objArr[2])[0] == ((int[]) objArr[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r12}, new int[]{r10}, new int[1]};
                int i2 = ((int[]) objArr[3])[0];
                int i3 = ((int[]) objArr[2])[0];
                int i4 = ((int[]) objArr[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr[0];
                int myTid = android.os.Process.myTid();
                int i5 = i2 + (-1439854048) + ((~((~myTid) | 1002011296)) * (-116)) + ((422595200 | myTid) * 116) + (((~(myTid | (-598308897))) | 18892800) * 116);
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (bArr2[14] + 1), (byte) 97, (byte) (-bArr2[21]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) (bArr2[14] + 1), (byte) 81, (byte) (bArr2[11] - 1), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (bArr2[14] + 1), (byte) 61, (byte) (-bArr2[58]), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    byte b4 = bArr2[9];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(b4, bArr2[12], b4, objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) (bArr2[14] + 1), (byte) 37, bArr2[41], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(bArr2[9], (byte) (-bArr2[37]), (byte) (-bArr2[42]), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(androidx.content.core.SharedCounter.Companion.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(bArr2[41], (byte) (-bArr2[58]), (byte) (-bArr2[7]), objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                    } else {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(bArr2[41], b, bArr2[14], objArr14);
                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(invoke, invoke2, str);
                    }
                    nativeSharedCounter = new androidx.content.core.NativeSharedCounter();
                    getHighSpeedVideoFpsRangesFor = nativeSharedCounter;
                    return;
                } catch (java.lang.reflect.InvocationTargetException e) {
                    java.lang.Throwable cause3 = e.getCause();
                    if (cause3 == null) {
                        throw e;
                    }
                    throw cause3;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) objArr[0];
            if (strArr2 != null) {
                for (java.lang.String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            throw new java.lang.NullPointerException();
        }

        public final androidx.content.core.SharedCounter create$datastore_core(kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
            android.os.ParcelFileDescriptor parcelFileDescriptor;
            androidx.datastore.core.SharedCounter.RealSharedCounter realSharedCounter;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "");
            try {
                parcelFileDescriptor = android.os.ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(parcelFileDescriptor);
                    androidx.content.core.NativeSharedCounter nativeSharedCounter = getHighSpeedVideoFpsRangesFor;
                    if (nativeSharedCounter != null) {
                        int fd = parcelFileDescriptor.getFd();
                        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                            throw new java.io.IOException("Failed to truncate counter file");
                        }
                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (nativeCreateSharedCounter < 0) {
                            throw new java.io.IOException("Failed to mmap counter file");
                        }
                        realSharedCounter = new androidx.datastore.core.SharedCounter.RealSharedCounter(nativeSharedCounter, nativeCreateSharedCounter);
                    } else if (!kotlin.text.StringsKt.equals("dalvik", java.lang.System.getProperty("java.vm.name"), true)) {
                        realSharedCounter = new androidx.datastore.core.SharedCounter.ShadowSharedCounter();
                    } else {
                        throw new java.lang.IllegalStateException("DataStore failed to load the native library to create SharedCounter.".toString());
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    return realSharedCounter;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                parcelFileDescriptor = null;
            }
        }
    }
}
