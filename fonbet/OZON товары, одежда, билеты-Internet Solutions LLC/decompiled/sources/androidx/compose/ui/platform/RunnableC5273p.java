package androidx.compose.ui.platform;

import com.appsflyer.internal.AFi1bSDK;

/* renamed from: androidx.compose.ui.platform.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5273p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40969b;

    public /* synthetic */ RunnableC5273p(Object obj, int i11) {
        this.f40968a = i11;
        this.f40969b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40968a) {
            case 0:
                AndroidComposeView.c((AndroidComposeView) this.f40969b);
                break;
            default:
                ((AFi1bSDK) this.f40969b).AFLogger();
                break;
        }
    }
}
