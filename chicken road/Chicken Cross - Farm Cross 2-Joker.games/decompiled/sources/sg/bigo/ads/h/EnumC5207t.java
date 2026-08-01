package sg.bigo.ads.h;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.K0.AbstractC4963u;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: sg.bigo.ads.h.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5207t {
    public static final EnumC5207t f;
    public static final EnumC5207t g;
    public static final EnumC5207t h;
    public static final EnumC5207t i;
    public static final EnumC5207t j;
    public static final /* synthetic */ EnumC5207t[] k;

    /* renamed from: a, reason: collision with root package name */
    public final int f12926a;
    public final sg.bigo.ads.J0.b b;
    public final int c;
    public final int d;
    public final int e;

    static {
        EnumC5207t enumC5207t = new EnumC5207t("WHITE", 0, null, -14671580, -10525849, 2, 1);
        f = enumC5207t;
        int i2 = (int) 76.5f;
        EnumC5207t enumC5207t2 = new EnumC5207t("DKGRAY_TRANSLUCENT", 1, new sg.bigo.ads.J0.b(1, 1, sg.bigo.ads.E0.p.a(ViewCompat.MEASURED_STATE_MASK, i2)), -1, -1, 0, 2);
        g = enumC5207t2;
        EnumC5207t enumC5207t3 = new EnumC5207t("MAIN_COLOR_TRANSLUCENT", 2, new sg.bigo.ads.J0.b(1, 1, sg.bigo.ads.E0.p.a(ViewCompat.MEASURED_STATE_MASK, i2)), -1, -1, 0, 2);
        h = enumC5207t3;
        EnumC5207t enumC5207t4 = new EnumC5207t("LTGRAY_BLUR", 3, new sg.bigo.ads.J0.b(4, 2, sg.bigo.ads.E0.p.a(ViewCompat.MEASURED_STATE_MASK, i2)), -1, -1, 0, 2);
        i = enumC5207t4;
        EnumC5207t enumC5207t5 = new EnumC5207t("MAIN_COLOR_BLUR", 4, new sg.bigo.ads.J0.b(4, 2, sg.bigo.ads.E0.p.a(ViewCompat.MEASURED_STATE_MASK, i2)), -1, -1, 0, 2);
        j = enumC5207t5;
        k = new EnumC5207t[]{enumC5207t, enumC5207t2, enumC5207t3, enumC5207t4, enumC5207t5};
    }

    public EnumC5207t(String str, int i2, sg.bigo.ads.J0.b bVar, int i3, int i4, int i5, int i6) {
        this.b = bVar;
        this.c = i3;
        this.d = i4;
        this.f12926a = i5;
        this.e = i6;
    }

    public static EnumC5207t valueOf(String str) {
        return (EnumC5207t) Enum.valueOf(EnumC5207t.class, str);
    }

    public static EnumC5207t[] values() {
        return (EnumC5207t[]) k.clone();
    }

    public final void a(View view) {
        if (view != null) {
            sg.bigo.ads.Z.c.a(view, AbstractC4963u.a(view.getContext(), this.f12926a));
        }
    }

    public final void a(Button button) {
        if (button != null) {
            sg.bigo.ads.Z.c.a((View) button, AbstractC4963u.a(button.getContext(), this.e));
        }
    }

    public final void a(TextView textView, TextView textView2) {
        Context context;
        if (textView == null && textView2 == null) {
            return;
        }
        if (textView != null) {
            context = textView.getContext();
            textView.setTextColor(this.c);
        } else {
            context = null;
        }
        if (textView2 != null) {
            if (context == null) {
                context = textView2.getContext();
            }
            textView2.setTextColor(this.d);
        }
        sg.bigo.ads.J0.b bVar = this.b;
        if (bVar == null) {
            if (textView != null) {
                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            return;
        }
        int a2 = AbstractC4963u.a(context, bVar.f12339a);
        int a3 = AbstractC4963u.a(context, bVar.b);
        int a4 = AbstractC4963u.a(context, bVar.c);
        if (textView != null) {
            textView.setShadowLayer(a2, a3, a4, bVar.d);
        }
        if (textView2 != null) {
            textView2.setShadowLayer(a2, a3, a4, bVar.d);
        }
    }
}
