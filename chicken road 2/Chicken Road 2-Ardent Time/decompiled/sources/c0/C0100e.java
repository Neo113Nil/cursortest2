package c0;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100e extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final c0.C0100e f2556e = new c0.C0100e(1);

    @Override // s1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(androidx.window.sidecar.SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        return java.lang.Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
