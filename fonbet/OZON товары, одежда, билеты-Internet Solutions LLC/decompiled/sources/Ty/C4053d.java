package Ty;

import android.app.Activity;
import androidx.activity.ActivityC5043j;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;
import ru.ozon.app.android.permission.PermissionRequest;

/* renamed from: Ty.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C4053d implements o, PermissionRequest.ActivityProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f27227a;

    public /* synthetic */ C4053d(Object obj) {
        this.f27227a = obj;
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ClearCacheReason couponState$lambda$9;
        couponState$lambda$9 = ComposerCacheInvalidatorInitializer.getCouponState$lambda$9((Function1) this.f27227a, obj);
        return couponState$lambda$9;
    }

    @Override // ru.ozon.app.android.permission.PermissionRequest.ActivityProvider
    public Activity provide() {
        Activity _init_$lambda$0;
        _init_$lambda$0 = PermissionRequest.Builder._init_$lambda$0((ActivityC5043j) this.f27227a);
        return _init_$lambda$0;
    }
}
