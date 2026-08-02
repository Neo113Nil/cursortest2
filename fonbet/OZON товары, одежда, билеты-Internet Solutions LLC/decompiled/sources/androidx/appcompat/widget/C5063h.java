package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import i.C6977a;
import j.C7232a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5063h {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final CompoundButton f37933a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37934b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37935c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37936d;

    C5063h(@NonNull CompoundButton compoundButton) {
        this.f37933a = compoundButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x001b, B:5:0x0021, B:8:0x0027, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x001b, B:5:0x0021, B:8:0x0027, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void a(AttributeSet attributeSet, int i11) {
        int n11;
        int n12;
        CompoundButton compoundButton = this.f37933a;
        Context context = compoundButton.getContext();
        int[] iArr = C6977a.f65659m;
        b0 v11 = b0.v(context, attributeSet, iArr, i11, 0);
        androidx.core.view.Y.B(compoundButton, compoundButton.getContext(), iArr, attributeSet, v11.r(), i11);
        try {
            if (v11.s(1) && (n12 = v11.n(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C7232a.a(compoundButton.getContext(), n12));
                } catch (Resources.NotFoundException unused) {
                }
                if (v11.s(2)) {
                    androidx.core.widget.c.c(compoundButton, v11.c(2));
                }
                if (v11.s(3)) {
                    androidx.core.widget.c.d(compoundButton, H.c(v11.k(3, -1), null));
                }
                v11.x();
            }
            if (v11.s(0) && (n11 = v11.n(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C7232a.a(compoundButton.getContext(), n11));
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

    final void b() {
        if (this.f37936d) {
            this.f37936d = false;
            return;
        }
        this.f37936d = true;
        CompoundButton compoundButton = this.f37933a;
        Drawable a11 = androidx.core.widget.c.a(compoundButton);
        if (a11 != null) {
            if (this.f37934b || this.f37935c) {
                Drawable mutate = a11.mutate();
                if (this.f37934b) {
                    androidx.core.graphics.drawable.a.j(mutate, null);
                }
                if (this.f37935c) {
                    androidx.core.graphics.drawable.a.k(mutate, null);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }
}
