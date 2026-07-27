package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class p extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final InputMethodManager f10258a;

    public p(Context context, InputMethodManager inputMethodManager) {
        super(context);
        this.f10258a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return new p(super.createDisplayContext(display), this.f10258a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return "input_method".equals(str) ? this.f10258a : super.getSystemService(str);
    }
}
