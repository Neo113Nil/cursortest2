package com.startapp.sdk.internal;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import e2.C0291f;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ea extends j6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(Context context) {
        super(context);
        kotlin.jvm.internal.j.e(context, "context");
    }

    public static final String b(InputMethodSubtype inputMethodSubtype) {
        kotlin.jvm.internal.j.b(inputMethodSubtype);
        return da.a(inputMethodSubtype);
    }

    @Override // com.startapp.sdk.internal.j6
    public final /* bridge */ /* synthetic */ Object c() {
        return ca.f3538b;
    }

    @Override // com.startapp.sdk.internal.j6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ca a() {
        Object systemService = this.f3897a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
            C0291f c0291f = new C0291f(0, new String[]{currentInputMethodSubtype != null ? da.a(currentInputMethodSubtype) : null});
            List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
            kotlin.jvm.internal.j.d(inputMethodList, "getInputMethodList(...)");
            Set V2 = u2.f.V(new u2.i(new u2.c(new u2.c(u2.f.T(new C0291f(0, new u2.e[]{c0291f, new u2.k(new u2.c(u2.f.T(new u2.k(new C0291f(1, inputMethodList), new H2.o(1, inputMethodManager)), new A(5)), true, new A(0)), new A(1))}), new A(4)), false, new A(7)), true, new A(2))));
            if (!V2.isEmpty()) {
                return new ca(V2);
            }
        }
        return null;
    }

    public static final List a(InputMethodManager systemService, InputMethodInfo inputMethodInfo) {
        kotlin.jvm.internal.j.e(systemService, "$systemService");
        return systemService.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
    }

    public static final boolean a(InputMethodSubtype inputMethodSubtype) {
        return "keyboard".equals(inputMethodSubtype.getMode());
    }

    public static final boolean a(String it) {
        kotlin.jvm.internal.j.e(it, "it");
        return it.length() > 0;
    }
}
