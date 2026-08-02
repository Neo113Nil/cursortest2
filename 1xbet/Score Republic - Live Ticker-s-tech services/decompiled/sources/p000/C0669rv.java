package p000;

import android.text.Editable;

/* JADX INFO: renamed from: rv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0669rv extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f6975a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0669rv f6976b;

    /* JADX INFO: renamed from: c */
    public static Class f6977c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f6977c;
        return cls != null ? new f91(cls, charSequence) : super.newEditable(charSequence);
    }
}
