package x1;

import android.text.Editable;
import v1.u;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2640a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f21067a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2640a f21068b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f21069c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f21069c;
        return cls != null ? new u(cls, charSequence) : super.newEditable(charSequence);
    }
}
