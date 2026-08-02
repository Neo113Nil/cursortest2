package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\b\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/payair/hce/setAlwaysDrawnWithCacheEnabled;", "Lcom/payair/hce/setSafeBrowsingWhitelist;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Lkotlinx/coroutines/flow/Flow;", "", "valueOf", "()Lkotlinx/coroutines/flow/Flow;", "AlternateContactlessPaymentDataJson", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeReplace", "values", "Landroid/content/Context;", "DigitizedCardProfile"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setAlwaysDrawnWithCacheEnabled implements com.payair.hce.setSafeBrowsingWhitelist {

    /* renamed from: values, reason: from kotlin metadata */
    private final android.content.Context DigitizedCardProfile;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    public static final com.payair.hce.setAlwaysDrawnWithCacheEnabled.Companion INSTANCE = new com.payair.hce.setAlwaysDrawnWithCacheEnabled.Companion(null);
    private static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.content.core.DataStore<androidx.content.preferences.core.Preferences>> writeReplace = androidx.content.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default("visa_storage", null, null, null, 14, null);
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> valueOf = androidx.content.preferences.core.PreferencesKeys.booleanKey("enroll_das_device_done");
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> DigitizedCardProfile = androidx.content.preferences.core.PreferencesKeys.booleanKey("onboard_device_perso_done");
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 43) % 128;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\n8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/payair/hce/setAlwaysDrawnWithCacheEnabled$AlternateContactlessPaymentDataJson;", "", "<init>", "()V", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "valueOf", "Landroidx/datastore/preferences/core/Preferences$Key;", "writeReplace", "DigitizedCardProfile", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlin/properties/ReadOnlyProperty;", "AlternateContactlessPaymentDataJson", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setAlwaysDrawnWithCacheEnabled$AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    public static final class Companion {
        private static /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] AlternateContactlessPaymentDataJson = {kotlin.jvm.internal.Reflection.property2(new kotlin.jvm.internal.PropertyReference2Impl(com.payair.hce.setAlwaysDrawnWithCacheEnabled.Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
        private static int DigitizedCardProfile = 1;
        private static int values;

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ~i2;
            int i6 = ~i3;
            return ((((i * 69) + (i2 * (-67))) + ((((~(i | i2)) | (~((i4 | i5) | i6))) | (~(i3 | i2))) * (-68))) + ((~((i4 | i6) | i2)) * (-68))) + (((~(i5 | i6)) | i4) * 68) != 1 ? DigitizedCardProfile(objArr) : writeReplace(objArr);
        }

        private Companion() {
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            android.content.Context context = (android.content.Context) objArr[0];
            int i = values;
            int i2 = ((i ^ 6) + ((i & 6) << 1)) - 1;
            DigitizedCardProfile = i2 % 128;
            java.lang.Object[] objArr2 = {context};
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            androidx.content.core.DataStore dataStore = (androidx.content.core.DataStore) DigitizedCardProfile(objArr2, -1090876283, 1090876283, (int) currentTimeMillis);
            int i3 = DigitizedCardProfile;
            int i4 = i3 ^ 33;
            int i5 = ((i3 & 33) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            values = i7 % 128;
            if (i7 % 2 == 0) {
                return dataStore;
            }
            throw null;
        }

        static {
            int i = DigitizedCardProfile;
            int i2 = i & 1;
            int i3 = -(-((i ^ 1) | i2));
            values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            android.content.Context context = (android.content.Context) objArr[0];
            values = (DigitizedCardProfile + 43) % 128;
            androidx.content.core.DataStore dataStore = (androidx.content.core.DataStore) ((kotlin.properties.ReadOnlyProperty) com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(new java.lang.Object[0], 1932840610, -1932840607, (int) java.lang.System.currentTimeMillis())).getValue(context, AlternateContactlessPaymentDataJson[0]);
            int i = DigitizedCardProfile;
            int i2 = i & 57;
            int i3 = i2 + ((i ^ 57) | i2);
            values = i3 % 128;
            if (i3 % 2 == 0) {
                return dataStore;
            }
            throw null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ androidx.content.core.DataStore DigitizedCardProfile(android.content.Context context) {
            return (androidx.content.core.DataStore) DigitizedCardProfile(new java.lang.Object[]{context}, 932081765, -932081764, (int) java.lang.System.currentTimeMillis());
        }

        private static androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> AlternateContactlessPaymentDataJson(android.content.Context context) {
            return (androidx.content.core.DataStore) DigitizedCardProfile(new java.lang.Object[]{context}, -1090876283, 1090876283, (int) java.lang.System.currentTimeMillis());
        }
    }

    public setAlwaysDrawnWithCacheEnabled(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.DigitizedCardProfile = context;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        IccPrivateKeyCrtComponentsJson = (i + 119) % 128;
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> key = valueOf;
        int i2 = i + 59;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return key;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 113;
        int i3 = (i ^ 113) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i5;
        kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.content.core.DataStore<androidx.content.preferences.core.Preferences>> readOnlyProperty = writeReplace;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i6 = i5 & 49;
        int i7 = i6 + ((i5 ^ 49) | i6);
        IccPrivateKeyCrtComponentsJson = i7 % 128;
        if (i7 % 2 != 0) {
            return readOnlyProperty;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = (com.payair.hce.setAlwaysDrawnWithCacheEnabled) objArr[0];
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit((androidx.content.core.DataStore) com.payair.hce.setAlwaysDrawnWithCacheEnabled.Companion.DigitizedCardProfile(new java.lang.Object[]{setalwaysdrawnwithcacheenabled.DigitizedCardProfile}, 932081765, -932081764, (int) java.lang.System.currentTimeMillis()), new com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace(null), (kotlin.coroutines.Continuation) objArr[1]);
        if (edit != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
            return unit;
        }
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (((i & (-22)) | ((~i) & 21)) - (~((i & 21) << 1))) - 1;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return edit;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = (com.payair.hce.setAlwaysDrawnWithCacheEnabled) objArr[0];
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit((androidx.content.core.DataStore) com.payair.hce.setAlwaysDrawnWithCacheEnabled.Companion.DigitizedCardProfile(new java.lang.Object[]{setalwaysdrawnwithcacheenabled.DigitizedCardProfile}, 932081765, -932081764, (int) java.lang.System.currentTimeMillis()), new com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(null), (kotlin.coroutines.Continuation) objArr[1]);
        if (edit != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            int i = IccPrivateKeyCrtComponentsJson;
            SdkCoreAlternateContactlessPaymentDataImpl = ((-2) - (~((i & 112) + (i | 112)))) % 128;
            return unit;
        }
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 37;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return edit;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile digitizedCardProfile = new com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile(((androidx.content.core.DataStore) com.payair.hce.setAlwaysDrawnWithCacheEnabled.Companion.DigitizedCardProfile(new java.lang.Object[]{((com.payair.hce.setAlwaysDrawnWithCacheEnabled) objArr[0]).DigitizedCardProfile}, 932081765, -932081764, (int) java.lang.System.currentTimeMillis())).getData());
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 97;
        int i3 = (i2 - (~(-(-((i ^ 97) | i2))))) - 1;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return digitizedCardProfile;
        }
        throw null;
    }

    public static final class DigitizedCardProfile implements kotlinx.coroutines.flow.Flow<java.lang.Boolean> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AlternateContactlessPaymentDataJson;
        private static int DigitizedCardProfile;
        private static int getProfileVersion;
        private static char[] valueOf;
        private static char writeReplace;
        private /* synthetic */ kotlinx.coroutines.flow.Flow values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(byte b, byte b2, short s, java.lang.Object[] objArr) {
            int i;
            int i2 = 37 - (b * 34);
            int i3 = 718 - (b2 * 653);
            int i4 = s * 34;
            byte[] bArr = $$a;
            char[] cArr = new char[i4 + 1];
            if (bArr == null) {
                int i5 = i2;
                int i6 = i4;
                int i7 = 0;
                int i8 = (i6 + i2) - 2;
                i = i7;
                int i9 = i5;
                i3 = i8;
                i2 = i9;
                int i10 = i2 + 1;
                cArr[i] = (char) i3;
                if (i == i4) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                int i11 = i3;
                i5 = i10;
                i2 = bArr[i10];
                i7 = i + 1;
                i6 = i11;
                int i82 = (i6 + i2) - 2;
                i = i7;
                int i92 = i5;
                i3 = i82;
                i2 = i92;
                int i102 = i2 + 1;
                cArr[i] = (char) i3;
                if (i == i4) {
                }
            } else {
                i = 0;
                int i1022 = i2 + 1;
                cArr[i] = (char) i3;
                if (i == i4) {
                }
            }
        }

        private static void d(int i, short s, byte b, java.lang.Object[] objArr) {
            byte[] bArr = $$d;
            int i2 = (b * 2) + 65;
            int i3 = (s * 3) + 4;
            int i4 = i * 2;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i3++;
                i2 = i3 + i5;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                } else {
                    int i7 = bArr[i3];
                    i3++;
                    i2 += i7;
                }
            }
        }

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            return writeReplace(objArr);
        }

        public DigitizedCardProfile(kotlinx.coroutines.flow.Flow flow) {
            this.values = flow;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile) objArr[0];
            final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) objArr[1];
            java.lang.Object collect = digitizedCardProfile.values.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.1
                private static int $valueOf = 1;
                private static int $writeReplace;

                public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i, int i2, int i3) {
                    return valueOf(objArr2);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0100  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                    com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.AnonymousClass3 anonymousClass3;
                    int i;
                    boolean z = false;
                    com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1 anonymousClass1 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1) objArr2[0];
                    java.lang.Object obj = objArr2[1];
                    kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr2[2];
                    int i2 = $valueOf;
                    int i3 = i2 & 117;
                    int i4 = (i2 ^ 117) | i3;
                    int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
                    $writeReplace = i5;
                    if (continuation instanceof com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.AnonymousClass3) {
                        int i6 = i5 ^ 117;
                        int i7 = ((i5 & 117) | i6) << 1;
                        int i8 = -i6;
                        int i9 = (i7 & i8) + (i8 | i7);
                        $valueOf = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = ((com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.AnonymousClass3) continuation).AlternateContactlessPaymentDataJson;
                            throw null;
                        }
                        anonymousClass3 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.AnonymousClass3) continuation;
                        if ((anonymousClass3.AlternateContactlessPaymentDataJson & Integer.MIN_VALUE) != 0) {
                            int i11 = $writeReplace;
                            int i12 = i11 & 57;
                            int i13 = (i11 | 57) & (~i12);
                            int i14 = i12 << 1;
                            $valueOf = (((i13 | i14) << 1) - (i13 ^ i14)) % 128;
                            int i15 = anonymousClass3.AlternateContactlessPaymentDataJson;
                            int identityHashCode = java.lang.System.identityHashCode(anonymousClass1);
                            int i16 = i15 * (-500);
                            int i17 = ~i15;
                            int i18 = (Integer.MIN_VALUE ^ i17) | (i17 & Integer.MIN_VALUE);
                            int i19 = ~i18;
                            int i20 = (i18 | i19) & i19;
                            int i21 = (i15 ^ Integer.MAX_VALUE) | (i15 & Integer.MAX_VALUE);
                            int i22 = ~((i21 ^ identityHashCode) | (i21 & identityHashCode));
                            int i23 = ((~i22) & i20) | ((~i20) & i22);
                            int i24 = i20 & i22;
                            int i25 = -(-(((i24 ^ i23) | (i24 & i23)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                            int i26 = i16 & i25;
                            int i27 = -(-((i25 ^ i16) | i26));
                            int i28 = (i26 & i27) + (i27 | i26);
                            int i29 = i17 & Integer.MAX_VALUE;
                            int i30 = (i17 | Integer.MAX_VALUE) & (~i29);
                            int i31 = (i29 ^ i30) | (i29 & i30);
                            int i32 = ~i31;
                            int i33 = ((i31 | i32) & i32) * 1002;
                            int i34 = i28 & i33;
                            int i35 = (i34 - (~(-(-((i33 ^ i28) | i34))))) - 1;
                            int i36 = ~identityHashCode;
                            int i37 = -(~((~(i15 | (i36 ^ Integer.MAX_VALUE) | (i36 & Integer.MAX_VALUE))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                            anonymousClass3.AlternateContactlessPaymentDataJson = (((i35 | i37) << 1) - (i37 ^ i35)) - 1;
                            $writeReplace = ($valueOf + 9) % 128;
                            java.lang.Object obj2 = anonymousClass3.writeReplace;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass3.AlternateContactlessPaymentDataJson;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = kotlinx.coroutines.flow.FlowCollector.this;
                                java.lang.Boolean bool = (java.lang.Boolean) ((androidx.content.preferences.core.Preferences) obj).get((androidx.datastore.preferences.core.Preferences.Key) com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(new java.lang.Object[0], 964626834, -964626833, (int) java.lang.System.currentTimeMillis()));
                                if (bool != null) {
                                    int i38 = $writeReplace;
                                    int i39 = ((i38 | 84) << 1) - (i38 ^ 84);
                                    int i40 = (~i39) + (i39 << 1);
                                    $valueOf = i40 % 128;
                                    if (i40 % 2 == 0) {
                                        throw null;
                                    }
                                    z = bool.booleanValue();
                                }
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                                anonymousClass3.AlternateContactlessPaymentDataJson = 1;
                                if (flowCollector2.emit(boxBoolean, anonymousClass3) == coroutine_suspended) {
                                    int i41 = ($writeReplace + 107) % 128;
                                    $valueOf = i41;
                                    int i42 = ((i41 | 39) << 1) - (i41 ^ 39);
                                    $writeReplace = i42 % 128;
                                    if (i42 % 2 == 0) {
                                        return coroutine_suspended;
                                    }
                                    throw null;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                int i43 = $valueOf;
                                int i44 = i43 & 49;
                                int i45 = ((i43 ^ 49) | i44) << 1;
                                int i46 = -((i43 | 49) & (~i44));
                                $writeReplace = (((i45 | i46) << 1) - (i46 ^ i45)) % 128;
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            int i47 = $valueOf;
                            int i48 = i47 & 35;
                            $writeReplace = (i48 + ((i47 ^ 35) | i48)) % 128;
                            return unit;
                        }
                    }
                    anonymousClass3 = new com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.AnonymousClass3(continuation);
                    int i49 = $writeReplace;
                    $valueOf = (((i49 ^ 30) + ((i49 & 30) << 1)) - 1) % 128;
                    java.lang.Object obj22 = anonymousClass3.writeReplace;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass3.AlternateContactlessPaymentDataJson;
                    if (i != 0) {
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    int i472 = $valueOf;
                    int i482 = i472 & 35;
                    $writeReplace = (i482 + ((i472 ^ 35) | i482)) % 128;
                    return unit2;
                }

                /* renamed from: com.payair.hce.setAlwaysDrawnWithCacheEnabled$DigitizedCardProfile$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    private static int DigitizedCardProfile = 0;
                    private static int values = 1;
                    int AlternateContactlessPaymentDataJson;
                    /* synthetic */ java.lang.Object writeReplace;

                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                        com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.AnonymousClass3 anonymousClass3 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.AnonymousClass3) objArr[0];
                        java.lang.Object obj = objArr[1];
                        int i4 = values;
                        int i5 = ((i4 ^ 35) | (i4 & 35)) << 1;
                        int i6 = -((i4 & (-36)) | ((~i4) & 35));
                        DigitizedCardProfile = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
                        anonymousClass3.writeReplace = obj;
                        int i7 = anonymousClass3.AlternateContactlessPaymentDataJson;
                        int i8 = i7 & Integer.MIN_VALUE;
                        int i9 = (i7 | Integer.MIN_VALUE) & (~i8);
                        anonymousClass3.AlternateContactlessPaymentDataJson = (i9 ^ i8) | (i9 & i8);
                        com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1 anonymousClass1 = com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.this;
                        java.lang.Object writeReplace = com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.AnonymousClass1.writeReplace(new java.lang.Object[]{anonymousClass1, null, anonymousClass3}, 1287658137, -1287658137, java.lang.System.identityHashCode(anonymousClass1));
                        int i10 = DigitizedCardProfile;
                        int i11 = i10 ^ 33;
                        int i12 = -(-((i10 & 33) << 1));
                        values = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                        return writeReplace;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        return DigitizedCardProfile(new java.lang.Object[]{this, obj}, -619966875, 619966875, java.lang.System.identityHashCode(this));
                    }

                    public AnonymousClass3(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    return writeReplace(new java.lang.Object[]{this, obj, continuation}, 1287658137, -1287658137, java.lang.System.identityHashCode(this));
                }
            }, (kotlin.coroutines.Continuation) objArr[2]);
            if (collect != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                int i = DigitizedCardProfile + 67;
                getProfileVersion = i % 128;
                if (i % 2 != 0) {
                    return unit;
                }
            } else {
                int i2 = getProfileVersion;
                int i3 = i2 & 83;
                int i4 = ((i2 ^ 83) | i3) << 1;
                int i5 = -((i2 | 83) & (~i3));
                int i6 = (i4 & i5) + (i5 | i4);
                DigitizedCardProfile = i6 % 128;
                if (i6 % 2 == 0) {
                    return collect;
                }
            }
            throw new java.lang.ArithmeticException();
        }

        private static void b(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
            int i;
            java.lang.String str2 = str;
            $11 = ($10 + 29) % 128;
            byte[] bArr = str2;
            if (str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
            char c = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = valueOf;
            float f = 0.0f;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[c] = java.lang.Integer.valueOf(cArr[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.myPid() >> 22), (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)) + 2807, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(0, (short) 0, com.google.common.base.Ascii.SYN, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i6++;
                        $10 = ($11 + 9) % 128;
                        c = 0;
                        f = 0.0f;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr2 != null) {
                char[] cArr4 = new char[i3];
                getaccounttype.writeReplace = 0;
                char c2 = 0;
                while (getaccounttype.writeReplace < i3) {
                    if (bArr2[getaccounttype.writeReplace] == 1) {
                        int i7 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 44, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2836, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d(0, (short) 0, com.google.common.base.Ascii.NAK, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    } else {
                        int i8 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.Color.argb(0, 0, 0, 0), 2880 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            d(0, (short) 0, com.google.common.base.Ascii.ETB, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                        }
                        cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    }
                    c2 = cArr4[getaccounttype.writeReplace];
                    java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", "", 0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                }
                int i9 = $10 + 3;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 3 / 2;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i11 = $10 + 31;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    char[] cArr5 = new char[i3];
                    i = 0;
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 1, i3);
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i3 >> i5, i5);
                    java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i3 >>> i5);
                } else {
                    i = 0;
                    char[] cArr6 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i3);
                    int i12 = i3 - i5;
                    java.lang.System.arraycopy(cArr6, 0, cArr3, i12, i5);
                    java.lang.System.arraycopy(cArr6, i5, cArr3, 0, i12);
                }
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr7 = new char[i3];
                while (true) {
                    getaccounttype.writeReplace = i;
                    if (getaccounttype.writeReplace >= i3) {
                        break;
                    }
                    cArr7[getaccounttype.writeReplace] = cArr3[(i3 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
                cArr3 = cArr7;
            }
            if (i4 > 0) {
                int i13 = 0;
                while (true) {
                    getaccounttype.writeReplace = i13;
                    if (getaccounttype.writeReplace >= i3) {
                        break;
                    }
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                    i13 = getaccounttype.writeReplace + 1;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        private static void c(int i, byte b, java.lang.String str, java.lang.Object[] objArr) {
            char[] cArr;
            int i2;
            if (str != null) {
                $11 = ($10 + 109) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
            char[] cArr3 = AlternateContactlessPaymentDataJson;
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 49, android.text.TextUtils.indexOf("", c, 0, 0) + 2509, (char) (6802 - android.graphics.Color.alpha(0)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(0, (short) 0, (byte) 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                        }
                        cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i3++;
                        $10 = ($11 + 3) % 128;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(writeReplace)};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
            if (obj2 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2509, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6802));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                d(0, (short) 0, (byte) 0, objArr5);
                obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
            char[] cArr5 = new char[i];
            if (i % 2 != 0) {
                int i4 = $10 + 15;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    i2 = i + 72;
                    cArr5[i2] = (char) (cArr2[i2] >> b);
                } else {
                    i2 = i - 1;
                    cArr5[i2] = (char) (cArr2[i2] - b);
                }
            } else {
                i2 = i;
            }
            int i5 = 13;
            if (i2 > 1) {
                digitizedCardJson12.values = 0;
                while (digitizedCardJson12.values < i2) {
                    $11 = ($10 + 73) % 128;
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                    if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                        $11 = ($10 + 17) % 128;
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    } else {
                        java.lang.Object[] objArr6 = new java.lang.Object[i5];
                        objArr6[12] = digitizedCardJson12;
                        objArr6[11] = java.lang.Integer.valueOf(charValue);
                        objArr6[10] = digitizedCardJson12;
                        objArr6[9] = digitizedCardJson12;
                        objArr6[8] = java.lang.Integer.valueOf(charValue);
                        objArr6[7] = digitizedCardJson12;
                        objArr6[6] = digitizedCardJson12;
                        objArr6[5] = java.lang.Integer.valueOf(charValue);
                        objArr6[4] = digitizedCardJson12;
                        objArr6[3] = digitizedCardJson12;
                        objArr6[2] = java.lang.Integer.valueOf(charValue);
                        objArr6[1] = digitizedCardJson12;
                        objArr6[0] = digitizedCardJson12;
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 29, 3597 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            java.lang.Class<?>[] clsArr = new java.lang.Class[i5];
                            clsArr[0] = java.lang.Object.class;
                            clsArr[1] = java.lang.Object.class;
                            clsArr[2] = java.lang.Integer.TYPE;
                            clsArr[3] = java.lang.Object.class;
                            clsArr[4] = java.lang.Object.class;
                            clsArr[5] = java.lang.Integer.TYPE;
                            clsArr[6] = java.lang.Object.class;
                            clsArr[7] = java.lang.Object.class;
                            clsArr[8] = java.lang.Integer.TYPE;
                            clsArr[9] = java.lang.Object.class;
                            clsArr[10] = java.lang.Object.class;
                            clsArr[11] = java.lang.Integer.TYPE;
                            clsArr[12] = java.lang.Object.class;
                            obj3 = cls3.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                        }
                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                            java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 48, 2665 - android.view.View.MeasureSpec.getMode(0), (char) (18888 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                d(0, (short) 0, (byte) $$d.length, objArr8);
                                obj4 = cls4.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                            int i6 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i7 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[intValue];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i6 * charValue) + i7];
                        } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i8 = digitizedCardJson12.DigitizedCardProfile;
                            int i9 = digitizedCardJson12.RecordsJson;
                            int i10 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i8 * charValue) + i9];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i10 * charValue) + i11];
                        } else {
                            int i12 = digitizedCardJson12.DigitizedCardProfile;
                            int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i14 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i15 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i12 * charValue) + i13];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i14 * charValue) + i15];
                        }
                    }
                    digitizedCardJson12.values += 2;
                    i5 = 13;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                $11 = ($10 + 13) % 128;
                cArr5[i16] = (char) (cArr5[i16] ^ 13722);
            }
            objArr[0] = new java.lang.String(cArr5);
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            DigitizedCardProfile = 0;
            getProfileVersion = 1;
            valueOf = new char[]{16851, 16627, 16612, 16631, 16637, 16634, 16582, 16701, 16631, 16637, 16612, 16631, 16637, 16634, 16614, 16701, 16615, 16608, 16634, 16633, 16615, 16637, 16616, 16631, 16769, 16726, 16733, 16735, 16730, 16730, 16714, 16712, 16733, 16735, 16733, 16730, 16705, 16715, 16705, 16727, 16733, 16823, 16703, 16697, 16675, 16685, 16675, 16700, 16703, 16673, 16703, 16682, 16684, 16700, 16698, 16780, 16712, 16709, 16708, 16710, 16708, 16819, 16821, 16709, 16709, 16710, 16708, 16705, 16707, 16709, 16707, 16705, 16730, 16734, 16708, 16803, 16802, 16707, 16732, 16731, 16734, 16707, 16731, 16827, 16829, 16732, 16831, 16813, 16870, 16790, 16812, 16809, 16808, 16810, 16808, 16793, 16789, 16804, 16804, 16805, 16808, 16802, 16769, 16727, 16734, 16717, 16821, 16817, 16719, 16852, 16882, 16774, 16796, 16741, 16739, 16737, 16762, 16766, 16740, 16707, 16706, 16739, 16764, 16763, 16766, 16739, 16763, 16731, 16733, 16764, 16735, 16717, 16722, 16744, 16741, 16740, 16742, 16740, 16725, 16721, 16736, 16736, 16871, 16810, 16823, 16818, 16829, 16830, 16831, 16803, 16801, 16801, 16827, 16792, 16646, 16683, 16677, 16673, 16676, 16678, 16680, 16684, 16676, 16700, 16701, 16679, 16680, 16679, 16681, 16659, 16753, 16642, 16675, 16640, 16670, 16702, 16678, 16677, 16702, 16675, 16678, 16805, 16757, 16760, 16641, 16666, 16645, 16649, 16670, 16761, 16767, 16644};
            AlternateContactlessPaymentDataJson = new char[]{12333, 12344, 13268, 13269, 12339, 12295, 12329, 12320, 12323, 12351, 12388, 12350, 13271, 13264, 12331, 12345, 13270, 13267, 12334, 12335, 13266, 12302, 13265, 12348, 12324};
            writeReplace = (char) 1493;
        }

        /* JADX WARN: Code restructure failed: missing block: B:212:0x0c5a, code lost:
        
            r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
            ((int[]) r0[0])[0] = r4;
            ((int[]) r0[1])[0] = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:215:0x0c73, code lost:
        
            r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r37), r31, java.lang.Integer.valueOf((((((~((-926311970) | r10)) | 103030816) | (~(970180191 | r10))) * (-397)) - 587851078) + ((249929854 | r4) * 397))};
            r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:216:0x0ca8, code lost:
        
            if (r1 != null) goto L187;
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x0caa, code lost:
        
            r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 2713 - android.graphics.Color.alpha(0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
            r3 = com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.$$a[14];
            r6 = new java.lang.Object[1];
            a(r3, r3, r3, r6);
            r1 = r1.getMethod((java.lang.String) r6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:220:0x0d00, code lost:
        
            ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r2)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:221:0x0d07, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:223:0x0d08, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:224:0x0d09, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:225:0x0d0d, code lost:
        
            if (r1 != null) goto L194;
         */
        /* JADX WARN: Code restructure failed: missing block: B:226:0x0d0f, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:227:0x0d10, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:251:0x0d58, code lost:
        
            r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
            ((int[]) r0[0])[0] = r4;
            ((int[]) r0[1])[0] = (~(r4 & 1)) & (r4 | 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:254:0x0d79, code lost:
        
            r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r37), 16, java.lang.Integer.valueOf(((((~((-1386304481) | r1)) * 979) - 1123363136) + ((510187680 | r4) * (-979))) + (((~((~r4) | 510187680)) | (~((-1386304481) | r4))) * 979))};
            r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:255:0x0db8, code lost:
        
            if (r1 != null) goto L218;
         */
        /* JADX WARN: Code restructure failed: missing block: B:256:0x0dba, code lost:
        
            r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.view.MotionEvent.axisFromString(r8) + 1));
            r2 = com.payair.hce.setAlwaysDrawnWithCacheEnabled.DigitizedCardProfile.$$a[14];
            r6 = new java.lang.Object[1];
            a(r2, r2, r2, r6);
            r1 = r1.getMethod((java.lang.String) r6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:259:0x0e0d, code lost:
        
            ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r3)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:260:0x0e14, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:262:0x0e15, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:263:0x0e16, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:264:0x0e1a, code lost:
        
            if (r1 != null) goto L225;
         */
        /* JADX WARN: Code restructure failed: missing block: B:265:0x0e1c, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:266:0x0e1d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r10v29 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r1v107, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r1v150, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r1v175, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r1v201, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r1v75, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v33, types: [int[]] */
        /* JADX WARN: Type inference failed for: r3v42, types: [int[]] */
        /* JADX WARN: Type inference failed for: r3v44, types: [int[]] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11, types: [int] */
        /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v23 */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r4v25, types: [int] */
        /* JADX WARN: Type inference failed for: r4v27, types: [int] */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v78 */
        /* JADX WARN: Type inference failed for: r4v79 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v132, types: [int[]] */
        /* JADX WARN: Type inference failed for: r5v147, types: [int[]] */
        /* JADX WARN: Type inference failed for: r5v165, types: [int[]] */
        /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v31 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v46 */
        /* JADX WARN: Type inference failed for: r7v48 */
        /* JADX WARN: Type inference failed for: r7v49 */
        /* JADX WARN: Type inference failed for: r7v5, types: [int] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v60 */
        /* JADX WARN: Type inference failed for: r7v67 */
        /* JADX WARN: Type inference failed for: r7v68 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
            ?? r7;
            ?? r4;
            int i4;
            java.lang.Integer num;
            java.nio.LongBuffer[] longBufferArr;
            java.lang.String str;
            java.lang.Object invoke;
            int i5;
            int i6;
            java.lang.String str2;
            java.lang.Object obj;
            java.lang.Object[] objArr;
            java.lang.Integer num2;
            int i7 = DigitizedCardProfile;
            int i8 = 1;
            int i9 = (((i7 | 33) << 1) - (i7 ^ 33)) % 128;
            getProfileVersion = i9;
            java.lang.Integer num3 = -1347122530;
            int i10 = 0;
            try {
                if (context == null) {
                    getProfileVersion = (i7 + 113) % 128;
                    java.lang.Object[] objArr2 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr2[0])[0] = i;
                    ((int[]) objArr2[1])[0] = i;
                    int i11 = ~i;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((-1084293233) | i) * (-676)) - 182745920) + (((~(i11 | 794224136)) | 1084293232) * 676) + (((~(i11 | (-1102268025))) | 17974792 | (~(i | 1878517368))) * 676))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                        byte b = $$a[14];
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        a(b, b, b, objArr4);
                        obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj2);
                    }
                    ((int[]) objArr2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    return objArr2;
                }
                int i12 = 16;
                if (strArr.length == 0) {
                    DigitizedCardProfile = (i9 + 27) % 128;
                    int i13 = ~i;
                    java.lang.Object[] objArr5 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr5[0])[0] = i;
                    ((int[]) objArr5[1])[0] = (i & (-5)) | (i13 & 4);
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i13 | 863664631)) | ((~((-1032827530) | i13)) | 210076168)) * (-397)) - 1461174142) + ((i | 250989438) * 397))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 50, 2714 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b2 = $$a[14];
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(b2, b2, b2, objArr7);
                        obj3 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj3);
                    }
                    ((int[]) objArr5[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue();
                    return objArr5;
                }
                int length = strArr.length;
                java.nio.LongBuffer[] longBufferArr2 = new java.nio.LongBuffer[length];
                DigitizedCardProfile = ((i9 ^ 23) + ((i9 & 23) << 1)) % 128;
                ?? r42 = 0;
                while (true) {
                    int i14 = 32;
                    if (r42 >= strArr.length) {
                        java.lang.Integer num4 = num3;
                        try {
                            if (context == null) {
                                try {
                                    java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                                    ((int[]) objArr8[0])[0] = i;
                                    ((int[]) objArr8[1])[0] = i;
                                    int i15 = ~i;
                                    try {
                                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-1819656261) | i15)) | (~((-41947193) | i15))) * (-184)) + 834285696 + (((~(i15 | (-1837100615))) | (~((-59391547) | i15)) | 17444354) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 2147412624)};
                                        try {
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                            if (obj4 == null) {
                                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0));
                                                byte b3 = $$a[14];
                                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                a(b3, b3, b3, objArr10);
                                                obj4 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj4);
                                            }
                                            ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
                                            return objArr8;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                } catch (java.lang.Throwable unused) {
                                    r4 = i;
                                    r7 = num4;
                                }
                            } else {
                                r4 = num4;
                                byte[][] bArr = new byte[length][];
                                int i16 = 0;
                                r7 = 0;
                                while (i16 < length) {
                                    java.nio.LongBuffer longBuffer = longBufferArr2[i16];
                                    if (longBuffer.capacity() == 4) {
                                        int i17 = DigitizedCardProfile;
                                        getProfileVersion = (((i17 | 117) << 1) - (i17 ^ 117)) % 128;
                                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i14);
                                        java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                                        long[] array = longBuffer.array();
                                        int i18 = 0;
                                        for (int length2 = array.length; i18 < length2; length2 = length2) {
                                            asLongBuffer.put(array[i18]);
                                            i18 = (i18 | 1) + (i18 & 1);
                                        }
                                        bArr[r7] = allocate.array();
                                        r7 = ((r7 | 1) << 1) - (r7 ^ 1);
                                    }
                                    int i19 = (i16 ^ 42) + ((i16 & 42) << 1);
                                    i16 = (i19 ^ (-41)) + ((i19 & (-41)) << 1);
                                    i14 = 32;
                                    r7 = r7;
                                }
                                if (r7 > 0) {
                                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                                    int i20 = (~(currentTimeMillis & 343337308)) & (343337308 | currentTimeMillis);
                                    try {
                                        java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i ^ i20), bArr, java.lang.Integer.valueOf((int) r7)};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                                        if (obj5 == null) {
                                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 429, (char) (31610 - android.view.View.MeasureSpec.getMode(0)));
                                            byte b4 = (byte) ($$a[14] - 1);
                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                            a(b4, b4, b4, objArr12);
                                            obj5 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj5);
                                        }
                                        r7 = 0;
                                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).longValue();
                                        long j = i;
                                        long j2 = ~(longValue | (-441989387));
                                        long j3 = ~longValue;
                                        longBufferArr = longBufferArr2;
                                        long j4 = ~j;
                                        i4 = length;
                                        num = 0;
                                        long j5 = ((989 * longValue) - 872929037350L) + ((j | j2) * 988) + (((~(j3 | 441989386)) | (~(j4 | 441989386))) * (-1976)) + ((j2 | (~(j3 | j)) | (~(j4 | longValue))) * 988) + 491911321;
                                        r4 = i;
                                        int i21 = ~r4;
                                        int i22 = ((int) (j5 >> 32)) & (((((-33640577) | i21) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 94383542) + (((~(704152858 | i21)) | (-38360459)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                        int i23 = ((int) j5) & ((((~((-57297391) | i21)) | (-1494523801)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-16779657) | i21)) | (~((-1477744145) | r4))) * (-519)) + (((~((-1494523801) | r4)) | 57297390) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                        int i24 = ((i23 ^ i22) | (i22 & i23)) ^ i20;
                                        if ((i2 & 1) == 1) {
                                            int i25 = getProfileVersion;
                                            int i26 = (i25 ^ 47) + ((i25 & 47) << 1);
                                            DigitizedCardProfile = i26 % 128;
                                            if (i26 % 2 == 0 ? ((~(i24 & r4)) & (i24 | r4)) == 15 : ((i24 & i21) | ((~i24) & r4)) == 115) {
                                                try {
                                                    java.lang.Object[] objArr13 = {new int[1], new int[1], new int[1]};
                                                    ((int[]) objArr13[0])[0] = r4;
                                                    ((int[]) objArr13[1])[0] = i24;
                                                    try {
                                                        objArr = new java.lang.Object[]{java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-679547233) | i21)) | (~((-1081082369) | i21))) * (-184)) + 834285696 + (((~((-747478513) | i21)) | 67931280 | (~((-1149013649) | i21))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1447752832)};
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                    }
                                                    try {
                                                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r4);
                                                        if (obj6 == null) {
                                                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                            byte b5 = $$a[14];
                                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                            a(b5, b5, b5, objArr14);
                                                            obj6 = cls5.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r4, obj6);
                                                        }
                                                        ((int[]) objArr13[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr)).intValue();
                                                        return objArr13;
                                                    } catch (java.lang.Throwable th4) {
                                                        th = th4;
                                                        java.lang.Throwable cause2 = th.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable unused2) {
                                                    r7 = r4;
                                                }
                                            }
                                        }
                                        r7 = r4;
                                        if (((~(i24 & r4)) & (i24 | r4)) == 0) {
                                            java.lang.Object[] objArr15 = {new int[1], new int[1], new int[1]};
                                            ((int[]) objArr15[0])[0] = r4;
                                            ((int[]) objArr15[1])[0] = i24;
                                            try {
                                                java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), null, java.lang.Integer.valueOf(((((~((-18886789) | r4)) | (~(1877605372 | i21))) * (-318)) - 3959728) + (((~(228653236 | r4)) | 1648952136) * (-318)) + (((~((-228653237) | r4)) | (-1667838925)) * 318))};
                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                                                if (obj7 == null) {
                                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                    byte b6 = $$a[14];
                                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                    a(b6, b6, b6, objArr17);
                                                    obj7 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, obj7);
                                                }
                                                ((int[]) objArr15[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr16)).intValue();
                                                return objArr15;
                                            } catch (java.lang.Throwable th5) {
                                                java.lang.Throwable cause3 = th5.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th5;
                                            }
                                        }
                                        str = "";
                                        int i27 = (i24 & i21) | ((~i24) & r4);
                                        r4 = r4;
                                        r7 = r7;
                                        if (i27 == 11) {
                                            DigitizedCardProfile = (getProfileVersion + 101) % 128;
                                            java.lang.Object[] objArr18 = {new int[1], new int[1], new int[1]};
                                            ((int[]) objArr18[0])[0] = r4;
                                            ((int[]) objArr18[1])[0] = i24;
                                            try {
                                                java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-719361578) | i21)) | 1177130583) * (-235)) - 1651636259) + (((~((-719361578) | r4)) | 1177130583) * (-470)) + (((~((-683671593) | r4)) | 1141440598) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))};
                                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                                                if (obj8 == null) {
                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) android.text.TextUtils.indexOf(str, str, 0));
                                                    byte b7 = $$a[14];
                                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                    a(b7, b7, b7, objArr20);
                                                    obj8 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, obj8);
                                                }
                                                ((int[]) objArr18[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr19)).intValue();
                                                return objArr18;
                                            } catch (java.lang.Throwable th6) {
                                                java.lang.Throwable cause4 = th6.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th6;
                                            }
                                        }
                                    } catch (java.lang.Throwable th7) {
                                        java.lang.Throwable cause5 = th7.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th7;
                                    }
                                } else {
                                    i4 = length;
                                    r7 = r4;
                                    num = 0;
                                    longBufferArr = longBufferArr2;
                                    str = "";
                                    r4 = i;
                                }
                                int i28 = getProfileVersion;
                                DigitizedCardProfile = (((i28 | 3) << 1) - (i28 ^ 3)) % 128;
                                try {
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    b(new int[]{1, 23, 197, 22}, true, null, objArr21);
                                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    b(new int[]{24, 17, 45, 0}, true, "\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr22);
                                    java.lang.Object invoke2 = cls8.getMethod((java.lang.String) objArr22[0], null).invoke(context, null);
                                    int i29 = DigitizedCardProfile;
                                    int i30 = ((i29 | 105) << 1) - (i29 ^ 105);
                                    getProfileVersion = i30 % 128;
                                    try {
                                        if (i30 % 2 == 0) {
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            b(new int[]{1, 23, 197, 22}, true, null, objArr23);
                                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            b(new int[]{41, 14, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 0}, true, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", objArr24);
                                            invoke = cls9.getMethod((java.lang.String) objArr24[0], null).invoke(context, null);
                                            i5 = 40;
                                        } else {
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            b(new int[]{1, 23, 197, 22}, true, null, objArr25);
                                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b(new int[]{41, 14, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 0}, false, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", objArr26);
                                            invoke = cls10.getMethod((java.lang.String) objArr26[0], null).invoke(context, null);
                                            i5 = 64;
                                        }
                                        try {
                                            java.lang.Object[] objArr27 = {invoke, java.lang.Integer.valueOf(i5)};
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            b(new int[]{55, 33, 36, 13}, false, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", objArr28);
                                            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            b(new int[]{88, 14, 0, 11}, false, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr29);
                                            java.lang.Object invoke3 = cls11.getMethod((java.lang.String) objArr29[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke2, objArr27);
                                            int i31 = i4;
                                            int i32 = 0;
                                            loop3: while (true) {
                                                if (i32 >= i31) {
                                                    break;
                                                }
                                                java.nio.LongBuffer longBuffer2 = longBufferArr[i32];
                                                if (longBuffer2.capacity() == 4) {
                                                    int i33 = getProfileVersion + 71;
                                                    DigitizedCardProfile = i33 % 128;
                                                    if (i33 % 2 != 0) {
                                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                        b(new int[]{102, 7, 76, 0}, false, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr30);
                                                        obj = objArr30[0];
                                                    } else {
                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                        b(new int[]{102, 7, 76, 0}, false, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr31);
                                                        obj = objArr31[0];
                                                    }
                                                    str2 = (java.lang.String) obj;
                                                    i6 = 0;
                                                } else {
                                                    i6 = 0;
                                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                    b(new int[]{109, 3, 0, 0}, true, "\u0001\u0001\u0001", objArr32);
                                                    str2 = (java.lang.String) objArr32[0];
                                                }
                                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                b(new int[]{112, 30, 68, i6}, i6, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr33);
                                                java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr33[i6]);
                                                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i6, i6);
                                                int i34 = absoluteGravity * (-500);
                                                int i35 = (i34 ^ (-5000)) + ((i34 & (-5000)) << 1);
                                                int i36 = ~((absoluteGravity & (-11)) | (absoluteGravity ^ (-11)));
                                                int i37 = ~absoluteGravity;
                                                int i38 = i37 | 10;
                                                int i39 = ~((i38 ^ r4) | (i38 & r4));
                                                int i40 = ((i36 ^ i39) | (i36 & i39)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                                int i41 = ((i35 | i40) << 1) - (i40 ^ i35);
                                                int i42 = -(-((~(i37 | (-11))) * 1002));
                                                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                                                int i44 = ~r4;
                                                int i45 = i37 | i44;
                                                int i46 = (~((i45 ^ 10) | (i45 & 10))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                                int i47 = -android.view.View.MeasureSpec.getMode(0);
                                                int i48 = (i47 * 46) + 4186;
                                                int i49 = -(-(((~(i44 | (-92))) | i47) * (-90)));
                                                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                                                int i51 = ~((r4 ^ (-92)) | (r4 & (-92)));
                                                int i52 = ~((i47 ^ 91) | (i47 & 91));
                                                int i53 = ((i51 & i52) | (i51 ^ i52)) * (-45);
                                                int i54 = ~i47;
                                                int i55 = (~((i54 & r4) | (i54 ^ r4))) | (-92);
                                                int i56 = ~((i47 & i44) | (i47 ^ i44));
                                                byte b8 = (byte) ((((i50 | i53) << 1) - (i50 ^ i53)) + (((i56 & i55) | (i56 ^ i55)) * 45));
                                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                c((i43 ^ i46) + ((i46 & i43) << 1), b8, "\u0012\u0005\u0004\u0014\n\f\u0006\u0004\u000f\u0010", objArr34);
                                                java.lang.Object[] objArr35 = (java.lang.Object[]) cls12.getField((java.lang.String) objArr34[0]).get(invoke3);
                                                int length3 = objArr35.length;
                                                int i57 = DigitizedCardProfile;
                                                getProfileVersion = ((i57 ^ 9) + ((i57 & 9) << 1)) % 128;
                                                int i58 = 0;
                                                while (i58 < length3) {
                                                    java.lang.Object obj9 = objArr35[i58];
                                                    getProfileVersion = (DigitizedCardProfile + 35) % 128;
                                                    try {
                                                        java.lang.Object[] objArr36 = {str2};
                                                        int i59 = -android.text.TextUtils.getOffsetBefore(str, 0);
                                                        int indexOf = android.text.TextUtils.indexOf(str, str);
                                                        java.lang.Object obj10 = invoke3;
                                                        int i60 = indexOf * (-515);
                                                        int i61 = i31;
                                                        int i62 = (i60 ^ 26367) + ((i60 & 26367) << 1);
                                                        int i63 = ~((r4 ^ (-52)) | (r4 & (-52)));
                                                        java.lang.String str3 = str2;
                                                        int i64 = ~((i44 ^ indexOf) | (i44 & indexOf));
                                                        int i65 = (i63 ^ i64) | (i63 & i64);
                                                        int i66 = ~((i44 ^ 51) | (i44 & 51));
                                                        int i67 = -(-(((i65 ^ i66) | (i65 & i66)) * (-516)));
                                                        int i68 = (i62 ^ i67) + ((i67 & i62) << 1);
                                                        int i69 = ~indexOf;
                                                        int i70 = i69 | (-52);
                                                        int i71 = ~((i70 ^ r4) | (i70 & r4));
                                                        int i72 = ~((i69 ^ i44) | (i69 & i44) | 51);
                                                        int i73 = -(-(((i71 ^ i72) | (i71 & i72)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                                                        int i74 = ~((i69 ^ 51) | (i69 & 51));
                                                        int i75 = i68 ^ i73;
                                                        int i76 = i68 & i73;
                                                        java.lang.Object[] objArr37 = objArr35;
                                                        byte b9 = (byte) (((i75 + (i76 << 1)) - (~(((i74 & i66) | (i74 ^ i66)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) - 1);
                                                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                        c(((i59 | 27) << 1) - (i59 ^ 27), b9, "\t\f\u0018\r\u000f\u0014\u0010\t\u0006\u0004\u0006\r\u0000\u000e\t\u000f㘜㘜\n\u0004\u0010\u0018\u0005\u0003\u000f\u0010㘡", objArr38);
                                                        java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr38[0]);
                                                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                        b(new int[]{142, 11, 9, 8}, false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", objArr39);
                                                        java.lang.Object invoke4 = cls13.getMethod((java.lang.String) objArr39[0], java.lang.String.class).invoke(null, objArr36);
                                                        try {
                                                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                            b(new int[]{153, 28, 127, 8}, true, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", objArr40);
                                                            java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr40[0]);
                                                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                            b(new int[]{181, 11, 94, 4}, true, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr41);
                                                            try {
                                                                java.lang.Object[] objArr42 = {cls14.getMethod((java.lang.String) objArr41[0], null).invoke(obj9, null)};
                                                                int i77 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                int i78 = i77 * 503;
                                                                int i79 = ((((i78 | 13581) << 1) - (i78 ^ 13581)) - (~(-(-((i77 | 27) * (-502)))))) - 1;
                                                                int i80 = ~i77;
                                                                int i81 = (~(i80 | (-28))) | (~((i80 ^ i44) | (i80 & i44)));
                                                                int i82 = (i77 ^ 27) | (i77 & 27);
                                                                int i83 = ~((i82 ^ r4) | (i82 & r4));
                                                                int i84 = ((i81 & i83) | (i81 ^ i83)) * (-502);
                                                                int i85 = ~(i80 | i44 | 27);
                                                                int i86 = length3;
                                                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                                c(((((i79 | i84) << 1) - (i79 ^ i84)) - (~(((i83 ^ i85) | (i83 & i85)) * 502))) - 1, (byte) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 51), "\t\f\u0018\r\u000f\u0014\u0010\t\u0006\u0004\u0006\r\u0000\u000e\t\u000f㘜㘜\n\u0004\u0010\u0018\u0005\u0003\u000f\u0010㘡", objArr43);
                                                                java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                                                                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                                int i87 = (scrollDefaultDelay * (-1965)) + 5904;
                                                                int i88 = -(-(((scrollDefaultDelay ^ (-7)) | (scrollDefaultDelay & (-7))) * 983));
                                                                int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
                                                                int i90 = ~scrollDefaultDelay;
                                                                int i91 = -(-(((~((i44 & (-7)) | (i44 ^ (-7)))) | i90) * (-983)));
                                                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                                c((i89 & i91) + (i91 | i89) + (((~((i90 & i44) | (i90 ^ i44))) | (~((i90 ^ 6) | (i90 & 6)))) * 983), (byte) (51 - android.widget.ExpandableListView.getPackedPositionType(0L)), "\u0017\r\u0004\u000f\u0010\n", objArr44);
                                                                if (java.nio.ByteBuffer.wrap((byte[]) cls15.getMethod((java.lang.String) objArr44[0], byte[].class).invoke(invoke4, objArr42)).asLongBuffer().equals(longBuffer2.rewind())) {
                                                                    break loop3;
                                                                }
                                                                i58 = ((i58 | 1) << 1) - (i58 ^ 1);
                                                                invoke3 = obj10;
                                                                objArr35 = objArr37;
                                                                length3 = i86;
                                                                str2 = str3;
                                                                i31 = i61;
                                                            } catch (java.lang.Throwable th8) {
                                                                java.lang.Throwable cause6 = th8.getCause();
                                                                if (cause6 != null) {
                                                                    throw cause6;
                                                                }
                                                                throw th8;
                                                            }
                                                        } catch (java.lang.Throwable th9) {
                                                            java.lang.Throwable cause7 = th9.getCause();
                                                            if (cause7 != null) {
                                                                throw cause7;
                                                            }
                                                            throw th9;
                                                        }
                                                    } catch (java.lang.Throwable th10) {
                                                        java.lang.Throwable cause8 = th10.getCause();
                                                        if (cause8 != null) {
                                                            throw cause8;
                                                        }
                                                        throw th10;
                                                    }
                                                }
                                                i32 = ((i32 | 1) << 1) - (i32 ^ 1);
                                                invoke3 = invoke3;
                                                i31 = i31;
                                            }
                                        } catch (java.lang.Throwable th11) {
                                            java.lang.Throwable cause9 = th11.getCause();
                                            if (cause9 != null) {
                                                throw cause9;
                                            }
                                            throw th11;
                                        }
                                    } catch (java.lang.Throwable th12) {
                                        java.lang.Throwable cause10 = th12.getCause();
                                        if (cause10 != null) {
                                            throw cause10;
                                        }
                                        throw th12;
                                    }
                                } catch (java.lang.Throwable th13) {
                                    java.lang.Throwable cause11 = th13.getCause();
                                    if (cause11 != null) {
                                        throw cause11;
                                    }
                                    throw th13;
                                }
                            }
                        } catch (java.lang.Throwable unused3) {
                            r7 = r42;
                            r4 = i;
                        }
                        int i92 = ~r4;
                        java.lang.Object[] objArr45 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr45[0])[0] = r4;
                        ((int[]) objArr45[1])[0] = (r4 & (-3)) | (i92 & 2);
                        java.lang.Object[] objArr46 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1145409133 | i92)) | 751083027) * (-328)) + 1651520216 + ((751083027 | r4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(i92 | 1824890495)) | (~(r4 | (-1145409134))) | 71601665) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                        if (obj11 == null) {
                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                            byte b10 = $$a[14];
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            a(b10, b10, b10, objArr47);
                            obj11 = cls16.getMethod((java.lang.String) objArr47[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, obj11);
                        }
                        ((int[]) objArr45[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr46)).intValue();
                        return objArr45;
                    }
                    java.lang.String lowerCase = strArr[r42].toLowerCase();
                    java.lang.Object[] objArr48 = new java.lang.Object[i8];
                    b(new int[]{i10, i8, i10, i10}, i10, "\u0000", objArr48);
                    java.lang.String replaceAll = lowerCase.replaceAll((java.lang.String) objArr48[i10], "");
                    long longValue2 = new java.math.BigInteger(replaceAll.substring(i12, 32), i12).longValue();
                    long longValue3 = new java.math.BigInteger(replaceAll.substring(i10, i12), i12).longValue();
                    int length4 = replaceAll.length();
                    if (length4 == 32) {
                        num2 = num3;
                        longBufferArr2[r42] = java.nio.LongBuffer.allocate(2).put(longValue3).put(longValue2);
                    } else {
                        if (length4 != 64) {
                            int i93 = ~i;
                            java.lang.Object[] objArr49 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr49[i10])[i10] = i;
                            ((int[]) objArr49[1])[i10] = (i & (-4)) | (i93 & 3);
                            java.lang.Object[] objArr50 = new java.lang.Object[3];
                            objArr50[2] = java.lang.Integer.valueOf((((~((-77245716) | i)) | 67775745) * 345) + 441725952 + (((~(i93 | (-77245716))) | 1751470700) * 345) + ((~((-67775746) | i)) * 345));
                            objArr50[1] = 16;
                            objArr50[i10] = java.lang.Integer.valueOf(i3);
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                            if (obj12 == null) {
                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50, 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(i10) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i10) == 0L ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(i10)));
                                byte b11 = $$a[14];
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                a(b11, b11, b11, objArr51);
                                java.lang.String str4 = (java.lang.String) objArr51[i10];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[3];
                                clsArr[i10] = java.lang.Integer.TYPE;
                                clsArr[1] = java.lang.Integer.TYPE;
                                clsArr[2] = java.lang.Integer.TYPE;
                                obj12 = cls17.getMethod(str4, clsArr);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj12);
                            }
                            ((int[]) objArr49[2])[i10] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr50)).intValue();
                            return objArr49;
                        }
                        num2 = num3;
                        longBufferArr2[r42] = java.nio.LongBuffer.allocate(4).put(longValue3).put(longValue2).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                    }
                    int i94 = DigitizedCardProfile;
                    getProfileVersion = ((i94 & 27) + (i94 | 27)) % 128;
                    num3 = num2;
                    i8 = 1;
                    i10 = 0;
                    i12 = 16;
                    r42 = ((r42 & 1) << 1) + (r42 ^ 1);
                }
            } catch (java.lang.Throwable th14) {
                java.lang.Throwable cause12 = th14.getCause();
                if (cause12 != null) {
                    throw cause12;
                }
                throw th14;
            }
        }

        static void init$1() {
            $$d = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, -101, com.google.common.base.Ascii.SI};
            $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
        }

        static void init$0() {
            $$a = new byte[]{92, -25, 4, -11, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
            $$b = 151;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
            return writeReplace(new java.lang.Object[]{this, flowCollector, continuation}, 2021538698, -2021538698, java.lang.System.identityHashCode(this));
        }
    }

    public static final class valueOf implements kotlinx.coroutines.flow.Flow<java.lang.Boolean> {
        private static int AlternateContactlessPaymentDataJson = 1;
        private static int writeReplace;
        private /* synthetic */ kotlinx.coroutines.flow.Flow valueOf;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            return valueOf(objArr);
        }

        public valueOf(kotlinx.coroutines.flow.Flow flow) {
            this.valueOf = flow;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf valueof = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf) objArr[0];
            final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) objArr[1];
            java.lang.Object collect = valueof.valueOf.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.3
                private static int $DigitizedCardProfile = 1;
                private static int $writeReplace;

                public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i, int i2, int i3) {
                    return valueOf(objArr2);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0124 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                    com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.AnonymousClass4 anonymousClass4;
                    int i;
                    int i2;
                    boolean z = false;
                    com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3 anonymousClass3 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3) objArr2[0];
                    java.lang.Object obj = objArr2[1];
                    kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr2[2];
                    int i3 = $writeReplace;
                    int i4 = i3 + 7;
                    $DigitizedCardProfile = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    if (continuation instanceof com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.AnonymousClass4) {
                        int i5 = i3 ^ 87;
                        int i6 = ((i3 & 87) | i5) << 1;
                        int i7 = -i5;
                        int i8 = (i6 & i7) + (i6 | i7);
                        $DigitizedCardProfile = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = ((com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.AnonymousClass4) continuation).values;
                            throw null;
                        }
                        anonymousClass4 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.AnonymousClass4) continuation;
                        if ((anonymousClass4.values & Integer.MIN_VALUE) != 0) {
                            int i10 = anonymousClass4.values;
                            int i11 = i10 & Integer.MIN_VALUE;
                            anonymousClass4.values = i11 + ((i10 ^ Integer.MIN_VALUE) | i11);
                            int i12 = $writeReplace;
                            $DigitizedCardProfile = ((i12 & 95) + (i12 | 95)) % 128;
                            java.lang.Object obj2 = anonymousClass4.writeReplace;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass4.values;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = kotlinx.coroutines.flow.FlowCollector.this;
                                java.lang.Boolean bool = (java.lang.Boolean) ((androidx.content.preferences.core.Preferences) obj).get((androidx.datastore.preferences.core.Preferences.Key) com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(new java.lang.Object[0], 126912718, -126912718, (int) java.lang.System.currentTimeMillis()));
                                if (bool != null) {
                                    $DigitizedCardProfile = ($writeReplace + 35) % 128;
                                    z = bool.booleanValue();
                                    int i13 = $DigitizedCardProfile;
                                    int i14 = ((i13 ^ 81) | (i13 & 81)) << 1;
                                    int i15 = -((i13 & (-82)) | ((~i13) & 81));
                                    $writeReplace = ((i14 & i15) + (i15 | i14)) % 128;
                                } else {
                                    int i16 = $writeReplace;
                                    $DigitizedCardProfile = (((i16 | 103) << 1) - (i16 ^ 103)) % 128;
                                }
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                                anonymousClass4.values = 1;
                                if (flowCollector2.emit(boxBoolean, anonymousClass4) == coroutine_suspended) {
                                    int i17 = $DigitizedCardProfile;
                                    int i18 = i17 & 91;
                                    int i19 = (i17 ^ 91) | i18;
                                    int i20 = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
                                    $writeReplace = i20;
                                    int i21 = (((i20 | 62) << 1) - (i20 ^ 62)) - 1;
                                    $DigitizedCardProfile = i21 % 128;
                                    if (i21 % 2 != 0) {
                                        return coroutine_suspended;
                                    }
                                    throw null;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                int i22 = $DigitizedCardProfile;
                                int i23 = i22 & 63;
                                int i24 = (i22 ^ 63) | i23;
                                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                                $writeReplace = i25 % 128;
                                int i26 = i25 % 2;
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            int i27 = $writeReplace;
                            int i28 = i27 ^ 49;
                            i2 = (((i27 & 49) | i28) << 1) - i28;
                            $DigitizedCardProfile = i2 % 128;
                            if (i2 % 2 == 0) {
                                return unit;
                            }
                            throw null;
                        }
                    }
                    anonymousClass4 = new com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.AnonymousClass4(continuation);
                    int i29 = $DigitizedCardProfile;
                    $writeReplace = (((i29 | 57) << 1) - (i29 ^ 57)) % 128;
                    java.lang.Object obj22 = anonymousClass4.writeReplace;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass4.values;
                    if (i != 0) {
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    int i272 = $writeReplace;
                    int i282 = i272 ^ 49;
                    i2 = (((i272 & 49) | i282) << 1) - i282;
                    $DigitizedCardProfile = i2 % 128;
                    if (i2 % 2 == 0) {
                    }
                }

                /* renamed from: com.payair.hce.setAlwaysDrawnWithCacheEnabled$valueOf$3$4, reason: invalid class name */
                public static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    private static int DigitizedCardProfile = 1;
                    private static int valueOf;
                    int values;
                    /* synthetic */ java.lang.Object writeReplace;

                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                        return valueOf(objArr);
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                        com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.AnonymousClass4 anonymousClass4 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.AnonymousClass4) objArr[0];
                        java.lang.Object obj = objArr[1];
                        int i = DigitizedCardProfile;
                        int i2 = (i & (-22)) | ((~i) & 21);
                        int i3 = -(-((i & 21) << 1));
                        valueOf = ((i2 & i3) + (i3 | i2)) % 128;
                        anonymousClass4.writeReplace = obj;
                        int i4 = anonymousClass4.values;
                        anonymousClass4.values = (i4 ^ Integer.MIN_VALUE) | (i4 & Integer.MIN_VALUE);
                        com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3 anonymousClass3 = com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.this;
                        java.lang.Object DigitizedCardProfile2 = com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf.AnonymousClass3.DigitizedCardProfile(new java.lang.Object[]{anonymousClass3, null, anonymousClass4}, -12070836, 12070836, java.lang.System.identityHashCode(anonymousClass3));
                        int i5 = valueOf + 103;
                        DigitizedCardProfile = i5 % 128;
                        if (i5 % 2 != 0) {
                            return DigitizedCardProfile2;
                        }
                        throw null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        return DigitizedCardProfile(new java.lang.Object[]{this, obj}, 50750790, -50750790, java.lang.System.identityHashCode(this));
                    }

                    public AnonymousClass4(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    return DigitizedCardProfile(new java.lang.Object[]{this, obj, continuation}, -12070836, 12070836, java.lang.System.identityHashCode(this));
                }
            }, (kotlin.coroutines.Continuation) objArr[2]);
            if (collect != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                AlternateContactlessPaymentDataJson = (writeReplace + 69) % 128;
                return unit;
            }
            int i = AlternateContactlessPaymentDataJson;
            int i2 = (-2) - (~((i & 68) + (i | 68)));
            writeReplace = i2 % 128;
            if (i2 % 2 == 0) {
                return collect;
            }
            throw null;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
            return values(new java.lang.Object[]{this, flowCollector, continuation}, -1734420734, 1734420734, java.lang.System.identityHashCode(this));
        }
    }

    public static final class writeReplace extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AlternateContactlessPaymentDataJson;
        private static int DigitizedCardProfile;
        private static int RecordsJson;
        private static final int SdkCoreAlternateContactlessPaymentDataImpl = 0;
        private static final byte[] getProfileVersion = null;
        private static char values;
        private /* synthetic */ java.lang.Object valueOf;
        private int writeReplace;

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace writereplace = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace) objArr[0];
            java.lang.Object obj = objArr[1];
            int i4 = DigitizedCardProfile + 73;
            RecordsJson = i4 % 128;
            if (i4 % 2 == 0) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = writereplace.writeReplace;
                kotlin.ResultKt.throwOnFailure(obj);
                ((androidx.content.preferences.core.MutablePreferences) writereplace.valueOf).set((androidx.datastore.preferences.core.Preferences.Key) com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(new java.lang.Object[0], 964626834, -964626833, (int) java.lang.System.currentTimeMillis()), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            } else {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = writereplace.writeReplace;
                kotlin.ResultKt.throwOnFailure(obj);
                ((androidx.content.preferences.core.MutablePreferences) writereplace.valueOf).set((androidx.datastore.preferences.core.Preferences.Key) com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(new java.lang.Object[0], 964626834, -964626833, (int) java.lang.System.currentTimeMillis()), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, short s, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5 = s * 27;
            int i6 = 37 - (i2 * 33);
            int i7 = (i * 19) + 99;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5 + 7];
            if (bArr == null) {
                int i8 = i6;
                int i9 = 0;
                i6 += i7;
                i4 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i6;
                if (i3 == i5 + 6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i10 = i3 + 1;
                i8 = i4;
                i7 = bArr[i4];
                i9 = i10;
                i6 += i7;
                i4 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i6;
                if (i3 == i5 + 6) {
                }
            } else {
                i3 = 0;
                i6 = i7;
                i4 = i6;
                bArr2[i3] = (byte) i6;
                if (i3 == i5 + 6) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(byte b, int i, short s, java.lang.Object[] objArr) {
            int i2;
            int i3 = 73 - (b * 8);
            int i4 = 4 - (s * 3);
            int i5 = i * 4;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                i3 = i6;
                int i7 = i4;
                i2 = 0;
                i4++;
                i3 += -i7;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i4];
                i2++;
                i4++;
                i3 += -i7;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            }
        }

        private static void b(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
            int i2;
            java.lang.Object obj;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
            char[] cArr = AlternateContactlessPaymentDataJson;
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            java.lang.Object obj2 = null;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                $11 = ($10 + 85) % 128;
                int i3 = 0;
                while (i3 < length) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.argb(0, 0, 0, 0), 2556 - android.text.AndroidCharacter.getMirror(c), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 6802));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d((byte) 1, 0, (short) 0, objArr3);
                            obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                        }
                        cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
                        i3++;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(values)};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 2508 - android.text.TextUtils.getOffsetBefore("", 0), (char) (6802 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                d((byte) 1, 0, (short) 0, objArr5);
                obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                int i4 = $11 + 113;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    i2 = i + 58;
                    cArr3[i2] = (char) (charArray[i2] - b);
                } else {
                    i2 = i - 1;
                    cArr3[i2] = (char) (charArray[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                digitizedCardJson12.values = 0;
                $10 = ($11 + 95) % 128;
                while (digitizedCardJson12.values < i2) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                    if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                        int i5 = $11 + 11;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf >> b);
                            cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.writeReplace << b);
                        } else {
                            cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                            cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                        }
                        obj = obj2;
                    } else {
                        java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                        if (obj5 == null) {
                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 30, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3595, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj5);
                        }
                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                            java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                            if (obj6 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 48, 2665 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (18889 - android.view.View.resolveSizeAndState(0, 0, 0)));
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                d((byte) 0, 0, (short) 0, objArr8);
                                obj6 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                            }
                            obj = null;
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                            int i6 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i7 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[intValue];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i6 * charValue) + i7];
                        } else {
                            obj = null;
                            if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                                digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                                digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                                int i8 = digitizedCardJson12.DigitizedCardProfile;
                                int i9 = digitizedCardJson12.RecordsJson;
                                int i10 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                                int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                                cArr3[digitizedCardJson12.values] = cArr[(i8 * charValue) + i9];
                                cArr3[digitizedCardJson12.values + 1] = cArr[(i10 * charValue) + i11];
                            } else {
                                int i12 = digitizedCardJson12.DigitizedCardProfile;
                                int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                                int i14 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                                int i15 = digitizedCardJson12.RecordsJson;
                                cArr3[digitizedCardJson12.values] = cArr[(i12 * charValue) + i13];
                                cArr3[digitizedCardJson12.values + 1] = cArr[(i14 * charValue) + i15];
                            }
                        }
                    }
                    digitizedCardJson12.values += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr3[i16] = (char) (cArr3[i16] ^ 13722);
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x052a A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void valueOf(long j, long j2) {
            int i;
            int i2;
            int i3;
            java.lang.Object obj;
            java.lang.Object obj2;
            java.lang.Object obj3;
            java.lang.Object invoke;
            java.lang.Object[] objArr;
            java.lang.Class<?> cls;
            java.lang.Object[] objArr2;
            com.payair.hce.setAddStatesFromChildren setaddstatesfromchildren = new com.payair.hce.setAddStatesFromChildren(j, j2);
            byte[] bArr = getProfileVersion;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            char c = 372;
            a(bArr[26], (short) 372, bArr[29], objArr3);
            java.lang.String str = (java.lang.String) objArr3[0];
            byte b = bArr[29];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(b, b, (short) (b | 372), objArr4);
            try {
                java.lang.Object[] objArr5 = {(java.lang.String) objArr4[0]};
                char c2 = 380;
                char c3 = 407;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a((byte) (-bArr[380]), bArr[407], 372, objArr6);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a((byte) (bArr[558] + 1), bArr[27], 387, objArr7);
                java.lang.String str2 = (java.lang.String) objArr7[0];
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a((byte) (-bArr[380]), bArr[407], 372, objArr8);
                java.lang.Object[] objArr9 = (java.lang.Object[]) cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr8[0])).invoke(str, objArr5);
                int[] iArr = new int[objArr9.length];
                int i4 = 0;
                while (true) {
                    i = 8;
                    if (i4 >= objArr9.length) {
                        break;
                    }
                    java.lang.Object[] objArr10 = {objArr9[i4]};
                    byte[] bArr2 = getProfileVersion;
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) (-bArr2[380]), bArr2[414], 391, objArr11);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b2 = (byte) (-bArr2[2]);
                    short s = bArr2[8];
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(b2, s, (short) (s | 401), objArr12);
                    java.lang.String str3 = (java.lang.String) objArr12[0];
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a((byte) (-bArr2[380]), bArr2[407], 372, objArr13);
                    java.lang.Object invoke2 = cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr13[0])).invoke(null, objArr10);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a((byte) (-bArr2[380]), bArr2[414], 391, objArr14);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a((short) 61, bArr2[10], com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE, objArr15);
                    iArr[i4] = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr15[0], null).invoke(invoke2, null)).intValue();
                    i4++;
                }
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    try {
                    } catch (java.lang.Throwable th) {
                        th = th;
                        i2 = i;
                    }
                    switch (setaddstatesfromchildren.valueOf(iArr[i5])) {
                        case -37:
                            i5 = 107;
                        case -36:
                            i2 = i;
                            setaddstatesfromchildren.valueOf(39);
                            if (setaddstatesfromchildren.values != 22) {
                                i5 = 79;
                                i = i2;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            } else {
                                i = i2;
                                i5 = 27;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            }
                        case -35:
                            i5 = 108;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -34:
                            i5 = 110;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -33:
                            i2 = i;
                            setaddstatesfromchildren.valueOf(37);
                            if (setaddstatesfromchildren.values == 0) {
                                i5 = 78;
                                i = i2;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            }
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -32:
                            setaddstatesfromchildren.writeReplace = 1;
                            setaddstatesfromchildren.valueOf(7);
                            i2 = 8;
                            try {
                                setaddstatesfromchildren.valueOf(8);
                                DigitizedCardProfile = setaddstatesfromchildren.values;
                                i5 = i6;
                                i = i2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                if (i6 >= 27) {
                                }
                                throw th;
                            }
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                            break;
                        case -31:
                            i3 = RecordsJson;
                            setaddstatesfromchildren.writeReplace = i3;
                            setaddstatesfromchildren.valueOf(2);
                            i2 = 8;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -30:
                            i5 = 55;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                            i = 8;
                        case -29:
                            i5 = 69;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                            i = 8;
                        case -28:
                            setaddstatesfromchildren.valueOf(34);
                            if (setaddstatesfromchildren.values == 0) {
                                i5 = 68;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                                i = 8;
                            } else {
                                i2 = 8;
                                i5 = i6;
                                i = i2;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            }
                        case -27:
                            setaddstatesfromchildren.writeReplace = 1;
                            setaddstatesfromchildren.valueOf(7);
                            setaddstatesfromchildren.valueOf(8);
                            RecordsJson = setaddstatesfromchildren.values;
                            i2 = 8;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -26:
                            i3 = DigitizedCardProfile;
                            setaddstatesfromchildren.writeReplace = i3;
                            setaddstatesfromchildren.valueOf(2);
                            i2 = 8;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -25:
                            i5 = 70;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                            i = 8;
                        case -24:
                            i5 = 1;
                        case -23:
                            return;
                        case -22:
                            byte b3 = $$a[34];
                            byte b4 = (byte) (b3 - 1);
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            c(b3, b4, b4, objArr16);
                            obj = (java.lang.String) objArr16[0];
                            setaddstatesfromchildren.getAid = obj;
                            setaddstatesfromchildren.valueOf(1);
                            i2 = 8;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -21:
                            setaddstatesfromchildren.writeReplace = 1;
                            setaddstatesfromchildren.valueOf(7);
                            setaddstatesfromchildren.valueOf(14);
                            obj = java.lang.Class.forName((java.lang.String) setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson);
                            setaddstatesfromchildren.getAid = obj;
                            setaddstatesfromchildren.valueOf(1);
                            i2 = 8;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -20:
                            byte b5 = $$a[34];
                            byte b6 = (byte) (b5 - 1);
                            byte b7 = b5;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            c(b6, b7, b7, objArr17);
                            obj = (java.lang.String) objArr17[0];
                            setaddstatesfromchildren.getAid = obj;
                            setaddstatesfromchildren.valueOf(1);
                            i2 = 8;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            try {
                                setaddstatesfromchildren.writeReplace = 3;
                                setaddstatesfromchildren.valueOf(7);
                                setaddstatesfromchildren.valueOf(14);
                                java.lang.Object obj4 = setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson;
                                setaddstatesfromchildren.valueOf(14);
                                java.lang.Object obj5 = setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson;
                                setaddstatesfromchildren.valueOf(14);
                                try {
                                    java.lang.Object[] objArr18 = {obj5, setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson};
                                    byte[] bArr3 = getProfileVersion;
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a((byte) (-bArr3[c2]), (short) (-bArr3[416]), 538, objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a((short) 61, bArr3[5], 561, objArr20);
                                    java.lang.String str4 = (java.lang.String) objArr20[0];
                                    byte b8 = (byte) (-bArr3[c2]);
                                    short s2 = bArr3[c3];
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    a(b8, s2, 523, objArr21);
                                    byte b9 = (byte) (SdkCoreAlternateContactlessPaymentDataImpl & 127);
                                    short s3 = bArr3[458];
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    a(b9, s3, (short) (s3 | 548), objArr22);
                                    obj = cls5.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr21[0]), java.lang.Class.forName((java.lang.String) objArr22[0])).invoke(obj4, objArr18);
                                    setaddstatesfromchildren.getAid = obj;
                                    setaddstatesfromchildren.valueOf(1);
                                    i2 = 8;
                                    i5 = i6;
                                    i = i2;
                                } catch (java.lang.Throwable th3) {
                                    java.lang.Throwable cause = th3.getCause();
                                    if (cause == null) {
                                        throw th3;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                i2 = 8;
                                if (i6 >= 27) {
                                }
                                throw th;
                            }
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                            break;
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            setaddstatesfromchildren.writeReplace = 3;
                            setaddstatesfromchildren.valueOf(7);
                            setaddstatesfromchildren.valueOf(14);
                            java.lang.Class cls6 = (java.lang.Class) setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson;
                            setaddstatesfromchildren.valueOf(14);
                            java.lang.String str5 = (java.lang.String) setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson;
                            setaddstatesfromchildren.valueOf(14);
                            setaddstatesfromchildren.getAid = cls6.getMethod(str5, (java.lang.Class[]) setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson);
                            setaddstatesfromchildren.valueOf(1);
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -17:
                            try {
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a((byte) (-getProfileVersion[c2]), r0[c3], 372, objArr23);
                                setaddstatesfromchildren.getAid = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                setaddstatesfromchildren.valueOf(1);
                                i2 = i;
                                i5 = i6;
                                i = i2;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                i2 = i;
                                if (i6 >= 27) {
                                }
                                throw th;
                            }
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                            break;
                        case -16:
                            setaddstatesfromchildren.writeReplace = 1;
                            setaddstatesfromchildren.valueOf(7);
                            setaddstatesfromchildren.valueOf(i);
                            setaddstatesfromchildren.getAid = new java.lang.Class[setaddstatesfromchildren.values];
                            setaddstatesfromchildren.valueOf(1);
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -15:
                            obj2 = "getProfileVersion";
                            setaddstatesfromchildren.getAid = obj2;
                            setaddstatesfromchildren.valueOf(1);
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -14:
                            obj2 = com.payair.hce.setLongClickable.class;
                            setaddstatesfromchildren.getAid = obj2;
                            setaddstatesfromchildren.valueOf(1);
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -13:
                            setaddstatesfromchildren.writeReplace = 1;
                            setaddstatesfromchildren.valueOf(7);
                            setaddstatesfromchildren.valueOf(i);
                            int i7 = setaddstatesfromchildren.values;
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a((byte) (-getProfileVersion[c2]), r10[c3], 523, objArr24);
                            obj2 = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr24[0]), i7);
                            setaddstatesfromchildren.getAid = obj2;
                            setaddstatesfromchildren.valueOf(1);
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -12:
                            setaddstatesfromchildren.valueOf(18);
                            throw ((java.lang.Throwable) setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson);
                        case -11:
                            i5 = 25;
                            c = 372;
                        case -10:
                            i5 = 22;
                        case -9:
                            setaddstatesfromchildren.valueOf(16);
                            if (setaddstatesfromchildren.values == 0) {
                                i5 = 21;
                                c = 372;
                            } else {
                                i2 = i;
                                i5 = i6;
                                i = i2;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            }
                        case -8:
                            try {
                                setaddstatesfromchildren.writeReplace = 1;
                                setaddstatesfromchildren.valueOf(7);
                                setaddstatesfromchildren.valueOf(14);
                                obj3 = setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                i2 = i;
                                if ((i6 >= 27 || i6 > 43) && ((i6 < 43 || i6 > 52) && ((i6 < 79 || i6 > 98) && (i6 < 98 || i6 > 107)))) {
                                    throw th;
                                }
                                setaddstatesfromchildren.getAid = th;
                                setaddstatesfromchildren.valueOf(42);
                                i = i2;
                                i5 = 16;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            }
                            try {
                                byte[] bArr4 = getProfileVersion;
                                byte b10 = (byte) (-bArr4[c2]);
                                short s4 = bArr4[458];
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                a(b10, s4, (short) (s4 | 480), objArr25);
                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                a((short) 59, bArr4[10], my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR, objArr26);
                                try {
                                    setaddstatesfromchildren.getAid = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj3, null);
                                    setaddstatesfromchildren.valueOf(1);
                                    i2 = i;
                                    i5 = i6;
                                    i = i2;
                                    c2 = 380;
                                    c = 372;
                                    c3 = 407;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                            }
                        case -7:
                            i5 = 59;
                        case -6:
                            setaddstatesfromchildren.writeReplace = 1;
                            setaddstatesfromchildren.valueOf(7);
                            setaddstatesfromchildren.valueOf(14);
                            java.lang.Object obj6 = setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson;
                            try {
                                byte[] bArr5 = getProfileVersion;
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                a((byte) (-bArr5[c2]), bArr5[c3], 372, objArr27);
                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                short s5 = bArr5[5];
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a((short) 61, s5, (short) (s5 | 488), objArr28);
                                invoke = cls8.getMethod((java.lang.String) objArr28[0], null).invoke(obj6, null);
                                setaddstatesfromchildren.getAid = invoke;
                                setaddstatesfromchildren.valueOf(1);
                                i2 = i;
                                i5 = i6;
                                i = i2;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            } catch (java.lang.Throwable th9) {
                                java.lang.Throwable cause3 = th9.getCause();
                                if (cause3 == null) {
                                    throw th9;
                                }
                                throw cause3;
                            }
                        case -5:
                            setaddstatesfromchildren.writeReplace = 3;
                            setaddstatesfromchildren.valueOf(7);
                            setaddstatesfromchildren.valueOf(14);
                            java.lang.String str6 = (java.lang.String) setaddstatesfromchildren.IccPrivateKeyCrtComponentsJson;
                            setaddstatesfromchildren.valueOf(i);
                            int i8 = setaddstatesfromchildren.values;
                            setaddstatesfromchildren.valueOf(i);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            b(str6, i8, (byte) setaddstatesfromchildren.values, objArr29);
                            invoke = (java.lang.String) objArr29[0];
                            setaddstatesfromchildren.getAid = invoke;
                            setaddstatesfromchildren.valueOf(1);
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -4:
                            try {
                                setaddstatesfromchildren.writeReplace = 1;
                                setaddstatesfromchildren.valueOf(7);
                                setaddstatesfromchildren.valueOf(i);
                                try {
                                    objArr = new java.lang.Object[]{java.lang.Integer.valueOf(setaddstatesfromchildren.values)};
                                    byte[] bArr6 = getProfileVersion;
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    a((byte) (bArr6[430] - 1), bArr6[448], 460, objArr30);
                                    cls = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                    try {
                                        short s6 = bArr6[414];
                                        objArr2 = new java.lang.Object[1];
                                        a((short) 59, s6, (short) (s6 | 461), objArr2);
                                    } catch (java.lang.Throwable th10) {
                                        th = th10;
                                        java.lang.Throwable cause4 = th.getCause();
                                        if (cause4 == null) {
                                            throw th;
                                        }
                                        throw cause4;
                                    }
                                } catch (java.lang.Throwable th11) {
                                    th = th11;
                                }
                            } catch (java.lang.Throwable th12) {
                                th = th12;
                                i2 = i;
                                if (i6 >= 27) {
                                }
                                throw th;
                            }
                            try {
                                setaddstatesfromchildren.writeReplace = ((java.lang.Integer) cls.getMethod((java.lang.String) objArr2[0], java.lang.Integer.TYPE).invoke(null, objArr)).intValue();
                                setaddstatesfromchildren.valueOf(2);
                                i2 = i;
                                i5 = i6;
                                i = i2;
                            } catch (java.lang.Throwable th13) {
                                th = th13;
                                i2 = i;
                                if (i6 >= 27) {
                                }
                                throw th;
                            }
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                            break;
                        case -3:
                            try {
                                byte[] bArr7 = getProfileVersion;
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                a((byte) (bArr7[430] - 1), (short) (bArr7[419] - 1), androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, objArr31);
                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                a((short) 59, bArr7[45], 449, objArr32);
                                setaddstatesfromchildren.writeReplace = ((java.lang.Integer) cls9.getMethod((java.lang.String) objArr32[0], null).invoke(null, null)).intValue();
                                setaddstatesfromchildren.valueOf(2);
                                i2 = i;
                                i5 = i6;
                                i = i2;
                                c2 = 380;
                                c = 372;
                                c3 = 407;
                            } catch (java.lang.Throwable th14) {
                                java.lang.Throwable cause5 = th14.getCause();
                                if (cause5 == null) {
                                    throw th14;
                                }
                                throw cause5;
                            }
                        case -2:
                            setaddstatesfromchildren.getAid = "\u0002\u0000㖹";
                            setaddstatesfromchildren.valueOf(1);
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                        case -1:
                            i5 = 52;
                        default:
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 380;
                            c = 372;
                            c3 = 407;
                    }
                }
                throw th;
            } catch (java.lang.Throwable th15) {
                java.lang.Throwable cause6 = th15.getCause();
                if (cause6 == null) {
                    throw th15;
                }
                throw cause6;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4;
            int i5 = i + 4;
            byte[] bArr = getProfileVersion;
            int i6 = s2 + 1;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i6;
                i3 = i5;
                i4 = 0;
                i5 += -i7;
                i3++;
                i2 = i4;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i4 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i3];
                i5 += -i7;
                i3++;
                i2 = i4;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i4 == i6) {
                }
            } else {
                i2 = 0;
                i5 = s + 44;
                i3 = i5;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i4 == i6) {
                }
            }
        }

        static void values() {
            byte[] bArr = new byte[com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR];
            java.lang.System.arraycopy("~ÿ¶4ü\u0005ÿû\u0006ù\u0007ÿú\u0007ø\b÷\tö\nó\rÿù\bû\u0001\u0004û\u0000\u0005ûÿ\u0006ûþ\u0007ÿø\tÿ÷\nÿö\u000bûü\tÿõ\fûü\tÿô\rÿü\u0001\u0004ÿü\u0000\u0005ûú\u000bûø\rÿüÿ\u0006ûø\rÿüÿ\u0006ú\u0002\u0004ÿüþ\u0007ú\u0001\u0005ú\u0000\u0006ÿüý\bÿüü\tú\u0002\u0004ÿüû\nûü\tó\rÿüú\u000búÿ\u0007ÿüù\fúþ\bÿüø\rûø\rÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006úý\tÿüù\fúü\nÿüø\rûø\rÿûÿ\u0007úû\u000búú\fÿûþ\búù\rù\u0003\u0004ûø\rÿûý\tÿûü\nù\u0002\u0005ù\u0001\u0006ù\u0000\u0007ÿûû\u000búù\rù\u0000\u0007ÿûú\fÿûù\rÿú\u0003\u0004ÿú\u0003\u0004ÿú\u0002\u0005ùþ\tû\u0000\u0005ùý\nÿú\u0001\u0006ù\u0003\u0004ÿú\u0000\u0007ÿúÿ\bÿúþ\tú\u0002\u0004ÿüþ\u0007ùû\fó\rú\u0000\u0006ÿüý\bÿüü\tó\rÿüû\nûü\tú\u0002\u0004ÿüú\u000búÿ\u0007ÿüù\fûú\u000búý\tûú\u000bÿüø\rûø\rÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006úý\tÿüù\fúü\nÿüø\rûø\rÿûÿ\u0007ÿúý\nø\u0004\u0004ÿúü\u000bø\u0003\u0005ÿúü\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010ó\nò\u0003\u0006\u00056¸\r\u0004îIØí\u0004î4Ô\u0001\bý\u0002ò\u0003\u0011í\u000bú\u0001\u0002ñ åú\u0012û\u0015çýÿó\nò\u0003\u0006\u00056¿üEÞÞ\u0003\fþò\u0000\u0002ñ ìö\r\u0004ý\u0014Þ\túý\tõûûú\u000fó\u0004\të\u00153Â\u000bó\u00079Úìö\u0003ø\u0016ÿö\u0007\u0002ñ1âì\u0002\u000e\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFáèñ\fù\u000bûø\u0007\u0004\u0006\u000fâ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï9".getBytes("ISO-8859-1"), 0, bArr, 0, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR);
            getProfileVersion = bArr;
            SdkCoreAlternateContactlessPaymentDataImpl = 175;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            values();
            DigitizedCardProfile = 0;
            RecordsJson = 1;
            AlternateContactlessPaymentDataJson = new char[]{12415, 12411, 12408, 12384};
            values = (char) 1490;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            RecordsJson = (DigitizedCardProfile + 103) % 128;
            java.lang.Object AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(mutablePreferences, continuation);
            RecordsJson = (DigitizedCardProfile + 59) % 128;
            return AlternateContactlessPaymentDataJson2;
        }

        private java.lang.Object AlternateContactlessPaymentDataJson(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            RecordsJson = (DigitizedCardProfile + 25) % 128;
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace writereplace = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace) create(mutablePreferences, continuation);
            java.lang.Object DigitizedCardProfile2 = DigitizedCardProfile(new java.lang.Object[]{writereplace, kotlin.Unit.INSTANCE}, 983067634, -983067634, java.lang.System.identityHashCode(writereplace));
            int i = RecordsJson + 115;
            DigitizedCardProfile = i % 128;
            if (i % 2 == 0) {
                return DigitizedCardProfile2;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace writereplace = new com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace(continuation);
            writereplace.valueOf = obj;
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace writereplace2 = writereplace;
            RecordsJson = (DigitizedCardProfile + 91) % 128;
            return writereplace2;
        }

        static void init$1() {
            $$d = new byte[]{117, 72, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
            $$e = 38;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            return DigitizedCardProfile(new java.lang.Object[]{this, obj}, 983067634, -983067634, java.lang.System.identityHashCode(this));
        }

        writeReplace(kotlin.coroutines.Continuation<? super com.payair.hce.setAlwaysDrawnWithCacheEnabled.writeReplace> continuation) {
            super(2, continuation);
        }

        static void init$0() {
            $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
            $$b = 160;
        }
    }

    static final class values extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private static int valueOf = 1;
        private static int values;
        private /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson;
        private int DigitizedCardProfile;

        public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
            androidx.content.preferences.core.MutablePreferences mutablePreferences;
            androidx.datastore.preferences.core.Preferences.Key key;
            java.lang.Boolean boxBoolean;
            int i4 = ~i;
            int i5 = ~i3;
            int i6 = (i * (-563)) + (i2 * 565) + (((~((~i2) | i5)) | i4 | (~(i2 | i3))) * (-564)) + ((~(i3 | i4 | i2)) * 1128) + (((~(i | i2)) | (~(i4 | i5))) * 564);
            if (i6 == 1) {
                com.payair.hce.setAlwaysDrawnWithCacheEnabled.values valuesVar = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.values) objArr[0];
                java.lang.Object obj = objArr[1];
                int i7 = valueOf;
                int i8 = ((i7 & (-106)) | ((~i7) & 105)) + ((i7 & 105) << 1);
                values = i8 % 128;
                if (i8 % 2 != 0) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i9 = valuesVar.DigitizedCardProfile;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutablePreferences = (androidx.content.preferences.core.MutablePreferences) valuesVar.AlternateContactlessPaymentDataJson;
                    key = (androidx.datastore.preferences.core.Preferences.Key) com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(new java.lang.Object[0], 126912718, -126912718, (int) java.lang.System.currentTimeMillis());
                    boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                } else {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = valuesVar.DigitizedCardProfile;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutablePreferences = (androidx.content.preferences.core.MutablePreferences) valuesVar.AlternateContactlessPaymentDataJson;
                    key = (androidx.datastore.preferences.core.Preferences.Key) com.payair.hce.setAlwaysDrawnWithCacheEnabled.values(new java.lang.Object[0], 126912718, -126912718, (int) java.lang.System.currentTimeMillis());
                    boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                mutablePreferences.set(key, boxBoolean);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                int i11 = values;
                valueOf = ((i11 & 121) + (i11 | 121)) % 128;
                return unit;
            }
            if (i6 == 2) {
                return AlternateContactlessPaymentDataJson(objArr);
            }
            if (i6 != 3) {
                com.payair.hce.setAlwaysDrawnWithCacheEnabled.values valuesVar2 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.values) objArr[0];
                java.lang.Object obj2 = objArr[1];
                java.lang.Object obj3 = objArr[2];
                int i12 = valueOf;
                values = (((i12 | 21) << 1) - (i12 ^ 21)) % 128;
                java.lang.Object AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(new java.lang.Object[]{valuesVar2, (androidx.content.preferences.core.MutablePreferences) obj2, (kotlin.coroutines.Continuation) obj3}, -1113228605, 1113228608, java.lang.System.identityHashCode(valuesVar2));
                int i13 = values;
                int i14 = i13 & 19;
                valueOf = ((((i13 | 19) & (~i14)) - (~(i14 << 1))) - 1) % 128;
                return AlternateContactlessPaymentDataJson;
            }
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.values valuesVar3 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.values) objArr[0];
            androidx.content.preferences.core.MutablePreferences mutablePreferences2 = (androidx.content.preferences.core.MutablePreferences) objArr[1];
            kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[2];
            int i15 = values;
            int i16 = i15 & 45;
            int i17 = -(-((i15 ^ 45) | i16));
            valueOf = ((i16 & i17) + (i17 | i16)) % 128;
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.values valuesVar4 = (com.payair.hce.setAlwaysDrawnWithCacheEnabled.values) ((kotlin.coroutines.Continuation) AlternateContactlessPaymentDataJson(new java.lang.Object[]{valuesVar3, mutablePreferences2, continuation}, 512544016, -512544014, java.lang.System.identityHashCode(valuesVar3)));
            java.lang.Object AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(new java.lang.Object[]{valuesVar4, kotlin.Unit.INSTANCE}, -1837723587, 1837723588, java.lang.System.identityHashCode(valuesVar4));
            int i18 = valueOf;
            values = (((i18 | 71) << 1) - (i18 ^ 71)) % 128;
            return AlternateContactlessPaymentDataJson2;
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            java.lang.Object obj = objArr[1];
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.values valuesVar = new com.payair.hce.setAlwaysDrawnWithCacheEnabled.values((kotlin.coroutines.Continuation) objArr[2]);
            valuesVar.AlternateContactlessPaymentDataJson = obj;
            com.payair.hce.setAlwaysDrawnWithCacheEnabled.values valuesVar2 = valuesVar;
            int i = valueOf;
            int i2 = i & 5;
            int i3 = (i2 - (~(-(-((i ^ 5) | i2))))) - 1;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                return valuesVar2;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, mutablePreferences, continuation}, -837248745, 837248745, java.lang.System.identityHashCode(this));
        }

        private java.lang.Object valueOf(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, mutablePreferences, continuation}, -1113228605, 1113228608, java.lang.System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return (kotlin.coroutines.Continuation) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj, continuation}, 512544016, -512544014, java.lang.System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj}, -1837723587, 1837723588, java.lang.System.identityHashCode(this));
        }

        values(kotlin.coroutines.Continuation<? super com.payair.hce.setAlwaysDrawnWithCacheEnabled.values> continuation) {
            super(2, continuation);
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        switch ((i * (-661)) + (i2 * (-661)) + (((~i3) | (~(i4 | i5))) * 1324) + (((~(i3 | i)) | (~(i3 | i2))) * (-1324)) + (((~(i | i5)) | (~(i2 | i4))) * 662)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                return values(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf valueof = new com.payair.hce.setAlwaysDrawnWithCacheEnabled.valueOf(((androidx.content.core.DataStore) com.payair.hce.setAlwaysDrawnWithCacheEnabled.Companion.DigitizedCardProfile(new java.lang.Object[]{((com.payair.hce.setAlwaysDrawnWithCacheEnabled) objArr[0]).DigitizedCardProfile}, 932081765, -932081764, (int) java.lang.System.currentTimeMillis())).getData());
                int i6 = IccPrivateKeyCrtComponentsJson;
                SdkCoreAlternateContactlessPaymentDataImpl = (((i6 | 83) << 1) - (i6 ^ 83)) % 128;
                return valueof;
            case 6:
                return valueOf(objArr);
            default:
                int i7 = IccPrivateKeyCrtComponentsJson;
                int i8 = i7 ^ 87;
                int i9 = -(-((i7 & 87) << 1));
                int i10 = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                SdkCoreAlternateContactlessPaymentDataImpl = i10;
                androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> key = DigitizedCardProfile;
                int i11 = i10 & 55;
                int i12 = ((i10 ^ 55) | i11) << 1;
                int i13 = -((~i11) & (i10 | 55));
                IccPrivateKeyCrtComponentsJson = ((i12 & i13) + (i13 | i12)) % 128;
                return key;
        }
    }

    public static final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key values() {
        return (androidx.datastore.preferences.core.Preferences.Key) values(new java.lang.Object[0], 126912718, -126912718, (int) java.lang.System.currentTimeMillis());
    }

    public static final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key DigitizedCardProfile() {
        return (androidx.datastore.preferences.core.Preferences.Key) values(new java.lang.Object[0], 964626834, -964626833, (int) java.lang.System.currentTimeMillis());
    }

    public static final /* synthetic */ kotlin.properties.ReadOnlyProperty writeReplace() {
        return (kotlin.properties.ReadOnlyProperty) values(new java.lang.Object[0], 1932840610, -1932840607, (int) java.lang.System.currentTimeMillis());
    }

    @Override // com.payair.hce.setSafeBrowsingWhitelist
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> AlternateContactlessPaymentDataJson() {
        return (kotlinx.coroutines.flow.Flow) values(new java.lang.Object[]{this}, -1929264906, 1929264911, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setSafeBrowsingWhitelist
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> valueOf() {
        return (kotlinx.coroutines.flow.Flow) values(new java.lang.Object[]{this}, -1359718603, 1359718605, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setSafeBrowsingWhitelist
    public final java.lang.Object writeReplace(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return values(new java.lang.Object[]{this, continuation}, 1232676379, -1232676375, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setSafeBrowsingWhitelist
    public final java.lang.Object valueOf(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return values(new java.lang.Object[]{this, continuation}, 1062434268, -1062434262, java.lang.System.identityHashCode(this));
    }
}
