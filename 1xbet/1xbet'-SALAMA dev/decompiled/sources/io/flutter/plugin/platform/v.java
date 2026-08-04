package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputMethodManager f14217a;

    public v(Context context, InputMethodManager inputMethodManager) {
        super(context);
        this.f14217a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return new v(super.createDisplayContext(display), this.f14217a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return "input_method".equals(str) ? this.f14217a : super.getSystemService(str);
    }
}
