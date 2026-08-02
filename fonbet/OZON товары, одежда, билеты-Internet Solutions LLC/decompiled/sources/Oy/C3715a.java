package Oy;

import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1iSDK;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import kotlin.jvm.functions.Function1;
import qc.g;

/* renamed from: Oy.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3715a implements g, AFd1iSDK.AFa1ySDK, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20548a;

    public /* synthetic */ C3715a(Object obj) {
        this.f20548a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f20548a).invoke(obj);
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        u11.z((String) this.f20548a);
    }

    @Override // com.appsflyer.internal.AFd1iSDK.AFa1ySDK
    public void onConfigurationChanged(boolean z11) {
        ((AFb1tSDK) this.f20548a).values(z11);
    }
}
