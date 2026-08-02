package com.zettle.sdk.feature.taptopay.ui.tipping;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/CustomPercentageTippingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "amount", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountComponent;", "currency", "Ljava/util/Currency;", "keypad", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad;", "observer", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "pay", "Landroid/widget/Button;", "paymentViewModel", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "getPaymentViewModel", "()Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "paymentViewModel$delegate", "Lkotlin/Lazy;", "percentageBuilder", "Ljava/lang/StringBuilder;", "kotlin.jvm.PlatformType", "tippingViewModel", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel;", "getTippingViewModel", "()Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel;", "tippingViewModel$delegate", "transactionAmount", "", "handleKeypadValue", "input", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setAmount", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "showError", "", "ui_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CustomPercentageTippingFragment extends androidx.fragment.app.Fragment {
    public static final int $stable = 8;
    private java.util.Currency Camera2StreamConfigurationMap;
    private com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad getHighResolutionOutputSizeshNQ4ISI;
    private com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent getHighSpeedVideoFpsRanges;
    private final androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState> getHighSpeedVideoFpsRangesFor;
    private android.widget.Button getHighSpeedVideoSizes;
    private final kotlin.Lazy getHighSpeedVideoSizesFor;
    private java.lang.StringBuilder getInputFormats = new java.lang.StringBuilder("0");
    private long getInputSizeshNQ4ISI;
    private final kotlin.Lazy getOutputFormats;

    public CustomPercentageTippingFragment() {
        final com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment customPercentageTippingFragment = this;
        final kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner> function0 = new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$paymentViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final androidx.view.ViewModelStoreOwner invoke() {
                androidx.fragment.app.FragmentActivity requireActivity = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.requireActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
                return requireActivity;
            }

            {
                super(0);
            }
        };
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$special$$inlined$viewModels$default$1
            private static final byte[] $$c = {118, -29, -86, -87};
            private static final int $$d = 31;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {37, 75, 83, -62};
            private static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
            private static int $getInputSizeshNQ4ISI = 0;
            private static int $getHighSpeedVideoSizesFor = 1;
            private static char getHighSpeedVideoSizes = 39351;
            private static char getHighSpeedVideoFpsRangesFor = 2365;
            private static char Camera2StreamConfigurationMap = 24725;
            private static char getHighSpeedVideoFpsRanges = 6115;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(int i, int i2, byte b) {
                int i3;
                int i4 = i * 4;
                int i5 = 3 - (i2 * 4);
                int i6 = 109 - (b * 3);
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i4 + 1];
                if (bArr == null) {
                    int i7 = i4;
                    int i8 = i5;
                    int i9 = 0;
                    int i10 = i5 + i7;
                    i3 = i9;
                    int i11 = i8;
                    i6 = i10;
                    i5 = i11;
                    bArr2[i3] = (byte) i6;
                    if (i3 == i4) {
                        return new java.lang.String(bArr2, 0);
                    }
                    int i12 = i5 + 1;
                    int i13 = i6;
                    i8 = i12;
                    i5 = bArr[i12];
                    i9 = i3 + 1;
                    i7 = i13;
                    int i102 = i5 + i7;
                    i3 = i9;
                    int i112 = i8;
                    i6 = i102;
                    i5 = i112;
                    bArr2[i3] = (byte) i6;
                    if (i3 == i4) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i6;
                    if (i3 == i4) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
                int i2;
                int i3;
                int i4 = (b2 * 3) + 1;
                int i5 = (b * 3) + 98;
                int i6 = i + 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i4];
                if (bArr == null) {
                    int i7 = i6;
                    i3 = 0;
                    i5 += i6;
                    i6 = i7;
                    i2 = i3;
                    int i8 = i6 + 1;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i5;
                    if (i3 == i4) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i7 = i8;
                    i6 = bArr[i8];
                    i5 += i6;
                    i6 = i7;
                    i2 = i3;
                    int i82 = i6 + 1;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i5;
                    if (i3 == i4) {
                    }
                } else {
                    i2 = 0;
                    int i822 = i6 + 1;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i5;
                    if (i3 == i4) {
                    }
                }
            }

            private static void a(int i, char[] cArr, java.lang.Object[] objArr) {
                int i2 = 2 % 2;
                o.isOutputSupportedForhNQ4ISI isoutputsupportedforhnq4isi = new o.isOutputSupportedForhNQ4ISI();
                char[] cArr2 = new char[cArr.length];
                int i3 = 0;
                isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor = 0;
                char[] cArr3 = new char[2];
                while (isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor < cArr.length) {
                    cArr3[i3] = cArr[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor];
                    cArr3[1] = cArr[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor + 1];
                    int i4 = $10 + 71;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 58224;
                    int i7 = i3;
                    while (i7 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (Camera2StreamConfigurationMap ^ 367215476717441626L)));
                        int i9 = c2 >>> 5;
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[4];
                            objArr2[3] = java.lang.Integer.valueOf(getHighSpeedVideoFpsRanges);
                            objArr2[2] = java.lang.Integer.valueOf(i9);
                            objArr2[1] = java.lang.Integer.valueOf(i8);
                            objArr2[i3] = java.lang.Integer.valueOf(c);
                            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1280850362);
                            if (Camera2StreamConfigurationMap2 == null) {
                                char normalizeMetaState = (char) (android.view.KeyEvent.normalizeMetaState(i3) + 31174);
                                int indexOf = 76 - android.text.TextUtils.indexOf("", "", i3);
                                int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3;
                                java.lang.Class[] clsArr = new java.lang.Class[4];
                                clsArr[i3] = java.lang.Integer.TYPE;
                                clsArr[1] = java.lang.Integer.TYPE;
                                clsArr[2] = java.lang.Integer.TYPE;
                                clsArr[3] = java.lang.Integer.TYPE;
                                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(normalizeMetaState, indexOf, packedPositionGroup, 782698310, false, "k", clsArr);
                            }
                            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).charValue();
                            cArr3[1] = charValue;
                            char[] cArr4 = cArr3;
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[i3]), java.lang.Integer.valueOf((charValue + i6) ^ ((charValue << 4) + ((char) (getHighSpeedVideoSizes ^ 367215476717441626L)))), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getHighSpeedVideoFpsRangesFor)};
                            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1280850362);
                            if (Camera2StreamConfigurationMap3 == null) {
                                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (31174 - android.view.View.combineMeasuredStates(0, 0)), 77 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3, 782698310, false, "k", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i7++;
                            cArr3 = cArr4;
                            i3 = 0;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr5 = cArr3;
                    cArr2[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor] = cArr5[0];
                    cArr2[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor + 1] = cArr5[1];
                    java.lang.Object[] objArr4 = {isoutputsupportedforhnq4isi, isoutputsupportedforhnq4isi};
                    java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1050217642);
                    if (Camera2StreamConfigurationMap4 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22521), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, 12 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), -1550201430, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4);
                    int i10 = $11 + 51;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr5;
                    i3 = 0;
                }
                java.lang.String str = new java.lang.String(cArr2, 0, i);
                int i12 = $11 + 33;
                $10 = i12 % 128;
                if (i12 % 2 == 0) {
                    objArr[0] = str;
                } else {
                    int i13 = 45 / 0;
                    objArr[0] = str;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStoreOwner invoke() {
                int i = 2 % 2;
                int i2 = $getInputSizeshNQ4ISI + 105;
                $getHighSpeedVideoSizesFor = i2 % 128;
                int i3 = i2 % 2;
                androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) kotlin.jvm.functions.Function0.this.invoke();
                int i4 = $getInputSizeshNQ4ISI + 63;
                $getHighSpeedVideoSizesFor = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreOwner;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ androidx.view.ViewModelStoreOwner invoke() {
                int i = 2 % 2;
                int i2 = $getInputSizeshNQ4ISI + 57;
                $getHighSpeedVideoSizesFor = i2 % 128;
                int i3 = i2 % 2;
                androidx.view.ViewModelStoreOwner invoke = invoke();
                int i4 = $getHighSpeedVideoSizesFor + 21;
                $getInputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    return invoke;
                }
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|2|3|4|(1:(3:6|7|(2:10|11)(1:9))(2:102|103))|12|13|14|(1:16)|17|18|19|20|21|(1:23)(5:78|79|80|81|(1:83)(2:84|(7:86|25|26|(1:28)(10:36|37|38|(4:67|68|69|70)(2:40|41)|42|(2:44|45)(1:66)|46|47|48|(2:50|(7:52|53|54|55|56|57|(3:60|30|(1:32)(2:34|35)))))|29|30|(0)(0))(3:87|88|89)))|24|25|26|(0)(0)|29|30|(0)(0)|(1:(0))) */
            /* JADX WARN: Removed duplicated region for block: B:28:0x030a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0648 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0649  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0319 A[Catch: Exception -> 0x0471, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0471, blocks: (B:26:0x02e0, B:36:0x0319, B:47:0x0381, B:50:0x0393, B:52:0x03f3, B:57:0x042a, B:63:0x0462, B:64:0x0468, B:74:0x046a, B:75:0x0470, B:54:0x03fd, B:56:0x041c), top: B:25:0x02e0, inners: #1 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] getHighSpeedVideoSizes(int i, int i2) {
                int i3;
                java.lang.String str;
                char c;
                java.lang.Object[] objArr;
                char c2;
                int i4;
                int i5;
                int i6;
                java.io.File file;
                java.lang.String readLine;
                int i7;
                int capsMode;
                java.lang.String str2;
                java.io.File file2;
                int i8 = 2 % 2;
                try {
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a((lastIndexOf & 20) + (lastIndexOf | 20), new char[]{12359, 54458, 11938, 64488, 21043, 32678, 41174, 55977, 14994, 6243, 27386, 52534, 34812, 13935, 49893, 64128, 22192, 30357, 30670, 15140}, objArr2);
                    int i9 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int i10 = i9 * (-183);
                    int i11 = (i10 ^ 3330) + ((i10 & 3330) << 1);
                    int i12 = ~i9;
                    int i13 = ~((i12 & 18) | (i12 ^ 18));
                    int i14 = ~i;
                    int i15 = ~((i14 & 18) | (i14 ^ 18));
                    int i16 = (i11 - (~(-(-(((i13 & i15) | (i13 ^ i15)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))))) - 1;
                    int i17 = ~(((-19) & i9) | ((-19) ^ i9));
                    int i18 = -(-(((i17 & i) | (i ^ i17)) * (-184)));
                    int i19 = (i16 & i18) + (i18 | i16);
                    int i20 = (~((~i9) | (~i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((i19 & i20) + (i20 | i19), new char[]{3591, 3212, 50008, 47245, 57827, 48553, 58219, 16669, 18350, 8743, 11938, 64488, 21043, 32678, 41174, 55977, 14994, 6243}, objArr3);
                    java.lang.String[] strArr = {(java.lang.String) objArr2[0], (java.lang.String) objArr3[0]};
                    int i21 = 0;
                    while (true) {
                        if (i21 >= 2) {
                            i3 = i;
                            break;
                        }
                        int i22 = $getInputSizeshNQ4ISI;
                        int i23 = ((i22 | 97) << 1) - (i22 ^ 97);
                        $getHighSpeedVideoSizesFor = i23 % 128;
                        int i24 = i23 % 2;
                        java.lang.String str3 = strArr[i21];
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        a(android.view.MotionEvent.axisFromString("") + 17, new char[]{62419, 56420, 37141, 18044, 58083, 29927, 29127, 51370, 37843, 61231, 18694, 46185, 356, 44852, 47333, 49631}, objArr4);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        if (((java.lang.Boolean) cls.getMethod(str3, new java.lang.Class[0]).invoke(cls, null)).booleanValue()) {
                            i3 = (~(i & 1)) & (i | 1);
                            break;
                        }
                        int i25 = i21 - 61;
                        i21 = ((i25 | 62) << 1) - (i25 ^ 62);
                    }
                } catch (java.lang.Exception unused) {
                    i3 = i ^ 2;
                }
                try {
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-998058110);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char maximumFlingVelocity = (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29109);
                        int green = android.graphics.Color.green(0) + 143;
                        int modifierMetaStateMask = 14 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b, b2, (byte) (b2 + 1), objArr5);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(maximumFlingVelocity, green, modifierMetaStateMask, 1501697666, false, (java.lang.String) objArr5[0], new java.lang.Class[0]);
                    }
                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, null)).longValue();
                    long j = 635367584;
                    long j2 = 367;
                    long j3 = (j2 * j) + (j2 * longValue);
                    long j4 = -366;
                    long j5 = -1;
                    long j6 = longValue ^ j5;
                    long elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                    long j7 = (((j3 + ((j | longValue) * j4)) + (j4 * (j | ((j6 | elapsedCpuTime) ^ j5)))) + (366 * (((elapsedCpuTime | (j6 | j)) ^ j5) | (((j ^ j5) | longValue) ^ j5)))) - 1091668057;
                    int i26 = (int) java.lang.Runtime.getRuntime().totalMemory();
                    int i27 = ((int) (j7 >> 32)) & ((-2088991750) + (((-304695585) | i26) * 376) + (((~((~i26) | (-1278620059))) | 1276522650) * (-376)) + (((~(i26 | 1278620058)) | (-1579120827)) * 376));
                    int i28 = ~i;
                    int i29 = ((int) j7) & ((((-635053777) + (((~(2052094072 | i28)) | (~((-614867663) | i))) * (-370))) + ((((~(2052094072 | i)) | (~((-614867663) | i28))) | 1515214896) * (-370))) - 2011204256);
                    int i30 = (r2 & (-2)) | ((~r2) & 1);
                    int i31 = (i30 | (-i30)) >> 31;
                    int i32 = (i31 & i) | (((i & (-11)) | (i28 & 10)) & (~i31));
                    int i33 = (~(i & i3)) & (i | i3);
                    int i34 = -i33;
                    int i35 = ((i33 & i34) | (i33 ^ i34)) >> 31;
                    int i36 = i32 & (~i35);
                    int i37 = i3 & i35;
                    int i38 = (i36 ^ i37) | (i37 & i36);
                    try {
                        int i39 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                        int highSpeedVideoSizes = com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                        int i40 = (i39 * (-589)) + 23640;
                        int i41 = ~highSpeedVideoSizes;
                        int i42 = (~(((-41) ^ i41) | ((-41) & i41))) | (~(((-41) ^ i39) | ((-41) & i39)));
                        int i43 = ~((i41 ^ i39) | (i41 & i39));
                        int i44 = (i42 & i43) | (i42 ^ i43);
                        int i45 = ~i39;
                        int i46 = (i45 ^ 40) | (i45 & 40);
                        int i47 = ~((i46 & highSpeedVideoSizes) | (i46 ^ highSpeedVideoSizes));
                        int i48 = -(-(((i44 & i47) | (i44 ^ i47)) * 590));
                        int i49 = (i40 & i48) + (i40 | i48);
                        int i50 = ~highSpeedVideoSizes;
                        int i51 = ~((-41) | i50);
                        int i52 = ~((-41) | i39);
                        int i53 = (i51 & i52) | (i51 ^ i52);
                        int i54 = ~((i39 & i41) | (i41 ^ i39));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        a((((i49 - (~(((i54 & i53) | (i53 ^ i54)) * (-1180)))) - 1) - (~(((~((i45 ^ i41) | (i45 & i41))) | (~((i50 & 40) | (i50 ^ 40)))) * 590))) - 1, new char[]{61036, 42399, 36749, 9856, 52032, 56708, 14994, 6243, 38985, 52509, 52171, 19585, 14441, 56248, 21043, 32678, 57689, 22457, 8365, 37328, 42624, 13149, 57827, 48553, 57689, 22457, 38739, 8534, 15487, 31363, 37623, 12818, 34730, 32775, 8365, 37328, 42624, 13149, 14994, 6243}, objArr6);
                        file2 = new java.io.File((java.lang.String) objArr6[0]);
                    } catch (java.lang.Exception unused2) {
                    }
                    if (!file2.canRead()) {
                        int i55 = $getHighSpeedVideoSizesFor + 39;
                        $getInputSizeshNQ4ISI = i55 % 128;
                        int i56 = i55 % 2;
                    } else {
                        java.io.FileReader fileReader = new java.io.FileReader(file2);
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                        int i57 = $getHighSpeedVideoSizesFor + 49;
                        $getInputSizeshNQ4ISI = i57 % 128;
                        int i58 = i57 % 2;
                        try {
                            str = bufferedReader.readLine();
                            int i59 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a((i59 ^ 3) + ((i59 & 3) << 1), new char[]{11575, 58127, 2116, 12677}, objArr7);
                            if (str.equals((java.lang.String) objArr7[0])) {
                                fileReader.close();
                                bufferedReader.close();
                            } else {
                                int i60 = $getInputSizeshNQ4ISI;
                                int i61 = ((i60 | 43) << 1) - (i60 ^ 43);
                                $getHighSpeedVideoSizesFor = i61 % 128;
                                if (i61 % 2 == 0) {
                                    throw null;
                                }
                                fileReader.close();
                                bufferedReader.close();
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                a(29 - (~(-(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))), new char[]{26487, 22293, 7202, 35443, 57397, 54262, 37207, 41515, 60500, 59936, 10477, 54571, 47032, 13719, 18356, 16320, 62218, 51390, 8365, 37328, 42624, 13149, 10479, 17272, 37623, 12818, 40028, 31060, 49089, 8061, 30670, 15140}, objArr8);
                                file = new java.io.File((java.lang.String) objArr8[0]);
                                if (file.canRead()) {
                                    int i62 = $getInputSizeshNQ4ISI;
                                    int i63 = (i62 & 59) + (i62 | 59);
                                    $getHighSpeedVideoSizesFor = i63 % 128;
                                    int i64 = i63 % 2;
                                } else {
                                    bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
                                    int i65 = $getHighSpeedVideoSizesFor;
                                    int i66 = (i65 ^ 55) + ((i65 & 55) << 1);
                                    $getInputSizeshNQ4ISI = i66 % 128;
                                    try {
                                        if (i66 % 2 != 0) {
                                            try {
                                                readLine = bufferedReader.readLine();
                                                i7 = 0;
                                                capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                throw th;
                                            }
                                        } else {
                                            readLine = bufferedReader.readLine();
                                            capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                                            i7 = 1;
                                        }
                                        int i67 = $getInputSizeshNQ4ISI + 67;
                                        $getHighSpeedVideoSizesFor = i67 % 128;
                                        if (i67 % 2 == 0) {
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            a(i7 * capsMode, new char[]{15084, 58925}, objArr9);
                                            str2 = (java.lang.String) objArr9[0];
                                        } else {
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            a(i7 + capsMode, new char[]{15084, 58925}, objArr10);
                                            str2 = (java.lang.String) objArr10[0];
                                        }
                                        boolean equals = readLine.equals(str2);
                                        int i68 = $getInputSizeshNQ4ISI + 115;
                                        $getHighSpeedVideoSizesFor = i68 % 128;
                                        int i69 = i68 % 2;
                                        if (equals) {
                                            int i70 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int highSpeedVideoSizes2 = com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                                            int i71 = i70 * (-55);
                                            int i72 = (i71 & (-1980)) + (i71 | (-1980));
                                            int i73 = -(-(((~((i70 ^ highSpeedVideoSizes2) | (i70 & highSpeedVideoSizes2))) | 36) * 56));
                                            int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                                            int i75 = -(-((~((i70 ^ 36) | (i70 & 36))) * (-56)));
                                            int i76 = (i74 & i75) + (i75 | i74);
                                            int i77 = ~highSpeedVideoSizes2;
                                            int i78 = ~((i77 & 36) | (i77 ^ 36));
                                            int i79 = ((i70 & i78) | (i70 ^ i78)) * 56;
                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                            a((i76 & i79) + (i79 | i76), new char[]{61036, 42399, 36749, 9856, 52032, 56708, 14994, 6243, 38985, 52509, 52171, 19585, 14441, 56248, 21043, 32678, 57689, 22457, 8365, 37328, 42624, 13149, 57827, 48553, 57689, 22457, 8365, 37328, 42624, 13149, 57827, 48553, 10743, 27058, 33309, 12611}, objArr11);
                                            java.io.File file3 = new java.io.File((java.lang.String) objArr11[0]);
                                            if (file3.canRead()) {
                                                try {
                                                    java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                    int i80 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                    char[] cArr = {15084, 58925};
                                                    int i81 = $getInputSizeshNQ4ISI;
                                                    int i82 = (i81 & 49) + (i81 | 49);
                                                    $getHighSpeedVideoSizesFor = i82 % 128;
                                                    int i83 = i82 % 2;
                                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                    a(i80, cArr, objArr12);
                                                    if (readLine2.equals((java.lang.String) objArr12[0]) && str != null) {
                                                        int i84 = $getHighSpeedVideoSizesFor;
                                                        int i85 = i84 + 47;
                                                        $getInputSizeshNQ4ISI = i85 % 128;
                                                        int i86 = i85 % 2;
                                                        objArr = new java.lang.Object[]{new java.lang.String[]{str}, new int[]{i ^ 20}};
                                                        int i87 = ((i84 | 31) << 1) - (i84 ^ 31);
                                                        $getInputSizeshNQ4ISI = i87 % 128;
                                                        int i88 = i87 % 2;
                                                        c2 = 1;
                                                        c = 0;
                                                        int i89 = ((int[]) objArr[c2])[c];
                                                        int i90 = i ^ i38;
                                                        int i91 = (i90 | (-i90)) >> 31;
                                                        int i92 = (i38 & i91) | ((~i91) & i89);
                                                        int i93 = $getInputSizeshNQ4ISI - (-41);
                                                        $getHighSpeedVideoSizesFor = i93 % 128;
                                                        int i94 = i93 % 2;
                                                        java.lang.String[] strArr2 = (java.lang.String[]) objArr[0];
                                                        java.lang.Object[] objArr13 = new java.lang.Object[2];
                                                        int i95 = (i89 & i28) | ((~i89) & i);
                                                        int i96 = -i95;
                                                        int i97 = (((i95 & i96) | (i95 ^ i96)) >> 31) & 1;
                                                        int i98 = -i97;
                                                        int i99 = (~(((i98 & i97) | (i97 ^ i98)) >> 31)) & 1;
                                                        objArr13[i97] = null;
                                                        objArr13[i99] = strArr2;
                                                        java.lang.String[] strArr3 = (java.lang.String[]) objArr13[0];
                                                        com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                                                        int i100 = ((~i92) & i) | (i92 & i28);
                                                        int i101 = ((i100 | (-i100)) >> 31) & 16;
                                                        ((int[]) r5[2])[0] = i;
                                                        int[] iArr = (int[]) r5[1];
                                                        int i102 = $getInputSizeshNQ4ISI;
                                                        int i103 = (i102 & 83) + (i102 | 83);
                                                        $getHighSpeedVideoSizesFor = i103 % 128;
                                                        int i104 = i103 % 2;
                                                        iArr[0] = i92;
                                                        java.lang.Object[] objArr14 = {new int[1], new int[1], new int[1], strArr3};
                                                        int i105 = (-275349586) + (((~(416603970 | i28)) | (-1008162192)) * (-983)) + (((~((-1008162192) | i28)) | 403985666) * 983);
                                                        int i106 = (i101 * 483) + (i105 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
                                                        int i107 = ~i101;
                                                        int i108 = ~((~i105) | i107);
                                                        int i109 = ~((i107 & i28) | (i107 ^ i28));
                                                        int i110 = (i106 - (~(((i109 & i108) | (i108 ^ i109)) * (-241)))) - 1;
                                                        int i111 = ((i101 ^ i105) | (i101 & i105)) * (-482);
                                                        int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                                                        int i113 = ~i105;
                                                        int i114 = ~((i113 & i101) | (i113 ^ i101));
                                                        int i115 = ~i101;
                                                        int i116 = ~((i115 & i28) | (i115 ^ i28) | i105);
                                                        int i117 = -(-(((i114 & i116) | (i114 ^ i116)) * 241));
                                                        int i118 = (i112 ^ i117) + ((i117 & i112) << 1);
                                                        int i119 = (i102 ^ 91) + ((i102 & 91) << 1);
                                                        $getHighSpeedVideoSizesFor = i119 % 128;
                                                        int i120 = i119 % 2;
                                                        int highSpeedVideoSizes3 = com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                                                        int i121 = i118 * 881;
                                                        int i122 = -(-(i2 * 881));
                                                        int i123 = ((i121 | i122) << 1) - (i121 ^ i122);
                                                        int i124 = ~i118;
                                                        int i125 = ~i2;
                                                        int i126 = ~((i124 & i125) | (i124 ^ i125));
                                                        int i127 = ~i118;
                                                        int i128 = ~((i127 & highSpeedVideoSizes3) | (i127 ^ highSpeedVideoSizes3));
                                                        int i129 = (i126 & i128) | (i126 ^ i128);
                                                        int i130 = ~i2;
                                                        int i131 = ~((i130 & highSpeedVideoSizes3) | (i130 ^ highSpeedVideoSizes3));
                                                        int i132 = (i123 - (~(-(-(((i129 & i131) | (i129 ^ i131)) * (-880)))))) - 1;
                                                        int i133 = $getInputSizeshNQ4ISI;
                                                        int i134 = (i133 ^ 7) + ((i133 & 7) << 1);
                                                        $getHighSpeedVideoSizesFor = i134 % 128;
                                                        int i135 = i134 % 2;
                                                        int i136 = i118 ^ (-1);
                                                        int i137 = ~highSpeedVideoSizes3;
                                                        int i138 = (highSpeedVideoSizes3 & i118) | (i118 ^ highSpeedVideoSizes3);
                                                        int i139 = ((i132 - (~(-(-((-880) * ((~i138) | ((~((i136 & i137) | (i136 ^ i137))) | i2))))))) - 1) + ((~i138) * 880);
                                                        int i140 = i139 << 13;
                                                        int i141 = (i140 | i139) & (~(i139 & i140));
                                                        int i142 = i141 ^ (i141 >>> 17);
                                                        ((int[]) objArr14[0])[0] = i142 ^ (i142 << 5);
                                                        int i143 = ((-2123696463) ^ i28) | ((-2123696463) & i28);
                                                        int i144 = ~i143;
                                                        int i145 = -(-(((i144 & 1284628899) | (1284628899 ^ i144)) * 226));
                                                        int i146 = (519648912 ^ i145) + ((i145 & 519648912) << 1);
                                                        int i147 = (~((-1284628900) | i)) | 57505;
                                                        int i148 = ~((i143 & 1284628899) | (i143 ^ 1284628899));
                                                        int i149 = ((i148 & i147) | (i147 ^ i148)) * (-113);
                                                        int i150 = (i146 ^ i149) + ((i149 & i146) << 1);
                                                        int i151 = (~(((-2123696463) & i) | ((-2123696463) ^ i))) * 113;
                                                        i4 = ((i150 | i151) << 1) - (i151 ^ i150);
                                                        int i152 = (436141052 | i) * (-381);
                                                        i5 = ((-386982724) ^ i152) + ((i152 & (-386982724)) << 1);
                                                        int i153 = ~(155622296 | i28);
                                                        int i154 = (i153 & android.R.color.dim_foreground_inverse_holo_dark) | (17170968 ^ i153);
                                                        i6 = ((i154 & 280518756) | (i154 ^ 280518756)) * 381;
                                                        if (i4 <= ((i5 & i6) + (i6 | i5)) - (-1333983351)) {
                                                            return objArr14;
                                                        }
                                                        throw null;
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                }
                                c2 = 1;
                                objArr = new java.lang.Object[]{new java.lang.String[0], new int[]{i}};
                                c = 0;
                                int i892 = ((int[]) objArr[c2])[c];
                                int i902 = i ^ i38;
                                int i912 = (i902 | (-i902)) >> 31;
                                int i922 = (i38 & i912) | ((~i912) & i892);
                                int i932 = $getInputSizeshNQ4ISI - (-41);
                                $getHighSpeedVideoSizesFor = i932 % 128;
                                int i942 = i932 % 2;
                                java.lang.String[] strArr22 = (java.lang.String[]) objArr[0];
                                java.lang.Object[] objArr132 = new java.lang.Object[2];
                                int i952 = (i892 & i28) | ((~i892) & i);
                                int i962 = -i952;
                                int i972 = (((i952 & i962) | (i952 ^ i962)) >> 31) & 1;
                                int i982 = -i972;
                                int i992 = (~(((i982 & i972) | (i972 ^ i982)) >> 31)) & 1;
                                objArr132[i972] = null;
                                objArr132[i992] = strArr22;
                                java.lang.String[] strArr32 = (java.lang.String[]) objArr132[0];
                                com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                                int i1002 = ((~i922) & i) | (i922 & i28);
                                int i1012 = ((i1002 | (-i1002)) >> 31) & 16;
                                ((int[]) objArr14[2])[0] = i;
                                int[] iArr2 = (int[]) objArr14[1];
                                int i1022 = $getInputSizeshNQ4ISI;
                                int i1032 = (i1022 & 83) + (i1022 | 83);
                                $getHighSpeedVideoSizesFor = i1032 % 128;
                                int i1042 = i1032 % 2;
                                iArr2[0] = i922;
                                java.lang.Object[] objArr142 = {new int[1], new int[1], new int[1], strArr32};
                                int i1052 = (-275349586) + (((~(416603970 | i28)) | (-1008162192)) * (-983)) + (((~((-1008162192) | i28)) | 403985666) * 983);
                                int i1062 = (i1012 * 483) + (i1052 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
                                int i1072 = ~i1012;
                                int i1082 = ~((~i1052) | i1072);
                                int i1092 = ~((i1072 & i28) | (i1072 ^ i28));
                                int i1102 = (i1062 - (~(((i1092 & i1082) | (i1082 ^ i1092)) * (-241)))) - 1;
                                int i1112 = ((i1012 ^ i1052) | (i1012 & i1052)) * (-482);
                                int i1122 = ((i1102 | i1112) << 1) - (i1102 ^ i1112);
                                int i1132 = ~i1052;
                                int i1142 = ~((i1132 & i1012) | (i1132 ^ i1012));
                                int i1152 = ~i1012;
                                int i1162 = ~((i1152 & i28) | (i1152 ^ i28) | i1052);
                                int i1172 = -(-(((i1142 & i1162) | (i1142 ^ i1162)) * 241));
                                int i1182 = (i1122 ^ i1172) + ((i1172 & i1122) << 1);
                                int i1192 = (i1022 ^ 91) + ((i1022 & 91) << 1);
                                $getHighSpeedVideoSizesFor = i1192 % 128;
                                int i1202 = i1192 % 2;
                                int highSpeedVideoSizes32 = com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                                int i1212 = i1182 * 881;
                                int i1222 = -(-(i2 * 881));
                                int i1232 = ((i1212 | i1222) << 1) - (i1212 ^ i1222);
                                int i1242 = ~i1182;
                                int i1252 = ~i2;
                                int i1262 = ~((i1242 & i1252) | (i1242 ^ i1252));
                                int i1272 = ~i1182;
                                int i1282 = ~((i1272 & highSpeedVideoSizes32) | (i1272 ^ highSpeedVideoSizes32));
                                int i1292 = (i1262 & i1282) | (i1262 ^ i1282);
                                int i1302 = ~i2;
                                int i1312 = ~((i1302 & highSpeedVideoSizes32) | (i1302 ^ highSpeedVideoSizes32));
                                int i1322 = (i1232 - (~(-(-(((i1292 & i1312) | (i1292 ^ i1312)) * (-880)))))) - 1;
                                int i1332 = $getInputSizeshNQ4ISI;
                                int i1342 = (i1332 ^ 7) + ((i1332 & 7) << 1);
                                $getHighSpeedVideoSizesFor = i1342 % 128;
                                int i1352 = i1342 % 2;
                                int i1362 = i1182 ^ (-1);
                                int i1372 = ~highSpeedVideoSizes32;
                                int i1382 = (highSpeedVideoSizes32 & i1182) | (i1182 ^ highSpeedVideoSizes32);
                                int i1392 = ((i1322 - (~(-(-((-880) * ((~i1382) | ((~((i1362 & i1372) | (i1362 ^ i1372))) | i2))))))) - 1) + ((~i1382) * 880);
                                int i1402 = i1392 << 13;
                                int i1412 = (i1402 | i1392) & (~(i1392 & i1402));
                                int i1422 = i1412 ^ (i1412 >>> 17);
                                ((int[]) objArr142[0])[0] = i1422 ^ (i1422 << 5);
                                int i1432 = ((-2123696463) ^ i28) | ((-2123696463) & i28);
                                int i1442 = ~i1432;
                                int i1452 = -(-(((i1442 & 1284628899) | (1284628899 ^ i1442)) * 226));
                                int i1462 = (519648912 ^ i1452) + ((i1452 & 519648912) << 1);
                                int i1472 = (~((-1284628900) | i)) | 57505;
                                int i1482 = ~((i1432 & 1284628899) | (i1432 ^ 1284628899));
                                int i1492 = ((i1482 & i1472) | (i1472 ^ i1482)) * (-113);
                                int i1502 = (i1462 ^ i1492) + ((i1492 & i1462) << 1);
                                int i1512 = (~(((-2123696463) & i) | ((-2123696463) ^ i))) * 113;
                                i4 = ((i1502 | i1512) << 1) - (i1512 ^ i1502);
                                int i1522 = (436141052 | i) * (-381);
                                i5 = ((-386982724) ^ i1522) + ((i1522 & (-386982724)) << 1);
                                int i1532 = ~(155622296 | i28);
                                int i1542 = (i1532 & android.R.color.dim_foreground_inverse_holo_dark) | (17170968 ^ i1532);
                                i6 = ((i1542 & 280518756) | (i1542 ^ 280518756)) * 381;
                                if (i4 <= ((i5 & i6) + (i6 | i5)) - (-1333983351)) {
                                }
                            }
                        } finally {
                        }
                    }
                    str = null;
                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                    a(29 - (~(-(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))), new char[]{26487, 22293, 7202, 35443, 57397, 54262, 37207, 41515, 60500, 59936, 10477, 54571, 47032, 13719, 18356, 16320, 62218, 51390, 8365, 37328, 42624, 13149, 10479, 17272, 37623, 12818, 40028, 31060, 49089, 8061, 30670, 15140}, objArr82);
                    file = new java.io.File((java.lang.String) objArr82[0]);
                    if (file.canRead()) {
                    }
                    c2 = 1;
                    objArr = new java.lang.Object[]{new java.lang.String[0], new int[]{i}};
                    c = 0;
                    int i8922 = ((int[]) objArr[c2])[c];
                    int i9022 = i ^ i38;
                    int i9122 = (i9022 | (-i9022)) >> 31;
                    int i9222 = (i38 & i9122) | ((~i9122) & i8922);
                    int i9322 = $getInputSizeshNQ4ISI - (-41);
                    $getHighSpeedVideoSizesFor = i9322 % 128;
                    int i9422 = i9322 % 2;
                    java.lang.String[] strArr222 = (java.lang.String[]) objArr[0];
                    java.lang.Object[] objArr1322 = new java.lang.Object[2];
                    int i9522 = (i8922 & i28) | ((~i8922) & i);
                    int i9622 = -i9522;
                    int i9722 = (((i9522 & i9622) | (i9522 ^ i9622)) >> 31) & 1;
                    int i9822 = -i9722;
                    int i9922 = (~(((i9822 & i9722) | (i9722 ^ i9822)) >> 31)) & 1;
                    objArr1322[i9722] = null;
                    objArr1322[i9922] = strArr222;
                    java.lang.String[] strArr322 = (java.lang.String[]) objArr1322[0];
                    com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                    int i10022 = ((~i9222) & i) | (i9222 & i28);
                    int i10122 = ((i10022 | (-i10022)) >> 31) & 16;
                    ((int[]) objArr142[2])[0] = i;
                    int[] iArr22 = (int[]) objArr142[1];
                    int i10222 = $getInputSizeshNQ4ISI;
                    int i10322 = (i10222 & 83) + (i10222 | 83);
                    $getHighSpeedVideoSizesFor = i10322 % 128;
                    int i10422 = i10322 % 2;
                    iArr22[0] = i9222;
                    java.lang.Object[] objArr1422 = {new int[1], new int[1], new int[1], strArr322};
                    int i10522 = (-275349586) + (((~(416603970 | i28)) | (-1008162192)) * (-983)) + (((~((-1008162192) | i28)) | 403985666) * 983);
                    int i10622 = (i10122 * 483) + (i10522 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
                    int i10722 = ~i10122;
                    int i10822 = ~((~i10522) | i10722);
                    int i10922 = ~((i10722 & i28) | (i10722 ^ i28));
                    int i11022 = (i10622 - (~(((i10922 & i10822) | (i10822 ^ i10922)) * (-241)))) - 1;
                    int i11122 = ((i10122 ^ i10522) | (i10122 & i10522)) * (-482);
                    int i11222 = ((i11022 | i11122) << 1) - (i11022 ^ i11122);
                    int i11322 = ~i10522;
                    int i11422 = ~((i11322 & i10122) | (i11322 ^ i10122));
                    int i11522 = ~i10122;
                    int i11622 = ~((i11522 & i28) | (i11522 ^ i28) | i10522);
                    int i11722 = -(-(((i11422 & i11622) | (i11422 ^ i11622)) * 241));
                    int i11822 = (i11222 ^ i11722) + ((i11722 & i11222) << 1);
                    int i11922 = (i10222 ^ 91) + ((i10222 & 91) << 1);
                    $getHighSpeedVideoSizesFor = i11922 % 128;
                    int i12022 = i11922 % 2;
                    int highSpeedVideoSizes322 = com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.getHighSpeedVideoSizes();
                    int i12122 = i11822 * 881;
                    int i12222 = -(-(i2 * 881));
                    int i12322 = ((i12122 | i12222) << 1) - (i12122 ^ i12222);
                    int i12422 = ~i11822;
                    int i12522 = ~i2;
                    int i12622 = ~((i12422 & i12522) | (i12422 ^ i12522));
                    int i12722 = ~i11822;
                    int i12822 = ~((i12722 & highSpeedVideoSizes322) | (i12722 ^ highSpeedVideoSizes322));
                    int i12922 = (i12622 & i12822) | (i12622 ^ i12822);
                    int i13022 = ~i2;
                    int i13122 = ~((i13022 & highSpeedVideoSizes322) | (i13022 ^ highSpeedVideoSizes322));
                    int i13222 = (i12322 - (~(-(-(((i12922 & i13122) | (i12922 ^ i13122)) * (-880)))))) - 1;
                    int i13322 = $getInputSizeshNQ4ISI;
                    int i13422 = (i13322 ^ 7) + ((i13322 & 7) << 1);
                    $getHighSpeedVideoSizesFor = i13422 % 128;
                    int i13522 = i13422 % 2;
                    int i13622 = i11822 ^ (-1);
                    int i13722 = ~highSpeedVideoSizes322;
                    int i13822 = (highSpeedVideoSizes322 & i11822) | (i11822 ^ highSpeedVideoSizes322);
                    int i13922 = ((i13222 - (~(-(-((-880) * ((~i13822) | ((~((i13622 & i13722) | (i13622 ^ i13722))) | i2))))))) - 1) + ((~i13822) * 880);
                    int i14022 = i13922 << 13;
                    int i14122 = (i14022 | i13922) & (~(i13922 & i14022));
                    int i14222 = i14122 ^ (i14122 >>> 17);
                    ((int[]) objArr1422[0])[0] = i14222 ^ (i14222 << 5);
                    int i14322 = ((-2123696463) ^ i28) | ((-2123696463) & i28);
                    int i14422 = ~i14322;
                    int i14522 = -(-(((i14422 & 1284628899) | (1284628899 ^ i14422)) * 226));
                    int i14622 = (519648912 ^ i14522) + ((i14522 & 519648912) << 1);
                    int i14722 = (~((-1284628900) | i)) | 57505;
                    int i14822 = ~((i14322 & 1284628899) | (i14322 ^ 1284628899));
                    int i14922 = ((i14822 & i14722) | (i14722 ^ i14822)) * (-113);
                    int i15022 = (i14622 ^ i14922) + ((i14922 & i14622) << 1);
                    int i15122 = (~(((-2123696463) & i) | ((-2123696463) ^ i))) * 113;
                    i4 = ((i15022 | i15122) << 1) - (i15122 ^ i15022);
                    int i15222 = (436141052 | i) * (-381);
                    i5 = ((-386982724) ^ i15222) + ((i15222 & (-386982724)) << 1);
                    int i15322 = ~(155622296 | i28);
                    int i15422 = (i15322 & android.R.color.dim_foreground_inverse_holo_dark) | (17170968 ^ i15322);
                    i6 = ((i15422 & 280518756) | (i15422 ^ 280518756)) * 381;
                    if (i4 <= ((i5 & i6) + (i6 | i5)) - (-1333983351)) {
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            }

            {
                super(0);
            }
        });
        final kotlin.jvm.functions.Function0 function02 = null;
        this.getOutputFormats = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(customPercentageTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(kotlin.Lazy.this).getGetHighSpeedVideoSizes();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function03 = kotlin.jvm.functions.Function0.this;
                if (function03 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(lazy);
                androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory;
                androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(lazy);
                androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory2 = androidx.fragment.app.Fragment.this.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> function03 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$tippingViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return new com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.Factory();
            }
        };
        this.getHighSpeedVideoSizesFor = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(customPercentageTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$special$$inlined$activityViewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                androidx.view.ViewModelStore getHighSpeedVideoSizes = androidx.fragment.app.Fragment.this.requireActivity().getGetHighSpeedVideoSizes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getHighSpeedVideoSizes, "");
                return getHighSpeedVideoSizes;
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function04 = kotlin.jvm.functions.Function0.this;
                if (function04 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.viewmodel.CreationExtras defaultViewModelCreationExtras = customPercentageTippingFragment.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, function03 == null ? new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$special$$inlined$activityViewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory = androidx.fragment.app.Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        } : function03);
        this.getHighSpeedVideoFpsRangesFor = new androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$observer$1
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                android.widget.Button button;
                long j;
                java.util.Currency currency;
                com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState2 = viewState;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState2, "");
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState2.getScreen();
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping customAmountTipping = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping) screen;
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.Camera2StreamConfigurationMap = customAmountTipping.getCurrency();
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getInputSizeshNQ4ISI = customAmountTipping.getAmount();
                    button = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getHighSpeedVideoSizes;
                    java.util.Currency currency2 = null;
                    if (button == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        button = null;
                    }
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String string = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_pay_button);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    j = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getInputSizeshNQ4ISI;
                    currency = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.Camera2StreamConfigurationMap;
                    if (currency == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        currency2 = currency;
                    }
                    java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPadKt.format(j, currency2)}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    button.setText(format);
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.view.View inflate = inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_tap_to_pay_custom_percentage_tipping, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getOutputFormats.getValue()).getState().observe(getViewLifecycleOwner(), this.getHighSpeedVideoFpsRangesFor);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.amount);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoFpsRanges = (com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.pad);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad keyPad = (com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad) findViewById2;
        this.getHighResolutionOutputSizeshNQ4ISI = keyPad;
        android.widget.Button button = null;
        if (keyPad == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            keyPad = null;
        }
        keyPad.getAction(new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$onViewCreated$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action action) {
                getHighResolutionOutputSizeshNQ4ISI(action);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action action) {
                java.lang.StringBuilder sb;
                java.lang.StringBuilder sb2;
                java.lang.StringBuilder sb3;
                java.lang.StringBuilder sb4;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
                java.lang.String obj = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.access$handleKeypadValue(com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this, action).toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                int parseInt = java.lang.Integer.parseInt(obj);
                if (parseInt <= 0) {
                    sb3 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getInputFormats;
                    sb3.setLength(0);
                    sb4 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getInputFormats;
                    sb4.append(0);
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.Camera2StreamConfigurationMap(0, false);
                    return;
                }
                if (parseInt > com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.access$getTippingViewModel(com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this).getMaxGratuityPercent()) {
                    int maxGratuityPercent = (int) com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.access$getTippingViewModel(com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this).getMaxGratuityPercent();
                    sb = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getInputFormats;
                    sb.setLength(0);
                    sb2 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.getInputFormats;
                    sb2.append(maxGratuityPercent);
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.Camera2StreamConfigurationMap(maxGratuityPercent, true);
                    return;
                }
                com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this.Camera2StreamConfigurationMap(parseInt, false);
            }

            {
                super(1);
            }
        });
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.next);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        android.widget.Button button2 = (android.widget.Button) findViewById3;
        this.getHighSpeedVideoSizes = button2;
        if (button2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            button = button2;
        }
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.$r8$lambda$1kV4exL6XVfzJtrnpEczXRoV3RA(com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(int i, boolean z) {
        android.widget.Button button = null;
        if (z) {
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent = this.getHighSpeedVideoFpsRanges;
            if (ottoTotalAmountComponent == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                ottoTotalAmountComponent = null;
            }
            int i2 = com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_percentage_limit;
            float maxGratuityPercent = ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) this.getHighSpeedVideoSizesFor.getValue()).getMaxGratuityPercent();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(maxGratuityPercent);
            sb.append("%");
            ottoTotalAmountComponent.setSecondaryTextBottom(getString(i2, sb.toString()));
        } else {
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent2 = this.getHighSpeedVideoFpsRanges;
            if (ottoTotalAmountComponent2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                ottoTotalAmountComponent2 = null;
            }
            ottoTotalAmountComponent2.setSecondaryTextBottom(null);
        }
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent3 = this.getHighSpeedVideoFpsRanges;
        if (ottoTotalAmountComponent3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountComponent3 = null;
        }
        androidx.appcompat.widget.AppCompatTextView amountValueTextView = ottoTotalAmountComponent3.getAmountValueTextView();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(i);
        sb2.append("%");
        amountValueTextView.setText(sb2.toString());
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder builder = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder();
        java.util.Currency currency = this.Camera2StreamConfigurationMap;
        if (currency == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            currency = null;
        }
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency2 = builder.currency(currency);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        com.zettle.sdk.common.ui.text.CurrencyFormatter build = currency2.locale(locale).build();
        long j = (this.getInputSizeshNQ4ISI * i) / 100;
        android.widget.Button button2 = this.getHighSpeedVideoSizes;
        if (button2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            button = button2;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_pay_button);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{build.format(j + this.getInputSizeshNQ4ISI)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        button.setText(format);
    }

    public static /* synthetic */ void $r8$lambda$1kV4exL6XVfzJtrnpEczXRoV3RA(com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment customPercentageTippingFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customPercentageTippingFragment, "");
        java.lang.String obj = customPercentageTippingFragment.getInputFormats.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        float parseFloat = java.lang.Float.parseFloat(obj);
        long j = (long) ((customPercentageTippingFragment.getInputSizeshNQ4ISI * parseFloat) / 100.0f);
        com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.startTransaction$default((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) customPercentageTippingFragment.getHighSpeedVideoSizesFor.getValue(), java.lang.Float.valueOf(parseFloat), null, 2, null);
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) customPercentageTippingFragment.getOutputFormats.getValue();
        androidx.fragment.app.FragmentActivity requireActivity = customPercentageTippingFragment.requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
        tapToPayPaymentViewModel.startTransaction(requireActivity, j);
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel access$getTippingViewModel(com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment customPercentageTippingFragment) {
        return (com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) customPercentageTippingFragment.getHighSpeedVideoSizesFor.getValue();
    }

    public static final /* synthetic */ java.lang.StringBuilder access$handleKeypadValue(com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment customPercentageTippingFragment, com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action action) {
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete) {
            customPercentageTippingFragment.getInputFormats.deleteCharAt(r3.length() - 1);
            java.lang.StringBuilder sb = customPercentageTippingFragment.getInputFormats;
            if (sb.length() == 0) {
                sb = customPercentageTippingFragment.getInputFormats;
                sb.append(0);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            return sb;
        }
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number) {
            java.lang.StringBuilder sb2 = customPercentageTippingFragment.getInputFormats;
            sb2.append(((com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number) action).getInput());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "");
            return sb2;
        }
        if (!(action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb3 = customPercentageTippingFragment.getInputFormats;
        sb3.append(((com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero) action).getValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "");
        return sb3;
    }
}
