package p0;

import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import o2.l;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163a extends k implements l {
    public static final C1163a f = new C1163a(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1163a f10229g = new C1163a(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1163a(int i3, int i4) {
        super(i3);
        this.f10230e = i4;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        switch (this.f10230e) {
            case 0:
                ResolveInfo it = (ResolveInfo) obj;
                j.e(it, "it");
                return it.activityInfo.packageName;
            default:
                return Boolean.valueOf(!AbstractC1164b.f10231a.contains((String) obj));
        }
    }
}
