package a3;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C1743wd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0463g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6543e;

    public /* synthetic */ CallableC0463g(BinderC0468l binderC0468l, C1743wd c1743wd, int i, Bundle bundle) {
        this.f6539a = 0;
        this.f6541c = binderC0468l;
        this.f6542d = c1743wd;
        this.f6540b = i;
        this.f6543e = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f6540b;
        Object obj = this.f6543e;
        Object obj2 = this.f6542d;
        Object obj3 = this.f6541c;
        switch (this.f6539a) {
            case 0:
                BinderC0468l binderC0468l = (BinderC0468l) obj3;
                C1743wd c1743wd = (C1743wd) obj2;
                return binderC0468l.u3(binderC0468l.f6569m, c1743wd.f16117k, c1743wd.f16118l, c1743wd.f16119m, c1743wd.f16120n, this.f6540b, c1743wd.f16122p, (Bundle) obj, c1743wd);
            case 1:
                Object[] objArr = {(k1.e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                arrayList.add(obj4);
                return k1.h.b((String) obj3, (Context) obj2, Collections.unmodifiableList(arrayList), i);
            default:
                try {
                    return k1.h.b((String) obj3, (Context) obj2, (ArrayList) obj, i);
                } catch (Throwable unused) {
                    return new k1.g(-3);
                }
        }
    }

    public /* synthetic */ CallableC0463g(String str, Context context, Object obj, int i, int i5) {
        this.f6539a = i5;
        this.f6541c = str;
        this.f6542d = context;
        this.f6543e = obj;
        this.f6540b = i;
    }
}
