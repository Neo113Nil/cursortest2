package p109p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f15631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f15632d;

    public /* synthetic */ c(f fVar, String str, Bundle bundle, int i7) {
        this.f15629a = i7;
        this.f15632d = fVar;
        this.f15630b = str;
        this.f15631c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15629a) {
            case 0:
                this.f15632d.f15646b.extraCallback(this.f15630b, this.f15631c);
                break;
            default:
                this.f15632d.f15646b.onPostMessage(this.f15630b, this.f15631c);
                break;
        }
    }
}
