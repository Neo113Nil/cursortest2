package com.facebook.appevents.codeless.internal;

/* compiled from: SensitiveUserDataUtils.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/codeless/internal/SensitiveUserDataUtils;", "", "()V", "isCreditCard", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "isEmail", "isPassword", "isPersonName", "isPhoneNumber", "isPostalAddress", "isSensitiveUserData", "Landroid/view/View;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SensitiveUserDataUtils {
    public static final com.facebook.appevents.codeless.internal.SensitiveUserDataUtils INSTANCE = new com.facebook.appevents.codeless.internal.SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isSensitiveUserData(android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.internal.SensitiveUserDataUtils.class)) {
            return false;
        }
        try {
            if (!(view instanceof android.widget.TextView)) {
                return false;
            }
            com.facebook.appevents.codeless.internal.SensitiveUserDataUtils sensitiveUserDataUtils = INSTANCE;
            if (!sensitiveUserDataUtils.isPassword((android.widget.TextView) view) && !sensitiveUserDataUtils.isCreditCard((android.widget.TextView) view) && !sensitiveUserDataUtils.isPersonName((android.widget.TextView) view) && !sensitiveUserDataUtils.isPostalAddress((android.widget.TextView) view) && !sensitiveUserDataUtils.isPhoneNumber((android.widget.TextView) view)) {
                if (!sensitiveUserDataUtils.isEmail((android.widget.TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.internal.SensitiveUserDataUtils.class);
            return false;
        }
    }

    private final boolean isPassword(android.widget.TextView view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 128) {
                return true;
            }
            return view.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isEmail(android.widget.TextView view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 32) {
                return true;
            }
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            java.lang.String textOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(view);
            if (textOfView != null && textOfView.length() != 0) {
                return android.util.Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPersonName(android.widget.TextView view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return view.getInputType() == 96;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPostalAddress(android.widget.TextView view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return view.getInputType() == 112;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPhoneNumber(android.widget.TextView view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return view.getInputType() == 3;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isCreditCard(android.widget.TextView view) {
        int i;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            java.lang.String replace = new kotlin.text.Regex("\\s").replace(com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(view), "");
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i2 = length - 1;
                if (i2 >= 0) {
                    boolean z = false;
                    i = 0;
                    while (true) {
                        int i3 = i2 - 1;
                        char charAt = replace.charAt(i2);
                        if (!java.lang.Character.isDigit(charAt)) {
                            return false;
                        }
                        int digitToInt = kotlin.text.CharsKt.digitToInt(charAt);
                        if (z && (digitToInt = digitToInt * 2) > 9) {
                            digitToInt = (digitToInt % 10) + 1;
                        }
                        i += digitToInt;
                        z = !z;
                        if (i3 < 0) {
                            break;
                        }
                        i2 = i3;
                    }
                } else {
                    i = 0;
                }
                return i % 10 == 0;
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
