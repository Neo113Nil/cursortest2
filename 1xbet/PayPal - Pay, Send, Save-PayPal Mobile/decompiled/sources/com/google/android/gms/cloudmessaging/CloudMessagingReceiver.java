package com.google.android.gms.cloudmessaging;

/* loaded from: classes8.dex */
public abstract class CloudMessagingReceiver extends android.content.BroadcastReceiver {
    private static java.lang.ref.SoftReference zza;
    private static java.lang.ref.SoftReference zzb;

    private final int zzb(android.content.Context context, android.content.Intent intent) {
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        } else {
            extras = new android.os.Bundle();
        }
        if (!java.util.Objects.equals(intent.getAction(), com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS)) {
            return 500;
        }
        onNotificationDismissed(context, extras);
        return -1;
    }

    protected java.util.concurrent.Executor getBroadcastExecutor() {
        java.util.concurrent.ExecutorService executorService;
        synchronized (com.google.android.gms.cloudmessaging.CloudMessagingReceiver.class) {
            java.lang.ref.SoftReference softReference = zza;
            executorService = softReference != null ? (java.util.concurrent.ExecutorService) softReference.get() : null;
            if (executorService == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                executorService = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor")));
                zza = new java.lang.ref.SoftReference(executorService);
            }
        }
        return executorService;
    }

    protected abstract int onMessageReceive(android.content.Context context, com.google.android.gms.cloudmessaging.CloudMessage cloudMessage);

    protected void onNotificationDismissed(android.content.Context context, android.os.Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final android.content.Context context, final android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
        getBroadcastExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.cloudmessaging.CloudMessagingReceiver.this.zza(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }

    final /* synthetic */ void zza(android.content.Intent intent, final android.content.Context context, boolean z, android.content.BroadcastReceiver.PendingResult pendingResult) {
        java.util.concurrent.Executor executor;
        int i;
        try {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT);
            android.content.Intent intent2 = parcelableExtra instanceof android.content.Intent ? (android.content.Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = zzb(context, intent2);
            } else if (intent.getExtras() == null) {
                i = 500;
            } else {
                final com.google.android.gms.cloudmessaging.CloudMessage cloudMessage = new com.google.android.gms.cloudmessaging.CloudMessage(intent);
                final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                synchronized (com.google.android.gms.cloudmessaging.CloudMessagingReceiver.class) {
                    java.lang.ref.SoftReference softReference = zzb;
                    executor = softReference != null ? (java.util.concurrent.Executor) softReference.get() : null;
                    if (executor == null) {
                        com.google.android.gms.internal.cloudmessaging.zze.zza();
                        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("pscm-ack-executor"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        executor = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
                        zzb = new java.lang.ref.SoftReference(executor);
                    }
                }
                executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.tasks.Task zzc;
                        com.google.android.gms.cloudmessaging.CloudMessage cloudMessage2 = cloudMessage;
                        if (android.text.TextUtils.isEmpty(cloudMessage2.getMessageId())) {
                            zzc = com.google.android.gms.tasks.Tasks.forResult(null);
                        } else {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID, cloudMessage2.getMessageId());
                            java.lang.Integer zza2 = cloudMessage2.zza();
                            if (zza2 != null) {
                                bundle.putInt(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRODUCT_ID, zza2.intValue());
                            }
                            android.content.Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            zzc = com.google.android.gms.cloudmessaging.zzv.zzb(context2).zzc(2, bundle);
                        }
                        final java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                        zzc.addOnCompleteListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.cloudmessaging.zze
                            @Override // java.util.concurrent.Executor
                            public final void execute(java.lang.Runnable runnable) {
                                runnable.run();
                            }
                        }, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzf
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(com.google.android.gms.tasks.Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int onMessageReceive = onMessageReceive(context, cloudMessage);
                try {
                    countDownLatch.await(java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.InterruptedException unused) {
                }
                i = onMessageReceive;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(i);
            }
        } finally {
            if (pendingResult != null) {
                pendingResult.finish();
            }
        }
    }

    public static final class IntentActionKeys {
        public static final java.lang.String NOTIFICATION_DISMISS = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        public static final java.lang.String NOTIFICATION_OPEN = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        private static final byte[] $$c = {6, -55, 67, -52};
        private static final int $$d = 101;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {58, -36, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
        private static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static char[] getHighSpeedVideoSizes = {9708, 4129, 9701, 4121, 4108, 9699, 9703, 4154, 9696, 4109, 4123, 4175, 4124, 4120, 4110, 9709, 4176, 4119, 9702, 9698, 4105, 4127, 9710, 4107, 4113, 4122, 4103, 4152, 9697, 4106, 4157, 4177, 4112, 4117, 4125, 4114};
        private static char getHighSpeedVideoFpsRanges = 9698;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(byte b, short s, byte b2) {
            int i;
            byte[] bArr = $$c;
            int i2 = s + 4;
            int i3 = b2 * 4;
            int i4 = b + 98;
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            if (bArr == null) {
                int i6 = i2;
                int i7 = 0;
                i4 += -i2;
                i2 = i6;
                i = i7;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                    return new java.lang.String(bArr2, 0);
                }
                int i8 = i2 + 1;
                int i9 = i + 1;
                i6 = i8;
                i2 = bArr[i8];
                i7 = i9;
                i4 += -i2;
                i2 = i6;
                i = i7;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
            int i;
            int i2;
            int i3 = 1 - (s * 2);
            int i4 = 4 - (b * 4);
            int i5 = (b2 * 2) + 98;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3];
            if (bArr == null) {
                int i6 = i3;
                int i7 = i4;
                int i8 = 0;
                int i9 = (-i4) + i6;
                int i10 = i7 + 1;
                i = i8;
                i5 = i9;
                i4 = i10;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                if (i2 == i3) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i11 = i5;
                i7 = i4;
                i4 = bArr[i4];
                i8 = i2;
                i6 = i11;
                int i92 = (-i4) + i6;
                int i102 = i7 + 1;
                i = i8;
                i5 = i92;
                i4 = i102;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                if (i2 == i3) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                if (i2 == i3) {
                }
            }
        }

        private static void a(char[] cArr, int i, byte b, java.lang.Object[] objArr) {
            int i2;
            int i3 = 2 % 2;
            o.getValidOutputFormatsForInputhNQ4ISI getvalidoutputformatsforinputhnq4isi = new o.getValidOutputFormatsForInputhNQ4ISI();
            char[] cArr2 = getHighSpeedVideoSizes;
            if (cArr2 != null) {
                int i4 = $11 + 51;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i6])};
                        java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1175707386);
                        if (Camera2StreamConfigurationMap == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (22522 - android.view.View.getDefaultSize(0, 0)), 266 - android.view.View.resolveSize(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12, 619503622, false, $$e(b2, b3, (byte) (b3 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getHighSpeedVideoFpsRanges)};
                java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1175707386);
                if (Camera2StreamConfigurationMap2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 22522), 266 - android.view.View.resolveSizeAndState(0, 0, 0), 12 - android.text.TextUtils.indexOf("", "", 0), 619503622, false, $$e(b4, b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                char charValue = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                int i7 = 13;
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                    int i8 = $10 + 13;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i10 = $11 + 31;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges = 0;
                    while (getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges < i2) {
                        int i12 = $11 + 67;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoSizes = cArr[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges];
                        getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRangesFor = cArr[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges + 1];
                        if (getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoSizes == getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRangesFor) {
                            cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges] = (char) (getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoSizes - b);
                            cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges + 1] = (char) (getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRangesFor - b);
                        } else {
                            try {
                                java.lang.Object[] objArr4 = new java.lang.Object[i7];
                                objArr4[12] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[11] = java.lang.Integer.valueOf(charValue);
                                objArr4[10] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[9] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[8] = java.lang.Integer.valueOf(charValue);
                                objArr4[7] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[6] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[5] = java.lang.Integer.valueOf(charValue);
                                objArr4[4] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[3] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[2] = java.lang.Integer.valueOf(charValue);
                                objArr4[1] = getvalidoutputformatsforinputhnq4isi;
                                objArr4[0] = getvalidoutputformatsforinputhnq4isi;
                                java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2046312203);
                                if (Camera2StreamConfigurationMap3 == null) {
                                    char c = (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49752);
                                    int rgb = (-16776732) - android.graphics.Color.rgb(0, 0, 0);
                                    int i14 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7;
                                    byte b6 = (byte) 3;
                                    byte b7 = (byte) (b6 - 4);
                                    java.lang.String $$e = $$e(b6, b7, (byte) (b7 + 1));
                                    java.lang.Class[] clsArr = new java.lang.Class[i7];
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
                                    Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, rgb, i14, -453444085, false, $$e, clsArr);
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr4)).intValue() == getvalidoutputformatsforinputhnq4isi.getInputFormats) {
                                    java.lang.Object[] objArr5 = {getvalidoutputformatsforinputhnq4isi, getvalidoutputformatsforinputhnq4isi, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), getvalidoutputformatsforinputhnq4isi, getvalidoutputformatsforinputhnq4isi, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), getvalidoutputformatsforinputhnq4isi, java.lang.Integer.valueOf(charValue), getvalidoutputformatsforinputhnq4isi};
                                    java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1167583195);
                                    if (Camera2StreamConfigurationMap4 == null) {
                                        char indexOf = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 45286);
                                        int longPressTimeout = (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                                        int combineMeasuredStates = 3 - android.view.View.combineMeasuredStates(0, 0);
                                        byte b8 = (byte) ($$d & 3);
                                        byte b9 = (byte) (-b8);
                                        Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf, longPressTimeout, combineMeasuredStates, 661182757, false, $$e(b8, b9, (byte) (b9 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr5)).intValue();
                                    int i15 = (getvalidoutputformatsforinputhnq4isi.Camera2StreamConfigurationMap * charValue) + getvalidoutputformatsforinputhnq4isi.getInputFormats;
                                    cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges] = cArr2[intValue];
                                    cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges + 1] = cArr2[i15];
                                } else if (getvalidoutputformatsforinputhnq4isi.getHighResolutionOutputSizeshNQ4ISI == getvalidoutputformatsforinputhnq4isi.Camera2StreamConfigurationMap) {
                                    int i16 = $10 + 9;
                                    $11 = i16 % 128;
                                    int i17 = i16 % 2;
                                    getvalidoutputformatsforinputhnq4isi.getOutputFormats = ((getvalidoutputformatsforinputhnq4isi.getOutputFormats + charValue) - 1) % charValue;
                                    getvalidoutputformatsforinputhnq4isi.getInputFormats = ((getvalidoutputformatsforinputhnq4isi.getInputFormats + charValue) - 1) % charValue;
                                    int i18 = (getvalidoutputformatsforinputhnq4isi.getHighResolutionOutputSizeshNQ4ISI * charValue) + getvalidoutputformatsforinputhnq4isi.getOutputFormats;
                                    int i19 = (getvalidoutputformatsforinputhnq4isi.Camera2StreamConfigurationMap * charValue) + getvalidoutputformatsforinputhnq4isi.getInputFormats;
                                    cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges] = cArr2[i18];
                                    cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges + 1] = cArr2[i19];
                                } else {
                                    int i20 = (getvalidoutputformatsforinputhnq4isi.getHighResolutionOutputSizeshNQ4ISI * charValue) + getvalidoutputformatsforinputhnq4isi.getInputFormats;
                                    int i21 = (getvalidoutputformatsforinputhnq4isi.Camera2StreamConfigurationMap * charValue) + getvalidoutputformatsforinputhnq4isi.getOutputFormats;
                                    cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges] = cArr2[i20];
                                    cArr4[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges + 1] = cArr2[i21];
                                }
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges += 2;
                        int i22 = $10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        $11 = i22 % 128;
                        int i23 = i22 % 2;
                        i7 = 13;
                    }
                }
                for (int i24 = 0; i24 < i; i24++) {
                    cArr4[i24] = (char) (cArr4[i24] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr4);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:32|(1:34)(5:98|99|100|101|(2:103|104)(11:105|36|37|38|(1:40)(9:50|51|52|53|54|(1:56)(1:92)|57|58|(2:60|(1:62)(18:63|65|66|67|68|69|(1:71)(1:87)|72|73|74|75|76|(6:79|(1:81)(1:82)|43|(1:45)(1:49)|46|47)|42|43|(0)(0)|46|47)))|41|42|43|(0)(0)|46|47))|35|36|37|38|(0)(0)|41|42|43|(0)(0)|46|47) */
        /* JADX WARN: Removed duplicated region for block: B:40:0x04f2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x078e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x07ad  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0502 A[Catch: Exception -> 0x06f8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x06f8, blocks: (B:37:0x04bd, B:50:0x0502, B:58:0x057b, B:60:0x0583, B:63:0x05c6), top: B:36:0x04bd }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] getHighSpeedVideoFpsRangesFor(int i, int i2) {
            int i3;
            int i4;
            int i5;
            java.lang.String str;
            int i6;
            int i7;
            java.lang.Object[] objArr;
            int i8;
            java.lang.String[] strArr;
            char c;
            int i9;
            int i10;
            java.lang.Object[] objArr2;
            java.io.File file;
            java.lang.String readLine;
            java.lang.String str2;
            int i11;
            int i12;
            java.io.File file2;
            int i13;
            int i14 = 2 % 2;
            try {
                java.lang.String[] strArr2 = new java.lang.String[2];
                char[] cArr = {15, 11, '\b', 11, 17, 18, 13856, 13856, 16, '\n', 0, 30, 13847, 13847, 16, 4, 28, 11, 13857};
                int i15 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i16 = (i15 ^ 18) + ((i15 & 18) << 1);
                int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                int i17 = getHighSpeedVideoFpsRangesFor + 45;
                getHighResolutionOutputSizeshNQ4ISI = i17 % 128;
                int i18 = i17 % 2;
                int i19 = -(minimumFlingVelocity >> 16);
                int highSpeedVideoFpsRanges = com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.getHighSpeedVideoFpsRanges();
                int i20 = (i19 * (-501)) + 17605;
                int i21 = ~((-36) | highSpeedVideoFpsRanges);
                int i22 = ~((i19 ^ 35) | (i19 & 35));
                int i23 = -(-(((i22 & i21) | (i21 ^ i22)) * (-502)));
                int i24 = (i20 & i23) + (i23 | i20);
                int i25 = (-36) | (~highSpeedVideoFpsRanges);
                int i26 = (i24 - (~(-(-((~((i25 & i19) | (i25 ^ i19))) * (-502)))))) - 1;
                int i27 = ~i19;
                byte b = (byte) (i26 + (((-36) | (~((i27 & highSpeedVideoFpsRanges) | (i27 ^ highSpeedVideoFpsRanges)))) * 502));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(cArr, i16, b, objArr3);
                strArr2[0] = (java.lang.String) objArr3[0];
                char[] cArr2 = {21, 22, 23, '#', 14, '#', '\t', '!', 28, 0, '\b', 11, 17, 18, 13944, 13944, 16, '\n'};
                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                int i28 = getHighResolutionOutputSizeshNQ4ISI;
                int i29 = i28 + 49;
                getHighSpeedVideoFpsRangesFor = i29 % 128;
                int i30 = i29 % 2;
                int i31 = doubleTapTimeout >> 16;
                int i32 = i31 * 70;
                int i33 = ((i32 | (-1224)) << 1) - (i32 ^ (-1224));
                int i34 = ~i31;
                int i35 = i28 + 53;
                int i36 = i35 % 128;
                getHighSpeedVideoFpsRangesFor = i36;
                int i37 = i35 % 2;
                int i38 = i34 | (-19);
                int i39 = ~((i38 & i) | (i38 ^ i));
                int i40 = ~((i31 ^ 18) | (i31 & 18) | i);
                int i41 = 69 * ((i39 & i40) | (i39 ^ i40));
                int i42 = ((i33 | i41) << 1) - (i33 ^ i41);
                int i43 = ~i31;
                int i44 = ~((i43 & 18) | (i43 ^ 18));
                int i45 = i36 + 87;
                getHighResolutionOutputSizeshNQ4ISI = i45 % 128;
                int i46 = i45 % 2;
                int i47 = ~((i34 & i) | (i34 ^ i));
                int i48 = (i47 & i44) | (i44 ^ i47);
                int i49 = ~((18 ^ i) | (18 & i));
                int i50 = (i42 - (~((-69) * ((i48 & i49) | (i48 ^ i49))))) - 1;
                int i51 = (~((i31 & (-19)) | ((-19) ^ i31))) * 69;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(cArr2, i52, (byte) (((maxKeyCode | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (maxKeyCode ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)), objArr4);
                strArr2[1] = (java.lang.String) objArr4[0];
                int i53 = 0;
                while (true) {
                    if (i53 >= 2) {
                        int i54 = getHighSpeedVideoFpsRangesFor + 103;
                        getHighResolutionOutputSizeshNQ4ISI = i54 % 128;
                        int i55 = i54 % 2;
                        i3 = i;
                        break;
                    }
                    int i56 = getHighSpeedVideoFpsRangesFor + 19;
                    getHighResolutionOutputSizeshNQ4ISI = i56 % 128;
                    int i57 = i56 % 2;
                    java.lang.String str3 = strArr2[i53];
                    int i58 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i59 = i58 * 868;
                    int i60 = (i59 & 13020) + (i59 | 13020);
                    int i61 = ~i58;
                    int i62 = ~i;
                    int i63 = ~((i61 & i62) | (i61 ^ i62));
                    int i64 = ~i;
                    int i65 = ~(((-16) ^ i64) | (i64 & (-16)));
                    int i66 = -(-(((i63 & i65) | (i63 ^ i65)) * (-867)));
                    int i67 = ((i60 | i66) << 1) - (i66 ^ i60);
                    int i68 = ~i58;
                    int i69 = (~((i68 ^ (-16)) | (i68 & (-16)))) | (~((i68 ^ i) | (i68 & i)));
                    int i70 = ~(((-16) ^ i) | ((-16) & i));
                    int i71 = ((i69 ^ i70) | (i69 & i70)) * (-1734);
                    int i72 = (i67 & i71) + (i71 | i67);
                    int i73 = (i68 ^ (-16)) | (i68 & (-16));
                    int i74 = ~((i73 & i62) | (i73 ^ i62));
                    int i75 = i68 | 15;
                    int i76 = ~((i75 & i) | (i75 ^ i));
                    int i77 = (i76 & i74) | (i74 ^ i76);
                    int i78 = (i58 & (-16)) | ((-16) ^ i58);
                    int i79 = ~((i78 & i) | (i78 ^ i));
                    int i80 = -(-(((i79 & i77) | (i77 ^ i79)) * 867));
                    int i81 = ((i72 | i80) << 1) - (i80 ^ i72);
                    int i82 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int highSpeedVideoFpsRanges2 = com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.getHighSpeedVideoFpsRanges();
                    int i83 = i82 * (-103);
                    int i84 = (i83 & (-2884)) + (i83 | (-2884));
                    int i85 = ~i82;
                    int i86 = ((~((i85 & (-29)) | (i85 ^ (-29)))) | (~((-29) | highSpeedVideoFpsRanges2))) * 104;
                    int i87 = (i84 ^ i86) + ((i86 & i84) << 1);
                    int i88 = ~highSpeedVideoFpsRanges2;
                    int i89 = (i88 & i82) | (i88 ^ i82);
                    int i90 = -(-((~((i89 & 28) | (i89 ^ 28))) * (-104)));
                    byte b2 = (byte) ((((i87 ^ i90) + ((i90 & i87) << 1)) - (~(-(-(((i82 & highSpeedVideoFpsRanges2) | (i82 ^ highSpeedVideoFpsRanges2)) * 104))))) - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(new char[]{20, '!', 28, 1, 29, '\f', 28, '\r', 27, 6, '\r', '\n', 6, 16, 21, 5}, i81, b2, objArr5);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    if (((java.lang.Boolean) cls.getMethod(str3, new java.lang.Class[0]).invoke(cls, null)).booleanValue()) {
                        int i91 = getHighResolutionOutputSizeshNQ4ISI + 5;
                        getHighSpeedVideoFpsRangesFor = i91 % 128;
                        int i92 = i91 % 2;
                        i3 = i ^ 1;
                        break;
                    }
                    i53++;
                    int i93 = getHighSpeedVideoFpsRangesFor;
                    int i94 = (i93 ^ 101) + ((i93 & 101) << 1);
                    getHighResolutionOutputSizeshNQ4ISI = i94 % 128;
                    int i95 = i94 % 2;
                }
            } catch (java.lang.Exception unused) {
                i3 = (i & (-3)) | ((~i) & 2);
            }
            try {
                java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-998058110);
                if (Camera2StreamConfigurationMap == null) {
                    char c2 = (char) (29109 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int indexOf = android.text.TextUtils.indexOf("", "", 0) + 143;
                    int i96 = 16 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b3, b4, b4, objArr6);
                    Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c2, indexOf, i96, 1501697666, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap).invoke(null, null)).longValue();
                long j = 994133890;
                long j2 = (866 * j) + ((-864) * longValue);
                long j3 = -1;
                long j4 = longValue ^ j3;
                long j5 = i;
                long j6 = j5 ^ j3;
                long j7 = 865;
                long j8 = (((j2 + ((-865) * (j4 | (((j ^ j3) | j6) ^ j3)))) + (((j5 | j) ^ j3) * j7)) + (j7 * (((j4 | j6) ^ j3) | ((j6 | j) ^ j3)))) - 1450434363;
                int i97 = ~((-1611336204) | i);
                int i98 = ~i;
                int i99 = ((int) (j8 >> 32)) & (2038856378 + ((i97 | (~((-277086353) | i98))) * 920) + (((~(451196144 | i98)) | 1611336203) * 920) + (((~((-1611336204) | i98)) | (~(2062532347 | i)) | (~((-277086353) | i))) * 920));
                int i100 = ((int) j8) & (2072280017 + ((~((-1510154795) | i98)) * (-116)) + ((637324757 | i) * 116) + (((~(2074551167 | i)) | 72928384) * 116));
                int i101 = getHighResolutionOutputSizeshNQ4ISI;
                int i102 = (i101 & 67) + (i101 | 67);
                getHighSpeedVideoFpsRangesFor = i102 % 128;
                if (i102 % 2 == 0) {
                    i4 = (~(i & 33)) & (i | 33);
                    int i103 = -r3;
                    int i104 = (r3 & i103) | (r3 ^ i103);
                    i5 = (i104 & 96) + (i104 | 96);
                } else {
                    i4 = (~(i & 10)) & (i | 10);
                    int i105 = (r3 & (-2)) | ((~r3) & 1);
                    int i106 = -i105;
                    i5 = ((i105 & i106) | (i105 ^ i106)) >> 31;
                }
                int i107 = (~i5) & i4;
                int i108 = i & i5;
                int i109 = (i107 & i108) | (i107 ^ i108);
                int i110 = i ^ i3;
                int i111 = -i110;
                int i112 = ((i110 & i111) | (i110 ^ i111)) >> 31;
                int i113 = i109 & (~i112);
                int i114 = i3 & i112;
                int i115 = (i113 ^ i114) | (i114 & i113);
                try {
                    int indexOf2 = android.text.TextUtils.indexOf("", "");
                    int highSpeedVideoFpsRanges3 = com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.getHighSpeedVideoFpsRanges();
                    int i116 = indexOf2 * 934;
                    int i117 = (i116 ^ (-37280)) + ((i116 & (-37280)) << 1);
                    int i118 = ~indexOf2;
                    int i119 = ~highSpeedVideoFpsRanges3;
                    int i120 = ~(i118 | i119);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(new char[]{'!', 7, 27, '\b', ' ', '\"', 16, '\n', '\"', '\b', 30, ' ', 28, 7, 17, 18, 1, '!', 28, 5, 22, '!', 14, '#', 1, '!', '#', 22, 13819, 13819, '\b', '\"', 25, 5, 28, 5, 22, '!', 16, '\n'}, ((i117 - (~(-(-(((i120 & (-41)) | ((-41) ^ i120)) * (-933)))))) - 1) + (((~((i119 & (-41)) | ((-41) ^ i119))) | (~(((-41) & indexOf2) | ((-41) ^ indexOf2)))) * 933) + ((~((indexOf2 & 40) | (indexOf2 ^ 40))) * 933), (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 19), objArr7);
                    file2 = new java.io.File((java.lang.String) objArr7[0]);
                    int i121 = getHighResolutionOutputSizeshNQ4ISI;
                    i13 = (i121 & 51) + (i121 | 51);
                    getHighSpeedVideoFpsRangesFor = i13 % 128;
                } catch (java.lang.Exception unused2) {
                }
                if (i13 % 2 == 0) {
                    file2.canRead();
                    throw null;
                }
                if (file2.canRead()) {
                    java.io.FileReader fileReader = new java.io.FileReader(file2);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                    try {
                        java.lang.String readLine2 = bufferedReader.readLine();
                        int i122 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int highSpeedVideoFpsRanges4 = com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.getHighSpeedVideoFpsRanges();
                        int i123 = (i122 * (-495)) - 990;
                        int i124 = ~i122;
                        int i125 = ~((i124 ^ (-3)) | (i124 & (-3)));
                        int i126 = ~i122;
                        int i127 = ~(i126 | highSpeedVideoFpsRanges4);
                        int i128 = ((i125 ^ i127) | (i127 & i125)) * 992;
                        int i129 = (i123 ^ i128) + ((i128 & i123) << 1);
                        int i130 = ~(i124 | (-3));
                        int i131 = ~((i126 ^ highSpeedVideoFpsRanges4) | (i126 & highSpeedVideoFpsRanges4));
                        int i132 = (i130 & i131) | (i130 ^ i131);
                        int i133 = ~(i122 | (~highSpeedVideoFpsRanges4) | 2);
                        int i134 = -(-(((i132 & i133) | (i132 ^ i133)) * (-496)));
                        int i135 = (i129 ^ i134) + ((i134 & i129) << 1);
                        int i136 = -(-(((highSpeedVideoFpsRanges4 ^ 2) | (highSpeedVideoFpsRanges4 & 2)) * 496));
                        int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                        int i138 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i139 = i138 * 71;
                        int i140 = ((i139 | (-2484)) << 1) - (i139 ^ (-2484));
                        int i141 = ~i138;
                        int i142 = ~((i141 & 36) | (i141 ^ 36));
                        int i143 = ~((i ^ 36) | (i & 36));
                        int i144 = i140 + (((i142 & i143) | (i142 ^ i143)) * (-140));
                        int i145 = (i138 ^ 36) | (i138 & 36);
                        int i146 = i144 + ((~((i145 & i) | (i145 ^ i))) * 70);
                        int i147 = ~i138;
                        int i148 = ~((i147 & 36) | (i147 ^ 36));
                        int i149 = ~(((-37) & i138) | ((-37) ^ i138));
                        int i150 = -(-(((~((i138 & i) | (i138 ^ i))) | (i148 & i149) | (i148 ^ i149)) * 70));
                        a(new char[]{30, 26, 13838}, i137, (byte) (((i146 | i150) << 1) - (i150 ^ i146)), new java.lang.Object[1]);
                        if (!readLine2.equals((java.lang.String) r10[0])) {
                            fileReader.close();
                            bufferedReader.close();
                            str = readLine2;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            a(new char[]{' ', '\r', 0, 28, '#', ' ', '\b', 27, 7, '!', '\"', '\t', 2, '\"', 11, '\"', 1, 19, 28, 5, 22, '!', 7, 4, '\b', '\"', 18, 15, '\"', 11, 13840}, android.graphics.Color.alpha(0) + 31, (byte) (16 - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr8);
                            file = new java.io.File((java.lang.String) objArr8[0]);
                            if (!file.canRead()) {
                                bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
                                int i151 = getHighSpeedVideoFpsRangesFor;
                                int i152 = ((i151 | 35) << 1) - (i151 ^ 35);
                                getHighResolutionOutputSizeshNQ4ISI = i152 % 128;
                                int i153 = i152 % 2;
                                try {
                                    try {
                                        readLine = bufferedReader.readLine();
                                        char[] cArr3 = {13820};
                                        int i154 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        int i155 = getHighSpeedVideoFpsRangesFor;
                                        int i156 = (i155 ^ 25) + ((i155 & 25) << 1);
                                        getHighResolutionOutputSizeshNQ4ISI = i156 % 128;
                                        if (i156 % 2 != 0) {
                                            int i157 = -(android.os.SystemClock.elapsedRealtime() > 1L ? 1 : (android.os.SystemClock.elapsedRealtime() == 1L ? 0 : -1));
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            a(cArr3, i154, (byte) ((i157 ^ 22) + ((i157 & 22) << 1)), objArr9);
                                            str2 = (java.lang.String) objArr9[0];
                                        } else {
                                            int i158 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            a(cArr3, i154, (byte) (((i158 | 82) << 1) - (i158 ^ 82)), objArr10);
                                            str2 = (java.lang.String) objArr10[0];
                                        }
                                    } catch (java.lang.Exception unused3) {
                                    }
                                    if (readLine.equals(str2)) {
                                        int i159 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i160 = ((i159 | 36) << 1) - (i159 ^ 36);
                                        int i161 = -android.view.MotionEvent.axisFromString("");
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        a(new char[]{'!', 7, 27, '\b', ' ', '\"', 16, '\n', '\"', '\b', 30, ' ', 28, 7, 17, 18, 1, '!', 28, 5, 22, '!', 14, '#', 1, '!', 28, 5, 22, '!', 14, '#', 4, 2, 26, 30}, i160, (byte) (((i161 | 52) << 1) - (i161 ^ 52)), objArr11);
                                        java.io.File file3 = new java.io.File((java.lang.String) objArr11[0]);
                                        if (file3.canRead()) {
                                            fileReader = new java.io.FileReader(file3);
                                            bufferedReader = new java.io.BufferedReader(fileReader);
                                            try {
                                                java.lang.String readLine3 = bufferedReader.readLine();
                                                int i162 = getHighSpeedVideoFpsRangesFor + 5;
                                                getHighResolutionOutputSizeshNQ4ISI = i162 % 128;
                                                int i163 = i162 % 2;
                                                char[] cArr4 = {13820};
                                                int trimmedLength = 1 - android.text.TextUtils.getTrimmedLength("");
                                                int i164 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                int highSpeedVideoFpsRanges5 = com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.getHighSpeedVideoFpsRanges();
                                                int i165 = (i164 * 868) - (-69440);
                                                int i166 = ~i164;
                                                int i167 = ~highSpeedVideoFpsRanges5;
                                                int i168 = (i166 ^ i167) | (i166 & i167);
                                                int i169 = getHighSpeedVideoFpsRangesFor + 97;
                                                i7 = i98;
                                                int i170 = i169 % 128;
                                                getHighResolutionOutputSizeshNQ4ISI = i170;
                                                i6 = i115;
                                                if (i169 % 2 != 0) {
                                                    int i171 = ~i168;
                                                    int i172 = ~(((-81) ^ i167) | ((-81) & i167));
                                                    i11 = i165 << ((-867) << ((i171 ^ i172) | (i171 & i172)));
                                                    i12 = ~i164;
                                                } else {
                                                    int i173 = ~i168;
                                                    int i174 = ~((-81) | i167);
                                                    int i175 = ((i173 ^ i174) | (i173 & i174)) * (-867);
                                                    i11 = ((i165 | i175) << 1) - (i175 ^ i165);
                                                    i12 = i166;
                                                }
                                                int i176 = ~((i12 & (-81)) | (i12 ^ (-81)));
                                                int i177 = ~((i166 ^ highSpeedVideoFpsRanges5) | (i166 & highSpeedVideoFpsRanges5));
                                                int i178 = (i11 - (~(-(-((-1734) * (((i176 & i177) | (i176 ^ i177)) | (~(((-81) ^ highSpeedVideoFpsRanges5) | ((-81) & highSpeedVideoFpsRanges5))))))))) - 1;
                                                int i179 = ~i164;
                                                int i180 = (i179 ^ (-81)) | (i179 & (-81));
                                                int i181 = ~((i180 & i167) | (i180 ^ i167));
                                                int i182 = ((i170 | 67) << 1) - (i170 ^ 67);
                                                getHighSpeedVideoFpsRangesFor = i182 % 128;
                                                int i183 = i182 % 2;
                                                int i184 = i179 | 80;
                                                int i185 = ~((i184 & highSpeedVideoFpsRanges5) | (i184 ^ highSpeedVideoFpsRanges5));
                                                int i186 = (i185 & i181) | (i181 ^ i185);
                                                int i187 = (i164 & (-81)) | ((-81) ^ i164);
                                                int i188 = ~((i187 & highSpeedVideoFpsRanges5) | (i187 ^ highSpeedVideoFpsRanges5));
                                                int i189 = 867 * ((i186 & i188) | (i186 ^ i188));
                                                byte b5 = (byte) ((i178 & i189) + (i178 | i189));
                                                try {
                                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                    a(cArr4, trimmedLength, b5, objArr12);
                                                    boolean equals = readLine3.equals((java.lang.String) objArr12[0]);
                                                    fileReader.close();
                                                    bufferedReader.close();
                                                    if (equals && str != null) {
                                                        objArr = new java.lang.Object[2];
                                                        int[] iArr = new int[1];
                                                        objArr[1] = iArr;
                                                        int i190 = (~(i & 20)) & (i | 20);
                                                        java.lang.String[] strArr3 = {str};
                                                        int i191 = getHighResolutionOutputSizeshNQ4ISI + 17;
                                                        int i192 = i191 % 128;
                                                        getHighSpeedVideoFpsRangesFor = i192;
                                                        int i193 = i191 % 2;
                                                        int i194 = i192 + 49;
                                                        getHighResolutionOutputSizeshNQ4ISI = i194 % 128;
                                                        if (i194 % 2 != 0) {
                                                            iArr[1] = i190;
                                                            objArr[0] = strArr3;
                                                        } else {
                                                            iArr[0] = i190;
                                                            objArr[0] = strArr3;
                                                        }
                                                        int i195 = ((int[]) objArr[1])[0];
                                                        int i196 = i6;
                                                        int i197 = ((~i196) & i) | (i196 & i7);
                                                        int i198 = -i197;
                                                        int i199 = ((i197 & i198) | (i197 ^ i198)) >> 31;
                                                        int i200 = (~i199) & i195;
                                                        int i201 = i196 & i199;
                                                        int i202 = (i201 & i200) | (i200 ^ i201);
                                                        java.lang.String[] strArr4 = (java.lang.String[]) objArr[0];
                                                        java.lang.Object[] objArr13 = new java.lang.Object[2];
                                                        int i203 = (i195 & i7) | ((~i195) & i);
                                                        int i204 = -i203;
                                                        int i205 = (((i203 & i204) | (i203 ^ i204)) >> 31) & 1;
                                                        int i206 = -i205;
                                                        int i207 = (~(((i206 & i205) | (i205 ^ i206)) >> 31)) & 1;
                                                        objArr13[i205] = null;
                                                        objArr13[i207] = strArr4;
                                                        int i208 = getHighSpeedVideoFpsRangesFor;
                                                        i8 = (i208 & 41) + (i208 | 41);
                                                        int i209 = i8 % 128;
                                                        getHighResolutionOutputSizeshNQ4ISI = i209;
                                                        if (i8 % 2 == 0) {
                                                            strArr = (java.lang.String[]) objArr13[1];
                                                            objArr2 = new java.lang.Object[]{new int[0], new int[1], new int[1]};
                                                            int i210 = (~(i & i202)) & (i | i202);
                                                            int i211 = -i210;
                                                            i10 = (i210 & i211) | (i210 ^ i211);
                                                            c = 2;
                                                            i9 = 31;
                                                        } else {
                                                            strArr = (java.lang.String[]) objArr13[0];
                                                            java.lang.Object[] objArr14 = new java.lang.Object[4];
                                                            objArr14[0] = new int[1];
                                                            objArr14[1] = new int[1];
                                                            c = 2;
                                                            objArr14[2] = new int[1];
                                                            int i212 = ((~i202) & i) | (i202 & i7);
                                                            i9 = 31;
                                                            i10 = i212 | (-i212);
                                                            objArr2 = objArr14;
                                                        }
                                                        int i213 = (i10 >> i9) & 16;
                                                        ((int[]) objArr2[c])[0] = i;
                                                        ((int[]) objArr2[1])[0] = i202;
                                                        objArr2[3] = strArr;
                                                        int i214 = (((((~((-176417775) | i7)) | 33644960) | (~(i7 | 415140446))) * (-397)) - 164209284) + ((306012592 | i) * 397);
                                                        int i215 = (i214 & i213) + (i214 | i213);
                                                        int i216 = i209 + 27;
                                                        getHighSpeedVideoFpsRangesFor = i216 % 128;
                                                        int i217 = i216 % 2;
                                                        int i218 = ((i215 * 628) - (~(i2 * 628))) - 1;
                                                        int i219 = (i2 | i | (~i215)) * (-627);
                                                        int i220 = (((i218 & i219) + (i218 | i219)) - (~(-(-(((~((~i2) | i)) | i215) * (-627)))))) - 1;
                                                        int i221 = ~(i7 | i2);
                                                        int i222 = ~((i & i215) | (i215 ^ i));
                                                        int i223 = (i220 - (~(((i221 & i222) | (i221 ^ i222)) * 627))) - 1;
                                                        int i224 = i223 << 13;
                                                        int i225 = (i224 & (~i223)) | ((~i224) & i223);
                                                        int i226 = i225 >>> 17;
                                                        int i227 = ((~i225) & i226) | ((~i226) & i225);
                                                        int i228 = i227 << 5;
                                                        ((int[]) objArr2[0])[0] = ((~i227) & i228) | ((~i228) & i227);
                                                        return objArr2;
                                                    }
                                                    objArr = new java.lang.Object[]{new java.lang.String[0], new int[]{i}};
                                                    int i229 = getHighResolutionOutputSizeshNQ4ISI;
                                                    int i230 = (i229 & 53) + (i229 | 53);
                                                    int i231 = i230 % 128;
                                                    getHighSpeedVideoFpsRangesFor = i231;
                                                    int i232 = i230 % 2;
                                                    int i233 = ((i231 | 3) << 1) - (i231 ^ 3);
                                                    getHighResolutionOutputSizeshNQ4ISI = i233 % 128;
                                                    int i234 = i233 % 2;
                                                    int i235 = i231 + 49;
                                                    getHighResolutionOutputSizeshNQ4ISI = i235 % 128;
                                                    int i236 = i235 % 2;
                                                    int i1952 = ((int[]) objArr[1])[0];
                                                    int i1962 = i6;
                                                    int i1972 = ((~i1962) & i) | (i1962 & i7);
                                                    int i1982 = -i1972;
                                                    int i1992 = ((i1972 & i1982) | (i1972 ^ i1982)) >> 31;
                                                    int i2002 = (~i1992) & i1952;
                                                    int i2012 = i1962 & i1992;
                                                    int i2022 = (i2012 & i2002) | (i2002 ^ i2012);
                                                    java.lang.String[] strArr42 = (java.lang.String[]) objArr[0];
                                                    java.lang.Object[] objArr132 = new java.lang.Object[2];
                                                    int i2032 = (i1952 & i7) | ((~i1952) & i);
                                                    int i2042 = -i2032;
                                                    int i2052 = (((i2032 & i2042) | (i2032 ^ i2042)) >> 31) & 1;
                                                    int i2062 = -i2052;
                                                    int i2072 = (~(((i2062 & i2052) | (i2052 ^ i2062)) >> 31)) & 1;
                                                    objArr132[i2052] = null;
                                                    objArr132[i2072] = strArr42;
                                                    int i2082 = getHighSpeedVideoFpsRangesFor;
                                                    i8 = (i2082 & 41) + (i2082 | 41);
                                                    int i2092 = i8 % 128;
                                                    getHighResolutionOutputSizeshNQ4ISI = i2092;
                                                    if (i8 % 2 == 0) {
                                                    }
                                                    int i2132 = (i10 >> i9) & 16;
                                                    ((int[]) objArr2[c])[0] = i;
                                                    ((int[]) objArr2[1])[0] = i2022;
                                                    objArr2[3] = strArr;
                                                    int i2142 = (((((~((-176417775) | i7)) | 33644960) | (~(i7 | 415140446))) * (-397)) - 164209284) + ((306012592 | i) * 397);
                                                    int i2152 = (i2142 & i2132) + (i2142 | i2132);
                                                    int i2162 = i2092 + 27;
                                                    getHighSpeedVideoFpsRangesFor = i2162 % 128;
                                                    int i2172 = i2162 % 2;
                                                    int i2182 = ((i2152 * 628) - (~(i2 * 628))) - 1;
                                                    int i2192 = (i2 | i | (~i2152)) * (-627);
                                                    int i2202 = (((i2182 & i2192) + (i2182 | i2192)) - (~(-(-(((~((~i2) | i)) | i2152) * (-627)))))) - 1;
                                                    int i2212 = ~(i7 | i2);
                                                    int i2222 = ~((i & i2152) | (i2152 ^ i));
                                                    int i2232 = (i2202 - (~(((i2212 & i2222) | (i2212 ^ i2222)) * 627))) - 1;
                                                    int i2242 = i2232 << 13;
                                                    int i2252 = (i2242 & (~i2232)) | ((~i2242) & i2232);
                                                    int i2262 = i2252 >>> 17;
                                                    int i2272 = ((~i2252) & i2262) | ((~i2262) & i2252);
                                                    int i2282 = i2272 << 5;
                                                    ((int[]) objArr2[0])[0] = ((~i2272) & i2282) | ((~i2282) & i2272);
                                                    return objArr2;
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                            }
                                        } else {
                                            int i237 = getHighResolutionOutputSizeshNQ4ISI + 41;
                                            getHighSpeedVideoFpsRangesFor = i237 % 128;
                                            int i238 = i237 % 2;
                                        }
                                    }
                                } finally {
                                }
                            } else {
                                int i239 = getHighResolutionOutputSizeshNQ4ISI;
                                int i240 = ((i239 | 67) << 1) - (i239 ^ 67);
                                getHighSpeedVideoFpsRangesFor = i240 % 128;
                                int i241 = i240 % 2;
                            }
                            i6 = i115;
                            i7 = i98;
                            objArr = new java.lang.Object[]{new java.lang.String[0], new int[]{i}};
                            int i2292 = getHighResolutionOutputSizeshNQ4ISI;
                            int i2302 = (i2292 & 53) + (i2292 | 53);
                            int i2312 = i2302 % 128;
                            getHighSpeedVideoFpsRangesFor = i2312;
                            int i2322 = i2302 % 2;
                            int i2332 = ((i2312 | 3) << 1) - (i2312 ^ 3);
                            getHighResolutionOutputSizeshNQ4ISI = i2332 % 128;
                            int i2342 = i2332 % 2;
                            int i2352 = i2312 + 49;
                            getHighResolutionOutputSizeshNQ4ISI = i2352 % 128;
                            int i2362 = i2352 % 2;
                            int i19522 = ((int[]) objArr[1])[0];
                            int i19622 = i6;
                            int i19722 = ((~i19622) & i) | (i19622 & i7);
                            int i19822 = -i19722;
                            int i19922 = ((i19722 & i19822) | (i19722 ^ i19822)) >> 31;
                            int i20022 = (~i19922) & i19522;
                            int i20122 = i19622 & i19922;
                            int i20222 = (i20122 & i20022) | (i20022 ^ i20122);
                            java.lang.String[] strArr422 = (java.lang.String[]) objArr[0];
                            java.lang.Object[] objArr1322 = new java.lang.Object[2];
                            int i20322 = (i19522 & i7) | ((~i19522) & i);
                            int i20422 = -i20322;
                            int i20522 = (((i20322 & i20422) | (i20322 ^ i20422)) >> 31) & 1;
                            int i20622 = -i20522;
                            int i20722 = (~(((i20622 & i20522) | (i20522 ^ i20622)) >> 31)) & 1;
                            objArr1322[i20522] = null;
                            objArr1322[i20722] = strArr422;
                            int i20822 = getHighSpeedVideoFpsRangesFor;
                            i8 = (i20822 & 41) + (i20822 | 41);
                            int i20922 = i8 % 128;
                            getHighResolutionOutputSizeshNQ4ISI = i20922;
                            if (i8 % 2 == 0) {
                            }
                            int i21322 = (i10 >> i9) & 16;
                            ((int[]) objArr2[c])[0] = i;
                            ((int[]) objArr2[1])[0] = i20222;
                            objArr2[3] = strArr;
                            int i21422 = (((((~((-176417775) | i7)) | 33644960) | (~(i7 | 415140446))) * (-397)) - 164209284) + ((306012592 | i) * 397);
                            int i21522 = (i21422 & i21322) + (i21422 | i21322);
                            int i21622 = i20922 + 27;
                            getHighSpeedVideoFpsRangesFor = i21622 % 128;
                            int i21722 = i21622 % 2;
                            int i21822 = ((i21522 * 628) - (~(i2 * 628))) - 1;
                            int i21922 = (i2 | i | (~i21522)) * (-627);
                            int i22022 = (((i21822 & i21922) + (i21822 | i21922)) - (~(-(-(((~((~i2) | i)) | i21522) * (-627)))))) - 1;
                            int i22122 = ~(i7 | i2);
                            int i22222 = ~((i & i21522) | (i21522 ^ i));
                            int i22322 = (i22022 - (~(((i22122 & i22222) | (i22122 ^ i22222)) * 627))) - 1;
                            int i22422 = i22322 << 13;
                            int i22522 = (i22422 & (~i22322)) | ((~i22422) & i22322);
                            int i22622 = i22522 >>> 17;
                            int i22722 = ((~i22522) & i22622) | ((~i22622) & i22522);
                            int i22822 = i22722 << 5;
                            ((int[]) objArr2[0])[0] = ((~i22722) & i22822) | ((~i22822) & i22722);
                            return objArr2;
                        }
                        fileReader.close();
                        bufferedReader.close();
                        int i242 = getHighSpeedVideoFpsRangesFor + 105;
                        getHighResolutionOutputSizeshNQ4ISI = i242 % 128;
                        int i243 = i242 % 2;
                    } finally {
                    }
                }
                str = null;
                java.lang.Object[] objArr82 = new java.lang.Object[1];
                a(new char[]{' ', '\r', 0, 28, '#', ' ', '\b', 27, 7, '!', '\"', '\t', 2, '\"', 11, '\"', 1, 19, 28, 5, 22, '!', 7, 4, '\b', '\"', 18, 15, '\"', 11, 13840}, android.graphics.Color.alpha(0) + 31, (byte) (16 - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr82);
                file = new java.io.File((java.lang.String) objArr82[0]);
                if (!file.canRead()) {
                }
                i6 = i115;
                i7 = i98;
                objArr = new java.lang.Object[]{new java.lang.String[0], new int[]{i}};
                int i22922 = getHighResolutionOutputSizeshNQ4ISI;
                int i23022 = (i22922 & 53) + (i22922 | 53);
                int i23122 = i23022 % 128;
                getHighSpeedVideoFpsRangesFor = i23122;
                int i23222 = i23022 % 2;
                int i23322 = ((i23122 | 3) << 1) - (i23122 ^ 3);
                getHighResolutionOutputSizeshNQ4ISI = i23322 % 128;
                int i23422 = i23322 % 2;
                int i23522 = i23122 + 49;
                getHighResolutionOutputSizeshNQ4ISI = i23522 % 128;
                int i23622 = i23522 % 2;
                int i195222 = ((int[]) objArr[1])[0];
                int i196222 = i6;
                int i197222 = ((~i196222) & i) | (i196222 & i7);
                int i198222 = -i197222;
                int i199222 = ((i197222 & i198222) | (i197222 ^ i198222)) >> 31;
                int i200222 = (~i199222) & i195222;
                int i201222 = i196222 & i199222;
                int i202222 = (i201222 & i200222) | (i200222 ^ i201222);
                java.lang.String[] strArr4222 = (java.lang.String[]) objArr[0];
                java.lang.Object[] objArr13222 = new java.lang.Object[2];
                int i203222 = (i195222 & i7) | ((~i195222) & i);
                int i204222 = -i203222;
                int i205222 = (((i203222 & i204222) | (i203222 ^ i204222)) >> 31) & 1;
                int i206222 = -i205222;
                int i207222 = (~(((i206222 & i205222) | (i205222 ^ i206222)) >> 31)) & 1;
                objArr13222[i205222] = null;
                objArr13222[i207222] = strArr4222;
                int i208222 = getHighSpeedVideoFpsRangesFor;
                i8 = (i208222 & 41) + (i208222 | 41);
                int i209222 = i8 % 128;
                getHighResolutionOutputSizeshNQ4ISI = i209222;
                if (i8 % 2 == 0) {
                }
                int i213222 = (i10 >> i9) & 16;
                ((int[]) objArr2[c])[0] = i;
                ((int[]) objArr2[1])[0] = i202222;
                objArr2[3] = strArr;
                int i214222 = (((((~((-176417775) | i7)) | 33644960) | (~(i7 | 415140446))) * (-397)) - 164209284) + ((306012592 | i) * 397);
                int i215222 = (i214222 & i213222) + (i214222 | i213222);
                int i216222 = i209222 + 27;
                getHighSpeedVideoFpsRangesFor = i216222 % 128;
                int i217222 = i216222 % 2;
                int i218222 = ((i215222 * 628) - (~(i2 * 628))) - 1;
                int i219222 = (i2 | i | (~i215222)) * (-627);
                int i220222 = (((i218222 & i219222) + (i218222 | i219222)) - (~(-(-(((~((~i2) | i)) | i215222) * (-627)))))) - 1;
                int i221222 = ~(i7 | i2);
                int i222222 = ~((i & i215222) | (i215222 ^ i));
                int i223222 = (i220222 - (~(((i221222 & i222222) | (i221222 ^ i222222)) * 627))) - 1;
                int i224222 = i223222 << 13;
                int i225222 = (i224222 & (~i223222)) | ((~i224222) & i223222);
                int i226222 = i225222 >>> 17;
                int i227222 = ((~i225222) & i226222) | ((~i226222) & i225222);
                int i228222 = i227222 << 5;
                ((int[]) objArr2[0])[0] = ((~i227222) & i228222) | ((~i228222) & i227222);
                return objArr2;
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        }

        private IntentActionKeys() {
        }
    }

    public static final class IntentKeys {
        public static final java.lang.String PENDING_INTENT = "pending_intent";
        public static final java.lang.String WRAPPED_INTENT = "wrapped_intent";

        private IntentKeys() {
        }
    }
}
