package ac;

import Hf.u;
import If.c;
import Ub.j;
import Ub.l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* renamed from: ac.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4994c extends Ub.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4992a f36547a;

    /* renamed from: ac.c$a */
    final class a implements l.b<C4993b> {
        @Override // Ub.l.b
        public final void a(@NonNull u uVar, @NonNull l lVar) {
            C4993b c4993b = (C4993b) uVar;
            int length = lVar.length();
            lVar.b(c4993b);
            e.f36549a.e(lVar.i(), Boolean.valueOf(c4993b.n()));
            lVar.g(c4993b, length);
            if (lVar.A(c4993b)) {
                lVar.w();
            }
        }
    }

    private C4994c(@NonNull C4992a c4992a) {
        this.f36547a = c4992a;
    }

    @NonNull
    public static C4994c a(@NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{R.attr.textColorLink});
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            TypedValue typedValue2 = new TypedValue();
            obtainStyledAttributes = context.obtainStyledAttributes(typedValue2.data, new int[]{R.attr.colorBackground});
            try {
                int color2 = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                return new C4994c(new C4992a(color, color, color2));
            } finally {
            }
        } finally {
        }
    }

    @Override // Ub.a, Ub.h
    public final void configureParser(@NonNull c.a aVar) {
        aVar.i(new C4995d());
    }

    @Override // Ub.a, Ub.h
    public final void configureSpansFactory(@NonNull j.a aVar) {
        aVar.b(C4993b.class, new g(this.f36547a));
    }

    @Override // Ub.a, Ub.h
    public final void configureVisitor(@NonNull l.a aVar) {
        aVar.a(C4993b.class, new a());
    }
}
