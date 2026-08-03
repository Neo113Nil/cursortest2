package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public abstract class j {
    public static java.util.ArrayList a(android.content.Context context) {
        java.util.List<android.view.inputmethod.InputMethodInfo> list;
        java.util.HashSet hashSet = new java.util.HashSet();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
        try {
            list = inputMethodManager.getEnabledInputMethodList();
        } catch (java.lang.Throwable unused) {
            list = null;
        }
        if (list != null) {
            java.util.Iterator<android.view.inputmethod.InputMethodInfo> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                for (android.view.inputmethod.InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                    if (inputMethodSubtype.getMode().equals("keyboard") && i < 10) {
                        java.lang.String locale = inputMethodSubtype.getLocale();
                        if (!android.text.TextUtils.isEmpty(locale)) {
                            try {
                                java.lang.String replace = locale.replace("_", "-");
                                hashSet.add(replace);
                                com.fyber.inneractive.sdk.util.IAlog.a("Available input language: %s", replace);
                                i++;
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                hashSet.addAll(java.util.Arrays.asList(android.os.LocaleList.getDefault().toLanguageTags().split(",")));
            } else {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                if (locale2 != null) {
                    hashSet.add(locale2.toString().replace("_", "-"));
                }
            }
        }
        return new java.util.ArrayList(hashSet);
    }
}
