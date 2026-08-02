package A0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import d0.EnumC1906a;
import d0.ViewOnAttachStateChangeListenerC1909d;
import i4.InterfaceC2015a;
import r.AbstractC2333k;
import r.C2321G;

/* loaded from: classes.dex */
public final class T implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final T f388a = new T();

    public final boolean onClearTranslation(View view) {
        InterfaceC2015a interfaceC2015a;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        ViewOnAttachStateChangeListenerC1909d contentCaptureManager$ui_release = ((F) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16837p = EnumC1906a.f16825k;
        AbstractC2333k e3 = contentCaptureManager$ui_release.e();
        Object[] objArr = e3.f19013c;
        long[] jArr = e3.f19011a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j5) < 128) {
                        H0.j jVar = ((H0.o) objArr[(i << 3) + i6]).f2117a.f2114d;
                        H0.v vVar = H0.s.f2146C;
                        C2321G c2321g = jVar.f2103k;
                        Object g5 = c2321g.g(vVar);
                        if (g5 == null) {
                            g5 = null;
                        }
                        if (g5 != null) {
                            Object g6 = c2321g.g(H0.i.f2089m);
                            H0.a aVar = (H0.a) (g6 != null ? g6 : null);
                            if (aVar != null && (interfaceC2015a = (InterfaceC2015a) aVar.f2063b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i5 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        i4.c cVar;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        ViewOnAttachStateChangeListenerC1909d contentCaptureManager$ui_release = ((F) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16837p = EnumC1906a.f16825k;
        AbstractC2333k e3 = contentCaptureManager$ui_release.e();
        Object[] objArr = e3.f19013c;
        long[] jArr = e3.f19011a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j5) < 128) {
                        H0.j jVar = ((H0.o) objArr[(i << 3) + i6]).f2117a.f2114d;
                        H0.v vVar = H0.s.f2146C;
                        C2321G c2321g = jVar.f2103k;
                        Object g5 = c2321g.g(vVar);
                        if (g5 == null) {
                            g5 = null;
                        }
                        if (kotlin.jvm.internal.l.a(g5, Boolean.TRUE)) {
                            Object g6 = c2321g.g(H0.i.f2088l);
                            H0.a aVar = (H0.a) (g6 != null ? g6 : null);
                            if (aVar != null && (cVar = (i4.c) aVar.f2063b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i5 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        i4.c cVar;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        ViewOnAttachStateChangeListenerC1909d contentCaptureManager$ui_release = ((F) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16837p = EnumC1906a.f16826l;
        AbstractC2333k e3 = contentCaptureManager$ui_release.e();
        Object[] objArr = e3.f19013c;
        long[] jArr = e3.f19011a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j5) < 128) {
                        H0.j jVar = ((H0.o) objArr[(i << 3) + i6]).f2117a.f2114d;
                        H0.v vVar = H0.s.f2146C;
                        C2321G c2321g = jVar.f2103k;
                        Object g5 = c2321g.g(vVar);
                        if (g5 == null) {
                            g5 = null;
                        }
                        if (kotlin.jvm.internal.l.a(g5, Boolean.FALSE)) {
                            Object g6 = c2321g.g(H0.i.f2088l);
                            H0.a aVar = (H0.a) (g6 != null ? g6 : null);
                            if (aVar != null && (cVar = (i4.c) aVar.f2063b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i5 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
