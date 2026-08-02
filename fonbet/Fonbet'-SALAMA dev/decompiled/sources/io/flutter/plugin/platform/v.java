package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes2.dex */
public final class v extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final InputMethodManager f14211a;

    public v(Context context, InputMethodManager inputMethodManager) {
        super(context);
        this.f14211a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return new v(super.createDisplayContext(display), this.f14211a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return "input_method".equals(str) ? this.f14211a : super.getSystemService(str);
    }
}
