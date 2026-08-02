package q0;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.appcompat.widget.b1;
import d6.C0977k;
import f5.AbstractC1102b;
import java.util.HashMap;
import n1.C1450e;

/* loaded from: classes.dex */
public final class h implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final String f15739a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15741c;

    /* renamed from: d, reason: collision with root package name */
    public final C1450e f15742d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f15743e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public C0977k f15744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f15745g;

    public h(s sVar, String str, int i7, int i8, C1450e c1450e) {
        this.f15745g = sVar;
        this.f15739a = str;
        this.f15740b = i7;
        this.f15741c = i8;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC1102b.o(i7, i8, str);
        }
        this.f15742d = c1450e;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f15745g.f15782f.post(new b1(this, 13));
    }
}
