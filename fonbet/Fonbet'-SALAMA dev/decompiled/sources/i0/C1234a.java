package i0;

import android.text.Editable;
import g0.t;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13810a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1234a f13811b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f13812c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f13812c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
