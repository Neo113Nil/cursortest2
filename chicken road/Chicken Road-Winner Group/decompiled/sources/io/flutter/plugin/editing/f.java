package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* loaded from: classes.dex */
public final class f extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f9193a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, h hVar) {
        super(view, true);
        this.f9193a = hVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f9193a;
    }
}
