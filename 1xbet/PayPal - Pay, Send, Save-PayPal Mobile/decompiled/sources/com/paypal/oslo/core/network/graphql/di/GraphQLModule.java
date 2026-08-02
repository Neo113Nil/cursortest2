package com.paypal.oslo.core.network.graphql.di;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/di/GraphQLModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/SqlCipherLibraryLoader;", "provideSqlCipherLibraryLoader$graphql_release", "()Lcom/paypal/oslo/core/network/graphql/SqlCipherLibraryLoader;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "config", "Lcom/paypal/oslo/core/network/graphql/ApolloStoreFactory;", "storeFactory", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "provideApolloStore$graphql_release", "(Landroid/content/Context;Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;Lcom/paypal/oslo/core/network/graphql/ApolloStoreFactory;)Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "Lcom/paypal/oslo/core/network/graphql/DynamicApolloClientProvider;", "provider", "Lcom/apollographql/apollo/ApolloClient;", "provideApolloClient$graphql_release", "(Lcom/paypal/oslo/core/network/graphql/DynamicApolloClientProvider;)Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class GraphQLModule {
    private static final byte[] $$d = {com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.registerForActivityResult, -63, -56, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
    private static final int $$e = 241;
    private static final byte[] $$a = {83, -73, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -24, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 5, 9, 5, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
    private static final int $$b = 200;
    public static final com.paypal.oslo.core.network.graphql.di.GraphQLModule INSTANCE = new com.paypal.oslo.core.network.graphql.di.GraphQLModule();

    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i = s3 + 103;
        int i2 = s2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[21 - s];
        int i3 = 20 - s;
        int i4 = -1;
        if (bArr == null) {
            i = (i + i3) - 5;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i2]) - 5;
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (s * 2) + 4;
        int i6 = 103 - (i * 2);
        byte[] bArr = $$d;
        int i7 = (i2 * 2) + 35;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5++;
            i6 = (i6 + (-i8)) - 3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i5++;
            i6 = (i6 + (-i8)) - 3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    private GraphQLModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader provideSqlCipherLibraryLoader$graphql_release() {
        return new com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader() { // from class: com.paypal.oslo.core.network.graphql.di.GraphQLModule$$ExternalSyntheticLambda0
            @Override // com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader
            public final void load() {
                com.paypal.oslo.core.network.graphql.di.GraphQLModule.m11655$r8$lambda$sww9Jvw_zCfPA6SQ1w0uzDayGY();
            }
        };
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.apollographql.apollo.cache.normalized.ApolloStore provideApolloStore$graphql_release(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.network.graphql.config.GraphQlConfig config, com.paypal.oslo.core.network.graphql.ApolloStoreFactory storeFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeFactory, "");
        return storeFactory.create$graphql_release(context, config);
    }

    @dagger.Provides
    public final com.apollographql.apollo.ApolloClient provideApolloClient$graphql_release(com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider.getApolloClient();
    }

    /* renamed from: $r8$lambda$sww9Jvw-_zCfPA6SQ1w0uzDayGY, reason: not valid java name */
    public static /* synthetic */ void m11655$r8$lambda$sww9Jvw_zCfPA6SQ1w0uzDayGY() {
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) 15, b, (byte) (b | 13), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = com.paypal.oslo.core.network.graphql.di.GraphQLModule.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.indexOf("", "", 0) + 349, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -401118771, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -401118771};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char windowTouchSlop = (char) (45285 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                int packedPositionGroup = 158 - android.widget.ExpandableListView.getPackedPositionGroup(0L);
                int i = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3;
                byte b2 = $$d[14];
                byte b3 = b2;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(windowTouchSlop, packedPositionGroup, i, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), android.graphics.Color.blue(0) + 104, 34 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r14}, new int[]{r13}, new int[1]};
                int i2 = ((int[]) objArr5[3])[0];
                int i3 = ((int[]) objArr5[2])[0];
                int i4 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int myPid = android.os.Process.myPid();
                int i5 = ~myPid;
                int i6 = i2 + (-547344320) + (((~((-101356584) | i5)) | 919547513) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + (((~(i5 | (-36871))) | (~(919584383 | myPid))) * (-519)) + (((~(myPid | 919547513)) | 101356583) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr6[3])[0] = i8 ^ (i8 << 5);
                try {
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (-bArr[9]), bArr[6], bArr[56], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(b, bArr[102], bArr[56], objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(bArr[6], bArr[18], bArr[56], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr[21], (byte) 56, b, objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(bArr[43], (byte) 65, bArr[56], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b4 = (byte) (bArr[42] - 1);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(b4, (byte) (b4 | 72), b, objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.paypal.oslo.core.network.graphql.di.GraphQLModule.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(bArr[58], (byte) 92, bArr[6], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                        return;
                    }
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a(bArr[7], (byte) 102, bArr[6], objArr14);
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
                throw null;
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
}
