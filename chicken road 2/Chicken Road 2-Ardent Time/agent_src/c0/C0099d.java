package c0;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099d extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final c0.C0099d f2555e = new c0.C0099d(1);

    @Override // s1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(androidx.window.sidecar.SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        boolean z2 = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z2 = false;
        }
        return java.lang.Boolean.valueOf(z2);
    }
}
