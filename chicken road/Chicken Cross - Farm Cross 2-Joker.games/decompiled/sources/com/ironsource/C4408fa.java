package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC4605qa;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4408fa extends WebView implements InterfaceC4622ra {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4605qa f8195a;
    private Pc b;

    public /* synthetic */ C4408fa(Context context, InterfaceC4605qa interfaceC4605qa, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC4605qa.a(0, 1, null) : interfaceC4605qa);
    }

    @Override // com.ironsource.InterfaceC4622ra
    public void a(String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC4605qa interfaceC4605qa = this.f8195a;
        InterfaceC4605qa interfaceC4605qa2 = null;
        if (interfaceC4605qa == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC4605qa = null;
        }
        if (!interfaceC4605qa.a()) {
            InterfaceC4605qa interfaceC4605qa3 = this.f8195a;
            if (interfaceC4605qa3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC4605qa3 = null;
            }
            interfaceC4605qa3.a(this);
        }
        InterfaceC4605qa interfaceC4605qa4 = this.f8195a;
        if (interfaceC4605qa4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC4605qa2 = interfaceC4605qa4;
        }
        interfaceC4605qa2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent event) {
        Pc pc;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4 && (pc = this.b) != null && pc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4408fa(Context context, InterfaceC4605qa javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.f8195a = javascriptEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4408fa(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Pc pc) {
        this.b = pc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4408fa(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a() {
        this.b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4408fa(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
