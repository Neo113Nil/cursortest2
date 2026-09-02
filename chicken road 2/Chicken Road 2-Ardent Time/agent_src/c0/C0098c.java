package c0;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098c extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final c0.C0098c f2554e = new c0.C0098c(1);

    @Override // s1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(androidx.window.sidecar.SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        return java.lang.Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
