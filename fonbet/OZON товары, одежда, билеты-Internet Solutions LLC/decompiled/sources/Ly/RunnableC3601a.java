package Ly;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1hSDK;
import com.google.firebase.installations.c;
import ru.ozon.app.android.geoprovider.GeoProviderRepositoryImpl;

/* renamed from: Ly.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC3601a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17184b;

    public /* synthetic */ RunnableC3601a(Object obj, int i11) {
        this.f17183a = i11;
        this.f17184b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17183a) {
            case 0:
                GeoProviderRepositoryImpl.timerRunnable$lambda$1((GeoProviderRepositoryImpl) this.f17184b);
                break;
            case 1:
                AFLogger.valueOf((AFg1hSDK[]) this.f17184b);
                break;
            default:
                ((c) this.f17184b).e();
                break;
        }
    }
}
