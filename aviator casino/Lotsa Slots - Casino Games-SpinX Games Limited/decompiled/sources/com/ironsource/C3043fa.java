package com.ironsource;

/* renamed from: com.ironsource.fa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3043fa extends android.webkit.WebView implements com.ironsource.InterfaceC3257ra {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.InterfaceC3240qa f6258a;
    private com.ironsource.Pc b;

    public /* synthetic */ C3043fa(android.content.Context context, com.ironsource.InterfaceC3240qa interfaceC3240qa, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new com.ironsource.InterfaceC3240qa.a(0, 1, null) : interfaceC3240qa);
    }

    @Override // com.ironsource.InterfaceC3257ra
    public void a(java.lang.String script) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "script");
        com.ironsource.InterfaceC3240qa interfaceC3240qa = this.f6258a;
        com.ironsource.InterfaceC3240qa interfaceC3240qa2 = null;
        if (interfaceC3240qa == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC3240qa = null;
        }
        if (!interfaceC3240qa.a()) {
            com.ironsource.InterfaceC3240qa interfaceC3240qa3 = this.f6258a;
            if (interfaceC3240qa3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC3240qa3 = null;
            }
            interfaceC3240qa3.a(this);
        }
        com.ironsource.InterfaceC3240qa interfaceC3240qa4 = this.f6258a;
        if (interfaceC3240qa4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC3240qa2 = interfaceC3240qa4;
        }
        interfaceC3240qa2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent event) {
        com.ironsource.Pc pc;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4 && (pc = this.b) != null && pc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3043fa(android.content.Context context, com.ironsource.InterfaceC3240qa javascriptEngine) {
        this(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.f6258a = javascriptEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043fa(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(com.ironsource.Pc pc) {
        this.b = pc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043fa(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a() {
        this.b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043fa(android.content.Context context, android.util.AttributeSet attrs, int i) {
        super(context, attrs, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
