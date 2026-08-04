package p109p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f15634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f15636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f15637e;

    public d(f fVar, int i7, Uri uri, boolean z4, Bundle bundle) {
        this.f15637e = fVar;
        this.f15633a = i7;
        this.f15634b = uri;
        this.f15635c = z4;
        this.f15636d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15637e.f15646b.onRelationshipValidationResult(this.f15633a, this.f15634b, this.f15635c, this.f15636d);
    }
}
