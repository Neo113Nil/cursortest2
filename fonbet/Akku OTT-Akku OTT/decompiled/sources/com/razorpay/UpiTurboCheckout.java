package com.razorpay;

import android.app.Activity;
import com.razorpay.RzpTurboExternalPlugin;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0001J\"\u0010\u001a\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0001J\"\u0010\u001b\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0001J\"\u0010\u001d\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0001J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/razorpay/UpiTurboCheckout;", "", "activity", "Landroid/app/Activity;", "customerMobile", "", "color", "orderId", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "isPluginIntegrated", "", "pluginCompatibilityResponse", "Lcom/razorpay/RzpPluginCompatibilityResponse;", "razorpayTurbo", "Lcom/razorpay/RzpTurboExternalPlugin;", "razorpayTurboPlugin", "Lcom/razorpay/RzpPlugin;", "checkForPlugin", "clearSession", "", "destroy", "getLinkedUpiAccounts", "listener", "initTurboSdk", "initialize", "session", "linkNewUpiAccount", "linkNewUpiAccountCheckout", "amountInDisplayFormat", "manageUpiAccounts", "setMobileNumber", "Companion", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.razorpay._O_$oo, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class UpiTurboCheckout {
    public static final _O_$oo$O$$$__o0Oo Companion = new _O_$oo$O$$$__o0Oo(null);
    private Activity activity;
    private String color;
    private String customerMobile;
    private boolean isPluginIntegrated;
    private String orderId;
    private RzpPluginCompatibilityResponse pluginCompatibilityResponse;
    private RzpTurboExternalPlugin razorpayTurbo;
    private RzpPlugin razorpayTurboPlugin;

    public UpiTurboCheckout(Activity activity, String customerMobile, String str, String str2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(customerMobile, "customerMobile");
        this.activity = activity;
        this.customerMobile = customerMobile;
        this.color = str;
        this.orderId = str2;
    }

    private final boolean checkForPlugin() {
        boolean contains$default;
        Class<?> loadClass;
        Class<?> loadClass2;
        if (this.isPluginIntegrated) {
            return true;
        }
        HashMap<String, String> plugins = BaseUtils.getAllPluginsFromManifest(this.activity);
        Intrinsics.checkNotNullExpressionValue(plugins, "plugins");
        for (Map.Entry<String, String> entry : plugins.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            contains$default = StringsKt__StringsKt.contains$default(key, "upi_turbo", false, 2, (Object) null);
            if (contains$default) {
                ClassLoader classLoader = RzpTurboExternalPlugin.class.getClassLoader();
                RzpPluginCompatibilityResponse rzpPluginCompatibilityResponse = null;
                Object newInstance = (classLoader == null || (loadClass2 = classLoader.loadClass(entry.getValue())) == null) ? null : loadClass2.newInstance();
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.razorpay.RzpTurboExternalPlugin");
                }
                this.razorpayTurbo = (RzpTurboExternalPlugin) newInstance;
                ClassLoader classLoader2 = RzpPlugin.class.getClassLoader();
                Object newInstance2 = (classLoader2 == null || (loadClass = classLoader2.loadClass(entry.getValue())) == null) ? null : loadClass.newInstance();
                if (newInstance2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.razorpay.RzpPlugin");
                }
                RzpPlugin rzpPlugin = (RzpPlugin) newInstance2;
                this.razorpayTurboPlugin = rzpPlugin;
                RzpPluginCompatibilityResponse isCompatible = rzpPlugin.isCompatible(com.razorpay.a.a.O$$$__o0Oo.SDK_TYPE, 1717, com.razorpay.a.a.O$$$__o0Oo.VERSION_NAME);
                Intrinsics.checkNotNullExpressionValue(isCompatible, "razorpayTurboPlugin.isCo…ON_NAME\n                )");
                this.pluginCompatibilityResponse = isCompatible;
                if (isCompatible == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pluginCompatibilityResponse");
                } else {
                    rzpPluginCompatibilityResponse = isCompatible;
                }
                if (!rzpPluginCompatibilityResponse.isCompatible()) {
                    return false;
                }
                this.isPluginIntegrated = true;
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getLinkedUpiAccounts$default(UpiTurboCheckout upiTurboCheckout, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        upiTurboCheckout.getLinkedUpiAccounts(obj, str);
    }

    private final void initTurboSdk() {
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
                rzpTurboExternalPlugin = null;
            }
            rzpTurboExternalPlugin.initTurboSdk(this.activity, this.customerMobile, null);
        }
    }

    @Deprecated(message = "This method is deprecated, as it is only intended for internal testing")
    public final void clearSession() {
        if (!checkForPlugin()) {
            throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
        if (rzpTurboExternalPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
            rzpTurboExternalPlugin = null;
        }
        rzpTurboExternalPlugin.clearSession();
    }

    public final void destroy() {
        if (!checkForPlugin()) {
            throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
        if (rzpTurboExternalPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
            rzpTurboExternalPlugin = null;
        }
        rzpTurboExternalPlugin.destroy();
    }

    public final void getLinkedUpiAccounts(Object listener, String customerMobile) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!checkForPlugin()) {
            throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
        if (rzpTurboExternalPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
            rzpTurboExternalPlugin = null;
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin2 = rzpTurboExternalPlugin;
        Activity activity = this.activity;
        if (customerMobile == null) {
            customerMobile = this.customerMobile;
        }
        rzpTurboExternalPlugin2.getLinkedUpiAccountsCheckout(activity, customerMobile, null, this.color, listener, this.orderId);
    }

    public final void initialize(Object session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (!checkForPlugin()) {
            throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
        if (rzpTurboExternalPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
            rzpTurboExternalPlugin = null;
        }
        rzpTurboExternalPlugin.initialize(this.activity, session, this.customerMobile, null);
    }

    public final void linkNewUpiAccount(String customerMobile, String color, Object listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!checkForPlugin()) {
            throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
        if (rzpTurboExternalPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
            rzpTurboExternalPlugin = null;
        }
        rzpTurboExternalPlugin.linkNewUpiAccountCheckout(this.activity, customerMobile, null, color, null, listener, this.orderId, true);
    }

    public final void linkNewUpiAccountCheckout(String color, String amountInDisplayFormat, Object listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!checkForPlugin()) {
            throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
        if (rzpTurboExternalPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
            rzpTurboExternalPlugin = null;
        }
        RzpTurboExternalPlugin.DefaultImpls.linkNewUpiAccountCheckout$default(rzpTurboExternalPlugin, this.activity, this.customerMobile, null, color, amountInDisplayFormat, listener, this.orderId, false, 128, null);
    }

    public final void manageUpiAccounts(String customerMobile, String color, Object listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!checkForPlugin()) {
            throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
        }
        RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
        if (rzpTurboExternalPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("razorpayTurbo");
            rzpTurboExternalPlugin = null;
        }
        rzpTurboExternalPlugin.manageUpiAccounts(this.activity, customerMobile, color, listener);
    }

    public final void setMobileNumber(String customerMobile) {
        Intrinsics.checkNotNullParameter(customerMobile, "customerMobile");
        this.customerMobile = customerMobile;
    }

    public /* synthetic */ UpiTurboCheckout(Activity activity, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, str, str2, (i & 8) != 0 ? null : str3);
    }
}
