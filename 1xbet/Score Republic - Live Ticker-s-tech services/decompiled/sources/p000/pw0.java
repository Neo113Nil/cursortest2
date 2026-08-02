package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pw0 extends bh0 implements f60 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f6276k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Context f6277l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f6278m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw0(Context context, Object obj, int i) {
        super(0);
        this.f6276k = i;
        this.f6277l = context;
        this.f6278m = obj;
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: a */
    public final Object mo1083a() {
        int i = this.f6276k;
        Object obj = this.f6278m;
        Context context = this.f6277l;
        switch (i) {
            case 0:
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(((qw0) obj).f6625a.concat(".preferences_pb")));
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
