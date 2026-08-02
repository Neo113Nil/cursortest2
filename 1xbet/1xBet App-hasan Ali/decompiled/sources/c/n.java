package c;

import S3.C0416t;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7363a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f7364b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    public static u f7365c;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        r2.run();
        r8 = r8.getWindow();
        kotlin.jvm.internal.l.e("getWindow(...)", r8);
        r3.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(AbstractActivityC0531j abstractActivityC0531j) {
        int i = 0;
        C0521H c0521h = new C0521H(0, 0, new C0416t(11));
        C0521H c0521h2 = new C0521H(f7363a, f7364b, new C0416t(11));
        View decorView = abstractActivityC0531j.getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        u uVar = f7365c;
        if (uVar == null) {
            int i5 = Build.VERSION.SDK_INT;
            uVar = i5 >= 35 ? new t() : i5 >= 30 ? new s() : i5 >= 29 ? new r() : i5 >= 28 ? new q() : i5 >= 26 ? new p() : new o();
            f7365c = uVar;
        }
        u uVar2 = uVar;
        l lVar = new l(uVar2, c0521h, c0521h2, abstractActivityC0531j, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                m mVar = new m(lVar, viewGroup.getContext());
                mVar.setTag(uVar2);
                mVar.setVisibility(8);
                mVar.setWillNotDraw(true);
                viewGroup.addView(mVar);
                break;
            }
            int i6 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof u) {
                break;
            } else {
                i = i6;
            }
        }
    }
}
