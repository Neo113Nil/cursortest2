package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i40 implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3426j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f3427k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Context f3428l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f3429m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f3430n;

    public /* synthetic */ i40(String str, Context context, Object obj, int i, int i2) {
        this.f3426j = i2;
        this.f3427k = str;
        this.f3428l = context;
        this.f3430n = obj;
        this.f3429m = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f3426j;
        int i2 = this.f3429m;
        Object obj = this.f3430n;
        Context context = this.f3428l;
        String str = this.f3427k;
        switch (i) {
            case 0:
                Object[] objArr = {(f40) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return l40.m3168b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return l40.m3168b(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new k40(-3);
                }
        }
    }
}
