package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class n extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f7788a;

    public n(android.content.Context context, android.view.inputmethod.InputMethodManager inputMethodManager) {
        super(context);
        this.f7788a = inputMethodManager == null ? (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.Context createDisplayContext(android.view.Display display) {
        return new io.flutter.plugin.platform.n(super.createDisplayContext(display), this.f7788a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        return "input_method".equals(str) ? this.f7788a : super.getSystemService(str);
    }
}
