package d3;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: d3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0962c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0962c f12399b = new C0962c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12400a;

    public /* synthetic */ C0962c(int i7) {
        this.f12400a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12400a) {
        }
        return ((Scope) obj).f11076b.compareTo(((Scope) obj2).f11076b);
    }
}
