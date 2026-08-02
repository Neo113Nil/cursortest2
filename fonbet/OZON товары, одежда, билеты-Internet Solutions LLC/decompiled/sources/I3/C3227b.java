package I3;

import j3.C7272n;
import java.util.Comparator;

/* renamed from: I3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3227b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11844a;

    public /* synthetic */ C3227b(int i11) {
        this.f11844a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11844a) {
            case 0:
                return ((C7272n) obj2).f69122j - ((C7272n) obj).f69122j;
            default:
                q3.h hVar = (q3.h) obj;
                q3.h hVar2 = (q3.h) obj2;
                long j11 = hVar.f81439f;
                long j12 = hVar2.f81439f;
                return j11 - j12 == 0 ? hVar.compareTo(hVar2) : j11 < j12 ? -1 : 1;
        }
    }
}
