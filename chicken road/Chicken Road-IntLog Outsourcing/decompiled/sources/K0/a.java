package K0;

import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class a extends j implements InterfaceC1441l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1371f = new a(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final a f1372g = new a(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i3) {
        super(i2);
        this.f1373e = i3;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        switch (this.f1373e) {
            case 0:
                ResolveInfo it = (ResolveInfo) obj;
                i.e(it, "it");
                return it.activityInfo.packageName;
            default:
                return Boolean.valueOf(!b.f1374a.contains((String) obj));
        }
    }
}
