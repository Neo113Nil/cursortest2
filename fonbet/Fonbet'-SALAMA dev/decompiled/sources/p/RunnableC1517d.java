package p;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1517d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f15628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f15630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC1519f f15631e;

    public RunnableC1517d(BinderC1519f binderC1519f, int i7, Uri uri, boolean z4, Bundle bundle) {
        this.f15631e = binderC1519f;
        this.f15627a = i7;
        this.f15628b = uri;
        this.f15629c = z4;
        this.f15630d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15631e.f15640b.onRelationshipValidationResult(this.f15627a, this.f15628b, this.f15629c, this.f15630d);
    }
}
