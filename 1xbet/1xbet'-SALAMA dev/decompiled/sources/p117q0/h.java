package p117q0;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.appcompat.widget.b1;
import java.util.HashMap;
import p028d6.k;
import p043f5.b;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class h implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f15748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f15749e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f15750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f15751g;

    public h(s sVar, String str, int i7, int i8, e eVar) {
        this.f15751g = sVar;
        this.f15745a = str;
        this.f15746b = i7;
        this.f15747c = i8;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            b.o(i7, i8, str);
        }
        this.f15748d = eVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f15751g.f15788f.post(new b1(this, 13));
    }
}
