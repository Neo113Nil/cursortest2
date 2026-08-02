package n4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18489a;

    /* renamed from: b, reason: collision with root package name */
    public final g f18490b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.internal.m f18491c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(g gVar, i4.c cVar, int i) {
        this.f18489a = i;
        switch (i) {
            case 1:
                this.f18490b = gVar;
                this.f18491c = (kotlin.jvm.internal.m) cVar;
                break;
            default:
                this.f18490b = gVar;
                this.f18491c = (kotlin.jvm.internal.m) cVar;
                break;
        }
    }

    @Override // n4.g
    public final Iterator iterator() {
        switch (this.f18489a) {
            case 0:
                return new e(this);
            default:
                return new m(this);
        }
    }
}
