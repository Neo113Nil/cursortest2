package com.razorpay;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u0004H\u0007¨\u0006\u0012"}, d2 = {"Lcom/razorpay/UpiTurboUtilities;", "", "()V", "clearCheckoutLocalData", "", "context", "Landroid/content/Context;", "clearSDKState", "clearTurboLocalData", "clearTurboRuntimeState", "activity", "Landroid/app/Activity;", "clearTwoPartySDKState", "clearUISDKState", "destroyUiData", "isDeviceOnboarded", "", "releaseUiActivityReference", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpiTurboUtilities {
    public static final UpiTurboUtilities INSTANCE = new UpiTurboUtilities();

    private UpiTurboUtilities() {
    }

    private final void __l1_(Context context) {
        try {
            String string = new StorageBridge(context).getString("Consent");
            new StorageBridge(context).editor.clear().apply();
            Object obj = Class.forName("com.razorpay.upi.CheckoutTwoPartyPreferenceHelper").getDeclaredField("INSTANCE").get(null);
            obj.getClass().getDeclaredMethod("clearAllPrefs", Context.class).invoke(obj, context);
            new StorageBridge(context).setString("Consent", string);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private final void _l_1l__(Context context) {
        try {
            Object obj = Class.forName("com.razorpay.upi.twoParty.sdk.RazorpayUpi2p").getDeclaredField("INSTANCE").get(null);
            obj.getClass().getDeclaredMethod("clearSDKState", Context.class).invoke(obj, context);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private final void _llI(Context context) {
        try {
            Object obj = Class.forName("com.razorpay.upi.RazorpayUpi").getDeclaredField("Companion").get(null);
            obj.getClass().getMethod("clearLocalData", Context.class).invoke(obj, context);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Keep
    private final void l$1_I$l$(Context context) {
        try {
            Class<?> cls = Class.forName("com.razorpay.upi.turbo_view.RazorpayTurboUI");
            Object invoke = cls.getDeclaredMethod("getInstance", null).invoke(cls, null);
            invoke.getClass().getDeclaredMethod("clearSDKState", Context.class).invoke(invoke, context);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final void clearSDKState(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        _l_1l__(context);
        _llI(context);
        __l1_(context);
        l$1_I$l$(context);
    }

    @Keep
    public final void destroyUiData() {
        try {
            Class<?> cls = Class.forName("com.razorpay.upi.turbo_view.RazorpayTurboUI");
            Object invoke = cls.getDeclaredMethod("getInstance", null).invoke(cls, null);
            invoke.getClass().getDeclaredMethod("destroy", Activity.class).invoke(invoke, null);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final boolean isDeviceOnboarded(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Object obj = Class.forName("com.razorpay.upi.RazorpayUpi").getDeclaredField("Companion").get(null);
            Object invoke = obj.getClass().getMethod("isDeviceOnboarded", Activity.class).invoke(obj, activity);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Keep
    public final void releaseUiActivityReference() {
        try {
            Class<?> cls = Class.forName("com.razorpay.upi.turbo_view.RazorpayTurboUI");
            Object invoke = cls.getDeclaredMethod("getInstance", null).invoke(cls, null);
            invoke.getClass().getDeclaredMethod("releaseActivityReference", Activity.class).invoke(invoke, null);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private final void l$1_I$l$(Activity activity) {
        try {
            Object obj = Class.forName("com.razorpay.upi.RazorpayUpi").getDeclaredField("Companion").get(null);
            obj.getClass().getMethod("destroy", Activity.class).invoke(obj, activity);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
