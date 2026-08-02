package p;

import android.os.Bundle;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1516c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f15625c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC1519f f15626d;

    public /* synthetic */ RunnableC1516c(BinderC1519f binderC1519f, String str, Bundle bundle, int i7) {
        this.f15623a = i7;
        this.f15626d = binderC1519f;
        this.f15624b = str;
        this.f15625c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15623a) {
            case 0:
                this.f15626d.f15640b.extraCallback(this.f15624b, this.f15625c);
                break;
            default:
                this.f15626d.f15640b.onPostMessage(this.f15624b, this.f15625c);
                break;
        }
    }
}
