package p028d6;

import U5.AbstractC0438e;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0438e f12459c;

    public n(o oVar, AbstractC0438e abstractC0438e, int i7) {
        this.f12457a = i7;
        switch (i7) {
            case 1:
                f.d("success rate ejection config is null", oVar.f12464e != null);
                this.f12458b = oVar;
                this.f12459c = abstractC0438e;
                break;
            default:
                this.f12458b = oVar;
                this.f12459c = abstractC0438e;
                break;
        }
    }
}
