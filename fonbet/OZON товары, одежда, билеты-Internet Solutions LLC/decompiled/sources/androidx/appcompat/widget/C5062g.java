package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import i.C6977a;
import j.C7232a;
import ru.ozon.app.android.R;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5062g {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C5061f f37929a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37930b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37931c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37932d;

    C5062g(@NonNull C5061f c5061f) {
        this.f37929a = c5061f;
    }

    final void a() {
        C5061f c5061f = this.f37929a;
        Drawable checkMarkDrawable = c5061f.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f37930b || this.f37931c) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f37930b) {
                    androidx.core.graphics.drawable.a.j(mutate, null);
                }
                if (this.f37931c) {
                    androidx.core.graphics.drawable.a.k(mutate, null);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c5061f.getDrawableState());
                }
                c5061f.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:3:0x001d, B:5:0x0023, B:8:0x0029, B:9:0x004f, B:11:0x0056, B:12:0x005d, B:14:0x0064, B:21:0x0038, B:23:0x003e, B:25:0x0044), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:3:0x001d, B:5:0x0023, B:8:0x0029, B:9:0x004f, B:11:0x0056, B:12:0x005d, B:14:0x0064, B:21:0x0038, B:23:0x003e, B:25:0x0044), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void b(AttributeSet attributeSet) {
        int n11;
        int n12;
        C5061f c5061f = this.f37929a;
        Context context = c5061f.getContext();
        int[] iArr = C6977a.f65658l;
        b0 v11 = b0.v(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        androidx.core.view.Y.B(c5061f, c5061f.getContext(), iArr, attributeSet, v11.r(), R.attr.checkedTextViewStyle);
        try {
            if (v11.s(1) && (n12 = v11.n(1, 0)) != 0) {
                try {
                    c5061f.setCheckMarkDrawable(C7232a.a(c5061f.getContext(), n12));
                } catch (Resources.NotFoundException unused) {
                }
                if (v11.s(2)) {
                    c5061f.setCheckMarkTintList(v11.c(2));
                }
                if (v11.s(3)) {
                    c5061f.setCheckMarkTintMode(H.c(v11.k(3, -1), null));
                }
                v11.x();
            }
            if (v11.s(0) && (n11 = v11.n(0, 0)) != 0) {
                c5061f.setCheckMarkDrawable(C7232a.a(c5061f.getContext(), n11));
            }
            if (v11.s(2)) {
            }
            if (v11.s(3)) {
            }
            v11.x();
        } catch (Throwable th2) {
            v11.x();
            throw th2;
        }
    }

    final void c() {
        if (this.f37932d) {
            this.f37932d = false;
        } else {
            this.f37932d = true;
            a();
        }
    }
}
