package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.JvmStatic;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class d {
    public static final d a = new d();

    /* JADX WARN: Code restructure failed: missing block: B:95:0x008c, code lost:
    
        if ((r6 % 10) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x008e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #6 {all -> 0x011d, blocks: (B:4:0x000d, B:6:0x0011, B:11:0x0038, B:15:0x0096, B:19:0x00b2, B:23:0x00ce, B:27:0x00e9, B:45:0x0116, B:54:0x00e3, B:62:0x00c8, B:70:0x00ac, B:100:0x0090, B:110:0x0032, B:104:0x0020, B:107:0x002a, B:72:0x0043, B:77:0x0061, B:80:0x0067, B:82:0x0072, B:84:0x0078, B:86:0x007e, B:88:0x0084, B:94:0x008a, B:48:0x00d9, B:34:0x00f3, B:37:0x00fd, B:39:0x0103, B:42:0x010a, B:56:0x00bd, B:64:0x00a1), top: B:3:0x000d, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #6 {all -> 0x011d, blocks: (B:4:0x000d, B:6:0x0011, B:11:0x0038, B:15:0x0096, B:19:0x00b2, B:23:0x00ce, B:27:0x00e9, B:45:0x0116, B:54:0x00e3, B:62:0x00c8, B:70:0x00ac, B:100:0x0090, B:110:0x0032, B:104:0x0020, B:107:0x002a, B:72:0x0043, B:77:0x0061, B:80:0x0067, B:82:0x0072, B:84:0x0078, B:86:0x007e, B:88:0x0084, B:94:0x008a, B:48:0x00d9, B:34:0x00f3, B:37:0x00fd, B:39:0x0103, B:42:0x010a, B:56:0x00bd, B:64:0x00a1), top: B:3:0x000d, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #6 {all -> 0x011d, blocks: (B:4:0x000d, B:6:0x0011, B:11:0x0038, B:15:0x0096, B:19:0x00b2, B:23:0x00ce, B:27:0x00e9, B:45:0x0116, B:54:0x00e3, B:62:0x00c8, B:70:0x00ac, B:100:0x0090, B:110:0x0032, B:104:0x0020, B:107:0x002a, B:72:0x0043, B:77:0x0061, B:80:0x0067, B:82:0x0072, B:84:0x0078, B:86:0x007e, B:88:0x0084, B:94:0x008a, B:48:0x00d9, B:34:0x00f3, B:37:0x00fd, B:39:0x0103, B:42:0x010a, B:56:0x00bd, B:64:0x00a1), top: B:3:0x000d, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #6 {all -> 0x011d, blocks: (B:4:0x000d, B:6:0x0011, B:11:0x0038, B:15:0x0096, B:19:0x00b2, B:23:0x00ce, B:27:0x00e9, B:45:0x0116, B:54:0x00e3, B:62:0x00c8, B:70:0x00ac, B:100:0x0090, B:110:0x0032, B:104:0x0020, B:107:0x002a, B:72:0x0043, B:77:0x0061, B:80:0x0067, B:82:0x0072, B:84:0x0078, B:86:0x007e, B:88:0x0084, B:94:0x008a, B:48:0x00d9, B:34:0x00f3, B:37:0x00fd, B:39:0x0103, B:42:0x010a, B:56:0x00bd, B:64:0x00a1), top: B:3:0x000d, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean matches;
        d dVar = a;
        if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            dVar.getClass();
            if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                try {
                    z = textView.getInputType() == 128 ? true : textView.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, dVar);
                }
                if (!z) {
                    TextView textView2 = (TextView) view;
                    if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                        try {
                            String replace = new Regex("\\s").replace(e.j(textView2), "");
                            int length = replace.length();
                            if (length >= 12 && length <= 19) {
                                int i = length - 1;
                                int i2 = 0;
                                boolean z5 = false;
                                while (true) {
                                    if (-1 >= i) {
                                        break;
                                    }
                                    char charAt = replace.charAt(i);
                                    if (!Character.isDigit(charAt)) {
                                        break;
                                    }
                                    int digitToInt = CharsKt.digitToInt(charAt);
                                    if (z5 && (digitToInt = digitToInt * 2) > 9) {
                                        digitToInt = (digitToInt % 10) + 1;
                                    }
                                    i2 += digitToInt;
                                    z5 = !z5;
                                    i--;
                                }
                            }
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.a.a(th2, dVar);
                        }
                    }
                    boolean z6 = false;
                    if (!z6) {
                        TextView textView3 = (TextView) view;
                        if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                            try {
                            } catch (Throwable th3) {
                                com.facebook.internal.instrument.crashshield.a.a(th3, dVar);
                            }
                            if (textView3.getInputType() == 96) {
                                z2 = true;
                                if (!z2) {
                                    TextView textView4 = (TextView) view;
                                    if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                                        try {
                                        } catch (Throwable th4) {
                                            com.facebook.internal.instrument.crashshield.a.a(th4, dVar);
                                        }
                                        if (textView4.getInputType() == 112) {
                                            z3 = true;
                                            if (!z3) {
                                                TextView textView5 = (TextView) view;
                                                if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                                                    try {
                                                    } catch (Throwable th5) {
                                                        com.facebook.internal.instrument.crashshield.a.a(th5, dVar);
                                                    }
                                                    if (textView5.getInputType() == 3) {
                                                        z4 = true;
                                                        if (!z4) {
                                                            TextView textView6 = (TextView) view;
                                                            if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                                                                try {
                                                                    if (textView6.getInputType() == 32) {
                                                                        matches = true;
                                                                    } else {
                                                                        String j = e.j(textView6);
                                                                        if (j != null && j.length() != 0) {
                                                                            matches = Patterns.EMAIL_ADDRESS.matcher(j).matches();
                                                                        }
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    com.facebook.internal.instrument.crashshield.a.a(th6, dVar);
                                                                }
                                                                if (!matches) {
                                                                    return false;
                                                                }
                                                            }
                                                            matches = false;
                                                            if (!matches) {
                                                            }
                                                        }
                                                    }
                                                }
                                                z4 = false;
                                                if (!z4) {
                                                }
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    }
                }
                return true;
            }
            z = false;
            if (!z) {
            }
            return true;
        } catch (Throwable th7) {
            com.facebook.internal.instrument.crashshield.a.a(th7, d.class);
            return false;
        }
    }
}
