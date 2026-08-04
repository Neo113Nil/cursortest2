package p059i0;

import android.text.Editable;
import p046g0.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f13816a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f13817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f13818c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f13818c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
