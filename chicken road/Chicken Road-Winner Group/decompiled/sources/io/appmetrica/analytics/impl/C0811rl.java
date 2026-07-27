package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811rl implements InterfaceC0865tn {

    /* renamed from: d, reason: collision with root package name */
    public static final long f8244d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8245a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f8246b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f8247c;

    public C0811rl(Context context) {
        long j3 = f8244d;
        this.f8247c = new CachedDataProvider.CachedData(j3, j3, "sim-info");
        this.f8245a = context;
        this.f8246b = C0878ua.k().j();
    }

    public final C0682ml b() {
        return new C0682ml((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8245a, "phone", "getting SimMcc", "TelephonyManager", new C0708nl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8245a, "phone", "getting SimMnc", "TelephonyManager", new C0734ol()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f8245a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0786ql(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8245a, "phone", "getting SimOperatorName", "TelephonyManager", new C0760pl()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0865tn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C0682ml> a() {
        List<C0682ml> list;
        try {
            List<C0682ml> list2 = (List) this.f8247c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f8247c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (C0878ua.f8414H.f8441u.b().f7654n.f8285d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f8246b.hasPermission(this.f8245a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C0837sl.a(this.f8245a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f8247c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
