package p025d3;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f12405b = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12406a;

    public /* synthetic */ c(int i7) {
        this.f12406a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12406a) {
            case 0:
                break;
        }
        return ((Scope) obj).f11076b.compareTo(((Scope) obj2).f11076b);
    }
}
