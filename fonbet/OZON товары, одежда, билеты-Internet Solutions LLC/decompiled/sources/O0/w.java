package O0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class w extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19813a;

    /* renamed from: b, reason: collision with root package name */
    private C7807Z f19814b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f19815c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19816d;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f19817a = new a();

        public final void a(@NotNull RippleDrawable rippleDrawable, int i11) {
            rippleDrawable.setRadius(i11);
        }
    }

    public w(boolean z11) {
        super(ColorStateList.valueOf(-16777216), null, z11 ? new ColorDrawable(-1) : null);
        this.f19813a = z11;
    }

    public final void a(float f7, long j11) {
        if (Build.VERSION.SDK_INT < 28) {
            f7 *= 2;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        long o11 = C7807Z.o(f7, j11);
        C7807Z c7807z = this.f19814b;
        if (c7807z == null ? false : C7807Z.p(c7807z.w(), o11)) {
            return;
        }
        this.f19814b = C7807Z.m(o11);
        setColor(ColorStateList.valueOf(C7811b0.i(o11)));
    }

    public final void b(int i11) {
        Integer num = this.f19815c;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.f19815c = Integer.valueOf(i11);
        a.f19817a.a(this, i11);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @NotNull
    public final Rect getDirtyBounds() {
        if (!this.f19813a) {
            this.f19816d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f19816d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f19816d;
    }
}
