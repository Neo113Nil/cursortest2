package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40828a;

    /* renamed from: b, reason: collision with root package name */
    private final View f40829b;

    /* loaded from: classes8.dex */
    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* loaded from: classes8.dex */
    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j11) {
            return contentCaptureSession.newAutofillId(autofillId, j11);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j11) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j11);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.c$c, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private static class C0749c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private c(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.f40828a = contentCaptureSession;
        this.f40829b = view;
    }

    @NonNull
    public static c f(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new c(contentCaptureSession, view);
    }

    public final AutofillId a(long j11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(androidx.compose.ui.platform.coreshims.b.b(this.f40828a), d.a(this.f40829b).a(), j11);
        }
        return null;
    }

    public final e b(@NonNull AutofillId autofillId, long j11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.i(b.c(androidx.compose.ui.platform.coreshims.b.b(this.f40828a), autofillId, j11));
        }
        return null;
    }

    public final void c(@NonNull AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(androidx.compose.ui.platform.coreshims.b.b(this.f40828a), autofillId, str);
        }
    }

    public final void d(@NonNull ArrayList arrayList) {
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f40828a;
        if (i11 >= 34) {
            C0749c.a(androidx.compose.ui.platform.coreshims.b.b(obj), arrayList);
            return;
        }
        if (i11 >= 29) {
            ContentCaptureSession b11 = androidx.compose.ui.platform.coreshims.b.b(obj);
            View view = this.f40829b;
            ViewStructure b12 = b.b(b11, view);
            a.a(b12).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.b.b(obj), b12);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                b.d(androidx.compose.ui.platform.coreshims.b.b(obj), (ViewStructure) arrayList.get(i12));
            }
            ViewStructure b13 = b.b(androidx.compose.ui.platform.coreshims.b.b(obj), view);
            a.a(b13).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.b.b(obj), b13);
        }
    }

    public final void e(@NonNull long[] jArr) {
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f40828a;
        View view = this.f40829b;
        if (i11 >= 34) {
            b.f(androidx.compose.ui.platform.coreshims.b.b(obj), d.a(view).a(), jArr);
            return;
        }
        if (i11 >= 29) {
            ViewStructure b11 = b.b(androidx.compose.ui.platform.coreshims.b.b(obj), view);
            a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.b.b(obj), b11);
            b.f(androidx.compose.ui.platform.coreshims.b.b(obj), d.a(view).a(), jArr);
            ViewStructure b12 = b.b(androidx.compose.ui.platform.coreshims.b.b(obj), view);
            a.a(b12).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.b.b(obj), b12);
        }
    }
}
