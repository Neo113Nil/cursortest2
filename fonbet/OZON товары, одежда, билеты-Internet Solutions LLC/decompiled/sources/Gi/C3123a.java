package Gi;

import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Gi.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3123a implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f10274a;

    /* renamed from: Gi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0210a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10275a;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10275a = iArr;
        }
    }

    public C3123a(@NotNull r context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10274a = context;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = C0210a.f10275a[event.ordinal()];
        r rVar = this.f10274a;
        if (i11 == 1) {
            Intrinsics.checkNotNullExpressionValue(c.a(rVar).k(h.HIGH), "setMemoryCategory(...)");
        } else if (i11 != 2) {
            Unit unit = Unit.f71690a;
        } else {
            Intrinsics.checkNotNullExpressionValue(c.a(rVar).k(h.NORMAL), "setMemoryCategory(...)");
        }
    }
}
