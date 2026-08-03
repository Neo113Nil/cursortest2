package io.flutter.plugin.editing;

/* loaded from: classes.dex */
public final class d extends android.view.inputmethod.BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.editing.f f7698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(P0.t tVar, io.flutter.plugin.editing.f fVar) {
        super(tVar, true);
        this.f7698a = fVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final android.text.Editable getEditable() {
        return this.f7698a;
    }
}
